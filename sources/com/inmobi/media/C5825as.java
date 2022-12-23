package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.inmobi.media.as */
/* compiled from: UiRunnable */
abstract class C5825as<T> extends C5783af<C5762ad> {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo34436a(T t);

    C5825as(C5762ad adVar, byte b) {
        super(adVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34703b(final T t) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C5825as.this.mo34436a(t);
            }
        });
    }
}
