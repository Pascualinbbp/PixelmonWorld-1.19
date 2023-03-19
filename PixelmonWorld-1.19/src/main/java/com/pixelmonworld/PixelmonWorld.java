package com.pixelmonworld;

import com.pixelmonworld.block.ModBlocks;
import com.pixelmonworld.item.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Finals.MOD_ID)
public class PixelmonWorld {

	public PixelmonWorld() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModItems.register(bus);
		ModBlocks.register(bus); 
		
		bus.addListener(this::commonSetup);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void commonSetup(final FMLCommonSetupEvent event) {
		Finals.LOGGER.info("HELLO FROM COMMON SETUP");
		Finals.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
	}
	
	@Mod.EventBusSubscriber(modid = Finals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			Finals.LOGGER.info("HELLO FROM CLIENT SETUP");
			Finals.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
		}
	}
}