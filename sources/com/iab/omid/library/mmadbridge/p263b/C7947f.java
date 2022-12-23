package com.iab.omid.library.mmadbridge.p263b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.p262a.C7934b;
import com.iab.omid.library.mmadbridge.p262a.C7935c;
import com.iab.omid.library.mmadbridge.p262a.C7936d;
import com.iab.omid.library.mmadbridge.p262a.C7937e;
import com.iab.omid.library.mmadbridge.p263b.C7941b;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;

/* renamed from: com.iab.omid.library.mmadbridge.b.f */
public class C7947f implements C7935c, C7941b.C7942a {

    /* renamed from: a */
    private static C7947f f18911a;

    /* renamed from: b */
    private float f18912b = 0.0f;

    /* renamed from: c */
    private final C7937e f18913c;

    /* renamed from: d */
    private final C7934b f18914d;

    /* renamed from: e */
    private C7936d f18915e;

    /* renamed from: f */
    private C7940a f18916f;

    public C7947f(C7937e eVar, C7934b bVar) {
        this.f18913c = eVar;
        this.f18914d = bVar;
    }

    /* renamed from: a */
    public static C7947f m22565a() {
        if (f18911a == null) {
            f18911a = new C7947f(new C7937e(), new C7934b());
        }
        return f18911a;
    }

    /* renamed from: e */
    private C7940a m22566e() {
        if (this.f18916f == null) {
            this.f18916f = C7940a.m22525a();
        }
        return this.f18916f;
    }

    /* renamed from: a */
    public void mo55502a(float f) {
        this.f18912b = f;
        for (C7938a adSessionStatePublisher : m22566e().mo55582c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55632a(f);
        }
    }

    /* renamed from: a */
    public void mo55621a(Context context) {
        this.f18915e = this.f18913c.mo55506a(new Handler(), context, this.f18914d.mo55501a(), this);
    }

    /* renamed from: a */
    public void mo55597a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55657a();
        } else {
            TreeWalker.getInstance().mo55660c();
        }
    }

    /* renamed from: b */
    public void mo55622b() {
        C7941b.m22532a().mo55586a((C7941b.C7942a) this);
        C7941b.m22532a().mo55587b();
        TreeWalker.getInstance().mo55657a();
        this.f18915e.mo55503a();
    }

    /* renamed from: c */
    public void mo55623c() {
        TreeWalker.getInstance().mo55659b();
        C7941b.m22532a().mo55588c();
        this.f18915e.mo55504b();
    }

    /* renamed from: d */
    public float mo55624d() {
        return this.f18912b;
    }
}
