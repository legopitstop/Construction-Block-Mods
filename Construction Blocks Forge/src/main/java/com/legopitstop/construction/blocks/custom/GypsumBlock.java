package com.legopitstop.construction.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GypsumBlock extends Block {
    public GypsumBlock() {
        super(Properties.create(Material.CLAY)
                .hardnessAndResistance(0.6f)
                .sound(SoundType.GROUND)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL));
    }
}
