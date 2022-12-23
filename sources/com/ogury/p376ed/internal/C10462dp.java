package com.ogury.p376ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dp */
public final class C10462dp {

    /* renamed from: a */
    private final Context f26437a;

    /* renamed from: b */
    private final C10510ez f26438b;

    /* renamed from: c */
    private final C10514fa f26439c;

    /* renamed from: d */
    private final C10542fx f26440d;

    private C10462dp(Context context, C10510ez ezVar, C10514fa faVar, C10542fx fxVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(ezVar, "androidDevice");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(fxVar, "coreWrapper");
        this.f26437a = context;
        this.f26438b = ezVar;
        this.f26439c = faVar;
        this.f26440d = fxVar;
    }

    public /* synthetic */ C10462dp(Context context) {
        this(context, new C10510ez(context), new C10514fa(context), new C10542fx(context));
    }

    /* renamed from: a */
    public final JSONObject mo67195a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectivity", this.f26438b.mo67341j());
        jSONObject.put("at", this.f26438b.mo67338g());
        jSONObject.put("build", 30105);
        jSONObject.put("version", "4.2.0");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f26439c.mo67357b());
        jSONObject.put("apps_publishers", jSONArray);
        return jSONObject;
    }
}
