package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tapjoy.internal.t */
public final class C11839t {

    /* renamed from: a */
    private static Handler f28931a;

    /* renamed from: a */
    public static synchronized Handler m34404a() {
        Handler handler;
        synchronized (C11839t.class) {
            if (f28931a == null) {
                f28931a = new Handler(Looper.getMainLooper());
            }
            handler = f28931a;
        }
        return handler;
    }

    /* renamed from: a */
    public static C11435au m34405a(final Handler handler) {
        return new C11435au() {
            /* renamed from: a */
            public final boolean mo72182a(Runnable runnable) {
                return handler.post(runnable);
            }
        };
    }
}
