package com.iab.omid.library.vungle.p281b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.p280a.C8085b;
import com.iab.omid.library.vungle.p280a.C8086c;
import com.iab.omid.library.vungle.p280a.C8087d;
import com.iab.omid.library.vungle.p280a.C8088e;
import com.iab.omid.library.vungle.p281b.C8092b;
import com.iab.omid.library.vungle.walking.TreeWalker;

/* renamed from: com.iab.omid.library.vungle.b.f */
public class C8098f implements C8086c, C8092b.C8093a {

    /* renamed from: a */
    private static C8098f f19261a;

    /* renamed from: b */
    private float f19262b = 0.0f;

    /* renamed from: c */
    private final C8088e f19263c;

    /* renamed from: d */
    private final C8085b f19264d;

    /* renamed from: e */
    private C8087d f19265e;

    /* renamed from: f */
    private C8091a f19266f;

    public C8098f(C8088e eVar, C8085b bVar) {
        this.f19263c = eVar;
        this.f19264d = bVar;
    }

    /* renamed from: a */
    public static C8098f m23246a() {
        if (f19261a == null) {
            f19261a = new C8098f(new C8088e(), new C8085b());
        }
        return f19261a;
    }

    /* renamed from: e */
    private C8091a m23247e() {
        if (this.f19266f == null) {
            this.f19266f = C8091a.m23206a();
        }
        return this.f19266f;
    }

    /* renamed from: a */
    public void mo56109a(float f) {
        this.f19262b = f;
        for (C8089a adSessionStatePublisher : m23247e().mo56185c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo56235a(f);
        }
    }

    /* renamed from: a */
    public void mo56224a(Context context) {
        this.f19265e = this.f19263c.mo56113a(new Handler(), context, this.f19264d.mo56108a(), this);
    }

    /* renamed from: a */
    public void mo56200a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo56260a();
        } else {
            TreeWalker.getInstance().mo56263c();
        }
    }

    /* renamed from: b */
    public void mo56225b() {
        C8092b.m23213a().mo56189a((C8092b.C8093a) this);
        C8092b.m23213a().mo56190b();
        TreeWalker.getInstance().mo56260a();
        this.f19265e.mo56110a();
    }

    /* renamed from: c */
    public void mo56226c() {
        TreeWalker.getInstance().mo56262b();
        C8092b.m23213a().mo56191c();
        this.f19265e.mo56111b();
    }

    /* renamed from: d */
    public float mo56227d() {
        return this.f19262b;
    }
}
