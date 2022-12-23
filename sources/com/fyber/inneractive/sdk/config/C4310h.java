package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.h */
public class C4310h {

    /* renamed from: a */
    public final Map<String, String> f10657a = new HashMap();

    /* renamed from: b */
    public final Map<String, C4276g> f10658b = new HashMap();

    /* renamed from: a */
    public static C4310h m13539a(JSONObject jSONObject) {
        C4310h hVar = new C4310h();
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray names = optJSONObject.names();
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i, (String) null);
            String optString2 = optJSONObject.optString(optString, (String) null);
            if (!(optString == null || optString2 == null)) {
                hVar.f10657a.put(optString, optString2);
            }
        }
        if (optJSONObject2 != null) {
            JSONArray names2 = optJSONObject2.names();
            for (int i2 = 0; i2 < names2.length(); i2++) {
                String optString3 = names2.optString(i2, (String) null);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString3);
                if (!(optString3 == null || optJSONObject3 == null)) {
                    hVar.f10658b.put(optString3, new C4276g(optJSONObject3));
                }
            }
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4310h.class != obj.getClass()) {
            return false;
        }
        C4310h hVar = (C4310h) obj;
        if (!this.f10657a.equals(hVar.f10657a) || !this.f10658b.equals(hVar.f10658b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f10657a.hashCode();
    }

    /* renamed from: a */
    public int mo24345a(String str, int i, int i2) {
        String num = Integer.toString(i);
        if (this.f10657a.containsKey(str)) {
            num = this.f10657a.get(str);
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
        }
        return Math.max(i, i2);
    }

    /* renamed from: a */
    public boolean mo24347a(String str, boolean z) {
        String bool = Boolean.toString(z);
        if (this.f10657a.containsKey(str)) {
            bool = this.f10657a.get(str);
        }
        try {
            return Boolean.parseBoolean(bool);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public C4275f mo24346a(String str) {
        C4276g gVar;
        String str2 = IAConfigManager.f10525J.f10539d;
        if (this.f10658b.containsKey(str2)) {
            gVar = this.f10658b.get(str2);
        } else {
            gVar = new C4276g();
        }
        gVar.getClass();
        return gVar.f10610a.containsKey(str) ? gVar.f10610a.get(str) : new C4275f();
    }
}
