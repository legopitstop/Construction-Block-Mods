package com.legopitstop.construction.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StoneButton extends StoneButtonBlock {
    // func_235861_h_  -> setRequiresTool
    public StoneButton() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.25f,4.2f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .doesNotBlockMovement());
    }
}
