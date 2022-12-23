package com.ironsource.mediationsdk;

import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.l */
public final class C6682l {

    /* renamed from: b */
    private static C6682l f17403b;

    /* renamed from: a */
    int f17404a;

    /* renamed from: c */
    private long f17405c = 0;

    /* renamed from: d */
    private boolean f17406d = false;

    private C6682l() {
    }

    /* renamed from: a */
    public static synchronized C6682l m20363a() {
        C6682l lVar;
        synchronized (C6682l.class) {
            if (f17403b == null) {
                f17403b = new C6682l();
            }
            lVar = f17403b;
        }
        return lVar;
    }

    /* renamed from: a */
    public final void mo36721a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        mo36722a(ironSourceBannerLayout, ironSourceError, false);
    }

    /* renamed from: a */
    public final void mo36722a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError, final boolean z) {
        synchronized (this) {
            if (!this.f17406d) {
                long currentTimeMillis = System.currentTimeMillis() - this.f17405c;
                if (currentTimeMillis > ((long) (this.f17404a * 1000))) {
                    mo36723b(ironSourceBannerLayout, ironSourceError, z);
                    return;
                }
                this.f17406d = true;
                long j = ((long) (this.f17404a * 1000)) - currentTimeMillis;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("delaying callback by " + j);
                C6423c cVar = C6423c.f16330a;
                C6423c.m19280b(new Runnable() {
                    public final void run() {
                        C6682l.this.mo36723b(ironSourceBannerLayout, ironSourceError, z);
                    }
                }, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36723b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z) {
        if (ironSourceBannerLayout != null) {
            this.f17405c = System.currentTimeMillis();
            this.f17406d = false;
            ironSourceBannerLayout.mo36102a(ironSourceError, z);
        }
    }

    /* renamed from: b */
    public final boolean mo36724b() {
        boolean z;
        synchronized (this) {
            z = this.f17406d;
        }
        return z;
    }
}
