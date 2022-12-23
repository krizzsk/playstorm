package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.gd */
public final class C11662gd {

    /* renamed from: b */
    private static final C11662gd f28361b;

    /* renamed from: c */
    private static C11662gd f28362c;

    /* renamed from: a */
    public final C11659gb f28363a = new C11659gb();

    /* renamed from: d */
    private Context f28364d;

    static {
        C11662gd gdVar = new C11662gd();
        f28361b = gdVar;
        f28362c = gdVar;
    }

    /* renamed from: a */
    public static C11662gd m33847a() {
        return f28362c;
    }

    /* renamed from: b */
    public static C11659gb m33848b() {
        return f28362c.f28363a;
    }

    C11662gd() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0030 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo72539a(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0050
            android.content.Context r0 = r3.f28364d     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0050
            r3.f28364d = r4     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r4 = r3.mo72540c()     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r0 = r3.mo72540c()     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "configurations"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x003d
            com.tapjoy.internal.bh r0 = com.tapjoy.internal.C11452bh.m33266b(r0)     // Catch:{ Exception -> 0x0030 }
            java.util.Map r1 = r0.mo72215d()     // Catch:{ all -> 0x002b }
            r0.close()     // Catch:{ Exception -> 0x0030 }
            com.tapjoy.internal.gb r0 = r3.f28363a     // Catch:{ Exception -> 0x0030 }
            r0.mo72535a((java.util.Map) r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x003d
        L_0x002b:
            r1 = move-exception
            r0.close()     // Catch:{ Exception -> 0x0030 }
            throw r1     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "configurations"
            android.content.SharedPreferences$Editor r4 = r4.remove(r0)     // Catch:{ all -> 0x004d }
            r4.apply()     // Catch:{ all -> 0x004d }
        L_0x003d:
            com.tapjoy.internal.gd$1 r4 = new com.tapjoy.internal.gd$1     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            com.tapjoy.internal.gb r0 = r3.f28363a     // Catch:{ all -> 0x004d }
            r0.addObserver(r4)     // Catch:{ all -> 0x004d }
            com.tapjoy.internal.gb r0 = r3.f28363a     // Catch:{ all -> 0x004d }
            r4.update(r0, r2)     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0050:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11662gd.mo72539a(android.content.Context):void");
    }

    /* renamed from: c */
    public final SharedPreferences mo72540c() {
        return this.f28364d.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
    }
}
