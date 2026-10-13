package com.domainawakeningmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("domainawakeningmod")
public class DomainAwakeningMod {
    public DomainAwakeningMod() {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
    }
}
