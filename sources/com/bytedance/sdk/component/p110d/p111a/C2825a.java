package com.bytedance.sdk.component.p110d.p111a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.d.a.a */
/* compiled from: DefaultThreadFactory */
public class C2825a implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f6363a;

    /* renamed from: b */
    private final AtomicInteger f6364b = new AtomicInteger(1);

    public C2825a(String str) {
        this.f6363a = new ThreadGroup("tt_img_" + str);
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f6363a;
        Thread thread = new Thread(threadGroup, runnable, "tt_img_" + this.f6364b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
