package com.tapjoy.internal;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dn */
public final class C11520dn {
    /* renamed from: a */
    public static JSONObject m33432a() {
        JSONObject jSONObject = new JSONObject();
        C11521do.m33438a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C11521do.m33438a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C11521do.m33438a(jSONObject, "os", APSAnalytics.OS_NAME);
        return jSONObject;
    }
}
