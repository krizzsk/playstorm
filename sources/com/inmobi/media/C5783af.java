package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Queue;

/* renamed from: com.inmobi.media.af */
/* compiled from: BackgroundRunnable */
public abstract class C5783af<T> implements Runnable {

    /* renamed from: a */
    private static final String f14593a = C5783af.class.getSimpleName();

    /* renamed from: b */
    private Handler f14594b;

    /* renamed from: c */
    private byte f14595c = -1;

    /* renamed from: f */
    WeakReference<T> f14596f;

    /* renamed from: a */
    public abstract void mo34435a();

    protected C5783af(T t, byte b) {
        this.f14595c = b;
        this.f14596f = new WeakReference<>(t);
        this.f14594b = new Handler(Looper.getMainLooper());
    }

    public final void run() {
        mo34435a();
        this.f14594b.post(new Runnable() {
            public final void run() {
                Object obj = C5783af.this.f14596f.get();
                if (obj != null) {
                    C6229hq a = C6229hq.m18582a();
                    int hashCode = obj.hashCode();
                    Queue queue = a.f15785a.get(hashCode);
                    if (queue != null) {
                        queue.poll();
                        C5783af afVar = (C5783af) queue.peek();
                        if (queue.size() > 0 && afVar != null) {
                            a.mo35435a(afVar);
                        }
                        if (queue.size() == 0) {
                            a.f15785a.remove(hashCode);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34437b() {
        C6238hu.m18605a((byte) 1, f14593a, "Could not execute runnable due to OutOfMemory.");
        Object obj = this.f14596f.get();
        if (obj != null) {
            C6229hq.m18582a().mo35433a(obj.hashCode());
        }
    }
}
