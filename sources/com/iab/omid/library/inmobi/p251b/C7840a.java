package com.iab.omid.library.inmobi.p251b;

import com.iab.omid.library.inmobi.adsession.C7838a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.inmobi.b.a */
public class C7840a {

    /* renamed from: a */
    private static C7840a f18666a = new C7840a();

    /* renamed from: b */
    private final ArrayList<C7838a> f18667b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7838a> f18668c = new ArrayList<>();

    private C7840a() {
    }

    /* renamed from: a */
    public static C7840a m22078a() {
        return f18666a;
    }

    /* renamed from: a */
    public void mo55195a(C7838a aVar) {
        this.f18667b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7838a> mo55196b() {
        return Collections.unmodifiableCollection(this.f18667b);
    }

    /* renamed from: b */
    public void mo55197b(C7838a aVar) {
        boolean d = mo55200d();
        this.f18668c.add(aVar);
        if (!d) {
            C7847f.m22118a().mo55238b();
        }
    }

    /* renamed from: c */
    public Collection<C7838a> mo55198c() {
        return Collections.unmodifiableCollection(this.f18668c);
    }

    /* renamed from: c */
    public void mo55199c(C7838a aVar) {
        boolean d = mo55200d();
        this.f18667b.remove(aVar);
        this.f18668c.remove(aVar);
        if (d && !mo55200d()) {
            C7847f.m22118a().mo55239c();
        }
    }

    /* renamed from: d */
    public boolean mo55200d() {
        return this.f18668c.size() > 0;
    }
}
