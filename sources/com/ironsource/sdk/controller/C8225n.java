package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.n */
public final class C8225n {

    /* renamed from: a */
    String f19662a;

    /* renamed from: b */
    JSONObject f19663b;

    /* renamed from: c */
    String f19664c;

    /* renamed from: d */
    String f19665d;

    public C8225n(JSONObject jSONObject) {
        this.f19662a = jSONObject.optString("functionName");
        this.f19663b = jSONObject.optJSONObject("functionParams");
        this.f19664c = jSONObject.optString("success");
        this.f19665d = jSONObject.optString("fail");
    }

    /* renamed from: a */
    public final JSONObject mo56578a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f19662a);
            jSONObject.put("functionParams", this.f19663b);
            jSONObject.put("success", this.f19664c);
            jSONObject.put("fail", this.f19665d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
