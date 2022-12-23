package com.iab.omid.library.fyber.walking.p249a;

import com.iab.omid.library.fyber.walking.p249a.C7822b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.fyber.walking.a.c */
public class C7825c implements C7822b.C7823a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18634a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18635b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18634a);

    /* renamed from: c */
    private final ArrayDeque<C7822b> f18636c = new ArrayDeque<>();

    /* renamed from: d */
    private C7822b f18637d = null;

    /* renamed from: a */
    private void m22031a() {
        C7822b poll = this.f18636c.poll();
        this.f18637d = poll;
        if (poll != null) {
            poll.mo55105a(this.f18635b);
        }
    }

    /* renamed from: a */
    public void mo55107a(C7822b bVar) {
        this.f18637d = null;
        m22031a();
    }

    /* renamed from: b */
    public void mo55110b(C7822b bVar) {
        bVar.mo55103a((C7822b.C7823a) this);
        this.f18636c.add(bVar);
        if (this.f18637d == null) {
            m22031a();
        }
    }
}
