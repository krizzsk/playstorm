package com.iab.omid.library.ironsrc.p257b;

import com.iab.omid.library.ironsrc.adsession.C7888a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.ironsrc.b.a */
public class C7890a {

    /* renamed from: a */
    private static C7890a f18779a = new C7890a();

    /* renamed from: b */
    private final ArrayList<C7888a> f18780b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7888a> f18781c = new ArrayList<>();

    private C7890a() {
    }

    /* renamed from: a */
    public static C7890a m22302a() {
        return f18779a;
    }

    /* renamed from: a */
    public void mo55389a(C7888a aVar) {
        this.f18780b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7888a> mo55390b() {
        return Collections.unmodifiableCollection(this.f18780b);
    }

    /* renamed from: b */
    public void mo55391b(C7888a aVar) {
        boolean d = mo55394d();
        this.f18781c.add(aVar);
        if (!d) {
            C7897f.m22340a().mo55424b();
        }
    }

    /* renamed from: c */
    public Collection<C7888a> mo55392c() {
        return Collections.unmodifiableCollection(this.f18781c);
    }

    /* renamed from: c */
    public void mo55393c(C7888a aVar) {
        boolean d = mo55394d();
        this.f18780b.remove(aVar);
        this.f18781c.remove(aVar);
        if (d && !mo55394d()) {
            C7897f.m22340a().mo55425c();
        }
    }

    /* renamed from: d */
    public boolean mo55394d() {
        return this.f18781c.size() > 0;
    }
}
