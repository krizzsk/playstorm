package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.j */
public class C1899j extends C1900k {

    /* renamed from: c */
    private final List<String> f3505c;

    public C1899j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        super(C1828d.m3846a(m4228a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", mVar);
        this.f3505c = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    private static String m4228a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("No zone identifiers specified");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14183a() {
        HashMap hashMap = new HashMap(1);
        List<String> list = this.f3505c;
        hashMap.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1825b mo14188h() {
        return C1825b.APPLOVIN_MULTIZONE;
    }
}
