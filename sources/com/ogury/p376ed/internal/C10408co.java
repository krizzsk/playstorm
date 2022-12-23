package com.ogury.p376ed.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ogury.ed.internal.co */
public final class C10408co implements C10415ct {

    /* renamed from: a */
    public static final C10409a f26345a = new C10409a((byte) 0);

    /* renamed from: b */
    private final ExecutorService f26346b;

    public C10408co() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(4, Runtime.getRuntime().availableProcessors()));
        C10765mq.m32770a((Object) newFixedThreadPool, "newFixedThreadPool(nrOfCachedThreads)");
        this.f26346b = newFixedThreadPool;
    }

    /* renamed from: com.ogury.ed.internal.co$a */
    public static final class C10409a {
        public /* synthetic */ C10409a(byte b) {
            this();
        }

        private C10409a() {
        }
    }

    /* renamed from: a */
    public final void mo67162a(Runnable runnable) {
        C10765mq.m32773b(runnable, "runnable");
        this.f26346b.execute(runnable);
    }
}
