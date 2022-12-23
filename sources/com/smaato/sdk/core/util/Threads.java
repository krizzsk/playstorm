package com.smaato.sdk.core.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.util.p382fi.NullableSupplier;
import com.smaato.sdk.core.util.p382fi.Supplier;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class Threads {
    private static Executor bgExecutor;
    private static ScheduledExecutorService delayExecutor;
    static volatile Handler uiHandler;

    private Threads() {
    }

    public static void ensureMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method should be called only on MainThread");
        }
    }

    public static void ensureNotMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("This method should NOT be called on MainThread");
        }
    }

    public static boolean isHandlerThread(Handler handler) {
        return handler.getLooper().getThread() == Thread.currentThread();
    }

    public static void ensureInvokedOnHandlerThread(Handler handler, Runnable runnable) {
        if (isHandlerThread(handler)) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void ensureHandlerThread(Handler handler) {
        if (!isHandlerThread(handler)) {
            throw new IllegalStateException("This method should be called only from a thread bound to the handler");
        }
    }

    public static Handler newUiHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean runOnUi(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return getUiHandler().post(runnable);
        }
        runnable.run();
        return true;
    }

    public static boolean runOnNextUiFrame(Runnable runnable) {
        return getUiHandler().post(runnable);
    }

    public static boolean runOnHandlerThreadBlocking(Handler handler, Runnable runnable) {
        if (isHandlerThread(handler)) {
            runnable.run();
            return true;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean post = handler.post(new Runnable(runnable, atomicBoolean) {
            public final /* synthetic */ Runnable f$0;
            public final /* synthetic */ AtomicBoolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                Threads.lambda$runOnHandlerThreadBlocking$0(this.f$0, this.f$1);
            }
        });
        if (post) {
            do {
            } while (!atomicBoolean.get());
        }
        return post;
    }

    static /* synthetic */ void lambda$runOnHandlerThreadBlocking$0(Runnable runnable, AtomicBoolean atomicBoolean) {
        runnable.run();
        atomicBoolean.set(true);
    }

    public static <T> T runOnHandlerThreadBlocking(Handler handler, Supplier<T> supplier) {
        if (isHandlerThread(handler)) {
            return supplier.get();
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference();
        if (handler.post(new Runnable(atomicReference, supplier, atomicBoolean) {
            public final /* synthetic */ AtomicReference f$0;
            public final /* synthetic */ Supplier f$1;
            public final /* synthetic */ AtomicBoolean f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                Threads.lambda$runOnHandlerThreadBlocking$1(this.f$0, this.f$1, this.f$2);
            }
        })) {
            do {
            } while (!atomicBoolean.get());
        }
        return atomicReference.get();
    }

    static /* synthetic */ void lambda$runOnHandlerThreadBlocking$1(AtomicReference atomicReference, Supplier supplier, AtomicBoolean atomicBoolean) {
        atomicReference.set(supplier.get());
        atomicBoolean.set(true);
    }

    public static boolean runOnUiBlocking(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean post = getUiHandler().post(new Runnable(runnable, atomicBoolean) {
            public final /* synthetic */ Runnable f$0;
            public final /* synthetic */ AtomicBoolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                Threads.lambda$runOnUiBlocking$2(this.f$0, this.f$1);
            }
        });
        if (post) {
            do {
            } while (!atomicBoolean.get());
        }
        return post;
    }

    static /* synthetic */ void lambda$runOnUiBlocking$2(Runnable runnable, AtomicBoolean atomicBoolean) {
        runnable.run();
        atomicBoolean.set(true);
    }

    public static <T> T runOnUiBlocking(NullableSupplier<T> nullableSupplier) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return nullableSupplier.get();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        if (getUiHandler().post(new Runnable(atomicReference, nullableSupplier, countDownLatch) {
            public final /* synthetic */ AtomicReference f$0;
            public final /* synthetic */ NullableSupplier f$1;
            public final /* synthetic */ CountDownLatch f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                Threads.lambda$runOnUiBlocking$3(this.f$0, this.f$1, this.f$2);
            }
        })) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                String name = LogDomain.CORE.name();
                Log.e(name, "Internal error while executing on MainThread: " + e.getMessage());
                return null;
            }
        }
        return atomicReference.get();
    }

    static /* synthetic */ void lambda$runOnUiBlocking$3(AtomicReference atomicReference, NullableSupplier nullableSupplier, CountDownLatch countDownLatch) {
        atomicReference.set(nullableSupplier.get());
        countDownLatch.countDown();
    }

    public static void scheduleDelayed(Long l, Runnable runnable) {
        getDelayExecutor().schedule(runnable, l.longValue(), TimeUnit.MILLISECONDS);
    }

    public static void runOnBackgroundThread(Runnable runnable) {
        getBackgroundExecutor().execute(runnable);
    }

    private static Handler getUiHandler() {
        if (uiHandler == null) {
            synchronized (Threads.class) {
                if (uiHandler == null) {
                    uiHandler = newUiHandler();
                }
            }
        }
        return uiHandler;
    }

    private static synchronized ScheduledExecutorService getDelayExecutor() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (Threads.class) {
            if (delayExecutor == null) {
                delayExecutor = Executors.newSingleThreadScheduledExecutor();
            }
            scheduledExecutorService = delayExecutor;
        }
        return scheduledExecutorService;
    }

    private static synchronized Executor getBackgroundExecutor() {
        Executor executor;
        synchronized (Threads.class) {
            if (bgExecutor == null) {
                bgExecutor = Executors.newSingleThreadExecutor();
            }
            executor = bgExecutor;
        }
        return executor;
    }
}
