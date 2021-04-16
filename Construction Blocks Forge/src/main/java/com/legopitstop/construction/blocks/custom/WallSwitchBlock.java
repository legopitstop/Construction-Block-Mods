package com.legopitstop.construction.blocks.custom;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class WallSwitchBlock extends LeverBlock {

    protected static final VoxelShape LEVER_NORTH_AABB = Block.makeCuboidShape(5, 4, 13, 11, 12, 19);
    protected static final VoxelShape LEVER_SOUTH_AABB = Block.makeCuboidShape(5, 4, -3, 11, 12, 3);
    protected static final VoxelShape LEVER_WEST_AABB = Block.makeCuboidShape(13, 4, 5, 19, 12, 11);
    protected static final VoxelShape LEVER_EAST_AABB = Block.makeCuboidShape(-3, 4, 5, 3, 12, 11);
    protected static final VoxelShape FLOOR_Z_SHAPE = Block.makeCuboidShape(5, -3, 4, 11, 3, 12);
    protected static final VoxelShape FLOOR_X_SHAPE = Block.makeCuboidShape(4, -3, 5, 12, 3, 11);
    protected static final VoxelShape CEILING_Z_SHAPE = Block.makeCuboidShape(5, 13, 4, 11, 19, 12);
    protected static final VoxelShape CEILING_X_SHAPE = Block.makeCuboidShape(4, 13,  5, 12, 19, 11);

    public WallSwitchBlock() {
        super(Properties.create(Material.MISCELLANEOUS)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.WOOD)
                .notSolid()
                .doesNotBlockMovement());
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACE, HORIZONTAL_FACING, POWERED);
    }
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch((AttachFace)state.get(FACE)) {
            case FLOOR:
                switch(state.get(HORIZONTAL_FACING).getAxis()) {
                    case X:
                        return FLOOR_X_SHAPE;
                    case Z:
                    default:
                        return FLOOR_Z_SHAPE;
                }
            case WALL:
                switch((Direction)state.get(HORIZONTAL_FACING)) {
                    case EAST:
                        return LEVER_EAST_AABB;
                    case WEST:
                        return LEVER_WEST_AABB;
                    case SOUTH:
                        return LEVER_SOUTH_AABB;
                    case NORTH:
                    default:
                        return LEVER_NORTH_AABB;
                }
            case CEILING:
            default:
                switch(state.get(HORIZONTAL_FACING).getAxis()) {
                    case X:
                        return CEILING_X_SHAPE;
                    case Z:
                    default:
                        return CEILING_Z_SHAPE;
                }
        }
    }
}