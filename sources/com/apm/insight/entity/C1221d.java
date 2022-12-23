package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1301l;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.d */
public class C1221d {

    /* renamed from: a */
    private static String f1090a;

    /* renamed from: b */
    private static JSONObject f1091b;

    /* renamed from: a */
    private static void m1457a() {
        JSONObject jSONObject;
        if (f1090a == null) {
            f1090a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + C1240h.m1558g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f1091b == null) {
            try {
                f1091b = new JSONObject(C1298i.m1785c(f1090a));
                return;
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            } catch (IOException unused2) {
                jSONObject = new JSONObject();
            }
        } else {
            return;
        }
        f1091b = jSONObject;
    }

    /* renamed from: a */
    public static void m1458a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m1460c(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m1459b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m1461d(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m1460c(JSONObject jSONObject) {
        Object opt;
        m1457a();
        JSONObject jSONObject2 = f1091b;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = f1091b.opt(next)) != null) {
                    try {
                        jSONObject.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m1461d(JSONObject jSONObject) {
        m1457a();
        JSONObject jSONObject2 = f1091b;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
            if (!C1301l.m1804a(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                C1217a.m1414b(optJSONObject2, optJSONObject);
            }
        }
    }
}
