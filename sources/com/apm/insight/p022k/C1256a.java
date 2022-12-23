package com.apm.insight.p022k;

import com.apm.insight.C1240h;
import com.apm.insight.entity.C1218b;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1309p;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.C1393u;
import java.util.Map;

/* renamed from: com.apm.insight.k.a */
public class C1256a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Runnable f1190a = new Runnable() {
        public void run() {
            long j;
            Runnable runnable;
            C1393u uVar;
            if (C1309p.m1868b(C1240h.m1558g())) {
                C1256a.m1615i();
            }
            if (C1256a.f1191b > 0) {
                if (C1285a.m1724b(C1240h.m1558g())) {
                    uVar = C1384p.m2264b();
                    runnable = C1256a.f1190a;
                    j = 15000;
                } else {
                    uVar = C1384p.m2264b();
                    runnable = C1256a.f1190a;
                    j = 60000;
                }
                uVar.mo12527a(runnable, j);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f1191b = 0;

    /* renamed from: a */
    public static void m1607a() {
        f1191b = 40;
        C1384p.m2264b().mo12526a(f1190a);
    }

    /* renamed from: b */
    public static void m1608b() {
        if (!C1281k.m1706b()) {
            C1281k.m1707c();
        }
        if (C1309p.m1868b(C1240h.m1558g()) && C1281k.m1705a(false)) {
            m1615i();
        }
    }

    /* renamed from: c */
    public static boolean m1609c() {
        return false;
    }

    /* renamed from: d */
    public static void m1610d() {
    }

    /* renamed from: h */
    private static byte[] m1614h() {
        try {
            return C1270e.m1664a(C1240h.m1560i().getConfigUrl(), (Map<String, String>) null, C1218b.m1444a().toString().getBytes());
        } catch (Throwable th) {
            C1311q.m1875a(th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (com.apm.insight.p022k.C1281k.m1704a() != false) goto L_0x0054;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m1615i() {
        /*
            java.lang.Class<com.apm.insight.k.a> r0 = com.apm.insight.p022k.C1256a.class
            monitor-enter(r0)
            int r1 = f1191b     // Catch:{ all -> 0x006a }
            r2 = 1
            if (r1 <= 0) goto L_0x000d
            int r1 = f1191b     // Catch:{ all -> 0x006a }
            int r1 = r1 - r2
            f1191b = r1     // Catch:{ all -> 0x006a }
        L_0x000d:
            java.lang.String r1 = "try fetchApmConfig"
            com.apm.insight.p023l.C1311q.m1870a((java.lang.Object) r1)     // Catch:{ all -> 0x006a }
            android.content.Context r1 = com.apm.insight.C1240h.m1558g()     // Catch:{ all -> 0x006a }
            boolean r1 = com.apm.insight.p023l.C1285a.m1724b(r1)     // Catch:{ all -> 0x006a }
            r3 = 0
            if (r1 == 0) goto L_0x005e
            r1 = 0
            byte[] r4 = m1614h()     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x003b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0035 }
            r6.<init>(r4)     // Catch:{ all -> 0x0035 }
            r5.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "data"
            org.json.JSONArray r1 = r5.optJSONArray(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = "npth"
            com.apm.insight.p023l.C1311q.m1874a((java.lang.String) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x006a }
        L_0x003b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r4.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "after fetchApmConfig net "
            r4.append(r5)     // Catch:{ all -> 0x006a }
            r4.append(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006a }
            com.apm.insight.p023l.C1311q.m1870a((java.lang.Object) r4)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0057
            com.apm.insight.runtime.C1341a.m2039a((org.json.JSONArray) r1, (boolean) r2)     // Catch:{ all -> 0x006a }
        L_0x0054:
            f1191b = r3     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0057:
            int r1 = f1191b     // Catch:{ all -> 0x006a }
            int r1 = r1 + -10
            f1191b = r1     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x005e:
            com.apm.insight.p022k.C1281k.m1707c()     // Catch:{ all -> 0x006a }
            boolean r1 = com.apm.insight.p022k.C1281k.m1704a()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            goto L_0x0054
        L_0x0068:
            monitor-exit(r0)
            return
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1256a.m1615i():void");
    }
}
