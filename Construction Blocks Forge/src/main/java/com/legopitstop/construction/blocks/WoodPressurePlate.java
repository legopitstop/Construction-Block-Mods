package com.legopitstop.construction.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoodPressurePlate extends PressurePlateBlock {
    public WoodPressurePlate() {
        super(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD)
                .hardnessAndResistance(0.5f)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .doesNotBlockMovement());
    }
}
