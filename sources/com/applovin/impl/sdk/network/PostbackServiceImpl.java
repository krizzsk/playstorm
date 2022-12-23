package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1890g;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a */
    private final C1959m f3769a;

    public PostbackServiceImpl(C1959m mVar) {
        this.f3769a = mVar;
    }

    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(C2010i.m4714b(this.f3769a).mo14501a(str).mo14512c(false).mo14505a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(C2010i iVar, C1908o.C1910a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f3769a.mo14303S().mo14206a((C1877a) new C1890g(iVar, aVar, this.f3769a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(C2010i iVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(iVar, C1908o.C1910a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
