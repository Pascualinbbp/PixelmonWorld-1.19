package com.pixelmonworld;

import com.pixelmonworld.item.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.RUBY.get());
		}
	};
}
