package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.e */
public final class C6723e {

    /* renamed from: a */
    private static C6723e f17595a;

    /* renamed from: b */
    private JSONObject f17596b = new JSONObject();

    private C6723e() {
    }

    /* renamed from: a */
    public static synchronized C6723e m20496a() {
        C6723e eVar;
        synchronized (C6723e.class) {
            if (f17595a == null) {
                f17595a = new C6723e();
            }
            eVar = f17595a;
        }
        return eVar;
    }

    /* renamed from: a */
    public final synchronized String mo36909a(String str) {
        return this.f17596b.optString(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36910a(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.f17596b     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            monitor-exit(r1)
            return
        L_0x0008:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.sdk.C6723e.mo36910a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    public final synchronized void mo36911a(Map<String, Object> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                mo36910a(next, map.get(next));
            }
        }
    }

    /* renamed from: b */
    public final synchronized JSONObject mo36912b() {
        return this.f17596b;
    }
}
