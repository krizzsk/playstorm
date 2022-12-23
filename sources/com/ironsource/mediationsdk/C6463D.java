package com.ironsource.mediationsdk;

import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.C6727i;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

/* renamed from: com.ironsource.mediationsdk.D */
public final class C6463D {

    /* renamed from: a */
    private static final C6463D f16401a = new C6463D();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public InterstitialListener f16402b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6727i f16403c;

    private C6463D() {
    }

    /* renamed from: a */
    public static synchronized C6463D m19392a() {
        C6463D d;
        synchronized (C6463D.class) {
            d = f16401a;
        }
        return d;
    }

    /* renamed from: a */
    public final void mo36012a(final AdInfo adInfo) {
        if (this.f16402b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16402b != null) {
                        C6463D.this.f16402b.onInterstitialAdReady();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
                    }
                }
            });
        }
        if (this.f16403c != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16403c != null) {
                        C6727i unused = C6463D.this.f16403c;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdReady() adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36013a(final IronSourceError ironSourceError) {
        if (this.f16402b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16402b != null) {
                        C6463D.this.f16402b.onInterstitialAdLoadFailed(ironSourceError);
                        C6463D d = C6463D.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.f16403c != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16403c != null) {
                        C6727i unused = C6463D.this.f16403c;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36014a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.f16402b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16402b != null) {
                        C6463D.this.f16402b.onInterstitialAdShowFailed(ironSourceError);
                        C6463D d = C6463D.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.f16403c != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16403c != null) {
                        C6727i unused = C6463D.this.f16403c;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + adInfo + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final synchronized void mo36015a(InterstitialListener interstitialListener) {
        this.f16402b = interstitialListener;
    }

    /* renamed from: a */
    public final synchronized void mo36016a(C6727i iVar) {
        this.f16403c = null;
    }

    /* renamed from: b */
    public final void mo36017b(final AdInfo adInfo) {
        if (this.f16402b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16402b != null) {
                        C6463D.this.f16402b.onInterstitialAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
                    }
                }
            });
        }
        if (this.f16403c != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16403c != null) {
                        C6727i unused = C6463D.this.f16403c;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo36018c(final AdInfo adInfo) {
        if (this.f16402b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16402b != null) {
                        C6463D.this.f16402b.onInterstitialAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
                    }
                }
            });
        }
        if (this.f16403c != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16403c != null) {
                        C6727i unused = C6463D.this.f16403c;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo36019d(final AdInfo adInfo) {
        if (this.f16402b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16402b != null) {
                        C6463D.this.f16402b.onInterstitialAdShowSucceeded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
                    }
                }
            });
        }
        if (this.f16403c != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16403c != null) {
                        C6727i unused = C6463D.this.f16403c;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowSucceeded() adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo36020e(final AdInfo adInfo) {
        if (this.f16402b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16402b != null) {
                        C6463D.this.f16402b.onInterstitialAdClicked();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
                    }
                }
            });
        }
        if (this.f16403c != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6463D.this.f16403c != null) {
                        C6727i unused = C6463D.this.f16403c;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() adInfo = " + adInfo);
                    }
                }
            });
        }
    }
}
