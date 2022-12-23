package com.ogury.p376ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.jz */
public final class C10678jz<A, B> implements Serializable {

    /* renamed from: a */
    private final A f26932a;

    /* renamed from: b */
    private final B f26933b;

    /* renamed from: c */
    public final A mo67739c() {
        return this.f26932a;
    }

    /* renamed from: d */
    public final B mo67740d() {
        return this.f26933b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10678jz)) {
            return false;
        }
        C10678jz jzVar = (C10678jz) obj;
        return C10765mq.m32772a((Object) this.f26932a, (Object) jzVar.f26932a) && C10765mq.m32772a((Object) this.f26933b, (Object) jzVar.f26933b);
    }

    public final int hashCode() {
        A a = this.f26932a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f26933b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public C10678jz(A a, B b) {
        this.f26932a = a;
        this.f26933b = b;
    }

    /* renamed from: a */
    public final A mo67737a() {
        return this.f26932a;
    }

    /* renamed from: b */
    public final B mo67738b() {
        return this.f26933b;
    }

    public final String toString() {
        return "(" + this.f26932a + ", " + this.f26933b + ')';
    }
}
