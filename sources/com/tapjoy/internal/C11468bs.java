package com.tapjoy.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.tapjoy.internal.bs */
public final class C11468bs<T> {

    /* renamed from: a */
    public WeakReference<T> f27742a;

    /* renamed from: a */
    public final T mo72251a() {
        WeakReference<T> weakReference = this.f27742a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo72252a(T t) {
        this.f27742a = new WeakReference<>(t);
    }
}
