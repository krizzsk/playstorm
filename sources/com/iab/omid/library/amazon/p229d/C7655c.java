package com.iab.omid.library.amazon.p229d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.amazon.C7630a;

/* renamed from: com.iab.omid.library.amazon.d.c */
public final class C7655c {
    /* renamed from: a */
    public static void m21254a(String str) {
        if (C7630a.f18180a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21255a(String str, Exception exc) {
        if ((C7630a.f18180a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
