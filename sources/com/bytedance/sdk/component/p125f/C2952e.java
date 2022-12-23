package com.bytedance.sdk.component.p125f;

import com.bytedance.sdk.component.p125f.C2944a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.f.e */
/* compiled from: TTExecutor */
public class C2952e {

    /* renamed from: a */
    public static final int f6709a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    public static C2949c f6710b;

    /* renamed from: c */
    public static int f6711c = 120;

    /* renamed from: d */
    public static boolean f6712d = true;

    /* renamed from: e */
    private static volatile ThreadPoolExecutor f6713e;

    /* renamed from: f */
    private static volatile ThreadPoolExecutor f6714f;

    /* renamed from: g */
    private static volatile ThreadPoolExecutor f6715g;

    /* renamed from: h */
    private static volatile ThreadPoolExecutor f6716h;

    /* renamed from: i */
    private static volatile ScheduledExecutorService f6717i;

    /* renamed from: a */
    public static ExecutorService m8304a() {
        return m8305a(10);
    }

    /* renamed from: a */
    public static ExecutorService m8305a(int i) {
        if (f6713e == null) {
            synchronized (C2952e.class) {
                if (f6713e == null) {
                    f6713e = new C2944a.C2946a().mo17856a("io").mo17854a(4).mo17862c(i).mo17855a(40).mo17859a(TimeUnit.SECONDS).mo17857a((BlockingQueue<Runnable>) new PriorityBlockingQueue(f6709a)).mo17858a(m8320f()).mo17860a();
                    f6713e.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f6713e;
    }

    /* renamed from: a */
    public static void m8307a(C2955g gVar) {
        if (f6713e == null) {
            m8304a();
        }
        if (f6713e != null) {
            f6713e.execute(gVar);
        }
    }

    /* renamed from: a */
    public static void m8308a(C2955g gVar, int i) {
        if (f6713e == null) {
            m8304a();
        }
        if (gVar != null && f6713e != null) {
            gVar.mo17879a(i);
            f6713e.execute(gVar);
        }
    }

    /* renamed from: a */
    public static void m8309a(C2955g gVar, int i, int i2) {
        if (f6713e == null) {
            m8305a(i2);
        }
        if (gVar != null && f6713e != null) {
            gVar.mo17879a(i);
            f6713e.execute(gVar);
        }
    }

    /* renamed from: b */
    public static ExecutorService m8311b() {
        if (f6715g == null) {
            synchronized (C2952e.class) {
                if (f6715g == null) {
                    f6715g = new C2944a.C2946a().mo17856a("log").mo17862c(10).mo17854a(2).mo17855a(40).mo17859a(TimeUnit.SECONDS).mo17857a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).mo17858a(m8320f()).mo17860a();
                    f6715g.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f6715g;
    }

    /* renamed from: b */
    public static void m8313b(C2955g gVar) {
        if (f6715g == null) {
            m8311b();
        }
        if (f6715g != null) {
            f6715g.execute(gVar);
        }
    }

    /* renamed from: b */
    public static void m8314b(C2955g gVar, int i) {
        if (f6715g == null) {
            m8311b();
        }
        if (gVar != null && f6715g != null) {
            gVar.mo17879a(i);
            f6715g.execute(gVar);
        }
    }

    /* renamed from: c */
    public static void m8317c(C2955g gVar, int i) {
        if (f6716h == null) {
            m8315c();
        }
        if (gVar != null && f6716h != null) {
            gVar.mo17879a(i);
            f6716h.execute(gVar);
        }
    }

    /* renamed from: c */
    public static ExecutorService m8315c() {
        if (f6716h == null) {
            synchronized (C2952e.class) {
                if (f6716h == null) {
                    f6716h = new C2944a.C2946a().mo17856a("aidl").mo17862c(10).mo17854a(2).mo17855a(30).mo17859a(TimeUnit.SECONDS).mo17857a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).mo17858a(m8320f()).mo17860a();
                    f6716h.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f6716h;
    }

    /* renamed from: d */
    public static ScheduledExecutorService m8318d() {
        if (f6717i == null) {
            synchronized (C2952e.class) {
                if (f6717i == null) {
                    f6717i = Executors.newSingleThreadScheduledExecutor(new C2956h(5, "scheduled"));
                }
            }
        }
        return f6717i;
    }

    /* renamed from: e */
    public static boolean m8319e() {
        return f6712d;
    }

    /* renamed from: a */
    public static void m8310a(boolean z) {
        f6712d = z;
    }

    /* renamed from: f */
    public static RejectedExecutionHandler m8320f() {
        return new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    /* renamed from: g */
    public static C2949c m8321g() {
        return f6710b;
    }

    /* renamed from: a */
    public static void m8306a(C2949c cVar) {
        f6710b = cVar;
    }

    /* renamed from: b */
    public static ExecutorService m8312b(int i) {
        if (f6714f == null) {
            synchronized (C2952e.class) {
                if (f6714f == null) {
                    f6714f = new C2944a.C2946a().mo17856a("ad").mo17861b(1).mo17862c(i).mo17855a(300).mo17859a(TimeUnit.SECONDS).mo17857a((BlockingQueue<Runnable>) new LinkedBlockingQueue()).mo17858a(m8320f()).mo17860a();
                    f6714f.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f6714f;
    }

    /* renamed from: c */
    public static void m8316c(int i) {
        f6711c = i;
    }
}
