package com.iab.omid.library.smaato.p275b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.p274a.C8035b;
import com.iab.omid.library.smaato.p274a.C8036c;
import com.iab.omid.library.smaato.p274a.C8037d;
import com.iab.omid.library.smaato.p274a.C8038e;
import com.iab.omid.library.smaato.p275b.C8042b;
import com.iab.omid.library.smaato.walking.TreeWalker;

/* renamed from: com.iab.omid.library.smaato.b.f */
public class C8048f implements C8036c, C8042b.C8043a {

    /* renamed from: a */
    private static C8048f f19148a;

    /* renamed from: b */
    private float f19149b = 0.0f;

    /* renamed from: c */
    private final C8038e f19150c;

    /* renamed from: d */
    private final C8035b f19151d;

    /* renamed from: e */
    private C8037d f19152e;

    /* renamed from: f */
    private C8041a f19153f;

    public C8048f(C8038e eVar, C8035b bVar) {
        this.f19150c = eVar;
        this.f19151d = bVar;
    }

    /* renamed from: a */
    public static C8048f m23022a() {
        if (f19148a == null) {
            f19148a = new C8048f(new C8038e(), new C8035b());
        }
        return f19148a;
    }

    /* renamed from: e */
    private C8041a m23023e() {
        if (this.f19153f == null) {
            this.f19153f = C8041a.m22982a();
        }
        return this.f19153f;
    }

    /* renamed from: a */
    public void mo55915a(float f) {
        this.f19149b = f;
        for (C8039a adSessionStatePublisher : m23023e().mo55991c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo56041a(f);
        }
    }

    /* renamed from: a */
    public void mo56030a(Context context) {
        this.f19152e = this.f19150c.mo55919a(new Handler(), context, this.f19151d.mo55914a(), this);
    }

    /* renamed from: a */
    public void mo56006a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo56066a();
        } else {
            TreeWalker.getInstance().mo56069c();
        }
    }

    /* renamed from: b */
    public void mo56031b() {
        C8042b.m22989a().mo55995a((C8042b.C8043a) this);
        C8042b.m22989a().mo55996b();
        TreeWalker.getInstance().mo56066a();
        this.f19152e.mo55916a();
    }

    /* renamed from: c */
    public void mo56032c() {
        TreeWalker.getInstance().mo56068b();
        C8042b.m22989a().mo55997c();
        this.f19152e.mo55917b();
    }

    /* renamed from: d */
    public float mo56033d() {
        return this.f19149b;
    }
}
