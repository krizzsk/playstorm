package com.iab.omid.library.applovin.p233b;

import com.iab.omid.library.applovin.adsession.C7686a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.applovin.b.a */
public class C7688a {

    /* renamed from: a */
    private static C7688a f18320a = new C7688a();

    /* renamed from: b */
    private final ArrayList<C7686a> f18321b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7686a> f18322c = new ArrayList<>();

    private C7688a() {
    }

    /* renamed from: a */
    public static C7688a m21396a() {
        return f18320a;
    }

    /* renamed from: a */
    public void mo54607a(C7686a aVar) {
        this.f18321b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7686a> mo54608b() {
        return Collections.unmodifiableCollection(this.f18321b);
    }

    /* renamed from: b */
    public void mo54609b(C7686a aVar) {
        boolean d = mo54612d();
        this.f18322c.add(aVar);
        if (!d) {
            C7695f.m21436a().mo54650b();
        }
    }

    /* renamed from: c */
    public Collection<C7686a> mo54610c() {
        return Collections.unmodifiableCollection(this.f18322c);
    }

    /* renamed from: c */
    public void mo54611c(C7686a aVar) {
        boolean d = mo54612d();
        this.f18321b.remove(aVar);
        this.f18322c.remove(aVar);
        if (d && !mo54612d()) {
            C7695f.m21436a().mo54651c();
        }
    }

    /* renamed from: d */
    public boolean mo54612d() {
        return this.f18322c.size() > 0;
    }
}
