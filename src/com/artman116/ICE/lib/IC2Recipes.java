package com.artman116.ICE.lib;


import ic2.api.item.Items;
import ic2.api.recipe.IMachineRecipeManager;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.artman116.ICE.General;

import cpw.mods.fml.common.registry.GameRegistry;

public class IC2Recipes {
	public static void addIC2Recipes()
    {		
		
		ItemStack circuit = new ItemStack(Items.getItem("electronicCircuit").getItem(), 1);
		ItemStack circuitx2 = new ItemStack(Items.getItem("electronicCircuit").getItem(), 2);
		ItemStack AdvCircuit = new ItemStack(Items.getItem("advancedCircuit").getItem(), 1);
		ItemStack AdvCircuitx2 = new ItemStack(Items.getItem("advancedCircuit").getItem(), 2);
		ItemStack Rubyx2 = new ItemStack(General.Ruby, 2);
		ItemStack Sapphirex2 = new ItemStack(General.Sapphire, 2);
		ItemStack Topazx2 = new ItemStack(General.Topaz, 2);
		ItemStack Diamondx2 = new ItemStack(Item.diamond, 2);
		ItemStack eCrystal = new ItemStack(Items.getItem("energyCrystal").getItem(), 1);
		ItemStack lCrystal = new ItemStack(Items.getItem("lapotronCrystal").getItem(), 1);
		ItemStack CopperCable = Items.getItem("insulatedCopperCableItem");
	        
//	      Creates a Electronic Circuit
	        GameRegistry.addRecipe(circuitx2, new Object[]{
	            "XXX",
	            "RCR",
	            "XXX",
	            'C', General.Ruby, 'R', Item.redstone, 'X', CopperCable.getItem()
	        });
	        
//		      Creates an Energy Crystal
		        GameRegistry.addRecipe(eCrystal, new Object[]{
		            "RRR",
		            "RCR",
		            "RRR",
		            'C', General.Ruby, 'R', Item.redstone, 
		        });
		        
//			      Creates a Lapotron Crystal
			        GameRegistry.addRecipe(lCrystal, new Object[]{
			            "LLL",
			            "LCL",
			            "LLL",
			            'C', General.Sapphire, 'L', new ItemStack(Item.dyePowder, 1, 4) 
			        });
			        
//				      Creates a Advanced Circuit
				        GameRegistry.addRecipe(AdvCircuitx2, new Object[]{
				            "STS",
				            "RCR",
				            "STS",
				            'S', General.Sapphire, 'C', circuit, 'R', General.Ruby, 'T', General.Topaz
				        });
				        
				        GameRegistry.addRecipe(AdvCircuitx2, new Object[]{
					            "SRS",
					            "TCT",
					            "SRS",
					            'S', General.Sapphire, 'C', circuit, 'R', General.Ruby, 'T', General.Topaz
					        });
		
		
//              Adds Macerating Recipes For the Ores
		       Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(General.RubyOre)), null, Rubyx2);
		       Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(General.TopazOre)), null, Topazx2);
		       Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(General.SapphireOre)), null, Sapphirex2);
		       Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Block.oreDiamond)), null, Diamondx2);
		

    }
}
