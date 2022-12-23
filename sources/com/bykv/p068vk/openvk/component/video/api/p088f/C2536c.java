package com.bykv.p068vk.openvk.component.video.api.p088f;

import android.util.Log;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.c */
/* compiled from: VLogger */
public class C2536c {

    /* renamed from: a */
    private static boolean f5423a = false;

    /* renamed from: b */
    private static int f5424b = 4;

    /* renamed from: a */
    public static void m6431a(int i) {
        f5424b = i;
    }

    /* renamed from: a */
    public static void m6430a() {
        f5423a = true;
        m6431a(3);
    }

    /* renamed from: b */
    public static boolean m6439b() {
        return f5423a;
    }

    /* renamed from: a */
    public static void m6433a(String str, String str2) {
        if (f5423a && str2 != null && f5424b <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m6434a(String str, String str2, Throwable th) {
        if (f5423a) {
            if (!(str2 == null && th == null) && f5424b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m6435a(String str, Object... objArr) {
        if (f5423a && objArr != null && f5424b <= 3) {
            Log.v(str, m6429a(objArr));
        }
    }

    /* renamed from: a */
    public static void m6432a(String str) {
        if (f5423a) {
            m6436b("Logger", str);
        }
    }

    /* renamed from: b */
    public static void m6436b(String str, String str2) {
        if (f5423a && str2 != null && f5424b <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m6437b(String str, String str2, Throwable th) {
        if (f5423a) {
            if (!(str2 == null && th == null) && f5424b <= 4) {
                Log.i(str, str2, th);
            }
        }
    }

    /* renamed from: b */
    public static void m6438b(String str, Object... objArr) {
        if (f5423a && objArr != null && f5424b <= 4) {
            Log.v(str, m6429a(objArr));
        }
    }

    /* renamed from: c */
    public static void m6440c(String str, String str2) {
        if (f5423a && str2 != null && f5424b <= 6) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m6441c(String str, String str2, Throwable th) {
        if (f5423a) {
            if (!(str2 == null && th == null) && f5424b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    private static String m6429a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
