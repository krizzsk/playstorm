package com.bytedance.sdk.component.adexpress.p095b;

import com.bytedance.sdk.component.adexpress.p095b.C2629i;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.b.k */
/* compiled from: RenderRealChain */
public class C2632k implements C2629i.C2630a {

    /* renamed from: a */
    C2636n f5628a;

    /* renamed from: b */
    private List<C2629i> f5629b;

    /* renamed from: c */
    private C2628h f5630c;

    /* renamed from: d */
    private AtomicBoolean f5631d = new AtomicBoolean(false);

    public C2632k(List<C2629i> list, C2628h hVar) {
        this.f5629b = list;
        this.f5630c = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000b A[LOOP:0: B:1:0x000b->B:4:0x001b, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16740a() {
        /*
            r2 = this;
            com.bytedance.sdk.component.adexpress.b.h r0 = r2.f5630c
            r0.mo16723a()
            java.util.List<com.bytedance.sdk.component.adexpress.b.i> r0 = r2.f5629b
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()
            com.bytedance.sdk.component.adexpress.b.i r1 = (com.bytedance.sdk.component.adexpress.p095b.C2629i) r1
            boolean r1 = r1.mo16712a(r2)
            if (r1 == 0) goto L_0x000b
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p095b.C2632k.mo16740a():void");
    }

    /* renamed from: a */
    public void mo16741a(C2629i iVar) {
        int indexOf = this.f5629b.indexOf(iVar);
        if (indexOf >= 0) {
            do {
                indexOf++;
                if (indexOf >= this.f5629b.size() || this.f5629b.get(indexOf).mo16712a(this)) {
                }
                indexOf++;
                return;
            } while (this.f5629b.get(indexOf).mo16712a(this));
        }
    }

    /* renamed from: b */
    public boolean mo16745b(C2629i iVar) {
        int indexOf = this.f5629b.indexOf(iVar);
        return indexOf < this.f5629b.size() - 1 && indexOf >= 0;
    }

    /* renamed from: b */
    public C2636n mo16744b() {
        return this.f5628a;
    }

    /* renamed from: a */
    public void mo16742a(C2636n nVar) {
        this.f5628a = nVar;
    }

    /* renamed from: a */
    public void mo16743a(boolean z) {
        this.f5631d.getAndSet(z);
    }

    /* renamed from: c */
    public boolean mo16746c() {
        return this.f5631d.get();
    }
}
