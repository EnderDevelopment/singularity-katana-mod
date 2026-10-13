package com.domainawakeningmod.registry;

import com.domainawakeningmod.item.SingularityKatana;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "domainawakeningmod");
    
    public static final RegistryObject<Item> SINGULARITY_KATANA = ITEMS.register("singularity_katana", SingularityKatana::new);
}
