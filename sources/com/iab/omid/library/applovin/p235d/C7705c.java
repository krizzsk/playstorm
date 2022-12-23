package com.iab.omid.library.applovin.p235d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.C7680a;

/* renamed from: com.iab.omid.library.applovin.d.c */
public final class C7705c {
    /* renamed from: a */
    public static void m21484a(String str) {
        if (C7680a.f18297a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21485a(String str, Exception exc) {
        if ((C7680a.f18297a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
