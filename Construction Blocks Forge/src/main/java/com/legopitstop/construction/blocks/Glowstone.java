package com.legopitstop.construction.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Glowstone extends Block {
    // func_235861_h_  -> setRequiresTool
    public Glowstone() {
        super(Properties.create(Material.GLASS)
                .hardnessAndResistance(0.3f)
                .sound(SoundType.GLASS)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .setLightLevel((state) -> { return 15; }));
    }
}
