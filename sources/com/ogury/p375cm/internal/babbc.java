package com.ogury.p375cm.internal;

import java.io.Serializable;

/* renamed from: com.ogury.cm.internal.babbc */
public final class babbc<A, B> implements Serializable {

    /* renamed from: a */
    private final A f25906a;

    /* renamed from: b */
    private final B f25907b;

    public babbc(A a, B b) {
        this.f25906a = a;
        this.f25907b = b;
    }

    /* renamed from: a */
    public final A mo66667a() {
        return this.f25906a;
    }

    /* renamed from: b */
    public final B mo66668b() {
        return this.f25907b;
    }

    /* renamed from: c */
    public final A mo66669c() {
        return this.f25906a;
    }

    /* renamed from: d */
    public final B mo66670d() {
        return this.f25907b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof babbc)) {
            return false;
        }
        babbc babbc = (babbc) obj;
        return bbabc.m30942a((Object) this.f25906a, (Object) babbc.f25906a) && bbabc.m30942a((Object) this.f25907b, (Object) babbc.f25907b);
    }

    public final int hashCode() {
        A a = this.f25906a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f25907b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.f25906a + ", " + this.f25907b + ')';
    }
}
