package com.ogury.p376ed.internal;

import android.app.Application;

/* renamed from: com.ogury.ed.internal.bt */
public final class C10377bt {

    /* renamed from: a */
    private final C10337ap f26286a;

    public C10377bt(C10337ap apVar) {
        C10765mq.m32773b(apVar, "interstitialShowCommand");
        this.f26286a = apVar;
    }

    /* renamed from: a */
    public final C10374bs mo67118a(Application application, C10393cd cdVar, C10403ck ckVar) {
        C10765mq.m32773b(application, "application");
        C10765mq.m32773b(cdVar, "publisherActivityFilter");
        C10765mq.m32773b(ckVar, "publisherFragmentFilter");
        return new C10374bs(application, new C10385bx(cdVar, ckVar), this.f26286a);
    }
}
