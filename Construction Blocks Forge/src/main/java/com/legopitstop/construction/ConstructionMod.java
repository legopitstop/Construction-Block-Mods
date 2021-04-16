package com.legopitstop.construction;

import com.legopitstop.construction.init.*;
import com.legopitstop.construction.init.block.*;
import com.legopitstop.construction.init.blockItem.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("const")
public class ConstructionMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "const";

    public ConstructionMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
  
        ConstructionSounds.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ConstructionBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockSlab.BLOCK_SLAB.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockStairs.BLOCK_STAIRS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockWall.BLOCK_WALL.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockButton.BLOCK_BUTTON.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockFence.BLOCK_FENCE.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockFenceGate.BLOCK_FENCE_GATE.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockFramed.BLOCK_FRAMED.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockPressurePlate.BLOCK_PRESSURE_PLATE.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockColum.BLOCK_COLUM.register(FMLJavaModLoadingContext.get().getModEventBus());

        ConstructionItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemButton.ITEM_BUTTON.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemFence.ITEM_FENCE.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemFenceGate.ITEM_FENCE_GATE.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemPressurePlate.ITEM_PRESSURE_PLATE.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemSlab.ITEM_SLAB.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemStairs.ITEM_STAIRS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemWall.ITEM_WALL.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemFramed.ITEM_FRAMED.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItemColmn.ITEM_COLUM.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlockItems.ITEM_BLOCK.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Custom tab
    public static final ItemGroup TAB_BLOCKS = new ItemGroup("constructionBlocksTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ConstructionBlocks.CAUTION_BLOCK.get());
        }
        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }.setBackgroundImageName("item_search.png");

    public static final ItemGroup TAB_ITEMS = new ItemGroup("constructionItemsTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ConstructionItems.IRON_HAMMER.get());
        }
    };
}
