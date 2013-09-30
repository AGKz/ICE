package com.artman116.ICE;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.artman116.ICE.lib.*;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class General
{
	
//	      Creative Tab Launcher
	public static CreativeTabs ExtrasTab = new ICETab(CreativeTabs.getNextID(), Reference.MOD_NAME);
	
	
//	      World Gen Manager
    EventManager eventmanager = new EventManager();
	
	
//         Items
	public static Item Ruby;
	public static Item Sapphire;
	public static Item Topaz;
	public static Item RubyGemStone;
	public static Item SapphireGemStone;
	public static Item TopazGemStone;
	
//         Blocks
    public static Block RubyOre;
    public static Block SapphireOre;
    public static Block TopazOre;
    public static Block RubyBrick;
    public static Block SapphireBrick;
    public static Block TopazBrick;

//         Tools
    public static Item RubyPickaxe;
	public static Item SapphirePickaxe;
	public static Item TopazPickaxe;
      
       @EventHandler
       public void load(FMLInitializationEvent event)
       {
    	       	   
    		 
//    	   Creative Tab Name
    	   LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.MOD_ID, "en_US", Reference.MOD_NAME);
    	   
 
    	   //ITEMS 
    	   
//         Ruby Gem Code        
           Ruby = new Ruby(Reference.Item_ID).setUnlocalizedName("rubygem");

//         Sapphire Gem Code        
           Sapphire = new Sapphire(Reference.Item_ID + 1).setUnlocalizedName("sapphiregem");
           
//         Topaz Gem Code        
           Topaz = new Topaz(Reference.Item_ID + 2).setUnlocalizedName("topazgem");
           
//         Ruby Pickaxe Code        
           RubyPickaxe = new RubyPickaxe(Reference.Item_ID + 10, EnumToolMaterial.IRON).setUnlocalizedName("rubypickaxe");
           LanguageRegistry.addName(RubyPickaxe, "Ruby Pickaxe");
           
//         Sapphire Pickaxe Code        
           SapphirePickaxe = new SapphirePickaxe(Reference.Item_ID + 11, EnumToolMaterial.IRON).setUnlocalizedName("sapphirepickaxe");
           LanguageRegistry.addName(SapphirePickaxe, "Sapphire Pickaxe");
           
//         Topaz Pickaxe Code        
           TopazPickaxe = new TopazPickaxe(Reference.Item_ID + 12, EnumToolMaterial.IRON).setUnlocalizedName("topazpickaxe");
           LanguageRegistry.addName(TopazPickaxe, "Topaz Pickaxe");
                   
//         Ruby Gem Stone Code        
           RubyGemStone = new RubyGemStone(Reference.Item_ID + 20).setUnlocalizedName("rubygemstone");

//         Sapphire Gem Stone Code        
           SapphireGemStone = new SapphireGemStone(Reference.Item_ID + 21).setUnlocalizedName("sapphiregemstone");
           
//         Topaz Gem Stone Code        
           TopazGemStone = new TopazGemStone(Reference.Item_ID + 22).setUnlocalizedName("topazgemstone");
           
           
           //BLOCKS
           
//         Ruby Ore Code
           RubyOre = new RubyOre(Reference.Block_ID, Material.rock).setUnlocalizedName("ruby_ore");
           GameRegistry.registerBlock(RubyOre, Reference.MOD_ID + RubyOre.getUnlocalizedName());

//         Sapphire Ore Code
           SapphireOre = new SapphireOre(Reference.Block_ID + 1, Material.rock).setUnlocalizedName("sapphire_ore");
           GameRegistry.registerBlock(SapphireOre, Reference.MOD_ID + SapphireOre.getUnlocalizedName());
           
//         Topaz Ore Code
           TopazOre = new TopazOre(Reference.Block_ID + 2, Material.rock).setUnlocalizedName("topaz_ore");
           GameRegistry.registerBlock(TopazOre, Reference.MOD_ID + TopazOre.getUnlocalizedName());

//         Ruby Brick Code
           RubyBrick = new RubyBrick(Reference.Block_ID + 20, Material.rock).setUnlocalizedName("ruby_brick");
           GameRegistry.registerBlock(RubyBrick, Reference.MOD_ID + RubyBrick.getUnlocalizedName());

//         Sapphire Brick Code
           SapphireBrick = new SapphireBrick(Reference.Block_ID + 21, Material.rock).setUnlocalizedName("sapphire_brick");
           GameRegistry.registerBlock(SapphireBrick, Reference.MOD_ID + SapphireBrick.getUnlocalizedName());
           
//         Topaz Brick Code
           TopazBrick = new TopazBrick(Reference.Block_ID + 22, Material.rock).setUnlocalizedName("topaz_brick");
           GameRegistry.registerBlock(TopazBrick, Reference.MOD_ID + TopazBrick.getUnlocalizedName());


           
           
//         Loads The EventManager (World Gen Etc.)  
           GameRegistry.registerWorldGenerator(eventmanager);
           
           
//         Registers Recipes
    	   Recipes.addRecipes();   
    	   
    	   
//         Registers the Ore Dict
    	   OreDict.addNames();
    	   OreDict.addOreRecipes();
    	   OreDict.oreRegistration();
    	   
    	   
//         Checks for Compatible Mods    	   
    	   Loader.isModLoaded("ic2");
    	   {
    		   IC2Recipes.addIC2Recipes();
    	   }
    	   
       }
}