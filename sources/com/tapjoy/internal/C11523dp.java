package com.tapjoy.internal;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.tapjoy.internal.dp */
public final class C11523dp {
    /* renamed from: a */
    public static void m33443a(String str) {
        if (C11482cf.f27755a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m33444a(String str, Exception exc) {
        if (C11482cf.f27755a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }
}
