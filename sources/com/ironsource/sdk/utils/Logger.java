package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.p293g.C8343d;

public class Logger {

    /* renamed from: a */
    private static boolean f20118a;

    /* renamed from: d */
    public static void m24024d(String str, String str2) {
        if (f20118a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m24025d(String str, String str2, Throwable th) {
        if (f20118a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m24026e(String str, String str2) {
        if (f20118a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m24027e(String str, String str2, Throwable th) {
        if (f20118a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f20118a = C8343d.C8347d.MODE_0.f20055d != i;
    }

    /* renamed from: i */
    public static void m24028i(String str, String str2) {
        if (f20118a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: i */
    public static void m24029i(String str, String str2, Throwable th) {
        if (f20118a && !TextUtils.isEmpty(str2)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m24030v(String str, String str2) {
        if (f20118a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: v */
    public static void m24031v(String str, String str2, Throwable th) {
        if (f20118a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m24032w(String str, String str2) {
        if (f20118a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: w */
    public static void m24033w(String str, String str2, Throwable th) {
        if (f20118a) {
            Log.w(str, str2, th);
        }
    }
}
