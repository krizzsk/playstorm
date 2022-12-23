package com.ogury.p375cm.internal;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.cm.internal.aacac */
public final class aacac {

    /* renamed from: a */
    public static final aacac f25671a = new aacac();

    /* renamed from: b */
    private static final Bundle f25672b = new Bundle();

    private aacac() {
    }

    /* renamed from: a */
    public static Boolean m30669a(String str) {
        bbabc.m30943b(str, SDKConstants.PARAM_KEY);
        bbabc.m30943b(str, "configurationKey");
        if (f25672b.containsKey(str)) {
            return Boolean.valueOf(f25672b.getBoolean(str));
        }
        return null;
    }

    /* renamed from: a */
    public static void m30670a(String str, Boolean bool) {
        bbabc.m30943b(str, SDKConstants.PARAM_KEY);
        if (bool != null) {
            f25672b.putBoolean(str, bool.booleanValue());
            return;
        }
        bbabc.m30943b(str, "configurationKey");
        f25672b.remove(str);
    }
}
