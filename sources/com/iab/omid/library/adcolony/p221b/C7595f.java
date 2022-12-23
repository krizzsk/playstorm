package com.iab.omid.library.adcolony.p221b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.p220a.C7582b;
import com.iab.omid.library.adcolony.p220a.C7583c;
import com.iab.omid.library.adcolony.p220a.C7584d;
import com.iab.omid.library.adcolony.p220a.C7585e;
import com.iab.omid.library.adcolony.p221b.C7589b;
import com.iab.omid.library.adcolony.walking.TreeWalker;

/* renamed from: com.iab.omid.library.adcolony.b.f */
public class C7595f implements C7583c, C7589b.C7590a {

    /* renamed from: a */
    private static C7595f f18103a;

    /* renamed from: b */
    private float f18104b = 0.0f;

    /* renamed from: c */
    private final C7585e f18105c;

    /* renamed from: d */
    private final C7582b f18106d;

    /* renamed from: e */
    private C7584d f18107e;

    /* renamed from: f */
    private C7588a f18108f;

    public C7595f(C7585e eVar, C7582b bVar) {
        this.f18105c = eVar;
        this.f18106d = bVar;
    }

    /* renamed from: a */
    public static C7595f m20976a() {
        if (f18103a == null) {
            f18103a = new C7595f(new C7585e(), new C7582b());
        }
        return f18103a;
    }

    /* renamed from: e */
    private C7588a m20977e() {
        if (this.f18108f == null) {
            this.f18108f = C7588a.m20936a();
        }
        return this.f18108f;
    }

    /* renamed from: a */
    public void mo54132a(float f) {
        this.f18104b = f;
        for (C7586a adSessionStatePublisher : m20977e().mo54212c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54262a(f);
        }
    }

    /* renamed from: a */
    public void mo54251a(Context context) {
        this.f18107e = this.f18105c.mo54136a(new Handler(), context, this.f18106d.mo54131a(), this);
    }

    /* renamed from: a */
    public void mo54227a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo54287a();
        } else {
            TreeWalker.getInstance().mo54290c();
        }
    }

    /* renamed from: b */
    public void mo54252b() {
        C7589b.m20943a().mo54216a((C7589b.C7590a) this);
        C7589b.m20943a().mo54217b();
        TreeWalker.getInstance().mo54287a();
        this.f18107e.mo54133a();
    }

    /* renamed from: c */
    public void mo54253c() {
        TreeWalker.getInstance().mo54289b();
        C7589b.m20943a().mo54218c();
        this.f18107e.mo54134b();
    }

    /* renamed from: d */
    public float mo54254d() {
        return this.f18104b;
    }
}
