HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
    MinecraftClient mc = MinecraftClient.getInstance();

    if (mc.player == null) return;

    String text = "Laki Visual | FPS: " + mc.getCurrentFps();

    drawContext.drawTextWithShadow(
            mc.textRenderer,
            text,
            10,
            10,
            0xFFFFFF
    );
});
