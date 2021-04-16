package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockSlab;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemSlab {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_SLAB = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // CELINGTILE SLAB
    public static final RegistryObject<Item> BLACK_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("black_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLACK_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> BLUE_CELINGTILE_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLUE_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> BROWN_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("brown_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BROWN_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> CYAN_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("cyan_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.CYAN_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> GRAY_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("gray_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GRAY_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> GREEN_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("green_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GREEN_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("light_blue_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("light_gray_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> LIME_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("lime_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIME_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("magenta_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("orange_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.ORANGE_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> PINK_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("pink_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PINK_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("purple_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PURPLE_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> RED_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("red_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.RED_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> WHITE_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("white_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.WHITE_CELINGTILE_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_CELINGTILE_SLAB_ITEM = ITEM_SLAB.register("yellow_celingtile_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.YELLOW_CELINGTILE_SLAB.get()));
    // PLANK SLAB
    public static final RegistryObject<Item> BLACK_PLANK_SLAB_ITEM = ITEM_SLAB.register("black_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLACK_PLANK_SLAB.get()));
    public static final RegistryObject<Item> BLUE_PLANK_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLUE_PLANK_SLAB.get()));
    public static final RegistryObject<Item> BROWN_PLANK_SLAB_ITEM = ITEM_SLAB.register("brown_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BROWN_PLANK_SLAB.get()));
    public static final RegistryObject<Item> CYAN_PLANK_SLAB_ITEM = ITEM_SLAB.register("cyan_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.CYAN_PLANK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_PLANK_SLAB_ITEM = ITEM_SLAB.register("gray_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GRAY_PLANK_SLAB.get()));
    public static final RegistryObject<Item> GREEN_PLANK_SLAB_ITEM = ITEM_SLAB.register("green_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GREEN_PLANK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_SLAB_ITEM = ITEM_SLAB.register("light_blue_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_PLANK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_SLAB_ITEM = ITEM_SLAB.register("light_gray_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_PLANK_SLAB.get()));
    public static final RegistryObject<Item> LIME_PLANK_SLAB_ITEM = ITEM_SLAB.register("lime_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIME_PLANK_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_PLANK_SLAB_ITEM = ITEM_SLAB.register("magenta_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_PLANK_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_PLANK_SLAB_ITEM = ITEM_SLAB.register("orange_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.ORANGE_PLANK_SLAB.get()));
    public static final RegistryObject<Item> PINK_PLANK_SLAB_ITEM = ITEM_SLAB.register("pink_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PINK_PLANK_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_PLANK_SLAB_ITEM = ITEM_SLAB.register("purple_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PURPLE_PLANK_SLAB.get()));
    public static final RegistryObject<Item> RED_PLANK_SLAB_ITEM = ITEM_SLAB.register("red_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.RED_PLANK_SLAB.get()));
    public static final RegistryObject<Item> WHITE_PLANK_SLAB_ITEM = ITEM_SLAB.register("white_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.WHITE_PLANK_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_PLANK_SLAB_ITEM = ITEM_SLAB.register("yellow_plank_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.YELLOW_PLANK_SLAB.get()));
    // CONCRETE_SMALL_BRICK SLAB
    public static final RegistryObject<Item> BLACK_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("black_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLACK_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SMALL_BRICK_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLUE_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("brown_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BROWN_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("cyan_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.CYAN_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("gray_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GRAY_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("green_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GREEN_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_blue_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_gray_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("lime_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIME_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("magenta_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("orange_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.ORANGE_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("pink_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PINK_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("purple_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PURPLE_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> RED_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("red_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.RED_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("white_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.WHITE_CONCRETE_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("yellow_concrete_small_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.YELLOW_CONCRETE_SMALL_BRICK_SLAB.get()));
    // CONCRETE_LARGE_BRICK SLAB
    public static final RegistryObject<Item> BLACK_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("black_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLACK_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_LARGE_BRICK_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLUE_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("brown_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BROWN_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("cyan_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.CYAN_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("gray_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GRAY_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("green_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GREEN_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_blue_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_gray_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("lime_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIME_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("magenta_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("orange_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.ORANGE_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("pink_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PINK_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("purple_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PURPLE_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> RED_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("red_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.RED_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("white_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.WHITE_CONCRETE_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("yellow_concrete_large_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.YELLOW_CONCRETE_LARGE_BRICK_SLAB.get()));
    // BRICK SLAB
    public static final RegistryObject<Item> BLACK_BRICK_SLAB_ITEM = ITEM_SLAB.register("black_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLACK_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLUE_BRICK_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLUE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BROWN_BRICK_SLAB_ITEM = ITEM_SLAB.register("brown_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BROWN_BRICK_SLAB.get()));
    public static final RegistryObject<Item> CYAN_BRICK_SLAB_ITEM = ITEM_SLAB.register("cyan_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.CYAN_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_BRICK_SLAB_ITEM = ITEM_SLAB.register("gray_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GRAY_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GREEN_BRICK_SLAB_ITEM = ITEM_SLAB.register("green_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GREEN_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_blue_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_gray_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIME_BRICK_SLAB_ITEM = ITEM_SLAB.register("lime_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIME_BRICK_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_BRICK_SLAB_ITEM = ITEM_SLAB.register("magenta_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_BRICK_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("orange_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.ORANGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PINK_BRICK_SLAB_ITEM = ITEM_SLAB.register("pink_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PINK_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_BRICK_SLAB_ITEM = ITEM_SLAB.register("purple_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PURPLE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> RED_BRICK_SLAB_ITEM = ITEM_SLAB.register("red_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.RED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> WHITE_BRICK_SLAB_ITEM = ITEM_SLAB.register("white_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.WHITE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_BRICK_SLAB_ITEM = ITEM_SLAB.register("yellow_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.YELLOW_BRICK_SLAB.get()));

    // Aged Brick Slab
    public static final RegistryObject<Item> AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.AGED_BRICK_SLAB.get()));
    // AGED_BRICK SLAB
    public static final RegistryObject<Item> BLACK_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("black_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLACK_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLUE_AGED_BRICK_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BLUE_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BROWN_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("brown_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.BROWN_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> CYAN_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("cyan_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.CYAN_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("gray_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GRAY_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GREEN_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("green_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.GREEN_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_blue_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_gray_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIME_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("lime_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.LIME_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("magenta_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("orange_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.ORANGE_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PINK_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("pink_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PINK_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("purple_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.PURPLE_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> RED_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("red_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.RED_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> WHITE_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("white_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.WHITE_AGED_BRICK_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_AGED_BRICK_SLAB_ITEM = ITEM_SLAB.register("yellow_aged_brick_slab",
            () -> new BlockItemBase(ConstructionBlockSlab.YELLOW_AGED_BRICK_SLAB.get()));
    // TERRACOTTA_SMALL_BRICK SLAB
    public static final RegistryObject<Item> TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("black_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.BLACK_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_SMALL_BRICK_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.BLUE_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("brown_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.BROWN_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("cyan_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.CYAN_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("gray_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.GRAY_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("green_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.GREEN_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_blue_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_gray_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("lime_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.LIME_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("magenta_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("orange_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.ORANGE_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("pink_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.PINK_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("purple_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.PURPLE_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("red_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.RED_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("white_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.WHITE_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_SMALL_BRICK_SLAB_ITEM = ITEM_SLAB.register("yellow_terracotta_small_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.YELLOW_TERRACOTTA_SMALL_BRICK_SLAB.get()));
    // TERRACOTTA_LARGE_BRICK SLAB
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("black_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.BLACK_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_LARGE_BRICK_SLAB_SLAB_ITEM = ITEM_SLAB.register("blue_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.BLUE_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("brown_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.BROWN_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("cyan_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.CYAN_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("gray_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.GRAY_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("green_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.GREEN_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_blue_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("light_gray_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("lime_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.LIME_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("magenta_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.MAGENTA_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("orange_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.ORANGE_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("pink_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.PINK_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("purple_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.PURPLE_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("red_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.RED_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("white_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.WHITE_TERRACOTTA_LARGE_BRICK_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_LARGE_BRICK_SLAB_ITEM = ITEM_SLAB.register("yellow_terracotta_large_brick_slab",() -> new BlockItemBase(ConstructionBlockSlab.YELLOW_TERRACOTTA_LARGE_BRICK_SLAB.get()));

}
