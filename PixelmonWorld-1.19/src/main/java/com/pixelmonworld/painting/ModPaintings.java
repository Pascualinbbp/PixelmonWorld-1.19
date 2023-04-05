package com.pixelmonworld.painting;

import com.pixelmonworld.Finals;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {

	public static final RegistryObject<PaintingVariant> POKEBALL_PAINTING = Finals.PAINTING_VARIANTS
			.register(Finals.POKEBALL_PAINTING, () -> new PaintingVariant(16, 16)); 

	public static void register(IEventBus bus) {
		Finals.PAINTING_VARIANTS.register(bus);
	}
} 