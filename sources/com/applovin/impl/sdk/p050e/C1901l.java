package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p046ad.C1826c;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.l */
public class C1901l extends C1900k {

    /* renamed from: c */
    private final C1826c f3507c;

    public C1901l(C1826c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        super(C1828d.m3846a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", mVar);
        this.f3507c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14183a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f3507c.mo13923a());
        hashMap.put("adtoken_prefix", this.f3507c.mo13925c());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1825b mo14188h() {
        return C1825b.REGULAR_AD_TOKEN;
    }
}
