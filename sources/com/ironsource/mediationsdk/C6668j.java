package com.ironsource.mediationsdk;

import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* renamed from: com.ironsource.mediationsdk.j */
public final class C6668j {

    /* renamed from: b */
    private static final C6668j f17384b = new C6668j();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyBannerListener f17385a = null;

    private C6668j() {
    }

    /* renamed from: a */
    public static C6668j m20352a() {
        return f17384b;
    }

    /* renamed from: a */
    public final void mo36702a(final IronSourceError ironSourceError) {
        if (this.f17385a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6668j.this.f17385a != null) {
                        C6668j.this.f17385a.onBannerAdLoadFailed(ironSourceError);
                    }
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
