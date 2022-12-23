package com.bytedance.sdk.component.p120e.p123c;

import com.bytedance.sdk.component.p104b.p105a.C2810g;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import java.io.IOException;

/* renamed from: com.bytedance.sdk.component.e.c.f */
/* compiled from: TncHostInterceptor */
public class C2930f implements C2810g {

    /* renamed from: a */
    private int f6664a;

    /* renamed from: a */
    public void mo17842a(int i) {
        this.f6664a = i;
    }

    /* renamed from: a */
    public C2820m mo17472a(C2810g.C2811a aVar) throws IOException {
        C2820m mVar;
        C2816k a = aVar.mo17474a();
        if (C2931g.m8259a().mo17844a(this.f6664a).mo17834b() != null) {
            C2931g.m8259a().mo17844a(this.f6664a).mo17834b().mo17808e();
        }
        String fVar = a.mo17583b().toString();
        String a2 = C2931g.m8259a().mo17844a(this.f6664a).mo17828a(fVar);
        if (!fVar.equals(a2)) {
            a = a.mo17588g().mo17594a(a2).mo17597b();
        }
        try {
            mVar = aVar.mo17475a(a);
        } catch (Exception e) {
            C2931g.m8259a().mo17844a(this.f6664a).mo17831a(a, e);
            mVar = null;
        }
        C2931g.m8259a().mo17844a(this.f6664a).mo17830a(a, mVar);
        return mVar == null ? aVar.mo17475a(a) : mVar;
    }
}
