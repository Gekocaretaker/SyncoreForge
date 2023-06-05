package com.gekocaretaker.syncore.util;

import com.gekocaretaker.syncore.stats.StatsInit;

public final class SyncoreBootstrap {
    private volatile static boolean bootstrapped;

    private SyncoreBootstrap() {}

    public static void runEarlyStartup() {
        if (!bootstrapped) {
            bootstrapped = true;
            StatsInit.init();
        }
    }
}
