package com.gekocaretaker.syncore.recipe;

import com.gekocaretaker.syncore.block.BlockInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class RockTumblerRecipe extends AbstractCookingRecipe {
    public RockTumblerRecipe(ResourceLocation p_43793_, String p_43794_, Ingredient p_43795_, ItemStack p_43796_, float p_43797_, int p_43798_) {
        super(RecipeInit.TUMBLING.get(), p_43793_, p_43794_, p_43795_, p_43796_, p_43797_, p_43798_);
    }

    public ItemStack getToastSymbol() {
        return new ItemStack(BlockInit.ROCK_TUMBLER.get());
    }

    public RecipeSerializer<?> getSerializer() {
        return RecipeInit.TUMBLING_SERIALIZER.get();
    }
}
