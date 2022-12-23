package com.fyber.marketplace.fairbid.bridge;

public enum MarketplaceAdShowError {
    GENERIC_SHOW_ERROR("Generic Error"),
    EXPIRED_AD_ERROR("Expired Ad Error");
    

    /* renamed from: a */
    public final String f14402a;

    /* access modifiers changed from: public */
    MarketplaceAdShowError(String str) {
        this.f14402a = str;
    }

    public String getMessage() {
        return this.f14402a;
    }
}
