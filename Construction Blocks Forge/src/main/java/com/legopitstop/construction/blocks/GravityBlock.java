package com.legopitstop.construction.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class GravityBlock extends SandBlock {
    public GravityBlock() {
        super(14406560,AbstractBlock.Properties.create(Material.SAND, DyeColor.YELLOW)
                .hardnessAndResistance(1.25f,4.2f)
                .sound(SoundType.SAND)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL));
    }
}
