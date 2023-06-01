package com.gekocaretaker.syncore.block.entity;

import com.gekocaretaker.syncore.Syncore;
import com.gekocaretaker.syncore.block.BlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Syncore.MODID);

    public static final RegistryObject<BlockEntityType<RockTumblerBlockEntity>> ROCK_TUMBLER_BLOCK_ENTITY = BLOCK_ENTITIES.register("rock_tumbler", () -> BlockEntityType.Builder.of(RockTumblerBlockEntity::new, BlockInit.ROCK_TUMBLER.get()).build(null));
}
