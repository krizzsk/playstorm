package com.bytedance.sdk.component.utils;

import android.util.Log;
import com.bytedance.sdk.component.C2553a;

/* renamed from: com.bytedance.sdk.component.utils.l */
/* compiled from: Logger */
public class C2975l {

    /* renamed from: a */
    private static boolean f6739a = false;

    /* renamed from: b */
    private static int f6740b = 4;

    /* renamed from: c */
    private static C2553a f6741c;

    /* renamed from: a */
    private static String m8375a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            sb.append(obj != null ? obj.toString() : " null ");
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m8376a(int i) {
        f6740b = i;
    }

    /* renamed from: a */
    public static void m8377a(String str) {
        if (f6739a) {
            m8384b("Logger", str);
        }
    }

    /* renamed from: a */
    public static void m8378a(String str, String str2) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16531a(str, str2);
        }
        if (f6739a && str2 != null && f6740b <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: a */
    public static void m8379a(String str, String str2, Throwable th) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16533b(str, str2 + Log.getStackTraceString(th));
        }
        if (f6739a) {
            if (!(str2 == null && th == null) && f6740b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m8380a(String str, Object... objArr) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16535c(str, m8375a(objArr));
        }
        if (f6739a && objArr != null && f6740b <= 4) {
            Log.v(str, m8375a(objArr));
        }
    }

    /* renamed from: a */
    public static boolean m8381a() {
        return f6740b <= 3;
    }

    /* renamed from: b */
    public static void m8382b() {
        f6739a = true;
        m8376a(3);
    }

    /* renamed from: b */
    public static void m8383b(String str) {
        if (f6739a) {
            m8391e("Logger", str);
        }
    }

    /* renamed from: b */
    public static void m8384b(String str, String str2) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16533b(str, str2);
        }
        if (f6739a && str2 != null && f6740b <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m8385b(String str, String str2, Throwable th) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16532a(str, str2, th);
        }
        if (f6739a) {
            if (!(str2 == null && th == null) && f6740b <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    /* renamed from: b */
    public static void m8386b(String str, Object... objArr) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16536d(str, m8375a(objArr));
        }
        if (f6739a && objArr != null && f6740b <= 5) {
            Log.v(str, m8375a(objArr));
        }
    }

    /* renamed from: c */
    public static void m8387c(String str, String str2) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16535c(str, str2);
        }
        if (f6739a && str2 != null && f6740b <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m8388c(String str, String str2, Throwable th) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16534b(str, str2, th);
        }
        if (f6739a) {
            if (!(str2 == null && th == null) && f6740b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: c */
    public static boolean m8389c() {
        return f6739a;
    }

    /* renamed from: d */
    public static void m8390d(String str, String str2) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16536d(str, str2);
        }
        if (f6739a && str2 != null && f6740b <= 5) {
            Log.w(str, str2);
        }
    }

    /* renamed from: e */
    public static void m8391e(String str, String str2) {
        C2553a aVar = f6741c;
        if (aVar != null) {
            aVar.mo16537e(str, str2);
        }
        if (f6739a && str2 != null && f6740b <= 6) {
            Log.e(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String l1655274989215dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(java.lang.String):java.lang.String");
    }
}
