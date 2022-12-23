package com.iab.omid.library.adcolony.p223d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.a */
public final class C7602a {
    /* renamed from: a */
    public static String m21002a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21003b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21004c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21005d() {
        JSONObject jSONObject = new JSONObject();
        C7603b.m21013a(jSONObject, "deviceType", m21002a());
        C7603b.m21013a(jSONObject, "osVersion", m21003b());
        C7603b.m21013a(jSONObject, "os", m21004c());
        return jSONObject;
    }
}
