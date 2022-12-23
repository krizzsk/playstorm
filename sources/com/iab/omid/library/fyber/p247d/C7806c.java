package com.iab.omid.library.fyber.p247d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.fyber.C7781a;

/* renamed from: com.iab.omid.library.fyber.d.c */
public final class C7806c {
    /* renamed from: a */
    public static void m21938a(String str) {
        if (C7781a.f18527a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21939a(String str, Exception exc) {
        if ((C7781a.f18527a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
