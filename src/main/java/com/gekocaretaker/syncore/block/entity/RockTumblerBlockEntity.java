package com.gekocaretaker.syncore.block.entity;

import com.gekocaretaker.syncore.recipe.RecipeInit;
import com.gekocaretaker.syncore.screen.RockTumblerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class RockTumblerBlockEntity extends AbstractFurnaceBlockEntity {
    public RockTumblerBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.ROCK_TUMBLER_BLOCK_ENTITY.get(), pos, state, RecipeInit.TUMBLING.get());
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.rock_tumbler");
    }

    @Override
    protected int getBurnDuration(ItemStack p_58343_) {
        return super.getBurnDuration(p_58343_) / 2;
    }

    @Override
    protected AbstractContainerMenu createMenu(int p_58627_, Inventory p_58628_) {
        return new RockTumblerMenu(p_58627_, p_58628_, this, this.dataAccess);
    }
}
