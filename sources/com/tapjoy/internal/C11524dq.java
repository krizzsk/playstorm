package com.tapjoy.internal;

import android.text.TextUtils;

/* renamed from: com.tapjoy.internal.dq */
public final class C11524dq {
    /* renamed from: a */
    public static void m33446a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m33447a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m33445a(C11500cx cxVar) {
        if (cxVar.f27821e) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: b */
    public static void m33448b(C11500cx cxVar) {
        if (cxVar.f27820d) {
            m33445a(cxVar);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: c */
    public static void m33449c(C11500cx cxVar) {
        if (!(C11497cu.NATIVE == cxVar.f27817a.f27762a)) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }
}
