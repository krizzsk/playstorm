package com.iab.omid.library.amazon.p227b;

import com.iab.omid.library.amazon.adsession.C7636a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.amazon.b.a */
public class C7638a {

    /* renamed from: a */
    private static C7638a f18203a = new C7638a();

    /* renamed from: b */
    private final ArrayList<C7636a> f18204b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7636a> f18205c = new ArrayList<>();

    private C7638a() {
    }

    /* renamed from: a */
    public static C7638a m21166a() {
        return f18203a;
    }

    /* renamed from: a */
    public void mo54408a(C7636a aVar) {
        this.f18204b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7636a> mo54409b() {
        return Collections.unmodifiableCollection(this.f18204b);
    }

    /* renamed from: b */
    public void mo54410b(C7636a aVar) {
        boolean d = mo54413d();
        this.f18205c.add(aVar);
        if (!d) {
            C7645f.m21206a().mo54451b();
        }
    }

    /* renamed from: c */
    public Collection<C7636a> mo54411c() {
        return Collections.unmodifiableCollection(this.f18205c);
    }

    /* renamed from: c */
    public void mo54412c(C7636a aVar) {
        boolean d = mo54413d();
        this.f18204b.remove(aVar);
        this.f18205c.remove(aVar);
        if (d && !mo54413d()) {
            C7645f.m21206a().mo54452c();
        }
    }

    /* renamed from: d */
    public boolean mo54413d() {
        return this.f18205c.size() > 0;
    }
}
