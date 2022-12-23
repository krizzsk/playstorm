package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.bz */
public final class C10387bz {

    /* renamed from: a */
    private final int f26313a;

    /* renamed from: b */
    private final int f26314b;

    /* renamed from: c */
    private final int f26315c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10387bz)) {
            return false;
        }
        C10387bz bzVar = (C10387bz) obj;
        return this.f26313a == bzVar.f26313a && this.f26314b == bzVar.f26314b && this.f26315c == bzVar.f26315c;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.f26313a) * 31) + Integer.hashCode(this.f26314b)) * 31) + Integer.hashCode(this.f26315c);
    }

    public final String toString() {
        return "OverlayPosition(gravity=" + this.f26313a + ", xMargin=" + this.f26314b + ", yMargin=" + this.f26315c + ')';
    }

    public C10387bz(int i, int i2, int i3) {
        this.f26313a = i;
        this.f26314b = i2;
        this.f26315c = i3;
    }

    /* renamed from: a */
    public final int mo67138a() {
        return this.f26313a;
    }

    /* renamed from: b */
    public final int mo67139b() {
        return this.f26314b;
    }

    /* renamed from: c */
    public final int mo67140c() {
        return this.f26315c;
    }
}
