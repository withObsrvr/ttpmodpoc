package net.obsrvr.ttpmodpoc.grpc;

import  io.grpc.ManagedChannel;
import  io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.obsrvr.ttpmodpoc.Ttpmodpoc;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;
import net.obsrvr.ttpmodpoc.grpc.proto.GetEventsRequest;
import net.obsrvr.ttpmodpoc.grpc.proto.EventServiceGrpc;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;


public class TtpmodGrpcClient {

    private final ManagedChannel channel;
    private final EventServiceGrpc.EventServiceBlockingStub blockingStub;
    private final EventServiceGrpc.EventServiceStub asyncStub;

    // Streaming state
    private final AtomicBoolean isStreaming = new AtomicBoolean(false);
    private ExecutorService streamExecutor;
    private int startLedger;
    private int endLedger;

    // Default endpoint for the simple Go Server
    private static final String DEFAULT_ENDPOINT = "localhost:50051";

    // Event handler for token transfer events
    private Consumer<TokenTransferEvent> eventHandler;

    public TtpmodGrpcClient() {
        this(DEFAULT_ENDPOINT);
    }

    public TtpmodGrpcClient(String endpoint) {
        channel = ManagedChannelBuilder.forTarget(endpoint)
                .usePlaintext()
                .build();
        blockingStub = EventServiceGrpc.newBlockingStub(channel);
        asyncStub = EventServiceGrpc.newStub(channel);
        Ttpmodpoc.LOGGER.info("TTP GRPC Client initialized for target: {}", endpoint);
    }

    /**
     * Sets the event handler for token transfer events.
     *
     * @param eventHandler the event handler to call when events are received
     */
    public void setEventHandler(Consumer<TokenTransferEvent> eventHandler) {
        // Event handler for token transfer events
        this.eventHandler = eventHandler;
    }

    /**
     * Gets the starting ledger sequence number.
     *
     * @return the starting ledger sequence number
     */
    public int getStartLedger() {
        return startLedger;
    }

    /**
     * Gets the ending ledger sequence number.
     *
     * @return the ending ledger sequence number
     */
    public int getEndLedger() {
        return endLedger;
    }

    public void shutdown() throws InterruptedException {
        Ttpmodpoc.LOGGER.info("Shutting down TTP gRPC client channel...");
        stopStreaming();
        if (channel != null) {
            try {
                channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Ttpmodpoc.LOGGER.error("Interrupted while closing gRPC channel", e);
            }
        }
        Ttpmodpoc.LOGGER.info("TTP gRPC client channel shut down.");
    }

    /**
     * Checks if currently streaming TTP events.
     *
     * @return true if streaming, false otherwise
     */
    public boolean isStreaming() {
        return isStreaming.get();
    }

    /**
     * Starts streaming TTP events from the specified ledger range.
     *
     * @param startLedger the starting ledger sequence number
     * @param endLedger the ending ledger sequence number (0 for unbounded streaming)
     * @throws IllegalStateException if already streaming
     */
    public void startStreaming(int startLedger, int endLedger) {
        if (isStreaming.get()) {
            throw new IllegalStateException("Already streaming TTP events");
        }
        this.startLedger = startLedger;
        this.endLedger = endLedger;

        streamExecutor = Executors.newSingleThreadExecutor();
        isStreaming.set(true);

        streamExecutor.submit(() -> {
            try {
                Ttpmodpoc.LOGGER.info("Starting streaming TTP events");
                // Create the request
                GetEventsRequest request = GetEventsRequest.newBuilder()
                        .setStartLedger(startLedger)
                        .setEndLedger(endLedger)
                        .build();

                Ttpmodpoc.LOGGER.info("Starting to stream TTP events from ledger {} to {}",
                        startLedger, endLedger > 0 ? endLedger : "unbounded");

                // Use async API to stream events
                Ttpmodpoc.LOGGER.info("Starting async streaming for TTP events");

                // Create a response observer
                StreamObserver<net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent> responseObserver =
                        new StreamObserver<net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent>() {
                            @Override
                            public void onNext(net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent event) {
                                Ttpmodpoc.LOGGER.info("Received TTP event from gRPC: {}", event);

                                try {
                                    // Convert the event to our internal format
                                    TokenTransferEvent ttpEvent = convertEvent(event);

                                    if (ttpEvent != null) {
                                        Ttpmodpoc.LOGGER.info("Converted to internal event: {}", ttpEvent);

                                        // Notify the event handler if it exists
                                        if (eventHandler != null) {
                                            Ttpmodpoc.LOGGER.info("Notifying event handler");
                                            eventHandler.accept(ttpEvent);
                                        } else {
                                            Ttpmodpoc.LOGGER.error("Event handler is null!");
                                        }
                                    } else {
                                        Ttpmodpoc.LOGGER.error("Failed to convert event!");
                                    }
                                } catch (Exception e) {
                                    Ttpmodpoc.LOGGER.error("Error processing TTP event", e);
                                }
                            }

                            @Override
                            public void onError(Throwable t) {
                                Ttpmodpoc.LOGGER.error("Error in TTP event stream", t);
                                isStreaming.set(false);
                            }

                            @Override
                            public void onCompleted() {
                                Ttpmodpoc.LOGGER.info("TTP event stream completed");
                                isStreaming.set(false);
                            }
                        };

                // Start streaming using async API
                asyncStub.getTTPEvents(request, responseObserver);

                // Keep this thread alive while streaming
                while (isStreaming.get()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }

                Ttpmodpoc.LOGGER.info("Streaming thread exiting");

            } catch (Exception e) {
                Ttpmodpoc.LOGGER.error("Error while streaming TTP events", e);
            } finally {
                isStreaming.set(false);
            }
        });

    }

    /**
     * Converts a gRPC token transfer event to our internal format.
     *
     * @param event the gRPC token transfer event
     * @return the converted event or null if conversion failed
     */
    private TokenTransferEvent convertEvent(net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent event) {
        try {
            Ttpmodpoc.LOGGER.info("Converting event: {}", event.getEventCase());
            // Determine the event type
            TokenTransferEvent.Type type;
            switch (event.getEventCase()) {
                case TRANSFER:
                    type = TokenTransferEvent.Type.TRANSFER;
                    Ttpmodpoc.LOGGER.info("Detected TRANSFER event");
                    break;
                case MINT:
                    type = TokenTransferEvent.Type.MINT;
                    Ttpmodpoc.LOGGER.info("Detected MINT event");
                    break;
                case BURN:
                    type = TokenTransferEvent.Type.BURN;
                    Ttpmodpoc.LOGGER.info("Detected BURN event");
                    break;
                default:
                    type = TokenTransferEvent.Type.UNKNOWN;
                    Ttpmodpoc.LOGGER.info("Detected UNKNOWN event type: {}", event.getEventCase());
                    break;
            }

            // Extract common properties
            long ledgerSequence = event.getMeta().getLedgerSequence();
            long txIndex = event.getMeta().getTransactionIndex();
            long opIndex = event.getMeta().getOperationIndex();

            String assetCode = "";
            String assetIssuer = "";
            String fromAccount = "";
            String toAccount = "";
            long amount = 0;

            // Extract event-specific properties
            switch (event.getEventCase()) {
                case TRANSFER:
                    net.obsrvr.ttpmodpoc.grpc.proto.Transfer transfer = event.getTransfer();
                    if (transfer.hasAsset()) {
                        net.obsrvr.ttpmodpoc.grpc.proto.Asset asset = transfer.getAsset();
                        if (asset.hasIssuedAsset()) {
                            assetCode = asset.getIssuedAsset().getAssetCode();
                            assetIssuer = asset.getIssuedAsset().getIssuer();
                        }
                    }
                    fromAccount = transfer.getFrom();
                    toAccount = transfer.getTo();
                    try {
                        amount = Long.parseLong(transfer.getAmount());
                    } catch (NumberFormatException e) {
                        Ttpmodpoc.LOGGER.error("Error parsing amount: {}", transfer.getAmount());
                    }
                    break;
                case MINT:
                    net.obsrvr.ttpmodpoc.grpc.proto.Mint mint = event.getMint();
                    if (mint.hasAsset()) {
                        net.obsrvr.ttpmodpoc.grpc.proto.Asset asset = mint.getAsset();
                        if (asset.hasIssuedAsset()) {
                            assetCode = asset.getIssuedAsset().getAssetCode();
                            assetIssuer = asset.getIssuedAsset().getIssuer();
                        }
                    }
                    fromAccount = ""; // Mint doesn't have admin field in the same way
                    toAccount = mint.getTo();
                    try {
                        amount = Long.parseLong(mint.getAmount());
                    } catch (NumberFormatException e) {
                        Ttpmodpoc.LOGGER.error("Error parsing amount: {}", mint.getAmount());
                    }
                    break;
                case BURN:
                    net.obsrvr.ttpmodpoc.grpc.proto.Burn burn = event.getBurn();
                    if (burn.hasAsset()) {
                        net.obsrvr.ttpmodpoc.grpc.proto.Asset asset = burn.getAsset();
                        if (asset.hasIssuedAsset()) {
                            assetCode = asset.getIssuedAsset().getAssetCode();
                            assetIssuer = asset.getIssuedAsset().getIssuer();
                        }
                    }
                    fromAccount = burn.getFrom();
                    toAccount = ""; // Burn doesn't have admin field in the same way
                    try {
                        amount = Long.parseLong(burn.getAmount());
                    } catch (NumberFormatException e) {
                        Ttpmodpoc.LOGGER.error("Error parsing amount: {}", burn.getAmount());
                    }
                    break;
            }

            // Create and return our internal event
            return new TokenTransferEvent(
                    type,
                    assetCode,
                    assetIssuer,
                    fromAccount,
                    toAccount,
                    amount,
                    ledgerSequence,
                    txIndex,
                    opIndex
            );
        } catch (Exception e) {
            Ttpmodpoc.LOGGER.error("Error converting gRPC event to TokenTransferEvent", e);
            return null;
        }
    }

    /**
     * Stops the current streaming operation.
     */
    public void stopStreaming() {
        if (!isStreaming.get()) {
            return;  // Not streaming
        }
        Ttpmodpoc.LOGGER.info("Stopping streaming TTP events");
        isStreaming.set(false);
        if (streamExecutor != null) {
            streamExecutor.shutdownNow();
            try {
                // Wait for the streaming thread to terminate
                if (!streamExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                    Ttpmodpoc.LOGGER.warn("TTP event stream did not terminate in time");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Ttpmodpoc.LOGGER.error("Interrupted while waiting for TTP event stream to stop", e);
            }

            streamExecutor = null;
        }
    }
}
