package com.ogury.p376ed.internal;

import android.content.Context;
import com.smaato.sdk.video.vast.model.C11286Ad;
import p394io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.m */
public final class C10746m {

    /* renamed from: a */
    private final Context f26978a;

    /* renamed from: b */
    private final AdConfig f26979b;

    /* renamed from: c */
    private final C10491ej f26980c;

    public C10746m(Context context, AdConfig adConfig, C10491ej ejVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        this.f26978a = context;
        this.f26979b = adConfig;
        this.f26980c = ejVar;
    }

    /* renamed from: a */
    public final void mo67844a(String str) {
        C10765mq.m32773b(str, "campaignId");
        C10537ft.m32041a(this.f26979b, str);
    }

    /* renamed from: b */
    public final void mo67845b(String str) {
        C10765mq.m32773b(str, "creativeId");
        C10537ft.m32042b(this.f26979b, str);
    }

    /* renamed from: a */
    public final C10706l mo67843a() {
        return new C10706l(this.f26978a, this.f26979b, this.f26980c);
    }
}
