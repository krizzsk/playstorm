package com.iab.omid.library.inmobi.p253d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.d.a */
public final class C7854a {
    /* renamed from: a */
    public static String m22144a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22145b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22146c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22147d() {
        JSONObject jSONObject = new JSONObject();
        C7855b.m22154a(jSONObject, "deviceType", m22144a());
        C7855b.m22154a(jSONObject, "osVersion", m22145b());
        C7855b.m22154a(jSONObject, "os", m22146c());
        return jSONObject;
    }
}
