package com.domainawakeningmod.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = "domainawakeningmod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    public static void init() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::onClientSetup);
    }

    private static void onClientSetup(final FMLClientSetupEvent event) {
        // Client-side setup code here
    }
}
