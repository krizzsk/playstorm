package com.bytedance.sdk.component.p110d.p111a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.d.a.c */
/* compiled from: ThreadPoolFactory */
public class C2828c {

    /* renamed from: a */
    private static final TimeUnit f6366a = TimeUnit.SECONDS;

    /* renamed from: a */
    public static ExecutorService m7788a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30, f6366a, new LinkedBlockingQueue(), new C2825a("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
