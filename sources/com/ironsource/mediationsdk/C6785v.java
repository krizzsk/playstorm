package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C6790y;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C6721c;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v */
public final class C6785v extends C6790y implements InterstitialSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6721c f17893i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f17894j;

    public C6785v(String str, String str2, NetworkSettings networkSettings, C6721c cVar, int i, AbstractAdapter abstractAdapter) {
        super(new C6691a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f17893i = cVar;
        this.f17905d = i;
        this.f17902a.initInterstitial(str, str2, this.f17904c, this);
    }

    /* renamed from: c */
    private void m20659c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.f17903b.f17477a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20660d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.f17903b.f17477a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo36992a() {
        m20660d("showInterstitial state=" + mo37012g());
        if (mo37007a(C6790y.C6791a.LOADED, C6790y.C6791a.SHOW_IN_PROGRESS)) {
            this.f17902a.showInterstitial(this.f17904c, this);
            return;
        }
        this.f17893i.mo36894a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo36993a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m20660d("loadInterstitial state=" + mo37012g());
        C6790y.C6791a a = mo37002a(new C6790y.C6791a[]{C6790y.C6791a.NOT_LOADED, C6790y.C6791a.LOADED}, C6790y.C6791a.LOAD_IN_PROGRESS);
        if (a == C6790y.C6791a.NOT_LOADED || a == C6790y.C6791a.LOADED) {
            this.f17894j = new Date().getTime();
            m20660d("start timer");
            mo37005a((TimerTask) new TimerTask() {
                public final void run() {
                    C6785v vVar = C6785v.this;
                    vVar.m20660d("load timed out state=" + C6785v.this.mo37012g());
                    if (C6785v.this.mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.NOT_LOADED)) {
                        C6785v.this.f17893i.mo36895a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C6785v.this, new Date().getTime() - C6785v.this.f17894j);
                    }
                }
            });
            if (mo37014i()) {
                this.f17906e = str2;
                this.f17907f = jSONObject;
                this.f17908g = list;
                this.f17902a.loadInterstitialForBidding(this.f17904c, this, str);
                return;
            }
            this.f17902a.loadInterstitial(this.f17904c, this);
        } else if (a == C6790y.C6791a.LOAD_IN_PROGRESS) {
            this.f17893i.mo36895a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f17893i.mo36895a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo36994b() {
        return this.f17902a.isInterstitialReady(this.f17904c);
    }

    public final void onInterstitialAdClicked() {
        m20659c("onInterstitialAdClicked");
        this.f17893i.mo36899c(this);
    }

    public final void onInterstitialAdClosed() {
        mo37003a(C6790y.C6791a.NOT_LOADED);
        m20659c("onInterstitialAdClosed");
        this.f17893i.mo36898b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m20659c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo37012g());
        mo37013h();
        if (mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.NOT_LOADED)) {
            this.f17893i.mo36895a(ironSourceError, this, new Date().getTime() - this.f17894j);
        }
    }

    public final void onInterstitialAdOpened() {
        m20659c("onInterstitialAdOpened");
        this.f17893i.mo36896a(this);
    }

    public final void onInterstitialAdReady() {
        m20659c("onInterstitialAdReady state=" + mo37012g());
        mo37013h();
        if (mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.LOADED)) {
            this.f17893i.mo36897a(this, new Date().getTime() - this.f17894j);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        mo37003a(C6790y.C6791a.NOT_LOADED);
        m20659c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f17893i.mo36894a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
    }

    public final void onInterstitialAdVisible() {
        m20659c("onInterstitialAdVisible");
        this.f17893i.mo36900d(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }
}
