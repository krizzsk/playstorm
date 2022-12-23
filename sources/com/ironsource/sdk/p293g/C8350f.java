package com.ironsource.sdk.p293g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.g.f */
public class C8350f {

    /* renamed from: d */
    public JSONObject f20065d;

    public C8350f() {
        this.f20065d = new JSONObject();
    }

    public C8350f(String str) {
        try {
            this.f20065d = new JSONObject(str);
        } catch (Exception unused) {
            this.f20065d = new JSONObject();
        }
    }

    /* renamed from: a */
    private Object m23924a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m23925a((JSONObject) obj) : obj instanceof JSONArray ? mo56860a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private Map<String, Object> m23925a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m23924a(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final List mo56860a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m23924a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo56861a(String str, String str2) {
        try {
            this.f20065d.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo56862a(String str, JSONObject jSONObject) {
        try {
            this.f20065d.put(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo56863a(String str) {
        return this.f20065d.has(str);
    }

    /* renamed from: b */
    public final boolean mo56864b(String str) {
        return this.f20065d.isNull(str);
    }

    /* renamed from: c */
    public final Object mo56865c(String str) {
        try {
            return this.f20065d.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String mo56866d(String str) {
        try {
            return this.f20065d.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo56867e(String str) {
        try {
            return this.f20065d.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public String toString() {
        JSONObject jSONObject = this.f20065d;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
