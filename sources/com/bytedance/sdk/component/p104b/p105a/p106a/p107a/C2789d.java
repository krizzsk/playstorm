package com.bytedance.sdk.component.p104b.p105a.p106a.p107a;

import com.bytedance.sdk.component.p104b.p105a.C2794b;
import com.bytedance.sdk.component.p104b.p105a.C2805d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.d */
/* compiled from: NetDispatcher */
public class C2789d extends C2805d {

    /* renamed from: a */
    private ExecutorService f6274a;

    /* renamed from: b */
    private List<C2794b> f6275b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<C2794b> f6276c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private AtomicInteger f6277d = new AtomicInteger(64);

    public C2789d() {
        if (this.f6274a == null) {
            this.f6274a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    /* renamed from: b */
    public ExecutorService mo17480b() {
        return this.f6274a;
    }

    /* renamed from: a */
    public void mo17479a(int i) {
        this.f6277d.set(i);
    }

    /* renamed from: c */
    public List<C2794b> mo17481c() {
        return this.f6275b;
    }

    /* renamed from: d */
    public List<C2794b> mo17482d() {
        return this.f6276c;
    }

    /* renamed from: a */
    public int mo17478a() {
        return this.f6277d.get();
    }
}
