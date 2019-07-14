package Dubs.InvisStairs;

import Dubs.InvisStairs.lib.ModVars;
import Dubs.InvisStairs.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModVars.MOD_ID, name = ModVars.MOD_Name, version = ModVars.MOD_Version )
public class Main {

	@Instance
	public static Main instance = new Main ();
	
	@SidedProxy(clientSide = "Dubs.InvisStairs.proxy.ClientProxy", serverSide = "Dubs.InvisStairs.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent $e){
		proxy.preInit($e);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent $e){
		proxy.init($e);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent $e){
	proxy.postInit($e);
	
	}
}