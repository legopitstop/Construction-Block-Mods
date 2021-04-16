package com.legopitstop.construction.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SheetrockWall extends WallBlock {
    // func_235861_h_  -> setRequiresTool
    public SheetrockWall() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0.6f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
