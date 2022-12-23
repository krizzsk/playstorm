package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C6790y;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C6722d;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x */
public final class C6788x extends C6790y implements RewardedVideoSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6722d f17899i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f17900j;

    C6788x(String str, String str2, NetworkSettings networkSettings, C6722d dVar, int i, AbstractAdapter abstractAdapter) {
        super(new C6691a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f17903b = new C6691a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO);
        this.f17904c = this.f17903b.f17478b;
        this.f17902a = abstractAdapter;
        this.f17899i = dVar;
        this.f17905d = i;
        this.f17902a.initRewardedVideoForDemandOnly(str, str2, this.f17904c, this);
    }

    /* renamed from: c */
    private void m20681c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f17903b.f17477a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20682d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f17903b.f17477a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo36998a() {
        m20682d("showRewardedVideo state=" + mo37012g());
        if (mo37007a(C6790y.C6791a.LOADED, C6790y.C6791a.SHOW_IN_PROGRESS)) {
            this.f17902a.showRewardedVideo(this.f17904c, this);
            return;
        }
        this.f17899i.mo36901a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo36999a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m20682d("loadRewardedVideo state=" + mo37012g());
        C6790y.C6791a a = mo37002a(new C6790y.C6791a[]{C6790y.C6791a.NOT_LOADED, C6790y.C6791a.LOADED}, C6790y.C6791a.LOAD_IN_PROGRESS);
        if (a == C6790y.C6791a.NOT_LOADED || a == C6790y.C6791a.LOADED) {
            this.f17900j = new Date().getTime();
            m20682d("start timer");
            mo37005a((TimerTask) new TimerTask() {
                public final void run() {
                    C6788x xVar = C6788x.this;
                    xVar.m20682d("load timed out state=" + C6788x.this.mo37012g());
                    if (C6788x.this.mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.NOT_LOADED)) {
                        C6788x.this.f17899i.mo36902a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C6788x.this, new Date().getTime() - C6788x.this.f17900j);
                    }
                }
            });
            if (mo37014i()) {
                this.f17906e = str2;
                this.f17907f = jSONObject;
                this.f17908g = list;
                this.f17902a.loadRewardedVideoForDemandOnlyForBidding(this.f17904c, this, str);
                return;
            }
            this.f17902a.loadRewardedVideoForDemandOnly(this.f17904c, this);
        } else if (a == C6790y.C6791a.LOAD_IN_PROGRESS) {
            this.f17899i.mo36902a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f17899i.mo36902a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo37000b() {
        return this.f17902a.isRewardedVideoAvailable(this.f17904c);
    }

    public final void onRewardedVideoAdClicked() {
        m20681c("onRewardedVideoAdClicked");
        this.f17899i.mo36906c(this);
    }

    public final void onRewardedVideoAdClosed() {
        mo37003a(C6790y.C6791a.NOT_LOADED);
        m20681c("onRewardedVideoAdClosed");
        this.f17899i.mo36905b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        m20681c("onRewardedVideoAdOpened");
        this.f17899i.mo36903a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        m20681c("onRewardedVideoAdRewarded");
        this.f17899i.mo36908e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo37003a(C6790y.C6791a.NOT_LOADED);
        m20681c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f17899i.mo36901a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        m20681c("onRewardedVideoAdVisible");
        this.f17899i.mo36907d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        m20681c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo37012g());
        mo37013h();
        if (mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.NOT_LOADED)) {
            this.f17899i.mo36902a(ironSourceError, this, new Date().getTime() - this.f17900j);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        m20681c("onRewardedVideoLoadSuccess state=" + mo37012g());
        mo37013h();
        if (mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.LOADED)) {
            this.f17899i.mo36904a(this, new Date().getTime() - this.f17900j);
        }
    }
}
