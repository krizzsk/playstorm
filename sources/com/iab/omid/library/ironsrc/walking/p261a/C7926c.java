package com.iab.omid.library.ironsrc.walking.p261a;

import com.iab.omid.library.ironsrc.walking.p261a.C7923b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.c */
public class C7926c implements C7923b.C7924a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18861a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18862b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18861a);

    /* renamed from: c */
    private final ArrayDeque<C7923b> f18863c = new ArrayDeque<>();

    /* renamed from: d */
    private C7923b f18864d = null;

    /* renamed from: a */
    private void m22476a() {
        C7923b poll = this.f18863c.poll();
        this.f18864d = poll;
        if (poll != null) {
            poll.mo55485a(this.f18862b);
        }
    }

    /* renamed from: a */
    public void mo55487a(C7923b bVar) {
        this.f18864d = null;
        m22476a();
    }

    /* renamed from: b */
    public void mo55490b(C7923b bVar) {
        bVar.mo55483a((C7923b.C7924a) this);
        this.f18863c.add(bVar);
        if (this.f18864d == null) {
            m22476a();
        }
    }
}
