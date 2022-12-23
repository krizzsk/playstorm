package com.iab.omid.library.inmobi.p251b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.p250a.C7834b;
import com.iab.omid.library.inmobi.p250a.C7835c;
import com.iab.omid.library.inmobi.p250a.C7836d;
import com.iab.omid.library.inmobi.p250a.C7837e;
import com.iab.omid.library.inmobi.p251b.C7841b;
import com.iab.omid.library.inmobi.walking.TreeWalker;

/* renamed from: com.iab.omid.library.inmobi.b.f */
public class C7847f implements C7835c, C7841b.C7842a {

    /* renamed from: a */
    private static C7847f f18683a;

    /* renamed from: b */
    private float f18684b = 0.0f;

    /* renamed from: c */
    private final C7837e f18685c;

    /* renamed from: d */
    private final C7834b f18686d;

    /* renamed from: e */
    private C7836d f18687e;

    /* renamed from: f */
    private C7840a f18688f;

    public C7847f(C7837e eVar, C7834b bVar) {
        this.f18685c = eVar;
        this.f18686d = bVar;
    }

    /* renamed from: a */
    public static C7847f m22118a() {
        if (f18683a == null) {
            f18683a = new C7847f(new C7837e(), new C7834b());
        }
        return f18683a;
    }

    /* renamed from: e */
    private C7840a m22119e() {
        if (this.f18688f == null) {
            this.f18688f = C7840a.m22078a();
        }
        return this.f18688f;
    }

    /* renamed from: a */
    public void mo55122a(float f) {
        this.f18684b = f;
        for (C7838a adSessionStatePublisher : m22119e().mo55198c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55248a(f);
        }
    }

    /* renamed from: a */
    public void mo55237a(Context context) {
        this.f18687e = this.f18685c.mo55126a(new Handler(), context, this.f18686d.mo55121a(), this);
    }

    /* renamed from: a */
    public void mo55213a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55273a();
        } else {
            TreeWalker.getInstance().mo55276c();
        }
    }

    /* renamed from: b */
    public void mo55238b() {
        C7841b.m22085a().mo55202a((C7841b.C7842a) this);
        C7841b.m22085a().mo55203b();
        TreeWalker.getInstance().mo55273a();
        this.f18687e.mo55123a();
    }

    /* renamed from: c */
    public void mo55239c() {
        TreeWalker.getInstance().mo55275b();
        C7841b.m22085a().mo55204c();
        this.f18687e.mo55124b();
    }

    /* renamed from: d */
    public float mo55240d() {
        return this.f18684b;
    }
}
