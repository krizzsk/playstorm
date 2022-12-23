package com.mbridge.msdk.foundation.same.p300b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.b */
/* compiled from: DirectoryContext */
public abstract class C8419b {

    /* renamed from: a */
    protected C8418a f20368a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<C8418a> mo57501b();

    public C8419b(String str) {
        C8418a aVar = new C8418a();
        aVar.mo57494a(str);
        aVar.mo57492a(C8420c.AD_ROOT);
        List<C8418a> b = mo57501b();
        if (b != null && b.size() > 0) {
            aVar.mo57495a(b);
        }
        this.f20368a = aVar;
    }

    /* renamed from: a */
    public final C8418a mo57499a() {
        return this.f20368a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8418a mo57500a(ArrayList<C8418a> arrayList, C8420c cVar, String str) {
        C8418a aVar = new C8418a();
        aVar.mo57492a(cVar);
        aVar.mo57494a(str);
        arrayList.add(aVar);
        return aVar;
    }
}
