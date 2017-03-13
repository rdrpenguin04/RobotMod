package com.rdr.robotmod.proxies;

import com.rdr.robotmod.RobotCrafting;
import com.rdr.robotmod.RobotItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		RobotItems.registerItems();
	}
	
	public void init(FMLInitializationEvent e) {
		RobotCrafting.registerCrafting();
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
