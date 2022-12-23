package com.inmobi.media;

import com.google.common.base.Ascii;

/* renamed from: com.inmobi.media.bn */
/* compiled from: RawAsset */
public final class C5895bn {

    /* renamed from: a */
    final byte f14885a;

    /* renamed from: b */
    final String f14886b;

    public C5895bn(byte b, String str) {
        this.f14885a = b;
        this.f14886b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5895bn)) {
            return false;
        }
        C5895bn bnVar = (C5895bn) obj;
        return this.f14885a == bnVar.f14885a && this.f14886b.equals(bnVar.f14886b);
    }

    public final int hashCode() {
        return (this.f14885a * Ascii.f17947US) + this.f14886b.hashCode();
    }
}
