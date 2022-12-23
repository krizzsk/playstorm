package com.bytedance.sdk.openadsdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.utils.h */
/* compiled from: InitChecker */
public class C3998h {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13111a() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r1 = com.bytedance.sdk.component.utils.C2975l.m8389c()
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r1 = m13110a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Current process name："
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "TTAdSdk-InitChecker"
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r1)
            java.lang.String r1 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r1)
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 0
            r6 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch:{ all -> 0x009c }
            java.lang.String[] r0 = r0.requestedPermissions     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0096
            int r1 = r0.length     // Catch:{ all -> 0x009c }
            if (r1 <= 0) goto L_0x0096
            java.util.List r1 = m13112b()     // Catch:{ all -> 0x009c }
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            r7 = r5
        L_0x0050:
            if (r7 >= r4) goto L_0x005c
            r8 = r0[r7]     // Catch:{ all -> 0x009c }
            if (r8 == 0) goto L_0x0059
            r1.remove(r8)     // Catch:{ all -> 0x009c }
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0050
        L_0x005c:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r0)     // Catch:{ all -> 0x009c }
            goto L_0x00a4
        L_0x0068:
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x009c }
        L_0x006c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x009c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r4.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r6 = "    May be missing permissions："
            r4.append(r6)     // Catch:{ all -> 0x0094 }
            r4.append(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "，Please refer to the access documentation"
            r4.append(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0094 }
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r1)     // Catch:{ all -> 0x0094 }
            r6 = r5
            goto L_0x006c
        L_0x0094:
            r0 = move-exception
            goto L_0x009e
        L_0x0096:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r0)     // Catch:{ all -> 0x009c }
            goto L_0x00a4
        L_0x009c:
            r0 = move-exception
            r5 = r6
        L_0x009e:
            java.lang.String r1 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.C2975l.m8388c(r2, r1, r0)
            r6 = r5
        L_0x00a4:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d3 }
            r1 = 23
            if (r0 < r1) goto L_0x00ac
            if (r3 >= r1) goto L_0x00d9
        L_0x00ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r0.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = "No adaptation required for dynamic permissions：target="
            r0.append(r4)     // Catch:{ all -> 0x00d3 }
            r0.append(r3)     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "&phone="
            r0.append(r3)     // Catch:{ all -> 0x00d3 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d3 }
            r0.append(r3)     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = ", require="
            r0.append(r3)     // Catch:{ all -> 0x00d3 }
            r0.append(r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d3 }
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d9
        L_0x00d3:
            r0 = move-exception
            java.lang.String r1 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.C2975l.m8388c(r2, r1, r0)
        L_0x00d9:
            if (r6 != 0) goto L_0x00e0
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r0)
        L_0x00e0:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.C2975l.m8391e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C3998h.m13111a():void");
    }

    /* renamed from: a */
    private static String m13110a(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return "unknown";
            }
            for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: b */
    private static List<String> m13112b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
