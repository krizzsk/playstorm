package com.bytedance.sdk.openadsdk.p176i.p177a;

import com.bytedance.sdk.component.p110d.C2895g;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.p151e.C3502q;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3846a;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.c */
/* compiled from: SplashGifLoader */
public class C3851c extends C3846a {

    /* renamed from: a */
    public static volatile int f9964a;

    /* renamed from: b */
    private C3502q f9965b;

    /* renamed from: a */
    private void m12638a(C2898j jVar) {
        C2895g e = jVar.mo17728e();
        if (e != null && m12640c()) {
            if (jVar.mo17727d()) {
                C2975l.m8384b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f9964a = 1;
                m12639a(true);
            } else {
                C2975l.m8384b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f9964a = 2;
                m12639a(false);
            }
            m12637a(e.mo17621a());
        }
    }

    /* renamed from: c */
    private boolean m12640c() {
        C3502q qVar = this.f9965b;
        return qVar != null && qVar.mo19781c();
    }

    /* renamed from: a */
    private void m12637a(long j) {
        this.f9965b.mo19782d(j);
        C3502q qVar = this.f9965b;
        qVar.mo19779b(j - qVar.mo19778b());
    }

    /* renamed from: a */
    private void m12639a(boolean z) {
        if (m12640c()) {
            this.f9965b.mo19777a(z);
        }
    }

    /* renamed from: d */
    private void m12641d() {
        if (m12640c()) {
            long currentTimeMillis = System.currentTimeMillis();
            C3502q qVar = this.f9965b;
            qVar.mo19776a(currentTimeMillis - qVar.mo19775a());
            this.f9965b.mo19780c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20689a(C2898j jVar, C3846a.C3849b bVar) {
        m12638a(jVar);
        super.mo20689a(jVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20687a() {
        m12641d();
    }
}
