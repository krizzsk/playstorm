package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* renamed from: com.mbridge.msdk.foundation.tools.u */
/* compiled from: SameLogTool */
public final class C8608u {

    /* renamed from: a */
    public static boolean f20794a = false;

    /* renamed from: b */
    public static boolean f20795b = false;

    /* renamed from: c */
    public static boolean f20796c = false;

    /* renamed from: d */
    public static boolean f20797d = false;

    /* renamed from: e */
    public static boolean f20798e = false;

    /* renamed from: f */
    public static boolean f20799f = false;

    /* renamed from: g */
    public static boolean f20800g = false;

    /* renamed from: h */
    public static boolean f20801h = false;

    static {
        if (!MBridgeConstans.DEBUG) {
        }
    }

    /* renamed from: a */
    public static void m24880a(String str, String str2) {
        if (f20795b && !TextUtils.isEmpty(str2)) {
            Log.d(m24879a(str), str2);
        }
    }

    /* renamed from: b */
    public static void m24882b(String str, String str2) {
        if (f20796c && !TextUtils.isEmpty(str2)) {
            Log.i(m24879a(str), str2);
        }
    }

    /* renamed from: c */
    public static void m24883c(String str, String str2) {
        if (f20797d && !TextUtils.isEmpty(str2)) {
            Log.w(m24879a(str), str2);
        }
    }

    /* renamed from: d */
    public static void m24884d(String str, String str2) {
        if (f20798e && str2 != null) {
            Log.e(m24879a(str), str2);
        }
    }

    /* renamed from: a */
    public static void m24881a(String str, String str2, Throwable th) {
        if (f20798e && str2 != null && th != null) {
            Log.e(m24879a(str), str2, th);
        }
    }

    /* renamed from: a */
    private static String m24879a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }
}
