package com.bytedance.sdk.component.p120e.p124d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;

/* renamed from: com.bytedance.sdk.component.e.d.f */
/* compiled from: ProcessUtils */
public class C2941f {

    /* renamed from: a */
    private static String f6678a;

    /* renamed from: a */
    public static boolean m8278a(Context context) {
        String c = m8280c(context);
        return c != null && (c.endsWith(":push") || c.endsWith(":pushservice"));
    }

    /* renamed from: b */
    public static boolean m8279b(Context context) {
        String c = m8280c(context);
        if ((c == null || !c.contains(CertificateUtil.DELIMITER)) && c != null && c.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m8280c(Context context) {
        String str = f6678a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    String str2 = next.processName;
                    f6678a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m8277a();
        f6678a = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[SYNTHETIC, Splitter:B:17:0x0047] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8277a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0044 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r4.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ all -> 0x0044 }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x0044 }
            r4.append(r5)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0044 }
            r3.<init>(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0044 }
            r1.<init>(r2)     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r2.<init>()     // Catch:{ all -> 0x0045 }
        L_0x0031:
            int r3 = r1.read()     // Catch:{ all -> 0x0045 }
            if (r3 <= 0) goto L_0x003c
            char r3 = (char) r3     // Catch:{ all -> 0x0045 }
            r2.append(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0031
        L_0x003c:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0045 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return r0
        L_0x0044:
            r1 = r0
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p120e.p124d.C2941f.m8277a():java.lang.String");
    }
}
