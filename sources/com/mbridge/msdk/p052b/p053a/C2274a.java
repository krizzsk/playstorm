package com.mbridge.msdk.p052b.p053a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.b.a.a */
/* compiled from: PreloadListenerEx */
public final class C2274a implements PreloadListener {

    /* renamed from: a */
    WeakReference<PreloadListener> f4518a;

    /* renamed from: b */
    private boolean f4519b = false;

    /* renamed from: c */
    private int f4520c = 0;

    /* renamed from: a */
    public final boolean mo15424a() {
        return this.f4519b;
    }

    /* renamed from: a */
    public final void mo15423a(boolean z) {
        this.f4519b = z;
    }

    public C2274a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f4518a = new WeakReference<>(preloadListener);
        }
    }

    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f4518a;
        if (weakReference != null && weakReference.get() != null) {
            ((PreloadListener) this.f4518a.get()).onPreloadSucceed();
        }
    }

    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f4518a;
        if (weakReference != null && weakReference.get() != null) {
            ((PreloadListener) this.f4518a.get()).onPreloadFaild(str);
        }
    }
}
