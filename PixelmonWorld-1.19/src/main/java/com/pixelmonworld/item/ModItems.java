package com.pixelmonworld.item;

import com.pixelmonworld.Finals;
import com.pixelmonworld.ModCreativeModeTab;
import com.pixelmonworld.ModUtils;
import com.pixelmonworld.block.ModBlocks;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final RegistryObject<Item> RUBY = ModUtils.registerCommonItem(Finals.RUBY_ID, ModCreativeModeTab.TUTORIAL_TAB); 
	public static final RegistryObject<Item> SAPPHIRE = ModUtils.registerCommonItem(Finals.SAPPHIRE_ID, ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Item> SILICON = ModUtils.registerCommonItem(Finals.SILICON_ID, ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Item> CRYSTAL = ModUtils.registerCommonItem(Finals.CRYSTAL_ID, ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Item> SILVER_INGOT = ModUtils.registerCommonItem(Finals.SILVER_INGOT_ID, ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Item> PLATINUM_INGOT = ModUtils.registerCommonItem(Finals.PLATINUM_INGOT_ID, ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Item> ALUMINUM_INGOT = ModUtils.registerCommonItem(Finals.ALUMINUM_INGOT_ID, ModCreativeModeTab.TUTORIAL_TAB);

	public static final RegistryObject<Item> STRAWBERRY_SEEDS = Finals.ITEMS.register(Finals.STRAWBERRY_SEEDS_ID, () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
	public static final RegistryObject<Item> STRAWBERRY = Finals.ITEMS.register(Finals.STRAWBERRY_ID, () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

	public static void register(IEventBus bus) {
		Finals.ITEMS.register(bus);
	}
}