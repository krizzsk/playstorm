package com.ironsource.mediationsdk;

import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.C6728j;
import com.ironsource.mediationsdk.sdk.C6729k;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;

/* renamed from: com.ironsource.mediationsdk.ac */
public final class C6569ac {

    /* renamed from: c */
    private static final C6569ac f16995c = new C6569ac();

    /* renamed from: a */
    public RewardedVideoListener f16996a = null;

    /* renamed from: b */
    public C6728j f16997b;

    private C6569ac() {
    }

    /* renamed from: a */
    public static C6569ac m19976a() {
        return f16995c;
    }

    /* renamed from: a */
    public final void mo36416a(final AdInfo adInfo) {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
                    }
                }
            });
        }
        if (this.f16997b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16997b != null) {
                        C6728j unused = C6569ac.this.f16997b;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36417a(final IronSourceError ironSourceError) {
        RewardedVideoListener rewardedVideoListener = this.f16996a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        ((RewardedVideoManualListener) C6569ac.this.f16996a).onRewardedVideoAdLoadFailed(ironSourceError);
                        C6569ac acVar = C6569ac.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        C6728j jVar = this.f16997b;
        if (jVar != null && (jVar instanceof C6729k)) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16997b != null) {
                        C6728j unused = C6569ac.this.f16997b;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36418a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAdShowFailed(ironSourceError);
                        C6569ac acVar = C6569ac.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.f16997b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16997b != null) {
                        C6728j unused = C6569ac.this.f16997b;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + adInfo + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36419a(final Placement placement, final AdInfo adInfo) {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAdRewarded(placement);
                        C6569ac acVar = C6569ac.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement + ")", 1);
                    }
                }
            });
        }
        if (this.f16997b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16997b != null) {
                        C6728j unused = C6569ac.this.f16997b;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdRewarded() placement = " + placement + ", adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36420a(final boolean z, final AdInfo adInfo) {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAvailabilityChanged(z);
                        C6569ac acVar = C6569ac.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + z, 1);
                    }
                }
            });
        }
        if (this.f16997b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16997b != null) {
                        C6728j unused = C6569ac.this.f16997b;
                        IronLog ironLog = IronLog.CALLBACK;
                        StringBuilder sb = new StringBuilder("onAdAvailabilityChanged() available = ");
                        sb.append(z);
                        sb.append(", adInfo = ");
                        sb.append(z ? adInfo : null);
                        ironLog.info(sb.toString());
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36421b() {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAdStarted();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36422b(final AdInfo adInfo) {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
                    }
                }
            });
        }
        if (this.f16997b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16997b != null) {
                        C6728j unused = C6569ac.this.f16997b;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36423b(final Placement placement, final AdInfo adInfo) {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAdClicked(placement);
                        C6569ac acVar = C6569ac.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement + ")", 1);
                    }
                }
            });
        }
        if (this.f16997b != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16997b != null) {
                        C6728j unused = C6569ac.this.f16997b;
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() placement = " + placement + ", adInfo = " + adInfo);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo36424c() {
        if (this.f16996a != null) {
            C6423c.f16330a.mo35933a(new Runnable() {
                public final void run() {
                    if (C6569ac.this.f16996a != null) {
                        C6569ac.this.f16996a.onRewardedVideoAdEnded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
                    }
                }
            });
        }
    }
}
