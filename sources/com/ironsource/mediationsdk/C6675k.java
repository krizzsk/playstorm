package com.ironsource.mediationsdk;

import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.C6727i;

/* renamed from: com.ironsource.mediationsdk.k */
public final class C6675k {

    /* renamed from: b */
    private static final C6675k f17393b = new C6675k();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public BannerListener f17394a = null;

    /* renamed from: c */
    private C6727i f17395c = null;

    private C6675k() {
    }

    /* renamed from: a */
    public static C6675k m20355a() {
        return f17393b;
    }

    /* renamed from: a */
    public final void mo36709a(AdInfo adInfo) {
        if (this.f17394a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6675k.this.f17394a != null) {
                        C6675k.this.f17394a.onBannerAdScreenPresented();
                        IronLog.CALLBACK.info("onBannerAdScreenPresented()");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36710a(final IronSourceError ironSourceError, boolean z) {
        if (this.f17394a != null && !z) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6675k.this.f17394a != null) {
                        C6675k.this.f17394a.onBannerAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36711a(boolean z) {
        if (this.f17394a != null && !z) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6675k.this.f17394a != null) {
                        C6675k.this.f17394a.onBannerAdLoaded();
                        IronLog.CALLBACK.info("onBannerAdLoaded()");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36712b(AdInfo adInfo) {
        if (this.f17394a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6675k.this.f17394a != null) {
                        C6675k.this.f17394a.onBannerAdScreenDismissed();
                        IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo36713c(AdInfo adInfo) {
        if (this.f17394a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6675k.this.f17394a != null) {
                        C6675k.this.f17394a.onBannerAdLeftApplication();
                        IronLog.CALLBACK.info("onBannerAdLeftApplication()");
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo36714d(AdInfo adInfo) {
        if (this.f17394a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6675k.this.f17394a != null) {
                        C6675k.this.f17394a.onBannerAdClicked();
                        IronLog.CALLBACK.info("onBannerAdClicked()");
                    }
                }
            });
        }
    }
}
