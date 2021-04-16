package com.legopitstop.construction.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFaceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class NailedBlock extends HorizontalFaceBlock {
    // This file is Similar to NailBlock except the Voxel Shape is moved
    // shares similar properties to StoneButtonBlock except their is no powered state

    protected static final VoxelShape FACING_CEILING_X = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    protected static final VoxelShape FACING_CEILING_Z = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    protected static final VoxelShape FACING_FLOOR_X = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    protected static final VoxelShape FACING_FLOOR_Z = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    protected static final VoxelShape FACING_SOUTH = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    protected static final VoxelShape FACING_NORTH = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    protected static final VoxelShape FACING_EAST = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    protected static final VoxelShape FACING_WEST = Stream.of(
            Block.makeCuboidShape(7.5, -3.5, 7.5, 8.5, -0.5, 8.5), Block.makeCuboidShape(6.5, -0.5, 6.5, 9.5, 0.5, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public NailedBlock() {
        super(Properties.create(Material.IRON)
                .zeroHardnessAndResistance()
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .notSolid()
                .doesNotBlockMovement());
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.get(HORIZONTAL_FACING);
        switch ((AttachFace) state.get(FACE)) {
            case FLOOR:
                if (direction.getAxis() == Direction.Axis.X) {
                    return FACING_FLOOR_X;
                }

                return FACING_FLOOR_Z;
            case WALL:
                switch (direction) {
                    case EAST:
                        return FACING_EAST;
                    case WEST:
                        return FACING_WEST;
                    case SOUTH:
                        return FACING_SOUTH;
                    case NORTH:
                    default:
                        return FACING_NORTH;
                }
            case CEILING:
            default:
                if (direction.getAxis() == Direction.Axis.X) {
                    return FACING_CEILING_X;
                } else {
                    return FACING_CEILING_Z;
                }
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, FACE);
    }
}