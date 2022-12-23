package com.bytedance.sdk.component.p110d.p119d;

import com.bytedance.sdk.component.p110d.C2835c;
import com.bytedance.sdk.component.p110d.C2894f;
import com.bytedance.sdk.component.p110d.p113c.C2860c;

/* renamed from: com.bytedance.sdk.component.d.d.f */
/* compiled from: DiskCacheVisitor */
public class C2884f extends C2878a {
    /* renamed from: a */
    public String mo17755a() {
        return "disk_cache";
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        String g = cVar.mo17694g();
        C2835c c = cVar.mo17703p().mo17748c(cVar.mo17704q());
        if (c == null) {
            cVar.mo17687a((C2887i) new C2889k());
            return;
        }
        byte[] bArr = (byte[]) c.mo17599a(g);
        if (bArr == null) {
            cVar.mo17687a((C2887i) new C2889k());
            return;
        }
        cVar.mo17687a((C2887i) new C2879b(bArr, (C2894f) null));
        cVar.mo17703p().mo17746b(cVar.mo17704q()).mo17600a(g, bArr);
    }
}
