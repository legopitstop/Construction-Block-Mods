package com.legopitstop.construction.blocks;

import com.legopitstop.construction.init.ConstructionSoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CelingTileSlab extends SlabBlock {
    public CelingTileSlab() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0.8F)
                .sound(ConstructionSoundType.CELINGTILE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
