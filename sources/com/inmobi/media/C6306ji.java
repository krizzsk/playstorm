package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.inmobi.media.ji */
/* compiled from: Task */
public final class C6306ji {

    /* renamed from: a */
    private static final Object f15956a = new Object();

    /* renamed from: b */
    private final Handler f15957b;

    /* renamed from: com.inmobi.media.ji$a */
    /* compiled from: Task */
    static class C6307a {

        /* renamed from: a */
        static final C6306ji f15958a = new C6306ji((byte) 0);
    }

    /* synthetic */ C6306ji(byte b) {
        this();
    }

    private C6306ji() {
        this.f15957b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static C6306ji m18854a() {
        return C6307a.f15958a;
    }

    /* renamed from: a */
    public final void mo35541a(Runnable runnable) {
        this.f15957b.post(runnable);
    }
}
