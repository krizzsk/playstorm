package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.util.n */
public class C5357n {

    /* renamed from: a */
    public static final Executor f14224a;

    /* renamed from: b */
    public static final Handler f14225b = new Handler(Looper.getMainLooper());

    /* renamed from: com.fyber.inneractive.sdk.util.n$a */
    public class C5358a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f14226a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "IAConcurrencyUtil#" + this.f14226a.getAndIncrement());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.n$b */
    public class C5359b implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IAlog.m16699a("rejectedExecution received for - %s", runnable);
        }
    }

    static {
        C5358a aVar = new C5358a();
        C5359b bVar = new C5359b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(32), aVar, bVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14224a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static void m16773a(Runnable runnable) {
        ((ThreadPoolExecutor) f14224a).execute(runnable);
    }
}
