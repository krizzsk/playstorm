package com.ogury.p376ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.du */
public final class C10468du extends C10478dy {

    /* renamed from: a */
    private final C10463dq f26452a;

    public /* synthetic */ C10468du(Context context, C10463dq dqVar) {
        this(context, new C10514fa(context), new C10542fx(context), new C10510ez(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10468du(Context context, C10514fa faVar, C10542fx fxVar, C10510ez ezVar, C10463dq dqVar) {
        super(context, faVar, fxVar, ezVar);
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(fxVar, "coreWrapper");
        C10765mq.m32773b(ezVar, "androidDevice");
        C10765mq.m32773b(dqVar, "configurableRequestFieldPermission");
        this.f26452a = dqVar;
    }

    public final Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        String id = this.f26452a.mo67197b() ? mo67199c().mo67450a().getId() : "00000000-0000-0000-0000-000000000000";
        C10765mq.m32770a((Object) id, "if (configurableRequestF…er.NO_DEVICE_ID\n        }");
        loadHeaders.put("User", id);
        return loadHeaders;
    }
}
