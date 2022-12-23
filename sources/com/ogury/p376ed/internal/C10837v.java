package com.ogury.p376ed.internal;

import android.app.Application;

/* renamed from: com.ogury.ed.internal.v */
public final class C10837v {

    /* renamed from: a */
    private final C10337ap f27061a;

    public C10837v(C10337ap apVar) {
        C10765mq.m32773b(apVar, "interstitialShowCommand");
        this.f27061a = apVar;
    }

    /* renamed from: a */
    public final C10833u mo67890a(Application application) {
        C10765mq.m32773b(application, "application");
        return new C10833u(application, this.f27061a);
    }
}
