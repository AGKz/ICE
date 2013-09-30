package com.artman116.ICE;

import com.artman116.ICE.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class RubyBrick extends Block
{
       public RubyBrick(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setResistance(1.0F);
             this.setHardness(2.0F);
             this.setCreativeTab(General.ExtrasTab);
       }
      @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
}