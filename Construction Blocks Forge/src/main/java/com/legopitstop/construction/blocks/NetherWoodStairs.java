package com.legopitstop.construction.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherWoodStairs extends StairsBlock {
    // field_235344_mC_ -> CRIMSON_PLANKS
    // field_235580_B_ -> FUNGUS
    // field_237214_y_ -> NETHER_WOOD
    public NetherWoodStairs() {
        super(Blocks.CRIMSON_PLANKS.getDefaultState(),Properties.create(Material.NETHER_WOOD)
                .hardnessAndResistance(2f,3f)
                .sound(SoundType.FUNGUS)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
