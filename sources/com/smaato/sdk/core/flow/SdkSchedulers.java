package com.smaato.sdk.core.flow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SdkSchedulers implements Schedulers {
    private final ExecutorService compService = Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new SdkThreadFactory("io", 1));
    private final ExecutorService ioService = Executors.newCachedThreadPool(new SdkThreadFactory("io", 1));
    private final ExecutorService mainService = new MainScheduler();

    /* renamed from: io */
    public final ExecutorService mo68934io() {
        return this.ioService;
    }

    public final ExecutorService comp() {
        return this.compService;
    }

    public final ExecutorService main() {
        return this.mainService;
    }
}
