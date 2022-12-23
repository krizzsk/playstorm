package com.tapjoy.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.hx */
public final class C11745hx {

    /* renamed from: a */
    public static final ScheduledExecutorService f28608a = Executors.newScheduledThreadPool(1);

    /* renamed from: b */
    public static final CountDownLatch f28609b = new CountDownLatch(1);

    /* renamed from: c */
    public static final CountDownLatch f28610c = new CountDownLatch(1);

    /* renamed from: d */
    private static final Runnable f28611d = new Runnable() {
        public final void run() {
            if (C11841u.m34411c()) {
                C11745hx.f28609b.countDown();
            } else if (C11841u.m34409a()) {
                C11745hx.f28609b.countDown();
            } else {
                C11745hx.f28608a.schedule(this, 300, TimeUnit.SECONDS);
            }
        }
    };

    /* renamed from: e */
    private static String f28612e;

    /* renamed from: f */
    private static boolean f28613f;

    /* renamed from: a */
    public static void m34124a() {
        f28608a.execute(f28611d);
    }

    /* renamed from: a */
    public static void m34125a(String str, boolean z) {
        f28612e = str;
        f28613f = z;
        f28610c.countDown();
    }

    /* renamed from: b */
    public static String m34126b() {
        return f28612e;
    }

    /* renamed from: c */
    public static boolean m34127c() {
        return f28613f;
    }
}
