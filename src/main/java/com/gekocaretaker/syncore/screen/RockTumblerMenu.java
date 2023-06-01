package com.gekocaretaker.syncore.screen;

import com.gekocaretaker.syncore.recipe.RecipeInit;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;

public class RockTumblerMenu extends AbstractFurnaceMenu {
    public RockTumblerMenu(int id, Inventory inv) {
        super(ScreenMenuInit.ROCK_TUMBLER_MENU.get(), RecipeInit.TUMBLING.get(), RecipeBookType.FURNACE, id, inv);
    }

    public RockTumblerMenu(int id, Inventory inv, Container container, ContainerData data) {
        super(ScreenMenuInit.ROCK_TUMBLER_MENU.get(), RecipeInit.TUMBLING.get(), RecipeBookType.FURNACE, id, inv, container, data);
    }
}
