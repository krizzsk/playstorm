package com.ironsource.sdk.p294h;

import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.e */
public final class C8357e {

    /* renamed from: a */
    public JSONObject f20075a;

    public C8357e(JSONObject jSONObject) {
        this.f20075a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public final boolean mo56877a() {
        return this.f20075a.optBoolean("useCacheDir", false);
    }
}
