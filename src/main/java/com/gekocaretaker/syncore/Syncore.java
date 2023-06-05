package com.gekocaretaker.syncore;

import com.gekocaretaker.syncore.block.BlockInit;
import com.gekocaretaker.syncore.block.entity.BlockEntityInit;
import com.gekocaretaker.syncore.item.ItemInit;
import com.gekocaretaker.syncore.recipe.RecipeInit;
import com.gekocaretaker.syncore.screen.RockTumblerScreen;
import com.gekocaretaker.syncore.screen.ScreenMenuInit;
import com.gekocaretaker.syncore.stats.StatsInit;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
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

        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        BlockEntityInit.BLOCK_ENTITIES.register(modEventBus);
        ScreenMenuInit.MENUS.register(modEventBus);
        RecipeInit.RECIPE_TYPES.register(modEventBus);
        RecipeInit.SERIALIZERS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
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
}
