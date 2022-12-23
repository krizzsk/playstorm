package com.fyber.inneractive.sdk.response;

/* renamed from: com.fyber.inneractive.sdk.response.a */
public enum C5287a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    RETURNED_ADTYPE_MOBILE_ADS(15);
    

    /* renamed from: a */
    public int f14054a;

    /* access modifiers changed from: public */
    C5287a(int i) {
        this.f14054a = i;
    }

    /* renamed from: a */
    public static C5287a m16615a(int i) {
        for (C5287a aVar : values()) {
            if (aVar.f14054a == i) {
                return aVar;
            }
        }
        return null;
    }
}
