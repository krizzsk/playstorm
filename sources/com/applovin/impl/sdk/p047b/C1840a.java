package com.applovin.impl.sdk.p047b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p046ad.C1835f;
import com.applovin.impl.sdk.p046ad.C1836g;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1878aa;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1927v;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.a */
public class C1840a {

    /* renamed from: a */
    protected final C1959m f2979a;

    /* renamed from: b */
    protected final AppLovinAdServiceImpl f2980b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAd f2981c;

    /* renamed from: d */
    private String f2982d;

    /* renamed from: e */
    private SoftReference<AppLovinAdLoadListener> f2983e;

    /* renamed from: f */
    private final Object f2984f = new Object();

    /* renamed from: g */
    private volatile String f2985g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f2986h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a */
    private class C1842a implements AppLovinAdLoadListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AppLovinAdLoadListener f2989b;

        C1842a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f2989b = appLovinAdLoadListener;
        }

        public void adReceived(final AppLovinAd appLovinAd) {
            AppLovinAd unused = C1840a.this.f2981c = appLovinAd;
            if (this.f2989b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1842a.this.f2989b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            if (C2092v.m5047a()) {
                                C2092v.m5049c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                            }
                        }
                    }
                });
            }
        }

        public void failedToReceiveAd(final int i) {
            if (this.f2989b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1842a.this.f2989b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            if (C2092v.m5047a()) {
                                C2092v.m5049c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.b.a$b */
    private class C1845b implements C1836g, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b */
        private final AppLovinAdDisplayListener f2995b;

        /* renamed from: c */
        private final AppLovinAdClickListener f2996c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f2997d;

        /* renamed from: e */
        private final AppLovinAdRewardListener f2998e;

        private C1845b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f2995b = appLovinAdDisplayListener;
            this.f2996c = appLovinAdClickListener;
            this.f2997d = appLovinAdVideoPlaybackListener;
            this.f2998e = appLovinAdRewardListener;
        }

        /* renamed from: a */
        private void m3998a(C1829e eVar) {
            String str;
            int i;
            String a = C1840a.this.m3990d();
            if (!StringUtils.isValidString(a) || !C1840a.this.f2986h) {
                if (C2092v.m5047a()) {
                    C2092v A = C1840a.this.f2979a.mo14286A();
                    A.mo14793e("IncentivizedAdController", "Invalid reward state - result: " + a + " and wasFullyEngaged: " + C1840a.this.f2986h);
                    C1840a.this.f2979a.mo14286A().mo14789b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.mo13974aF();
                if (C1840a.this.f2986h) {
                    if (C2092v.m5047a()) {
                        C1840a.this.f2979a.mo14286A().mo14793e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    if (C2092v.m5047a()) {
                        C1840a.this.f2979a.mo14286A().mo14793e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                eVar.mo13967a(C1854c.m4011a(str));
                if (C2092v.m5047a()) {
                    C1840a.this.f2979a.mo14286A().mo14789b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                C2043j.m4943a(this.f2998e, (AppLovinAd) eVar, i);
            }
            C1840a.this.m3980a((AppLovinAd) eVar);
            if (C2092v.m5047a()) {
                C1840a.this.f2979a.mo14286A().mo14789b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            C2043j.m4953b(this.f2995b, (AppLovinAd) eVar);
            if (!eVar.mo13987ag().getAndSet(true)) {
                if (C2092v.m5047a()) {
                    C1840a.this.f2979a.mo14286A().mo14789b("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                C1840a.this.f2979a.mo14303S().mo14206a((C1877a) new C1927v(eVar, C1840a.this.f2979a), C1908o.C1910a.REWARD);
            }
        }

        public void adClicked(AppLovinAd appLovinAd) {
            C2043j.m4940a(this.f2996c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            C2043j.m4941a(this.f2995b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof C1835f) {
                appLovinAd = ((C1835f) appLovinAd).mo14020a();
            }
            if (appLovinAd instanceof C1829e) {
                m3998a((C1829e) appLovinAd);
            } else if (C2092v.m5047a()) {
                C2092v A = C1840a.this.f2979a.mo14286A();
                A.mo14793e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        public void onAdDisplayFailed(String str) {
            C2043j.m4942a(this.f2995b, str);
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            C1840a.this.m3983a("quota_exceeded");
            C2043j.m4954b(this.f2998e, appLovinAd, map);
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            C1840a.this.m3983a("rejected");
            C2043j.m4958c(this.f2998e, appLovinAd, map);
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            C1840a.this.m3983a("accepted");
            C2043j.m4944a(this.f2998e, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C1840a.this.m3983a("network_timeout");
            C2043j.m4943a(this.f2998e, appLovinAd, i);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            C2043j.m4945a(this.f2997d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            C2043j.m4946a(this.f2997d, appLovinAd, d, z);
            boolean unused = C1840a.this.f2986h = z;
        }
    }

    public C1840a(String str, AppLovinSdk appLovinSdk) {
        this.f2979a = appLovinSdk.coreSdk;
        this.f2980b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f2982d = str;
    }

    /* renamed from: a */
    private void m3975a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f2979a);
            if (maybeRetrieveNonDummyAd == null) {
                m3982a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
                return;
            }
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f2979a.mo14309Y(), context);
            C1845b bVar = new C1845b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            create.showAndRender(maybeRetrieveNonDummyAd);
            if (maybeRetrieveNonDummyAd instanceof C1829e) {
                m3977a((C1829e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        if (C2092v.m5047a()) {
            C2092v A = this.f2979a.mo14286A();
            A.mo14793e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        m3982a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
    }

    /* renamed from: a */
    private void m3976a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener2 = appLovinAdVideoPlaybackListener;
        AppLovinAdDisplayListener appLovinAdDisplayListener2 = appLovinAdDisplayListener;
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f2979a);
            if (maybeRetrieveNonDummyAd == null) {
                m3982a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
                return;
            }
            Context context2 = context;
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f2979a.mo14309Y(), context);
            C1845b bVar = new C1845b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            ViewGroup viewGroup2 = viewGroup;
            Lifecycle lifecycle2 = lifecycle;
            create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, lifecycle);
            if (maybeRetrieveNonDummyAd instanceof C1829e) {
                m3977a((C1829e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        if (C2092v.m5047a()) {
            C2092v A = this.f2979a.mo14286A();
            A.mo14793e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        m3982a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
    }

    /* renamed from: a */
    private void m3977a(C1829e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f2979a.mo14303S().mo14206a((C1877a) new C1878aa(eVar, appLovinAdRewardListener, this.f2979a), C1908o.C1910a.REWARD);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3980a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f2981c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof C1835f) {
                if (appLovinAd != ((C1835f) appLovinAd2).mo14020a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f2981c = null;
        }
    }

    /* renamed from: a */
    private void m3981a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f2981c;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            m3975a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (C2092v.m5047a()) {
            C2092v.m5053i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        m3989c();
    }

    /* renamed from: a */
    private void m3982a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f2979a.mo14304T().mo14128a(C1871f.f3445j);
        C2043j.m4946a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        C2043j.m4953b(appLovinAdDisplayListener, appLovinAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3983a(String str) {
        synchronized (this.f2984f) {
            this.f2985g = str;
        }
    }

    /* renamed from: b */
    private void m3986b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f2981c;
        }
        if (appLovinAdImpl != null) {
            m3976a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (C2092v.m5047a()) {
            C2092v.m5053i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        m3989c();
    }

    /* renamed from: b */
    private void m3987b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2980b.loadNextIncentivizedAd(this.f2982d, appLovinAdLoadListener);
    }

    /* renamed from: c */
    private void m3989c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f2983e;
        if (softReference != null && (appLovinAdLoadListener = softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m3990d() {
        String str;
        synchronized (this.f2984f) {
            str = this.f2985g;
        }
        return str;
    }

    /* renamed from: e */
    private AppLovinAdRewardListener m3991e() {
        return new AppLovinAdRewardListener() {
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C2092v.m5047a()) {
                    C2092v A = C1840a.this.f2979a.mo14286A();
                    A.mo14793e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C2092v.m5047a()) {
                    C2092v A = C1840a.this.f2979a.mo14286A();
                    A.mo14793e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C2092v.m5047a()) {
                    C2092v A = C1840a.this.f2979a.mo14286A();
                    A.mo14789b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                if (C2092v.m5047a()) {
                    C2092v A = C1840a.this.f2979a.mo14286A();
                    A.mo14793e("IncentivizedAdController", "Reward validation failed: " + i);
                }
            }
        };
    }

    /* renamed from: a */
    public void mo14027a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m3991e();
        }
        m3981a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void mo14028a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        m3986b(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? m3991e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void mo14029a(AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C2092v.m5047a()) {
            this.f2979a.mo14286A().mo14789b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f2983e = new SoftReference<>(appLovinAdLoadListener);
        if (mo14030a()) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            }
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f2981c);
                return;
            }
            return;
        }
        m3987b((AppLovinAdLoadListener) new C1842a(appLovinAdLoadListener));
    }

    /* renamed from: a */
    public boolean mo14030a() {
        return this.f2981c != null;
    }

    /* renamed from: b */
    public String mo14031b() {
        return this.f2982d;
    }
}
