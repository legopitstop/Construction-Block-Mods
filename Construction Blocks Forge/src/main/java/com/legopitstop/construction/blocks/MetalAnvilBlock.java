package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalAnvilBlock extends Block {
    // func_235861_h_  -> setRequiresTool
    public MetalAnvilBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 1200.0F)
                .sound(SoundType.ANVIL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
