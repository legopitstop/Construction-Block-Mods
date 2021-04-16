package com.legopitstop.construction.init.block;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.*;
import com.legopitstop.construction.blocks.custom.*;
import com.legopitstop.construction.blocks.scaffolding.CrimsonScaffoldingBlock;
import com.legopitstop.construction.blocks.scaffolding.WarpedScaffoldingBlock;
import com.legopitstop.construction.blocks.scaffolding.WoodScaffolding;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlockColum {
    // Register blocks
    public static DeferredRegister<Block> BLOCK_COLUM = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // Other Blocks
    // Concrete Pillars
    public static final RegistryObject<Block> BLACK_CONCRETE_PILLAR = BLOCK_COLUM.register("black_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_PILLAR = BLOCK_COLUM.register("blue_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_PILLAR = BLOCK_COLUM.register("brown_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_PILLAR = BLOCK_COLUM.register("cyan_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_PILLAR = BLOCK_COLUM.register("gray_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_PILLAR = BLOCK_COLUM.register("green_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_PILLAR = BLOCK_COLUM.register("light_blue_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_PILLAR = BLOCK_COLUM.register("light_gray_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> LIME_CONCRETE_PILLAR = BLOCK_COLUM.register("lime_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_PILLAR = BLOCK_COLUM.register("magenta_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_PILLAR = BLOCK_COLUM.register("orange_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> PINK_CONCRETE_PILLAR = BLOCK_COLUM.register("pink_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_PILLAR = BLOCK_COLUM.register("purple_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> RED_CONCRETE_PILLAR = BLOCK_COLUM.register("red_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_PILLAR = BLOCK_COLUM.register("white_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_PILLAR = BLOCK_COLUM.register("yellow_concrete_pillar", StoneColmn::new);
    // wood pillar
    public static final RegistryObject<Block> ACACIA_PILLAR = BLOCK_COLUM.register("acacia_pillar", WoodColmn::new);
    public static final RegistryObject<Block> BIRCH_PILLAR = BLOCK_COLUM.register("birch_pillar", WoodColmn::new);
    public static final RegistryObject<Block> CRIMSON_PILLAR = BLOCK_COLUM.register("crimson_pillar", NetherWoodColmn::new);
    public static final RegistryObject<Block> DARK_OAK_PILLAR = BLOCK_COLUM.register("dark_oak_pillar", WoodColmn::new);
    public static final RegistryObject<Block> JUNGLE_PILLAR = BLOCK_COLUM.register("jungle_pillar", WoodColmn::new);
    public static final RegistryObject<Block> OAK_PILLAR = BLOCK_COLUM.register("oak_pillar", WoodColmn::new);
    public static final RegistryObject<Block> SPRUCE_PILLAR = BLOCK_COLUM.register("spruce_pillar", WoodColmn::new);
    public static final RegistryObject<Block> WARPED_PILLAR = BLOCK_COLUM.register("warped_pillar", NetherWoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_ACACIA_PILLAR = BLOCK_COLUM.register("stripped_acacia_pillar", WoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_BIRCH_PILLAR = BLOCK_COLUM.register("stripped_birch_pillar", WoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_CRIMSON_PILLAR = BLOCK_COLUM.register("stripped_crimson_pillar", NetherWoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_PILLAR = BLOCK_COLUM.register("stripped_dark_oak_pillar", WoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_PILLAR = BLOCK_COLUM.register("stripped_jungle_pillar", WoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_OAK_PILLAR = BLOCK_COLUM.register("stripped_oak_pillar", WoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_PILLAR = BLOCK_COLUM.register("stripped_spruce_pillar", WoodColmn::new);
    public static final RegistryObject<Block> STRIPPED_WARPED_PILLAR = BLOCK_COLUM.register("stripped_warped_pillar", NetherWoodColmn::new);
}