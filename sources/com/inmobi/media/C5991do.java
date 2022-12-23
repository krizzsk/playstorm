package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.lang.ref.WeakReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.inmobi.media.do */
/* compiled from: VastNetworkClient */
final class C5991do {

    /* renamed from: d */
    public static final Executor f15227d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f15228e = C5991do.class.getSimpleName();

    /* renamed from: g */
    private static final int f15229g;

    /* renamed from: h */
    private static final int f15230h;

    /* renamed from: i */
    private static final int f15231i = ((f15229g * 2) + 1);

    /* renamed from: j */
    private static final ThreadFactory f15232j = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f15238a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "VastNetworkTask #" + this.f15238a.getAndIncrement());
        }
    };

    /* renamed from: k */
    private static final BlockingQueue<Runnable> f15233k = new LinkedBlockingQueue(128);
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6206gx f15234a;

    /* renamed from: b */
    WeakReference<C5990dn> f15235b;

    /* renamed from: c */
    long f15236c = 0;

    /* renamed from: f */
    private final CountDownLatch f15237f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f15229g = availableProcessors;
        f15230h = Math.max(2, Math.min(availableProcessors - 1, 4));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f15230h, f15231i, 30, TimeUnit.SECONDS, f15233k, f15232j);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15227d = threadPoolExecutor;
    }

    public C5991do(C5990dn dnVar, int i, CountDownLatch countDownLatch) {
        C6206gx gxVar = new C6206gx(ShareTarget.METHOD_GET, dnVar.f15222a);
        this.f15234a = gxVar;
        gxVar.f15715o = false;
        this.f15234a.f15720t = false;
        this.f15234a.f15712l = i;
        this.f15235b = new WeakReference<>(dnVar);
        this.f15237f = countDownLatch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35098a() {
        CountDownLatch countDownLatch = this.f15237f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: a */
    public final void mo35099a(C6207gy gyVar) {
        try {
            C6279iv.m18765a().mo35491a(this.f15234a.mo35394g());
            C6279iv.m18765a().mo35492b(gyVar.mo35399d());
        } catch (Exception unused) {
        } finally {
            mo35098a();
        }
    }
}
