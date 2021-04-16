package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StoneColmn extends RotatedPillarBlock {
    // func_235861_h_  -> setRequiresTool
    public StoneColmn() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(1.5f,6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
