package com.iab.omid.library.inmobi.p253d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.inmobi.C7832a;

/* renamed from: com.iab.omid.library.inmobi.d.c */
public final class C7857c {
    /* renamed from: a */
    public static void m22164a(String str) {
        if (C7832a.f18644a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22165a(String str, Exception exc) {
        if ((C7832a.f18644a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
