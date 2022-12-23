package com.p374my.target;

import org.json.JSONObject;

/* renamed from: com.my.target.g4 */
public class C9713g4 {
    /* renamed from: a */
    public static C9713g4 m28068a() {
        return new C9713g4();
    }

    /* renamed from: a */
    public void mo64094a(JSONObject jSONObject, C10029x2 x2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            mo64095b(optJSONObject, x2Var);
        }
    }

    /* renamed from: b */
    public final void mo64095b(JSONObject jSONObject, C10029x2 x2Var) {
        x2Var.mo65698a(jSONObject.optBoolean("hasAdditionalAds", x2Var.mo65700d()));
    }
}
