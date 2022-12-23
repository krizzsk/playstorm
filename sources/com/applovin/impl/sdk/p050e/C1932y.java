package com.applovin.impl.sdk.p050e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.y */
public abstract class C1932y extends C1877a {
    protected C1932y(String str, C1959m mVar) {
        super(str, mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo13373a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13374a(int i) {
        C2040h.m4896a(i, this.f3467b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13375a(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14240a(JSONObject jSONObject, final C1985b.C1989c<JSONObject> cVar) {
        C19331 r0 = new C1925u<JSONObject>(C1990c.m4570a(this.f3467b).mo14501a(C2040h.m4893a(mo13373a(), this.f3467b)).mo14511c(C2040h.m4903b(mo13373a(), this.f3467b)).mo14502a(C2040h.m4906e(this.f3467b)).mo14507b(ShareTarget.METHOD_POST).mo14503a(jSONObject).mo14513d(((Boolean) this.f3467b.mo14311a(C1857b.f3280eA)).booleanValue()).mo14500a(new JSONObject()).mo14499a(mo14151h()).mo14505a(), this.f3467b) {
            /* renamed from: a */
            public void mo13362a(int i, String str, JSONObject jSONObject) {
                cVar.mo13362a(i, str, jSONObject);
            }

            /* renamed from: a */
            public void mo13364a(JSONObject jSONObject, int i) {
                cVar.mo13364a(jSONObject, i);
            }
        };
        r0.mo14230a(C1857b.f3090aT);
        r0.mo14232b(C1857b.f3091aU);
        this.f3467b.mo14303S().mo14205a((C1877a) r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo14151h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public JSONObject mo14241i() {
        JSONObject jSONObject = new JSONObject();
        String m = this.f3467b.mo14360m();
        if (((Boolean) this.f3467b.mo14311a(C1857b.f3272ds)).booleanValue() && StringUtils.isValidString(m)) {
            JsonUtils.putString(jSONObject, "cuid", m);
        }
        if (((Boolean) this.f3467b.mo14311a(C1857b.f3274du)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f3467b.mo14361n());
        }
        if (((Boolean) this.f3467b.mo14311a(C1857b.f3276dw)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f3467b.mo14362o());
        }
        mo13375a(jSONObject);
        return jSONObject;
    }
}
