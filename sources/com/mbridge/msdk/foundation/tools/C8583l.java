package com.mbridge.msdk.foundation.tools;

import java.util.concurrent.Executor;

/* renamed from: com.mbridge.msdk.foundation.tools.l */
/* compiled from: LimitExecutor */
public final class C8583l implements Executor {

    /* renamed from: a */
    private Runnable f20736a;

    /* renamed from: b */
    private Runnable f20737b;

    public final synchronized void execute(Runnable runnable) {
        if (this.f20736a == null) {
            this.f20736a = m24789a(runnable);
            C8580j.m24786a().execute(this.f20736a);
        } else if (this.f20737b == null) {
            this.f20737b = m24789a(runnable);
        }
    }

    /* renamed from: a */
    private Runnable m24789a(final Runnable runnable) {
        return new Runnable() {
            public final void run() {
                try {
                    runnable.run();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C8583l.this.m24790a();
                    throw th;
                }
                C8583l.this.m24790a();
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m24790a() {
        Runnable runnable = this.f20737b;
        this.f20736a = runnable;
        this.f20737b = null;
        if (runnable != null) {
            C8580j.m24786a().execute(this.f20736a);
        }
    }
}
