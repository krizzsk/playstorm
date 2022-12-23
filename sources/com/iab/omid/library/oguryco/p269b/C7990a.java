package com.iab.omid.library.oguryco.p269b;

import com.iab.omid.library.oguryco.adsession.C7988a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.oguryco.b.a */
public class C7990a {

    /* renamed from: a */
    private static C7990a f19015a = new C7990a();

    /* renamed from: b */
    private final ArrayList<C7988a> f19016b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7988a> f19017c = new ArrayList<>();

    private C7990a() {
    }

    /* renamed from: a */
    public static C7990a m22755a() {
        return f19015a;
    }

    /* renamed from: a */
    public void mo55800a(C7988a aVar) {
        this.f19016b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7988a> mo55801b() {
        return Collections.unmodifiableCollection(this.f19016b);
    }

    /* renamed from: b */
    public void mo55802b(C7988a aVar) {
        boolean d = mo55805d();
        this.f19017c.add(aVar);
        if (!d) {
            C7998f.m22798a().mo55837b();
        }
    }

    /* renamed from: c */
    public Collection<C7988a> mo55803c() {
        return Collections.unmodifiableCollection(this.f19017c);
    }

    /* renamed from: c */
    public void mo55804c(C7988a aVar) {
        boolean d = mo55805d();
        this.f19016b.remove(aVar);
        this.f19017c.remove(aVar);
        if (d && !mo55805d()) {
            C7998f.m22798a().mo55838c();
        }
    }

    /* renamed from: d */
    public boolean mo55805d() {
        return this.f19017c.size() > 0;
    }
}
