package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoolBlock extends Block {
    public WoolBlock() {
        super(Properties.create(Material.WOOL)
                .hardnessAndResistance(0.8F)
                .sound(SoundType.CLOTH)
                .harvestLevel(0));
    }
}
