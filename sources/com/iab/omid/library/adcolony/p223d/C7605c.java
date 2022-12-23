package com.iab.omid.library.adcolony.p223d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.adcolony.C7580a;

/* renamed from: com.iab.omid.library.adcolony.d.c */
public final class C7605c {
    /* renamed from: a */
    public static void m21024a(String str) {
        if (C7580a.f18063a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21025a(String str, Exception exc) {
        if ((C7580a.f18063a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
