package com.legopitstop.construction.blocks.custom;

import net.minecraft.block.GrassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ConstGrassBlock extends GrassBlock {
    public ConstGrassBlock() {
        super(Properties.create(Material.ORGANIC)
                .hardnessAndResistance(0.6f)
                .sound(SoundType.PLANT)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
                .tickRandomly());
    }
}
