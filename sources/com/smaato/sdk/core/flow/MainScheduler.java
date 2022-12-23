package com.smaato.sdk.core.flow;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

class MainScheduler extends AbstractExecutorService {
    private final Handler handler = HandlerCompat.create(Looper.getMainLooper());

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
    }

    MainScheduler() {
    }

    public void execute(Runnable runnable) {
        this.handler.post(runnable);
    }

    public List<Runnable> shutdownNow() {
        return Collections.emptyList();
    }
}
