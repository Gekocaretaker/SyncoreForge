package com.gekocaretaker.syncore.mixin;

import com.gekocaretaker.syncore.util.SyncoreBootstrap;
import net.minecraft.server.Bootstrap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Bootstrap.class)
public abstract class EarlyStartupMixin {
    @Inject(at = @At("TAIL"), method = "bootStrap")
    private static void initRegistries(CallbackInfo ci) {
        SyncoreBootstrap.runEarlyStartup();
    }
}
