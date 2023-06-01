package com.gekocaretaker.syncore.recipe;

import com.gekocaretaker.syncore.Syncore;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeInit {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Syncore.MODID);
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Syncore.MODID);

    public static final RegistryObject<RecipeType<RockTumblerRecipe>> TUMBLING = RECIPE_TYPES.register("tumbling", () -> new RecipeType<RockTumblerRecipe>() {
        @Override
        public String toString() {
            return "tumbling";
        }
    });
    public static final RegistryObject<SimpleCookingSerializer<RockTumblerRecipe>> TUMBLING_SERIALIZER = SERIALIZERS.register("tumbling", () -> new SimpleCookingSerializer<>(RockTumblerRecipe::new, 100));
}
