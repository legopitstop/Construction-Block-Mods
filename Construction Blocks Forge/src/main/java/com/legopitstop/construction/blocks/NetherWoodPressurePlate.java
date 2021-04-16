package com.legopitstop.construction.blocks;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherWoodPressurePlate extends PressurePlateBlock {
    // field_235580_B_ -> FUNGUS
    // field_237214_y_ -> NETHER_WOOD
    public NetherWoodPressurePlate() {
        super(Sensitivity.EVERYTHING, Properties.create(Material.NETHER_WOOD)
                .hardnessAndResistance(0.5f)
                .sound(SoundType.FUNGUS)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .doesNotBlockMovement());
    }
}
