package com.iab.omid.library.fyber.p245b;

import com.iab.omid.library.fyber.adsession.C7787a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.fyber.b.a */
public class C7789a {

    /* renamed from: a */
    private static C7789a f18550a = new C7789a();

    /* renamed from: b */
    private final ArrayList<C7787a> f18551b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7787a> f18552c = new ArrayList<>();

    private C7789a() {
    }

    /* renamed from: a */
    public static C7789a m21850a() {
        return f18550a;
    }

    /* renamed from: a */
    public void mo55000a(C7787a aVar) {
        this.f18551b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7787a> mo55001b() {
        return Collections.unmodifiableCollection(this.f18551b);
    }

    /* renamed from: b */
    public void mo55002b(C7787a aVar) {
        boolean d = mo55005d();
        this.f18552c.add(aVar);
        if (!d) {
            C7796f.m21890a().mo55043b();
        }
    }

    /* renamed from: c */
    public Collection<C7787a> mo55003c() {
        return Collections.unmodifiableCollection(this.f18552c);
    }

    /* renamed from: c */
    public void mo55004c(C7787a aVar) {
        boolean d = mo55005d();
        this.f18551b.remove(aVar);
        this.f18552c.remove(aVar);
        if (d && !mo55005d()) {
            C7796f.m21890a().mo55044c();
        }
    }

    /* renamed from: d */
    public boolean mo55005d() {
        return this.f18552c.size() > 0;
    }
}
