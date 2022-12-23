package com.ogury.p376ed.internal;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dt */
public final class C10467dt {
    /* renamed from: a */
    public static boolean m31654a(JSONObject jSONObject) {
        C10765mq.m32773b(jSONObject, "requestBody");
        return m31653a() && C10552ge.m32080a(jSONObject);
    }

    /* renamed from: a */
    private static boolean m31653a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }
}
