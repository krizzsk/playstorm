package com.iab.omid.library.mmadbridge.walking.p267a;

import com.iab.omid.library.mmadbridge.walking.p267a.C7973b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.c */
public class C7976c implements C7973b.C7974a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18978a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18979b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18978a);

    /* renamed from: c */
    private final ArrayDeque<C7973b> f18980c = new ArrayDeque<>();

    /* renamed from: d */
    private C7973b f18981d = null;

    /* renamed from: a */
    private void m22706a() {
        C7973b poll = this.f18980c.poll();
        this.f18981d = poll;
        if (poll != null) {
            poll.mo55684a(this.f18979b);
        }
    }

    /* renamed from: a */
    public void mo55686a(C7973b bVar) {
        this.f18981d = null;
        m22706a();
    }

    /* renamed from: b */
    public void mo55689b(C7973b bVar) {
        bVar.mo55682a((C7973b.C7974a) this);
        this.f18980c.add(bVar);
        if (this.f18981d == null) {
            m22706a();
        }
    }
}
