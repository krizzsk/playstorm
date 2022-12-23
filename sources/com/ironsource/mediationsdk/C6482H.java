package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C6642b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C6726h;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.H */
public final class C6482H extends C6642b implements InterstitialSmashListener {

    /* renamed from: r */
    JSONObject f16443r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C6726h f16444s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public long f16445t;

    /* renamed from: u */
    private int f16446u;

    C6482H(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.f16443r = interstitialSettings;
        this.f17250k = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.f17251l = this.f16443r.optInt("maxAdsPerSession", 99);
        this.f17252m = this.f16443r.optInt("maxAdsPerDay", 99);
        this.f17244e = networkSettings.isMultipleInstances();
        this.f17245f = networkSettings.getSubProviderId();
        this.f16446u = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36059g() {
        this.f17247h = 0;
        mo36629a(C6642b.C6643a.INITIATED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo36060h() {
        try {
            mo36635e();
            this.f17248i = new Timer();
            this.f17248i.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C6482H.this.f17240a == C6642b.C6643a.INIT_PENDING && C6482H.this.f16444s != null) {
                        C6482H.this.mo36629a(C6642b.C6643a.INIT_FAILED);
                        C6482H.this.f16444s.mo36042a(ErrorBuilder.buildInitFailedError("Timeout", IronSourceConstants.INTERSTITIAL_AD_UNIT), C6482H.this);
                    }
                }
            }, (long) (this.f16446u * 1000));
        } catch (Exception e) {
            mo36630a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo36061i() {
        try {
            mo36636f();
            this.f17249j = new Timer();
            this.f17249j.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C6482H.this.f17240a == C6642b.C6643a.LOAD_PENDING && C6482H.this.f16444s != null) {
                        C6482H.this.mo36629a(C6642b.C6643a.NOT_AVAILABLE);
                        C6482H.this.f16444s.mo36043a(ErrorBuilder.buildLoadFailedError("Timeout"), C6482H.this, new Date().getTime() - C6482H.this.f16445t);
                    }
                }
            }, (long) (this.f16446u * 1000));
        } catch (Exception e) {
            mo36630a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo36062k() {
        return "interstitial";
    }

    public final void onInterstitialAdClicked() {
        C6726h hVar = this.f16444s;
        if (hVar != null) {
            hVar.mo36054e(this);
        }
    }

    public final void onInterstitialAdClosed() {
        C6726h hVar = this.f16444s;
        if (hVar != null) {
            hVar.mo36051c(this);
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        mo36636f();
        if (this.f17240a == C6642b.C6643a.LOAD_PENDING && this.f16444s != null) {
            this.f16444s.mo36043a(ironSourceError, this, new Date().getTime() - this.f16445t);
        }
    }

    public final void onInterstitialAdOpened() {
        C6726h hVar = this.f16444s;
        if (hVar != null) {
            hVar.mo36048b(this);
        }
    }

    public final void onInterstitialAdReady() {
        mo36636f();
        if (this.f17240a == C6642b.C6643a.LOAD_PENDING && this.f16444s != null) {
            this.f16444s.mo36041a(this, new Date().getTime() - this.f16445t);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        C6726h hVar = this.f16444s;
        if (hVar != null) {
            hVar.mo36049b(ironSourceError, this);
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        C6726h hVar = this.f16444s;
        if (hVar != null) {
            hVar.mo36053d(this);
        }
    }

    public final void onInterstitialAdVisible() {
        C6726h hVar = this.f16444s;
        if (hVar != null) {
            hVar.mo36057f(this);
        }
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        mo36635e();
        if (this.f17240a == C6642b.C6643a.INIT_PENDING) {
            mo36629a(C6642b.C6643a.INIT_FAILED);
            C6726h hVar = this.f16444s;
            if (hVar != null) {
                hVar.mo36042a(ironSourceError, this);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        mo36635e();
        if (this.f17240a == C6642b.C6643a.INIT_PENDING) {
            mo36629a(C6642b.C6643a.INITIATED);
            C6726h hVar = this.f16444s;
            if (hVar != null) {
                hVar.mo36040a(this);
            }
        }
    }
}
