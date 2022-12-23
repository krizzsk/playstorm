package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i0 */
public final class C5161i0 implements C5147g1 {

    /* renamed from: b */
    public static final C5201p0 f13775b = new C5162a();

    /* renamed from: a */
    public final C5201p0 f13776a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i0$a */
    public class C5162a implements C5201p0 {
        /* renamed from: a */
        public boolean mo26005a(Class<?> cls) {
            return false;
        }

        /* renamed from: b */
        public C5198o0 mo26006b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i0$b */
    public static class C5163b implements C5201p0 {

        /* renamed from: a */
        public C5201p0[] f13777a;

        public C5163b(C5201p0... p0VarArr) {
            this.f13777a = p0VarArr;
        }

        /* renamed from: a */
        public boolean mo26005a(Class<?> cls) {
            for (C5201p0 a : this.f13777a) {
                if (a.mo26005a(cls)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public C5198o0 mo26006b(Class<?> cls) {
            for (C5201p0 p0Var : this.f13777a) {
                if (p0Var.mo26005a(cls)) {
                    return p0Var.mo26006b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public C5161i0() {
        this(m15802a());
    }

    /* renamed from: a */
    public static C5201p0 m15802a() {
        C5201p0 p0Var;
        C5201p0[] p0VarArr = new C5201p0[2];
        p0VarArr[0] = C5248x.f13957a;
        try {
            p0Var = (C5201p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            p0Var = f13775b;
        }
        p0VarArr[1] = p0Var;
        return new C5163b(p0VarArr);
    }

    public C5161i0(C5201p0 p0Var) {
        this.f13776a = (C5201p0) C5252z.m16435a(p0Var, "messageInfoFactory");
    }
}
