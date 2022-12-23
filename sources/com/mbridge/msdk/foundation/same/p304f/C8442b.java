package com.mbridge.msdk.foundation.same.p304f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.f.b */
/* compiled from: ThreadPoolUtils */
public final class C8442b {

    /* renamed from: a */
    public static ThreadPoolExecutor f20421a;

    /* renamed from: b */
    private static ThreadPoolExecutor f20422b;

    /* renamed from: c */
    private static ThreadPoolExecutor f20423c;

    /* renamed from: d */
    private static Handler f20424d;

    /* renamed from: a */
    public static ThreadPoolExecutor m24388a() {
        if (f20421a == null) {
            f20421a = new ThreadPoolExecutor(5, 10, 15, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() {
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20421a;
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m24389b() {
        if (f20422b == null) {
            f20422b = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() {
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20422b;
    }

    /* renamed from: c */
    public static ThreadPoolExecutor m24390c() {
        if (f20423c == null) {
            f20423c = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() {
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20423c;
    }

    /* renamed from: d */
    public static Handler m24391d() {
        if (f20424d == null) {
            f20424d = new C8446a();
        }
        return f20424d;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.f.b$a */
    /* compiled from: ThreadPoolUtils */
    private static class C8446a extends Handler {
        public C8446a() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }
}
