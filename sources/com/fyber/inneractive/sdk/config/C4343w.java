package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5355m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.w */
public class C4343w implements C5355m0.C5356a {

    /* renamed from: a */
    public UnitDisplayType f10742a;

    /* renamed from: a */
    public JSONObject mo24263a() {
        JSONObject jSONObject = new JSONObject();
        C5355m0.m16771a(jSONObject, "unitDisplayType", this.f10742a);
        return jSONObject;
    }
}
