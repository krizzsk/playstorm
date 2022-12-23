package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.iw */
public abstract class C11791iw implements Runnable {

    /* renamed from: a */
    private final long f28775a = 300;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo72601a();

    public void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.f28775a;
        while (!mo72601a() && elapsedRealtime - SystemClock.elapsedRealtime() > 0) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
