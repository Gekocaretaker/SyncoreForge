package com.gekocaretaker.syncore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabInit {
    public static final CreativeModeTab SYNCORE_VANILLA = new CreativeModeTab("syncore_vanilla") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.RAW_DIAMOND.get());
        }
    };
}
