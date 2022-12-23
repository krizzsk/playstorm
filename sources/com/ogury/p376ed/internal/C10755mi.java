package com.ogury.p376ed.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.mi */
public abstract class C10755mi implements C10789nl, Serializable {

    /* renamed from: b */
    public static final Object f26983b = C10756a.f26990a;

    /* renamed from: a */
    protected final Object f26984a;

    /* renamed from: c */
    private transient C10789nl f26985c;

    /* renamed from: d */
    private final Class f26986d;

    /* renamed from: e */
    private final String f26987e;

    /* renamed from: f */
    private final String f26988f;

    /* renamed from: g */
    private final boolean f26989g = false;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C10789nl mo67849b();

    /* renamed from: com.ogury.ed.internal.mi$a */
    static class C10756a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10756a f26990a = new C10756a();

        private C10756a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f26990a;
        }
    }

    protected C10755mi(Object obj, Class cls, String str, String str2) {
        this.f26984a = obj;
        this.f26986d = cls;
        this.f26987e = str;
        this.f26988f = str2;
    }

    /* renamed from: c */
    public final Object mo67850c() {
        return this.f26984a;
    }

    /* renamed from: d */
    public final C10789nl mo67851d() {
        C10789nl nlVar = this.f26985c;
        if (nlVar != null) {
            return nlVar;
        }
        C10789nl b = mo67849b();
        this.f26985c = b;
        return b;
    }

    /* renamed from: e */
    public final C10791nn mo67852e() {
        Class cls = this.f26986d;
        if (cls == null) {
            return null;
        }
        return this.f26989g ? C10768mt.m32778a(cls) : C10768mt.m32781b(cls);
    }

    /* renamed from: f */
    public final String mo67853f() {
        return this.f26987e;
    }

    /* renamed from: g */
    public final String mo67854g() {
        return this.f26988f;
    }
}
