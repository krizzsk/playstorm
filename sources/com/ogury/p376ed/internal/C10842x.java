package com.ogury.p376ed.internal;

import android.content.Context;
import com.smaato.sdk.video.vast.model.C11286Ad;
import p394io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.x */
public final class C10842x {

    /* renamed from: a */
    private final Context f27074a;

    public C10842x(Context context) {
        C10765mq.m32773b(context, "context");
        this.f27074a = context;
    }

    /* renamed from: a */
    public final C10706l mo67897a(AdConfig adConfig, C10491ej ejVar) {
        C10765mq.m32773b(adConfig, "adConfig");
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        return new C10706l(this.f27074a, adConfig, ejVar);
    }
}
