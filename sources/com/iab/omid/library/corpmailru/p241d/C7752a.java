package com.iab.omid.library.corpmailru.p241d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.d.a */
public final class C7752a {
    /* renamed from: a */
    public static String m21690a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21691b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21692c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21693d() {
        JSONObject jSONObject = new JSONObject();
        C7753b.m21700a(jSONObject, "deviceType", m21690a());
        C7753b.m21700a(jSONObject, "osVersion", m21691b());
        C7753b.m21700a(jSONObject, "os", m21692c());
        return jSONObject;
    }
}
