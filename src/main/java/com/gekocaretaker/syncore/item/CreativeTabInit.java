package com.gekocaretaker.syncore.item;

import com.gekocaretaker.syncore.Syncore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Syncore.MODID);

    public static RegistryObject<CreativeModeTab> SYNCORE_VANILLA = TABS.register("syncore_vanilla", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.RAW_DIAMOND.get()))
                    .title(Component.translatable("itemGroup.syncore_vanilla")).build());
}
