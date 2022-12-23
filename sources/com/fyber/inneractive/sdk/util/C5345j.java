package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.j */
public class C5345j<T> {

    /* renamed from: a */
    public final Queue<T> f14205a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public C5346a<T> f14206b;

    /* renamed from: com.fyber.inneractive.sdk.util.j$a */
    public interface C5346a<TT> {
        /* renamed from: a */
        TT mo26328a();
    }

    public C5345j(int i, C5346a<T> aVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f14205a.offer(aVar.mo26328a());
        }
        this.f14206b = aVar;
    }

    /* renamed from: a */
    public T mo26456a() {
        T poll = this.f14205a.poll();
        return poll == null ? this.f14206b.mo26328a() : poll;
    }
}
