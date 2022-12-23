package com.bytedance.sdk.component.p110d.p119d;

import android.text.TextUtils;
import com.bytedance.sdk.component.p110d.C2899k;
import com.bytedance.sdk.component.p110d.p113c.C2860c;

/* renamed from: com.bytedance.sdk.component.d.d.c */
/* compiled from: CacheKeyVisitor */
public class C2881c extends C2878a {
    /* renamed from: a */
    public String mo17755a() {
        return "generate_key";
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        if (TextUtils.isEmpty(cVar.mo17692e())) {
            C2899k d = cVar.mo17703p().mo17750d();
            cVar.mo17689b(d.mo17603a(cVar));
            cVar.mo17685a(d.mo17604b(cVar));
        }
        cVar.mo17687a((C2887i) new C2885g());
    }
}
