package com.artman116.ICE;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class OreDict {
	
	
	public static void addNames()
    {
        LanguageRegistry.addName(General.Ruby, "Ruby");  
        LanguageRegistry.addName(General.Sapphire, "Sapphire");
        LanguageRegistry.addName(General.Topaz, "Topaz");
        LanguageRegistry.addName(General.TopazOre, "Topaz Ore");
        LanguageRegistry.addName(General.RubyOre, "Ruby Ore");
        LanguageRegistry.addName(General.SapphireOre, "Sapphire Ore");
        LanguageRegistry.addName(General.RubyBrick, "Ruby Brick");
        LanguageRegistry.addName(General.SapphireBrick, "Sapphire Brick");
        LanguageRegistry.addName(General.TopazBrick, "Topaz Brick");
        }
    
	
    public static void oreRegistration()
    {
        OreDictionary.registerOre("Ruby", new ItemStack(General.Ruby));
        OreDictionary.registerOre("Sapphire", new ItemStack(General.Sapphire));
        OreDictionary.registerOre("RubyOre", new ItemStack(General.RubyOre));
        OreDictionary.registerOre("SapphireOre", new ItemStack(General.SapphireOre));
        OreDictionary.registerOre("RubyBrick", new ItemStack(General.RubyBrick));
        OreDictionary.registerOre("SapphireBrick", new ItemStack(General.SapphireBrick));
        OreDictionary.registerOre("TopazBrick", new ItemStack(General.TopazBrick));
    }
    
    
    public static void addOreRecipes()
    {
            
    }
    
    
}
