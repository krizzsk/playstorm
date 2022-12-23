package com.iab.omid.library.corpmailru.p239b;

import com.iab.omid.library.corpmailru.adsession.C7736a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.corpmailru.b.a */
public class C7738a {

    /* renamed from: a */
    private static C7738a f18436a = new C7738a();

    /* renamed from: b */
    private final ArrayList<C7736a> f18437b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7736a> f18438c = new ArrayList<>();

    private C7738a() {
    }

    /* renamed from: a */
    public static C7738a m21624a() {
        return f18436a;
    }

    /* renamed from: a */
    public void mo54802a(C7736a aVar) {
        this.f18437b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7736a> mo54803b() {
        return Collections.unmodifiableCollection(this.f18437b);
    }

    /* renamed from: b */
    public void mo54804b(C7736a aVar) {
        boolean d = mo54807d();
        this.f18438c.add(aVar);
        if (!d) {
            C7745f.m21664a().mo54845b();
        }
    }

    /* renamed from: c */
    public Collection<C7736a> mo54805c() {
        return Collections.unmodifiableCollection(this.f18438c);
    }

    /* renamed from: c */
    public void mo54806c(C7736a aVar) {
        boolean d = mo54807d();
        this.f18437b.remove(aVar);
        this.f18438c.remove(aVar);
        if (d && !mo54807d()) {
            C7745f.m21664a().mo54846c();
        }
    }

    /* renamed from: d */
    public boolean mo54807d() {
        return this.f18438c.size() > 0;
    }
}
