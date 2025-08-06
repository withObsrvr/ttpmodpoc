package net.obsrvr.ttpmodpoc;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.api.ModInitializer;
import static net.minecraft.server.command.CommandManager.*;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer; // Import MinecraftServer
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;
import net.obsrvr.ttpmodpoc.grpc.SimpleGrpcClient;
import net.obsrvr.ttpmodpoc.grpc.TtpmodGrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.Random; // Import Random

public class Ttpmodpoc implements ModInitializer {
	public static final String MOD_ID = "ttpmodpoc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Random RANDOM = new Random(); // Add this line

	private SimpleGrpcClient grpcClient; // Instance of our simple client
	private TtpmodGrpcClient ttpGrpcClient;

	// Event listeners for token transfer events - static and thread-safe
	private static final List<Consumer<TokenTransferEvent>> eventListeners = new CopyOnWriteArrayList<>();
	private static MinecraftServer serverInstance = null; // To execute tasks on the main thread

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Stellar TTP Mod");

		// Register server lifecycle events to manage clients and server instance
		ServerLifecycleEvents.SERVER_STARTING.register(server -> {
			serverInstance = server; // Store server instance
			LOGGER.info("Server starting - Initializing gRPC Clients...");
			try {
				grpcClient = new SimpleGrpcClient("localhost:50051");
				LOGGER.info("Simple gRPC Client initialized successfully.");
			} catch (Exception e) {
				LOGGER.error("Failed to initialize Simple gRPC client", e);
				grpcClient = null;
			}
			try {
				ttpGrpcClient = new TtpmodGrpcClient("localhost:50054"); // Assuming different port for TTP
				// Handle token transfer events - Moved setup here to ensure ttpGrpcClient is initialized
				ttpGrpcClient.setEventHandler(this::onTokenTransferEvent);
				LOGGER.info("TTP gRPC Client initialized successfully.");
			} catch (Exception e) {
				LOGGER.error("Failed to initialize TTP gRPC client", e);
				ttpGrpcClient = null;
			}
		});

		ServerLifecycleEvents.SERVER_STOPPING.register(server -> {
			LOGGER.info("Server stopping - Shutting down gRPC Clients...");
			if (grpcClient != null) {
				try {
					grpcClient.shutdown();
				} catch (InterruptedException e) {
					LOGGER.error("Interrupted while shutting down Simple gRPC client", e);
					Thread.currentThread().interrupt();
				}
			}
			if (ttpGrpcClient != null) {
				try {
					ttpGrpcClient.shutdown();
				} catch (InterruptedException e) {
					LOGGER.error("Interrupted while shutting down TTP gRPC client", e);
					Thread.currentThread().interrupt();
				}
			}
			LOGGER.info("gRPC Clients shut down.");
			serverInstance = null; // Clear server instance
		});

		// Register commands
		registerCommands();

		LOGGER.info("Stellar TTP Mod Initialized");
	}

	// Method to handle incoming TTP events from the gRPC client
	private void onTokenTransferEvent(TokenTransferEvent event) {
		LOGGER.info("Received TTP event from gRPC stream: {}", event);
		// Dispatch the event to all registered listeners on the server thread
		if (serverInstance != null) {
			serverInstance.execute(() -> {
				for (Consumer<TokenTransferEvent> listener : eventListeners) {
					try {
						listener.accept(event);
					} catch (Exception e) {
						LOGGER.error("Error in TTP event listener", e);
					}
				}
			});
		} else {
			LOGGER.warn("Received TTP event but server instance is null, cannot dispatch.");
		}
	}

	// Static method for clients (or other parts) to register listeners
	public static void registerEventListener(Consumer<TokenTransferEvent> listener) {
		eventListeners.add(listener);
		LOGGER.info("Registered new TTP event listener.");
	}

	private void registerCommands() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			// Simple Greeter Test Command
			dispatcher.register(literal("grpc_test")
					.then(argument("name", StringArgumentType.greedyString())
							.executes(context -> {
								if (grpcClient == null) {
									context.getSource().sendError(Text.literal("Simple gRPC client not initialized."));
									return 0;
								}
								String name = StringArgumentType.getString(context, "name");
								ServerCommandSource source = context.getSource();
								source.sendFeedback(() -> Text.literal("Sending greeting request for: " + name), false);

								CompletableFuture.supplyAsync(() -> grpcClient.greet(name))
										.thenAcceptAsync(response -> {
											source.sendFeedback(() -> Text.literal("gRPC Server Response: " + response), false);
										}, source.getServer());

								return 1;
							}))
					.executes(context -> {
						context.getSource().sendError(Text.literal("Usage: /grpc_test <name>"));
						return 0;
					})
			);

			// TTP Streaming Command
			dispatcher.register(literal("ttp")
					.then(literal("start")
							.then(argument("startLedger", IntegerArgumentType.integer(1))
									.then(argument("endLedger", IntegerArgumentType.integer(0)) // 0 for live
											.executes(context -> {
												if (ttpGrpcClient == null) {
													context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
													return 0;
												}
												if (ttpGrpcClient.isStreaming()) {
													context.getSource().sendError(Text.literal("Already streaming TTP events. Use /ttp stop first."));
													return 0;
												}
												int startLedger = IntegerArgumentType.getInteger(context, "startLedger");
												int endLedger = IntegerArgumentType.getInteger(context, "endLedger");
												try {
													ttpGrpcClient.startStreaming(startLedger, endLedger);
													context.getSource().sendFeedback(() ->
															Text.literal("Starting TTP Event Stream from ledger " +
																	startLedger + " to " + (endLedger <= 0 ? "live" : endLedger)), false);
													return 1;
												} catch (Exception e) {
													LOGGER.error("Failed to start TTP stream", e);
													context.getSource().sendError(Text.literal("Failed to start TTP stream: " + e.getMessage()));
													return 0;
												}
											})
									)
									// Simplified version: /ttp start <startLedger> (implies live streaming)
									.executes(context -> {
										if (ttpGrpcClient == null) {
											context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
											return 0;
										}
										if (ttpGrpcClient.isStreaming()) {
											context.getSource().sendError(Text.literal("Already streaming TTP events. Use /ttp stop first."));
											return 0;
										}
										int startLedger = IntegerArgumentType.getInteger(context, "startLedger");
										try {
											ttpGrpcClient.startStreaming(startLedger, 0); // 0 for live
											context.getSource().sendFeedback(() ->
													Text.literal("Starting live TTP Event Stream from ledger " + startLedger), false);
											return 1;
										} catch (Exception e) {
											LOGGER.error("Failed to start TTP stream", e);
											context.getSource().sendError(Text.literal("Failed to start TTP stream: " + e.getMessage()));
											return 0;
										}
									})
							)
							// Even simpler: /ttp start (starts live from ledger 1, maybe not ideal)
							.executes(context -> {
								if (ttpGrpcClient == null) {
									context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
									return 0;
								}
								if (ttpGrpcClient.isStreaming()) {
									context.getSource().sendError(Text.literal("Already streaming TTP events. Use /ttp stop first."));
									return 0;
								}
								try {
									ttpGrpcClient.startStreaming(1, 0); // Start live from ledger 1
									context.getSource().sendFeedback(() ->
											Text.literal("Starting live TTP Event Stream from ledger 1"), false);
									return 1;
								} catch (Exception e) {
									LOGGER.error("Failed to start TTP stream", e);
									context.getSource().sendError(Text.literal("Failed to start TTP stream: " + e.getMessage()));
									return 0;
								}
							})
					)
					.then(literal("stop")
							.executes(context -> {
								if (ttpGrpcClient == null) {
									context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
									return 0;
								}
								if (!ttpGrpcClient.isStreaming()) {
									context.getSource().sendFeedback(() -> Text.literal("TTP Event Stream is not running."), false);
									return 1;
								}
								try {
									ttpGrpcClient.stopStreaming();
									context.getSource().sendFeedback(() -> Text.literal("Stopped TTP Event Stream."), false);
									return 1;
								} catch (Exception e) {
									LOGGER.error("Failed to stop TTP stream", e);
									context.getSource().sendError(Text.literal("Failed to stop TTP stream: " + e.getMessage()));
									return 0;
								}
							})
					)
					.then(literal("status")
							.executes(context -> {
								if (ttpGrpcClient == null) {
									context.getSource().sendFeedback(() -> Text.literal("TTP gRPC client not initialized."), false);
									return 1;
								}
								boolean streaming = ttpGrpcClient.isStreaming();
								String status = streaming ? "Running" : "Stopped";
								String range = streaming ? " (from " + ttpGrpcClient.getStartLedger() + " to " +
										(ttpGrpcClient.getEndLedger() <= 0 ? "live" : ttpGrpcClient.getEndLedger()) + ")" : "";
								context.getSource().sendFeedback(() -> Text.literal("TTP Event Stream Status: " + status + range), false);
								return 1;
							})
					)
			);
		});
	}
}