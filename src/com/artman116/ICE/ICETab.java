package com.artman116.ICE;

import net.minecraft.creativetab.CreativeTabs;

public class ICETab extends CreativeTabs {
public ICETab(int id, String name) {
super(id, name);
}

@Override
public int getTabIconItemIndex() {
return General.Ruby.itemID;
}
}