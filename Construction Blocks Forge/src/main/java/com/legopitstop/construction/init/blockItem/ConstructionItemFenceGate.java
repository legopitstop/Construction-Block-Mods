package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockFenceGate;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemFenceGate {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_FENCE_GATE = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Other Block Items
    // PLANK FENCE GATE
    public static final RegistryObject<Item> BLACK_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("black_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.BLACK_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> BLUE_PLANK_FENCE_GATE_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("blue_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.BLUE_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> BROWN_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("brown_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.BROWN_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> CYAN_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("cyan_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.CYAN_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> GRAY_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("gray_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.GRAY_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> GREEN_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("green_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.GREEN_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("light_blue_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.LIGHT_BLUE_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("light_gray_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.LIGHT_GRAY_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> LIME_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("lime_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.LIME_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> MAGENTA_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("magenta_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.MAGENTA_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> ORANGE_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("orange_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.ORANGE_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> PINK_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("pink_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.PINK_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> PURPLE_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("purple_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.PURPLE_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> RED_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("red_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.RED_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> WHITE_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("white_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.WHITE_PLANK_FENCE_GATE.get()));
    public static final RegistryObject<Item> YELLOW_PLANK_FENCE_GATE_ITEM = ITEM_FENCE_GATE.register("yellow_plank_fence_gate",
            () -> new BlockItemBase(ConstructionBlockFenceGate.YELLOW_PLANK_FENCE_GATE.get()));

}
