package com.ogury.p376ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.iv */
public final class C10643iv {

    /* renamed from: a */
    private final Context f26858a;

    /* renamed from: b */
    private final C10647iy f26859b;

    /* renamed from: c */
    private final C10729lj<C10684ke> f26860c;

    public C10643iv(Context context, C10647iy iyVar, C10729lj<C10684ke> ljVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(iyVar, "mraidViewCommands");
        this.f26858a = context;
        this.f26859b = iyVar;
        this.f26860c = ljVar;
    }

    /* renamed from: a */
    public final C10644iw mo67656a(C10660jh jhVar) {
        C10765mq.m32773b(jhVar, "mraidWebView");
        C10644iw iwVar = new C10644iw(this.f26858a, jhVar.getMraidCommandExecutor(), this.f26859b, C10577gz.f26704a, C10586hg.f26712a, new C10514fa(this.f26858a), new C10510ez(this.f26858a));
        iwVar.mo67657a(this.f26860c);
        return iwVar;
    }
}
