package com.gekocaretaker.syncore.compat.jei;

import com.gekocaretaker.syncore.recipe.RecipeInit;
import com.gekocaretaker.syncore.recipe.RockTumblerRecipe;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.runtime.IIngredientManager;
import mezz.jei.common.util.ErrorUtil;
import mezz.jei.library.plugins.vanilla.crafting.CategoryRecipeValidator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.Container;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.List;

public class SyncoreRecipes {
    private final RecipeManager recipeManager;
    private final IIngredientManager ingredientManager;

    public SyncoreRecipes(IIngredientManager ingredientManager) {
        Minecraft minecraft = Minecraft.getInstance();
        ErrorUtil.checkNotNull(minecraft, "minecraft");
        ClientLevel world = minecraft.level;
        ErrorUtil.checkNotNull(world, "minecraft world");
        this.recipeManager = world.getRecipeManager();
        this.ingredientManager = ingredientManager;
    }

    public List<RockTumblerRecipe> getTumblingRecipes(IRecipeCategory<RockTumblerRecipe> tumblingCategory) {
        CategoryRecipeValidator<RockTumblerRecipe> validator = new CategoryRecipeValidator<>(tumblingCategory, ingredientManager, 1);
        return getValidHandledRecipes(recipeManager, RecipeInit.TUMBLING.get(), validator);
    }

    private static <C extends Container, T extends Recipe<C>> List<T> getValidHandledRecipes(
            RecipeManager recipeManager,
            RecipeType<T> recipeType,
            CategoryRecipeValidator<T> validator
    ) {
        return recipeManager.getAllRecipesFor(recipeType)
                .stream()
                .filter(r -> validator.isRecipeValid(r) && validator.isRecipeHandled(r))
                .toList();
    }
}
