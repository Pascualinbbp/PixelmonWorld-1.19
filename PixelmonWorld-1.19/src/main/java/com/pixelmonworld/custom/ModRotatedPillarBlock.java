//package com.pixelmonworld.custom;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Direction;
//import net.minecraft.world.level.BlockGetter;
//import net.minecraft.world.level.block.RotatedPillarBlock;
//import net.minecraft.world.level.block.state.BlockState;
//
//public class ModRotatedPillarBlock extends RotatedPillarBlock{
//
//	public ModRotatedPillarBlock(Properties properties) {
//		super(properties);
//	}
//	
//	@Override
//	public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
//		return true;
//	}
//	
//	@Override
//	public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
//		return 5;  
//	}
//	
//	@Override
//	public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
//		return 5;   
//	}
//	
////	@Override
////	public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
////		if(context.getItemInHand().getItem() instanceof AxeItem) {
////			 if(state.is(ModBlocks.CHERRY_LOG.get())) {
////				 return ModBlocks.STRIPPED_CHERRY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS)); 
////			 }
////			 if(state.is(ModBlocks.CHERRY_WOOD.get())) {
////				 return ModBlocks.STRIPPED_CHERRY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS)); 
////			 }
////		}
////		
////		return super.getToolModifiedState(state, context, toolAction, simulate);
////	}
//
//}
