package com.pixelmonworld.item;

import com.pixelmonworld.Finals;
import com.pixelmonworld.ModCreativeModeTab;
import com.pixelmonworld.block.ModBlocks;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final RegistryObject<Item> RUBY = Finals.ITEMS.register(Finals.RUBY_ID,
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

	public static final RegistryObject<Item> STRAWBERRY_SEEDS = Finals.ITEMS.register(Finals.STRAWBERRY_SEEDS_ID,
			() -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(),
					new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
	public static final RegistryObject<Item> STRAWBERRY = Finals.ITEMS.register(Finals.STRAWBERRY_ID,
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
					.food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

	public static void register(IEventBus bus) {
		Finals.ITEMS.register(bus);
	}
}
