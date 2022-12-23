package com.applovin.impl.mediation.debugger.p037c;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.mediation.p032d.C1644b;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1925u;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.c.a */
public class C1666a extends C1877a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1985b.C1989c<JSONObject> f2398a;

    public C1666a(C1985b.C1989c<JSONObject> cVar, C1959m mVar) {
        super("TaskFetchMediationDebuggerInfo", mVar, true);
        this.f2398a = cVar;
    }

    /* renamed from: a */
    private JSONObject m3415a(C1959m mVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", C1645c.m3314a(mVar));
        } catch (JSONException e) {
            mo14143a("Failed to create mediation debugger request post body", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private JSONObject m3416b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", C1645c.m3314a(this.f3467b));
        } catch (JSONException e) {
            mo14143a("Failed to construct JSON body", e);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo13465a() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f3467b.mo14311a(C1857b.f3319ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3467b.mo14374z());
        }
        Map<String, Object> h = this.f3467b.mo14306V().mo14606h();
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, String.valueOf(h.get(CampaignEx.JSON_KEY_PACKAGE_NAME)));
        hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, String.valueOf(h.get(TapjoyConstants.TJC_APP_VERSION_NAME)));
        Map<String, Object> b = this.f3467b.mo14306V().mo14600b();
        hashMap.put(TapjoyConstants.TJC_PLATFORM, String.valueOf(b.get(TapjoyConstants.TJC_PLATFORM)));
        hashMap.put("os", String.valueOf(b.get("os")));
        return hashMap;
    }

    public void run() {
        C16671 r1 = new C1925u<JSONObject>(C1990c.m4570a(this.f3467b).mo14507b(ShareTarget.METHOD_POST).mo14501a(C1644b.m3310c(this.f3467b)).mo14511c(C1644b.m3311d(this.f3467b)).mo14502a(mo13465a()).mo14503a(m3415a(this.f3467b)).mo14500a(new JSONObject()).mo14506b(((Long) this.f3467b.mo14311a(C1856a.f3046g)).intValue()).mo14503a(m3416b()).mo14505a(), this.f3467b, mo14150g()) {
            /* renamed from: a */
            public void mo13362a(int i, String str, JSONObject jSONObject) {
                C1666a.this.f2398a.mo13362a(i, str, jSONObject);
            }

            /* renamed from: a */
            public void mo13364a(JSONObject jSONObject, int i) {
                C1666a.this.f2398a.mo13364a(jSONObject, i);
            }
        };
        r1.mo14230a(C1856a.f3042c);
        r1.mo14232b(C1856a.f3043d);
        this.f3467b.mo14303S().mo14205a((C1877a) r1);
    }
}
