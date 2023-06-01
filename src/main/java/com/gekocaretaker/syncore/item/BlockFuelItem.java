package com.gekocaretaker.syncore.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.extensions.IForgeItem;
import org.jetbrains.annotations.Nullable;

public class BlockFuelItem extends BlockItem implements IForgeItem {
    public BlockFuelItem(Block p_40565_, Properties p_40566_) {
        super(p_40565_, p_40566_);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 16000;
    }
}
