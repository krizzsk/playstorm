package com.smaato.sdk.core.flow;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class SdkThreadFactory implements ThreadFactory {
    private static final AtomicInteger sPoolId = new AtomicInteger();
    private final int poolId = sPoolId.incrementAndGet();
    private final AtomicInteger threadId = new AtomicInteger();
    private final String threadName;
    private final int threadPriority;

    public SdkThreadFactory(String str, int i) {
        this.threadName = str;
        this.threadPriority = i;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("pool-" + this.poolId + "-" + this.threadName + "-" + this.threadId.incrementAndGet());
        thread.setPriority(this.threadPriority);
        thread.setDaemon(true);
        return thread;
    }
}
