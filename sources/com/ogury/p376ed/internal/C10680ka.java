package com.ogury.p376ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.ka */
final class C10680ka<T> implements C10673ju<T>, Serializable {

    /* renamed from: a */
    private C10729lj<? extends T> f26934a;

    /* renamed from: b */
    private volatile Object f26935b;

    /* renamed from: c */
    private final Object f26936c;

    private C10680ka(C10729lj<? extends T> ljVar) {
        C10765mq.m32773b(ljVar, "initializer");
        this.f26934a = ljVar;
        this.f26935b = C10682kc.f26937a;
        this.f26936c = this;
    }

    public /* synthetic */ C10680ka(C10729lj ljVar, byte b) {
        this(ljVar);
    }

    /* renamed from: a */
    public final T mo67735a() {
        T t;
        T t2 = this.f26935b;
        if (t2 != C10682kc.f26937a) {
            return t2;
        }
        synchronized (this.f26936c) {
            t = this.f26935b;
            if (t == C10682kc.f26937a) {
                C10729lj ljVar = this.f26934a;
                C10765mq.m32769a((Object) ljVar);
                t = ljVar.mo67074a();
                this.f26935b = t;
                this.f26934a = null;
            }
        }
        return t;
    }

    /* renamed from: b */
    private boolean m32633b() {
        return this.f26935b != C10682kc.f26937a;
    }

    public final String toString() {
        return m32633b() ? String.valueOf(mo67735a()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C10672jt(mo67735a());
    }
}
