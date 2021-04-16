package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockFence;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemFence {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_FENCE = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Other Block Items
    // PLANK FENCE
    public static final RegistryObject<Item> BLACK_PLANK_FENCE_ITEM = ITEM_FENCE.register("black_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.BLACK_PLANK_FENCE.get()));
    public static final RegistryObject<Item> BLUE_PLANK_FENCE_FENCE_ITEM = ITEM_FENCE.register("blue_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.BLUE_PLANK_FENCE.get()));
    public static final RegistryObject<Item> BROWN_PLANK_FENCE_ITEM = ITEM_FENCE.register("brown_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.BROWN_PLANK_FENCE.get()));
    public static final RegistryObject<Item> CYAN_PLANK_FENCE_ITEM = ITEM_FENCE.register("cyan_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.CYAN_PLANK_FENCE.get()));
    public static final RegistryObject<Item> GRAY_PLANK_FENCE_ITEM = ITEM_FENCE.register("gray_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.GRAY_PLANK_FENCE.get()));
    public static final RegistryObject<Item> GREEN_PLANK_FENCE_ITEM = ITEM_FENCE.register("green_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.GREEN_PLANK_FENCE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_FENCE_ITEM = ITEM_FENCE.register("light_blue_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.LIGHT_BLUE_PLANK_FENCE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_FENCE_ITEM = ITEM_FENCE.register("light_gray_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.LIGHT_GRAY_PLANK_FENCE.get()));
    public static final RegistryObject<Item> LIME_PLANK_FENCE_ITEM = ITEM_FENCE.register("lime_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.LIME_PLANK_FENCE.get()));
    public static final RegistryObject<Item> MAGENTA_PLANK_FENCE_ITEM = ITEM_FENCE.register("magenta_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.MAGENTA_PLANK_FENCE.get()));
    public static final RegistryObject<Item> ORANGE_PLANK_FENCE_ITEM = ITEM_FENCE.register("orange_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.ORANGE_PLANK_FENCE.get()));
    public static final RegistryObject<Item> PINK_PLANK_FENCE_ITEM = ITEM_FENCE.register("pink_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.PINK_PLANK_FENCE.get()));
    public static final RegistryObject<Item> PURPLE_PLANK_FENCE_ITEM = ITEM_FENCE.register("purple_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.PURPLE_PLANK_FENCE.get()));
    public static final RegistryObject<Item> RED_PLANK_FENCE_ITEM = ITEM_FENCE.register("red_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.RED_PLANK_FENCE.get()));
    public static final RegistryObject<Item> WHITE_PLANK_FENCE_ITEM = ITEM_FENCE.register("white_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.WHITE_PLANK_FENCE.get()));
    public static final RegistryObject<Item> YELLOW_PLANK_FENCE_ITEM = ITEM_FENCE.register("yellow_plank_fence",
            () -> new BlockItemBase(ConstructionBlockFence.YELLOW_PLANK_FENCE.get()));

}
