package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.h */
public enum C4484h {
    Gif("image/gif");
    

    /* renamed from: c */
    public static final Map<String, C4484h> f11099c = null;

    /* renamed from: a */
    public String f11101a;

    /* access modifiers changed from: public */
    static {
        int i;
        f11099c = new HashMap();
        for (C4484h hVar : values()) {
            ((HashMap) f11099c).put(hVar.f11101a, hVar);
        }
    }

    /* access modifiers changed from: public */
    C4484h(String str) {
        this.f11101a = str;
    }
}
