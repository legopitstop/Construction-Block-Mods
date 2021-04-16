package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.StoneStairs;
import com.legopitstop.construction.blocks.WoodStairs;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockStairs {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_STAIRS = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // STAIRS
    // CELINGTILE STAIRS
    public static final RegistryObject<Block> BLACK_CELINGTILE_STAIRS = BLOCK_STAIRS.register("black_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> BLUE_CELINGTILE_STAIRS = BLOCK_STAIRS.register("blue_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> BROWN_CELINGTILE_STAIRS = BLOCK_STAIRS.register("brown_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> CYAN_CELINGTILE_STAIRS = BLOCK_STAIRS.register("cyan_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> GRAY_CELINGTILE_STAIRS = BLOCK_STAIRS.register("gray_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> GREEN_CELINGTILE_STAIRS = BLOCK_STAIRS.register("green_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CELINGTILE_STAIRS = BLOCK_STAIRS.register("light_blue_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CELINGTILE_STAIRS = BLOCK_STAIRS.register("light_gray_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> LIME_CELINGTILE_STAIRS = BLOCK_STAIRS.register("lime_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> MAGENTA_CELINGTILE_STAIRS = BLOCK_STAIRS.register("magenta_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> ORANGE_CELINGTILE_STAIRS = BLOCK_STAIRS.register("orange_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> PINK_CELINGTILE_STAIRS = BLOCK_STAIRS.register("pink_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> PURPLE_CELINGTILE_STAIRS = BLOCK_STAIRS.register("purple_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> RED_CELINGTILE_STAIRS = BLOCK_STAIRS.register("red_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> WHITE_CELINGTILE_STAIRS = BLOCK_STAIRS.register("white_celingtile_stairs", WoodStairs::new);
    public static final RegistryObject<Block> YELLOW_CELINGTILE_STAIRS = BLOCK_STAIRS.register("yellow_celingtile_stairs", WoodStairs::new);
    // PLANK STAIRS
    public static final RegistryObject<Block> BLACK_PLANK_STAIRS = BLOCK_STAIRS.register("black_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> BLUE_PLANK_STAIRS = BLOCK_STAIRS.register("blue_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> BROWN_PLANK_STAIRS = BLOCK_STAIRS.register("brown_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> CYAN_PLANK_STAIRS = BLOCK_STAIRS.register("cyan_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> GRAY_PLANK_STAIRS = BLOCK_STAIRS.register("gray_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> GREEN_PLANK_STAIRS = BLOCK_STAIRS.register("green_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANK_STAIRS = BLOCK_STAIRS.register("light_blue_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANK_STAIRS = BLOCK_STAIRS.register("light_gray_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> LIME_PLANK_STAIRS = BLOCK_STAIRS.register("lime_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> MAGENTA_PLANK_STAIRS = BLOCK_STAIRS.register("magenta_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> ORANGE_PLANK_STAIRS = BLOCK_STAIRS.register("orange_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> PINK_PLANK_STAIRS = BLOCK_STAIRS.register("pink_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> PURPLE_PLANK_STAIRS = BLOCK_STAIRS.register("purple_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> RED_PLANK_STAIRS = BLOCK_STAIRS.register("red_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> WHITE_PLANK_STAIRS = BLOCK_STAIRS.register("white_plank_stairs", WoodStairs::new);
    public static final RegistryObject<Block> YELLOW_PLANK_STAIRS = BLOCK_STAIRS.register("yellow_plank_stairs", WoodStairs::new);
    // CONCRETE_SMALL_BRICK STAIRS
    public static final RegistryObject<Block> BLACK_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("black_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("blue_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("brown_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("cyan_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("gray_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("green_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("light_blue_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("light_gray_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIME_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("lime_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("magenta_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("orange_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PINK_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("pink_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("purple_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> RED_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("red_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("white_concrete_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("yellow_concrete_small_brick_stairs", StoneStairs::new);
    // CONCRETE_LARGE_BRICK STAIRS
    public static final RegistryObject<Block> BLACK_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("black_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("blue_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("brown_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("cyan_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("gray_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("green_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("light_blue_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("light_gray_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIME_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("lime_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("magenta_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("orange_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PINK_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("pink_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("purple_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> RED_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("red_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("white_concrete_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("yellow_concrete_large_brick_stairs", StoneStairs::new);
    // BRICK STAIRS
    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = BLOCK_STAIRS.register("black_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BLUE_BRICK_STAIRS = BLOCK_STAIRS.register("blue_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BROWN_BRICK_STAIRS = BLOCK_STAIRS.register("brown_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> CYAN_BRICK_STAIRS = BLOCK_STAIRS.register("cyan_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GRAY_BRICK_STAIRS = BLOCK_STAIRS.register("gray_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GREEN_BRICK_STAIRS = BLOCK_STAIRS.register("green_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_STAIRS = BLOCK_STAIRS.register("light_blue_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_STAIRS = BLOCK_STAIRS.register("light_gray_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIME_BRICK_STAIRS = BLOCK_STAIRS.register("lime_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> MAGENTA_BRICK_STAIRS = BLOCK_STAIRS.register("magenta_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> ORANGE_BRICK_STAIRS = BLOCK_STAIRS.register("orange_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PINK_BRICK_STAIRS = BLOCK_STAIRS.register("pink_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PURPLE_BRICK_STAIRS = BLOCK_STAIRS.register("purple_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> RED_BRICK_STAIRS = BLOCK_STAIRS.register("red_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = BLOCK_STAIRS.register("white_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> YELLOW_BRICK_STAIRS = BLOCK_STAIRS.register("yellow_brick_stairs", StoneStairs::new);

    // Aged Brick Stairs
    public static final RegistryObject<Block> AGED_BRICK_STAIRS = BLOCK_STAIRS.register("aged_brick_stairs", StoneStairs::new);
    // AGED_BRICK STAIRS
    public static final RegistryObject<Block> BLACK_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("black_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BLUE_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("blue_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BROWN_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("brown_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> CYAN_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("cyan_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GRAY_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("gray_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GREEN_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("green_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("light_blue_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("light_gray_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIME_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("lime_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> MAGENTA_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("magenta_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> ORANGE_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("orange_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PINK_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("pink_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PURPLE_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("purple_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> RED_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("red_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> WHITE_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("white_aged_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> YELLOW_AGED_BRICK_STAIRS = BLOCK_STAIRS.register("yellow_aged_brick_stairs", StoneStairs::new);
    // TERRACOTTA_SMALL_BRICK STAIRS
    public static final RegistryObject<Block> TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("black_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("blue_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("brown_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("cyan_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("gray_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("green_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("light_blue_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("light_gray_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("lime_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("magenta_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("orange_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("pink_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("purple_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("red_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("white_terracotta_small_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SMALL_BRICK_STAIRS = BLOCK_STAIRS.register("yellow_terracotta_small_brick_stairs", StoneStairs::new);
    // TERRACOTTA_LARGE_BRICK STAIRS
    public static final RegistryObject<Block> BLACK_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("black_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("blue_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("brown_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("cyan_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("gray_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("green_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("light_blue_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("light_gray_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("lime_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("magenta_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("orange_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("pink_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("purple_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("red_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("white_terracotta_large_brick_stairs", StoneStairs::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_LARGE_BRICK_STAIRS = BLOCK_STAIRS.register("yellow_terracotta_large_brick_stairs", StoneStairs::new);

}
