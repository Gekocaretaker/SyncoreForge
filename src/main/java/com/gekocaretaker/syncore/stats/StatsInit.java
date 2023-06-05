package com.gekocaretaker.syncore.stats;

import com.gekocaretaker.syncore.Syncore;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;

public final class StatsInit {
    private StatsInit() {}

    public static void init() {
        for (SyncoreStats stat : SyncoreStats.values()) {
            ResourceLocation registryName = stat.getRegistryName();
            Registry.register(Registry.CUSTOM_STAT, registryName.getPath(), registryName);
            Stats.CUSTOM.get(registryName, StatFormatter.DEFAULT);
        }
    }
}
