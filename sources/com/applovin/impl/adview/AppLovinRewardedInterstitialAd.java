package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinRewardedInterstitialAd {

    /* renamed from: a */
    private final AppLovinIncentivizedInterstitial f1626a;

    /* renamed from: b */
    private AppLovinAdDisplayListener f1627b;

    /* renamed from: c */
    private AppLovinAdClickListener f1628c;

    /* renamed from: d */
    private AppLovinAdVideoPlaybackListener f1629d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f1626a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1628c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1627b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1629d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f1626a.show(appLovinAd, context, appLovinAdRewardListener, this.f1629d, this.f1627b, this.f1628c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
