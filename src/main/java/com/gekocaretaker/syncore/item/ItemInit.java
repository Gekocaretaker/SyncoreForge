package com.gekocaretaker.syncore.item;

import com.gekocaretaker.syncore.Syncore;
import com.gekocaretaker.syncore.block.BlockInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Syncore.MODID);

    public static final RegistryObject<Item> ROCK_TUMBLER = ITEMS.register("rock_tumbler", () -> new BlockItem(BlockInit.ROCK_TUMBLER.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", () -> new NuggetFuelItem((new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA))));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_DIAMOND = ITEMS.register("raw_diamond", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_DIAMOND_BLOCK = ITEMS.register("raw_diamond_block", () -> new BlockItem(BlockInit.RAW_DIAMOND_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_NETHERITE_BLOCK = ITEMS.register("raw_netherite_block", () -> new BlockItem(BlockInit.RAW_NETHERITE_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_EMERALD = ITEMS.register("raw_emerald", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_EMERALD_BLOCK = ITEMS.register("raw_emerald_block", () -> new BlockItem(BlockInit.RAW_EMERALD_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_LAPIS_LAZULI = ITEMS.register("raw_lapis_lazuli", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_LAPIS_LAZULI_BLOCK = ITEMS.register("raw_lapis_lazuli_block", () -> new BlockItem(BlockInit.RAW_LAPIS_LAZULI_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> LAPIS_LAZULI_NUGGET = ITEMS.register("lapis_lazuli_nugget", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_REDSTONE = ITEMS.register("raw_redstone", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_REDSTONE_BLOCK = ITEMS.register("raw_redstone_block", () -> new BlockItem(BlockInit.RAW_REDSTONE_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> REDSTONE_GEMSTONE = ITEMS.register("redstone_gemstone", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> CHARCOAL_NUGGET = ITEMS.register("charcoal_nugget", () -> new NuggetFuelItem(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> CHARCOAL_BLOCK = ITEMS.register("charcoal_block", () -> new BlockFuelItem(BlockInit.CHARCOAL_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_QUARTZ = ITEMS.register("raw_quartz", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> RAW_QUARTZ_BLOCK = ITEMS.register("raw_quartz_block", () -> new BlockItem(BlockInit.RAW_QUARTZ_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> QUARTZ_NUGGET = ITEMS.register("quartz_nugget", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
    public static final RegistryObject<Item> AMETHYST_NUGGET = ITEMS.register("amethyst_nugget", () -> new Item(new Item.Properties().tab(CreativeTabInit.SYNCORE_VANILLA)));
}
