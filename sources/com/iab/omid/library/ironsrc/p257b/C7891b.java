package com.iab.omid.library.ironsrc.p257b;

import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.C7888a;

/* renamed from: com.iab.omid.library.ironsrc.b.b */
public class C7891b {

    /* renamed from: a */
    private static C7891b f18782a = new C7891b();

    /* renamed from: b */
    private Context f18783b;

    /* renamed from: c */
    private boolean f18784c;

    /* renamed from: d */
    private boolean f18785d;

    /* renamed from: e */
    private C7892a f18786e;

    /* renamed from: com.iab.omid.library.ironsrc.b.b$a */
    public interface C7892a {
    }

    private C7891b() {
    }

    /* renamed from: a */
    public static C7891b m22309a() {
        return f18782a;
    }

    /* renamed from: e */
    private void m22310e() {
        boolean z = !this.f18785d;
        for (C7888a adSessionStatePublisher : C7890a.m22302a().mo55390b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55446a(z);
        }
    }

    /* renamed from: a */
    public void mo55395a(Context context) {
        this.f18783b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo55396a(C7892a aVar) {
        this.f18786e = aVar;
    }

    /* renamed from: b */
    public void mo55397b() {
        this.f18784c = true;
        m22310e();
    }

    /* renamed from: c */
    public void mo55398c() {
        this.f18784c = false;
        this.f18785d = false;
        this.f18786e = null;
    }

    /* renamed from: d */
    public boolean mo55399d() {
        return !this.f18785d;
    }
}
