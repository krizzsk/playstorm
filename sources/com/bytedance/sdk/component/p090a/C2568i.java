package com.bytedance.sdk.component.p090a;

import android.util.Log;

/* renamed from: com.bytedance.sdk.component.a.i */
/* compiled from: DebugUtil */
class C2568i {

    /* renamed from: a */
    private static boolean f5483a;

    /* renamed from: a */
    static void m6525a(boolean z) {
        f5483a = z;
    }

    /* renamed from: a */
    static void m6523a(String str) {
        if (f5483a) {
            Log.i("JsBridge2", str);
        }
    }

    /* renamed from: b */
    static void m6526b(String str) {
        if (f5483a) {
            Log.w("JsBridge2", str);
        }
    }

    /* renamed from: a */
    static void m6524a(String str, Throwable th) {
        if (f5483a) {
            Log.w("JsBridge2", str, th);
            Log.w("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: b */
    static void m6527b(String str, Throwable th) {
        if (f5483a) {
            Log.e("JsBridge2", str, th);
            Log.e("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    static void m6522a(RuntimeException runtimeException) {
        if (f5483a) {
            throw runtimeException;
        }
    }
}
