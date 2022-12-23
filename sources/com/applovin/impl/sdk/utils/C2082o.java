package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.applovin.impl.sdk.utils.o */
public class C2082o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f4072a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Timer f4073b;

    /* renamed from: c */
    private long f4074c;

    /* renamed from: d */
    private long f4075d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Runnable f4076e;

    /* renamed from: f */
    private long f4077f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f4078g = new Object();

    private C2082o(C1959m mVar, Runnable runnable) {
        this.f4072a = mVar;
        this.f4076e = runnable;
    }

    /* renamed from: a */
    public static C2082o m5001a(long j, C1959m mVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        } else if (runnable != null) {
            C2082o oVar = new C2082o(mVar, runnable);
            oVar.f4074c = System.currentTimeMillis();
            oVar.f4075d = j;
            try {
                Timer timer = new Timer();
                oVar.f4073b = timer;
                timer.schedule(oVar.m5006e(), j);
            } catch (OutOfMemoryError e) {
                if (C2092v.m5047a()) {
                    mVar.mo14286A().mo14790b("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return oVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    /* renamed from: e */
    private TimerTask m5006e() {
        return new TimerTask() {
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    r0 = 0
                    com.applovin.impl.sdk.utils.o r1 = com.applovin.impl.sdk.utils.C2082o.this     // Catch:{ all -> 0x001b }
                    java.lang.Runnable r1 = r1.f4076e     // Catch:{ all -> 0x001b }
                    r1.run()     // Catch:{ all -> 0x001b }
                    com.applovin.impl.sdk.utils.o r1 = com.applovin.impl.sdk.utils.C2082o.this
                    java.lang.Object r1 = r1.f4078g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2082o.this     // Catch:{ all -> 0x0018 }
                    java.util.Timer unused = r2.f4073b = r0     // Catch:{ all -> 0x0018 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    goto L_0x0048
                L_0x0018:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    throw r0
                L_0x001b:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2082o.this     // Catch:{ all -> 0x004c }
                    com.applovin.impl.sdk.m r2 = r2.f4072a     // Catch:{ all -> 0x004c }
                    if (r2 == 0) goto L_0x003b
                    boolean r2 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x004c }
                    if (r2 == 0) goto L_0x003b
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2082o.this     // Catch:{ all -> 0x004c }
                    com.applovin.impl.sdk.m r2 = r2.f4072a     // Catch:{ all -> 0x004c }
                    com.applovin.impl.sdk.v r2 = r2.mo14286A()     // Catch:{ all -> 0x004c }
                    java.lang.String r3 = "Timer"
                    java.lang.String r4 = "Encountered error while executing timed task"
                    r2.mo14790b(r3, r4, r1)     // Catch:{ all -> 0x004c }
                L_0x003b:
                    com.applovin.impl.sdk.utils.o r1 = com.applovin.impl.sdk.utils.C2082o.this
                    java.lang.Object r1 = r1.f4078g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2082o.this     // Catch:{ all -> 0x0049 }
                    java.util.Timer unused = r2.f4073b = r0     // Catch:{ all -> 0x0049 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                L_0x0048:
                    return
                L_0x0049:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                    throw r0
                L_0x004c:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2082o.this
                    java.lang.Object r2 = r2.f4078g
                    monitor-enter(r2)
                    com.applovin.impl.sdk.utils.o r3 = com.applovin.impl.sdk.utils.C2082o.this     // Catch:{ all -> 0x005b }
                    java.util.Timer unused = r3.f4073b = r0     // Catch:{ all -> 0x005b }
                    monitor-exit(r2)     // Catch:{ all -> 0x005b }
                    throw r1
                L_0x005b:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x005b }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C2082o.C20831.run():void");
            }
        };
    }

    /* renamed from: a */
    public long mo14750a() {
        if (this.f4073b == null) {
            return this.f4075d - this.f4077f;
        }
        return this.f4075d - (System.currentTimeMillis() - this.f4074c);
    }

    /* renamed from: b */
    public void mo14751b() {
        synchronized (this.f4078g) {
            if (this.f4073b != null) {
                try {
                    this.f4073b.cancel();
                    this.f4077f = Math.max(1, System.currentTimeMillis() - this.f4074c);
                } catch (Throwable th) {
                    this.f4073b = null;
                    throw th;
                }
                this.f4073b = null;
            }
        }
    }

    /* renamed from: c */
    public void mo14752c() {
        synchronized (this.f4078g) {
            if (this.f4077f > 0) {
                try {
                    long j = this.f4075d - this.f4077f;
                    this.f4075d = j;
                    if (j < 0) {
                        this.f4075d = 0;
                    }
                    Timer timer = new Timer();
                    this.f4073b = timer;
                    timer.schedule(m5006e(), this.f4075d);
                    this.f4074c = System.currentTimeMillis();
                } catch (Throwable th) {
                    this.f4077f = 0;
                    throw th;
                }
                this.f4077f = 0;
            }
        }
    }

    /* renamed from: d */
    public void mo14753d() {
        synchronized (this.f4078g) {
            if (this.f4073b != null) {
                try {
                    this.f4073b.cancel();
                    this.f4073b = null;
                } catch (Throwable th) {
                    this.f4073b = null;
                    this.f4077f = 0;
                    throw th;
                }
                this.f4077f = 0;
            }
        }
    }
}
