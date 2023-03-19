package com.pixelmonworld;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Finals {
	
	//	Global
	public static final String MOD_ID = "pixelmonworld";
    public static final Logger LOGGER = LogUtils.getLogger();

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
}
