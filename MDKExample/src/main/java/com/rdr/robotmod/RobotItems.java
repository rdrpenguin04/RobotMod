package com.rdr.robotmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RobotItems {
	public static final ItemIC IC = new ItemIC();
	
	public static final ItemRAM RAM = new ItemRAM();
	
	public static class ItemIC extends Item {
		public ItemIC() {
			setUnlocalizedName("chip");
			setCreativeTab(CreativeTabs.MATERIALS);
		}
	}
	
	public static class ItemRAM extends Item {
		public ItemRAM() {
			setUnlocalizedName("memory");
			setCreativeTab(CreativeTabs.MATERIALS);
		}
	}
	
	public static void registerItems() {
		registerItem(IC);
		registerItem(RAM);
	}
	
	public static void registerItemRenderers() {
		registerItemRenderer(IC);
		registerItemRenderer(RAM);
	}
	
	private static void registerItem(Item item) {
		System.out.println("Registering item: " + item.getUnlocalizedName());
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
