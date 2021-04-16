package com.legopitstop.construction.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.common.ToolType;

import java.util.function.ToIntFunction;

public class RedstoneLamp extends RedstoneLampBlock {

    public RedstoneLamp() {
        super(Properties.create(Material.REDSTONE_LIGHT)
                .hardnessAndResistance(0.3f)
                .sound(SoundType.GLASS)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .setLightLevel(getLightLevelLit(15)));
    }
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    private static ToIntFunction<BlockState> getLightLevelLit(int p_235420_0_) {
        return (p_235421_1_) -> {
            return p_235421_1_.get(BlockStateProperties.LIT) ? p_235420_0_ : 0;
        };
    }
}
