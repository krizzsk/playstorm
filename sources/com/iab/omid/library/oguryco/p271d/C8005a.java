package com.iab.omid.library.oguryco.p271d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.d.a */
public final class C8005a {
    /* renamed from: a */
    public static String m22824a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22825b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22826c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22827d() {
        JSONObject jSONObject = new JSONObject();
        C8006b.m22834a(jSONObject, "deviceType", m22824a());
        C8006b.m22834a(jSONObject, "osVersion", m22825b());
        C8006b.m22834a(jSONObject, "os", m22826c());
        return jSONObject;
    }
}
