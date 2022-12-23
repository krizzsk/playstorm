package com.iab.omid.library.corpmailru.p241d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.corpmailru.C7730a;

/* renamed from: com.iab.omid.library.corpmailru.d.c */
public final class C7755c {
    /* renamed from: a */
    public static void m21710a(String str) {
        if (C7730a.f18414a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21711a(String str, Exception exc) {
        if ((C7730a.f18414a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
