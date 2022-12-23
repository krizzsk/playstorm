package com.applovin.impl.mediation.debugger.p034b.p035a;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.e */
public class C1659e {

    /* renamed from: a */
    private final String f2344a;

    /* renamed from: b */
    private final String f2345b;

    public C1659e(JSONObject jSONObject, C1959m mVar) {
        this.f2344a = JsonUtils.getString(jSONObject, "id", "");
        this.f2345b = JsonUtils.getString(jSONObject, "price", (String) null);
    }

    /* renamed from: a */
    public String mo13422a() {
        return this.f2344a;
    }

    /* renamed from: b */
    public String mo13423b() {
        return this.f2345b;
    }
}
