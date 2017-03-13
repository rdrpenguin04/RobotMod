package com.rdr.robotmod;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RobotCrafting {
	public static void registerCrafting() {
		GameRegistry.addRecipe(new ItemStack(RobotItems.IC),
				"RIR",
				"IRI",
				"RIR",
				'R', Blocks.REDSTONE_BLOCK,
				'I', Blocks.IRON_BLOCK);
	}
}
