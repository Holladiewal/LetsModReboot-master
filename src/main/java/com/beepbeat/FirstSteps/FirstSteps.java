package com.beepbeat.FirstSteps;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.beepbeat.FirstSteps.reference.Reference;



@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME ,version=Reference.VERSION)
public class FirstSteps
{
    @Mod.Instance(Reference.MOD_ID)
    public static FirstSteps instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
