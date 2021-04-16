package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoodButton extends WoodButtonBlock {
    public WoodButton() {
        super(Properties.create(Material.MISCELLANEOUS)
                .hardnessAndResistance(0.5f)
                .sound(SoundType.WOOD)
                .doesNotBlockMovement()
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
