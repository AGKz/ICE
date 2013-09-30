package com.artman116.ICE;

import com.artman116.ICE.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class TopazPickaxe extends ItemPickaxe
{
       
       public TopazPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
       {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(General.ExtrasTab);
       }
       
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister par1IconRegister)
       {
           this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
       }
       
}

