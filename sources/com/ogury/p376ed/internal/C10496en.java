package com.ogury.p376ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.en */
public final class C10496en implements Serializable {

    /* renamed from: a */
    private final boolean f26540a;

    /* renamed from: b */
    private final C10497eo f26541b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10496en)) {
            return false;
        }
        C10496en enVar = (C10496en) obj;
        return this.f26540a == enVar.f26540a && this.f26541b == enVar.f26541b;
    }

    public final int hashCode() {
        boolean z = this.f26540a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f26541b.hashCode();
    }

    public final String toString() {
        return "ImpressionSettings(isPaidImpression=" + this.f26540a + ", impressionSource=" + this.f26541b + ')';
    }

    public C10496en(boolean z, C10497eo eoVar) {
        C10765mq.m32773b(eoVar, "impressionSource");
        this.f26540a = z;
        this.f26541b = eoVar;
    }

    /* renamed from: a */
    public final boolean mo67306a() {
        return this.f26540a;
    }

    public /* synthetic */ C10496en() {
        this(false, C10497eo.IMPRESSION_SOURCE_FORMAT);
    }

    /* renamed from: b */
    public final C10497eo mo67307b() {
        return this.f26541b;
    }
}
