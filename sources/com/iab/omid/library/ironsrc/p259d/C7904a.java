package com.iab.omid.library.ironsrc.p259d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.a */
public final class C7904a {
    /* renamed from: a */
    public static String m22365a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22366b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22367c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22368d() {
        JSONObject jSONObject = new JSONObject();
        C7905b.m22375a(jSONObject, "deviceType", m22365a());
        C7905b.m22375a(jSONObject, "osVersion", m22366b());
        C7905b.m22375a(jSONObject, "os", m22367c());
        return jSONObject;
    }
}
