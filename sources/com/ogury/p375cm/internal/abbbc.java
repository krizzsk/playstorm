package com.ogury.p375cm.internal;

import android.util.Log;

/* renamed from: com.ogury.cm.internal.abbbc */
public final class abbbc {

    /* renamed from: a */
    public static final abbbc f25732a = new abbbc();

    private abbbc() {
    }

    /* renamed from: a */
    public static void m30745a(String str) {
        bbabc.m30943b(str, "message");
        Log.e("consent_sdk", str);
    }

    /* renamed from: a */
    public static void m30746a(String str, Throwable th) {
        bbabc.m30943b(str, "message");
        bbabc.m30943b(th, "error");
        Log.e("consent_sdk", str, th);
    }

    /* renamed from: a */
    public static void m30747a(Throwable th) {
        bbabc.m30943b(th, "error");
        Log.e("consent_sdk", "caught_error", th);
    }

    /* renamed from: b */
    public static void m30748b(String str) {
        bbabc.m30943b(str, "message");
        Log.d("consent_sdk", str);
    }
}
