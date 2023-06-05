package com.gekocaretaker.syncore.stats;

import com.gekocaretaker.syncore.Syncore;
import net.minecraft.resources.ResourceLocation;

public enum SyncoreStats {
    InteractWithRockTumbler("interact_with_rock_tumbler");

    private final ResourceLocation registryName;

    SyncoreStats(String id) {
        this.registryName = new ResourceLocation(Syncore.MODID, id);
    }

    public ResourceLocation getRegistryName() {
        return registryName;
    }
}
