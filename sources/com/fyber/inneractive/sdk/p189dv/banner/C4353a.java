package com.fyber.inneractive.sdk.p189dv.banner;

import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p189dv.C4350a;
import com.fyber.inneractive.sdk.p189dv.C4351b;
import com.fyber.inneractive.sdk.p189dv.C4360d;
import com.fyber.inneractive.sdk.p189dv.C4363f;
import com.fyber.inneractive.sdk.p189dv.enums.C4362a;
import com.fyber.inneractive.sdk.p189dv.handler.C4368c;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5350l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.fyber.inneractive.sdk.dv.banner.a */
public class C4353a extends C4350a<AdView> {

    /* renamed from: j */
    public boolean f10759j = false;

    /* renamed from: k */
    public boolean f10760k = false;

    /* renamed from: l */
    public final AdListener f10761l = new C4354a();

    /* renamed from: com.fyber.inneractive.sdk.dv.banner.a$a */
    public class C4354a extends AdListener {
        public C4354a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            InneractiveAdRequest inneractiveAdRequest = C4353a.this.f10913a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            C4362a aVar = C4362a.Load;
            C4353a aVar2 = C4353a.this;
            C4368c.m13611a(spotId, aVar, aVar2.f10913a, (C4363f) aVar2.f10914b, loadAdError.getMessage());
        }

        public void onAdImpression() {
            C4353a aVar = C4353a.this;
            C4355b bVar = aVar.f10755h;
            if (bVar != null) {
                bVar.mo24385v();
            } else {
                boolean unused = aVar.f10759j = true;
            }
        }

        public void onAdLoaded() {
            C4353a aVar = C4353a.this;
            if (aVar.f10754g != null) {
                boolean unused = aVar.f10760k = true;
                ((C4351b) C4353a.this.f10754g).mo24571d();
            }
        }

        public void onAdOpened() {
            C4363f fVar;
            C4251b bVar;
            C4355b bVar2 = C4353a.this.f10755h;
            if (bVar2 != null) {
                bVar2.mo24609z();
                AdContent adcontent = bVar2.f10921b;
                if (adcontent != null && (fVar = (C4363f) ((C4353a) adcontent).f10914b) != null) {
                    bVar2.mo24602a((C5291e) fVar);
                    C4346z zVar = ((C4353a) bVar2.f10921b).f10916d;
                    if (zVar != null) {
                        C4345y yVar = (C4345y) zVar;
                        if (yVar.f10747c != null) {
                            C4250a aVar = C4250a.CLICK;
                            if (yVar.f10747c.f10691b == UnitDisplayType.MRECT) {
                                bVar = C4251b.RECTANGLE_DISPLAY;
                            } else {
                                bVar = C4251b.BANNER_DISPLAY;
                            }
                            bVar2.mo24600a(aVar, bVar);
                        }
                    }
                }
            }
        }
    }

    public C4353a(C4346z zVar, C4309s sVar, C4363f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: d */
    public boolean mo24373d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo24368e() {
        return this.f10760k;
    }

    /* renamed from: a */
    public void mo24366a(AdRequest adRequest, C4360d dVar) {
        C4327r rVar;
        this.f10754g = dVar;
        T adView = new AdView(C5350l.f14216a);
        this.f10756i = adView;
        AdSize adSize = AdSize.BANNER;
        C4346z zVar = this.f10916d;
        if (!(zVar == null || (rVar = ((C4345y) zVar).f10747c) == null || rVar.f10691b != UnitDisplayType.MRECT)) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f10756i).setAdUnitId("FyberBanner");
        ((AdView) this.f10756i).setAdListener(this.f10761l);
        ((AdView) this.f10756i).loadAd(adRequest);
    }
}
