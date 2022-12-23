package com.bytedance.sdk.component.p110d.p119d;

import com.bytedance.sdk.component.p110d.C2894f;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.p113c.C2860c;
import com.bytedance.sdk.component.p110d.p113c.C2870d;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.d.m */
/* compiled from: SuccessVisitor */
public class C2892m<T> extends C2878a {

    /* renamed from: a */
    private T f6560a;

    /* renamed from: b */
    private C2894f f6561b;

    /* renamed from: c */
    private boolean f6562c;

    /* renamed from: a */
    public String mo17755a() {
        return "success";
    }

    public C2892m(T t, C2894f fVar, boolean z) {
        this.f6560a = t;
        this.f6561b = fVar;
        this.f6562c = z;
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        String r = cVar.mo17705r();
        Map<String, List<C2860c>> f = cVar.mo17703p().mo17752f();
        List<C2860c> list = f.get(r);
        if (list == null) {
            m8080b(cVar);
            return;
        }
        synchronized (list) {
            for (C2860c b : list) {
                m8080b(b);
            }
            list.clear();
            f.remove(r);
        }
    }

    /* renamed from: b */
    private Map<String, String> m8079b() {
        C2894f fVar = this.f6561b;
        if (fVar != null) {
            return fVar.mo17620e();
        }
        return null;
    }

    /* renamed from: b */
    private void m8080b(C2860c cVar) {
        C2902n f = cVar.mo17693f();
        if (f != null) {
            f.mo17257a(new C2870d().mo17723a(cVar, this.f6560a, m8079b(), this.f6562c));
        }
    }
}
