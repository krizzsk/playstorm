package com.iab.omid.library.vungle.walking.p285a;

import com.iab.omid.library.vungle.walking.p285a.C8124b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.vungle.walking.a.c */
public class C8127c implements C8124b.C8125a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f19325a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f19326b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f19325a);

    /* renamed from: c */
    private final ArrayDeque<C8124b> f19327c = new ArrayDeque<>();

    /* renamed from: d */
    private C8124b f19328d = null;

    /* renamed from: a */
    private void m23383a() {
        C8124b poll = this.f19327c.poll();
        this.f19328d = poll;
        if (poll != null) {
            poll.mo56286a(this.f19326b);
        }
    }

    /* renamed from: a */
    public void mo56288a(C8124b bVar) {
        this.f19328d = null;
        m23383a();
    }

    /* renamed from: b */
    public void mo56291b(C8124b bVar) {
        bVar.mo56284a((C8124b.C8125a) this);
        this.f19327c.add(bVar);
        if (this.f19328d == null) {
            m23383a();
        }
    }
}
