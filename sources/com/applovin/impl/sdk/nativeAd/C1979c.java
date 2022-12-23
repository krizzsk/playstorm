package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1893h;
import com.applovin.impl.sdk.utils.C2040h;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.c */
public class C1979c extends C1893h {

    /* renamed from: c */
    private final AppLovinNativeAdLoadListener f3744c;

    public C1979c(C1828d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1959m mVar) {
        super(dVar, str, mVar);
        this.f3744c = appLovinNativeAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1877a mo14182a(JSONObject jSONObject) {
        return new C1980d(jSONObject, this.f3744c, this.f3467b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14184a(int i) {
        super.mo14184a(i);
        this.f3744c.onNativeAdLoadFailed(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo14185b() {
        return C2040h.m4912i(this.f3467b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14187c() {
        return C2040h.m4913j(this.f3467b);
    }
}
