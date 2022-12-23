package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.aa */
public class C1878aa extends C1879ab {

    /* renamed from: a */
    private final C1829e f3471a;

    /* renamed from: c */
    private final AppLovinAdRewardListener f3472c;

    public C1878aa(C1829e eVar, AppLovinAdRewardListener appLovinAdRewardListener, C1959m mVar) {
        super("TaskValidateAppLovinReward", mVar);
        this.f3471a = eVar;
        this.f3472c = appLovinAdRewardListener;
    }

    /* renamed from: a */
    public String mo13373a() {
        return "2.0/vr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13374a(int i) {
        String str;
        super.mo13374a(i);
        if (i < 400 || i >= 500) {
            this.f3472c.validationRequestFailed(this.f3471a, i);
            str = "network_timeout";
        } else {
            this.f3472c.userRewardRejected(this.f3471a, Collections.emptyMap());
            str = "rejected";
        }
        this.f3471a.mo13967a(C1854c.m4011a(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13379a(C1854c cVar) {
        this.f3471a.mo13967a(cVar);
        String b = cVar.mo14050b();
        Map<String, String> a = cVar.mo14049a();
        if (b.equals("accepted")) {
            this.f3472c.userRewardVerified(this.f3471a, a);
        } else if (b.equals("quota_exceeded")) {
            this.f3472c.userOverQuota(this.f3471a, a);
        } else if (b.equals("rejected")) {
            this.f3472c.userRewardRejected(this.f3471a, a);
        } else {
            this.f3472c.validationRequestFailed(this.f3471a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13375a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f3471a.getAdZone().mo13931a());
        String clCode = this.f3471a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo13380b() {
        return this.f3471a.mo13973aE();
    }
}
