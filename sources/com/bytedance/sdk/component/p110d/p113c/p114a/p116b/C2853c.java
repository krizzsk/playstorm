package com.bytedance.sdk.component.p110d.p113c.p114a.p116b;

import com.bytedance.sdk.component.p110d.C2905q;
import com.bytedance.sdk.component.p110d.p113c.p114a.C2857c;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.c */
/* compiled from: LruCountRawCache */
public class C2853c implements C2905q {

    /* renamed from: a */
    private int f6437a;

    /* renamed from: b */
    private int f6438b;

    /* renamed from: c */
    private int f6439c;

    /* renamed from: d */
    private C2857c<String, byte[]> f6440d;

    public C2853c(int i, int i2) {
        this.f6439c = i;
        this.f6437a = i2;
        this.f6440d = new C2857c<String, byte[]>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo17663b(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    /* renamed from: a */
    public boolean mo17600a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f6440d.mo17672a(str, bArr);
        return true;
    }

    /* renamed from: a */
    public byte[] mo17599a(String str) {
        return this.f6440d.mo17671a(str);
    }

    /* renamed from: b */
    public boolean mo17601b(String str) {
        return this.f6440d.mo17671a(str) != null;
    }
}
