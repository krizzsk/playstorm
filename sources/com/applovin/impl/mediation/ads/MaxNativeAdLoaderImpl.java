package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1576d;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class MaxNativeAdLoaderImpl extends C1604a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1602a f2161a = new C1602a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f2162b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f2163c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MaxNativeAdListener f2164d;

    /* renamed from: e */
    private final Map<String, MaxNativeAdView> f2165e = new HashMap();

    /* renamed from: f */
    private final Object f2166f = new Object();

    /* renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$a */
    private class C1602a implements C1604a.C1605a {
        private C1602a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3146a(MaxNativeAdView maxNativeAdView) {
            C1576d c;
            C1606b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker != null && (c = adViewTracker.mo13308c()) != null) {
                MaxNativeAdLoaderImpl.this.logger.mo14789b(MaxNativeAdLoaderImpl.this.tag, "Destroying previous ad");
                MaxNativeAdLoaderImpl.this.destroy(c);
            }
        }

        public void onAdClicked(MaxAd maxAd) {
            C2043j.m4937a(MaxNativeAdLoaderImpl.this.f2164d, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdView unused = MaxNativeAdLoaderImpl.this.m3136a(((MaxErrorImpl) maxError).getLoadTag());
            C2043j.m4939a(MaxNativeAdLoaderImpl.this.f2164d, str, maxError, true);
        }

        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    MaxNativeAdLoaderImpl.this.logger.mo14789b(MaxNativeAdLoaderImpl.this.tag, "Native ad loaded");
                    C1576d dVar = (C1576d) maxAd;
                    dVar.mo13241d(MaxNativeAdLoaderImpl.this.f2162b);
                    dVar.mo13242e(MaxNativeAdLoaderImpl.this.f2163c);
                    MaxNativeAdView a = MaxNativeAdLoaderImpl.this.m3136a(dVar.mo13133a());
                    if (a == null) {
                        MaxNativeAdLoaderImpl.this.logger.mo14789b(MaxNativeAdLoaderImpl.this.tag, "No custom view provided, checking template");
                        String v = dVar.mo13195v();
                        if (StringUtils.isValidString(v)) {
                            C2092v vVar = MaxNativeAdLoaderImpl.this.logger;
                            String str = MaxNativeAdLoaderImpl.this.tag;
                            vVar.mo14789b(str, "Using template: " + v + APSSharedUtil.TRUNCATE_SEPARATOR);
                            a = new MaxNativeAdView(v, MaxNativeAdLoaderImpl.this.sdk.mo14297L());
                        }
                    }
                    if (a == null) {
                        MaxNativeAdLoaderImpl.this.logger.mo14789b(MaxNativeAdLoaderImpl.this.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                        C2043j.m4938a(MaxNativeAdLoaderImpl.this.f2164d, (MaxNativeAdView) null, maxAd, true);
                        return;
                    }
                    C1602a.this.m3146a(a);
                    MaxNativeAdLoaderImpl.this.m3140a(a, dVar, dVar.getNativeAd());
                    C2043j.m4938a(MaxNativeAdLoaderImpl.this.f2164d, a, maxAd, true);
                    MaxNativeAdLoaderImpl.this.m3139a(a);
                }
            });
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C2043j.m4934a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, C1959m mVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", mVar);
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str2 = this.tag;
            vVar.mo14789b(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MaxNativeAdView m3136a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f2166f) {
            remove = this.f2165e.remove(str);
        }
        return remove;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3139a(MaxNativeAdView maxNativeAdView) {
        C1606b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (C2039g.m4884c()) {
                if (!maxNativeAdView.isAttachedToWindow()) {
                    return;
                }
            } else if (maxNativeAdView.getParent() == null) {
                return;
            }
            adViewTracker.mo13307b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3140a(final MaxNativeAdView maxNativeAdView, final C1576d dVar, final MaxNativeAd maxNativeAd) {
        dVar.mo13194a(maxNativeAdView);
        mo13299a(dVar);
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f2161a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                maxNativeAd.prepareViewForInteraction(maxNativeAdView);
            }
        });
    }

    /* renamed from: a */
    private void m3141a(String str, MaxNativeAdView maxNativeAdView) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f2166f) {
                this.f2165e.put(str, maxNativeAdView);
            }
        }
    }

    public void destroy() {
        this.f2164d = null;
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        if (maxAd instanceof C1576d) {
            C1576d dVar = (C1576d) maxAd;
            if (!dVar.mo13196w()) {
                MaxNativeAdView u = dVar.mo13174u();
                if (u != null) {
                    C1606b adViewTracker = u.getAdViewTracker();
                    if (adViewTracker != null && maxAd.equals(adViewTracker.mo13308c())) {
                        u.recycle();
                    }
                } else if (C2092v.m5047a()) {
                    C2092v vVar = this.logger;
                    String str = this.tag;
                    vVar.mo14789b(str, "Destroy failed on native ad(" + dVar + "): native ad view not found");
                }
                this.sdk.mo14290E().destroyAd(dVar);
            } else if (C2092v.m5047a()) {
                C2092v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.mo14789b(str2, "Native ad(" + dVar + ") has already been destroyed");
            }
        } else if (C2092v.m5047a()) {
            C2092v vVar3 = this.logger;
            String str3 = this.tag;
            vVar3.mo14789b(str3, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    public String getPlacement() {
        return this.f2162b;
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Loading native ad for '" + this.adUnitId + "' and notifying " + this.f2161a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        m3141a(lowerCase, maxNativeAdView);
        this.sdk.mo14290E().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.localExtraParameters, this.extraParameters, this.sdk.mo14297L(), this.f2161a);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof C1576d)) {
            C2092v.m5053i(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        } else if (maxNativeAdView == null) {
            C2092v.m5053i(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        } else {
            C1576d dVar = (C1576d) maxAd;
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd == null) {
                this.logger.mo14793e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return false;
            }
            m3140a(maxNativeAdView, dVar, nativeAd);
            m3139a(maxNativeAdView);
            return true;
        }
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f2163c = str;
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f2164d = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f2162b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + '\'' + ", nativeAdListener=" + this.f2164d + ", revenueListener=" + this.revenueListener + '}';
    }
}
