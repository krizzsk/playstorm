package com.iab.omid.library.amazon.walking.p231a;

import com.iab.omid.library.amazon.walking.p231a.C7671b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.amazon.walking.a.c */
public class C7674c implements C7671b.C7672a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18287a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18288b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18287a);

    /* renamed from: c */
    private final ArrayDeque<C7671b> f18289c = new ArrayDeque<>();

    /* renamed from: d */
    private C7671b f18290d = null;

    /* renamed from: a */
    private void m21347a() {
        C7671b poll = this.f18289c.poll();
        this.f18290d = poll;
        if (poll != null) {
            poll.mo54513a(this.f18288b);
        }
    }

    /* renamed from: a */
    public void mo54515a(C7671b bVar) {
        this.f18290d = null;
        m21347a();
    }

    /* renamed from: b */
    public void mo54518b(C7671b bVar) {
        bVar.mo54511a((C7671b.C7672a) this);
        this.f18289c.add(bVar);
        if (this.f18290d == null) {
            m21347a();
        }
    }
}
