package com.legopitstop.construction.blocks;

import com.legopitstop.construction.init.ConstructionSoundType;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CelingTileBlock extends Block {
    // func_235861_h_  -> setRequiresTool
    public CelingTileBlock() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0.8F)
                .sound(ConstructionSoundType.CELINGTILE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
