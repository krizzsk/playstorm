package com.ogury.core.internal;

import android.util.Log;

/* compiled from: OguryIntegrationLogger.kt */
public final class OguryIntegrationLogger {
    public static final OguryIntegrationLogger INSTANCE = new OguryIntegrationLogger();
    private static final String TAG = "OGURY";
    private static int level = 4;

    public static /* synthetic */ void getLevel$annotations() {
    }

    private OguryIntegrationLogger() {
    }

    public static final int getLevel() {
        return level;
    }

    public static final void setLevel(int i) {
        level = i;
    }

    /* renamed from: d */
    public static final void m30996d(String str) {
        C10219ai.m31036b(str, "message");
        INSTANCE.print(3, str);
    }

    /* renamed from: i */
    public static final void m30999i(String str) {
        C10219ai.m31036b(str, "message");
        INSTANCE.print(4, str);
    }

    /* renamed from: i */
    public static final void m31000i(Throwable th) {
        C10219ai.m31036b(th, "throwable");
        OguryIntegrationLogger oguryIntegrationLogger = INSTANCE;
        oguryIntegrationLogger.print(4, "error\n" + Log.getStackTraceString(th));
    }

    /* renamed from: e */
    public static final void m30997e(String str) {
        C10219ai.m31036b(str, "message");
        INSTANCE.print(6, str);
    }

    /* renamed from: e */
    public static final void m30998e(Throwable th) {
        C10219ai.m31036b(th, "throwable");
        OguryIntegrationLogger oguryIntegrationLogger = INSTANCE;
        oguryIntegrationLogger.print(4, th.getMessage() + "\n" + Log.getStackTraceString(th));
    }

    private final void print(int i, String str) {
        if (i >= level) {
            Log.println(i, TAG, str);
        }
    }
}
