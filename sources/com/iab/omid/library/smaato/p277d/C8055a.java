package com.iab.omid.library.smaato.p277d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.d.a */
public final class C8055a {
    /* renamed from: a */
    public static String m23048a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m23049b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m23050c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m23051d() {
        JSONObject jSONObject = new JSONObject();
        C8056b.m23058a(jSONObject, "deviceType", m23048a());
        C8056b.m23058a(jSONObject, "osVersion", m23049b());
        C8056b.m23058a(jSONObject, "os", m23050c());
        return jSONObject;
    }
}
