package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockButton;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemButton {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_BUTTON = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Other Block Items
    // PLANK BUTTON
    public static final RegistryObject<Item> BLACK_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("black_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLACK_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> BLUE_PLANK_BUTTON_BUTTON_ITEM = ITEM_BUTTON.register("blue_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLUE_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> BROWN_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("brown_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.BROWN_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> CYAN_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("cyan_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.CYAN_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> GRAY_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("gray_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.GRAY_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("green_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.GREEN_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("light_blue_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_BLUE_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("light_gray_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_GRAY_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> LIME_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("lime_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIME_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> MAGENTA_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("magenta_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.MAGENTA_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> ORANGE_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("orange_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.ORANGE_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> PINK_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("pink_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.PINK_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> PURPLE_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("purple_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.PURPLE_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> RED_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("red_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.RED_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> WHITE_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("white_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.WHITE_PLANK_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_PLANK_BUTTON_ITEM = ITEM_BUTTON.register("yellow_plank_button",
            () -> new BlockItemBase(ConstructionBlockButton.YELLOW_PLANK_BUTTON.get()));
    // BRICK BUTTON
    public static final RegistryObject<Item> BLACK_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("black_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLACK_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLUE_BRICK_BUTTON_BUTTON_ITEM = ITEM_BUTTON.register("blue_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLUE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BROWN_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("brown_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BROWN_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> CYAN_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("cyan_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.CYAN_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GRAY_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("gray_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GRAY_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("green_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GREEN_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_blue_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_BLUE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_gray_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_GRAY_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIME_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("lime_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIME_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> MAGENTA_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("magenta_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.MAGENTA_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> ORANGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("orange_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.ORANGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PINK_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("pink_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PINK_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PURPLE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("purple_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PURPLE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> RED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("red_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.RED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> WHITE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("white_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.WHITE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("yellow_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.YELLOW_BRICK_BUTTON.get()));
    // CONCRETE_SMALL_BRICK BUTTON
    public static final RegistryObject<Item> BLACK_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("black_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLACK_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SMALL_BRICK_BUTTON_BUTTON_ITEM = ITEM_BUTTON.register("blue_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLUE_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("brown_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BROWN_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("cyan_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.CYAN_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("gray_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GRAY_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("green_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GREEN_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_blue_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_BLUE_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_gray_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_GRAY_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("lime_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIME_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("magenta_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.MAGENTA_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("orange_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.ORANGE_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("pink_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PINK_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("purple_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PURPLE_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> RED_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("red_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.RED_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("white_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.WHITE_CONCRETE_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("yellow_concrete_small_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.YELLOW_CONCRETE_SMALL_BRICK_BUTTON.get()));
    // CONCRETE_LARGE_BRICK BUTTON
    public static final RegistryObject<Item> BLACK_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("black_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLACK_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_LARGE_BRICK_BUTTON_BUTTON_ITEM = ITEM_BUTTON.register("blue_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLUE_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("brown_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BROWN_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("cyan_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.CYAN_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("gray_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GRAY_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("green_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GREEN_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_blue_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_BLUE_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_gray_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_GRAY_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("lime_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIME_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("magenta_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.MAGENTA_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("orange_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.ORANGE_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("pink_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PINK_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("purple_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PURPLE_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> RED_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("red_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.RED_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("white_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.WHITE_CONCRETE_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("yellow_concrete_large_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.YELLOW_CONCRETE_LARGE_BRICK_BUTTON.get()));

    // Aged Brick Button
    public static final RegistryObject<Item> AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.AGED_BRICK_BUTTON.get()));
    // AGED_BRICK BUTTON

    public static final RegistryObject<Item> BLACK_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("black_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLACK_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLUE_AGED_BRICK_BUTTON_BUTTON_ITEM = ITEM_BUTTON.register("blue_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BLUE_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BROWN_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("brown_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.BROWN_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> CYAN_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("cyan_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.CYAN_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GRAY_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("gray_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GRAY_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("green_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.GREEN_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_blue_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_BLUE_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_gray_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIGHT_GRAY_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIME_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("lime_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.LIME_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> MAGENTA_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("magenta_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.MAGENTA_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> ORANGE_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("orange_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.ORANGE_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PINK_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("pink_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PINK_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PURPLE_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("purple_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.PURPLE_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> RED_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("red_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.RED_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> WHITE_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("white_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.WHITE_AGED_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_AGED_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("yellow_aged_brick_button",
            () -> new BlockItemBase(ConstructionBlockButton.YELLOW_AGED_BRICK_BUTTON.get()));
    // TERRACOTTA_SMALL_BRICK BUTTON
    public static final RegistryObject<Item> TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("black_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.BLACK_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_SMALL_BRICK_BUTTON_BUTTON_ITEM = ITEM_BUTTON.register("blue_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.BLUE_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("brown_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.BROWN_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("cyan_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.CYAN_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("gray_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.GRAY_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("green_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.GREEN_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_blue_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.LIGHT_BLUE_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_gray_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.LIGHT_GRAY_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("lime_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.LIME_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("magenta_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.MAGENTA_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("orange_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.ORANGE_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("pink_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.PINK_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("purple_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.PURPLE_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("red_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.RED_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("white_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.WHITE_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_SMALL_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("yellow_terracotta_small_brick_button",() -> new BlockItemBase(ConstructionBlockButton.YELLOW_TERRACOTTA_SMALL_BRICK_BUTTON.get()));
    // TERRACOTTA_LARGE_BRICK BUTTON
    public static final RegistryObject<Item> TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("black_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.BLACK_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_LARGE_BRICK_BUTTON_BUTTON_ITEM = ITEM_BUTTON.register("blue_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.BLUE_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("brown_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.BROWN_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("cyan_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.CYAN_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("gray_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.GRAY_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("green_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.GREEN_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_blue_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.LIGHT_BLUE_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("light_gray_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.LIGHT_GRAY_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("lime_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.LIME_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("magenta_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.MAGENTA_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("orange_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.ORANGE_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("pink_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.PINK_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("purple_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.PURPLE_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("red_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.RED_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("white_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.WHITE_TERRACOTTA_LARGE_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_LARGE_BRICK_BUTTON_ITEM = ITEM_BUTTON.register("yellow_terracotta_large_brick_button",() -> new BlockItemBase(ConstructionBlockButton.YELLOW_TERRACOTTA_LARGE_BRICK_BUTTON.get()));

}
