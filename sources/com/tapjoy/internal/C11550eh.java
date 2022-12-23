package com.tapjoy.internal;

import com.tapjoy.internal.C11556el;
import com.tapjoy.internal.C11574eo;

/* renamed from: com.tapjoy.internal.eh */
public abstract class C11550eh<E extends C11574eo> extends C11556el<E> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo72343a(int i);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo72342a(Object obj) {
        return C11573en.m33570a(((C11574eo) obj).mo72372a());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
        enVar.mo72368c(((C11574eo) obj).mo72372a());
    }

    protected C11550eh(Class<E> cls) {
        super(C11551ei.VARINT, cls);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo72344a(C11572em emVar) {
        int c = emVar.mo72362c();
        C11574eo a = mo72343a(c);
        if (a != null) {
            return a;
        }
        throw new C11556el.C11571a(c, this.f27969a);
    }
}
