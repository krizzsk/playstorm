package com.bytedance.sdk.component.p110d.p119d;

import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.p113c.C2836a;
import com.bytedance.sdk.component.p110d.p113c.C2860c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.d.h */
/* compiled from: FailVisitor */
public class C2886h extends C2878a {

    /* renamed from: a */
    private Throwable f6553a;

    /* renamed from: b */
    private int f6554b;

    /* renamed from: c */
    private String f6555c;

    /* renamed from: a */
    public String mo17755a() {
        return "failed";
    }

    public C2886h(int i, String str, Throwable th) {
        this.f6554b = i;
        this.f6555c = str;
        this.f6553a = th;
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        cVar.mo17683a(new C2836a(this.f6554b, this.f6555c, this.f6553a));
        String r = cVar.mo17705r();
        Map<String, List<C2860c>> f = cVar.mo17703p().mo17752f();
        List<C2860c> list = f.get(r);
        if (list == null) {
            m8067b(cVar);
            return;
        }
        synchronized (list) {
            for (C2860c b : list) {
                m8067b(b);
            }
            list.clear();
            f.remove(r);
        }
    }

    /* renamed from: b */
    private void m8067b(C2860c cVar) {
        C2902n f = cVar.mo17693f();
        if (f != null) {
            f.mo17256a(this.f6554b, this.f6555c, this.f6553a);
        }
    }
}
