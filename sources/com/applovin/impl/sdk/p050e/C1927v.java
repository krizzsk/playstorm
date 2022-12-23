package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.v */
public class C1927v extends C1928w {

    /* renamed from: a */
    private final C1829e f3578a;

    public C1927v(C1829e eVar, C1959m mVar) {
        super("TaskReportAppLovinReward", mVar);
        this.f3578a = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13373a() {
        return "2.0/cr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13374a(int i) {
        super.mo13374a(i);
        if (C2092v.m5047a()) {
            mo14147d("Failed to report reward for ad: " + this.f3578a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13375a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f3578a.getAdZone().mo13931a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f3578a.mo13985ae());
        String clCode = this.f3578a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1854c mo13376b() {
        return this.f3578a.mo13975aG();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13377b(JSONObject jSONObject) {
        if (C2092v.m5047a()) {
            mo14142a("Reported reward successfully for ad: " + this.f3578a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13378c() {
        if (C2092v.m5047a()) {
            mo14147d("No reward result was found for ad: " + this.f3578a);
        }
    }
}
