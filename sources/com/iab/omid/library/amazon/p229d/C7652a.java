package com.iab.omid.library.amazon.p229d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.d.a */
public final class C7652a {
    /* renamed from: a */
    public static String m21232a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21233b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21234c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21235d() {
        JSONObject jSONObject = new JSONObject();
        C7653b.m21243a(jSONObject, "deviceType", m21232a());
        C7653b.m21243a(jSONObject, "osVersion", m21233b());
        C7653b.m21243a(jSONObject, "os", m21234c());
        return jSONObject;
    }
}
