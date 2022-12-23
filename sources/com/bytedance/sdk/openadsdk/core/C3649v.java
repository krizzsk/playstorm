package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2981q;
import com.bytedance.sdk.component.utils.C2988w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3226b;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3606d;
import com.bytedance.sdk.openadsdk.core.p145a.C3403b;
import com.bytedance.sdk.openadsdk.core.p145a.C3406c;
import com.bytedance.sdk.openadsdk.core.p145a.C3409d;
import com.bytedance.sdk.openadsdk.core.p145a.C3413e;
import com.bytedance.sdk.openadsdk.core.p145a.C3416f;
import com.bytedance.sdk.openadsdk.core.p145a.C3419g;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p152f.C3510a;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.v */
/* compiled from: TTAdNativeImpl */
public class C3649v implements TTAdNative {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3581n f9269a = C3578m.m11239f();

    /* renamed from: b */
    private volatile Context f9270b;

    public C3649v(Context context) {
        this.f9270b = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Context m11612a() {
        if (this.f9270b == null) {
            this.f9270b = C3578m.m11231a();
        }
        return this.f9270b;
    }

    public void loadFeedAd(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        C3406c cVar = new C3406c(feedAdListener);
        final C3406c cVar2 = cVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        m11614a(new C2955g("loadFeedAd") {
            public void run() {
                if (!C3649v.this.m11617a((C3226b) cVar2)) {
                    try {
                        C3649v.this.m11622c(adSlot2);
                        try {
                            Method a = C2988w.m8466a("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, TTAdNative.FeedAdListener.class);
                            if (a != null) {
                                a.invoke((Object) null, new Object[]{C3649v.this.m11612a(), adSlot2, cVar2});
                            }
                        } catch (Throwable th) {
                            C2975l.m8385b("TTAdNativeImpl", "feed component maybe not exist, pls check1", th);
                        }
                    } catch (Exception unused) {
                        C2975l.m8383b("Ad Slot not Valid, please check");
                        feedAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, cVar, adSlot);
    }

    public void loadNativeAd(AdSlot adSlot, TTAdNative.NativeAdListener nativeAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        adSlot.setDurationSlotType(adSlot.getNativeAdType());
        C3413e eVar = new C3413e(nativeAdListener);
        final C3413e eVar2 = eVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.NativeAdListener nativeAdListener2 = nativeAdListener;
        m11614a(new C2955g("loadNativeAd") {
            public void run() {
                if (!C3649v.this.m11617a((C3226b) eVar2)) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    try {
                        C3649v.this.m11620b(adSlot2);
                        C3581n b = C3649v.this.f9269a;
                        AdSlot adSlot = adSlot2;
                        b.mo20073a(adSlot, (C3500o) null, adSlot.getNativeAdType(), new C3581n.C3582a() {
                            /* renamed from: a */
                            public void mo18544a(int i, String str) {
                                eVar2.onError(i, str);
                            }

                            /* renamed from: a */
                            public void mo18545a(C3469a aVar, C3470b bVar) {
                                if (aVar.mo19477b() == null || aVar.mo19477b().isEmpty()) {
                                    eVar2.onError(-3, C3513g.m10825a(-3));
                                    bVar.mo19482a(-3);
                                    C3470b.m10407a(bVar);
                                    return;
                                }
                                List<C3498n> b = aVar.mo19477b();
                                ArrayList arrayList = new ArrayList(b.size());
                                for (C3498n next : b) {
                                    if (next.mo19671ao()) {
                                        arrayList.add(new C3510a(C3649v.this.m11612a(), next, adSlot2.getNativeAdType()) {
                                        });
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                                        C3156e.m9181a(b.get(0), C4014u.m13198b(adSlot2.getNativeAdType()), System.currentTimeMillis() - currentTimeMillis);
                                    } else {
                                        C3156e.m9191b(C3649v.this.m11612a(), b.get(0), C4014u.m13198b(adSlot2.getDurationSlotType()), currentTimeMillis);
                                    }
                                    eVar2.onNativeAdLoad(arrayList);
                                    return;
                                }
                                eVar2.onError(-4, C3513g.m10825a(-4));
                                bVar.mo19482a(-4);
                                C3470b.m10407a(bVar);
                            }
                        });
                    } catch (Exception unused) {
                        C2975l.m8383b("Ad Slot not Valid, please check");
                        nativeAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, eVar, adSlot);
    }

    public void loadRewardVideoAd(final AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        final C3419g gVar = new C3419g(rewardVideoAdListener);
        m11614a(new C2955g("loadRewardVideoAd") {
            public void run() {
                if (!C3649v.this.m11617a((C3226b) gVar)) {
                    try {
                        Method a = C2988w.m8466a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, TTAdNative.RewardVideoAdListener.class);
                        if (a != null) {
                            a.invoke((Object) null, new Object[]{C3649v.this.m11612a(), adSlot, gVar});
                        }
                    } catch (Throwable th) {
                        C2975l.m8385b("TTAdNativeImpl", "reward component maybe not exist, pls check1", th);
                    }
                }
            }
        }, gVar, adSlot);
    }

    public void loadFullScreenVideoAd(final AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        final C3409d dVar = new C3409d(fullScreenVideoAdListener);
        m11614a(new C2955g("loadFullScreenVideoAd") {
            public void run() {
                if (!C3649v.this.m11617a((C3226b) dVar)) {
                    try {
                        Method a = C2988w.m8466a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, TTAdNative.FullScreenVideoAdListener.class);
                        if (a != null) {
                            a.invoke((Object) null, new Object[]{C3649v.this.m11612a(), adSlot, dVar});
                        }
                    } catch (Throwable th) {
                        C2975l.m8385b("TTAdNativeImpl", "reward component maybe not exist, pls check2", th);
                    }
                }
            }
        }, dVar, adSlot);
    }

    public void loadBannerExpressAd(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        final C3416f fVar = new C3416f(nativeExpressAdListener);
        m11614a(new C2955g("loadBannerExpressAd") {
            public void run() {
                if (!C3649v.this.m11617a((C3226b) fVar)) {
                    adSlot.setNativeAdType(1);
                    adSlot.setDurationSlotType(1);
                    C3606d.m11392a(C3649v.this.m11612a()).mo20179a(adSlot, 1, fVar, 5000);
                }
            }
        }, fVar, adSlot);
    }

    public void loadAppOpenAd(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        C3403b bVar = new C3403b(appOpenAdListener);
        final C3403b bVar2 = bVar;
        final AdSlot adSlot2 = adSlot;
        final int i2 = i;
        m11614a(new C2955g("loadSplashAd b") {
            public void run() {
                Method a;
                try {
                    if (!C3649v.this.m11617a((C3226b) bVar2) && (a = C2988w.m8466a("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, TTAdNative.AppOpenAdListener.class, Integer.TYPE)) != null) {
                        a.invoke((Object) null, new Object[]{C3649v.this.m11612a(), adSlot2, bVar2, Integer.valueOf(i2)});
                    }
                } catch (Throwable th) {
                    C2975l.m8388c("TTAdNativeImpl", "open component maybe not exist, please check", th);
                }
            }
        }, bVar, adSlot);
    }

    /* renamed from: a */
    private void m11615a(AdSlot adSlot) {
        boolean z = true;
        C2981q.m8416a(adSlot.getImgAcceptedWidth() > 0, "Image material size must be set");
        if (adSlot.getImgAcceptedHeight() <= 0) {
            z = false;
        }
        C2981q.m8416a(z, "Image material size must be set");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11620b(AdSlot adSlot) {
        m11615a(adSlot);
        C2981q.m8416a(adSlot.getNativeAdType() > 0, "Must set the type of requesting native ads, currently supports TYPE_BANNER and TYPE_INTERACTION_AD");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11622c(AdSlot adSlot) {
        m11615a(adSlot);
        C2981q.m8416a(adSlot.getNativeAdType() == 0, "Request the type of non-native ad, please do not call the setNativeAdType() method");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m11617a(C3226b bVar) {
        if (C3536e.m10968a()) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    /* renamed from: a */
    private void m11614a(C2955g gVar, C3226b bVar, AdSlot adSlot) {
        if (!TTAdSdk.isInitSuccess()) {
            C2975l.m8391e("TTAdNativeImpl", "please exec TTAdSdk.init before load ad");
            if (bVar != null) {
                bVar.onError(10000, "Please exec TTAdSdk.init before load ad");
                return;
            }
            return;
        }
        C3156e.m9178a(adSlot);
        C2952e.m8312b(5).execute(gVar);
    }
}
