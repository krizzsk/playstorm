package com.bytedance.sdk.component.p110d.p119d;

import com.bytedance.sdk.component.p110d.C2894f;
import com.bytedance.sdk.component.p110d.p113c.C2860c;

/* renamed from: com.bytedance.sdk.component.d.d.l */
/* compiled from: RawCacheVisitor */
public class C2891l extends C2878a {
    /* renamed from: a */
    public String mo17755a() {
        return "raw_cache";
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        byte[] bArr = (byte[]) cVar.mo17703p().mo17746b(cVar.mo17704q()).mo17599a(cVar.mo17694g());
        if (bArr == null) {
            cVar.mo17687a((C2887i) new C2884f());
        } else {
            cVar.mo17687a((C2887i) new C2879b(bArr, (C2894f) null));
        }
    }
}
