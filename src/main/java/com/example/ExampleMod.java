package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ClientModInitializer {

    public static final String MOD_ID = "laki_visual";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {

        LOGGER.info("Laki Visual loaded!");

        HudRenderCallback.EVENT.register((matrixStack, tickDelta) -> {
            MinecraftClient mc = MinecraftClient.getInstance();

            String text = "Laki Visual | FPS: " + mc.getCurrentFps();

            mc.textRenderer.drawWithShadow(
                    matrixStack,
                    text,
                    10,
                    10,
                    0xFFFFFF
            );
        });
    }
}
