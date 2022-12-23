package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ji */
final class C11810ji {

    /* renamed from: a */
    final byte[] f28832a;

    /* renamed from: b */
    int f28833b;

    /* renamed from: c */
    int f28834c;

    /* renamed from: d */
    boolean f28835d;

    /* renamed from: e */
    boolean f28836e;

    /* renamed from: f */
    C11810ji f28837f;

    /* renamed from: g */
    C11810ji f28838g;

    C11810ji() {
        this.f28832a = new byte[8192];
        this.f28836e = true;
        this.f28835d = false;
    }

    C11810ji(C11810ji jiVar) {
        this(jiVar.f28832a, jiVar.f28833b, jiVar.f28834c);
        jiVar.f28835d = true;
    }

    C11810ji(byte[] bArr, int i, int i2) {
        this.f28832a = bArr;
        this.f28833b = i;
        this.f28834c = i2;
        this.f28836e = false;
        this.f28835d = true;
    }

    /* renamed from: a */
    public final C11810ji mo72793a() {
        C11810ji jiVar = this.f28837f;
        if (jiVar == this) {
            jiVar = null;
        }
        C11810ji jiVar2 = this.f28838g;
        jiVar2.f28837f = this.f28837f;
        this.f28837f.f28838g = jiVar2;
        this.f28837f = null;
        this.f28838g = null;
        return jiVar;
    }

    /* renamed from: a */
    public final C11810ji mo72794a(C11810ji jiVar) {
        jiVar.f28838g = this;
        jiVar.f28837f = this.f28837f;
        this.f28837f.f28838g = jiVar;
        this.f28837f = jiVar;
        return jiVar;
    }

    /* renamed from: a */
    public final void mo72795a(C11810ji jiVar, int i) {
        if (jiVar.f28836e) {
            int i2 = jiVar.f28834c;
            if (i2 + i > 8192) {
                if (!jiVar.f28835d) {
                    int i3 = jiVar.f28833b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = jiVar.f28832a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        jiVar.f28834c -= jiVar.f28833b;
                        jiVar.f28833b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f28832a, this.f28833b, jiVar.f28832a, jiVar.f28834c, i);
            jiVar.f28834c += i;
            this.f28833b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
