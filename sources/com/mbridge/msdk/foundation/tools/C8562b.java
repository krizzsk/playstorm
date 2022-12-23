package com.mbridge.msdk.foundation.tools;

/* renamed from: com.mbridge.msdk.foundation.tools.b */
/* compiled from: Container */
final class C8562b {

    /* renamed from: com.mbridge.msdk.foundation.tools.b$b */
    /* compiled from: Container */
    static abstract class C8564b {

        /* renamed from: a */
        int f20704a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract byte mo57748a();

        C8564b() {
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$c */
    /* compiled from: Container */
    static class C8565c extends C8564b {

        /* renamed from: b */
        boolean f20705b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 1;
        }

        C8565c(int i, boolean z) {
            this.f20704a = i;
            this.f20705b = z;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$f */
    /* compiled from: Container */
    static class C8568f extends C8564b {

        /* renamed from: b */
        int f20708b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 2;
        }

        C8568f(int i, int i2) {
            this.f20704a = i;
            this.f20708b = i2;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$e */
    /* compiled from: Container */
    static class C8567e extends C8564b {

        /* renamed from: b */
        float f20707b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 3;
        }

        C8567e(int i, float f) {
            this.f20704a = i;
            this.f20707b = f;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$g */
    /* compiled from: Container */
    static class C8569g extends C8564b {

        /* renamed from: b */
        long f20709b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 4;
        }

        C8569g(int i, long j) {
            this.f20704a = i;
            this.f20709b = j;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$d */
    /* compiled from: Container */
    static class C8566d extends C8564b {

        /* renamed from: b */
        double f20706b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 5;
        }

        C8566d(int i, double d) {
            this.f20704a = i;
            this.f20706b = d;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$j */
    /* compiled from: Container */
    static abstract class C8572j extends C8564b {

        /* renamed from: b */
        Object f20710b;

        /* renamed from: c */
        int f20711c;

        /* renamed from: d */
        int f20712d;

        /* renamed from: e */
        boolean f20713e;

        C8572j(int i, int i2, Object obj, int i3, boolean z) {
            this.f20711c = i;
            this.f20704a = i2;
            this.f20710b = obj;
            this.f20712d = i3;
            this.f20713e = z;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$i */
    /* compiled from: Container */
    static class C8571i extends C8572j {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 6;
        }

        C8571i(int i, int i2, String str, int i3, boolean z) {
            super(i, i2, str, i3, z);
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$a */
    /* compiled from: Container */
    static class C8563a extends C8572j {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 7;
        }

        C8563a(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$h */
    /* compiled from: Container */
    static class C8570h extends C8572j {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo57748a() {
            return 8;
        }

        C8570h(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }
    }
}
