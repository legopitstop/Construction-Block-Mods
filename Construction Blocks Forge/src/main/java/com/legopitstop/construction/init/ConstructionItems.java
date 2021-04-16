package com.legopitstop.construction.init;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.ItemBase;
import com.legopitstop.construction.item.HammerItem;
import com.legopitstop.construction.item.JackHammerItem;
import com.legopitstop.construction.item.PaintRoller;
import com.legopitstop.construction.item.WrenchItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItems {

    // Register items & blocks
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Tools
    public static final RegistryObject<HammerItem> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new HammerItem(ItemTier.WOOD, 1, 2F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<HammerItem> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(ItemTier.STONE, 1, 2f, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<HammerItem> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(ItemTier.IRON, 1, 2f, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<HammerItem> GOLDEN_HAMMER = ITEMS.register("golden_hammer",
            () -> new HammerItem(ItemTier.GOLD, 1, 2f, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<HammerItem> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(ItemTier.DIAMOND, 1, 2f, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<HammerItem> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(ItemTier.NETHERITE, 1, 2f, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));

    public static final RegistryObject<JackHammerItem> JACKHAMMER = ITEMS.register("jackhammer",
            () -> new JackHammerItem(ItemTier.DIAMOND, 1, 0f, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));

    // Items
    public static final RegistryObject<Item> GYPSUM_DUST = ITEMS.register("gypsum_dust", ItemBase::new);
    public static final RegistryObject<Item> SANDPAPER = ITEMS.register("sandpaper", ItemBase::new);
    public static final RegistryObject<Item> WET_SANDPAPER = ITEMS.register("wet_sandpaper", ItemBase::new);
    public static final RegistryObject<Item> SHEETROCK_PANEL = ITEMS.register("sheetrock_panel", ItemBase::new);

    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench", ItemBase::new);
    // Brick
    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick", ItemBase::new);
    public static final RegistryObject<Item> BLUE_BRICK = ITEMS.register("blue_brick", ItemBase::new);
    public static final RegistryObject<Item> BROWN_BRICK = ITEMS.register("brown_brick", ItemBase::new);
    public static final RegistryObject<Item> CYAN_BRICK = ITEMS.register("cyan_brick", ItemBase::new);
    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick", ItemBase::new);
    public static final RegistryObject<Item> GREEN_BRICK = ITEMS.register("green_brick", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick", ItemBase::new);
    public static final RegistryObject<Item> LIME_BRICK = ITEMS.register("lime_brick", ItemBase::new);
    public static final RegistryObject<Item> MAGENTA_BRICK = ITEMS.register("magenta_brick", ItemBase::new);
    public static final RegistryObject<Item> ORANGE_BRICK = ITEMS.register("orange_brick", ItemBase::new);
    public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick", ItemBase::new);
    public static final RegistryObject<Item> PURPLE_BRICK = ITEMS.register("purple_brick", ItemBase::new);
    public static final RegistryObject<Item> RED_BRICK = ITEMS.register("red_brick", ItemBase::new);
    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("white_brick", ItemBase::new);
    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick", ItemBase::new);

    // Dyed Paper
    public static final RegistryObject<Item> BLACK_DYED_PAPER = ITEMS.register("black_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> BLUE_DYED_PAPER = ITEMS.register("blue_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> BROWN_DYED_PAPER = ITEMS.register("brown_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> CYAN_DYED_PAPER = ITEMS.register("cyan_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> GRAY_DYED_PAPER = ITEMS.register("gray_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> GREEN_DYED_PAPER = ITEMS.register("green_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_BLUE_DYED_PAPER = ITEMS.register("light_blue_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_GRAY_DYED_PAPER = ITEMS.register("light_gray_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> LIME_DYED_PAPER = ITEMS.register("lime_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> MAGENTA_DYED_PAPER = ITEMS.register("magenta_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> ORANGE_DYED_PAPER = ITEMS.register("orange_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> PINK_DYED_PAPER = ITEMS.register("pink_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> PURPLE_DYED_PAPER = ITEMS.register("purple_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> RED_DYED_PAPER = ITEMS.register("red_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> WHITE_DYED_PAPER = ITEMS.register("white_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> YELLOW_DYED_PAPER = ITEMS.register("yellow_dyed_paper", ItemBase::new);
    // Nugget
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", ItemBase::new);
    public static final RegistryObject<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", ItemBase::new);
    // Stick
    public static final RegistryObject<Item> GOLDEN_STICK = ITEMS.register("golden_stick", ItemBase::new);
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_STICK = ITEMS.register("diamond_stick", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_STICK = ITEMS.register("netherite_stick", ItemBase::new);
    public static final RegistryObject<Item> RUBY_STICK = ITEMS.register("ruby_stick", ItemBase::new);
    public static final RegistryObject<Item> EMERALD_STICK = ITEMS.register("emerald_stick", ItemBase::new);
    // Paint Roller
    public static final RegistryObject<Item> PAINT_ROLLER = ITEMS.register("paint_roller",ItemBase::new);


    public static final RegistryObject<PaintRoller> BLACK_PAINT_ROLLER = ITEMS.register("black_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> BLUE_PAINT_ROLLER = ITEMS.register("blue_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> BROWN_PAINT_ROLLER = ITEMS.register("brown_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> CYAN_PAINT_ROLLER = ITEMS.register("cyan_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> GRAY_PAINT_ROLLER = ITEMS.register("gray_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> GREEN_PAINT_ROLLER = ITEMS.register("green_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> LIGHT_BLUE_PAINT_ROLLER = ITEMS.register("light_blue_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> LIGHT_GRAY_PAINT_ROLLER = ITEMS.register("light_gray_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> LIME_PAINT_ROLLER = ITEMS.register("lime_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> MAGENTA_PAINT_ROLLER = ITEMS.register("magenta_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> ORANGE_PAINT_ROLLER = ITEMS.register("orange_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> PINK_PAINT_ROLLER = ITEMS.register("pink_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> PURPLE_PAINT_ROLLER = ITEMS.register("purple_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> RED_PAINT_ROLLER = ITEMS.register("red_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> WHITE_PAINT_ROLLER = ITEMS.register("white_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));
    public static final RegistryObject<PaintRoller> YELLOW_PAINT_ROLLER = ITEMS.register("yellow_paint_roller",
            () -> new PaintRoller(ItemTier.IRON, -3, -3F, new Item.Properties().group(ConstructionMod.TAB_ITEMS)));

}