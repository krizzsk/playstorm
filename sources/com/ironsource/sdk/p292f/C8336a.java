package com.ironsource.sdk.p292f;

import com.ironsource.mediationsdk.model.C6692b;
import com.ironsource.mediationsdk.model.C6693c;
import com.ironsource.mediationsdk.model.C6694d;
import com.ironsource.mediationsdk.model.C6707p;
import com.ironsource.mediationsdk.utils.C6764b;
import com.ironsource.mediationsdk.utils.C6773j;
import com.ironsource.mediationsdk.utils.C6784p;
import com.ironsource.sdk.controller.C8246u;
import com.ironsource.sdk.p293g.C8343d;

/* renamed from: com.ironsource.sdk.f.a */
public class C8336a {

    /* renamed from: a */
    private C6694d f19979a;

    /* renamed from: b */
    private C6707p f19980b;

    /* renamed from: c */
    private C6784p f19981c;

    /* renamed from: d */
    private boolean f19982d;

    /* renamed from: e */
    private C8246u f19983e;

    /* renamed from: f */
    private C6764b f19984f;

    /* renamed from: g */
    private C6693c f19985g;

    /* renamed from: h */
    private C6773j f19986h;

    /* renamed from: i */
    private C6692b f19987i;

    /* renamed from: com.ironsource.sdk.f.a$a */
    public static class C8337a {

        /* renamed from: a */
        public String f19988a;

        /* renamed from: b */
        public String f19989b;

        /* renamed from: c */
        public String f19990c;

        /* renamed from: a */
        public static C8337a m23905a(C8343d.C8348e eVar) {
            String str;
            C8337a aVar = new C8337a();
            if (eVar == C8343d.C8348e.RewardedVideo) {
                aVar.f19988a = "showRewardedVideo";
                aVar.f19989b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == C8343d.C8348e.Interstitial) {
                aVar.f19988a = "showInterstitial";
                aVar.f19989b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == C8343d.C8348e.OfferWall) {
                    aVar.f19988a = "showOfferWall";
                    aVar.f19989b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return aVar;
            }
            aVar.f19990c = str;
            return aVar;
        }
    }

    public C8336a() {
        this.f19979a = new C6694d();
    }

    public C8336a(C6694d dVar, C6707p pVar, C6784p pVar2, boolean z, C8246u uVar, C6764b bVar, C6693c cVar, C6773j jVar, C6692b bVar2) {
        this.f19979a = dVar;
        this.f19980b = pVar;
        this.f19981c = pVar2;
        this.f19982d = z;
        this.f19983e = uVar;
        this.f19984f = bVar;
        this.f19985g = cVar;
        this.f19986h = jVar;
        this.f19987i = bVar2;
    }

    /* renamed from: a */
    public C6694d mo56830a() {
        return this.f19979a;
    }

    /* renamed from: b */
    public C6707p mo56831b() {
        return this.f19980b;
    }

    /* renamed from: c */
    public C6784p mo56832c() {
        return this.f19981c;
    }

    /* renamed from: d */
    public boolean mo56833d() {
        return this.f19982d;
    }

    /* renamed from: e */
    public C8246u mo56834e() {
        return this.f19983e;
    }

    /* renamed from: f */
    public C6764b mo56835f() {
        return this.f19984f;
    }

    /* renamed from: g */
    public C6693c mo56836g() {
        return this.f19985g;
    }

    /* renamed from: h */
    public C6773j mo56837h() {
        return this.f19986h;
    }

    /* renamed from: i */
    public C6692b mo56838i() {
        return this.f19987i;
    }
}
