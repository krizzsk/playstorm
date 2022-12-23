package com.fyber.inneractive.sdk.external;

public enum InneractiveMediationName {
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER("other");
    

    /* renamed from: a */
    public final String f10840a;

    /* access modifiers changed from: public */
    InneractiveMediationName(String str) {
        this.f10840a = str;
    }

    public String getKey() {
        return this.f10840a;
    }
}
