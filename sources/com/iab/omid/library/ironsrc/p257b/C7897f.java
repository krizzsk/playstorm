package com.iab.omid.library.ironsrc.p257b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.p256a.C7884b;
import com.iab.omid.library.ironsrc.p256a.C7885c;
import com.iab.omid.library.ironsrc.p256a.C7886d;
import com.iab.omid.library.ironsrc.p256a.C7887e;
import com.iab.omid.library.ironsrc.p257b.C7891b;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

/* renamed from: com.iab.omid.library.ironsrc.b.f */
public class C7897f implements C7885c, C7891b.C7892a {

    /* renamed from: a */
    private static C7897f f18797a;

    /* renamed from: b */
    private float f18798b = 0.0f;

    /* renamed from: c */
    private final C7887e f18799c;

    /* renamed from: d */
    private final C7884b f18800d;

    /* renamed from: e */
    private C7886d f18801e;

    /* renamed from: f */
    private C7890a f18802f;

    public C7897f(C7887e eVar, C7884b bVar) {
        this.f18799c = eVar;
        this.f18800d = bVar;
    }

    /* renamed from: a */
    public static C7897f m22340a() {
        if (f18797a == null) {
            f18797a = new C7897f(new C7887e(), new C7884b());
        }
        return f18797a;
    }

    /* renamed from: e */
    private C7890a m22341e() {
        if (this.f18802f == null) {
            this.f18802f = C7890a.m22302a();
        }
        return this.f18802f;
    }

    /* renamed from: a */
    public void mo55316a(float f) {
        this.f18798b = f;
        for (C7888a adSessionStatePublisher : m22341e().mo55392c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55434a(f);
        }
    }

    /* renamed from: a */
    public void mo55423a(Context context) {
        this.f18801e = this.f18799c.mo55320a(new Handler(), context, this.f18800d.mo55315a(), this);
    }

    /* renamed from: b */
    public void mo55424b() {
        C7891b.m22309a().mo55396a((C7891b.C7892a) this);
        C7891b.m22309a().mo55397b();
        if (C7891b.m22309a().mo55399d()) {
            TreeWalker.getInstance().mo55459a();
        }
        this.f18801e.mo55317a();
    }

    /* renamed from: c */
    public void mo55425c() {
        TreeWalker.getInstance().mo55461b();
        C7891b.m22309a().mo55398c();
        this.f18801e.mo55318b();
    }

    /* renamed from: d */
    public float mo55426d() {
        return this.f18798b;
    }
}
