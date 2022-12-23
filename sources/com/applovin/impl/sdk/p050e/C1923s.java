package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.s */
class C1923s extends C1877a {

    /* renamed from: a */
    private final JSONObject f3564a;

    /* renamed from: c */
    private final JSONObject f3565c;

    /* renamed from: d */
    private final AppLovinAdLoadListener f3566d;

    /* renamed from: e */
    private final C1825b f3567e;

    C1923s(JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        super("TaskRenderAppLovinAd", mVar);
        this.f3564a = jSONObject;
        this.f3565c = jSONObject2;
        this.f3567e = bVar;
        this.f3566d = appLovinAdLoadListener;
    }

    public void run() {
        if (C2092v.m5047a()) {
            mo14142a("Rendering ad...");
        }
        C1824a aVar = new C1824a(this.f3564a, this.f3565c, this.f3567e, this.f3467b);
        boolean booleanValue = JsonUtils.getBoolean(this.f3564a, "gs_load_immediately", false).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f3564a, "vs_load_immediately", true).booleanValue();
        C1886d dVar = new C1886d(aVar, this.f3467b, this.f3566d);
        dVar.mo14177a(booleanValue2);
        dVar.mo14178b(booleanValue);
        C1908o.C1910a aVar2 = C1908o.C1910a.CACHING_OTHER;
        if (((Boolean) this.f3467b.mo14311a(C1857b.f3158bi)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = C1908o.C1910a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = C1908o.C1910a.CACHING_INCENTIVIZED;
            }
        }
        this.f3467b.mo14303S().mo14206a((C1877a) dVar, aVar2);
    }
}
