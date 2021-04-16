package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalNetheriteBlock extends Block {
    // func_235861_h_  -> setRequiresTool
    public MetalNetheriteBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5f,6f)
                .sound(SoundType.NETHERITE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
