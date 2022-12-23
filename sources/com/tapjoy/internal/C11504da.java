package com.tapjoy.internal;

import com.vungle.warren.model.Advertisement;

/* renamed from: com.tapjoy.internal.da */
public enum C11504da {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(Advertisement.KEY_POSTROLL),
    STANDALONE("standalone");
    

    /* renamed from: e */
    private final String f27844e;

    private C11504da(String str) {
        this.f27844e = str;
    }

    public final String toString() {
        return this.f27844e;
    }
}
