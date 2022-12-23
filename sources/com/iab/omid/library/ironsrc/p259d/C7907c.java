package com.iab.omid.library.ironsrc.p259d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C7882a;

/* renamed from: com.iab.omid.library.ironsrc.d.c */
public final class C7907c {
    /* renamed from: a */
    public static void m22385a(String str) {
        if (C7882a.f18757a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22386a(String str, Exception exc) {
        if ((C7882a.f18757a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
