package com.pixelmonworld.block;

import java.util.function.Supplier;

import com.pixelmonworld.Finals;
import com.pixelmonworld.ModCreativeModeTab;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

	public static final RegistryObject<Block> RUBY_BLOCK = registerBlock(Finals.RUBY_BLOCK_ID,
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()),
			ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> RUBY_ORE = registerBlock(Finals.RUBY_ORE_ID,
			() -> new DropExperienceBlock(
					BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)),
			ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock(Finals.DEEPSLATE_RUBY_ORE_ID,
			() -> new DropExperienceBlock(
					BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)),
			ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_RUBY_ORE = registerBlock(Finals.NETHERRACK_RUBY_ORE_ID,
			() -> new DropExperienceBlock(
					BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)),
			ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_RUBY_ORE = registerBlock(Finals.ENDSTONE_RUBY_ORE_ID,  
			() -> new DropExperienceBlock(
					BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)),
			ModCreativeModeTab.TUTORIAL_TAB);

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
			CreativeModeTab tab) {
		RegistryObject<T> toReturn = Finals.BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
			CreativeModeTab tab) {
		return Finals.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	public static void register(IEventBus bus) {
		Finals.BLOCKS.register(bus);
	}
}
