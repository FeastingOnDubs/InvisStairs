package Dubs.InvisStairs.blocks;

import Dubs.InvisStairs.lib.ModVars;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;


public class InvisStair extends BlockStairs {

	protected InvisStair(Material material, String name) {
		super(material);
		
	this.setCreativeTab(CreativeTabs.tabTools);
	this.setBlockName(name);
	this.setBlockTextureName(ModVars.MOD_ID + ":" + this.getUnlocalizedName());
	this.setHardness(-1F);
	this.setLightLevel(0.0F);
	this.setHarvestLevel("axe", 1);
	this.setResistance(18000000.0F);
	this.setStepSound(null);
	
	}

}