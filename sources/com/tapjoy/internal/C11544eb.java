package com.tapjoy.internal;

import com.tapjoy.internal.C11541ea;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.eb */
public final class C11544eb implements C11541ea.C11542a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f27931a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f27932b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f27931a);

    /* renamed from: c */
    private final ArrayDeque<C11541ea> f27933c = new ArrayDeque<>();

    /* renamed from: d */
    private C11541ea f27934d = null;

    /* renamed from: b */
    private void m33486b() {
        C11541ea poll = this.f27933c.poll();
        this.f27934d = poll;
        if (poll != null) {
            poll.mo72332a(this.f27932b);
        }
    }

    /* renamed from: a */
    public final void mo72334a() {
        this.f27934d = null;
        m33486b();
    }

    /* renamed from: a */
    public final void mo72337a(C11541ea eaVar) {
        eaVar.f27929d = this;
        this.f27933c.add(eaVar);
        if (this.f27934d == null) {
            m33486b();
        }
    }
}
