package com.iab.omid.library.oguryco.walking.p273a;

import com.iab.omid.library.oguryco.walking.p273a.C8024b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.oguryco.walking.a.c */
public class C8027c implements C8024b.C8025a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f19099a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f19100b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f19099a);

    /* renamed from: c */
    private final ArrayDeque<C8024b> f19101c = new ArrayDeque<>();

    /* renamed from: d */
    private C8024b f19102d = null;

    /* renamed from: a */
    private void m22935a() {
        C8024b poll = this.f19101c.poll();
        this.f19102d = poll;
        if (poll != null) {
            poll.mo55898a(this.f19100b);
        }
    }

    /* renamed from: a */
    public void mo55900a(C8024b bVar) {
        this.f19102d = null;
        m22935a();
    }

    /* renamed from: b */
    public void mo55903b(C8024b bVar) {
        bVar.mo55896a((C8024b.C8025a) this);
        this.f19101c.add(bVar);
        if (this.f19102d == null) {
            m22935a();
        }
    }
}
