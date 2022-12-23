package com.apm.insight.runtime;

import com.apm.insight.p023l.C1301l;
import com.apm.insight.p023l.C1311q;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.e */
public class C1364e {

    /* renamed from: a */
    private static HashMap<String, C1364e> f1419a = new HashMap<>();

    /* renamed from: b */
    private JSONObject f1420b = null;

    /* renamed from: c */
    private JSONObject f1421c = null;

    /* renamed from: d */
    private boolean f1422d = false;

    /* renamed from: e */
    private String f1423e;

    public C1364e(JSONObject jSONObject, String str) {
        this.f1423e = str;
        m2177a(jSONObject);
        f1419a.put(this.f1423e, this);
        C1311q.m1870a((Object) "after update aid " + str);
    }

    /* renamed from: a */
    public static void m2176a(String str, JSONObject jSONObject) {
        C1364e eVar = f1419a.get(str);
        if (eVar != null) {
            eVar.m2177a(jSONObject);
        } else {
            new C1364e(jSONObject, str);
        }
    }

    /* renamed from: a */
    private void m2177a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f1420b = jSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("error_module")) != null) {
            boolean z = true;
            if (optJSONObject.optInt("switcher") != 1) {
                z = false;
            }
            this.f1422d = z;
        }
    }

    /* renamed from: b */
    public static boolean m2178b(String str) {
        return f1419a.get(str) != null;
    }

    /* renamed from: c */
    public static JSONObject m2179c(String str) {
        C1364e eVar = f1419a.get(str);
        if (eVar != null) {
            return eVar.mo12495a();
        }
        return null;
    }

    /* renamed from: d */
    public static C1364e m2180d(String str) {
        return f1419a.get(str);
    }

    /* renamed from: e */
    public static long m2181e(String str) {
        C1364e eVar = f1419a.get(str);
        if (eVar == null) {
            return 3600000;
        }
        try {
            return Long.decode(C1301l.m1806b(eVar.mo12495a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000;
        }
    }

    /* renamed from: f */
    public static boolean m2182f(String str) {
        C1364e eVar = f1419a.get(str);
        return eVar != null && eVar.mo12497b();
    }

    /* renamed from: g */
    public static boolean m2183g(String str) {
        C1364e eVar = f1419a.get(str);
        return eVar != null && eVar.mo12498c();
    }

    /* renamed from: h */
    public static boolean m2184h(String str) {
        C1364e eVar = f1419a.get(str);
        return eVar != null && eVar.mo12499d();
    }

    /* renamed from: a */
    public JSONObject mo12495a() {
        return this.f1420b;
    }

    /* renamed from: a */
    public boolean mo12496a(String str) {
        if (this.f1420b == null) {
            return false;
        }
        return this.f1422d;
    }

    /* renamed from: b */
    public boolean mo12497b() {
        JSONObject jSONObject = this.f1420b;
        return jSONObject != null && 1 == C1301l.m1798a(jSONObject, 0, "crash_module", "switcher");
    }

    /* renamed from: c */
    public boolean mo12498c() {
        JSONObject jSONObject = this.f1420b;
        return jSONObject != null && 1 == C1301l.m1798a(jSONObject, 0, "crash_module", "switcher");
    }

    /* renamed from: d */
    public boolean mo12499d() {
        JSONObject jSONObject = this.f1420b;
        return jSONObject != null && 1 == C1301l.m1798a(jSONObject, 0, "crash_module", "switcher");
    }
}
