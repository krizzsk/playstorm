package com.applovin.impl.mediation.p031c;

import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.p050e.C1928w;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.f */
public class C1636f extends C1928w {

    /* renamed from: a */
    private final C1575c f2266a;

    public C1636f(C1575c cVar, C1959m mVar) {
        super("TaskReportMaxReward", mVar);
        this.f2266a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13373a() {
        return "2.0/mcr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13374a(int i) {
        super.mo13374a(i);
        if (C2092v.m5047a()) {
            mo14142a("Failed to report reward for mediated ad: " + this.f2266a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13375a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f2266a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f2266a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f2266a.mo13222Z());
        String D = this.f2266a.mo13183D();
        if (!StringUtils.isValidString(D)) {
            D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", D);
        String C = this.f2266a.mo13182C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1854c mo13376b() {
        return this.f2266a.mo13186G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13377b(JSONObject jSONObject) {
        mo14142a("Reported reward successfully for mediated ad: " + this.f2266a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13378c() {
        if (C2092v.m5047a()) {
            mo14147d("No reward result was found for mediated ad: " + this.f2266a);
        }
    }
}
