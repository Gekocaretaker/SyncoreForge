package com.gekocaretaker.syncore.screen;

import com.gekocaretaker.syncore.Syncore;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ScreenMenuInit {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Syncore.MODID);

    public static final RegistryObject<MenuType<RockTumblerMenu>> ROCK_TUMBLER_MENU = MENUS.register("rock_tumbler", () -> new MenuType<>(RockTumblerMenu::new, FeatureFlagSet.of()));
}
