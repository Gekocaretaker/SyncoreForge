package com.gekocaretaker.syncore;

import com.gekocaretaker.syncore.block.BlockInit;
import com.gekocaretaker.syncore.block.entity.BlockEntityInit;
import com.gekocaretaker.syncore.item.CreativeTabInit;
import com.gekocaretaker.syncore.item.ItemInit;
import com.gekocaretaker.syncore.recipe.RecipeInit;
import com.gekocaretaker.syncore.screen.RockTumblerScreen;
import com.gekocaretaker.syncore.screen.ScreenMenuInit;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Syncore.MODID)
public class Syncore {
    public static final String MODID = "syncore";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Syncore() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        CreativeTabInit.TABS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        BlockEntityInit.BLOCK_ENTITIES.register(modEventBus);
        ScreenMenuInit.MENUS.register(modEventBus);
        RecipeInit.RECIPE_TYPES.register(modEventBus);
        RecipeInit.SERIALIZERS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.debug(RecipeInit.TUMBLING.getId().toString());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            MenuScreens.register(ScreenMenuInit.ROCK_TUMBLER_MENU.get(), RockTumblerScreen::new);
        }
    }

    private void addCreative(BuildCreativeModeTabContentsEvent e) {
        if (e.getTabKey() == CreativeTabInit.SYNCORE_VANILLA.getKey()) {
            // Amethyst
            e.accept(ItemInit.AMETHYST_NUGGET);
            e.accept(Items.AMETHYST_SHARD);
            e.accept(Items.AMETHYST_BLOCK);
            // Charcoal
            e.accept(ItemInit.CHARCOAL_NUGGET);
            e.accept(Items.CHARCOAL);
            e.accept(ItemInit.CHARCOAL_BLOCK);
            // Coal
            e.accept(Items.COAL_ORE);
            e.accept(Items.DEEPSLATE_COAL_ORE);
            e.accept(ItemInit.COAL_NUGGET);
            e.accept(Items.COAL);
            e.accept(Items.COAL_BLOCK);
            // Copper
            e.accept(Items.COPPER_ORE);
            e.accept(Items.DEEPSLATE_COPPER_ORE);
            e.accept(Items.RAW_COPPER);
            e.accept(Items.RAW_COPPER_BLOCK);
            e.accept(ItemInit.COPPER_NUGGET);
            e.accept(Items.COPPER_INGOT);
            e.accept(Items.COPPER_BLOCK);
            // Diamond
            e.accept(Items.DIAMOND_ORE);
            e.accept(Items.DEEPSLATE_DIAMOND_ORE);
            e.accept(ItemInit.RAW_DIAMOND);
            e.accept(ItemInit.RAW_DIAMOND_BLOCK);
            e.accept(ItemInit.DIAMOND_NUGGET);
            e.accept(Items.DIAMOND);
            e.accept(Items.DIAMOND_BLOCK);
            // Emerald
            e.accept(Items.EMERALD_ORE);
            e.accept(Items.DEEPSLATE_EMERALD_ORE);
            e.accept(ItemInit.RAW_EMERALD);
            e.accept(ItemInit.RAW_EMERALD_BLOCK);
            e.accept(ItemInit.EMERALD_NUGGET);
            e.accept(Items.EMERALD);
            e.accept(Items.EMERALD_BLOCK);
            // Gold
            e.accept(Items.GOLD_ORE);
            e.accept(Items.DEEPSLATE_GOLD_ORE);
            e.accept(Items.NETHER_GOLD_ORE);
            e.accept(Items.RAW_GOLD);
            e.accept(Items.RAW_GOLD_BLOCK);
            e.accept(Items.GOLD_NUGGET);
            e.accept(Items.GOLD_INGOT);
            e.accept(Items.GOLD_BLOCK);
            // Iron
            e.accept(Items.IRON_ORE);
            e.accept(Items.DEEPSLATE_IRON_ORE);
            e.accept(Items.RAW_IRON);
            e.accept(Items.RAW_IRON_BLOCK);
            e.accept(Items.IRON_NUGGET);
            e.accept(Items.IRON_INGOT);
            e.accept(Items.IRON_BLOCK);
            // Lapis Lazuli
            e.accept(Items.LAPIS_ORE);
            e.accept(Items.DEEPSLATE_LAPIS_ORE);
            e.accept(ItemInit.RAW_LAPIS_LAZULI);
            e.accept(ItemInit.RAW_LAPIS_LAZULI_BLOCK);
            e.accept(ItemInit.LAPIS_LAZULI_NUGGET);
            e.accept(Items.LAPIS_LAZULI);
            e.accept(Items.LAPIS_BLOCK);
            // Netherite
            e.accept(Items.ANCIENT_DEBRIS);
            e.accept(Items.NETHERITE_SCRAP);
            e.accept(ItemInit.RAW_NETHERITE_BLOCK);
            e.accept(ItemInit.NETHERITE_NUGGET);
            e.accept(Items.NETHERITE_INGOT);
            e.accept(Items.NETHERITE_BLOCK);
            // Quartz
            e.accept(Items.NETHER_QUARTZ_ORE);
            e.accept(ItemInit.RAW_QUARTZ);
            e.accept(ItemInit.RAW_QUARTZ_BLOCK);
            e.accept(ItemInit.QUARTZ_NUGGET);
            e.accept(Items.QUARTZ);
            e.accept(Items.QUARTZ_BLOCK);
            // Redstone
            e.accept(Items.REDSTONE_ORE);
            e.accept(Items.DEEPSLATE_REDSTONE_ORE);
            e.accept(ItemInit.RAW_REDSTONE);
            e.accept(ItemInit.RAW_REDSTONE_BLOCK);
            e.accept(Items.REDSTONE);
            e.accept(ItemInit.REDSTONE_GEMSTONE);
            e.accept(Items.REDSTONE_BLOCK);
        }
    }
}
