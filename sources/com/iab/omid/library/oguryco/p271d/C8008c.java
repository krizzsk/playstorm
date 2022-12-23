package com.iab.omid.library.oguryco.p271d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.oguryco.C7982a;

/* renamed from: com.iab.omid.library.oguryco.d.c */
public final class C8008c {
    /* renamed from: a */
    public static void m22844a(String str) {
        if (C7982a.f18988a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22845a(String str, Exception exc) {
        if ((C7982a.f18988a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
