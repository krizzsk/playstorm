package com.applovin.impl.mediation.p032d;

import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* renamed from: com.applovin.impl.mediation.d.a */
public class C1643a implements C1604a.C1605a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private final C1604a.C1605a f2295a;

    public C1643a(C1604a.C1605a aVar) {
        this.f2295a = aVar;
    }

    public void onAdClicked(MaxAd maxAd) {
        C2043j.m4959d(this.f2295a, maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        C2043j.m4967h(this.f2295a, maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        C2043j.m4926a((MaxAdListener) this.f2295a, maxAd, maxError);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        C2043j.m4951b((MaxAdListener) this.f2295a, maxAd);
    }

    public void onAdExpanded(MaxAd maxAd) {
        C2043j.m4965g(this.f2295a, maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
        C2043j.m4956c(this.f2295a, maxAd);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        C2043j.m4931a((MaxAdListener) this.f2295a, str, maxError);
    }

    public void onAdLoaded(MaxAd maxAd) {
        C2043j.m4925a((MaxAdListener) this.f2295a, maxAd);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        C2043j.m4933a((MaxAdRevenueListener) this.f2295a, maxAd);
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        C2043j.m4963f(this.f2295a, maxAd);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        C2043j.m4961e(this.f2295a, maxAd);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        C2043j.m4928a((MaxAdListener) this.f2295a, maxAd, maxReward);
    }
}
