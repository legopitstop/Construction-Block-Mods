package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherWoodBlock extends Block {
    // field_235580_B_ -> FUNGUS
    // field_237214_y_ -> NETHER_WOOD
    public NetherWoodBlock() {
        super(Properties.create(Material.NETHER_WOOD)
                .hardnessAndResistance(2f,3f)
                .sound(SoundType.FUNGUS)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
