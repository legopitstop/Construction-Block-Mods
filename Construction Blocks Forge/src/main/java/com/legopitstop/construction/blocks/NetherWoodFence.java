package com.legopitstop.construction.blocks;

import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherWoodFence extends FenceBlock {
    // field_235580_B_ -> FUNGUS
    // field_237214_y_ -> NETHER_WOOD
    public NetherWoodFence() {
        super(Properties.create(Material.NETHER_WOOD)
                .hardnessAndResistance(2.0F, 3.0F)
                .sound(SoundType.FUNGUS)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
