package com.inmobi.ads;

import org.json.JSONObject;

public final class AdMetaInfo {

    /* renamed from: a */
    private String f19335a;

    /* renamed from: b */
    private JSONObject f19336b;

    public AdMetaInfo(String str, JSONObject jSONObject) {
        this.f19335a = str;
        this.f19336b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f19336b;
        if (jSONObject == null) {
            return 0.0d;
        }
        return jSONObject.optDouble("buyerPrice");
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f19336b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String getCreativeID() {
        return this.f19335a;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f19336b;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("bidKeyword");
    }
}
