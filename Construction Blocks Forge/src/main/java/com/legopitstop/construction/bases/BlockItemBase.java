package com.legopitstop.construction.bases;

import com.legopitstop.construction.ConstructionMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ConstructionMod.TAB_BLOCKS)); }
}