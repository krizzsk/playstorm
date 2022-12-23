package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.l */
public final class C6730l implements InterstitialListener, RewardedVideoListener, SegmentListener, C6724f {

    /* renamed from: a */
    public RewardedVideoListener f17597a;

    /* renamed from: b */
    public InterstitialListener f17598b;

    /* renamed from: c */
    public OfferwallListener f17599c;

    /* renamed from: d */
    public SegmentListener f17600d;

    /* renamed from: e */
    public InterstitialPlacement f17601e = null;

    /* renamed from: f */
    public String f17602f = null;

    /* renamed from: g */
    private C6752a f17603g;

    /* renamed from: h */
    private long f17604h;

    /* renamed from: com.ironsource.mediationsdk.sdk.l$a */
    class C6752a extends Thread {

        /* renamed from: a */
        Handler f17636a;

        private C6752a() {
        }

        /* synthetic */ C6752a(C6730l lVar, byte b) {
            this();
        }

        public final void run() {
            Looper.prepare();
            this.f17636a = new Handler();
            Looper.loop();
        }
    }

    public C6730l() {
        C6752a aVar = new C6752a(this, (byte) 0);
        this.f17603g = aVar;
        aVar.start();
        this.f17604h = new Date().getTime();
    }

    /* renamed from: a */
    private void m20513a(Runnable runnable) {
        Handler handler;
        C6752a aVar = this.f17603g;
        if (aVar != null && (handler = aVar.f17636a) != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    private boolean m20514a(Object obj) {
        return (obj == null || this.f17603g == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo36913a(final IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f17602f)) {
                mediationAdditionalData.put("placement", this.f17602f);
            }
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6557h.m19950d().mo36371b(new C6552c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAdShowFailed(ironSourceError);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36255a(final boolean z, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            str = str + ", error: " + ironSourceError.getErrorMessage();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6557h.m19950d().mo36371b(new C6552c(302, mediationAdditionalData));
        if (m20514a((Object) this.f17599c)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17599c.onOfferwallAvailable(z);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36914a(final boolean z, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.f17604h;
        this.f17604h = new Date().getTime();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("duration", time);
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6557h.m19950d().mo36371b(new C6552c(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAvailabilityChanged(z);
                }
            });
        }
    }

    public final void onGetOfferwallCreditsFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (m20514a((Object) this.f17599c)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17599c.onGetOfferwallCreditsFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (m20514a((Object) this.f17598b)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17598b.onInterstitialAdClicked();
                }
            });
        }
    }

    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (m20514a((Object) this.f17598b)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17598b.onInterstitialAdClosed();
                }
            });
        }
    }

    public final void onInterstitialAdLoadFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (m20514a((Object) this.f17598b)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17598b.onInterstitialAdLoadFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (m20514a((Object) this.f17598b)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17598b.onInterstitialAdOpened();
                }
            });
        }
    }

    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (m20514a((Object) this.f17598b)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17598b.onInterstitialAdReady();
                }
            });
        }
    }

    public final void onInterstitialAdShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            if (this.f17601e != null && !TextUtils.isEmpty(this.f17601e.getPlacementName())) {
                mediationAdditionalData.put("placement", this.f17601e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6553d.m19930d().mo36371b(new C6552c(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (m20514a((Object) this.f17598b)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17598b.onInterstitialAdShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (m20514a((Object) this.f17598b)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17598b.onInterstitialAdShowSucceeded();
                }
            });
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        OfferwallListener offerwallListener = this.f17599c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i, i2, z) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo36255a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (m20514a((Object) this.f17599c)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17599c.onOfferwallClosed();
                }
            });
        }
    }

    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (m20514a((Object) this.f17599c)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17599c.onOfferwallOpened();
                }
            });
        }
    }

    public final void onOfferwallShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (m20514a((Object) this.f17599c)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17599c.onOfferwallShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onRewardedVideoAdClicked(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAdClicked(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAdClosed();
                }
            });
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAdEnded();
                }
            });
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAdOpened();
                }
            });
        }
    }

    public final void onRewardedVideoAdRewarded(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAdRewarded(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo36913a(ironSourceError, (Map<String, Object>) null);
    }

    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (m20514a((Object) this.f17597a)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    C6730l.this.f17597a.onRewardedVideoAdStarted();
                }
            });
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        mo36914a(z, (Map<String, Object>) null);
    }

    public final void onSegmentReceived(final String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (m20514a((Object) this.f17600d)) {
            m20513a((Runnable) new Runnable() {
                public final void run() {
                    if (!TextUtils.isEmpty(str)) {
                        C6730l.this.f17600d.onSegmentReceived(str);
                    }
                }
            });
        }
    }
}
