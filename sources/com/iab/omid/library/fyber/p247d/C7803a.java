package com.iab.omid.library.fyber.p247d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.d.a */
public final class C7803a {
    /* renamed from: a */
    public static String m21916a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21917b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21918c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21919d() {
        JSONObject jSONObject = new JSONObject();
        C7804b.m21927a(jSONObject, "deviceType", m21916a());
        C7804b.m21927a(jSONObject, "osVersion", m21917b());
        C7804b.m21927a(jSONObject, "os", m21918c());
        return jSONObject;
    }
}
