package com.mbridge.msdk.foundation.same.p300b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.a */
/* compiled from: Directory */
public final class C8418a {

    /* renamed from: a */
    private C8420c f20364a;

    /* renamed from: b */
    private String f20365b;

    /* renamed from: c */
    private C8418a f20366c;

    /* renamed from: d */
    private List<C8418a> f20367d;

    /* renamed from: a */
    public final C8420c mo57491a() {
        return this.f20364a;
    }

    /* renamed from: a */
    public final void mo57492a(C8420c cVar) {
        this.f20364a = cVar;
    }

    /* renamed from: b */
    public final String mo57496b() {
        return this.f20365b;
    }

    /* renamed from: a */
    public final void mo57494a(String str) {
        this.f20365b = str;
    }

    /* renamed from: c */
    public final C8418a mo57497c() {
        return this.f20366c;
    }

    /* renamed from: d */
    public final List<C8418a> mo57498d() {
        return this.f20367d;
    }

    /* renamed from: a */
    private void m24318a(C8418a aVar) {
        if (this.f20367d == null) {
            this.f20367d = new ArrayList();
        }
        aVar.f20366c = this;
        this.f20367d.add(aVar);
    }

    /* renamed from: a */
    public final void mo57493a(C8420c cVar, String str) {
        C8418a aVar = new C8418a();
        aVar.f20364a = cVar;
        aVar.f20365b = str;
        m24318a(aVar);
    }

    /* renamed from: a */
    public final void mo57495a(List<C8418a> list) {
        if (list != null && list.size() != 0) {
            for (C8418a a : list) {
                m24318a(a);
            }
        }
    }
}
