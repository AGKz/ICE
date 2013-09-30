package com.artman116.ICE.lib;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import com.artman116.ICE.*;
public class Recipes {

	public static void addRecipes()
    {

		GameRegistry.addShapelessRecipe(new ItemStack(General.RubyOre), new Object[]{
            new ItemStack(General.Ruby), new ItemStack(Block.stone), new ItemStack(General.Ruby)
     });
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(General.Ruby), new Object[]{
            new ItemStack(General.Ruby), new ItemStack(General.Ruby)
     });
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(General.Sapphire), new Object[]{
            new ItemStack(General.Sapphire), new ItemStack(General.Sapphire)
     });
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(General.Sapphire), new Object[]{
            new ItemStack(General.Sapphire), new ItemStack(General.Sapphire)
     });
		
		
//              Creates a Sapphire Pickaxe
		GameRegistry.addRecipe(new ItemStack(General.SapphirePickaxe), new Object[]{
            "XXX",
            "CZC",
            "CZC",
            'X', General.Sapphire, 'Z', Item.stick
     });
		
		
//              Creates a Ruby Pickaxe
        GameRegistry.addRecipe(new ItemStack(General.RubyPickaxe), new Object[]{
            "XXX",
            "CZC",
            "CZC",
            'X', General.Ruby, 'Z', Item.stick
     });
        
//      Creates a Topaz Pickaxe
GameRegistry.addRecipe(new ItemStack(General.TopazPickaxe), new Object[]{
    "XXX",
    "CZC",
    "CZC",
    'X', General.Topaz, 'Z', Item.stick
});
        
        
//      Creates Ruby Brick
GameRegistry.addRecipe(new ItemStack(General.RubyBrick, 4), new Object[]{
    "XXX",
    "XCC",
    "XCC",
    'C', General.Ruby
});
GameRegistry.addRecipe(new ItemStack(General.RubyBrick, 4), new Object[]{
    "XXX",
    "CCX",
    "CCX",
    'C', General.Ruby
});
GameRegistry.addRecipe(new ItemStack(General.RubyBrick, 4), new Object[]{
    "CCX",
    "CCX",
    "XXX",
    'C', General.Ruby
});
GameRegistry.addRecipe(new ItemStack(General.RubyBrick, 4), new Object[]{
    "XCC",
    "XCC",
    "XXX",
    'C', General.Ruby
});


//Creates Sapphire Brick
GameRegistry.addRecipe(new ItemStack(General.SapphireBrick, 4), new Object[]{
"XXX",
"XCC",
"XCC",
'C', General.Sapphire
});
GameRegistry.addRecipe(new ItemStack(General.SapphireBrick, 4), new Object[]{
"XXX",
"CCX",
"CCX",
'C', General.Sapphire
});
GameRegistry.addRecipe(new ItemStack(General.SapphireBrick, 4), new Object[]{
"CCX",
"CCX",
"XXX",
'C', General.Sapphire
});
GameRegistry.addRecipe(new ItemStack(General.SapphireBrick, 4), new Object[]{
"XCC",
"XCC",
"XXX",
'C', General.Sapphire
});


//Creates Topaz Brick
GameRegistry.addRecipe(new ItemStack(General.TopazBrick, 4), new Object[]{
"XXX",
"XCC",
"XCC",
'C', General.Topaz
});
GameRegistry.addRecipe(new ItemStack(General.TopazBrick, 4), new Object[]{
"XXX",
"CCX",
"CCX",
'C', General.Topaz
});
GameRegistry.addRecipe(new ItemStack(General.TopazBrick, 4), new Object[]{
"CCX",
"CCX",
"XXX",
'C', General.Topaz
});
GameRegistry.addRecipe(new ItemStack(General.TopazBrick, 4), new Object[]{
"XCC",
"XCC",
"XXX",
'C', General.Topaz
});
		
		
//              Adds Smelting Recipes For the Ores
		FurnaceRecipes.smelting().addSmelting(General.RubyOre.blockID, 0, new ItemStack(General.Ruby), 0.6F);
		FurnaceRecipes.smelting().addSmelting(General.SapphireOre.blockID, 0, new ItemStack(General.Sapphire), 0.6F);
		FurnaceRecipes.smelting().addSmelting(General.RubyBrick.blockID, 0, new ItemStack(General.Ruby, 2), 0F);
		FurnaceRecipes.smelting().addSmelting(General.SapphireBrick.blockID, 0, new ItemStack(General.Sapphire, 2), 0F);
		
		
    }
}
