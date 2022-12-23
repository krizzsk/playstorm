package com.iab.omid.library.vungle.p283d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.vungle.C8083a;

/* renamed from: com.iab.omid.library.vungle.d.c */
public final class C8108c {
    /* renamed from: a */
    public static void m23292a(String str) {
        if (C8083a.f19222a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m23293a(String str, Exception exc) {
        if ((C8083a.f19222a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
