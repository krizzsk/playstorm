package com.iab.omid.library.amazon.p227b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.p226a.C7632b;
import com.iab.omid.library.amazon.p226a.C7633c;
import com.iab.omid.library.amazon.p226a.C7634d;
import com.iab.omid.library.amazon.p226a.C7635e;
import com.iab.omid.library.amazon.p227b.C7639b;
import com.iab.omid.library.amazon.walking.TreeWalker;

/* renamed from: com.iab.omid.library.amazon.b.f */
public class C7645f implements C7633c, C7639b.C7640a {

    /* renamed from: a */
    private static C7645f f18220a;

    /* renamed from: b */
    private float f18221b = 0.0f;

    /* renamed from: c */
    private final C7635e f18222c;

    /* renamed from: d */
    private final C7632b f18223d;

    /* renamed from: e */
    private C7634d f18224e;

    /* renamed from: f */
    private C7638a f18225f;

    public C7645f(C7635e eVar, C7632b bVar) {
        this.f18222c = eVar;
        this.f18223d = bVar;
    }

    /* renamed from: a */
    public static C7645f m21206a() {
        if (f18220a == null) {
            f18220a = new C7645f(new C7635e(), new C7632b());
        }
        return f18220a;
    }

    /* renamed from: e */
    private C7638a m21207e() {
        if (this.f18225f == null) {
            this.f18225f = C7638a.m21166a();
        }
        return this.f18225f;
    }

    /* renamed from: a */
    public void mo54331a(float f) {
        this.f18221b = f;
        for (C7636a adSessionStatePublisher : m21207e().mo54411c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54461a(f);
        }
    }

    /* renamed from: a */
    public void mo54450a(Context context) {
        this.f18224e = this.f18222c.mo54335a(new Handler(), context, this.f18223d.mo54330a(), this);
    }

    /* renamed from: a */
    public void mo54426a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo54486a();
        } else {
            TreeWalker.getInstance().mo54489c();
        }
    }

    /* renamed from: b */
    public void mo54451b() {
        C7639b.m21173a().mo54415a((C7639b.C7640a) this);
        C7639b.m21173a().mo54416b();
        TreeWalker.getInstance().mo54486a();
        this.f18224e.mo54332a();
    }

    /* renamed from: c */
    public void mo54452c() {
        TreeWalker.getInstance().mo54488b();
        C7639b.m21173a().mo54417c();
        this.f18224e.mo54333b();
    }

    /* renamed from: d */
    public float mo54453d() {
        return this.f18221b;
    }
}
