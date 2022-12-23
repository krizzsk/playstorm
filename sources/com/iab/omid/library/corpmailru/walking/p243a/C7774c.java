package com.iab.omid.library.corpmailru.walking.p243a;

import com.iab.omid.library.corpmailru.walking.p243a.C7771b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.c */
public class C7774c implements C7771b.C7772a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18517a;

    /* renamed from: b */
    private final ThreadPoolExecutor f18518b;

    /* renamed from: c */
    private final ArrayDeque<C7771b> f18519c = new ArrayDeque<>();

    /* renamed from: d */
    private C7771b f18520d = null;

    public C7774c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f18517a = linkedBlockingQueue;
        this.f18518b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m21801a() {
        C7771b poll = this.f18519c.poll();
        this.f18520d = poll;
        if (poll != null) {
            poll.mo54906a(this.f18518b);
        }
    }

    /* renamed from: a */
    public void mo54908a(C7771b bVar) {
        this.f18520d = null;
        m21801a();
    }

    /* renamed from: b */
    public void mo54911b(C7771b bVar) {
        bVar.mo54904a((C7771b.C7772a) this);
        this.f18519c.add(bVar);
        if (this.f18520d == null) {
            m21801a();
        }
    }
}
