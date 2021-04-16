package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockPressurePlate;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemPressurePlate {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_PRESSURE_PLATE = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Other Block Items
    // PLANK PRESSURE_PLATE
    public static final RegistryObject<Item> BLACK_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("black_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLACK_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLUE_PLANK_PRESSURE_PLATE_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("blue_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLUE_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BROWN_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("brown_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BROWN_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CYAN_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("cyan_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.CYAN_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GRAY_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("gray_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GRAY_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GREEN_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("green_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GREEN_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_blue_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_BLUE_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_gray_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_GRAY_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIME_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("lime_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIME_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MAGENTA_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("magenta_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.MAGENTA_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> ORANGE_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("orange_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.ORANGE_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PINK_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("pink_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PINK_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PURPLE_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("purple_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PURPLE_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> RED_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("red_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.RED_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> WHITE_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("white_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.WHITE_PLANK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> YELLOW_PLANK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("yellow_plank_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.YELLOW_PLANK_PRESSURE_PLATE.get()));
    // BRICK PRESSURE_PLATE
    public static final RegistryObject<Item> BLACK_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("black_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLACK_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLUE_BRICK_PRESSURE_PLATE_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("blue_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLUE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BROWN_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("brown_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BROWN_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CYAN_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("cyan_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.CYAN_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GRAY_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("gray_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GRAY_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GREEN_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("green_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GREEN_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_blue_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_BLUE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_gray_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_GRAY_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIME_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("lime_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIME_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MAGENTA_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("magenta_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.MAGENTA_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> ORANGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("orange_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.ORANGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PINK_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("pink_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PINK_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PURPLE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("purple_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PURPLE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> RED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("red_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.RED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> WHITE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("white_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.WHITE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> YELLOW_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("yellow_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.YELLOW_BRICK_PRESSURE_PLATE.get()));
    // CONCRETE_SMALL_BRICK PRESSURE_PLATE
    public static final RegistryObject<Item> BLACK_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("black_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLACK_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("blue_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLUE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("brown_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BROWN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("cyan_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.CYAN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("gray_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GRAY_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("green_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GREEN_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_blue_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_BLUE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_gray_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_GRAY_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("lime_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIME_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("magenta_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.MAGENTA_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("orange_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.ORANGE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("pink_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PINK_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("purple_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PURPLE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> RED_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("red_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.RED_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("white_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.WHITE_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("yellow_concrete_small_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.YELLOW_CONCRETE_SMALL_BRICK_PRESSURE_PLATE.get()));
    // CONCRETE_LARGE_BRICK PRESSURE_PLATE
    public static final RegistryObject<Item> BLACK_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("black_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLACK_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("blue_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLUE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("brown_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BROWN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("cyan_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.CYAN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("gray_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GRAY_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("green_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GREEN_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_blue_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_BLUE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_gray_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_GRAY_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("lime_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIME_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("magenta_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.MAGENTA_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("orange_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.ORANGE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("pink_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PINK_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("purple_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PURPLE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> RED_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("red_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.RED_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("white_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.WHITE_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("yellow_concrete_large_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.YELLOW_CONCRETE_LARGE_BRICK_PRESSURE_PLATE.get()));

    // Aged Brick Pressure Plate
    public static final RegistryObject<Item> AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.AGED_BRICK_PRESSURE_PLATE.get()));
    // AGED_BRICK PRESSURE_PLATE

    public static final RegistryObject<Item> BLACK_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("black_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLACK_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLUE_AGED_BRICK_PRESSURE_PLATE_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("blue_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BLUE_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BROWN_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("brown_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.BROWN_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CYAN_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("cyan_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.CYAN_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GRAY_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("gray_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GRAY_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GREEN_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("green_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.GREEN_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_blue_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_BLUE_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_gray_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_GRAY_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIME_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("lime_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.LIME_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MAGENTA_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("magenta_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.MAGENTA_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> ORANGE_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("orange_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.ORANGE_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PINK_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("pink_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PINK_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PURPLE_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("purple_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.PURPLE_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> RED_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("red_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.RED_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> WHITE_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("white_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.WHITE_AGED_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> YELLOW_AGED_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("yellow_aged_brick_pressure_plate",
            () -> new BlockItemBase(ConstructionBlockPressurePlate.YELLOW_AGED_BRICK_PRESSURE_PLATE.get()));
    // TERRACOTTA_SMALL_BRICK PRESSURE_PLATE
    public static final RegistryObject<Item> TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("black_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.BLACK_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("blue_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.BLUE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("brown_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.BROWN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("cyan_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.CYAN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("gray_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.GRAY_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("green_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.GREEN_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_blue_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_gray_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("lime_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.LIME_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("magenta_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.MAGENTA_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("orange_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.ORANGE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("pink_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.PINK_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("purple_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.PURPLE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("red_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.RED_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("white_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.WHITE_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("yellow_terracotta_small_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.YELLOW_TERRACOTTA_SMALL_BRICK_PRESSURE_PLATE.get()));
    // TERRACOTTA_LARGE_BRICK PRESSURE_PLATE
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("black_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.BLACK_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("blue_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.BLUE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("brown_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.BROWN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("cyan_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.CYAN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("gray_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.GRAY_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("green_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.GREEN_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_blue_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("light_gray_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("lime_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.LIME_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("magenta_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.MAGENTA_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("orange_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.ORANGE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("pink_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.PINK_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("purple_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.PURPLE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("red_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.RED_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("white_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.WHITE_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE_ITEM = ITEM_PRESSURE_PLATE.register("yellow_terracotta_large_brick_pressure_plate",() -> new BlockItemBase(ConstructionBlockPressurePlate.YELLOW_TERRACOTTA_LARGE_BRICK_PRESSURE_PLATE.get()));

}
