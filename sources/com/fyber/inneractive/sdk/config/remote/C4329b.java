package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.b */
public class C4329b {

    /* renamed from: a */
    public UnitDisplayType f10701a;

    /* renamed from: b */
    public Boolean f10702b;

    /* renamed from: c */
    public Integer f10703c;

    /* renamed from: d */
    public Integer f10704d;

    /* renamed from: a */
    public static C4329b m13555a(JSONObject jSONObject) {
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C4329b bVar = new C4329b();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("hide", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("refresh", Integer.MIN_VALUE));
        bVar.f10701a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.f10702b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.f10704d = valueOf;
        if (valueOf2.intValue() != Integer.MIN_VALUE) {
            num = valueOf2;
        }
        bVar.f10703c = num;
        return bVar;
    }
}
