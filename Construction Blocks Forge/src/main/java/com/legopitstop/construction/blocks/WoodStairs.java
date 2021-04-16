package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoodStairs extends StairsBlock {
    public WoodStairs() {
        super(Blocks.OAK_PLANKS.getDefaultState(),Properties.create(Material.WOOD)
                .hardnessAndResistance(2f,3f)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
