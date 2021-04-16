package com.legopitstop.construction.util;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.init.ConstructionBlocks;
import com.legopitstop.construction.init.block.ConstructionBlockFramed;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ConstructionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.WALL_OUTLET_UK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.WALL_OUTLET_US.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.WALL_SWITCH_US.get(),RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ConstructionBlocks.BLACK_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.BLUE_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.BROWN_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.CYAN_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.GRAY_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.GREEN_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.LIGHT_BLUE_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.LIGHT_GRAY_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.LIME_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.MAGENTA_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.ORANGE_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.PINK_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.PURPLE_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.RED_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.WHITE_GRASS_BLOCK.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlocks.YELLOW_GRASS_BLOCK.get(),RenderType.getCutout());

        // ACACIA Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_ACACIA_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_ACACIA_FRAMED.get(),RenderType.getCutout());
        // BIRCH Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_BIRCH_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_BIRCH_FRAMED.get(),RenderType.getCutout());
        // CRIMSON Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_CRIMSON_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_CRIMSON_FRAMED.get(),RenderType.getCutout());
        // DARK_OAK Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_DARK_OAK_FRAMED.get(),RenderType.getCutout());
        // JUNGLE Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_JUNGLE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_JUNGLE_FRAMED.get(),RenderType.getCutout());
        // OAK Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_OAK_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_OAK_FRAMED.get(),RenderType.getCutout());
        // SPRUCE Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_SPRUCE_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_SPRUCE_FRAMED.get(),RenderType.getCutout());
        // WARPED Framed
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLACK_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BLUE_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.BROWN_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.CYAN_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GRAY_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.GREEN_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_BLUE_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIGHT_GRAY_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.LIME_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.MAGENTA_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.ORANGE_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PINK_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.PURPLE_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.RED_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.WHITE_WARPED_FRAMED.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ConstructionBlockFramed.YELLOW_WARPED_FRAMED.get(),RenderType.getCutout());
    }
}