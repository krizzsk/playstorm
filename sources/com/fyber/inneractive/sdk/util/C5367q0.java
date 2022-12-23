package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.q0 */
public class C5367q0 {

    /* renamed from: a */
    public int f14238a;

    /* renamed from: b */
    public int f14239b;

    public C5367q0(int i, int i2) {
        this.f14238a = i;
        this.f14239b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5367q0.class != obj.getClass()) {
            return false;
        }
        C5367q0 q0Var = (C5367q0) obj;
        if (this.f14238a != q0Var.f14238a) {
            return false;
        }
        if (this.f14239b == q0Var.f14239b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f14238a * 31) + this.f14239b;
    }
}
