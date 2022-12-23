package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.mediation.p028a.C1578f;
import com.applovin.impl.mediation.p028a.C1581h;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.g */
public class C1730g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f2651a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1959m f2652b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2092v f2653c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f2654d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1578f f2655e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f2656f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MaxAdapter f2657g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f2658h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1573a f2659i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f2660j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MaxNativeAd f2661k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MaxNativeAdView f2662l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1750a f2663m = new C1750a();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public MaxAdapterResponseParameters f2664n;

    /* renamed from: o */
    private final AtomicBoolean f2665o = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AtomicBoolean f2666p = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final AtomicBoolean f2667q = new AtomicBoolean(false);

    /* renamed from: r */
    private final boolean f2668r;

    /* renamed from: com.applovin.impl.mediation.g$a */
    private class C1750a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public MediationServiceImpl.C1569a f2726b;

        private C1750a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3692a(MediationServiceImpl.C1569a aVar) {
            if (aVar != null) {
                this.f2726b = aVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* renamed from: a */
        private void m3695a(String str, final Bundle bundle) {
            C1730g.this.f2667q.set(true);
            m3696a(str, (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    if (C1730g.this.f2666p.compareAndSet(false, true)) {
                        C1750a.this.f2726b.mo13123a(C1730g.this.f2659i, bundle);
                    }
                }
            });
        }

        /* renamed from: a */
        private void m3696a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            C1730g.this.f2651a.post(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        MaxAdListener maxAdListener = maxAdListener;
                        String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                        if (C2092v.m5047a()) {
                            C2092v.m5049c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e);
                        }
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3697a(String str, final MaxError maxError) {
            m3696a(str, (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    if (C1730g.this.f2666p.compareAndSet(false, true)) {
                        C1750a.this.f2726b.onAdLoadFailed(C1730g.this.f2658h, maxError);
                    }
                }
            });
        }

        /* renamed from: b */
        private void m3699b(String str, final Bundle bundle) {
            if (C1730g.this.f2659i.mo13169s().compareAndSet(false, true)) {
                m3696a(str, (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                    public void run() {
                        C1750a.this.f2726b.mo13124b(C1730g.this.f2659i, bundle);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m3700b(String str, final MaxError maxError) {
            m3696a(str, (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onAdDisplayFailed(C1730g.this.f2659i, maxError);
                }
            });
        }

        public void onAdViewAdClicked() {
            onAdViewAdClicked((Bundle) null);
        }

        public void onAdViewAdClicked(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad clicked with extra info: " + bundle);
            }
            m3696a("onAdViewAdClicked", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13126d(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onAdViewAdCollapsed() {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad collapsed");
            }
            m3696a("onAdViewAdCollapsed", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onAdCollapsed(C1730g.this.f2659i);
                }
            });
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            m3700b("onAdViewAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed((Bundle) null);
        }

        public void onAdViewAdDisplayed(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad displayed with extra info: " + bundle);
            }
            m3699b("onAdViewAdDisplayed", bundle);
        }

        public void onAdViewAdExpanded() {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad expanded");
            }
            m3696a("onAdViewAdExpanded", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onAdExpanded(C1730g.this.f2659i);
                }
            });
        }

        public void onAdViewAdHidden() {
            onAdViewAdHidden((Bundle) null);
        }

        public void onAdViewAdHidden(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad hidden with extra info: " + bundle);
            }
            m3696a("onAdViewAdHidden", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13125c(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            m3697a("onAdViewAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, (Bundle) null);
        }

        public void onAdViewAdLoaded(View view, Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": adview ad loaded with extra info: " + bundle);
            }
            View unused = C1730g.this.f2660j = view;
            m3695a("onAdViewAdLoaded", bundle);
        }

        public void onInterstitialAdClicked() {
            onInterstitialAdClicked((Bundle) null);
        }

        public void onInterstitialAdClicked(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": interstitial ad clicked with extra info: " + bundle);
            }
            m3696a("onInterstitialAdClicked", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13126d(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            m3700b("onInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed((Bundle) null);
        }

        public void onInterstitialAdDisplayed(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": interstitial ad displayed with extra info: " + bundle);
            }
            m3699b("onInterstitialAdDisplayed", bundle);
        }

        public void onInterstitialAdHidden() {
            onInterstitialAdHidden((Bundle) null);
        }

        public void onInterstitialAdHidden(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": interstitial ad hidden with extra info " + bundle);
            }
            m3696a("onInterstitialAdHidden", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13125c(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            m3697a("onInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded((Bundle) null);
        }

        public void onInterstitialAdLoaded(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": interstitial ad loaded with extra info: " + bundle);
            }
            m3695a("onInterstitialAdLoaded", bundle);
        }

        public void onNativeAdClicked() {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": native ad clicked");
            }
            m3696a("onNativeAdClicked", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onAdClicked(C1730g.this.f2659i);
                }
            });
        }

        public void onNativeAdDisplayed(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": native ad displayed with extra info: " + bundle);
            }
            m3699b("onNativeAdDisplayed", bundle);
        }

        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            m3697a("onNativeAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": native ad loaded with extra info: " + bundle);
            }
            MaxNativeAd unused = C1730g.this.f2661k = maxNativeAd;
            m3695a("onNativeAdLoaded", bundle);
        }

        public void onRewardedAdClicked() {
            onRewardedAdClicked((Bundle) null);
        }

        public void onRewardedAdClicked(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded ad clicked with extra info: " + bundle);
            }
            m3696a("onRewardedAdClicked", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13126d(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            m3700b("onRewardedAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed((Bundle) null);
        }

        public void onRewardedAdDisplayed(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded ad displayed with extra info: " + bundle);
            }
            m3699b("onRewardedAdDisplayed", bundle);
        }

        public void onRewardedAdHidden() {
            onRewardedAdHidden((Bundle) null);
        }

        public void onRewardedAdHidden(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded ad hidden with extra info: " + bundle);
            }
            m3696a("onRewardedAdHidden", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13125c(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m3697a("onRewardedAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdLoaded() {
            onRewardedAdLoaded((Bundle) null);
        }

        public void onRewardedAdLoaded(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded ad loaded with extra info: " + bundle);
            }
            m3695a("onRewardedAdLoaded", bundle);
        }

        public void onRewardedAdVideoCompleted() {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded video completed");
            }
            m3696a("onRewardedAdVideoCompleted", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onRewardedVideoCompleted(C1730g.this.f2659i);
                }
            });
        }

        public void onRewardedAdVideoStarted() {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded video started");
            }
            m3696a("onRewardedAdVideoStarted", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onRewardedVideoStarted(C1730g.this.f2659i);
                }
            });
        }

        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked((Bundle) null);
        }

        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            m3696a("onRewardedInterstitialAdClicked", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13126d(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            m3700b("onRewardedInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed((Bundle) null);
        }

        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            m3699b("onRewardedInterstitialAdDisplayed", bundle);
        }

        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden((Bundle) null);
        }

        public void onRewardedInterstitialAdHidden(final Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            m3696a("onRewardedInterstitialAdHidden", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.mo13125c(C1730g.this.f2659i, bundle);
                }
            });
        }

        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14792d("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m3697a("onRewardedInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded((Bundle) null);
        }

        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            m3695a("onRewardedInterstitialAdLoaded", bundle);
        }

        public void onRewardedInterstitialAdVideoCompleted() {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded interstitial completed");
            }
            m3696a("onRewardedInterstitialAdVideoCompleted", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onRewardedVideoCompleted(C1730g.this.f2659i);
                }
            });
        }

        public void onRewardedInterstitialAdVideoStarted() {
            if (C2092v.m5047a()) {
                C2092v c = C1730g.this.f2653c;
                c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": rewarded interstitial started");
            }
            m3696a("onRewardedInterstitialAdVideoStarted", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                public void run() {
                    C1750a.this.f2726b.onRewardedVideoStarted(C1730g.this.f2659i);
                }
            });
        }

        public void onUserRewarded(final MaxReward maxReward) {
            if (C1730g.this.f2659i instanceof C1575c) {
                final C1575c cVar = (C1575c) C1730g.this.f2659i;
                if (cVar.mo13187H().compareAndSet(false, true)) {
                    if (C2092v.m5047a()) {
                        C2092v c = C1730g.this.f2653c;
                        c.mo14791c("MediationAdapterWrapper", C1730g.this.f2656f + ": user was rewarded: " + maxReward);
                    }
                    m3696a("onUserRewarded", (MaxAdListener) this.f2726b, (Runnable) new Runnable() {
                        public void run() {
                            C1750a.this.f2726b.onUserRewarded(cVar, maxReward);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$b */
    private static class C1772b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1581h f2765a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final MaxSignalCollectionListener f2766b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AtomicBoolean f2767c = new AtomicBoolean();

        C1772b(C1581h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f2765a = hVar;
            this.f2766b = maxSignalCollectionListener;
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$c */
    private class C1773c extends C1877a {
        private C1773c() {
            super("TaskTimeoutMediatedAd", C1730g.this.f2652b);
        }

        /* renamed from: a */
        private void m3704a(C1573a aVar) {
            if (aVar != null) {
                this.f3467b.mo14293H().mo13717a(aVar);
            }
        }

        public void run() {
            if (C1730g.this.f2666p.get()) {
                return;
            }
            if (C1730g.this.f2659i.mo13161k()) {
                if (C2092v.m5047a()) {
                    mo14142a(C1730g.this.f2656f + " is timing out, considering JS Tag ad loaded: " + C1730g.this.f2659i);
                }
                m3704a(C1730g.this.f2659i);
                return;
            }
            if (C2092v.m5047a()) {
                mo14147d(C1730g.this.f2656f + " is timing out " + C1730g.this.f2659i + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            m3704a(C1730g.this.f2659i);
            C1730g.this.f2663m.m3697a(mo14148e(), (MaxError) new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$d */
    private class C1774d extends C1877a {

        /* renamed from: c */
        private final C1772b f2770c;

        private C1774d(C1772b bVar) {
            super("TaskTimeoutSignalCollection", C1730g.this.f2652b);
            this.f2770c = bVar;
        }

        public void run() {
            if (!this.f2770c.f2767c.get()) {
                if (C2092v.m5047a()) {
                    mo14147d(C1730g.this.f2656f + " is timing out " + this.f2770c.f2765a + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                C1730g gVar = C1730g.this;
                gVar.m3661b("The adapter (" + C1730g.this.f2656f + ") timed out", this.f2770c);
            }
        }
    }

    C1730g(C1578f fVar, MaxAdapter maxAdapter, boolean z, C1959m mVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        } else if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        } else if (mVar != null) {
            this.f2654d = fVar.mo13208L();
            this.f2657g = maxAdapter;
            this.f2652b = mVar;
            this.f2653c = mVar.mo14286A();
            this.f2655e = fVar;
            this.f2656f = maxAdapter.getClass().getSimpleName();
            this.f2668r = z;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    private void m3655a(final Runnable runnable, final C1573a aVar) {
        m3658a("show_ad", (Runnable) new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad" + aVar + " : " + th;
                    if (C2092v.m5047a()) {
                        C2092v.m5053i("MediationAdapterWrapper", str);
                    }
                    C1730g.this.f2663m.m3700b("show_ad", (MaxError) new MaxErrorImpl(-1, str));
                    C1730g.this.m3656a("show_ad");
                    C1730g.this.f2652b.mo14288C().mo13600a(C1730g.this.f2655e.mo13207K(), "show_ad", C1730g.this.f2659i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3656a(String str) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2653c;
            vVar.mo14791c("MediationAdapterWrapper", "Marking " + this.f2656f + " as disabled due to: " + str);
        }
        this.f2665o.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3657a(String str, C1772b bVar) {
        if (bVar.f2767c.compareAndSet(false, true) && bVar.f2766b != null) {
            bVar.f2766b.onSignalCollected(str);
        }
    }

    /* renamed from: a */
    private void m3658a(final String str, final Runnable runnable) {
        C17488 r0 = new Runnable() {
            public void run() {
                try {
                    if (C2092v.m5047a()) {
                        C2092v c = C1730g.this.f2653c;
                        c.mo14789b("MediationAdapterWrapper", C1730g.this.f2656f + ": running " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    runnable.run();
                    if (C2092v.m5047a()) {
                        C2092v c2 = C1730g.this.f2653c;
                        c2.mo14789b("MediationAdapterWrapper", C1730g.this.f2656f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C2092v.m5049c("MediationAdapterWrapper", "Unable to run adapter operation " + str + ", marking " + C1730g.this.f2656f + " as disabled", th);
                    }
                    C1730g gVar = C1730g.this;
                    gVar.m3656a("fail_" + str);
                    if (!str.equals("destroy")) {
                        C1730g.this.f2652b.mo14288C().mo13600a(C1730g.this.f2655e.mo13207K(), str, C1730g.this.f2659i);
                    }
                }
            }
        };
        if (this.f2655e.mo13215S()) {
            this.f2651a.post(r0);
        } else {
            r0.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3661b(String str, C1772b bVar) {
        if (bVar.f2767c.compareAndSet(false, true) && bVar.f2766b != null) {
            bVar.f2766b.onSignalCollectionFailed(str);
        }
    }

    /* renamed from: b */
    private boolean m3662b(C1573a aVar, Activity activity) {
        MaxErrorImpl maxErrorImpl;
        if (aVar != null) {
            if (aVar.mo13143g() == null) {
                if (C2092v.m5047a()) {
                    C2092v.m5053i("MediationAdapterWrapper", "Adapter has been garbage collected");
                }
                maxErrorImpl = new MaxErrorImpl(-1, "Adapter has been garbage collected");
            } else if (aVar.mo13143g() != this) {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            } else if (activity == null) {
                throw new IllegalArgumentException("No activity specified");
            } else if (!this.f2665o.get()) {
                String str = "Mediation adapter '" + this.f2656f + "' is disabled. Showing ads with this adapter is disabled.";
                if (C2092v.m5047a()) {
                    C2092v.m5053i("MediationAdapterWrapper", str);
                }
                maxErrorImpl = new MaxErrorImpl(-1, str);
            } else if (mo13620g()) {
                return true;
            } else {
                throw new IllegalStateException("Mediation adapter '" + this.f2656f + "' does not have an ad loaded. Please load an ad first");
            }
            this.f2663m.m3700b("ad_show", (MaxError) maxErrorImpl);
            return false;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* renamed from: a */
    public View mo13607a() {
        return this.f2660j;
    }

    /* renamed from: a */
    public void mo13608a(C1573a aVar, final Activity activity) {
        Runnable runnable;
        if (m3662b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) C1730g.this.f2657g).showInterstitialAd(C1730g.this.f2664n, activity, C1730g.this.f2663m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) C1730g.this.f2657g).showRewardedAd(C1730g.this.f2664n, activity, C1730g.this.f2663m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) C1730g.this.f2657g).showRewardedInterstitialAd(C1730g.this.f2664n, activity, C1730g.this.f2663m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m3655a(runnable, aVar);
        }
    }

    /* renamed from: a */
    public void mo13609a(C1573a aVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (m3662b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) C1730g.this.f2657g).showInterstitialAd(C1730g.this.f2664n, viewGroup, lifecycle, activity, C1730g.this.f2663m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdViewAdapter) C1730g.this.f2657g).showRewardedAd(C1730g.this.f2664n, viewGroup, lifecycle, activity, C1730g.this.f2663m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m3655a(runnable, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13610a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final Runnable runnable) {
        m3658a("initialize", (Runnable) new Runnable() {
            public void run() {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                if (C2092v.m5047a()) {
                    C2092v c = C1730g.this.f2653c;
                    c.mo14789b("MediationAdapterWrapper", "Initializing " + C1730g.this.f2656f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + C1730g.this.f2655e.mo13215S());
                }
                C1730g.this.f2657g.initialize(maxAdapterInitializationParameters, activity, new MaxAdapter.OnCompletionListener() {
                    public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                            public void run() {
                                C1730g.this.f2652b.mo14289D().mo13589a(C1730g.this.f2655e, SystemClock.elapsedRealtime() - elapsedRealtime, initializationStatus, str);
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                        }, C1730g.this.f2655e.mo13220X());
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13611a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, C1581h hVar, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (!this.f2665o.get()) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("MediationAdapterWrapper", "Mediation adapter '" + this.f2656f + "' is disabled. Signal collection ads with this adapter is disabled.");
            }
            maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f2656f + ") is disabled");
        } else {
            final C1772b bVar = new C1772b(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f2657g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters2 = maxAdapterSignalCollectionParameters;
                final Activity activity2 = activity;
                final C1581h hVar2 = hVar;
                m3658a("collect_signal", (Runnable) new Runnable() {
                    public void run() {
                        try {
                            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters2, activity2, new MaxSignalCollectionListener() {
                                public void onSignalCollected(String str) {
                                    C1730g.this.m3657a(str, bVar);
                                }

                                public void onSignalCollectionFailed(String str) {
                                    C1730g.this.m3661b(str, bVar);
                                }
                            });
                        } catch (Throwable th) {
                            C1730g gVar = C1730g.this;
                            gVar.m3661b("Failed signal collection for " + C1730g.this.f2654d + " due to exception: " + th, bVar);
                            C1730g.this.m3656a("collect_signal");
                            C1730g.this.f2652b.mo14288C().mo13600a(C1730g.this.f2655e.mo13207K(), "collect_signal", C1730g.this.f2659i);
                        }
                        if (bVar.f2767c.get()) {
                            return;
                        }
                        if (hVar2.mo13219W() == 0) {
                            if (C2092v.m5047a()) {
                                C2092v c = C1730g.this.f2653c;
                                c.mo14789b("MediationAdapterWrapper", "Failing signal collection " + hVar2 + " since it has 0 timeout");
                            }
                            C1730g gVar2 = C1730g.this;
                            gVar2.m3661b("The adapter (" + C1730g.this.f2656f + ") has 0 timeout", bVar);
                        } else if (hVar2.mo13219W() > 0) {
                            if (C2092v.m5047a()) {
                                C2092v c2 = C1730g.this.f2653c;
                                c2.mo14789b("MediationAdapterWrapper", "Setting timeout " + hVar2.mo13219W() + "ms. for " + hVar2);
                            }
                            C1730g.this.f2652b.mo14303S().mo14207a((C1877a) new C1774d(bVar), C1908o.C1910a.MEDIATION_TIMEOUT, hVar2.mo13219W());
                        } else if (C2092v.m5047a()) {
                            C2092v c3 = C1730g.this.f2653c;
                            c3.mo14789b("MediationAdapterWrapper", "Negative timeout set for " + hVar2 + ", not scheduling a timeout");
                        }
                    }
                });
                return;
            }
            m3661b("The adapter (" + this.f2656f + ") does not support signal collection", bVar);
        }
    }

    /* renamed from: a */
    public void mo13612a(MaxNativeAdView maxNativeAdView) {
        this.f2662l = maxNativeAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13613a(String str, C1573a aVar) {
        this.f2658h = str;
        this.f2659i = aVar;
    }

    /* renamed from: a */
    public void mo13614a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final C1573a aVar, final Activity activity, MediationServiceImpl.C1569a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (!this.f2665o.get()) {
            String str2 = "Mediation adapter '" + this.f2656f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            if (C2092v.m5047a()) {
                C2092v.m5053i("MediationAdapterWrapper", str2);
            }
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
        } else {
            this.f2664n = maxAdapterResponseParameters;
            this.f2663m.m3692a(aVar2);
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) C1730g.this.f2657g).loadInterstitialAd(maxAdapterResponseParameters, activity, C1730g.this.f2663m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) C1730g.this.f2657g).loadRewardedAd(maxAdapterResponseParameters, activity, C1730g.this.f2663m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) C1730g.this.f2657g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, C1730g.this.f2663m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.NATIVE) {
                runnable = new Runnable() {
                    public void run() {
                        ((MediationAdapterBase) C1730g.this.f2657g).loadNativeAd(maxAdapterResponseParameters, activity, C1730g.this.f2663m);
                    }
                };
            } else if (aVar.getFormat().isAdViewAd()) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAdViewAdapter) C1730g.this.f2657g).loadAdViewAd(maxAdapterResponseParameters, aVar.getFormat(), activity, C1730g.this.f2663m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m3658a("load_ad", (Runnable) new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        String str = "Failed start loading " + aVar + " : " + th;
                        if (C2092v.m5047a()) {
                            C2092v.m5053i("MediationAdapterWrapper", str);
                        }
                        C1730g.this.f2663m.m3697a("load_ad", (MaxError) new MaxErrorImpl(-1, str));
                        C1730g.this.m3656a("load_ad");
                        C1730g.this.f2652b.mo14288C().mo13600a(C1730g.this.f2655e.mo13207K(), "load_ad", C1730g.this.f2659i);
                    }
                    if (!C1730g.this.f2666p.get()) {
                        long W = C1730g.this.f2655e.mo13219W();
                        if (W > 0) {
                            if (C2092v.m5047a()) {
                                C1730g.this.f2653c.mo14789b("MediationAdapterWrapper", "Setting timeout " + W + "ms. for " + aVar);
                            }
                            C1730g.this.f2652b.mo14303S().mo14207a((C1877a) new C1773c(), C1908o.C1910a.MEDIATION_TIMEOUT, W);
                        } else if (C2092v.m5047a()) {
                            C1730g.this.f2653c.mo14789b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public MaxNativeAd mo13615b() {
        return this.f2661k;
    }

    /* renamed from: c */
    public MaxNativeAdView mo13616c() {
        return this.f2662l;
    }

    /* renamed from: d */
    public String mo13617d() {
        return this.f2654d;
    }

    /* renamed from: e */
    public MediationServiceImpl.C1569a mo13618e() {
        return this.f2663m.f2726b;
    }

    /* renamed from: f */
    public boolean mo13619f() {
        return this.f2665o.get();
    }

    /* renamed from: g */
    public boolean mo13620g() {
        return this.f2666p.get() && this.f2667q.get();
    }

    /* renamed from: h */
    public String mo13621h() {
        MaxAdapter maxAdapter = this.f2657g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v.m5049c("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
            }
            m3656a("sdk_version");
            this.f2652b.mo14288C().mo13600a(this.f2655e.mo13207K(), "sdk_version", this.f2659i);
            return null;
        }
    }

    /* renamed from: i */
    public String mo13622i() {
        MaxAdapter maxAdapter = this.f2657g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v.m5049c("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
            }
            m3656a(TapjoyConstants.TJC_ADAPTER_VERSION);
            this.f2652b.mo14288C().mo13600a(this.f2655e.mo13207K(), TapjoyConstants.TJC_ADAPTER_VERSION, this.f2659i);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13623j() {
        if (!this.f2668r) {
            m3658a("destroy", (Runnable) new Runnable() {
                public void run() {
                    C1730g.this.m3656a("destroy");
                    C1730g.this.f2657g.onDestroy();
                    MaxAdapter unused = C1730g.this.f2657g = null;
                    View unused2 = C1730g.this.f2660j = null;
                    MaxNativeAd unused3 = C1730g.this.f2661k = null;
                    MaxNativeAdView unused4 = C1730g.this.f2662l = null;
                }
            });
        }
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f2656f + "'" + '}';
    }
}
