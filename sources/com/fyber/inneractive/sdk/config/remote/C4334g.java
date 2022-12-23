package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.g */
public class C4334g {

    /* renamed from: a */
    public UnitDisplayType f10710a;

    /* renamed from: a */
    public static C4334g m13560a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C4334g gVar = new C4334g();
        UnitDisplayType fromValue = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (fromValue == null) {
            return null;
        }
        gVar.f10710a = fromValue;
        return gVar;
    }
}
