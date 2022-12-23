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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c */
public class C4375c extends C4170a<InterstitialAd> {

    /* renamed from: k */
    public final AdListener f10782k = new C4376a();

    /* renamed from: l */
    public final AdListener f10783l = new C4377b();

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c$a */
    public class C4376a extends AdListener {
        public C4376a() {
        }

        public void onAdFailedToLoad(int i) {
            C4360d dVar = C4375c.this.f10754g;
            if (dVar != null) {
                ((C4351b) dVar).mo24372f();
                InneractiveAdRequest inneractiveAdRequest = C4375c.this.f10913a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4362a aVar = C4362a.Load;
                C4375c cVar = C4375c.this;
                C4368c.m13611a(spotId, aVar, cVar.f10913a, (C4363f) cVar.f10914b, String.format("errorCode - %d", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void onAdLoaded() {
            C4375c cVar = C4375c.this;
            if (cVar.f10754g != null) {
                cVar.mo23832f();
                ((C4351b) C4375c.this.f10754g).mo24571d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c$b */
    public class C4377b extends AdListener {
        public C4377b() {
        }

        public void onAdClicked() {
            C4371a aVar = C4375c.this.f10317j;
            if (aVar != null) {
                aVar.mo24402d();
            }
        }

        public void onAdClosed() {
            C4371a aVar = C4375c.this.f10317j;
            if (aVar != null) {
                aVar.mo24403i();
            }
        }

        public void onAdImpression() {
            C4371a aVar = C4375c.this.f10317j;
            if (aVar != null) {
                aVar.mo24405v();
            }
        }

        public void onAdOpened() {
            C4371a aVar = C4375c.this.f10317j;
            if (aVar != null) {
                aVar.mo24405v();
            }
        }
    }

    public C4375c(C4346z zVar, C4309s sVar, C4363f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24366a(AdRequest adRequest, C4360d dVar) {
        this.f10754g = dVar;
        T interstitialAd = new InterstitialAd(C5350l.f14216a);
        this.f10756i = interstitialAd;
        interstitialAd.setAdListener(this.f10782k);
        ((InterstitialAd) this.f10756i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f10756i).loadAd(adRequest);
    }

    /* renamed from: d */
    public boolean mo24373d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo24368e() {
        T t = this.f10756i;
        return t != null && ((InterstitialAd) t).isLoaded();
    }

    /* renamed from: a */
    public void mo23831a(C4371a aVar, Activity activity) {
        this.f10317j = aVar;
        T t = this.f10756i;
        if (t != null) {
            ((InterstitialAd) t).setAdListener(this.f10783l);
            ((InterstitialAd) this.f10756i).show();
        }
    }
}
