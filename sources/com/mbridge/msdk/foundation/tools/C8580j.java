package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.tools.j */
/* compiled from: FastKVConfig */
public final class C8580j {

    /* renamed from: a */
    static FastKV.C8550b f20734a;

    /* renamed from: b */
    static volatile Executor f20735b;

    private C8580j() {
    }

    /* renamed from: a */
    static Executor m24786a() {
        if (f20735b == null) {
            synchronized (C8580j.class) {
                if (f20735b == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
                        public final Thread newThread(Runnable runnable) {
                            return new Thread(runnable, "mb-sp-handler");
                        }
                    }, new ThreadPoolExecutor.DiscardPolicy());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f20735b = threadPoolExecutor;
                }
            }
        }
        return f20735b;
    }
}
