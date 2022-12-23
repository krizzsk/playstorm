package com.bytedance.sdk.openadsdk.p178j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.j.b */
/* compiled from: CrashMonitor */
public class C3856b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ScheduledExecutorService f9974a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3890g f9975b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f9976c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3858a f9977d;

    /* renamed from: com.bytedance.sdk.openadsdk.j.b$a */
    /* compiled from: CrashMonitor */
    public interface C3858a {
        /* renamed from: a */
        void mo20716a();
    }

    public C3856b(C3890g gVar) {
        this.f9975b = gVar;
    }

    /* renamed from: a */
    public void mo20714a(long j) {
        this.f9976c = j;
    }

    /* renamed from: a */
    public void mo20713a(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f9974a = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                if (System.currentTimeMillis() - C3856b.this.f9976c > 2000) {
                    C3856b.this.f9974a.shutdown();
                    if (C3856b.this.f9975b != null) {
                        C3856b.this.f9975b.mo20770t();
                    }
                    if (C3856b.this.f9977d != null) {
                        C3856b.this.f9977d.mo20716a();
                    }
                }
            }
        }, 0, (long) i, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo20712a() {
        ScheduledExecutorService scheduledExecutorService = this.f9974a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
