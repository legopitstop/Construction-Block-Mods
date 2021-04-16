package com.legopitstop.construction.blocks.scaffolding;

import net.minecraft.block.ScaffoldingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WoodScaffolding extends ScaffoldingBlock {
    // func_235861_h_  -> setRequiresTool
    public WoodScaffolding() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2f,3f)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .notSolid()
                .doesNotBlockMovement()
                .variableOpacity());
    }
}
