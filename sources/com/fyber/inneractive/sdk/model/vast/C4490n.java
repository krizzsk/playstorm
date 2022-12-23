package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.n */
public enum C4490n {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    UNKNOWN("unknown");
    

    /* renamed from: f */
    public static final Map<String, C4490n> f11122f = null;

    /* renamed from: a */
    public final String f11124a;

    /* access modifiers changed from: public */
    static {
        int i;
        f11122f = new HashMap();
        for (C4490n nVar : values()) {
            ((HashMap) f11122f).put(nVar.f11124a, nVar);
        }
    }

    /* access modifiers changed from: public */
    C4490n(String str) {
        this.f11124a = str;
    }
}
