package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.utils.s */
/* compiled from: ProcessUtils */
public class C2983s {

    /* renamed from: a */
    private static String f6749a;

    /* renamed from: a */
    public static String m8423a(Context context) {
        String str = f6749a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    if (C2975l.m8381a()) {
                        C2975l.m8384b("Process", "processName = " + next.processName);
                    }
                    String str2 = next.processName;
                    f6749a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m8422a();
        f6749a = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[SYNTHETIC, Splitter:B:20:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8422a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0064 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0064 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0064 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r4.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ all -> 0x0064 }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x0064 }
            r4.append(r5)     // Catch:{ all -> 0x0064 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0064 }
            r3.<init>(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0064 }
            r1.<init>(r2)     // Catch:{ all -> 0x0064 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r2.<init>()     // Catch:{ all -> 0x0065 }
        L_0x0031:
            int r3 = r1.read()     // Catch:{ all -> 0x0065 }
            if (r3 <= 0) goto L_0x003c
            char r3 = (char) r3     // Catch:{ all -> 0x0065 }
            r2.append(r3)     // Catch:{ all -> 0x0065 }
            goto L_0x0031
        L_0x003c:
            boolean r3 = com.bytedance.sdk.component.utils.C2975l.m8381a()     // Catch:{ all -> 0x0065 }
            if (r3 == 0) goto L_0x005c
            java.lang.String r3 = "Process"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r4.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "get processName = "
            r4.append(r5)     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0065 }
            r4.append(r5)     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0065 }
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0065 }
        L_0x005c:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0065 }
            r1.close()     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            return r0
        L_0x0064:
            r1 = r0
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2983s.m8422a():java.lang.String");
    }
}
