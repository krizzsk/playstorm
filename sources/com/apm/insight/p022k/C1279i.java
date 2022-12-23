package com.apm.insight.p022k;

import android.content.Context;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.runtime.C1384p;

/* renamed from: com.apm.insight.k.i */
public final class C1279i implements Runnable {

    /* renamed from: a */
    private Context f1261a;

    private C1279i(Context context) {
        this.f1261a = context;
    }

    /* renamed from: a */
    public static void m1694a(Context context) {
        m1695a(context, 0);
    }

    /* renamed from: a */
    public static void m1695a(Context context, int i) {
        C1384p.m2264b().mo12527a((Runnable) new C1279i(context), (long) i);
    }

    /* renamed from: a */
    public static boolean m1696a() {
        return C1258b.m1617a().mo12323c() || !C1285a.m1724b(C1240h.m1558g());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|(1:5)(1:6)|7|(1:21)|14|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        com.apm.insight.p023l.C1311q.m1877b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        com.apm.insight.runtime.C1389s.m2276a().mo12515a(com.apm.insight.C1240h.m1542a().mo12490b(), com.apm.insight.entity.C1218b.m1453b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (com.apm.insight.runtime.C1384p.m2264b().mo12524a() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        com.apm.insight.runtime.C1389s.m2276a().mo12515a(com.apm.insight.C1240h.m1542a().mo12490b(), com.apm.insight.entity.C1218b.m1453b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0093, code lost:
        if (com.apm.insight.runtime.C1384p.m2264b().mo12524a() != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        com.apm.insight.p021j.C1255d.m1605a(com.apm.insight.runtime.C1384p.m2264b().mo12524a(), r4.f1261a).mo12319a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015 A[Catch:{ all -> 0x0044, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0023 A[Catch:{ all -> 0x0044, all -> 0x0077 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            android.content.Context r0 = r4.f1261a     // Catch:{ all -> 0x000d }
            com.apm.insight.b.g r0 = com.apm.insight.p011b.C1187g.m1299a(r0)     // Catch:{ all -> 0x000d }
            com.apm.insight.b.b r0 = r0.mo12196a()     // Catch:{ all -> 0x000d }
            r0.mo12186f()     // Catch:{ all -> 0x000d }
        L_0x000d:
            android.content.Context r0 = r4.f1261a     // Catch:{ all -> 0x0044 }
            boolean r0 = com.apm.insight.p023l.C1285a.m1724b(r0)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0023
            com.apm.insight.k.b r0 = com.apm.insight.p022k.C1258b.m1617a()     // Catch:{ all -> 0x0044 }
            android.content.Context r1 = r4.f1261a     // Catch:{ all -> 0x0044 }
            boolean r1 = com.apm.insight.p023l.C1309p.m1868b(r1)     // Catch:{ all -> 0x0044 }
            r0.mo12321a((boolean) r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0026
        L_0x0023:
            com.apm.insight.nativecrash.NativeImpl.m1972i()     // Catch:{ all -> 0x0044 }
        L_0x0026:
            com.apm.insight.runtime.s r0 = com.apm.insight.runtime.C1389s.m2276a()
            com.apm.insight.runtime.d r1 = com.apm.insight.C1240h.m1542a()
            java.util.Map r1 = r1.mo12490b()
            org.json.JSONArray r2 = com.apm.insight.entity.C1218b.m1453b()
            r0.mo12515a((java.util.Map<java.lang.String, java.lang.Object>) r1, (org.json.JSONArray) r2)
            com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C1384p.m2264b()
            android.os.Handler r0 = r0.mo12524a()
            if (r0 == 0) goto L_0x0076
            goto L_0x0065
        L_0x0044:
            r0 = move-exception
            com.apm.insight.p023l.C1311q.m1877b((java.lang.Throwable) r0)     // Catch:{ all -> 0x0077 }
            com.apm.insight.runtime.s r0 = com.apm.insight.runtime.C1389s.m2276a()
            com.apm.insight.runtime.d r1 = com.apm.insight.C1240h.m1542a()
            java.util.Map r1 = r1.mo12490b()
            org.json.JSONArray r2 = com.apm.insight.entity.C1218b.m1453b()
            r0.mo12515a((java.util.Map<java.lang.String, java.lang.Object>) r1, (org.json.JSONArray) r2)
            com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C1384p.m2264b()
            android.os.Handler r0 = r0.mo12524a()
            if (r0 == 0) goto L_0x0076
        L_0x0065:
            com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C1384p.m2264b()
            android.os.Handler r0 = r0.mo12524a()
            android.content.Context r1 = r4.f1261a
            com.apm.insight.j.d r0 = com.apm.insight.p021j.C1255d.m1605a(r0, r1)
            r0.mo12319a()
        L_0x0076:
            return
        L_0x0077:
            r0 = move-exception
            com.apm.insight.runtime.s r1 = com.apm.insight.runtime.C1389s.m2276a()
            com.apm.insight.runtime.d r2 = com.apm.insight.C1240h.m1542a()
            java.util.Map r2 = r2.mo12490b()
            org.json.JSONArray r3 = com.apm.insight.entity.C1218b.m1453b()
            r1.mo12515a((java.util.Map<java.lang.String, java.lang.Object>) r2, (org.json.JSONArray) r3)
            com.apm.insight.runtime.u r1 = com.apm.insight.runtime.C1384p.m2264b()
            android.os.Handler r1 = r1.mo12524a()
            if (r1 == 0) goto L_0x00a6
            com.apm.insight.runtime.u r1 = com.apm.insight.runtime.C1384p.m2264b()
            android.os.Handler r1 = r1.mo12524a()
            android.content.Context r2 = r4.f1261a
            com.apm.insight.j.d r1 = com.apm.insight.p021j.C1255d.m1605a(r1, r2)
            r1.mo12319a()
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1279i.run():void");
    }
}
