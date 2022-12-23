package com.iab.omid.library.adcolony.walking.p225a;

import com.iab.omid.library.adcolony.walking.p225a.C7621b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.adcolony.walking.a.c */
public class C7624c implements C7621b.C7622a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18170a;

    /* renamed from: b */
    private final ThreadPoolExecutor f18171b;

    /* renamed from: c */
    private final ArrayDeque<C7621b> f18172c = new ArrayDeque<>();

    /* renamed from: d */
    private C7621b f18173d = null;

    public C7624c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f18170a = linkedBlockingQueue;
        this.f18171b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m21117a() {
        C7621b poll = this.f18172c.poll();
        this.f18173d = poll;
        if (poll != null) {
            poll.mo54314a(this.f18171b);
        }
    }

    /* renamed from: a */
    public void mo54316a(C7621b bVar) {
        this.f18173d = null;
        m21117a();
    }

    /* renamed from: b */
    public void mo54319b(C7621b bVar) {
        bVar.mo54312a((C7621b.C7622a) this);
        this.f18172c.add(bVar);
        if (this.f18173d == null) {
            m21117a();
        }
    }
}
