package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.WoodFenceGate;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockFenceGate {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_FENCE_GATE = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // FENCE_GATE
    // PLANK FENCE GATE
    public static final RegistryObject<Block> BLACK_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("black_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> BLUE_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("blue_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> BROWN_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("brown_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> CYAN_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("cyan_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> GRAY_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("gray_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> GREEN_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("green_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("light_blue_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("light_gray_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> LIME_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("lime_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> MAGENTA_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("magenta_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> ORANGE_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("orange_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> PINK_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("pink_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> PURPLE_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("purple_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> RED_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("red_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> WHITE_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("white_plank_fence_gate", WoodFenceGate::new);
    public static final RegistryObject<Block> YELLOW_PLANK_FENCE_GATE = BLOCK_FENCE_GATE.register("yellow_plank_fence_gate", WoodFenceGate::new);

}
