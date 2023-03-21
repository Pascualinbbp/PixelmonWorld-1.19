package com.pixelmonworld.block;

import java.util.function.Supplier;

import com.pixelmonworld.Finals;
import com.pixelmonworld.ModCreativeModeTab;
import com.pixelmonworld.custom.StrawberryCropBlock;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

	public static final RegistryObject<Block> STRAWBERRY_CROP = Finals.BLOCKS.register(Finals.STRAWBERRY_CROP_ID,
			() -> new StrawberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

	//	public static final RegistryObject<Block> CHERRY_LOG = registerBlock(Finals.CHERRY_LOG_ID,
	//			() -> new ModRotatedPillarBlock(
	//					BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops()),
	//			ModCreativeModeTab.TUTORIAL_TAB);
	//	public static final RegistryObject<Block> CHERRY_WOOD = registerBlock(Finals.CHERRY_WOOD_ID,
	//			() -> new ModRotatedPillarBlock(
	//					BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops()),
	//			ModCreativeModeTab.TUTORIAL_TAB);
	//	public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = registerBlock(Finals.STRIPPED_CHERRY_LOG_ID,
	//			() -> new ModRotatedPillarBlock(
	//					BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops()),
	//			ModCreativeModeTab.TUTORIAL_TAB);
	//	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD = registerBlock(Finals.STRIPPED_CHERRY_WOOD_ID,
	//			() -> new ModRotatedPillarBlock(
	//					BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops()),
	//			ModCreativeModeTab.TUTORIAL_TAB);
	//	public static final RegistryObject<Block> CHERRY_PLANKS = registerBlock(Finals.CHERRY_PLANKS_ID,
	//			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()) {
	//				@Override
	//				public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
	//					return true;
	//				}
	//
	//				@Override
	//				public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
	//					return 5;
	//				}
	//
	//				@Override
	//				public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
	//					return 20;
	//				}
	//			}, ModCreativeModeTab.TUTORIAL_TAB);
	//	public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock(Finals.CHERRY_LEAVES_ID,
	//			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()) {
	//				@Override
	//				public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
	//					return true;
	//				}
	//
	//				@Override
	//				public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
	//					return 30;
	//				}
	//
	//				@Override
	//				public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
	//					return 60;
	//				}
	//			}, ModCreativeModeTab.TUTORIAL_TAB);
	//	public static final RegistryObject<Block> CHERRY_SAPLING = registerBlock(Finals.CHERRY_SAPLING_ID,
	//			() -> new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
	//			ModCreativeModeTab.TUTORIAL_TAB);

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
