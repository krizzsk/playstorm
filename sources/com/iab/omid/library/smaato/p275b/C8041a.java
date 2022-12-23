package com.iab.omid.library.smaato.p275b;

import com.iab.omid.library.smaato.adsession.C8039a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.smaato.b.a */
public class C8041a {

    /* renamed from: a */
    private static C8041a f19131a = new C8041a();

    /* renamed from: b */
    private final ArrayList<C8039a> f19132b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C8039a> f19133c = new ArrayList<>();

    private C8041a() {
    }

    /* renamed from: a */
    public static C8041a m22982a() {
        return f19131a;
    }

    /* renamed from: a */
    public void mo55988a(C8039a aVar) {
        this.f19132b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C8039a> mo55989b() {
        return Collections.unmodifiableCollection(this.f19132b);
    }

    /* renamed from: b */
    public void mo55990b(C8039a aVar) {
        boolean d = mo55993d();
        this.f19133c.add(aVar);
        if (!d) {
            C8048f.m23022a().mo56031b();
        }
    }

    /* renamed from: c */
    public Collection<C8039a> mo55991c() {
        return Collections.unmodifiableCollection(this.f19133c);
    }

    /* renamed from: c */
    public void mo55992c(C8039a aVar) {
        boolean d = mo55993d();
        this.f19132b.remove(aVar);
        this.f19133c.remove(aVar);
        if (d && !mo55993d()) {
            C8048f.m23022a().mo56032c();
        }
    }

    /* renamed from: d */
    public boolean mo55993d() {
        return this.f19133c.size() > 0;
    }
}
