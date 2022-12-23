package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.ICommonParams;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.apm.insight.runtime.d */
public class C1363d {

    /* renamed from: a */
    private Context f1416a;

    /* renamed from: b */
    private ICommonParams f1417b;

    /* renamed from: c */
    private ICommonParams f1418c;

    public C1363d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, (C1363d) null);
    }

    public C1363d(Context context, ICommonParams iCommonParams, C1363d dVar) {
        this.f1416a = context;
        this.f1417b = iCommonParams;
        this.f1418c = dVar == null ? null : dVar.f1417b;
    }

    /* renamed from: a */
    public static String m2168a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    public static boolean m2169a(Map<String, Object> map) {
        return map == null || map.isEmpty() || (!map.containsKey(TapjoyConstants.TJC_APP_VERSION_NAME) && !map.containsKey("version_name")) || !map.containsKey("version_code") || !map.containsKey("update_version_code");
    }

    /* renamed from: a */
    public Map<String, Object> mo12489a() {
        Map<String, Object> b = mo12490b();
        if (m2168a(b, "aid") == null) {
            b.put("aid", 4444);
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[SYNTHETIC, Splitter:B:23:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[SYNTHETIC, Splitter:B:36:0x00a9] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Object> mo12490b() {
        /*
            r9 = this;
            java.lang.String r0 = "version_name"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            r3 = 0
            com.apm.insight.ICommonParams r4 = r9.f1418c     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0012
            com.apm.insight.ICommonParams r4 = r9.f1418c     // Catch:{ all -> 0x0027 }
            java.util.Map r4 = r4.getCommonParams()     // Catch:{ all -> 0x0027 }
            goto L_0x0017
        L_0x0012:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
        L_0x0017:
            com.apm.insight.ICommonParams r5 = r9.f1417b     // Catch:{ all -> 0x0022 }
            java.util.Map r5 = r5.getCommonParams()     // Catch:{ all -> 0x0022 }
            r4.putAll(r5)     // Catch:{ all -> 0x0022 }
            r5 = r3
            goto L_0x002c
        L_0x0022:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r5 = r3
        L_0x0029:
            r8 = r5
            r5 = r4
            r4 = r8
        L_0x002c:
            if (r4 != 0) goto L_0x003f
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 4
            r4.<init>(r6)
            if (r5 == 0) goto L_0x003f
            java.lang.String r6 = "err_info"
            java.lang.String r5 = com.apm.insight.p023l.C1316v.m1903a((java.lang.Throwable) r5)     // Catch:{ all -> 0x003f }
            r4.put(r6, r5)     // Catch:{ all -> 0x003f }
        L_0x003f:
            boolean r5 = m2169a(r4)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00a9
            android.content.Context r5 = r9.f1416a     // Catch:{ all -> 0x0085 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0085 }
            android.content.Context r7 = r9.f1416a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x0085 }
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r6)     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = r5.versionName     // Catch:{ all -> 0x0085 }
            r4.put(r0, r6)     // Catch:{ all -> 0x0085 }
            int r6 = r5.versionCode     // Catch:{ all -> 0x0085 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0085 }
            r4.put(r2, r6)     // Catch:{ all -> 0x0085 }
            java.lang.Object r6 = r4.get(r1)     // Catch:{ all -> 0x0085 }
            if (r6 != 0) goto L_0x00ef
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo     // Catch:{ all -> 0x0085 }
            android.os.Bundle r6 = r6.metaData     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x007b
            android.content.pm.ApplicationInfo r3 = r5.applicationInfo     // Catch:{ all -> 0x0085 }
            android.os.Bundle r3 = r3.metaData     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "UPDATE_VERSION_CODE"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0085 }
        L_0x007b:
            if (r3 != 0) goto L_0x0081
            java.lang.Object r3 = r4.get(r2)     // Catch:{ all -> 0x0085 }
        L_0x0081:
            r4.put(r1, r3)     // Catch:{ all -> 0x0085 }
            goto L_0x00ef
        L_0x0085:
            android.content.Context r3 = r9.f1416a
            java.lang.String r3 = com.apm.insight.p023l.C1285a.m1726d(r3)
            r4.put(r0, r3)
            android.content.Context r0 = r9.f1416a
            int r0 = com.apm.insight.p023l.C1285a.m1727e(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r2, r0)
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x00ef
            java.lang.Object r0 = r4.get(r2)
            r4.put(r1, r0)
            goto L_0x00ef
        L_0x00a9:
            android.content.Context r0 = r9.f1416a     // Catch:{ all -> 0x00ef }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x00ef }
            android.content.Context r1 = r9.f1416a     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x00ef }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r6)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r0.versionName     // Catch:{ all -> 0x00ef }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r1.<init>()     // Catch:{ all -> 0x00ef }
            android.content.Context r2 = r9.f1416a     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x00ef }
            r1.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = ".BuildConfig"
            r1.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ef }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ all -> 0x00ef }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00ef
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x00ef }
            if (r1 != 0) goto L_0x00ef
            java.lang.String r1 = "manifest_version"
            r4.put(r1, r0)     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C1363d.mo12490b():java.util.Map");
    }

    /* renamed from: c */
    public ICommonParams mo12491c() {
        return this.f1417b;
    }

    /* renamed from: d */
    public String mo12492d() {
        try {
            return this.f1417b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public String mo12493e() {
        try {
            return String.valueOf(this.f1417b.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* renamed from: f */
    public long mo12494f() {
        try {
            return this.f1417b.getUserId();
        } catch (Throwable unused) {
            return 0;
        }
    }
}
