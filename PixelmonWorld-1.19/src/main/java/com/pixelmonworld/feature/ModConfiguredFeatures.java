//package com.pixelmonworld.feature;
//
//import com.pixelmonworld.Finals;
//
//import net.minecraftforge.eventbus.api.IEventBus;
//
//public class ModConfiguredFeatures {
//
////	public static final RegistryObject<ConfiguredFeature<?, ?>> CHERRY = Finals.CONFIGURED_FEATURES.register(
////			Finals.CHERRY_ID,
////			() -> new ConfiguredFeature<>(Feature.TREE,
////					new TreeConfiguration.TreeConfigurationBuilder(
////							BlockStateProvider.simple(ModBlocks.CHERRY_LOG.get()), new StraightTrunkPlacer(5, 6, 3),
////							BlockStateProvider.simple(ModBlocks.CHERRY_LEAVES.get()),
////							new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
////							new TwoLayersFeatureSize(1, 0, 2)).build()));
////
////	public static final RegistryObject<ConfiguredFeature<?, ?>> CHERRY_SPAWN = Finals.CONFIGURED_FEATURES.register(
////			Finals.CHERRY_SPAWN_ID,
////			() -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
////					new RandomFeatureConfiguration(List
////							.of(new WeightedPlacedFeature(ModPlacedFeatures.CHERRY_CHECKED.getHolder().get(), 0.5F)),
////							ModPlacedFeatures.CHERRY_CHECKED.getHolder().get())));
//
//	public static void register(IEventBus bus) {
//		Finals.CONFIGURED_FEATURES.register(bus);
//	}
//}
