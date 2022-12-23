package com.ogury.core.internal;

import java.util.Iterator;

/* renamed from: com.ogury.core.internal.ao */
/* compiled from: Progressions.kt */
public class C10225ao implements C10223am, Iterable<Integer> {

    /* renamed from: a */
    public static final C10226a f25996a = new C10226a((byte) 0);

    /* renamed from: b */
    private final int f25997b;

    /* renamed from: c */
    private final int f25998c;

    /* renamed from: d */
    private final int f25999d;

    public C10225ao(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f25997b = i;
            this.f25998c = C10204a.m31002a(i, i2, i3);
            this.f25999d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int mo66781a() {
        return this.f25997b;
    }

    /* renamed from: b */
    public final int mo66782b() {
        return this.f25998c;
    }

    /* renamed from: c */
    public final int mo66783c() {
        return this.f25999d;
    }

    /* renamed from: d */
    public boolean mo66784d() {
        return this.f25999d > 0 ? this.f25997b > this.f25998c : this.f25997b < this.f25998c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10225ao)) {
            return false;
        }
        if (mo66784d() && ((C10225ao) obj).mo66784d()) {
            return true;
        }
        C10225ao aoVar = (C10225ao) obj;
        return this.f25997b == aoVar.f25997b && this.f25998c == aoVar.f25998c && this.f25999d == aoVar.f25999d;
    }

    public int hashCode() {
        if (mo66784d()) {
            return -1;
        }
        return (((this.f25997b * 31) + this.f25998c) * 31) + this.f25999d;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f25999d > 0) {
            sb = new StringBuilder();
            sb.append(this.f25997b);
            sb.append("..");
            sb.append(this.f25998c);
            sb.append(" step ");
            i = this.f25999d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f25997b);
            sb.append(" downTo ");
            sb.append(this.f25998c);
            sb.append(" step ");
            i = -this.f25999d;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: com.ogury.core.internal.ao$a */
    /* compiled from: Progressions.kt */
    public static final class C10226a {
        /* renamed from: a */
        public static int m31045a(int i, int i2) {
            if (i < 0) {
                return 0;
            }
            return i;
        }

        /* renamed from: b */
        public static int m31046b(int i, int i2) {
            return i > i2 ? i2 : i;
        }

        private C10226a() {
        }

        public /* synthetic */ C10226a(byte b) {
            this();
        }
    }

    public /* synthetic */ Iterator iterator() {
        return new C10227ap(this.f25997b, this.f25998c, this.f25999d);
    }
}
