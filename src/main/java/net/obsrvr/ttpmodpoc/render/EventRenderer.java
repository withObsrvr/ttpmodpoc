package net.obsrvr.ttpmodpoc.render;

// Necessary Imports (ensure these are correct)
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.obsrvr.ttpmodpoc.Ttpmodpoc;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;
import org.joml.Matrix4f;
import org.joml.Vector3f;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class EventRenderer {
    private final MinecraftClient client;
    private final Queue<VisualEffect> effectsToAdd = new ConcurrentLinkedQueue<>();
    private final List<VisualEffect> activeEffects = new ArrayList<>();
    private final Random random = new Random();
    private static final int MAX_EFFECTS = 50;
    private static final int RENDER_RADIUS_SQUARED = 40 * 40;

    public EventRenderer(MinecraftClient client) {
        this.client = client;
    }

    public void addEvent(TokenTransferEvent event) {
        Ttpmodpoc.LOGGER.info("Queueing visual effect for event: {}", event);
        if (client.player == null) {
            Ttpmodpoc.LOGGER.warn("Cannot add event - player is null! Queueing anyway.");
        }

        VisualEffect effect;
        switch (event.getType()) {
            case TRANSFER -> effect = new TransferBeamEffect(event, 0x00AAFF, 60 + (int) (Math.log10(event.getAmount() + 1) * 10));
            case MINT -> effect = new MintParticleEffect(event, 0x00FF00, 50 + (int) (Math.log10(event.getAmount() + 1) * 10));
            case BURN -> effect = new BurnExplosionEffect(event, 0xFF4400, 40 + (int) (Math.log10(event.getAmount() + 1) * 5));
            // Default uses Mint effect for UNKNOWN/FEE etc.
            default -> effect = new MintParticleEffect(event, 0xFFFFFF, 40);
        }
        effectsToAdd.offer(effect);
    }

    public void tick() {
        VisualEffect effectToAdd;
        while ((effectToAdd = effectsToAdd.poll()) != null) {
            if (client.player != null && activeEffects.size() < MAX_EFFECTS) {
                BlockPos playerPos = client.player.getBlockPos();
                int offsetX = random.nextInt(41) - 20;
                int offsetY = random.nextInt(11) + 2;
                int offsetZ = random.nextInt(41) - 20;
                effectToAdd.setPosition(playerPos.add(offsetX, offsetY, offsetZ));
                activeEffects.add(effectToAdd);
                Ttpmodpoc.LOGGER.info("Activated visual effect for event: {}", effectToAdd.event);
            } else if (activeEffects.size() >= MAX_EFFECTS) {
                Ttpmodpoc.LOGGER.info("Effect queue full ({}/{}), discarding new effect for event: {}", activeEffects.size(), MAX_EFFECTS, effectToAdd.event);
            } else {
                Ttpmodpoc.LOGGER.warn("Player not available during tick, discarding queued effect for event: {}", effectToAdd.event);
            }
        }

        activeEffects.removeIf(effect -> {
            effect.tick();
            return effect.isFinished();
        });
    }

    public void renderWorld(MatrixStack matrices, Camera camera, float tickDelta, VertexConsumerProvider vertexConsumers) {
        if (activeEffects.isEmpty()) return;

        Vec3d cameraPos = camera.getPos();

        for (VisualEffect effect : activeEffects) {
            if (effect.position == null || effect.position.squaredDistanceTo(cameraPos) > RENDER_RADIUS_SQUARED) {
                continue;
            }

            matrices.push();
            matrices.translate(effect.position.x - cameraPos.x,
                    effect.position.y - cameraPos.y,
                    effect.position.z - cameraPos.z);

            effect.render(matrices, vertexConsumers, client.textRenderer, camera, tickDelta);

            matrices.pop();
        }
    }

    // --- Visual Effect Base Class ---
    private abstract class VisualEffect {
        protected final TokenTransferEvent event;
        protected Vec3d position;
        protected final int color;
        protected int lifetime;
        protected final int maxLifetime;
        protected float alpha = 1.0f;

        protected VisualEffect(TokenTransferEvent event, int color, int maxLifetime) {
            this.event = event;
            this.position = null;
            this.color = color;
            this.lifetime = 0;
            this.maxLifetime = maxLifetime + EventRenderer.this.random.nextInt(maxLifetime / 4 + 1) - (maxLifetime / 8);
        }

        public void setPosition(BlockPos blockPos) {
            this.position = new Vec3d(blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5);
        }

        public void tick() {
            lifetime++;
            if (lifetime > maxLifetime * 2 / 3) {
                alpha = 1.0f - (float) (lifetime - maxLifetime * 2 / 3) / (maxLifetime / 3f);
            } else {
                alpha = 1.0f;
            }
            spawnParticles();
        }

        protected void spawnParticles() { }

        public boolean isFinished() {
            return lifetime >= maxLifetime;
        }

        protected float[] getRGBComponents() {
            float r = ((color >> 16) & 0xFF) / 255f;
            float g = ((color >> 8) & 0xFF) / 255f;
            float b = (color & 0xFF) / 255f;
            return new float[]{r, g, b};
        }

        public abstract void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta);

        // Helper with safe substring logic
        protected String safeSubstring(String s) {
            if (s == null || s.length() < 6) {
                return s == null ? "???" : s; // Return original if too short, or "???" if null
            }
            return s.substring(0, 6) + "...";
        }

        protected void renderText(MatrixStack matrices, TextRenderer textRenderer, Camera camera, String text, float yOffset, int textColor) {
            int finalColor = ( ((int)(alpha * 255) & 0xFF) << 24 ) | (textColor & 0x00FFFFFF);
            if ((finalColor >> 24 & 0xFF) < 5) return;

            matrices.push();
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
            matrices.scale(-0.025f, -0.025f, 0.025f);

            Matrix4f matrix4f = matrices.peek().getPositionMatrix();
            float textWidth = textRenderer.getWidth(text);
            VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();

            textRenderer.draw(
                    text,
                    -textWidth / 2,
                    yOffset * -40,
                    finalColor,
                    false,
                    matrix4f,
                    immediate,
                    TextRenderer.TextLayerType.SEE_THROUGH,
                    ((int)(alpha * 144) & 0xFF) << 24, // Background alpha
                    LightmapTextureManager.MAX_LIGHT_COORDINATE
            );
            immediate.draw();
            matrices.pop();
        }
    }

    // --- Specific Effect Implementations ---

    private class MintParticleEffect extends VisualEffect {
        private final int particleCountPerTick;
        private final float particleSpeed;
        private final float particleSize;

        public MintParticleEffect(TokenTransferEvent event, int color, int maxLifetime) {
            super(event, color, maxLifetime);
            this.particleCountPerTick = Math.max(1, Math.min(10, (int)(Math.log10(event.getAmount() + 1) * 2)));
            this.particleSpeed = 0.1f + (float)Math.min(0.3, Math.log10(event.getAmount()+1) * 0.05);
            this.particleSize = 0.5f + (float)Math.min(1.0, Math.log10(event.getAmount()+1) * 0.1);
        }

        @Override
        protected void spawnParticles() {
            if (lifetime < maxLifetime / 2 && client.world != null && position != null) {
                float[] rgb = getRGBComponents();
                Vector3f dustColor = new Vector3f(rgb[0], rgb[1], rgb[2]);
                // Note: Correct constructor usage might still depend on exact MC/Fabric versions
                // If the `new` keyword still causes issues, this points to a deeper setup problem.
                DustParticleEffect effectParameters = new DustParticleEffect(DustParticleEffect.RED, particleSize);


                for (int i = 0; i < particleCountPerTick; i++) {
                    double vx = (EventRenderer.this.random.nextGaussian()) * particleSpeed * 0.3;
                    double vy = (EventRenderer.this.random.nextFloat()) * particleSpeed;
                    double vz = (EventRenderer.this.random.nextGaussian()) * particleSpeed * 0.3;

                    client.particleManager.addParticle(
                            effectParameters,
                            position.x + (random.nextDouble() - 0.5) * 0.2,
                            position.y + (random.nextDouble() - 0.5) * 0.2,
                            position.z + (random.nextDouble() - 0.5) * 0.2,
                            vx, vy, vz
                    );
                }

                if (random.nextInt(5) == 0) {
                    client.particleManager.addParticle(ParticleTypes.END_ROD, position.x, position.y, position.z,
                            (random.nextDouble() - 0.5) * 0.1, random.nextDouble() * 0.1, (random.nextDouble() - 0.5) * 0.1);
                }
            }
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta) {
            if (position == null) return;

            String amountText = "+" + event.getAmount() / 10000000.0;
            String assetText = event.getAssetCode().isEmpty() ? "XLM" : event.getAssetCode();
            // *** ADD CHECK HERE ***
            String toText = event.getToAccount().isEmpty() ? "???" : safeSubstring(event.getToAccount());

            int whiteWithAlpha = ((int)(alpha * 255) << 24) | 0xFFFFFF;
            int grayWithAlpha = ((int)(alpha * 170) << 24) | 0xAAAAAA;

            renderText(matrices, textRenderer, camera, amountText + " " + assetText, 1.0f, whiteWithAlpha);
            // Use the safe 'toText'
            renderText(matrices, textRenderer, camera, "Minted to: " + toText, 0.5f, grayWithAlpha);
        }
    }


    private class TransferBeamEffect extends VisualEffect {
        private final float beamHeight = 10.0f;

        public TransferBeamEffect(TokenTransferEvent event, int color, int maxLifetime) {
            super(event, color, maxLifetime);
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta) {
            if (position == null) return;

            float[] rgb = getRGBComponents();
            float pulseFactor = (float) Math.sin(Math.PI * (float) lifetime / maxLifetime);
            float currentAlpha = this.alpha * pulseFactor;
            if (currentAlpha < 0.05f) return;

            VertexConsumer buffer = vertexConsumers.getBuffer(RenderLayer.getLightning());

            matrices.push();
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((lifetime + tickDelta) * 2));
            Matrix4f matrix = matrices.peek().getPositionMatrix();
            float radius = 0.1f + 0.15f * (1 - (1-alpha));

            buffer.vertex(matrix, -radius, -beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], 0).texture(0f, 0f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);
            buffer.vertex(matrix, radius, -beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], 0).texture(1f, 0f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);
            buffer.vertex(matrix, radius, beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], currentAlpha).texture(1f, 1f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);
            buffer.vertex(matrix, -radius, beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], currentAlpha).texture(0f, 1f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);

            buffer.vertex(matrix, 0, -beamHeight / 2, -radius).color(rgb[0], rgb[1], rgb[2], 0).texture(0f, 0f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);
            buffer.vertex(matrix, 0, -beamHeight / 2, radius).color(rgb[0], rgb[1], rgb[2], 0).texture(1f, 0f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);
            buffer.vertex(matrix, 0, beamHeight / 2, radius).color(rgb[0], rgb[1], rgb[2], currentAlpha).texture(1f, 1f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);
            buffer.vertex(matrix, 0, beamHeight / 2, -radius).color(rgb[0], rgb[1], rgb[2], currentAlpha).texture(0f, 1f).overlay(OverlayTexture.DEFAULT_UV).light(LightmapTextureManager.MAX_LIGHT_COORDINATE).normal(0f, 1f, 0f);

            matrices.pop();

            String amountText = "" + event.getAmount() / 10000000.0;
            String assetText = event.getAssetCode().isEmpty() ? "XLM" : event.getAssetCode();
            // *** ADD CHECKS HERE ***
            String fromText = event.getFromAccount().isEmpty() ? "???" : safeSubstring(event.getFromAccount());
            String toText = event.getToAccount().isEmpty() ? "???" : safeSubstring(event.getToAccount());

            int whiteWithAlpha = ((int)(alpha * 255) << 24) | 0xFFFFFF;
            int grayWithAlpha = ((int)(alpha * 170) << 24) | 0xAAAAAA;

            renderText(matrices, textRenderer, camera, amountText + " " + assetText, 1.0f, whiteWithAlpha);
            renderText(matrices, textRenderer, camera, fromText + " -> " + toText, 0.5f, grayWithAlpha);
        }
    }


    private class BurnExplosionEffect extends VisualEffect {
        private boolean particlesSpawned = false;
        private final int particleCount;

        public BurnExplosionEffect(TokenTransferEvent event, int color, int maxLifetime) {
            super(event, color, maxLifetime);
            this.particleCount = Math.min(150, 10 + (int)(Math.log10(event.getAmount() + 1) * 25));
        }

        @Override
        protected void spawnParticles() {
            if (!particlesSpawned && lifetime > 2 && client.world != null && position != null) {
                for (int i = 0; i < particleCount; i++) {
                    double speed = 0.2 + random.nextDouble() * 0.4;
                    double dx = (random.nextDouble() - 0.5) * speed;
                    double dy = (random.nextDouble() - 0.5) * speed;
                    double dz = (random.nextDouble() - 0.5) * speed;

                    ParticleEffect particleType = ParticleTypes.FLAME;
                    if (random.nextInt(3) == 0) {
                        particleType = ParticleTypes.LAVA;
                    } else if (random.nextInt(4) == 0) {
                        particleType = ParticleTypes.SMOKE;
                    }

                    client.particleManager.addParticle(
                            particleType,
                            position.x, position.y, position.z,
                            dx, dy, dz
                    );
                }
                particlesSpawned = true;
            }
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta) {
            if (position == null) return;

            if (alpha > 0.1f) {
                String amountText = "-" + event.getAmount() / 10000000.0;
                String assetText = event.getAssetCode().isEmpty() ? "XLM" : event.getAssetCode();
                // *** ADD CHECK HERE ***
                String fromText = event.getFromAccount().isEmpty() ? "???" : safeSubstring(event.getFromAccount());

                int whiteWithAlpha = ((int)(alpha * 255) << 24) | 0xFFFFFF;
                int grayWithAlpha = ((int)(alpha * 170) << 24) | 0xAAAAAA;

                renderText(matrices, textRenderer, camera, amountText + " " + assetText, 1.0f, whiteWithAlpha);
                renderText(matrices, textRenderer, camera, "Burned from: " + fromText, 0.5f, grayWithAlpha);
            }
        }
    }
}