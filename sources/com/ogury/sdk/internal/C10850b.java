package com.ogury.sdk.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.sdk.internal.b */
/* compiled from: MonitoringInfo.kt */
public final class C10850b {

    /* renamed from: a */
    private final Map<String, String> f27079a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo67909a(String str, String str2) {
        if (str != null) {
            boolean z = true;
            if ((str.length() > 0) && str2 != null) {
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z && !this.f27079a.containsKey(str)) {
                    this.f27079a.put(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo67910a() {
        return this.f27079a.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo67912a(String str) {
        C10865m.m32951b(str, "name");
        return this.f27079a.containsKey(str);
    }

    /* renamed from: b */
    public final String mo67913b(String str) {
        C10865m.m32951b(str, "name");
        return this.f27079a.get(str);
    }

    /* renamed from: b */
    public final Set<Map.Entry<String, String>> mo67914b() {
        return this.f27079a.entrySet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C10865m.m32950a((Object) getClass(), (Object) obj.getClass()))) {
            return false;
        }
        return C10865m.m32950a((Object) this.f27079a, (Object) ((C10850b) obj).f27079a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67911a(com.ogury.sdk.internal.C10850b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "other"
            com.ogury.sdk.internal.C10865m.m32951b(r5, r0)
            java.util.Set r5 = r5.mo67914b()
            java.util.Iterator r5 = r5.iterator()
        L_0x000d:
            boolean r0 = r5.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r4.mo67912a((java.lang.String) r2)
            if (r3 == 0) goto L_0x0037
            java.lang.String r2 = r4.mo67913b((java.lang.String) r2)
            boolean r0 = com.ogury.sdk.internal.C10865m.m32950a((java.lang.Object) r2, (java.lang.Object) r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000d
        L_0x0037:
            r5 = 0
            return r5
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.sdk.internal.C10850b.mo67911a(com.ogury.sdk.internal.b):boolean");
    }

    /* renamed from: b */
    public final void mo67915b(C10850b bVar) {
        C10865m.m32951b(bVar, "other");
        this.f27079a.putAll(bVar.f27079a);
    }

    /* renamed from: c */
    public final void mo67916c() {
        this.f27079a.clear();
    }

    public final int hashCode() {
        return this.f27079a.hashCode();
    }
}
