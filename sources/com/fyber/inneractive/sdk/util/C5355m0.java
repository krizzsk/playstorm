package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.util.m0 */
public final class C5355m0 {

    /* renamed from: com.fyber.inneractive.sdk.util.m0$a */
    public interface C5356a {
        /* renamed from: a */
        JSONObject mo24263a();
    }

    /* renamed from: a */
    public static void m16771a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof C5356a) {
                    jSONObject.putOpt(str, ((C5356a) obj).mo24263a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
