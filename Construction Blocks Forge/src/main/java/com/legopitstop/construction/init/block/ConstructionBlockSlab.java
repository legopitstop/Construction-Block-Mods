package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.CelingTileSlab;
import com.legopitstop.construction.blocks.StoneSlab;
import com.legopitstop.construction.blocks.WoodSlab;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockSlab {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_SLAB = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // SLABS
    // CELINGTILE SLAB
    public static final RegistryObject<Block> BLACK_CELINGTILE_SLAB = BLOCK_SLAB.register("black_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> BLUE_CELINGTILE_SLAB = BLOCK_SLAB.register("blue_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> BROWN_CELINGTILE_SLAB = BLOCK_SLAB.register("brown_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> CYAN_CELINGTILE_SLAB = BLOCK_SLAB.register("cyan_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> GRAY_CELINGTILE_SLAB = BLOCK_SLAB.register("gray_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> GREEN_CELINGTILE_SLAB = BLOCK_SLAB.register("green_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CELINGTILE_SLAB = BLOCK_SLAB.register("light_blue_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CELINGTILE_SLAB = BLOCK_SLAB.register("light_gray_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> LIME_CELINGTILE_SLAB = BLOCK_SLAB.register("lime_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> MAGENTA_CELINGTILE_SLAB = BLOCK_SLAB.register("magenta_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> ORANGE_CELINGTILE_SLAB = BLOCK_SLAB.register("orange_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> PINK_CELINGTILE_SLAB = BLOCK_SLAB.register("pink_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> PURPLE_CELINGTILE_SLAB = BLOCK_SLAB.register("purple_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> RED_CELINGTILE_SLAB = BLOCK_SLAB.register("red_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> WHITE_CELINGTILE_SLAB = BLOCK_SLAB.register("white_celingtile_slab", CelingTileSlab::new);
    public static final RegistryObject<Block> YELLOW_CELINGTILE_SLAB = BLOCK_SLAB.register("yellow_celingtile_slab", CelingTileSlab::new);
    // PLANK SLAB
    public static final RegistryObject<Block> BLACK_PLANK_SLAB = BLOCK_SLAB.register("black_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> BLUE_PLANK_SLAB = BLOCK_SLAB.register("blue_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> BROWN_PLANK_SLAB = BLOCK_SLAB.register("brown_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> CYAN_PLANK_SLAB = BLOCK_SLAB.register("cyan_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> GRAY_PLANK_SLAB = BLOCK_SLAB.register("gray_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> GREEN_PLANK_SLAB = BLOCK_SLAB.register("green_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANK_SLAB = BLOCK_SLAB.register("light_blue_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANK_SLAB = BLOCK_SLAB.register("light_gray_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> LIME_PLANK_SLAB = BLOCK_SLAB.register("lime_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> MAGENTA_PLANK_SLAB = BLOCK_SLAB.register("magenta_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> ORANGE_PLANK_SLAB = BLOCK_SLAB.register("orange_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> PINK_PLANK_SLAB = BLOCK_SLAB.register("pink_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> PURPLE_PLANK_SLAB = BLOCK_SLAB.register("purple_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> RED_PLANK_SLAB = BLOCK_SLAB.register("red_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> WHITE_PLANK_SLAB = BLOCK_SLAB.register("white_plank_slab", WoodSlab::new);
    public static final RegistryObject<Block> YELLOW_PLANK_SLAB = BLOCK_SLAB.register("yellow_plank_slab", WoodSlab::new);
    // CONCRETE_SMALL_BRICK SLAB
    public static final RegistryObject<Block> BLACK_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("black_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("blue_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("brown_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("cyan_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("gray_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("green_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("light_blue_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("light_gray_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIME_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("lime_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("magenta_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("orange_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PINK_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("pink_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("purple_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> RED_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("red_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("white_concrete_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SMALL_BRICK_SLAB = BLOCK_SLAB.register("yellow_concrete_small_brick_slab", StoneSlab::new);
    // CONCRETE_LARGE_BRICK SLAB
    public static final RegistryObject<Block> BLACK_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("black_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("blue_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("brown_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("cyan_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("gray_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("green_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("light_blue_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("light_gray_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIME_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("lime_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("magenta_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("orange_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PINK_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("pink_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("purple_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> RED_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("red_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("white_concrete_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_LARGE_BRICK_SLAB = BLOCK_SLAB.register("yellow_concrete_large_brick_slab", StoneSlab::new);
    // BRICK SLAB
    public static final RegistryObject<Block> BLACK_BRICK_SLAB = BLOCK_SLAB.register("black_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLUE_BRICK_SLAB = BLOCK_SLAB.register("blue_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BROWN_BRICK_SLAB = BLOCK_SLAB.register("brown_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> CYAN_BRICK_SLAB = BLOCK_SLAB.register("cyan_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GRAY_BRICK_SLAB = BLOCK_SLAB.register("gray_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GREEN_BRICK_SLAB = BLOCK_SLAB.register("green_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_SLAB = BLOCK_SLAB.register("light_blue_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB = BLOCK_SLAB.register("light_gray_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIME_BRICK_SLAB = BLOCK_SLAB.register("lime_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> MAGENTA_BRICK_SLAB = BLOCK_SLAB.register("magenta_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> ORANGE_BRICK_SLAB = BLOCK_SLAB.register("orange_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PINK_BRICK_SLAB = BLOCK_SLAB.register("pink_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PURPLE_BRICK_SLAB = BLOCK_SLAB.register("purple_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> RED_BRICK_SLAB = BLOCK_SLAB.register("red_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> WHITE_BRICK_SLAB = BLOCK_SLAB.register("white_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> YELLOW_BRICK_SLAB = BLOCK_SLAB.register("yellow_brick_slab", StoneSlab::new);

    // Aged Brick Slab
    public static final RegistryObject<Block> AGED_BRICK_SLAB = BLOCK_SLAB.register("aged_brick_slab", StoneSlab::new);
    // AGED_BRICK SLAB
    public static final RegistryObject<Block> BLACK_AGED_BRICK_SLAB = BLOCK_SLAB.register("black_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLUE_AGED_BRICK_SLAB = BLOCK_SLAB.register("blue_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BROWN_AGED_BRICK_SLAB = BLOCK_SLAB.register("brown_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> CYAN_AGED_BRICK_SLAB = BLOCK_SLAB.register("cyan_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GRAY_AGED_BRICK_SLAB = BLOCK_SLAB.register("gray_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GREEN_AGED_BRICK_SLAB = BLOCK_SLAB.register("green_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_AGED_BRICK_SLAB = BLOCK_SLAB.register("light_blue_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_AGED_BRICK_SLAB = BLOCK_SLAB.register("light_gray_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIME_AGED_BRICK_SLAB = BLOCK_SLAB.register("lime_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> MAGENTA_AGED_BRICK_SLAB = BLOCK_SLAB.register("magenta_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> ORANGE_AGED_BRICK_SLAB = BLOCK_SLAB.register("orange_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PINK_AGED_BRICK_SLAB = BLOCK_SLAB.register("pink_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PURPLE_AGED_BRICK_SLAB = BLOCK_SLAB.register("purple_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> RED_AGED_BRICK_SLAB = BLOCK_SLAB.register("red_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> WHITE_AGED_BRICK_SLAB = BLOCK_SLAB.register("white_aged_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> YELLOW_AGED_BRICK_SLAB = BLOCK_SLAB.register("yellow_aged_brick_slab", StoneSlab::new);
    // TERRACOTTA_SMALL_BRICK SLAB
    public static final RegistryObject<Block> TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("black_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("blue_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("brown_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("cyan_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("gray_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("green_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("light_blue_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("light_gray_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("lime_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("magenta_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("orange_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("pink_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("purple_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("red_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("white_terracotta_small_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SMALL_BRICK_SLAB = BLOCK_SLAB.register("yellow_terracotta_small_brick_slab", StoneSlab::new);
    // TERRACOTTA_LARGE_BRICK SLAB
    public static final RegistryObject<Block> TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("black_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("blue_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("brown_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("cyan_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("gray_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("green_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("light_blue_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("light_gray_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("lime_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("magenta_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("orange_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("pink_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("purple_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("red_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("white_terracotta_large_brick_slab", StoneSlab::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_LARGE_BRICK_SLAB = BLOCK_SLAB.register("yellow_terracotta_large_brick_slab", StoneSlab::new);

}
