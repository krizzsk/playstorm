package com.ogury.p376ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dy */
public class C10478dy extends C10464dr {

    /* renamed from: a */
    private final C10510ez f26473a;

    /* renamed from: a */
    public final String mo67194a() {
        return "00000000-0000-0000-0000-000000000000";
    }

    public /* synthetic */ C10478dy(Context context) {
        this(context, new C10514fa(context), new C10542fx(context), new C10510ez(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10478dy(Context context, C10514fa faVar, C10542fx fxVar, C10510ez ezVar) {
        super(context, faVar, fxVar);
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(fxVar, "coreWrapper");
        C10765mq.m32773b(ezVar, "androidDevice");
        this.f26473a = ezVar;
    }

    public Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("Api-Key", "[" + mo67198b().mo67357b() + ']');
        loadHeaders.put("Sdk-Version", "[4.2.0]");
        loadHeaders.put("Timezone", C10510ez.m31865f());
        loadHeaders.put("Connectivity", this.f26473a.mo67341j());
        loadHeaders.put("Sdk-Version-Type", CampaignUnit.JSON_KEY_ADS);
        loadHeaders.put("Sdk-Type", String.valueOf(mo67199c().mo67451b()));
        return loadHeaders;
    }
}
