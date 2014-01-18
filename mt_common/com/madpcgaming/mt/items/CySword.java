package com.madpcgaming.mt.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.madpcgaming.mt.items.interfaces.ILevelableItem;

public class CySword extends ItemSword implements ILevelableItem
{
	private EnumToolMaterial mat;
	
	public CySword(int par1, EnumToolMaterial mat)
	{
		super(par1, mat);
		this.mat = mat;
	}

	@Override
	public boolean getShareTag()
	{
		return true;
	}
	
	@Override
	public void recalculate(ItemStack item)
	{
		
	}
	
	public int getMaxDamage(ItemStack stack)
    {
		NBTTagCompound tag = stack.stackTagCompound;
		return tag.getInteger("durability");
    }
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
		NBTTagCompound tag = par1ItemStack.stackTagCompound;
		if (tag.getInteger("durability") > 0)
			par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
	
	@Override
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		NBTTagCompound tag = par1ItemStack.stackTagCompound;
		if (tag == null)
		{
			tag = new NBTTagCompound();
			tag.setInteger("level", 1);
		} else if (!tag.hasKey("level"))
		{
			tag.setInteger("level", 1);
		}
		tag.setInteger("durability", (int) (this.mat.getMaxUses() + tag.getInteger("level") * 50 + 50));
		par1ItemStack.setTagCompound(tag);
	}
}
