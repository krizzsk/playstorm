package com.ironsource.sdk.p288c;

import com.google.firebase.messaging.Constants;
import com.ironsource.sdk.C8149a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.d */
public class C8173d {

    /* renamed from: a */
    public static final String f19494a = C8173d.class.getSimpleName();

    /* renamed from: c */
    private static C8173d f19495c = null;

    /* renamed from: b */
    public Map<String, C8175e> f19496b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static synchronized C8173d m23494a() {
        C8173d dVar;
        synchronized (C8173d.class) {
            if (f19495c == null) {
                f19495c = new C8173d();
            }
            dVar = f19495c;
        }
        return dVar;
    }

    /* renamed from: a */
    public static String m23495a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    /* renamed from: b */
    public static boolean m23497b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private static C8149a m23498d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C8149a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get(Constants.ScionAnalytics.PARAM_LABEL).toString());
        } catch (Exception unused) {
            return new C8149a();
        }
    }

    /* renamed from: a */
    public final C8175e mo56456a(String str) {
        if (str.isEmpty() || !this.f19496b.containsKey(str)) {
            return null;
        }
        return this.f19496b.get(str);
    }

    /* renamed from: c */
    public C8149a mo56457c(JSONObject jSONObject) {
        C8149a aVar = new C8149a();
        try {
            return m23498d(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }
}
