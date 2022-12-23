package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d0 */
public class C5131d0 {

    /* renamed from: a */
    public volatile C5207q0 f13736a;

    /* renamed from: b */
    public volatile C5151i f13737b;

    static {
        C5205q.m16203a();
    }

    /* renamed from: a */
    public C5151i mo25867a() {
        if (this.f13737b != null) {
            return this.f13737b;
        }
        synchronized (this) {
            if (this.f13737b != null) {
                C5151i iVar = this.f13737b;
                return iVar;
            }
            if (this.f13736a == null) {
                this.f13737b = C5151i.f13766b;
            } else {
                this.f13737b = this.f13736a.toByteString();
            }
            C5151i iVar2 = this.f13737b;
            return iVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5131d0)) {
            return false;
        }
        C5131d0 d0Var = (C5131d0) obj;
        C5207q0 q0Var = this.f13736a;
        C5207q0 q0Var2 = d0Var.f13736a;
        if (q0Var == null && q0Var2 == null) {
            return mo25867a().equals(d0Var.mo25867a());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.mo25868a(q0Var.getDefaultInstanceForType()));
        }
        return mo25868a(q0Var2.getDefaultInstanceForType()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.protobuf.C5207q0 mo25868a(com.fyber.inneractive.sdk.protobuf.C5207q0 r2) {
        /*
            r1 = this;
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r1.f13736a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r1.f13736a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f13736a = r2     // Catch:{ a0 -> 0x0013 }
            com.fyber.inneractive.sdk.protobuf.i r0 = com.fyber.inneractive.sdk.protobuf.C5151i.f13766b     // Catch:{ a0 -> 0x0013 }
            r1.f13737b = r0     // Catch:{ a0 -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f13736a = r2     // Catch:{ all -> 0x001d }
            com.fyber.inneractive.sdk.protobuf.i r2 = com.fyber.inneractive.sdk.protobuf.C5151i.f13766b     // Catch:{ all -> 0x001d }
            r1.f13737b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r1.f13736a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5131d0.mo25868a(com.fyber.inneractive.sdk.protobuf.q0):com.fyber.inneractive.sdk.protobuf.q0");
    }
}
