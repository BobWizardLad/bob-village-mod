package com.example.examplemod;

import com.example.examplemod.registry.ModBlocks;
import com.example.examplemod.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.*;


import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MOD_ID)
public class ExampleMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    // Creative tab for mod items
    public static final ItemGroup GROUP = new ItemGroup(Reference.MOD_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.CARROT);
        }
    };

    public ExampleMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.REGISTER.register(eventBus);
        ModItems.REGISTER.register(eventBus);

    }

    // Leaving these stubs here until I need to setup client, common, data stuff
    private void onCommonSetup(FMLCommonSetupEvent event) {

    }

    private void onClientSetup(FMLClientSetupEvent event) {

    }

    private void onDataSetup(GatherDataEvent event) {

    }

}
