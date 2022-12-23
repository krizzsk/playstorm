package com.iab.omid.library.mmadbridge.p263b;

import com.iab.omid.library.mmadbridge.adsession.C7938a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.mmadbridge.b.a */
public class C7940a {

    /* renamed from: a */
    private static C7940a f18894a = new C7940a();

    /* renamed from: b */
    private final ArrayList<C7938a> f18895b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7938a> f18896c = new ArrayList<>();

    private C7940a() {
    }

    /* renamed from: a */
    public static C7940a m22525a() {
        return f18894a;
    }

    /* renamed from: a */
    public void mo55579a(C7938a aVar) {
        this.f18895b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7938a> mo55580b() {
        return Collections.unmodifiableCollection(this.f18895b);
    }

    /* renamed from: b */
    public void mo55581b(C7938a aVar) {
        boolean d = mo55584d();
        this.f18896c.add(aVar);
        if (!d) {
            C7947f.m22565a().mo55622b();
        }
    }

    /* renamed from: c */
    public Collection<C7938a> mo55582c() {
        return Collections.unmodifiableCollection(this.f18896c);
    }

    /* renamed from: c */
    public void mo55583c(C7938a aVar) {
        boolean d = mo55584d();
        this.f18895b.remove(aVar);
        this.f18896c.remove(aVar);
        if (d && !mo55584d()) {
            C7947f.m22565a().mo55623c();
        }
    }

    /* renamed from: d */
    public boolean mo55584d() {
        return this.f18896c.size() > 0;
    }
}
