package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.bytedance.sdk.component.utils.h */
/* compiled from: HandlerUtils */
public class C2968h {

    /* renamed from: a */
    private static volatile HandlerThread f6734a = new HandlerThread("tt_pangle_thread_io_handler");

    /* renamed from: b */
    private static volatile Handler f6735b;

    /* renamed from: c */
    private static volatile Handler f6736c = new Handler(f6734a.getLooper());

    static {
        f6734a.start();
    }

    /* renamed from: a */
    public static Handler m8366a() {
        if (f6734a == null || !f6734a.isAlive()) {
            synchronized (C2968h.class) {
                if (f6734a == null || !f6734a.isAlive()) {
                    f6734a = new HandlerThread("tt_pangle_thread_io_handler");
                    f6734a.start();
                    f6736c = new Handler(f6734a.getLooper());
                }
            }
        }
        return f6736c;
    }

    /* renamed from: b */
    public static Handler m8367b() {
        if (f6735b == null) {
            synchronized (C2968h.class) {
                if (f6735b == null) {
                    f6735b = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f6735b;
    }
}
