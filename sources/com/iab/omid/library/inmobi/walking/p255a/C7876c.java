package com.iab.omid.library.inmobi.walking.p255a;

import com.iab.omid.library.inmobi.walking.p255a.C7873b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.inmobi.walking.a.c */
public class C7876c implements C7873b.C7874a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18747a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18748b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18747a);

    /* renamed from: c */
    private final ArrayDeque<C7873b> f18749c = new ArrayDeque<>();

    /* renamed from: d */
    private C7873b f18750d = null;

    /* renamed from: a */
    private void m22255a() {
        C7873b poll = this.f18749c.poll();
        this.f18750d = poll;
        if (poll != null) {
            poll.mo55299a(this.f18748b);
        }
    }

    /* renamed from: a */
    public void mo55301a(C7873b bVar) {
        this.f18750d = null;
        m22255a();
    }

    /* renamed from: b */
    public void mo55304b(C7873b bVar) {
        bVar.mo55297a((C7873b.C7874a) this);
        this.f18749c.add(bVar);
        if (this.f18750d == null) {
            m22255a();
        }
    }
}
