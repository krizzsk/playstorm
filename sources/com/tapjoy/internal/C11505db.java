package com.tapjoy.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.db */
public final class C11505db {

    /* renamed from: a */
    private final boolean f27845a = false;

    /* renamed from: b */
    private final Float f27846b = null;

    /* renamed from: c */
    private final boolean f27847c = false;

    /* renamed from: d */
    private final C11504da f27848d;

    public C11505db(C11504da daVar) {
        this.f27848d = daVar;
    }

    /* renamed from: a */
    public final JSONObject mo72293a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f27845a);
            if (this.f27845a) {
                jSONObject.put("skipOffset", this.f27846b);
            }
            jSONObject.put("autoPlay", this.f27847c);
            jSONObject.put("position", this.f27848d);
        } catch (JSONException e) {
            C11523dp.m33444a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
