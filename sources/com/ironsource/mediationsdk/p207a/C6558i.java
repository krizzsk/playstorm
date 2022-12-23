package com.ironsource.mediationsdk.p207a;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C6687c;

/* renamed from: com.ironsource.mediationsdk.a.i */
public final class C6558i extends Thread {

    /* renamed from: b */
    private static C6558i f16966b;

    /* renamed from: a */
    private C6559a f16967a;

    /* renamed from: com.ironsource.mediationsdk.a.i$a */
    class C6559a extends HandlerThread {

        /* renamed from: a */
        Handler f16968a;

        C6559a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C6687c());
        }
    }

    private C6558i() {
        C6559a aVar = new C6559a(getClass().getSimpleName());
        this.f16967a = aVar;
        aVar.start();
        C6559a aVar2 = this.f16967a;
        aVar2.f16968a = new Handler(aVar2.getLooper());
    }

    /* renamed from: a */
    public static synchronized C6558i m19956a() {
        C6558i iVar;
        synchronized (C6558i.class) {
            if (f16966b == null) {
                f16966b = new C6558i();
            }
            iVar = f16966b;
        }
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36396a(java.lang.Runnable r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.a.i$a r0 = r1.f16967a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            com.ironsource.mediationsdk.a.i$a r0 = r1.f16967a     // Catch:{ all -> 0x0012 }
            android.os.Handler r0 = r0.f16968a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            r0.post(r2)     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p207a.C6558i.mo36396a(java.lang.Runnable):void");
    }
}
