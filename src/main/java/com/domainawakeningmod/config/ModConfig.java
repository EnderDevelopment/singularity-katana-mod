package com.domainawakeningmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("General");
        // Define config options here
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
