package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PaperBlock extends Block {
    // func_235861_h_  -> setRequiresTool
    public PaperBlock() {
        super(Properties.create(Material.WOOL)
                .hardnessAndResistance(0.8F)
                .sound(SoundType.CLOTH)
                .harvestLevel(0));
    }
}
