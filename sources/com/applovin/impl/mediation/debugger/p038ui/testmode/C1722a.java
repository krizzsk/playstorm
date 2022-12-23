package com.applovin.impl.mediation.debugger.p038ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p033a.C1651a;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.mediation.debugger.p038ui.C1668a;
import com.applovin.impl.mediation.debugger.p038ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2392R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a */
public class C1722a extends C1668a implements C1651a.C1652a, AdControlButton.C1720a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private C1661b f2604a;

    /* renamed from: b */
    private C1959m f2605b;

    /* renamed from: c */
    private MaxAdView f2606c;

    /* renamed from: d */
    private MaxAdView f2607d;

    /* renamed from: e */
    private MaxInterstitialAd f2608e;

    /* renamed from: f */
    private MaxRewardedInterstitialAd f2609f;

    /* renamed from: g */
    private MaxRewardedAd f2610g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public MaxAd f2611h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MaxNativeAdLoader f2612i;

    /* renamed from: j */
    private String f2613j;

    /* renamed from: k */
    private AdControlButton f2614k;

    /* renamed from: l */
    private AdControlButton f2615l;

    /* renamed from: m */
    private AdControlButton f2616m;

    /* renamed from: n */
    private AdControlButton f2617n;

    /* renamed from: o */
    private AdControlButton f2618o;

    /* renamed from: p */
    private AdControlButton f2619p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Button f2620q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Button f2621r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public FrameLayout f2622s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public FrameLayout f2623t;

    /* renamed from: u */
    private Map<MaxAdFormat, C1651a> f2624u;

    /* renamed from: a */
    private AdControlButton m3607a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f2614k;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f2615l;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f2616m;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f2617n;
        }
        if (str.equals(this.f2613j)) {
            return this.f2618o;
        }
        if (str.equals("test_mode_native")) {
            return this.f2619p;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    /* renamed from: a */
    private void m3609a() {
        String str;
        MaxAdFormat maxAdFormat;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C2392R.C2394id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(C2392R.C2394id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f2604a.mo13444p().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f2605b.mo14309Y(), this);
            this.f2606c = maxAdView;
            maxAdView.setListener(this);
            frameLayout.addView(this.f2606c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(C2392R.C2394id.banner_control_button);
            this.f2614k = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2614k.setFormat(maxAdFormat);
            return;
        }
        findViewById(C2392R.C2394id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    /* renamed from: a */
    private void m3610a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.f2605b.mo14295J().mo13580a(this.f2604a.mo13436h());
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f2606c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f2607d;
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2608e.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2609f.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2610g.loadAd();
            return;
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2612i.loadAd();
            return;
        } else {
            return;
        }
        maxAdView.loadAd();
    }

    /* renamed from: b */
    private void m3612b() {
        this.f2622s = (FrameLayout) findViewById(C2392R.C2394id.mrec_ad_view_container);
        if (this.f2604a.mo13444p().contains(MaxAdFormat.MREC)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", MaxAdFormat.MREC, this.f2605b.mo14309Y(), this);
            this.f2607d = maxAdView;
            maxAdView.setListener(this);
            this.f2622s.addView(this.f2607d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(C2392R.C2394id.mrec_control_button);
            this.f2615l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2615l.setFormat(MaxAdFormat.MREC);
            return;
        }
        findViewById(C2392R.C2394id.mrec_control_view).setVisibility(8);
        this.f2622s.setVisibility(8);
    }

    /* renamed from: b */
    private void m3613b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2608e.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2609f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2610g.showAd();
        }
    }

    /* renamed from: c */
    private void m3615c() {
        if (this.f2604a.mo13444p().contains(MaxAdFormat.INTERSTITIAL)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f2605b.mo14309Y(), this);
            this.f2608e = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C2392R.C2394id.interstitial_control_button);
            this.f2616m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2616m.setFormat(MaxAdFormat.INTERSTITIAL);
            return;
        }
        findViewById(C2392R.C2394id.interstitial_control_view).setVisibility(8);
    }

    /* renamed from: d */
    private void m3617d() {
        if (this.f2604a.mo13444p().contains(MaxAdFormat.REWARDED)) {
            String str = "test_mode_rewarded_" + this.f2604a.mo13436h();
            this.f2613j = str;
            MaxRewardedAd instance = MaxRewardedAd.getInstance(str, this.f2605b.mo14309Y(), this);
            this.f2610g = instance;
            instance.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C2392R.C2394id.rewarded_control_button);
            this.f2618o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2618o.setFormat(MaxAdFormat.REWARDED);
            return;
        }
        findViewById(C2392R.C2394id.rewarded_control_view).setVisibility(8);
    }

    /* renamed from: e */
    private void m3619e() {
        this.f2623t = (FrameLayout) findViewById(C2392R.C2394id.native_ad_view_container);
        if (this.f2604a.mo13445q()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f2605b.mo14309Y(), this);
            this.f2612i = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    C1722a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    C1722a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (C1722a.this.f2611h != null) {
                        C1722a.this.f2612i.destroy(C1722a.this.f2611h);
                    }
                    MaxAd unused = C1722a.this.f2611h = maxAd;
                    C1722a.this.f2623t.removeAllViews();
                    C1722a.this.f2623t.addView(maxNativeAdView);
                    C1722a.this.onAdLoaded(maxAd);
                }
            });
            this.f2612i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C2392R.C2394id.native_control_button);
            this.f2619p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2619p.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(C2392R.C2394id.native_control_view).setVisibility(8);
        this.f2623t.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public C1959m getSdk() {
        return this.f2605b;
    }

    public void initialize(C1661b bVar) {
        this.f2604a = bVar;
        this.f2605b = bVar.mo13451v();
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        m3607a(maxAd.getAdUnitId()).setControlState(AdControlButton.C1721b.LOAD);
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f2606c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f2607d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f2608e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f2609f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f2610g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f2612i.setLocalExtraParameter("amazon_ad_error", adError);
            }
            m3610a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
        m3610a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a = m3607a(str);
        a.setControlState(AdControlButton.C1721b.LOAD);
        Utils.showAlert("", "Failed to load " + a.getFormat().getLabel() + " with error code: " + maxError.getCode(), this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        m3607a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.C1721b.LOAD : AdControlButton.C1721b.SHOW);
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f2606c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f2607d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f2608e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f2609f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f2610g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f2612i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
            m3610a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        m3610a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        if (AdControlButton.C1721b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C1721b.LOADING);
            Map<MaxAdFormat, C1651a> map = this.f2624u;
            if (map == null || map.get(format) == null) {
                m3610a(format);
            } else {
                this.f2624u.get(format).mo13394a();
            }
        } else if (AdControlButton.C1721b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C1721b.LOAD);
            m3613b(format);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f2604a == null) {
            C2092v.m5053i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(C2392R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f2604a.mo13437i() + " Test Ads");
        m3609a();
        m3612b();
        m3615c();
        m3617d();
        m3619e();
        findViewById(C2392R.C2394id.rewarded_interstitial_control_view).setVisibility(8);
        this.f2620q = (Button) findViewById(C2392R.C2394id.show_mrec_button);
        this.f2621r = (Button) findViewById(C2392R.C2394id.show_native_button);
        if (!this.f2604a.mo13445q() || !this.f2604a.mo13444p().contains(MaxAdFormat.MREC)) {
            this.f2620q.setVisibility(8);
            this.f2621r.setVisibility(8);
        } else {
            this.f2623t.setVisibility(8);
            this.f2620q.setBackgroundColor(-1);
            this.f2621r.setBackgroundColor(-3355444);
            this.f2620q.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1722a.this.f2622s.setVisibility(0);
                    C1722a.this.f2623t.setVisibility(8);
                    C1722a.this.f2620q.setBackgroundColor(-1);
                    C1722a.this.f2621r.setBackgroundColor(-3355444);
                }
            });
            this.f2621r.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1722a.this.f2623t.setVisibility(0);
                    C1722a.this.f2622s.setVisibility(8);
                    C1722a.this.f2621r.setBackgroundColor(-1);
                    C1722a.this.f2620q.setBackgroundColor(-3355444);
                }
            });
        }
        if (StringUtils.isValidString(this.f2604a.mo13454y()) && this.f2604a.mo13455z() != null && this.f2604a.mo13455z().size() > 0) {
            AdRegistration.getInstance(this.f2604a.mo13454y(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f2604a.mo13455z().size());
            for (MaxAdFormat next : this.f2604a.mo13455z().keySet()) {
                hashMap.put(next, new C1651a(this.f2604a.mo13455z().get(next), next, (C1651a.C1652a) this));
            }
            this.f2624u = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            C2092v.m5049c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f2605b.mo14295J().mo13580a((String) null);
        MaxAdView maxAdView = this.f2606c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f2607d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f2608e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f2610g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f2612i;
        if (maxNativeAdLoader != null && (maxAd = this.f2611h) != null) {
            maxNativeAdLoader.destroy(maxAd);
        }
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
