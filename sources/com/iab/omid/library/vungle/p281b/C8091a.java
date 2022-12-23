package com.iab.omid.library.vungle.p281b;

import com.iab.omid.library.vungle.adsession.C8089a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.vungle.b.a */
public class C8091a {

    /* renamed from: a */
    private static C8091a f19244a = new C8091a();

    /* renamed from: b */
    private final ArrayList<C8089a> f19245b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C8089a> f19246c = new ArrayList<>();

    private C8091a() {
    }

    /* renamed from: a */
    public static C8091a m23206a() {
        return f19244a;
    }

    /* renamed from: a */
    public void mo56182a(C8089a aVar) {
        this.f19245b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C8089a> mo56183b() {
        return Collections.unmodifiableCollection(this.f19245b);
    }

    /* renamed from: b */
    public void mo56184b(C8089a aVar) {
        boolean d = mo56187d();
        this.f19246c.add(aVar);
        if (!d) {
            C8098f.m23246a().mo56225b();
        }
    }

    /* renamed from: c */
    public Collection<C8089a> mo56185c() {
        return Collections.unmodifiableCollection(this.f19246c);
    }

    /* renamed from: c */
    public void mo56186c(C8089a aVar) {
        boolean d = mo56187d();
        this.f19245b.remove(aVar);
        this.f19246c.remove(aVar);
        if (d && !mo56187d()) {
            C8098f.m23246a().mo56226c();
        }
    }

    /* renamed from: d */
    public boolean mo56187d() {
        return this.f19246c.size() > 0;
    }
}
