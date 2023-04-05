package com.pixelmonworld.block;

import com.pixelmonworld.Finals;
import com.pixelmonworld.ModCreativeModeTab;
import com.pixelmonworld.ModUtils;
import com.pixelmonworld.custom.StrawberryCropBlock;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

	public static final RegistryObject<Block> RUBY_BLOCK = ModUtils.registerBlock(Finals.RUBY_BLOCK_ID, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> RUBY_ORE = ModUtils.registerBlock(Finals.RUBY_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = ModUtils.registerBlock(Finals.DEEPSLATE_RUBY_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_RUBY_ORE = ModUtils.registerBlock(Finals.NETHERRACK_RUBY_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_RUBY_ORE = ModUtils.registerBlock(Finals.ENDSTONE_RUBY_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = ModUtils.registerBlock(Finals.SAPPHIRE_BLOCK_ID, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> SAPPHIRE_ORE = ModUtils.registerBlock(Finals.SAPPHIRE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = ModUtils.registerBlock(Finals.DEEPSLATE_SAPPHIRE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_SAPPHIRE_ORE = ModUtils.registerBlock(Finals.NETHERRACK_SAPPHIRE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_SAPPHIRE_ORE = ModUtils.registerBlock(Finals.ENDSTONE_SAPPHIRE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	
	public static final RegistryObject<Block> SILICON_BLOCK = ModUtils.registerBlock(Finals.SILICON_BLOCK_ID, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> SILICON_ORE = ModUtils.registerBlock(Finals.SILICON_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_SILICON_ORE = ModUtils.registerBlock(Finals.DEEPSLATE_SILICON_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_SILICON_ORE = ModUtils.registerBlock(Finals.NETHERRACK_SILICON_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_SILICON_ORE = ModUtils.registerBlock(Finals.ENDSTONE_SILICON_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	
	public static final RegistryObject<Block> CRYSTAL_BLOCK = ModUtils.registerBlock(Finals.CRYSTAL_BLOCK_ID, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> CRYSTAL_ORE = ModUtils.registerBlock(Finals.CRYSTAL_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_ORE = ModUtils.registerBlock(Finals.DEEPSLATE_CRYSTAL_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_CRYSTAL_ORE = ModUtils.registerBlock(Finals.NETHERRACK_CRYSTAL_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_CRYSTAL_ORE = ModUtils.registerBlock(Finals.ENDSTONE_CRYSTAL_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	
	public static final RegistryObject<Block> PLATINUM_BLOCK = ModUtils.registerBlock(Finals.PLATINUM_BLOCK_ID, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> PLATINUM_ORE = ModUtils.registerBlock(Finals.PLATINUM_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = ModUtils.registerBlock(Finals.DEEPSLATE_PLATINUM_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_PLATINUM_ORE = ModUtils.registerBlock(Finals.NETHERRACK_PLATINUM_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_PLATINUM_ORE = ModUtils.registerBlock(Finals.ENDSTONE_PLATINUM_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	
	public static final RegistryObject<Block> SILVER_BLOCK = ModUtils.registerBlock(Finals.SILVER_BLOCK_ID, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> SILVER_ORE = ModUtils.registerBlock(Finals.SILVER_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = ModUtils.registerBlock(Finals.DEEPSLATE_SILVER_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_SILVER_ORE = ModUtils.registerBlock(Finals.NETHERRACK_SILVER_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_SILVER_ORE = ModUtils.registerBlock(Finals.ENDSTONE_SILVER_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	
	public static final RegistryObject<Block> ALUMINUM_BLOCK = ModUtils.registerBlock(Finals.ALUMINUM_BLOCK_ID, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> BAUXITE_ORE = ModUtils.registerBlock(Finals.BAUXITE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> DEEPSLATE_BAUXITE_ORE = ModUtils.registerBlock(Finals.DEEPSLATE_BAUXITE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> NETHERRACK_BAUXITE_ORE = ModUtils.registerBlock(Finals.NETHERRACK_BAUXITE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);
	public static final RegistryObject<Block> ENDSTONE_BAUXITE_ORE = ModUtils.registerBlock(Finals.ENDSTONE_BAUXITE_ORE_ID, () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.TUTORIAL_TAB);

	public static final RegistryObject<Block> STRAWBERRY_CROP = Finals.BLOCKS.register(Finals.STRAWBERRY_CROP_ID, () -> new StrawberryCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

	

	public static void register(IEventBus bus) {
		Finals.BLOCKS.register(bus);
	}
}