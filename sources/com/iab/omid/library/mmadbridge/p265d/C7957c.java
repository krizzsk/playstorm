package com.iab.omid.library.mmadbridge.p265d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.mmadbridge.C7932a;

/* renamed from: com.iab.omid.library.mmadbridge.d.c */
public final class C7957c {
    /* renamed from: a */
    public static void m22613a(String str) {
        if (C7932a.f18871a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22614a(String str, Exception exc) {
        if ((C7932a.f18871a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
