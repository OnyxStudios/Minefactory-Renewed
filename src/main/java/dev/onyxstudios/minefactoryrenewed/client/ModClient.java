package dev.onyxstudios.minefactoryrenewed.client;

import dev.onyxstudios.minefactoryrenewed.client.gui.machine.farming.FarmerScreen;
import dev.onyxstudios.minefactoryrenewed.client.gui.machine.farming.PlanterScreen;
import dev.onyxstudios.minefactoryrenewed.registry.ModBlockEntities;
import dev.onyxstudios.minefactoryrenewed.registry.ModEntities;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

public class ModClient {

    public static void init() {
        initScreens();
        initEntities();
    }

    private static void initScreens() {
        MenuScreens.register(ModBlockEntities.PLANTER_CONTAINER.get(), PlanterScreen::new);
        MenuScreens.register(ModBlockEntities.FARMER_CONTAINER.get(), FarmerScreen::new);
    }

    private static void initEntities() {
        EntityRenderers.register(ModEntities.SAFARI_NET.get(), ThrownItemRenderer::new);
    }
}
