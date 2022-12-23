package com.p374my.target;

import android.util.Log;

/* renamed from: com.my.target.e0 */
public final class C9672e0 {

    /* renamed from: a */
    public static boolean f23794a = false;

    /* renamed from: a */
    public static void m27882a(String str) {
        if (f23794a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTarget]", str);
        }
    }

    /* renamed from: b */
    public static void m27883b(String str) {
        if (f23794a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTarget]", str);
        }
    }

    /* renamed from: c */
    public static void m27884c(String str) {
        if (str == null) {
            str = "null";
        }
        Log.i("[myTarget]", str);
    }
}
