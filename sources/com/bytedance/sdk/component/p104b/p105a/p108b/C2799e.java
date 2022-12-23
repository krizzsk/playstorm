package com.bytedance.sdk.component.p104b.p105a.p108b;

/* renamed from: com.bytedance.sdk.component.b.a.b.e */
/* compiled from: Segment */
final class C2799e {

    /* renamed from: a */
    final byte[] f6294a;

    /* renamed from: b */
    int f6295b;

    /* renamed from: c */
    int f6296c;

    /* renamed from: d */
    boolean f6297d;

    /* renamed from: e */
    boolean f6298e;

    /* renamed from: f */
    C2799e f6299f;

    /* renamed from: g */
    C2799e f6300g;

    C2799e() {
        this.f6294a = new byte[8192];
        this.f6298e = true;
        this.f6297d = false;
    }

    C2799e(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f6294a = bArr;
        this.f6295b = i;
        this.f6296c = i2;
        this.f6297d = z;
        this.f6298e = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2799e mo17550a() {
        this.f6297d = true;
        return new C2799e(this.f6294a, this.f6295b, this.f6296c, true, false);
    }

    /* renamed from: b */
    public final C2799e mo17552b() {
        C2799e eVar = this.f6299f;
        if (eVar == this) {
            eVar = null;
        }
        C2799e eVar2 = this.f6300g;
        if (eVar2 != null) {
            eVar2.f6299f = this.f6299f;
        }
        C2799e eVar3 = this.f6299f;
        if (eVar3 != null) {
            eVar3.f6300g = this.f6300g;
        }
        this.f6299f = null;
        this.f6300g = null;
        return eVar;
    }

    /* renamed from: a */
    public final C2799e mo17551a(C2799e eVar) {
        eVar.f6300g = this;
        eVar.f6299f = this.f6299f;
        this.f6299f.f6300g = eVar;
        this.f6299f = eVar;
        return eVar;
    }
}
