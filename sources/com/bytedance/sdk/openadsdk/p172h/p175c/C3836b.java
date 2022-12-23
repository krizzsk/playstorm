package com.bytedance.sdk.openadsdk.p172h.p175c;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.b */
/* compiled from: LogStatsCache */
public class C3836b {

    /* renamed from: a */
    private static volatile C3836b f9937a;

    /* renamed from: b */
    private Context f9938b;

    /* renamed from: c */
    private AtomicBoolean f9939c = new AtomicBoolean(false);

    /* renamed from: a */
    public static C3836b m12593a() {
        if (f9937a == null) {
            synchronized (C3836b.class) {
                if (f9937a == null) {
                    f9937a = new C3836b();
                }
            }
        }
        return f9937a;
    }

    private C3836b() {
        mo20679b();
    }

    /* renamed from: b */
    public void mo20679b() {
        if (!this.f9939c.get() && C3578m.m11231a() != null) {
            this.f9938b = C3578m.m11231a();
            this.f9939c.set(true);
        }
    }

    /* renamed from: c */
    public synchronized void mo20680c() {
        if (!this.f9939c.get()) {
            mo20679b();
            return;
        }
        try {
            C3914a.m12849a(this.f9938b, "logstats", "retry >=?", new String[]{String.valueOf(5)});
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|27|26|10|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e A[Catch:{ all -> 0x0065 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.bytedance.sdk.openadsdk.p172h.p175c.C3837c.C3840a> mo20681d() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.f9939c     // Catch:{ all -> 0x006a }
            boolean r1 = r1.get()     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0013
            r10.mo20679b()     // Catch:{ all -> 0x006a }
            monitor-exit(r10)
            return r0
        L_0x0013:
            com.bytedance.sdk.openadsdk.multipro.aidl.c r1 = new com.bytedance.sdk.openadsdk.multipro.aidl.c     // Catch:{ all -> 0x006a }
            android.content.Context r2 = r10.f9938b     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "logstats"
            java.lang.String r4 = "id"
            java.lang.String r5 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "retry <?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x006a }
            r7 = 0
            r8 = 5
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x006a }
            r6[r7] = r8     // Catch:{ all -> 0x006a }
            r7 = 0
            r8 = 0
            r9 = 0
            java.util.Map r2 = com.bytedance.sdk.openadsdk.multipro.p180a.C3914a.m12852a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x006a }
            r1.<init>(r2)     // Catch:{ all -> 0x006a }
        L_0x0038:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "value"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x0065 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0038 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0038 }
            com.bytedance.sdk.openadsdk.h.c.c$a r3 = new com.bytedance.sdk.openadsdk.h.c.c$a     // Catch:{ Exception -> 0x0038 }
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0038 }
            r0.add(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0038
        L_0x0060:
            r1.close()     // Catch:{ all -> 0x006a }
            monitor-exit(r10)
            return r0
        L_0x0065:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p172h.p175c.C3836b.mo20681d():java.util.List");
    }
}
