package com.legopitstop.construction.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StonePressurePlate extends PressurePlateBlock {
    // func_235861_h_  -> setRequiresTool
    public StonePressurePlate() {
        super(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(0.5f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .doesNotBlockMovement());
    }
}
