package com.gekocaretaker.syncore.screen;


import com.gekocaretaker.syncore.Syncore;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RockTumblerScreen extends AbstractFurnaceScreen<RockTumblerMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Syncore.MODID, "textures/gui/container/rock_tumbler.png");

    public RockTumblerScreen(RockTumblerMenu p_98045_, Inventory p_98046_, Component p_98047_) {
        super(p_98045_, new SmeltingRecipeBookComponent(), p_98046_, p_98047_, TEXTURE);
    }
}
