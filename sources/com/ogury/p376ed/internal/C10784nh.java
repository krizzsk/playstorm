package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.nh */
public final class C10784nh extends C10781nf {

    /* renamed from: b */
    public static final C10785a f27015b = new C10785a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C10784nh f27016c = new C10784nh(1, 0);

    public C10784nh(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: e */
    public final Integer mo67876e() {
        return Integer.valueOf(mo67867a());
    }

    /* renamed from: f */
    public final Integer mo67877f() {
        return Integer.valueOf(mo67868b());
    }

    /* renamed from: d */
    public final boolean mo67870d() {
        return mo67867a() > mo67868b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10784nh)) {
            return false;
        }
        if (mo67870d() && ((C10784nh) obj).mo67870d()) {
            return true;
        }
        C10784nh nhVar = (C10784nh) obj;
        return mo67867a() == nhVar.mo67867a() && mo67868b() == nhVar.mo67868b();
    }

    public final int hashCode() {
        if (mo67870d()) {
            return -1;
        }
        return (mo67867a() * 31) + mo67868b();
    }

    public final String toString() {
        return mo67867a() + ".." + mo67868b();
    }

    /* renamed from: com.ogury.ed.internal.nh$a */
    public static final class C10785a {
        private C10785a() {
        }

        public /* synthetic */ C10785a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C10784nh m32809a() {
            return C10784nh.f27016c;
        }
    }
}
