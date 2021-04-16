package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.StonePressurePlate;
import com.legopitstop.construction.blocks.WoodPressurePlate;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockPressurePlate {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_PRESSURE_PLATE = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // PRESSURE_PLATE
    // PLANK PRESSURE_PLATE
    public static final RegistryObject<Block> BLACK_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("black_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> BLUE_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("blue_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> BROWN_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("brown_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> CYAN_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("cyan_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> GRAY_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("gray_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> GREEN_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("green_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_blue_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_gray_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> LIME_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("lime_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> MAGENTA_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("magenta_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> ORANGE_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("orange_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> PINK_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("pink_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> PURPLE_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("purple_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> RED_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("red_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> WHITE_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("white_plank_pressure_plate", WoodPressurePlate::new);
    public static final RegistryObject<Block> YELLOW_PLANK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("yellow_plank_pressure_plate", WoodPressurePlate::new);
    // CONCRETE_SMALL_BRICK PRESSURE_PLATE
    public static final RegistryObject<Block> BLACK_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("black_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("blue_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("brown_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("cyan_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("gray_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("green_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_blue_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_gray_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIME_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("lime_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("magenta_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("orange_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PINK_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("pink_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("purple_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> RED_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("red_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("white_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("yellow_concrete_small_brick_pressure_plate", StonePressurePlate::new);
    // CONCRETE_LARGE_BRICK PRESSURE_PLATE
    public static final RegistryObject<Block> BLACK_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("black_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("blue_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("brown_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("cyan_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("gray_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("green_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_blue_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_gray_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIME_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("lime_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("magenta_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("orange_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PINK_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("pink_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("purple_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> RED_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("red_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("white_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("yellow_concrete_large_brick_pressure_plate", StonePressurePlate::new);
    // BRICK PRESSURE_PLATE
    public static final RegistryObject<Block> BLACK_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("black_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLUE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("blue_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BROWN_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("brown_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> CYAN_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("cyan_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GRAY_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("gray_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GREEN_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("green_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_blue_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_gray_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIME_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("lime_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> MAGENTA_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("magenta_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> ORANGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("orange_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PINK_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("pink_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PURPLE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("purple_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> RED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("red_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> WHITE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("white_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> YELLOW_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("yellow_brick_pressure_plate", StonePressurePlate::new);

    // Aged Brick Pressure Plate
    public static final RegistryObject<Block> AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("aged_brick_pressure_plate", StonePressurePlate::new);
    // AGED_BRICK PRESSURE_PLATE
    public static final RegistryObject<Block> BLACK_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("black_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLUE_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("blue_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BROWN_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("brown_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> CYAN_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("cyan_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GRAY_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("gray_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GREEN_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("green_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_blue_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_gray_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIME_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("lime_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> MAGENTA_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("magenta_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> ORANGE_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("orange_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PINK_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("pink_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PURPLE_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("purple_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> RED_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("red_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> WHITE_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("white_aged_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> YELLOW_AGED_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("yellow_aged_brick_pressure_plate", StonePressurePlate::new);
    // TERRACOTTA_SMALL_BRICK PRESSURE_PLATE
    public static final RegistryObject<Block> TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("black_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("blue_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("brown_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("cyan_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("gray_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("green_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_blue_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_gray_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("lime_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("magenta_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("orange_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("pink_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("purple_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("red_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("white_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("yellow_terracotta_small_brick_pressure_plate", StonePressurePlate::new);
    // TERRACOTTA_LARGE_BRICK PRESSURE_PLATE
    public static final RegistryObject<Block> TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("black_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("blue_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("brown_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("cyan_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("gray_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("green_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_blue_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("light_gray_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("lime_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("magenta_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("orange_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("pink_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("purple_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("red_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("white_terracotta_large_brick_pressure_plate", StonePressurePlate::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE = BLOCK_PRESSURE_PLATE.register("yellow_terracotta_large_brick_pressure_plate", StonePressurePlate::new);

}
