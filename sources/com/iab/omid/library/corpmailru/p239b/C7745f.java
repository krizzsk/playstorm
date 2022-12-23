package com.iab.omid.library.corpmailru.p239b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.p238a.C7732b;
import com.iab.omid.library.corpmailru.p238a.C7733c;
import com.iab.omid.library.corpmailru.p238a.C7734d;
import com.iab.omid.library.corpmailru.p238a.C7735e;
import com.iab.omid.library.corpmailru.p239b.C7739b;
import com.iab.omid.library.corpmailru.walking.TreeWalker;

/* renamed from: com.iab.omid.library.corpmailru.b.f */
public class C7745f implements C7733c, C7739b.C7740a {

    /* renamed from: a */
    private static C7745f f18453a;

    /* renamed from: b */
    private float f18454b = 0.0f;

    /* renamed from: c */
    private final C7735e f18455c;

    /* renamed from: d */
    private final C7732b f18456d;

    /* renamed from: e */
    private C7734d f18457e;

    /* renamed from: f */
    private C7738a f18458f;

    public C7745f(C7735e eVar, C7732b bVar) {
        this.f18455c = eVar;
        this.f18456d = bVar;
    }

    /* renamed from: a */
    public static C7745f m21664a() {
        if (f18453a == null) {
            f18453a = new C7745f(new C7735e(), new C7732b());
        }
        return f18453a;
    }

    /* renamed from: e */
    private C7738a m21665e() {
        if (this.f18458f == null) {
            this.f18458f = C7738a.m21624a();
        }
        return this.f18458f;
    }

    /* renamed from: a */
    public void mo54729a(float f) {
        this.f18454b = f;
        for (C7736a adSessionStatePublisher : m21665e().mo54805c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54855a(f);
        }
    }

    /* renamed from: a */
    public void mo54844a(Context context) {
        this.f18457e = this.f18455c.mo54733a(new Handler(), context, this.f18456d.mo54728a(), this);
    }

    /* renamed from: a */
    public void mo54820a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo54880a();
        } else {
            TreeWalker.getInstance().mo54883c();
        }
    }

    /* renamed from: b */
    public void mo54845b() {
        C7739b.m21631a().mo54809a((C7739b.C7740a) this);
        C7739b.m21631a().mo54810b();
        TreeWalker.getInstance().mo54880a();
        this.f18457e.mo54730a();
    }

    /* renamed from: c */
    public void mo54846c() {
        TreeWalker.getInstance().mo54882b();
        C7739b.m21631a().mo54811c();
        this.f18457e.mo54731b();
    }

    /* renamed from: d */
    public float mo54847d() {
        return this.f18454b;
    }
}
