package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3524h;

/* renamed from: com.bytedance.sdk.openadsdk.utils.s */
/* compiled from: TestHelperUtils */
public class C4012s {

    /* renamed from: a */
    private static String f10252a;

    /* renamed from: c */
    public static boolean m13173c() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC, Splitter:B:30:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f A[Catch:{ Exception -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007f A[SYNTHETIC, Splitter:B:42:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087 A[Catch:{ Exception -> 0x0083 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13169a(java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r2 = "com.union_test.internationad"
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r4.<init>()     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            java.lang.String r5 = "data/data/"
            r4.append(r5)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r4.append(r2)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            java.lang.String r2 = "/"
            r4.append(r2)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r4.append(r7)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r3.<init>(r7)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            boolean r7 = r3.exists()     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            if (r7 != 0) goto L_0x002d
            return r1
        L_0x002d:
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r7.<init>(r3)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
        L_0x0037:
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x0051 }
            if (r1 == 0) goto L_0x0041
            r0.append(r1)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0037
        L_0x0041:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0051 }
            r7.close()     // Catch:{ Exception -> 0x004c }
            r2.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0050:
            return r0
        L_0x0051:
            r1 = move-exception
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            r2 = r1
            goto L_0x007c
        L_0x0056:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0062
        L_0x005b:
            r0 = move-exception
            r2 = r1
            goto L_0x007d
        L_0x005e:
            r7 = move-exception
            r2 = r1
            r1 = r7
            r7 = r2
        L_0x0062:
            r1.printStackTrace()     // Catch:{ all -> 0x007b }
            if (r7 == 0) goto L_0x006d
            r7.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x006d
        L_0x006b:
            r7 = move-exception
            goto L_0x0073
        L_0x006d:
            if (r2 == 0) goto L_0x0076
            r2.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x0076
        L_0x0073:
            r7.printStackTrace()
        L_0x0076:
            java.lang.String r7 = r0.toString()
            return r7
        L_0x007b:
            r0 = move-exception
        L_0x007c:
            r1 = r7
        L_0x007d:
            if (r1 == 0) goto L_0x0085
            r1.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0085
        L_0x0083:
            r7 = move-exception
            goto L_0x008b
        L_0x0085:
            if (r2 == 0) goto L_0x008e
            r2.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x008e
        L_0x008b:
            r7.printStackTrace()
        L_0x008e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C4012s.m13169a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m13170a() {
        if (C2975l.m8389c() && C3524h.m10852d().mo19869s() && C3524h.m10852d().mo19870t()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m13172b(String str) {
        try {
            if (!m13170a()) {
                return str;
            }
            String u = C3524h.m10852d().mo19871u();
            if (TextUtils.isEmpty(u)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=" + u);
            return Uri.parse(str).buildUpon().appendQueryParameter(m13171b(), u).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: b */
    public static String m13171b() {
        if (TextUtils.isEmpty(f10252a)) {
            f10252a = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return f10252a;
    }
}
