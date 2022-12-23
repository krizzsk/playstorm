package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.nf */
public class C10781nf implements C10772mx, Iterable<Integer> {

    /* renamed from: a */
    public static final C10782a f27007a = new C10782a((byte) 0);

    /* renamed from: b */
    private final int f27008b;

    /* renamed from: c */
    private final int f27009c;

    /* renamed from: d */
    private final int f27010d = 1;

    public C10781nf(int i, int i2) {
        this.f27008b = i;
        this.f27009c = C10727lh.m32742a(i, i2);
    }

    /* renamed from: a */
    public final int mo67867a() {
        return this.f27008b;
    }

    /* renamed from: b */
    public final int mo67868b() {
        return this.f27009c;
    }

    /* renamed from: c */
    public final int mo67869c() {
        return this.f27010d;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C10721lb iterator() {
        return new C10783ng(this.f27008b, this.f27009c, this.f27010d);
    }

    /* renamed from: d */
    public boolean mo67870d() {
        return this.f27010d > 0 ? this.f27008b > this.f27009c : this.f27008b < this.f27009c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10781nf)) {
            return false;
        }
        if (mo67870d() && ((C10781nf) obj).mo67870d()) {
            return true;
        }
        C10781nf nfVar = (C10781nf) obj;
        return this.f27008b == nfVar.f27008b && this.f27009c == nfVar.f27009c && this.f27010d == nfVar.f27010d;
    }

    public int hashCode() {
        if (mo67870d()) {
            return -1;
        }
        return (((this.f27008b * 31) + this.f27009c) * 31) + this.f27010d;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f27010d > 0) {
            sb = new StringBuilder();
            sb.append(this.f27008b);
            sb.append("..");
            sb.append(this.f27009c);
            sb.append(" step ");
            i = this.f27010d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f27008b);
            sb.append(" downTo ");
            sb.append(this.f27009c);
            sb.append(" step ");
            i = -this.f27010d;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: com.ogury.ed.internal.nf$a */
    public static final class C10782a {
        private C10782a() {
        }

        public /* synthetic */ C10782a(byte b) {
            this();
        }
    }
}
