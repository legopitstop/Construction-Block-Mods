package com.legopitstop.construction.blocks.custom;

import com.legopitstop.construction.blocks.custom.Beam;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalBeam extends Beam {
    // func_235861_h_  -> setRequiresTool
    public MetalBeam() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .notSolid());
    }
}
