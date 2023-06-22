package com.gekocaretaker.syncore.block;

import com.gekocaretaker.syncore.Syncore;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Syncore.MODID);

    public static final RegistryObject<Block> ROCK_TUMBLER = BLOCKS.register("rock_tumbler",
            () -> new RockTumblerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(4.0f, 5.0f).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> RAW_DIAMOND_BLOCK = BLOCKS.register("raw_diamond_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_NETHERITE_BLOCK = BLOCKS.register("raw_netherite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_EMERALD_BLOCK = BLOCKS.register("raw_emerald_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_LAPIS_LAZULI_BLOCK = BLOCKS.register("raw_lapis_lazuli_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_REDSTONE_BLOCK = BLOCKS.register("raw_redstone_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0f, 6.0f)));
    public static final RegistryObject<Block> RAW_QUARTZ_BLOCK = BLOCKS.register("raw_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));
}
