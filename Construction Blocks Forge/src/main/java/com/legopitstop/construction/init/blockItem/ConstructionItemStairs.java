package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockStairs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemStairs {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_STAIRS = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Other Block Items
    // CELINGTILE STAIRS
    public static final RegistryObject<Item> BLACK_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("black_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLACK_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_CELINGTILE_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLUE_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("brown_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BROWN_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("cyan_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.CYAN_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("gray_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GRAY_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("green_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GREEN_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> LIME_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("lime_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIME_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("magenta_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("orange_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.ORANGE_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> PINK_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("pink_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PINK_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("purple_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PURPLE_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> RED_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("red_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.RED_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("white_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.WHITE_CELINGTILE_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_CELINGTILE_STAIRS_ITEM = ITEM_STAIRS.register("yellow_celingtile_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.YELLOW_CELINGTILE_STAIRS.get()));
    // PLANK STAIRS
    public static final RegistryObject<Item> BLACK_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("black_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLACK_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_PLANK_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLUE_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("brown_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BROWN_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("cyan_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.CYAN_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("gray_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GRAY_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("green_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GREEN_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> LIME_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("lime_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIME_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("magenta_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("orange_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.ORANGE_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> PINK_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("pink_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PINK_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("purple_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PURPLE_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> RED_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("red_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.RED_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("white_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.WHITE_PLANK_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_PLANK_STAIRS_ITEM = ITEM_STAIRS.register("yellow_plank_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.YELLOW_PLANK_STAIRS.get()));
    // CONCRETE_SMALL_BRICK STAIRS
    public static final RegistryObject<Item> BLACK_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("black_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLACK_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SMALL_BRICK_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLUE_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("brown_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BROWN_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("cyan_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.CYAN_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("gray_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GRAY_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("green_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GREEN_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("lime_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIME_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("magenta_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("orange_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.ORANGE_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("pink_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PINK_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("purple_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PURPLE_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> RED_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("red_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.RED_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("white_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.WHITE_CONCRETE_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("yellow_concrete_small_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.YELLOW_CONCRETE_SMALL_BRICK_STAIRS.get()));
    // CONCRETE_LARGE_BRICK STAIRS
    public static final RegistryObject<Item> BLACK_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("black_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLACK_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_LARGE_BRICK_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLUE_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("brown_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BROWN_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("cyan_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.CYAN_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("gray_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GRAY_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("green_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GREEN_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("lime_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIME_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("magenta_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("orange_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.ORANGE_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("pink_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PINK_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("purple_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PURPLE_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> RED_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("red_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.RED_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("white_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.WHITE_CONCRETE_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("yellow_concrete_large_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.YELLOW_CONCRETE_LARGE_BRICK_STAIRS.get()));
    // BRICK STAIRS
    public static final RegistryObject<Item> BLACK_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("black_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLACK_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_BRICK_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLUE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("brown_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BROWN_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("cyan_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.CYAN_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("gray_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GRAY_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("green_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GREEN_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIME_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("lime_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIME_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("magenta_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("orange_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.ORANGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PINK_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("pink_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PINK_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("purple_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PURPLE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> RED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("red_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.RED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("white_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.WHITE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("yellow_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.YELLOW_BRICK_STAIRS.get()));

    // Aged Brick Stairs
    public static final RegistryObject<Item> AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.AGED_BRICK_STAIRS.get()));
    // AGED_BRICK STAIRS

    public static final RegistryObject<Item> BLACK_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("black_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLACK_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_AGED_BRICK_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BLUE_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("brown_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.BROWN_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("cyan_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.CYAN_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("gray_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GRAY_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("green_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.GREEN_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIME_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("lime_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.LIME_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("magenta_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("orange_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.ORANGE_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PINK_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("pink_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PINK_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("purple_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.PURPLE_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> RED_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("red_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.RED_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("white_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.WHITE_AGED_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_AGED_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("yellow_aged_brick_stairs",
            () -> new BlockItemBase(ConstructionBlockStairs.YELLOW_AGED_BRICK_STAIRS.get()));
    // TERRACOTTA_SMALL_BRICK STAIRS
    public static final RegistryObject<Item> TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("black_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.BLACK_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_SMALL_BRICK_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.BLUE_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("brown_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.BROWN_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("cyan_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.CYAN_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("gray_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.GRAY_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("green_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.GREEN_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("lime_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.LIME_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("magenta_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("orange_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.ORANGE_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("pink_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.PINK_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("purple_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.PURPLE_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("red_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.RED_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("white_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.WHITE_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_SMALL_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("yellow_terracotta_small_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.YELLOW_TERRACOTTA_SMALL_BRICK_STAIRS.get()));
    // TERRACOTTA_LARGE_BRICK STAIRS
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("black_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.BLACK_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_LARGE_BRICK_STAIRS_STAIRS_ITEM = ITEM_STAIRS.register("blue_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.BLUE_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("brown_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.BROWN_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("cyan_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.CYAN_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("gray_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.GRAY_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("green_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.GREEN_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_blue_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("light_gray_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("lime_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.LIME_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("magenta_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.MAGENTA_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("orange_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.ORANGE_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("pink_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.PINK_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("purple_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.PURPLE_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("red_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.RED_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("white_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.WHITE_TERRACOTTA_LARGE_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_LARGE_BRICK_STAIRS_ITEM = ITEM_STAIRS.register("yellow_terracotta_large_brick_stairs",() -> new BlockItemBase(ConstructionBlockStairs.YELLOW_TERRACOTTA_LARGE_BRICK_STAIRS.get()));

}
