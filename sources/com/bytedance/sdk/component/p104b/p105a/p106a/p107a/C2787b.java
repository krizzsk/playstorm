package com.bytedance.sdk.component.p104b.p105a.p106a.p107a;

import com.bytedance.sdk.component.p104b.p105a.C2810g;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.b */
/* compiled from: NetChain */
public class C2787b implements C2810g.C2811a {

    /* renamed from: a */
    List<C2810g> f6270a;

    /* renamed from: b */
    C2816k f6271b;

    /* renamed from: c */
    int f6272c = 0;

    C2787b(List<C2810g> list, C2816k kVar) {
        this.f6270a = list;
        this.f6271b = kVar;
    }

    /* renamed from: a */
    public C2816k mo17474a() {
        return this.f6271b;
    }

    /* renamed from: a */
    public C2820m mo17475a(C2816k kVar) throws IOException {
        this.f6271b = kVar;
        int i = this.f6272c + 1;
        this.f6272c = i;
        return this.f6270a.get(i).mo17472a(this);
    }
}
