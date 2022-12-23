package com.amazon.device.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class DtbThreadService {
    private static long SCHEDULE_INTERVAL = 10;
    /* access modifiers changed from: private */
    public static DtbThreadService threadServiceInstance = new DtbThreadService();
    /* access modifiers changed from: private */
    public final ExecutorService executor = Executors.newFixedThreadPool(1);
    /* access modifiers changed from: private */
    public ScheduledExecutorService scheduler;
    /* access modifiers changed from: private */
    public boolean shutdownInProgress = false;

    private DtbThreadService() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                boolean unused = DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the fixed thread pool");
                DtbThreadService.this.executor.shutdown();
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                boolean unused = DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the thread pool");
                if (DtbThreadService.this.scheduler != null) {
                    DtbThreadService.this.scheduler.shutdown();
                }
            }
        });
    }

    static DtbThreadService getInstance() {
        return threadServiceInstance;
    }

    /* access modifiers changed from: package-private */
    public void execute(Runnable runnable) {
        try {
            if (!this.shutdownInProgress) {
                this.executor.execute(runnable);
            }
        } catch (InternalError e) {
            handleError(e);
        }
    }

    /* access modifiers changed from: package-private */
    public void schedule(Runnable runnable) {
        try {
            if (!this.shutdownInProgress) {
                if (this.scheduler == null) {
                    this.scheduler = Executors.newScheduledThreadPool(1);
                }
                this.scheduler.schedule(runnable, SCHEDULE_INTERVAL, TimeUnit.SECONDS);
            }
        } catch (InternalError e) {
            handleError(e);
        }
    }

    private void handleError(InternalError internalError) {
        internalError.getLocalizedMessage().contains("shutdown");
        throw internalError;
    }

    static void executeOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
