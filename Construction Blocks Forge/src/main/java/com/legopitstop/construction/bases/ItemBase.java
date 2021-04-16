package com.legopitstop.construction.bases;

import com.legopitstop.construction.ConstructionMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ConstructionMod.TAB_ITEMS));
    }
}