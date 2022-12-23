package com.iab.omid.library.mmadbridge.p265d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.d.a */
public final class C7954a {
    /* renamed from: a */
    public static String m22591a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22592b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22593c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22594d() {
        JSONObject jSONObject = new JSONObject();
        C7955b.m22602a(jSONObject, "deviceType", m22591a());
        C7955b.m22602a(jSONObject, "osVersion", m22592b());
        C7955b.m22602a(jSONObject, "os", m22593c());
        return jSONObject;
    }
}
