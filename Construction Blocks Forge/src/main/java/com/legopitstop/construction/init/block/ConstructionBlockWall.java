package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.SheetrockWall;
import com.legopitstop.construction.blocks.StoneWall;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockWall {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_WALL = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // WALL
    // CONCRETE_SMALL_BRICK WALL
    public static final RegistryObject<Block> BLACK_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("black_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("blue_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("brown_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("cyan_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("gray_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("green_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("light_blue_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("light_gray_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIME_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("lime_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("magenta_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("orange_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PINK_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("pink_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("purple_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> RED_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("red_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("white_concrete_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SMALL_BRICK_WALL = BLOCK_WALL.register("yellow_concrete_small_brick_wall", StoneWall::new);
    // CONCRETE_LARGE_BRICK WALL
    public static final RegistryObject<Block> BLACK_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("black_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("blue_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("brown_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("cyan_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("gray_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("green_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("light_blue_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("light_gray_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIME_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("lime_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("magenta_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("orange_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PINK_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("pink_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("purple_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> RED_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("red_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("white_concrete_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_LARGE_BRICK_WALL = BLOCK_WALL.register("yellow_concrete_large_brick_wall", StoneWall::new);
    // BRICK WALL
    public static final RegistryObject<Block> BLACK_BRICK_WALL = BLOCK_WALL.register("black_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLUE_BRICK_WALL = BLOCK_WALL.register("blue_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BROWN_BRICK_WALL = BLOCK_WALL.register("brown_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> CYAN_BRICK_WALL = BLOCK_WALL.register("cyan_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GRAY_BRICK_WALL = BLOCK_WALL.register("gray_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GREEN_BRICK_WALL = BLOCK_WALL.register("green_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_WALL = BLOCK_WALL.register("light_blue_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_WALL = BLOCK_WALL.register("light_gray_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIME_BRICK_WALL = BLOCK_WALL.register("lime_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> MAGENTA_BRICK_WALL = BLOCK_WALL.register("magenta_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> ORANGE_BRICK_WALL = BLOCK_WALL.register("orange_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PINK_BRICK_WALL = BLOCK_WALL.register("pink_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PURPLE_BRICK_WALL = BLOCK_WALL.register("purple_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> RED_BRICK_WALL = BLOCK_WALL.register("red_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> WHITE_BRICK_WALL = BLOCK_WALL.register("white_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> YELLOW_BRICK_WALL = BLOCK_WALL.register("yellow_brick_wall", StoneWall::new);

    // Aged Brick Wall
    public static final RegistryObject<Block> AGED_BRICK_WALL = BLOCK_WALL.register("aged_brick_wall", StoneWall::new);
    // AGED_BRICK WALL
    public static final RegistryObject<Block> BLACK_AGED_BRICK_WALL = BLOCK_WALL.register("black_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLUE_AGED_BRICK_WALL = BLOCK_WALL.register("blue_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BROWN_AGED_BRICK_WALL = BLOCK_WALL.register("brown_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> CYAN_AGED_BRICK_WALL = BLOCK_WALL.register("cyan_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GRAY_AGED_BRICK_WALL = BLOCK_WALL.register("gray_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GREEN_AGED_BRICK_WALL = BLOCK_WALL.register("green_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_BLUE_AGED_BRICK_WALL = BLOCK_WALL.register("light_blue_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_GRAY_AGED_BRICK_WALL = BLOCK_WALL.register("light_gray_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIME_AGED_BRICK_WALL = BLOCK_WALL.register("lime_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> MAGENTA_AGED_BRICK_WALL = BLOCK_WALL.register("magenta_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> ORANGE_AGED_BRICK_WALL = BLOCK_WALL.register("orange_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PINK_AGED_BRICK_WALL = BLOCK_WALL.register("pink_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PURPLE_AGED_BRICK_WALL = BLOCK_WALL.register("purple_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> RED_AGED_BRICK_WALL = BLOCK_WALL.register("red_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> WHITE_AGED_BRICK_WALL = BLOCK_WALL.register("white_aged_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> YELLOW_AGED_BRICK_WALL = BLOCK_WALL.register("yellow_aged_brick_wall", StoneWall::new);
    // TERRACOTTA_SMALL_BRICK WALL
    public static final RegistryObject<Block> TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("black_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("blue_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("brown_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("cyan_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("gray_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("green_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("light_blue_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("light_gray_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("lime_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("magenta_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("orange_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("pink_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("purple_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("red_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("white_terracotta_small_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SMALL_BRICK_WALL = BLOCK_WALL.register("yellow_terracotta_small_brick_wall", StoneWall::new);
    // TERRACOTTA_LARGE_BRICK WALL
    public static final RegistryObject<Block> TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("black_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("blue_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("brown_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("cyan_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("gray_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("green_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("light_blue_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("light_gray_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("lime_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("magenta_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("orange_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("pink_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("purple_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("red_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("white_terracotta_large_brick_wall", StoneWall::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_LARGE_BRICK_WALL = BLOCK_WALL.register("yellow_terracotta_large_brick_wall", StoneWall::new);
    // SHEETROCK_WALL
    public static final RegistryObject<Block> SHEETROCK_WALL = BLOCK_WALL.register("sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> BLACK_SHEETROCK_WALL = BLOCK_WALL.register("black_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> BLUE_SHEETROCK_WALL = BLOCK_WALL.register("blue_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> BROWN_SHEETROCK_WALL = BLOCK_WALL.register("brown_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> CYAN_SHEETROCK_WALL = BLOCK_WALL.register("cyan_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> GRAY_SHEETROCK_WALL = BLOCK_WALL.register("gray_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> GREEN_SHEETROCK_WALL = BLOCK_WALL.register("green_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> LIGHT_BLUE_SHEETROCK_WALL = BLOCK_WALL.register("light_blue_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> LIGHT_GRAY_SHEETROCK_WALL = BLOCK_WALL.register("light_gray_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> LIME_SHEETROCK_WALL = BLOCK_WALL.register("lime_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> MAGENTA_SHEETROCK_WALL = BLOCK_WALL.register("magenta_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> ORANGE_SHEETROCK_WALL = BLOCK_WALL.register("orange_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> PINK_SHEETROCK_WALL = BLOCK_WALL.register("pink_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> PURPLE_SHEETROCK_WALL = BLOCK_WALL.register("purple_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> RED_SHEETROCK_WALL = BLOCK_WALL.register("red_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> WHITE_SHEETROCK_WALL = BLOCK_WALL.register("white_sheetrock_wall", SheetrockWall::new);
    public static final RegistryObject<Block> YELLOW_SHEETROCK_WALL = BLOCK_WALL.register("yellow_sheetrock_wall", SheetrockWall::new);

}
