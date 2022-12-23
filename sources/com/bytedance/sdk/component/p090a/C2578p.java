package com.bytedance.sdk.component.p090a;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.p */
/* compiled from: Java2JsMsg */
public final class C2578p {

    /* renamed from: a */
    private final Map<String, Object> f5500a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C2578p m6549a() {
        return new C2578p();
    }

    private C2578p() {
    }

    /* renamed from: a */
    public C2578p mo16591a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f5500a.put(str, obj);
        }
        return this;
    }

    /* renamed from: b */
    public String mo16592b() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : this.f5500a.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
