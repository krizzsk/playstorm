package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.utils.n */
public final class C6780n {

    /* renamed from: a */
    private Map<String, Integer> f17879a = new HashMap();

    /* renamed from: b */
    private Map<String, Integer> f17880b = new HashMap();

    /* renamed from: com.ironsource.mediationsdk.utils.n$a */
    public interface C6781a {
        /* renamed from: j */
        int mo36400j();

        /* renamed from: k */
        String mo36401k();
    }

    public C6780n(List<C6781a> list) {
        for (C6781a next : list) {
            this.f17879a.put(next.mo36401k(), 0);
            this.f17880b.put(next.mo36401k(), Integer.valueOf(next.mo36400j()));
        }
    }

    /* renamed from: a */
    public final void mo36985a(C6781a aVar) {
        synchronized (this) {
            String k = aVar.mo36401k();
            if (this.f17879a.containsKey(k)) {
                this.f17879a.put(k, Integer.valueOf(this.f17879a.get(k).intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo36986a() {
        for (String next : this.f17880b.keySet()) {
            if (this.f17879a.get(next).intValue() < this.f17880b.get(next).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36987b(com.ironsource.mediationsdk.utils.C6780n.C6781a r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.mo36401k()     // Catch:{ all -> 0x0025 }
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f17879a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f17879a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0025 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0025 }
            int r4 = r4.mo36400j()     // Catch:{ all -> 0x0025 }
            if (r0 < r4) goto L_0x0021
            r2 = 1
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6780n.mo36987b(com.ironsource.mediationsdk.utils.n$a):boolean");
    }
}
