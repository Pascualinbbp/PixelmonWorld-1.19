package com.pixelmonworld.custom;

import com.pixelmonworld.Finals;
import com.pixelmonworld.item.ModItems;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class StrawberryCropBlock extends CropBlock{

	public StrawberryCropBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	protected ItemLike getBaseSeedId() {
		return ModItems.STRAWBERRY_SEEDS.get();
	}
	
	@Override
	public IntegerProperty getAgeProperty() {
		return Finals.AGE;
	}
	
	@Override
	public int getMaxAge() {
		return 3; 
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(Finals.AGE); 
	}

}
