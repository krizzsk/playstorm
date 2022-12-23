package com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e;

import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i;
import com.bytedance.sdk.component.p104b.p105a.C2806e;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.f */
/* compiled from: VolleyResponseWrapper */
public class C2454f extends C2448a {

    /* renamed from: c */
    private C2820m f5205c;

    public C2454f(C2820m mVar, C2453e eVar) {
        C2806e g;
        this.f5205c = mVar;
        this.f5196a = new ArrayList();
        if (!(mVar == null || (g = mVar.mo17502g()) == null)) {
            for (int i = 0; i < g.mo17553a(); i++) {
                this.f5196a.add(new C2473i.C2475b(g.mo17554a(i), g.mo17555b(i)));
            }
        }
        this.f5197b = eVar;
    }

    /* renamed from: a */
    public int mo16166a() {
        return this.f5205c.mo17497c();
    }

    /* renamed from: b */
    public boolean mo16170b() {
        return this.f5205c.mo17497c() >= 200 && this.f5205c.mo17497c() < 300;
    }

    /* renamed from: a */
    public String mo16169a(String str, String str2) {
        return mo16167a(str) != null ? mo16167a(str).f5268b : str2;
    }

    /* renamed from: c */
    public List<C2473i.C2475b> mo16171c() {
        return this.f5196a;
    }

    /* renamed from: d */
    public InputStream mo16172d() {
        return this.f5205c.mo17501f().mo17507c();
    }

    /* renamed from: e */
    public String mo16173e() {
        C2820m mVar = this.f5205c;
        return (mVar == null || mVar.mo17503h() == null) ? "http/1.1" : this.f5205c.mo17503h().toString();
    }

    /* renamed from: f */
    public String mo16174f() {
        return mo16168a(this.f5205c.mo17497c());
    }
}
