package com.bytedance.sdk.component.p104b.p105a.p106a.p107a;

import android.text.TextUtils;
import com.bytedance.sdk.component.p104b.p105a.C2794b;
import com.bytedance.sdk.component.p104b.p105a.C2805d;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import com.bytedance.sdk.component.p104b.p105a.C2816k;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.c */
/* compiled from: NetClient */
public class C2788c extends C2813i {

    /* renamed from: h */
    public C2789d f6273h = new C2789d();

    public C2788c(C2813i.C2814a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public C2805d mo17477a() {
        return this.f6273h;
    }

    /* renamed from: a */
    public C2794b mo17476a(C2816k kVar) {
        kVar.mo17582a(this);
        if (kVar == null || kVar.mo17583b() == null || kVar.mo17583b().mo17556a() == null || TextUtils.isEmpty(kVar.mo17583b().mo17556a().toString())) {
            return null;
        }
        C2784a aVar = new C2784a(kVar, this.f6273h);
        this.f6273h.mo17481c().add(aVar);
        return aVar;
    }
}
