package com.applovin.impl.mediation.p031c;

import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.p050e.C1879ab;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.g */
public class C1637g extends C1879ab {

    /* renamed from: a */
    private final C1575c f2267a;

    public C1637g(C1575c cVar, C1959m mVar) {
        super("TaskValidateMaxReward", mVar);
        this.f2267a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13373a() {
        return "2.0/mvr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13374a(int i) {
        super.mo13374a(i);
        this.f2267a.mo13188a(C1854c.m4011a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13379a(C1854c cVar) {
        this.f2267a.mo13188a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13375a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f2267a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f2267a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f2267a.mo13222Z());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.f2267a.getFormat().getLabel());
        String D = this.f2267a.mo13183D();
        if (!StringUtils.isValidString(D)) {
            D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", D);
        String C = this.f2267a.mo13182C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo13380b() {
        return this.f2267a.mo13184E();
    }
}
