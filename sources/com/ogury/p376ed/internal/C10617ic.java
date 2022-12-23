package com.ogury.p376ed.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.ic */
public final class C10617ic {

    /* renamed from: a */
    private final WeakReference<C10622ig> f26802a;

    /* renamed from: b */
    private final C10660jh f26803b;

    /* renamed from: c */
    private final C10483eb f26804c;

    /* renamed from: d */
    private final long f26805d;

    private C10617ic(WeakReference<C10622ig> weakReference, C10660jh jhVar, C10483eb ebVar, long j) {
        C10765mq.m32773b(weakReference, "presageAdGatewayRef");
        C10765mq.m32773b(jhVar, "webView");
        C10765mq.m32773b(ebVar, "ad");
        this.f26802a = weakReference;
        this.f26803b = jhVar;
        this.f26804c = ebVar;
        this.f26805d = j;
    }

    /* renamed from: a */
    public final WeakReference<C10622ig> mo67612a() {
        return this.f26802a;
    }

    /* renamed from: b */
    public final C10660jh mo67613b() {
        return this.f26803b;
    }

    /* renamed from: c */
    public final C10483eb mo67614c() {
        return this.f26804c;
    }

    public /* synthetic */ C10617ic(WeakReference weakReference, C10660jh jhVar, C10483eb ebVar) {
        this(weakReference, jhVar, ebVar, System.currentTimeMillis());
    }

    /* renamed from: d */
    public final long mo67615d() {
        return this.f26805d;
    }
}
