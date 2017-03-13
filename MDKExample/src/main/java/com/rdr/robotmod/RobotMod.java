package com.rdr.robotmod;

import com.rdr.robotmod.proxies.*;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid	= Constants.MODID,
		name	= Constants.NAME,
		version	= Constants.VERSION
)
public class RobotMod {
	@Instance
    public static RobotMod instance = new RobotMod();
	
	@SidedProxy(clientSide="com.rdr.robotmod.proxies.ClientProxy", serverSide="com.rdr.robotmod.proxies.ServerProxy")
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}
