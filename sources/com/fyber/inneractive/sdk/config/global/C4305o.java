package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.o */
public class C4305o implements C4304n {

    /* renamed from: a */
    public JSONObject f10649a;

    public C4305o(JSONObject jSONObject) {
        this.f10649a = jSONObject;
    }

    /* renamed from: a */
    public Double mo24310a(String str) {
        return Double.valueOf(this.f10649a.optDouble(str, 0.0d));
    }

    /* renamed from: b */
    public Integer mo24314b(String str) {
        if (this.f10649a.has(str)) {
            try {
                return Integer.valueOf(this.f10649a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo24315c(String str) {
        if (this.f10649a.has(str)) {
            try {
                return this.f10649a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public Boolean mo24316d(String str) {
        if (this.f10649a.has(str)) {
            try {
                return Boolean.valueOf(this.f10649a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String toString() {
        JSONObject jSONObject = this.f10649a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    /* renamed from: a */
    public String mo24311a(String str, String str2) {
        return this.f10649a.optString(str, str2);
    }

    /* renamed from: a */
    public Map<String, Object> mo24335a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f10649a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.f10649a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
