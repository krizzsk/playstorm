package com.fyber.inneractive.sdk.p189dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.C4170a;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p189dv.C4351b;
import com.fyber.inneractive.sdk.p189dv.C4360d;
import com.fyber.inneractive.sdk.p189dv.C4363f;
import com.fyber.inneractive.sdk.p189dv.enums.C4362a;
import com.fyber.inneractive.sdk.p189dv.handler.C4368c;
import com.fyber.inneractive.sdk.util.C5350l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b */
public class C4372b extends C4170a<InterstitialAd> {

    /* renamed from: k */
    public final InterstitialAdLoadCallback f10778k = new C4373a();

    /* renamed from: l */
    public final FullScreenContentCallback f10779l = new C4374b();

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$a */
    public class C4373a extends InterstitialAdLoadCallback {
        public C4373a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C4360d dVar = C4372b.this.f10754g;
            if (dVar != null) {
                ((C4351b) dVar).mo24372f();
                InneractiveAdRequest inneractiveAdRequest = C4372b.this.f10913a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4362a aVar = C4362a.Load;
                C4372b bVar = C4372b.this;
                C4368c.m13611a(spotId, aVar, bVar.f10913a, (C4363f) bVar.f10914b, loadAdError.getMessage());
            }
        }

        public void onAdLoaded(Object obj) {
            T t = (InterstitialAd) obj;
            C4372b bVar = C4372b.this;
            if (bVar.f10754g != null) {
                bVar.f10756i = t;
                bVar.mo23832f();
                ((C4351b) C4372b.this.f10754g).mo24571d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$b */
    public class C4374b extends FullScreenContentCallback {
        public C4374b() {
        }

        public void onAdDismissedFullScreenContent() {
            C4371a aVar = C4372b.this.f10317j;
            if (aVar != null) {
                aVar.mo24403i();
            }
        }

        public void onAdShowedFullScreenContent() {
            C4371a aVar = C4372b.this.f10317j;
            if (aVar != null) {
                aVar.mo24405v();
            }
        }
    }

    public C4372b(C4346z zVar, C4309s sVar, C4363f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24366a(AdRequest adRequest, C4360d dVar) {
        this.f10754g = dVar;
        InterstitialAd.load(C5350l.f14216a, "FyberInterstitial", adRequest, this.f10778k);
    }

    /* renamed from: d */
    public boolean mo24373d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo24368e() {
        return this.f10756i != null;
    }

    /* renamed from: a */
    public void mo23831a(C4371a aVar, Activity activity) {
        this.f10317j = aVar;
        T t = this.f10756i;
        if (t != null) {
            ((InterstitialAd) t).setFullScreenContentCallback(this.f10779l);
            ((InterstitialAd) this.f10756i).show(activity);
        }
    }
}
