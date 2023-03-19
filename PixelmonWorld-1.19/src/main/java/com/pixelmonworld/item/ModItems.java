package com.pixelmonworld.item;

import com.pixelmonworld.Finals;
import com.pixelmonworld.ModCreativeModeTab;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final RegistryObject<Item> RUBY = Finals.ITEMS.register(Finals.RUBY_ID,
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

	public static void register(IEventBus bus) {
		Finals.ITEMS.register(bus);
	}
}
