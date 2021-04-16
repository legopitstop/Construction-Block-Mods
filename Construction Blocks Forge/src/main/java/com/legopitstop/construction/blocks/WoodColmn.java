package com.legopitstop.construction.blocks;

import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoodColmn extends RotatedPillarBlock {
    public WoodColmn() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2f)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
