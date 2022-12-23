package com.bytedance.sdk.component.p125f;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.sdk.component.f.h */
/* compiled from: TTThreadFactory */
public class C2956h implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f6723a;

    /* renamed from: b */
    private final String f6724b;

    /* renamed from: c */
    private int f6725c;

    public C2956h(int i, String str) {
        this.f6725c = i;
        this.f6723a = new ThreadGroup("tt_pangle_group_" + str);
        this.f6724b = "tt_pangle_thread_" + str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f6723a, runnable, this.f6724b);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i = this.f6725c;
        if (i > 10 || i < 1) {
            this.f6725c = 5;
        }
        thread.setPriority(this.f6725c);
        return thread;
    }
}
