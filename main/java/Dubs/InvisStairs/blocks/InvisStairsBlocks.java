package Dubs.InvisStairs.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class InvisStairsBlocks {

	public static InvisStair invisStair ;
	
	public static final void init(){
	
	
		invisStair = new InvisStair(Material.air, "InvisStair");
		GameRegistry.registerBlock(invisStair, invisStair.getUnlocalizedName());
		
	}
}