package com.iab.omid.library.applovin.p233b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.p232a.C7682b;
import com.iab.omid.library.applovin.p232a.C7683c;
import com.iab.omid.library.applovin.p232a.C7684d;
import com.iab.omid.library.applovin.p232a.C7685e;
import com.iab.omid.library.applovin.p233b.C7689b;
import com.iab.omid.library.applovin.walking.TreeWalker;

/* renamed from: com.iab.omid.library.applovin.b.f */
public class C7695f implements C7683c, C7689b.C7690a {

    /* renamed from: a */
    private static C7695f f18337a;

    /* renamed from: b */
    private float f18338b = 0.0f;

    /* renamed from: c */
    private final C7685e f18339c;

    /* renamed from: d */
    private final C7682b f18340d;

    /* renamed from: e */
    private C7684d f18341e;

    /* renamed from: f */
    private C7688a f18342f;

    public C7695f(C7685e eVar, C7682b bVar) {
        this.f18339c = eVar;
        this.f18340d = bVar;
    }

    /* renamed from: a */
    public static C7695f m21436a() {
        if (f18337a == null) {
            f18337a = new C7695f(new C7685e(), new C7682b());
        }
        return f18337a;
    }

    /* renamed from: e */
    private C7688a m21437e() {
        if (this.f18342f == null) {
            this.f18342f = C7688a.m21396a();
        }
        return this.f18342f;
    }

    /* renamed from: a */
    public void mo54530a(float f) {
        this.f18338b = f;
        for (C7686a adSessionStatePublisher : m21437e().mo54610c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54660a(f);
        }
    }

    /* renamed from: a */
    public void mo54649a(Context context) {
        this.f18341e = this.f18339c.mo54534a(new Handler(), context, this.f18340d.mo54529a(), this);
    }

    /* renamed from: a */
    public void mo54625a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo54685a();
        } else {
            TreeWalker.getInstance().mo54688c();
        }
    }

    /* renamed from: b */
    public void mo54650b() {
        C7689b.m21403a().mo54614a((C7689b.C7690a) this);
        C7689b.m21403a().mo54615b();
        TreeWalker.getInstance().mo54685a();
        this.f18341e.mo54531a();
    }

    /* renamed from: c */
    public void mo54651c() {
        TreeWalker.getInstance().mo54687b();
        C7689b.m21403a().mo54616c();
        this.f18341e.mo54532b();
    }

    /* renamed from: d */
    public float mo54652d() {
        return this.f18338b;
    }
}
