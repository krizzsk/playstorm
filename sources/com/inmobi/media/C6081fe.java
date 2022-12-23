package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.fe */
/* compiled from: NativeRootContainerLayout */
public final class C6081fe extends C6058ez {

    /* renamed from: a */
    private WeakReference<C6318n> f15473a;

    public C6081fe(Context context) {
        super(context);
    }

    public final void setNativeStrandAd(C6318n nVar) {
        this.f15473a = new WeakReference<>(nVar);
    }

    public final C6318n getNativeStrandAd() {
        return (C6318n) this.f15473a.get();
    }
}
