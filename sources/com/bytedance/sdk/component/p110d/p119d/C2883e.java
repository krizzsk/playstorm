package com.bytedance.sdk.component.p110d.p119d;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p110d.C2894f;
import com.bytedance.sdk.component.p110d.p113c.C2860c;
import com.bytedance.sdk.component.p110d.p113c.C2874f;

/* renamed from: com.bytedance.sdk.component.d.d.e */
/* compiled from: DecoderVisitor */
public class C2883e extends C2878a {

    /* renamed from: a */
    private byte[] f6551a;

    /* renamed from: b */
    private C2894f f6552b;

    /* renamed from: a */
    public String mo17755a() {
        return "decode";
    }

    public C2883e(byte[] bArr, C2894f fVar) {
        this.f6551a = bArr;
        this.f6552b = fVar;
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        C2874f p = cVar.mo17703p();
        try {
            Bitmap a = p.mo17742a(cVar).mo17680a(this.f6551a);
            if (a != null) {
                cVar.mo17687a((C2887i) new C2892m(a, this.f6552b, false));
                p.mo17744a(cVar.mo17704q()).mo17600a(cVar.mo17692e(), a);
                return;
            }
            m8060a(1002, "decode failed bitmap null", (Throwable) null, cVar);
        } catch (Throwable th) {
            m8060a(1002, "decode failed:" + th.getMessage(), th, cVar);
        }
    }

    /* renamed from: a */
    private void m8060a(int i, String str, Throwable th, C2860c cVar) {
        if (this.f6552b == null) {
            cVar.mo17687a((C2887i) new C2889k());
        } else {
            cVar.mo17687a((C2887i) new C2886h(i, str, th));
        }
    }
}
