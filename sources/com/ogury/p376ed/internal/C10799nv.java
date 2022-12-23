package com.ogury.p376ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.nv */
class C10799nv extends C10798nu {

    /* renamed from: com.ogury.ed.internal.nv$a */
    public static final class C10800a implements C10772mx, Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ C10793np f27017a;

        public C10800a(C10793np npVar) {
            this.f27017a = npVar;
        }

        public final Iterator<T> iterator() {
            return this.f27017a.mo67878a();
        }
    }

    /* renamed from: a */
    public static final <T> Iterable<T> m32815a(C10793np<? extends T> npVar) {
        C10765mq.m32773b(npVar, "$this$asIterable");
        return new C10800a(npVar);
    }
}
