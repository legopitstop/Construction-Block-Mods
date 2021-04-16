package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockWall;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemWall {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_WALL = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Other Block Items
    // CONCRETE_SMALL_BRICK WALL
    public static final RegistryObject<Item> BLACK_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("black_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLACK_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SMALL_BRICK_WALL_WALL_ITEM = ITEM_WALL.register("blue_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLUE_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("brown_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BROWN_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("cyan_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.CYAN_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("gray_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GRAY_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("green_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GREEN_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("light_blue_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_BLUE_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("light_gray_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_GRAY_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("lime_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIME_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("magenta_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.MAGENTA_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("orange_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.ORANGE_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("pink_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PINK_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("purple_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PURPLE_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> RED_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("red_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.RED_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("white_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.WHITE_CONCRETE_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("yellow_concrete_small_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.YELLOW_CONCRETE_SMALL_BRICK_WALL.get()));
    // CONCRETE_LARGE_BRICK WALL
    public static final RegistryObject<Item> BLACK_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("black_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLACK_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_LARGE_BRICK_WALL_WALL_ITEM = ITEM_WALL.register("blue_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLUE_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("brown_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BROWN_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("cyan_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.CYAN_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("gray_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GRAY_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("green_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GREEN_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("light_blue_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_BLUE_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("light_gray_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_GRAY_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("lime_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIME_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("magenta_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.MAGENTA_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("orange_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.ORANGE_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("pink_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PINK_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("purple_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PURPLE_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> RED_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("red_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.RED_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("white_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.WHITE_CONCRETE_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("yellow_concrete_large_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.YELLOW_CONCRETE_LARGE_BRICK_WALL.get()));
    // BRICK WALL
    public static final RegistryObject<Item> BLACK_BRICK_WALL_ITEM = ITEM_WALL.register("black_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLACK_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLUE_BRICK_WALL_WALL_ITEM = ITEM_WALL.register("blue_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLUE_BRICK_WALL.get()));
    public static final RegistryObject<Item> BROWN_BRICK_WALL_ITEM = ITEM_WALL.register("brown_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BROWN_BRICK_WALL.get()));
    public static final RegistryObject<Item> CYAN_BRICK_WALL_ITEM = ITEM_WALL.register("cyan_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.CYAN_BRICK_WALL.get()));
    public static final RegistryObject<Item> GRAY_BRICK_WALL_ITEM = ITEM_WALL.register("gray_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GRAY_BRICK_WALL.get()));
    public static final RegistryObject<Item> GREEN_BRICK_WALL_ITEM = ITEM_WALL.register("green_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GREEN_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_WALL_ITEM = ITEM_WALL.register("light_blue_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_BLUE_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_WALL_ITEM = ITEM_WALL.register("light_gray_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_GRAY_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIME_BRICK_WALL_ITEM = ITEM_WALL.register("lime_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIME_BRICK_WALL.get()));
    public static final RegistryObject<Item> MAGENTA_BRICK_WALL_ITEM = ITEM_WALL.register("magenta_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.MAGENTA_BRICK_WALL.get()));
    public static final RegistryObject<Item> ORANGE_BRICK_WALL_ITEM = ITEM_WALL.register("orange_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.ORANGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> PINK_BRICK_WALL_ITEM = ITEM_WALL.register("pink_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PINK_BRICK_WALL.get()));
    public static final RegistryObject<Item> PURPLE_BRICK_WALL_ITEM = ITEM_WALL.register("purple_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PURPLE_BRICK_WALL.get()));
    public static final RegistryObject<Item> RED_BRICK_WALL_ITEM = ITEM_WALL.register("red_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.RED_BRICK_WALL.get()));
    public static final RegistryObject<Item> WHITE_BRICK_WALL_ITEM = ITEM_WALL.register("white_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.WHITE_BRICK_WALL.get()));
    public static final RegistryObject<Item> YELLOW_BRICK_WALL_ITEM = ITEM_WALL.register("yellow_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.YELLOW_BRICK_WALL.get()));

    // Aged Brick Wall
    public static final RegistryObject<Item> AGED_BRICK_WALL_ITEM = ITEM_WALL.register("aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.AGED_BRICK_WALL.get()));
    // AGED_BRICK WALL

    public static final RegistryObject<Item> BLACK_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("black_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLACK_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLUE_AGED_BRICK_WALL_WALL_ITEM = ITEM_WALL.register("blue_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BLUE_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> BROWN_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("brown_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.BROWN_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> CYAN_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("cyan_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.CYAN_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> GRAY_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("gray_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GRAY_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> GREEN_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("green_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.GREEN_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("light_blue_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_BLUE_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("light_gray_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIGHT_GRAY_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIME_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("lime_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.LIME_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> MAGENTA_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("magenta_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.MAGENTA_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> ORANGE_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("orange_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.ORANGE_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> PINK_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("pink_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PINK_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> PURPLE_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("purple_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.PURPLE_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> RED_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("red_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.RED_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> WHITE_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("white_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.WHITE_AGED_BRICK_WALL.get()));
    public static final RegistryObject<Item> YELLOW_AGED_BRICK_WALL_ITEM = ITEM_WALL.register("yellow_aged_brick_wall",
            () -> new BlockItemBase(ConstructionBlockWall.YELLOW_AGED_BRICK_WALL.get()));
    // TERRACOTTA_SMALL_BRICK WALL
    public static final RegistryObject<Item> TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("black_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.BLACK_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_SMALL_BRICK_WALL_WALL_ITEM = ITEM_WALL.register("blue_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.BLUE_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("brown_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.BROWN_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("cyan_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.CYAN_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("gray_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.GRAY_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("green_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.GREEN_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("light_blue_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("light_gray_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("lime_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.LIME_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("magenta_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.MAGENTA_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("orange_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.ORANGE_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("pink_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.PINK_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("purple_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.PURPLE_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("red_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.RED_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("white_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.WHITE_TERRACOTTA_SMALL_BRICK_WALL.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_SMALL_BRICK_WALL_ITEM = ITEM_WALL.register("yellow_terracotta_small_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.YELLOW_TERRACOTTA_SMALL_BRICK_WALL.get()));
    // TERRACOTTA_LARGE_BRICK WALL
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("black_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.BLACK_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_LARGE_BRICK_WALL_WALL_ITEM = ITEM_WALL.register("blue_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.BLUE_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("brown_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.BROWN_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("cyan_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.CYAN_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("gray_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.GRAY_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("green_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.GREEN_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("light_blue_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("light_gray_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("lime_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.LIME_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("magenta_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.MAGENTA_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("orange_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.ORANGE_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("pink_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.PINK_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("purple_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.PURPLE_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("red_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.RED_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("white_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.WHITE_TERRACOTTA_LARGE_BRICK_WALL.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_LARGE_BRICK_WALL_ITEM = ITEM_WALL.register("yellow_terracotta_large_brick_wall",() -> new BlockItemBase(ConstructionBlockWall.YELLOW_TERRACOTTA_LARGE_BRICK_WALL.get()));
    // SHEETROCK_WALL
    public static final RegistryObject<Item> SHEETROCK_WALL_ITEM = ITEM_WALL.register("sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> BLACK_SHEETROCK_WALL_ITEM = ITEM_WALL.register("black_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.BLACK_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> BLUE_SHEETROCK_WALL_ITEM = ITEM_WALL.register("blue_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.BLUE_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> BROWN_SHEETROCK_WALL_ITEM = ITEM_WALL.register("brown_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.BROWN_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> CYAN_SHEETROCK_WALL_ITEM = ITEM_WALL.register("cyan_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.CYAN_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> GRAY_SHEETROCK_WALL_ITEM = ITEM_WALL.register("gray_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.GRAY_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> GREEN_SHEETROCK_WALL_ITEM = ITEM_WALL.register("green_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.GREEN_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_SHEETROCK_WALL_ITEM = ITEM_WALL.register("light_blue_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.LIGHT_BLUE_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_SHEETROCK_WALL_ITEM = ITEM_WALL.register("light_gray_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.LIGHT_GRAY_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> LIME_SHEETROCK_WALL_ITEM = ITEM_WALL.register("lime_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.LIME_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> MAGENTA_SHEETROCK_WALL_ITEM = ITEM_WALL.register("magenta_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.MAGENTA_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> ORANGE_SHEETROCK_WALL_ITEM = ITEM_WALL.register("orange_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.ORANGE_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> PINK_SHEETROCK_WALL_ITEM = ITEM_WALL.register("pink_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.PINK_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> PURPLE_SHEETROCK_WALL_ITEM = ITEM_WALL.register("purple_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.PURPLE_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> RED_SHEETROCK_WALL_ITEM = ITEM_WALL.register("red_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.RED_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> WHITE_SHEETROCK_WALL_ITEM = ITEM_WALL.register("white_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.WHITE_SHEETROCK_WALL.get()));
    public static final RegistryObject<Item> YELLOW_SHEETROCK_WALL_ITEM = ITEM_WALL.register("yellow_sheetrock_wall",() -> new BlockItemBase(ConstructionBlockWall.YELLOW_SHEETROCK_WALL.get()));

}
