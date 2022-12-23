package com.iab.omid.library.oguryco.p269b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.oguryco.adsession.C7988a;
import com.iab.omid.library.oguryco.p268a.C7984b;
import com.iab.omid.library.oguryco.p268a.C7985c;
import com.iab.omid.library.oguryco.p268a.C7986d;
import com.iab.omid.library.oguryco.p268a.C7987e;
import com.iab.omid.library.oguryco.p269b.C7991b;
import com.iab.omid.library.oguryco.walking.TreeWalker;

/* renamed from: com.iab.omid.library.oguryco.b.f */
public class C7998f implements C7985c, C7991b.C7993a {

    /* renamed from: a */
    private static C7998f f19035a;

    /* renamed from: b */
    private float f19036b = 0.0f;

    /* renamed from: c */
    private final C7987e f19037c;

    /* renamed from: d */
    private final C7984b f19038d;

    /* renamed from: e */
    private C7986d f19039e;

    /* renamed from: f */
    private C7990a f19040f;

    public C7998f(C7987e eVar, C7984b bVar) {
        this.f19037c = eVar;
        this.f19038d = bVar;
    }

    /* renamed from: a */
    public static C7998f m22798a() {
        if (f19035a == null) {
            f19035a = new C7998f(new C7987e(), new C7984b());
        }
        return f19035a;
    }

    /* renamed from: e */
    private C7990a m22799e() {
        if (this.f19040f == null) {
            this.f19040f = C7990a.m22755a();
        }
        return this.f19040f;
    }

    /* renamed from: a */
    public void mo55701a(float f) {
        this.f19036b = f;
        for (C7988a adSessionStatePublisher : m22799e().mo55803c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55847a(f);
        }
    }

    /* renamed from: a */
    public void mo55836a(Context context) {
        this.f19039e = this.f19037c.mo55705a(new Handler(), context, this.f19038d.mo55700a(), this);
    }

    /* renamed from: a */
    public void mo55812a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55872a();
        } else {
            TreeWalker.getInstance().mo55875c();
        }
    }

    /* renamed from: b */
    public void mo55837b() {
        C7991b.m22762a().mo55807a((C7991b.C7993a) this);
        C7991b.m22762a().mo55808b();
        if (C7991b.m22762a().mo55810d()) {
            TreeWalker.getInstance().mo55872a();
        }
        this.f19039e.mo55702a();
    }

    /* renamed from: c */
    public void mo55838c() {
        TreeWalker.getInstance().mo55874b();
        C7991b.m22762a().mo55809c();
        this.f19039e.mo55703b();
    }

    /* renamed from: d */
    public float mo55839d() {
        return this.f19036b;
    }
}
