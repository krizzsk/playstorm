package com.apm.insight.p020i;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.apm.insight.i.a */
public class C1247a {

    /* renamed from: a */
    private static volatile UUID f1171a = null;

    /* renamed from: b */
    private static String f1172b = "";

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(2:10|11)|(3:14|15|16)(1:18)|17|19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|(1:9)(6:10|11|(3:14|15|16)(1:18)|17|19|20))|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1247a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.UUID r0 = f1171a
            if (r0 != 0) goto L_0x0050
            java.lang.Class<com.apm.insight.i.a> r0 = com.apm.insight.p020i.C1247a.class
            monitor-enter(r0)
            java.util.UUID r1 = f1171a     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x004b
            com.apm.insight.runtime.s r1 = com.apm.insight.runtime.C1389s.m2276a()     // Catch:{ all -> 0x004d }
            r2 = 0
            java.lang.String r1 = r1.mo12513a((java.lang.String) r2)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0020
            java.util.UUID r4 = java.util.UUID.fromString(r1)     // Catch:{ all -> 0x004d }
            f1171a = r4     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x0020:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r4, r1)     // Catch:{ all -> 0x002a }
        L_0x002a:
            if (r2 == 0) goto L_0x0039
            java.lang.String r4 = "utf8"
            byte[] r4 = r2.getBytes(r4)     // Catch:{ all -> 0x003e }
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)     // Catch:{ all -> 0x003e }
        L_0x0036:
            f1171a = r4     // Catch:{ all -> 0x003e }
            goto L_0x003e
        L_0x0039:
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x003e }
            goto L_0x0036
        L_0x003e:
            com.apm.insight.runtime.s r4 = com.apm.insight.runtime.C1389s.m2276a()     // Catch:{ all -> 0x004b }
            java.util.UUID r1 = f1171a     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004b }
            r4.mo12519c((java.lang.String) r1)     // Catch:{ all -> 0x004b }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r4
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p020i.C1247a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static synchronized String m1589a(Context context) {
        String str;
        UUID a;
        synchronized (C1247a.class) {
            if (TextUtils.isEmpty(f1172b) && (a = new C1247a(context).mo12311a()) != null) {
                f1172b = a.toString();
            }
            str = f1172b;
        }
        return str;
    }

    /* renamed from: a */
    public UUID mo12311a() {
        return f1171a;
    }
}
