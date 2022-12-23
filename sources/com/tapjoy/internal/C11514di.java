package com.tapjoy.internal;

import com.tapjoy.internal.C11508de;
import java.util.Collections;

/* renamed from: com.tapjoy.internal.di */
public final class C11514di implements C11485ci, C11508de.C11509a {

    /* renamed from: c */
    private static C11514di f27867c;

    /* renamed from: a */
    public float f27868a = 0.0f;

    /* renamed from: b */
    public C11486cj f27869b;

    /* renamed from: d */
    private final C11487ck f27870d;

    /* renamed from: e */
    private final C11484ch f27871e;

    /* renamed from: f */
    private C11507dd f27872f;

    private C11514di(C11487ck ckVar, C11484ch chVar) {
        this.f27870d = ckVar;
        this.f27871e = chVar;
    }

    /* renamed from: a */
    public static C11514di m33422a() {
        if (f27867c == null) {
            f27867c = new C11514di(new C11487ck(), new C11484ch());
        }
        return f27867c;
    }

    /* renamed from: a */
    public final void mo72303a(boolean z) {
        if (z) {
            C11533dx.m33468a();
            C11533dx.m33472b();
            return;
        }
        C11533dx.m33468a();
        C11533dx.m33474c();
    }

    /* renamed from: a */
    public final void mo72276a(float f) {
        this.f27868a = f;
        if (this.f27872f == null) {
            this.f27872f = C11507dd.m33405a();
        }
        for (T t : Collections.unmodifiableCollection(this.f27872f.f27852b)) {
            t.f27819c.mo72315a(f);
        }
    }
}
