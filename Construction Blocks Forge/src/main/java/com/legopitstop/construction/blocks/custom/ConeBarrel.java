package com.legopitstop.construction.blocks.custom;

import com.legopitstop.construction.init.ConstructionSoundType;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class ConeBarrel extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    // voxel shape - block hitbox
    private static final VoxelShape SHAPE_N = Block.makeCuboidShape(0, 0, 0, 16, 21, 16);
    private static final VoxelShape SHAPE_E = Block.makeCuboidShape(0, 0, 0, 16, 21, 16);
    private static final VoxelShape SHAPE_S = Block.makeCuboidShape(0, 0, 0, 16, 21, 16);
    private static final VoxelShape SHAPE_W = Block.makeCuboidShape(0, 0, 0, 16, 21, 16);

    public ConeBarrel() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3.5f,4.0f)
                .sound(ConstructionSoundType.CONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .notSolid());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    // makes block rotate
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn){
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6f;
    }

    // LIQUID for vanilla liquids, INVISIBLE to skip all rendering
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

}
