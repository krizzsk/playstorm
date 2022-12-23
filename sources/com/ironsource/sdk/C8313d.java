package com.ironsource.sdk;

import com.ironsource.sdk.p293g.C8343d;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d */
public final class C8313d {

    /* renamed from: a */
    private static String f19911a = "ManRewInst_";

    /* renamed from: a */
    public static String m23810a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static String m23811a(C8158b bVar) {
        return (bVar.mo56419a() ? C8343d.C8348e.Banner : bVar.f19442a ? C8343d.C8348e.RewardedVideo : C8343d.C8348e.Interstitial).toString();
    }

    /* renamed from: a */
    public static String m23812a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f19911a + jSONObject.optString("name");
    }
}
