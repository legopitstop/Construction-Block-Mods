package com.legopitstop.construction.init.blockItem;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.init.block.ConstructionBlockColum;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItemColmn {
    // Register items & blocks
    public static DeferredRegister<Item> ITEM_COLUM = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Other Block Items
    // Concrete Pillar
    public static final RegistryObject<Item> BLACK_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("black_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.BLACK_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("blue_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.BLUE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("brown_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.BROWN_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("cyan_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.CYAN_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("gray_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.GRAY_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("green_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.GREEN_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("light_blue_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.LIGHT_BLUE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("light_gray_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.LIGHT_GRAY_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("lime_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.LIME_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("magenta_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.MAGENTA_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("orange_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.ORANGE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("pink_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.PINK_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("purple_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.PURPLE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> RED_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("red_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.RED_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("white_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.WHITE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_PILLAR_ITEM = ITEM_COLUM.register("yellow_concrete_pillar", () -> new BlockItemBase(ConstructionBlockColum.YELLOW_CONCRETE_PILLAR.get()));
    // Wooden pillar
    public static final RegistryObject<Item> ACACIA_PILLAR_ITEM = ITEM_COLUM.register("acacia_pillar", () -> new BlockItemBase(ConstructionBlockColum.ACACIA_PILLAR.get()));
    public static final RegistryObject<Item> BIRCH_PILLAR_ITEM = ITEM_COLUM.register("birch_pillar", () -> new BlockItemBase(ConstructionBlockColum.BIRCH_PILLAR.get()));
    public static final RegistryObject<Item> CRIMSON_PILLAR_ITEM = ITEM_COLUM.register("crimson_pillar", () -> new BlockItemBase(ConstructionBlockColum.CRIMSON_PILLAR.get()));
    public static final RegistryObject<Item> DARK_OAK_PILLAR_ITEM = ITEM_COLUM.register("dark_oak_pillar", () -> new BlockItemBase(ConstructionBlockColum.DARK_OAK_PILLAR.get()));
    public static final RegistryObject<Item> JUNGLE_PILLAR_ITEM = ITEM_COLUM.register("jungle_pillar", () -> new BlockItemBase(ConstructionBlockColum.JUNGLE_PILLAR.get()));
    public static final RegistryObject<Item> OAK_PILLAR_ITEM = ITEM_COLUM.register("oak_pillar", () -> new BlockItemBase(ConstructionBlockColum.OAK_PILLAR.get()));
    public static final RegistryObject<Item> SPRUCE_PILLAR_ITEM = ITEM_COLUM.register("spruce_pillar", () -> new BlockItemBase(ConstructionBlockColum.SPRUCE_PILLAR.get()));
    public static final RegistryObject<Item> WARPED_PILLAR_ITEM = ITEM_COLUM.register("warped_pillar", () -> new BlockItemBase(ConstructionBlockColum.WARPED_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_PILLAR_ITEM = ITEM_COLUM.register("stripped_acacia_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_ACACIA_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_PILLAR_ITEM = ITEM_COLUM.register("stripped_birch_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_BIRCH_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_PILLAR_ITEM = ITEM_COLUM.register("stripped_crimson_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_CRIMSON_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_PILLAR_ITEM = ITEM_COLUM.register("stripped_dark_oak_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_DARK_OAK_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_PILLAR_ITEM = ITEM_COLUM.register("stripped_jungle_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_JUNGLE_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_OAK_PILLAR_ITEM = ITEM_COLUM.register("stripped_oak_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_OAK_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_PILLAR_ITEM = ITEM_COLUM.register("stripped_spruce_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_SPRUCE_PILLAR.get()));
    public static final RegistryObject<Item> STRIPPED_WARPED_PILLAR_ITEM = ITEM_COLUM.register("stripped_warped_pillar", () -> new BlockItemBase(ConstructionBlockColum.STRIPPED_WARPED_PILLAR.get()));
}