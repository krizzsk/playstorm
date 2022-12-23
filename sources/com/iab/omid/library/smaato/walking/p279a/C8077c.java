package com.iab.omid.library.smaato.walking.p279a;

import com.iab.omid.library.smaato.walking.p279a.C8074b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.smaato.walking.a.c */
public class C8077c implements C8074b.C8075a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f19212a;

    /* renamed from: b */
    private final ThreadPoolExecutor f19213b;

    /* renamed from: c */
    private final ArrayDeque<C8074b> f19214c = new ArrayDeque<>();

    /* renamed from: d */
    private C8074b f19215d = null;

    public C8077c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f19212a = linkedBlockingQueue;
        this.f19213b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m23159a() {
        C8074b poll = this.f19214c.poll();
        this.f19215d = poll;
        if (poll != null) {
            poll.mo56092a(this.f19213b);
        }
    }

    /* renamed from: a */
    public void mo56094a(C8074b bVar) {
        this.f19215d = null;
        m23159a();
    }

    /* renamed from: b */
    public void mo56097b(C8074b bVar) {
        bVar.mo56090a((C8074b.C8075a) this);
        this.f19214c.add(bVar);
        if (this.f19215d == null) {
            m23159a();
        }
    }
}
