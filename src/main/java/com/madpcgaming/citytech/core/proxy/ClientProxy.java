package com.madpcgaming.citytech.core.proxy;

import com.madpcgaming.citytech.tileentitys.CableTE;
import com.madpcgaming.citytech.tileentitys.renderers.CableRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{

	public void registerRenderings()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(CableTE.class,
				new CableRenderer());
	}
	
}