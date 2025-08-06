package net.obsrvr.ttpmodpoc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext; // Correct import
import net.minecraft.client.MinecraftClient;
import net.obsrvr.ttpmodpoc.render.EventRenderer;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;

public class TtpmodpocClient implements ClientModInitializer {

    private EventRenderer eventRenderer;
    private final MinecraftClient client = MinecraftClient.getInstance(); // Cache client instance

    @Override
    public void onInitializeClient() {
        Ttpmodpoc.LOGGER.info("Initializing Stellar TTP Mod Client");
        eventRenderer = new EventRenderer(client); // Pass client to renderer
        registerRenderHooks();
        registerTickEvents();
        // Register to receive events from the main mod logic
        Ttpmodpoc.registerEventListener(this::onTokenTransferEvent);
        Ttpmodpoc.LOGGER.info("Registered client to receive TTP events");
    }

    private void registerRenderHooks() {
        // Correctly register the AFTER_TRANSLUCENT event
        WorldRenderEvents.AFTER_TRANSLUCENT.register((WorldRenderContext context) -> {
            if (client.world != null && eventRenderer != null) {
                // Call the renderer's dedicated world rendering method
                eventRenderer.renderWorld(
                        context.matrixStack(),
                        context.camera(),
                        context.tickCounter().getDynamicDeltaTicks(), // Use getTickDelta() for smoother interpolation
                        context.consumers() // Pass the VertexConsumerProvider
                );
            }
        });
    }

    private void registerTickEvents() {
        ClientTickEvents.END_CLIENT_TICK.register(clientInstance -> { // Use the provided client instance
            if (clientInstance.world != null && clientInstance.player != null && eventRenderer != null) {
                eventRenderer.tick();
            }
        });
    }

    // This method is called when an event is received via the listener registered in Ttpmodpoc
    public void onTokenTransferEvent(TokenTransferEvent event) {
        Ttpmodpoc.LOGGER.info("Client received TTP event: {}", event);
        if (eventRenderer != null) {
            // The renderer now handles adding the event safely to its internal list
            eventRenderer.addEvent(event);
            Ttpmodpoc.LOGGER.info("Passed event to renderer");
        } else {
            Ttpmodpoc.LOGGER.error("Event renderer is null when receiving event!");
        }
    }
}