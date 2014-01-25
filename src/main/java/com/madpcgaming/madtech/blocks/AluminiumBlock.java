package com.madpcgaming.madtech.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.madpcgaming.madtech.MadTech;
import com.madpcgaming.madtech.lib.Strings;

public class AluminiumBlock extends BlockMT
{
	
	public AluminiumBlock()
	{
		//field_151573_f = iron
		super(Material.field_151573_f);
		//func_149752_b = setResistence
		this.func_149752_b(5.0F);
		//func_149647_a = setCreativeTab
		this.func_149647_a(MadTech.tabsMT);
		//func_149663_c = setUnlocalizedName
		this.func_149663_c(Strings.ALUMINIUM_BLOCK_NAME);
	}
	
	public int quantityDropped(Random random)
	{
		return 1;
	}
	
	//func_149651_a = registerBlockIcons
	@Override
	public void func_149651_a(IIconRegister iconRegister)
	{
		//field_149761_L = blockIcon
		field_149761_L = iconRegister.registerIcon("madtech:blockAluminum");
	}
	
}