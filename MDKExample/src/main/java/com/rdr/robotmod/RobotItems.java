package com.rdr.robotmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RobotItems {
	public static final ItemIC IC = new ItemIC();
	
	public static class ItemIC extends Item {
		public ItemIC() {
			setUnlocalizedName("chip");
			setCreativeTab(CreativeTabs.MATERIALS);
		}
	}
	
	public static void registerItems() {
		registerItem(IC);
	}
	
	public static void registerItemRenderers() {
		registerItemRenderer(IC);
	}
	
	private static void registerItem(Item item) {
		item.setRegistryName(item.getUnlocalizedName().substring(5));
		GameRegistry.register(item);
	}
	
	private static void registerItemRenderer(Item item) {
		Minecraft
		.getMinecraft()
		.getRenderItem()
		.getItemModelMesher()
	    .register(
	    		item,
	    		0,
	    		new ModelResourceLocation(
	    				Constants.MODID + ":" + item.getUnlocalizedName().substring(5),
	    				"inventory"
	    		)
	    );
	}
}
