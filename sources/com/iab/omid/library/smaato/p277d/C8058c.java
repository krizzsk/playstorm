package com.iab.omid.library.smaato.p277d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.smaato.C8033a;

/* renamed from: com.iab.omid.library.smaato.d.c */
public final class C8058c {
    /* renamed from: a */
    public static void m23068a(String str) {
        if (C8033a.f19109a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m23069a(String str, Exception exc) {
        if ((C8033a.f19109a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
