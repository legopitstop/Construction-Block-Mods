package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.StoneButton;
import com.legopitstop.construction.blocks.WoodButton;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockButton {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_BUTTON = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // BUTTON
    // PLANK BUTTON
    public static final RegistryObject<Block> BLACK_PLANK_BUTTON = BLOCK_BUTTON.register("black_plank_button", WoodButton::new);
    public static final RegistryObject<Block> BLUE_PLANK_BUTTON = BLOCK_BUTTON.register("blue_plank_button", WoodButton::new);
    public static final RegistryObject<Block> BROWN_PLANK_BUTTON = BLOCK_BUTTON.register("brown_plank_button", WoodButton::new);
    public static final RegistryObject<Block> CYAN_PLANK_BUTTON = BLOCK_BUTTON.register("cyan_plank_button", WoodButton::new);
    public static final RegistryObject<Block> GRAY_PLANK_BUTTON = BLOCK_BUTTON.register("gray_plank_button", WoodButton::new);
    public static final RegistryObject<Block> GREEN_PLANK_BUTTON = BLOCK_BUTTON.register("green_plank_button", WoodButton::new);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANK_BUTTON = BLOCK_BUTTON.register("light_blue_plank_button", WoodButton::new);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANK_BUTTON = BLOCK_BUTTON.register("light_gray_plank_button", WoodButton::new);
    public static final RegistryObject<Block> LIME_PLANK_BUTTON = BLOCK_BUTTON.register("lime_plank_button", WoodButton::new);
    public static final RegistryObject<Block> MAGENTA_PLANK_BUTTON = BLOCK_BUTTON.register("magenta_plank_button", WoodButton::new);
    public static final RegistryObject<Block> ORANGE_PLANK_BUTTON = BLOCK_BUTTON.register("orange_plank_button", WoodButton::new);
    public static final RegistryObject<Block> PINK_PLANK_BUTTON = BLOCK_BUTTON.register("pink_plank_button", WoodButton::new);
    public static final RegistryObject<Block> PURPLE_PLANK_BUTTON = BLOCK_BUTTON.register("purple_plank_button", WoodButton::new);
    public static final RegistryObject<Block> RED_PLANK_BUTTON = BLOCK_BUTTON.register("red_plank_button", WoodButton::new);
    public static final RegistryObject<Block> WHITE_PLANK_BUTTON = BLOCK_BUTTON.register("white_plank_button", WoodButton::new);
    public static final RegistryObject<Block> YELLOW_PLANK_BUTTON = BLOCK_BUTTON.register("yellow_plank_button", WoodButton::new);
    // CONCRETE_SMALL_BRICK BUTTON
    public static final RegistryObject<Block> BLACK_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("black_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("blue_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("brown_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("cyan_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("gray_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("green_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("light_blue_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("light_gray_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIME_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("lime_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("magenta_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("orange_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PINK_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("pink_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("purple_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> RED_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("red_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("white_concrete_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("yellow_concrete_small_brick_button", StoneButton::new);
    // CONCRETE_LARGE_BRICK BUTTON
    public static final RegistryObject<Block> BLACK_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("black_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("blue_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("brown_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("cyan_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("gray_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("green_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("light_blue_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("light_gray_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIME_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("lime_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("magenta_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("orange_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PINK_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("pink_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("purple_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> RED_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("red_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("white_concrete_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("yellow_concrete_large_brick_button", StoneButton::new);
    // BRICK BUTTON
    public static final RegistryObject<Block> BLACK_BRICK_BUTTON = BLOCK_BUTTON.register("black_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLUE_BRICK_BUTTON = BLOCK_BUTTON.register("blue_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BROWN_BRICK_BUTTON = BLOCK_BUTTON.register("brown_brick_button", StoneButton::new);
    public static final RegistryObject<Block> CYAN_BRICK_BUTTON = BLOCK_BUTTON.register("cyan_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GRAY_BRICK_BUTTON = BLOCK_BUTTON.register("gray_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GREEN_BRICK_BUTTON = BLOCK_BUTTON.register("green_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_BUTTON = BLOCK_BUTTON.register("light_blue_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_BUTTON = BLOCK_BUTTON.register("light_gray_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIME_BRICK_BUTTON = BLOCK_BUTTON.register("lime_brick_button", StoneButton::new);
    public static final RegistryObject<Block> MAGENTA_BRICK_BUTTON = BLOCK_BUTTON.register("magenta_brick_button", StoneButton::new);
    public static final RegistryObject<Block> ORANGE_BRICK_BUTTON = BLOCK_BUTTON.register("orange_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PINK_BRICK_BUTTON = BLOCK_BUTTON.register("pink_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PURPLE_BRICK_BUTTON = BLOCK_BUTTON.register("purple_brick_button", StoneButton::new);
    public static final RegistryObject<Block> RED_BRICK_BUTTON = BLOCK_BUTTON.register("red_brick_button", StoneButton::new);
    public static final RegistryObject<Block> WHITE_BRICK_BUTTON = BLOCK_BUTTON.register("white_brick_button", StoneButton::new);
    public static final RegistryObject<Block> YELLOW_BRICK_BUTTON = BLOCK_BUTTON.register("yellow_brick_button", StoneButton::new);

    // Aged Brick Button
    public static final RegistryObject<Block> AGED_BRICK_BUTTON = BLOCK_BUTTON.register("aged_brick_button", StoneButton::new);
    // AGED_BRICK BUTTON
    public static final RegistryObject<Block> BLACK_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("black_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLUE_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("blue_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BROWN_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("brown_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> CYAN_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("cyan_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GRAY_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("gray_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GREEN_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("green_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_BLUE_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("light_blue_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_GRAY_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("light_gray_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIME_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("lime_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> MAGENTA_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("magenta_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> ORANGE_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("orange_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PINK_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("pink_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PURPLE_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("purple_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> RED_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("red_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> WHITE_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("white_aged_brick_button", StoneButton::new);
    public static final RegistryObject<Block> YELLOW_AGED_BRICK_BUTTON = BLOCK_BUTTON.register("yellow_aged_brick_button", StoneButton::new);
    // TERRACOTTA_SMALL_BRICK BUTTON
    public static final RegistryObject<Block> TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("black_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("blue_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("brown_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("cyan_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("gray_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("green_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("light_blue_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("light_gray_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("lime_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("magenta_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("orange_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("pink_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("purple_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("red_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("white_terracotta_small_brick_button", StoneButton::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SMALL_BRICK_BUTTON = BLOCK_BUTTON.register("yellow_terracotta_small_brick_button", StoneButton::new);
    // TERRACOTTA_LARGE_BRICK BUTTON
    public static final RegistryObject<Block> TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("black_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("blue_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("brown_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("cyan_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("gray_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("green_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("light_blue_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("light_gray_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> LIME_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("lime_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("magenta_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("orange_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PINK_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("pink_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("purple_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> RED_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("red_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("white_terracotta_large_brick_button", StoneButton::new);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_LARGE_BRICK_BUTTON = BLOCK_BUTTON.register("yellow_terracotta_large_brick_button", StoneButton::new);

}
