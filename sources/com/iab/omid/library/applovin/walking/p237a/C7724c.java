package com.iab.omid.library.applovin.walking.p237a;

import com.iab.omid.library.applovin.walking.p237a.C7721b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.applovin.walking.a.c */
public class C7724c implements C7721b.C7722a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18404a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18405b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18404a);

    /* renamed from: c */
    private final ArrayDeque<C7721b> f18406c = new ArrayDeque<>();

    /* renamed from: d */
    private C7721b f18407d = null;

    /* renamed from: a */
    private void m21577a() {
        C7721b poll = this.f18406c.poll();
        this.f18407d = poll;
        if (poll != null) {
            poll.mo54712a(this.f18405b);
        }
    }

    /* renamed from: a */
    public void mo54714a(C7721b bVar) {
        this.f18407d = null;
        m21577a();
    }

    /* renamed from: b */
    public void mo54717b(C7721b bVar) {
        bVar.mo54710a((C7721b.C7722a) this);
        this.f18406c.add(bVar);
        if (this.f18407d == null) {
            m21577a();
        }
    }
}
