package com.example.examplemod.registry;

import com.example.examplemod.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    // Mod Items


    private static RegistryObject<Item> register(String name, Item item)
    {
        return REGISTER.register(name, () -> item);
    }
}
