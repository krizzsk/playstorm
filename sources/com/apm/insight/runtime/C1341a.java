package com.apm.insight.runtime;

import com.apm.insight.C1240h;
import com.apm.insight.entity.C1218b;
import com.apm.insight.p022k.C1256a;
import com.apm.insight.p022k.C1281k;
import com.apm.insight.p023l.C1301l;
import com.apm.insight.p023l.C1311q;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a */
public class C1341a {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<Object> f1360a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static int m2034a(int i, String... strArr) {
        return C1301l.m1798a(m2037a(), i, strArr);
    }

    /* renamed from: a */
    public static int m2035a(String... strArr) {
        return C1301l.m1798a(m2037a(), -1, strArr);
    }

    /* renamed from: a */
    public static String m2036a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return optJSONObject.optString("npth");
    }

    /* renamed from: a */
    public static JSONObject m2037a() {
        return C1364e.m2179c(C1240h.m1542a().mo12493e());
    }

    /* renamed from: a */
    public static JSONObject m2038a(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (optJSONObject != null) {
                    return optJSONObject;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m2039a(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            C1311q.m1872a("apmconfig", (Object) "fromnet " + z + " : " + jSONArray);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String next = optJSONObject.keys().next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    C1311q.m1870a((Object) "update config " + next + " : " + optJSONObject2);
                    C1364e.m2176a(next, optJSONObject2);
                    if (z) {
                        C1281k.m1702a(next);
                    }
                } catch (Throwable unused) {
                }
            }
            C1378n.m2215a(m2038a(jSONArray, String.valueOf(C1240h.m1542a().mo12493e())));
            if (z) {
                C1281k.m1703a(false, jSONArray);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2040a(Object obj) {
        String b = C1218b.m1452b(obj);
        if (b != null) {
            return C1364e.m2178b(b);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2041a(Object obj, String str) {
        C1364e d;
        String b = C1218b.m1452b(obj);
        if (b == null || (d = C1364e.m2180d(b)) == null) {
            return false;
        }
        return d.mo12496a(str);
    }

    /* renamed from: a */
    public static boolean m2042a(String str) {
        if (!C1364e.m2178b(str)) {
            C1256a.m1608b();
        }
        return C1364e.m2182f(str);
    }

    /* renamed from: b */
    public static boolean m2043b() {
        return C1379o.m2250e();
    }

    /* renamed from: b */
    public static boolean m2044b(String str) {
        if (!C1364e.m2178b(str)) {
            C1256a.m1608b();
        }
        return C1364e.m2184h(str);
    }

    /* renamed from: c */
    public static JSONArray m2045c() {
        return C1301l.m1800a(m2037a(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    /* renamed from: c */
    public static boolean m2046c(String str) {
        if (!C1364e.m2178b(str)) {
            C1256a.m1608b();
        }
        return C1364e.m2183g(str);
    }

    /* renamed from: d */
    public static boolean m2047d() {
        return m2035a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    /* renamed from: e */
    public static boolean m2048e() {
        return m2035a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1;
    }

    /* renamed from: f */
    public static boolean m2049f() {
        return m2035a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    /* renamed from: g */
    public static boolean m2050g() {
        return m2035a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    /* renamed from: h */
    public static boolean m2051h() {
        return m2035a("custom_event_settings", "npth_simple_setting", "force_apm_crash") == 1;
    }

    /* renamed from: i */
    public static boolean m2052i() {
        return m2035a("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1;
    }

    /* renamed from: j */
    public static boolean m2053j() {
        return m2035a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }
}
