package com.iab.omid.library.adcolony.p221b;

import com.iab.omid.library.adcolony.adsession.C7586a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.adcolony.b.a */
public class C7588a {

    /* renamed from: a */
    private static C7588a f18086a = new C7588a();

    /* renamed from: b */
    private final ArrayList<C7586a> f18087b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7586a> f18088c = new ArrayList<>();

    private C7588a() {
    }

    /* renamed from: a */
    public static C7588a m20936a() {
        return f18086a;
    }

    /* renamed from: a */
    public void mo54209a(C7586a aVar) {
        this.f18087b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7586a> mo54210b() {
        return Collections.unmodifiableCollection(this.f18087b);
    }

    /* renamed from: b */
    public void mo54211b(C7586a aVar) {
        boolean d = mo54214d();
        this.f18088c.add(aVar);
        if (!d) {
            C7595f.m20976a().mo54252b();
        }
    }

    /* renamed from: c */
    public Collection<C7586a> mo54212c() {
        return Collections.unmodifiableCollection(this.f18088c);
    }

    /* renamed from: c */
    public void mo54213c(C7586a aVar) {
        boolean d = mo54214d();
        this.f18087b.remove(aVar);
        this.f18088c.remove(aVar);
        if (d && !mo54214d()) {
            C7595f.m20976a().mo54253c();
        }
    }

    /* renamed from: d */
    public boolean mo54214d() {
        return this.f18088c.size() > 0;
    }
}
