package com.madpcgaming.citytech.blocks.liquids;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;

import com.madpcgaming.citytech.MadTech;
import com.madpcgaming.citytech.lib.Strings;

public class SiliconLiquidFlowing extends BlockLiquid
{
	
	public SiliconLiquidFlowing(int id)
	{
		super(Material.field_151586_h);
		func_149711_c(100F);
		this.func_149713_g(3);
		this.func_149647_a(MadTech.tabsMT);
		this.func_149663_c(Strings.SILICON_LIQUID_FLOWING);
		
	}
	
}