package com.pixelmonworld;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModUtils { 

	public static RegistryObject<Block> registerBlock(String id, Supplier<Block> supplier, CreativeModeTab tab) {  
		RegistryObject<Block> toReturn = Finals.BLOCKS.register(id, supplier);  
		registerBlockItem(id, toReturn, tab);
		return toReturn;
	}

	private static RegistryObject<Item> registerBlockItem(String id, RegistryObject<Block> block, CreativeModeTab tab) {
		return Finals.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));   
	}
	
	public static RegistryObject<Item> registerCommonItem(String id, CreativeModeTab tab) {
		return Finals.ITEMS.register(id, () -> new Item(new Item.Properties().tab(tab)));   
	}

} 
