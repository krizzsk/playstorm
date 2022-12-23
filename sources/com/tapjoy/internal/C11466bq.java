package com.tapjoy.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.tapjoy.internal.bq */
public final class C11466bq<N, T> extends WeakReference<T> {

    /* renamed from: a */
    public final N f27741a;

    public C11466bq(N n, T t, ReferenceQueue<? super T> referenceQueue) {
        super(t, referenceQueue);
        this.f27741a = n;
    }
}
