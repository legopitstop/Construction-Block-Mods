package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.WoodFence;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockFence {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_FENCE = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // FENCE
    // PLANK FENCE
    public static final RegistryObject<Block> BLACK_PLANK_FENCE = BLOCK_FENCE.register("black_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> BLUE_PLANK_FENCE = BLOCK_FENCE.register("blue_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> BROWN_PLANK_FENCE = BLOCK_FENCE.register("brown_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> CYAN_PLANK_FENCE = BLOCK_FENCE.register("cyan_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> GRAY_PLANK_FENCE = BLOCK_FENCE.register("gray_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> GREEN_PLANK_FENCE = BLOCK_FENCE.register("green_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANK_FENCE = BLOCK_FENCE.register("light_blue_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANK_FENCE = BLOCK_FENCE.register("light_gray_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> LIME_PLANK_FENCE = BLOCK_FENCE.register("lime_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> MAGENTA_PLANK_FENCE = BLOCK_FENCE.register("magenta_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> ORANGE_PLANK_FENCE = BLOCK_FENCE.register("orange_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> PINK_PLANK_FENCE = BLOCK_FENCE.register("pink_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> PURPLE_PLANK_FENCE = BLOCK_FENCE.register("purple_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> RED_PLANK_FENCE = BLOCK_FENCE.register("red_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> WHITE_PLANK_FENCE = BLOCK_FENCE.register("white_plank_fence", WoodFence::new);
    public static final RegistryObject<Block> YELLOW_PLANK_FENCE = BLOCK_FENCE.register("yellow_plank_fence", WoodFence::new);

}
