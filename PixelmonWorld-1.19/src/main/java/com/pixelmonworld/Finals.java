package com.pixelmonworld;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.Registry;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Finals {

	// Global
	public static final String MOD_ID = "pixelmonworld";
	public static final String REGISTER_BLOCK_SATATES__ID = "registerBlockStates";
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister
			.create(Registry.CONFIGURED_FEATURE_REGISTRY, MOD_ID);
	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister
			.create(Registry.PLACED_FEATURE_REGISTRY, MOD_ID);
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);

	// Items
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	public static final String RUBY_ID = "ruby";
	public static final String CRYSTAL_ID = "crystal";
	public static final String SAPPHIRE_ID = "sapphire";
	public static final String SILICON_ID = "silicon";
	public static final String SILVER_INGOT_ID = "silver_ingot";
	public static final String PLATINUM_INGOT_ID = "platinum_ingot";
	public static final String ALUMINUM_INGOT_ID = "aluminum_ingot";

	// Blocks
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
	public static final String RUBY_BLOCK_ID = "ruby_block";
	public static final String RUBY_ORE_ID = "ruby_ore";
	public static final String DEEPSLATE_RUBY_ORE_ID = "deepslate_ruby_ore";
	public static final String NETHERRACK_RUBY_ORE_ID = "netherrack_ruby_ore";
	public static final String ENDSTONE_RUBY_ORE_ID = "endstone_ruby_ore";

	public static final String SAPPHIRE_BLOCK_ID = "sapphire_block";
	public static final String SAPPHIRE_ORE_ID = "sapphire_ore";
	public static final String DEEPSLATE_SAPPHIRE_ORE_ID = "deepslate_sapphire_ore";
	public static final String NETHERRACK_SAPPHIRE_ORE_ID = "netherrack_sapphire_ore";
	public static final String ENDSTONE_SAPPHIRE_ORE_ID = "endstone_sapphire_ore";

	public static final String CRYSTAL_BLOCK_ID = "crystal_block";
	public static final String CRYSTAL_ORE_ID = "crystal_ore";
	public static final String DEEPSLATE_CRYSTAL_ORE_ID = "deepslate_crystal_ore";
	public static final String NETHERRACK_CRYSTAL_ORE_ID = "netherrack_crystal_ore";
	public static final String ENDSTONE_CRYSTAL_ORE_ID = "endstone_crystal_ore";

	public static final String SILICON_BLOCK_ID = "silicon_block";
	public static final String SILICON_ORE_ID = "silicon_ore";
	public static final String DEEPSLATE_SILICON_ORE_ID = "deepslate_silicon_ore";
	public static final String NETHERRACK_SILICON_ORE_ID = "netherrack_silicon_ore";
	public static final String ENDSTONE_SILICON_ORE_ID = "endstone_silicon_ore";

	public static final String PLATINUM_BLOCK_ID = "platinum_block";
	public static final String PLATINUM_ORE_ID = "platinum_ore";
	public static final String DEEPSLATE_PLATINUM_ORE_ID = "deepslate_platinum_ore";
	public static final String NETHERRACK_PLATINUM_ORE_ID = "netherrack_platinum_ore";
	public static final String ENDSTONE_PLATINUM_ORE_ID = "endstone_platinum_ore";

	public static final String SILVER_BLOCK_ID = "silver_block";
	public static final String SILVER_ORE_ID = "silver_ore";
	public static final String DEEPSLATE_SILVER_ORE_ID = "deepslate_silver_ore";
	public static final String NETHERRACK_SILVER_ORE_ID = "netherrack_silver_ore";
	public static final String ENDSTONE_SILVER_ORE_ID = "endstone_silver_ore";

	public static final String ALUMINUM_BLOCK_ID = "aluminum_block";
	public static final String BAUXITE_ORE_ID = "bauxite_ore";
	public static final String DEEPSLATE_BAUXITE_ORE_ID = "deepslate_bauxite_ore";
	public static final String NETHERRACK_BAUXITE_ORE_ID = "netherrack_bauxite_ore";
	public static final String ENDSTONE_BAUXITE_ORE_ID = "endstone_bauxite_ore";

	public static final String STRAWBERRY_ID = "strawberry";
	public static final String STRAWBERRY_CROP_ID = "strawberry_crop";
	public static final String STRAWBERRY_SEEDS_ID = "strawberry_seeds";

	// Paintings
	public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister
			.create(ForgeRegistries.PAINTING_VARIANTS, MOD_ID);
	public static final String POKEBALL_PAINTING = "pokeball_painting";

}