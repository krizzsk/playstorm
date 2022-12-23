package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.k */
public class C1900k extends C1893h {

    /* renamed from: c */
    private final AppLovinAdLoadListener f3506c;

    public C1900k(C1828d dVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", mVar);
    }

    public C1900k(C1828d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, C1959m mVar) {
        super(dVar, str, mVar);
        this.f3506c = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1877a mo14182a(JSONObject jSONObject) {
        return new C1914p(jSONObject, this.f3497a, mo14188h(), this.f3506c, this.f3467b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14184a(int i) {
        super.mo14184a(i);
        this.f3506c.failedToReceiveAd(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo14185b() {
        return C2040h.m4910g(this.f3467b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14187c() {
        return C2040h.m4911h(this.f3467b);
    }
}
