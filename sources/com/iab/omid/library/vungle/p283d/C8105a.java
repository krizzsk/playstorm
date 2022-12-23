package com.iab.omid.library.vungle.p283d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.d.a */
public final class C8105a {
    /* renamed from: a */
    public static String m23272a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m23273b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m23274c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m23275d() {
        JSONObject jSONObject = new JSONObject();
        C8106b.m23282a(jSONObject, "deviceType", m23272a());
        C8106b.m23282a(jSONObject, "osVersion", m23273b());
        C8106b.m23282a(jSONObject, "os", m23274c());
        return jSONObject;
    }
}
