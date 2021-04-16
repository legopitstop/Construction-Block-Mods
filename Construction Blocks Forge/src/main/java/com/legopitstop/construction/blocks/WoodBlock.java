package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoodBlock extends Block {
    // func_235861_h_  -> setRequiresTool
    public WoodBlock() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2f,3f)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
