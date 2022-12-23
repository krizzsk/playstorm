package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.e */
public class C4249e {

    /* renamed from: a */
    public int f10503a;

    /* renamed from: b */
    public int f10504b;

    /* renamed from: c */
    public int f10505c;

    /* renamed from: d */
    public long f10506d;

    public C4249e() {
        this(0, 0, 0, System.currentTimeMillis());
    }

    /* renamed from: a */
    public JSONObject mo24254a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.f10506d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f10503a);
        if (z2) {
            jSONObject.put("com", this.f10505c);
        }
        jSONObject.put("cli", this.f10504b);
        return jSONObject;
    }

    public C4249e(int i, int i2, int i3, long j) {
        this.f10506d = j;
        this.f10503a = i;
        this.f10504b = i2;
        this.f10505c = i3;
    }

    /* renamed from: a */
    public static C4249e m13423a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("time");
        int optInt = jSONObject.optInt("cli", -1);
        int optInt2 = jSONObject.optInt("imp", -1);
        int optInt3 = jSONObject.optInt("com", -1);
        if (optLong == 0 || optInt < 0 || optInt2 < 0 || optInt3 < 0) {
            return null;
        }
        return new C4249e(optInt2, optInt, optInt3, optLong);
    }
}
