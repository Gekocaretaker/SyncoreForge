package com.gekocaretaker.syncore.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.common.extensions.IForgeItem;
import org.jetbrains.annotations.Nullable;

public class NuggetFuelItem extends Item implements IForgeItem {
    public NuggetFuelItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 200;
    }
}
