package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q */
public class C5205q {

    /* renamed from: b */
    public static volatile C5205q f13857b;

    /* renamed from: c */
    public static final C5205q f13858c = new C5205q(true);

    /* renamed from: a */
    public final Map<C5206a, GeneratedMessageLite.C5111d<?, ?>> f13859a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.q$a */
    public static final class C5206a {

        /* renamed from: a */
        public final Object f13860a;

        /* renamed from: b */
        public final int f13861b;

        public C5206a(Object obj, int i) {
            this.f13860a = obj;
            this.f13861b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5206a)) {
                return false;
            }
            C5206a aVar = (C5206a) obj;
            if (this.f13860a == aVar.f13860a && this.f13861b == aVar.f13861b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f13860a) * 65535) + this.f13861b;
        }
    }

    public C5205q() {
        this.f13859a = new HashMap();
    }

    /* renamed from: a */
    public static C5205q m16203a() {
        C5205q qVar = f13857b;
        if (qVar == null) {
            synchronized (C5205q.class) {
                qVar = f13857b;
                if (qVar == null) {
                    Class<?> cls = C5200p.f13853a;
                    C5205q qVar2 = null;
                    if (cls != null) {
                        try {
                            qVar2 = (C5205q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (qVar2 == null) {
                        qVar2 = f13858c;
                    }
                    f13857b = qVar2;
                    qVar = qVar2;
                }
            }
        }
        return qVar;
    }

    public C5205q(boolean z) {
        this.f13859a = Collections.emptyMap();
    }
}
