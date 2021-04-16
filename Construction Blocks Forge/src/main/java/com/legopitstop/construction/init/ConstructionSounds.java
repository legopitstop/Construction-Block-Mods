package com.legopitstop.construction.init;

import com.legopitstop.construction.ConstructionMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionSounds {
    // Register Sounds
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            ConstructionMod.MOD_ID);

    // Sounds
    public static RegistryObject<SoundEvent> BLOCK_CELINGTILE_BREAK = SOUNDS.register("block_celingtile_break",
            () -> new SoundEvent(new ResourceLocation(ConstructionMod.MOD_ID,"block.celingtile.break")));
    public static RegistryObject<SoundEvent> BLOCK_CELINGTILE_STEP = SOUNDS.register("block_celingtile_step",
            () -> new SoundEvent(new ResourceLocation(ConstructionMod.MOD_ID,"block.celingtile.step")));
    public static RegistryObject<SoundEvent> BLOCK_CELINGTILE_PLACE = SOUNDS.register("block_celingtile_place",
            () -> new SoundEvent(new ResourceLocation(ConstructionMod.MOD_ID,"block.celingtile.place")));
    public static RegistryObject<SoundEvent> BLOCK_CELINGTILE_HIT = SOUNDS.register("block_celingtile_hit",
            () -> new SoundEvent(new ResourceLocation(ConstructionMod.MOD_ID,"block.celingtile.hit")));
    public static RegistryObject<SoundEvent> BLOCK_CELINGTILE_FALL = SOUNDS.register("block_celingtile_fall",
            () -> new SoundEvent(new ResourceLocation(ConstructionMod.MOD_ID,"block.celingtile.fall")));
}