package com.iab.omid.library.fyber.p245b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.p244a.C7783b;
import com.iab.omid.library.fyber.p244a.C7784c;
import com.iab.omid.library.fyber.p244a.C7785d;
import com.iab.omid.library.fyber.p244a.C7786e;
import com.iab.omid.library.fyber.p245b.C7790b;
import com.iab.omid.library.fyber.walking.TreeWalker;

/* renamed from: com.iab.omid.library.fyber.b.f */
public class C7796f implements C7784c, C7790b.C7791a {

    /* renamed from: a */
    private static C7796f f18567a;

    /* renamed from: b */
    private float f18568b = 0.0f;

    /* renamed from: c */
    private final C7786e f18569c;

    /* renamed from: d */
    private final C7783b f18570d;

    /* renamed from: e */
    private C7785d f18571e;

    /* renamed from: f */
    private C7789a f18572f;

    public C7796f(C7786e eVar, C7783b bVar) {
        this.f18569c = eVar;
        this.f18570d = bVar;
    }

    /* renamed from: a */
    public static C7796f m21890a() {
        if (f18567a == null) {
            f18567a = new C7796f(new C7786e(), new C7783b());
        }
        return f18567a;
    }

    /* renamed from: e */
    private C7789a m21891e() {
        if (this.f18572f == null) {
            this.f18572f = C7789a.m21850a();
        }
        return this.f18572f;
    }

    /* renamed from: a */
    public void mo54923a(float f) {
        this.f18568b = f;
        for (C7787a adSessionStatePublisher : m21891e().mo55003c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55053a(f);
        }
    }

    /* renamed from: a */
    public void mo55042a(Context context) {
        this.f18571e = this.f18569c.mo54927a(new Handler(), context, this.f18570d.mo54922a(), this);
    }

    /* renamed from: a */
    public void mo55018a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55078a();
        } else {
            TreeWalker.getInstance().mo55081c();
        }
    }

    /* renamed from: b */
    public void mo55043b() {
        C7790b.m21857a().mo55007a((C7790b.C7791a) this);
        C7790b.m21857a().mo55008b();
        TreeWalker.getInstance().mo55078a();
        this.f18571e.mo54924a();
    }

    /* renamed from: c */
    public void mo55044c() {
        TreeWalker.getInstance().mo55080b();
        C7790b.m21857a().mo55009c();
        this.f18571e.mo54925b();
    }

    /* renamed from: d */
    public float mo55045d() {
        return this.f18568b;
    }
}
