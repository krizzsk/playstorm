package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5355m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.r */
public class C4327r implements C5355m0.C5356a {

    /* renamed from: a */
    public Integer f10690a = null;

    /* renamed from: b */
    public UnitDisplayType f10691b;

    /* renamed from: c */
    public Boolean f10692c;

    /* renamed from: d */
    public Integer f10693d;

    /* renamed from: a */
    public JSONObject mo24263a() {
        JSONObject jSONObject = new JSONObject();
        C5355m0.m16771a(jSONObject, "refresh", this.f10690a);
        C5355m0.m16771a(jSONObject, "unitDisplayType", this.f10691b);
        C5355m0.m16771a(jSONObject, "close", this.f10692c);
        C5355m0.m16771a(jSONObject, "hideDelay", this.f10693d);
        return jSONObject;
    }
}
