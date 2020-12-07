package com.clownmod;

import net.minecraft.init.Blocks;

@Mod(modid=clownmod.MODID,version=clownmod.VERSION)
public class clownmod
{
	public static final String MODID = "Clown Forge Client";
	public static final String VERSION = "b1";
	public static final String MCV = "1.8.9";
	
	
	// Initialize
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Launched Client, MCV="+MCV);
	}
}
