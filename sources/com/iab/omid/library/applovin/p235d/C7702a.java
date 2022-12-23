package com.iab.omid.library.applovin.p235d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.d.a */
public final class C7702a {
    /* renamed from: a */
    public static String m21462a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21463b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21464c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21465d() {
        JSONObject jSONObject = new JSONObject();
        C7703b.m21473a(jSONObject, "deviceType", m21462a());
        C7703b.m21473a(jSONObject, "osVersion", m21463b());
        C7703b.m21473a(jSONObject, "os", m21464c());
        return jSONObject;
    }
}
