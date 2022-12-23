package com.ogury.p376ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.dz */
public final class C10479dz extends C10464dr {

    /* renamed from: a */
    private final C10463dq f26474a;

    public /* synthetic */ C10479dz(Context context, C10463dq dqVar) {
        this(context, new C10514fa(context), new C10542fx(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10479dz(Context context, C10514fa faVar, C10542fx fxVar, C10463dq dqVar) {
        super(context, faVar, fxVar);
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(fxVar, "coreWrapper");
        C10765mq.m32773b(dqVar, "configurableRequestFieldPermission");
        this.f26474a = dqVar;
    }

    /* renamed from: a */
    public final String mo67194a() {
        if (!this.f26474a.mo67197b()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        String id = mo67199c().mo67450a().getId();
        C10765mq.m32770a((Object) id, "{\n            coreWrapper.getAaid().id\n        }");
        return id;
    }
}
