package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.fyber.inneractive.sdk.protobuf.b1 */
public final class C5124b1 {

    /* renamed from: c */
    public static final C5124b1 f13725c = new C5124b1();

    /* renamed from: a */
    public final C5147g1 f13726a = new C5161i0();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C5141f1<?>> f13727b = new ConcurrentHashMap();

    /* renamed from: a */
    public <T> C5141f1<T> mo25837a(Class<T> cls) {
        C5141f1<T> f1Var;
        Class<?> cls2;
        Charset charset = C5252z.f13963a;
        if (cls != null) {
            C5141f1<T> f1Var2 = (C5141f1) this.f13727b.get(cls);
            if (f1Var2 != null) {
                return f1Var2;
            }
            C5161i0 i0Var = (C5161i0) this.f13726a;
            i0Var.getClass();
            Class<?> cls3 = C5150h1.f13762a;
            if (GeneratedMessageLite.class.isAssignableFrom(cls) || (cls2 = C5150h1.f13762a) == null || cls2.isAssignableFrom(cls)) {
                C5198o0 b = i0Var.f13776a.mo26006b(cls);
                if (!b.mo25871c()) {
                    boolean z = true;
                    if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                        if (b.mo25869a() != C5121a1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C5245v0 v0Var = C5249x0.f13959b;
                            C5143g0 g0Var = C5143g0.f13757b;
                            C5193m1<?, ?> m1Var = C5150h1.f13765d;
                            C5210r<?> rVar = C5225t.f13874a;
                            f1Var = C5226t0.m16324a(b, v0Var, g0Var, (C5193m1) m1Var, (C5210r) C5225t.f13874a, C5195n0.f13846b);
                        } else {
                            f1Var = C5226t0.m16324a(b, C5249x0.f13959b, C5143g0.f13757b, (C5193m1) C5150h1.f13765d, (C5210r) null, C5195n0.f13846b);
                        }
                    } else {
                        if (b.mo25869a() != C5121a1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C5245v0 v0Var2 = C5249x0.f13958a;
                            C5143g0 g0Var2 = C5143g0.f13756a;
                            C5193m1<?, ?> m1Var2 = C5150h1.f13763b;
                            C5210r<?> rVar2 = C5225t.f13875b;
                            if (rVar2 != null) {
                                f1Var = C5226t0.m16324a(b, v0Var2, g0Var2, (C5193m1) m1Var2, (C5210r) rVar2, C5195n0.f13845a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            f1Var = C5226t0.m16324a(b, C5249x0.f13958a, C5143g0.f13756a, (C5193m1) C5150h1.f13764c, (C5210r) null, C5195n0.f13845a);
                        }
                    }
                } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    C5193m1<?, ?> m1Var3 = C5150h1.f13765d;
                    C5210r<?> rVar3 = C5225t.f13874a;
                    f1Var = new C5241u0<>(m1Var3, C5225t.f13874a, b.mo25870b());
                } else {
                    C5193m1<?, ?> m1Var4 = C5150h1.f13763b;
                    C5210r<?> rVar4 = C5225t.f13875b;
                    if (rVar4 != null) {
                        f1Var = new C5241u0<>(m1Var4, rVar4, b.mo25870b());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                C5141f1<T> putIfAbsent = this.f13727b.putIfAbsent(cls, f1Var);
                return putIfAbsent != null ? putIfAbsent : f1Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
