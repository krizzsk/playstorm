package com.p374my.target.nativeads.factories;

import android.content.Context;
import com.p374my.target.nativeads.NativeAppwallAd;
import com.p374my.target.nativeads.banners.NativeAppwallBanner;
import com.p374my.target.nativeads.views.AppwallAdTeaserView;
import com.p374my.target.nativeads.views.AppwallAdView;

/* renamed from: com.my.target.nativeads.factories.NativeAppwallViewsFactory */
public class NativeAppwallViewsFactory {
    public static AppwallAdTeaserView getAppwallAppView(Context context) {
        return new AppwallAdTeaserView(context);
    }

    public static AppwallAdTeaserView getAppwallAppView(NativeAppwallBanner nativeAppwallBanner, Context context) {
        AppwallAdTeaserView appwallAppView = getAppwallAppView(context);
        appwallAppView.setNativeAppwallBanner(nativeAppwallBanner);
        return appwallAppView;
    }

    public static AppwallAdView getAppwallView(Context context) {
        return new AppwallAdView(context);
    }

    public static AppwallAdView getAppwallView(NativeAppwallAd nativeAppwallAd, Context context) {
        AppwallAdView appwallView = getAppwallView(context);
        appwallView.setupView(nativeAppwallAd);
        return appwallView;
    }
}
