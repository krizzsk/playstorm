package com.bytedance.sdk.component.p110d.p119d;

import com.bytedance.sdk.component.p110d.C2829b;
import com.bytedance.sdk.component.p110d.p113c.C2860c;

/* renamed from: com.bytedance.sdk.component.d.d.d */
/* compiled from: CachePolicyVisitor */
public class C2882d extends C2878a {
    /* renamed from: a */
    public String mo17755a() {
        return "cache_policy";
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        C2829b q = cVar.mo17704q();
        if (q != null) {
            if (q.mo17607c()) {
                cVar.mo17687a((C2887i) new C2888j());
                return;
            } else if (q.mo17608d()) {
                cVar.mo17687a((C2887i) new C2884f());
                return;
            }
        }
        cVar.mo17687a((C2887i) new C2889k());
    }
}
