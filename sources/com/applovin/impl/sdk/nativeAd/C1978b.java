package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1826c;
import com.applovin.impl.sdk.p046ad.C1828d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.nativeAd.b */
public class C1978b extends C1979c {

    /* renamed from: c */
    private final C1826c f3743c;

    public C1978b(C1826c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1959m mVar) {
        super(C1828d.m3846a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, mVar);
        this.f3743c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14183a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f3743c.mo13923a());
        hashMap.put("adtoken_prefix", this.f3743c.mo13925c());
        return hashMap;
    }
}
