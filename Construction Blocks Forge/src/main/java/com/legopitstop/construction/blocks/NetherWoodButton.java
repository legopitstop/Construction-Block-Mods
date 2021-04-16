package com.legopitstop.construction.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherWoodButton extends WoodButtonBlock {
    // field_235580_B_ -> FUNGUS
    // field_237214_y_ -> NETHER_WOOD
    public NetherWoodButton() {
        super(Properties.create(Material.NETHER_WOOD)
                .hardnessAndResistance(0.5f)
                .sound(SoundType.FUNGUS)
                .doesNotBlockMovement()
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
