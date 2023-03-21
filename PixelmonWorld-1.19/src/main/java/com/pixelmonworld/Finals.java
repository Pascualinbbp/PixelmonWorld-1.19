package com.pixelmonworld;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.Registry;
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
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister
			.create(Registry.CONFIGURED_FEATURE_REGISTRY, MOD_ID);
	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister
			.create(Registry.PLACED_FEATURE_REGISTRY, MOD_ID); 
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);

//    Items
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	public static final String RUBY_ID = "ruby";

//    Blocks
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
	public static final String RUBY_BLOCK_ID = "ruby_block";
	public static final String RUBY_ORE_ID = "ruby_ore";
	public static final String DEEPSLATE_RUBY_ORE_ID = "deepslate_ruby_ore";
	public static final String NETHERRACK_RUBY_ORE_ID = "netherrack_ruby_ore";
	public static final String ENDSTONE_RUBY_ORE_ID = "endstone_ruby_ore";
	
	public static final String STRAWBERRY_ID = "strawberry";
	public static final String STRAWBERRY_CROP_ID = "strawberry_crop";
	public static final String STRAWBERRY_SEEDS_ID = "strawberry_seeds"; 
}
