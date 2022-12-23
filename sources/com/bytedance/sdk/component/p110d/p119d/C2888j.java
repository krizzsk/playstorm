package com.bytedance.sdk.component.p110d.p119d;

import com.bytedance.sdk.component.p110d.C2894f;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.p110d.p113c.C2860c;

/* renamed from: com.bytedance.sdk.component.d.d.j */
/* compiled from: MemoryCacheVisitor */
public class C2888j extends C2878a {
    /* renamed from: a */
    public String mo17755a() {
        return "memory_cache";
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        Object obj;
        C2908t i = cVar.mo17696i();
        if (i == C2908t.BITMAP || i == C2908t.AUTO) {
            obj = cVar.mo17703p().mo17744a(cVar.mo17704q()).mo17599a(cVar.mo17692e());
        } else {
            obj = null;
        }
        if (obj == null) {
            cVar.mo17687a((C2887i) new C2891l());
        } else {
            cVar.mo17687a((C2887i) new C2892m(obj, (C2894f) null, false));
        }
    }
}
