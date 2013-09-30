package com.artman116.ICE;

import java.util.Random;

import com.artman116.ICE.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SapphireOre extends Block
{
       public SapphireOre(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setResistance(3.0F);
             this.setHardness(5.0F);
             this.setCreativeTab(General.ExtrasTab);
       }
       
       @Override
       public int idDropped(int i, Random r, int j) {
       return General.Sapphire.itemID;
       }
       
      @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
}