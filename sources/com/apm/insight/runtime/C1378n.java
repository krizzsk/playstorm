package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C1176b;
import com.apm.insight.C1205c;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1301l;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1311q;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.n */
public class C1378n {

    /* renamed from: a */
    protected static JSONObject f1447a = new JSONObject();

    /* renamed from: a */
    public static void m2215a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String a = C1341a.m2036a(jSONObject);
                File file = new File(C1308o.m1860j(C1240h.m1558g()), "apminsight/configCrash/configNative");
                if (a != null) {
                    JSONObject jSONObject2 = new JSONObject(a);
                    f1447a = jSONObject2;
                    C1298i.m1772a(file, m2221b(jSONObject2), false);
                    return;
                }
                f1447a = new JSONObject();
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2216a(String str, C1365f fVar) {
        if (f1447a == null) {
            return false;
        }
        if (fVar == null) {
            fVar = new C1365f();
        }
        JSONObject optJSONObject = f1447a.optJSONObject(str);
        if (optJSONObject != null && !m2217a(optJSONObject.optJSONArray("disable"), fVar)) {
            return m2217a(optJSONObject.optJSONArray("enable"), fVar);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2217a(JSONArray jSONArray, C1365f fVar) {
        if (C1301l.m1803a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config: " + jSONArray));
            } else if (m2218a(optJSONObject, fVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2218a(JSONObject jSONObject, C1365f fVar) {
        StringBuilder sb;
        Iterator<String> keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                z = true;
                if (next.startsWith("header_")) {
                    if (!m2219a(jSONObject.optJSONObject(next), fVar.mo12500b(next.substring(7)))) {
                        sb = new StringBuilder();
                    }
                } else if (!next.startsWith("java_")) {
                    C1311q.m1870a((Object) "no rules match " + next);
                } else if (!m2219a(jSONObject.optJSONObject(next), fVar.mo12446a(next.substring(5)))) {
                    sb = new StringBuilder();
                }
                sb.append("not match ");
                sb.append(next);
                C1311q.m1870a((Object) sb.toString());
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2219a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (String.valueOf(optJSONArray.opt(i)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static JSONArray m2220b(JSONArray jSONArray, C1365f fVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (C1301l.m1803a(jSONArray)) {
            return jSONArray2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C1205c a = C1176b.m1249a();
                a.mo12218a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config: " + jSONArray));
            } else if (m2218a(optJSONObject, fVar)) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* renamed from: b */
    public static JSONObject m2221b(JSONObject jSONObject) {
        StringBuilder sb;
        String str;
        Iterator<String> keys = jSONObject.keys();
        C1365f fVar = new C1365f();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"configType".equals(next)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    C1205c a = C1176b.m1249a();
                    a.mo12218a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config with key: " + next));
                } else {
                    if (m2217a(optJSONObject.optJSONArray("disable"), fVar)) {
                        sb = new StringBuilder();
                        str = "match diable ";
                    } else {
                        JSONArray b = m2220b(optJSONObject.optJSONArray("enable"), fVar);
                        if (C1301l.m1803a(b)) {
                            sb = new StringBuilder();
                            str = "not match ";
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", b));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(next);
                    C1311q.m1870a((Object) sb.toString());
                }
            }
        }
        return jSONObject2;
    }
}
