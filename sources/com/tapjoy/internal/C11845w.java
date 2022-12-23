package com.tapjoy.internal;

import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.w */
public final class C11845w {
    /* renamed from: a */
    public static void m34415a(String str, String str2) {
        m34413a(6, str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public static void m34416a(String str, String str2, Object... objArr) {
        m34414a(6, str, str2, objArr);
    }

    /* renamed from: a */
    public static void m34414a(int i, String str, String str2, Object... objArr) {
        C11818jp a = C11819jq.m34351a(str2, objArr);
        m34413a(i, str, a.f28848b, a.f28849c);
    }

    /* renamed from: a */
    public static void m34413a(int i, String str, @Nullable String str2, @Nullable Throwable th) {
        if (str2 != null) {
            Log.println(i, str, str2);
        }
        if (th != null) {
            Log.println(i, str, Log.getStackTraceString(th));
        }
    }
}
