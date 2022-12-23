package com.bytedance.sdk.component.p125f;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.sdk.component.f.f */
/* compiled from: TTFutureTask */
public class C2954f<V> extends FutureTask<V> implements Comparable<C2954f<V>> {

    /* renamed from: a */
    private int f6718a;

    /* renamed from: b */
    private int f6719b;

    public C2954f(Callable<V> callable, int i, int i2) {
        super(callable);
        this.f6718a = i == -1 ? 5 : i;
        this.f6719b = i2;
    }

    public C2954f(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.f6718a = i == -1 ? 5 : i;
        this.f6719b = i2;
    }

    /* renamed from: a */
    public int compareTo(C2954f fVar) {
        if (mo17874a() < fVar.mo17874a()) {
            return 1;
        }
        return mo17874a() > fVar.mo17874a() ? -1 : 0;
    }

    /* renamed from: a */
    public int mo17874a() {
        return this.f6718a;
    }
}
