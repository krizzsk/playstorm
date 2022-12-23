package com.applovin.impl.sdk.p050e;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2012o;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.b */
class C1881b extends C1877a {
    C1881b(C1959m mVar) {
        super("TaskApiSubmitData", mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4152a(JSONObject jSONObject) {
        try {
            JSONObject a = C2040h.m4895a(jSONObject);
            this.f3467b.mo14296K().mo14063a((C1857b<?>) C1857b.f3067X, (Object) a.getString("device_id"));
            this.f3467b.mo14296K().mo14063a((C1857b<?>) C1857b.f3069Z, (Object) a.getString("device_token"));
            this.f3467b.mo14296K().mo14063a((C1857b<?>) C1857b.f3097aa, (Object) Long.valueOf(a.getLong("publisher_id")));
            C2040h.m4905d(a, this.f3467b);
            C2040h.m4907e(a, this.f3467b);
            String string = JsonUtils.getString(a, "latest_version", "");
            if (!TextUtils.isEmpty(string) && !AppLovinSdk.VERSION.equals(string) && C2092v.m5047a()) {
                String str = "Current SDK version (" + AppLovinSdk.VERSION + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                if (JsonUtils.valueExists(a, "sdk_update_message")) {
                    str = JsonUtils.getString(a, "sdk_update_message", str);
                }
                C2092v.m5052h("AppLovinSdk", str);
            }
            this.f3467b.mo14304T().mo14132b();
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                mo14143a("Unable to parse API response", th);
            }
        }
    }

    /* renamed from: b */
    private void m4153b(JSONObject jSONObject) throws JSONException {
        C2012o V = this.f3467b.mo14306V();
        Map<String, Object> d = V.mo14602d();
        Utils.renameKeyInObjectMap(TapjoyConstants.TJC_PLATFORM, "type", d);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d);
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(d));
        Map<String, Object> h = V.mo14606h();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", h);
        Utils.renameKeyInObjectMap("ia", "installed_at", h);
        jSONObject.put("app_info", new JSONObject(h));
    }

    /* renamed from: c */
    private void m4154c(JSONObject jSONObject) {
        C18821 r0 = new C1925u<JSONObject>(C1990c.m4570a(this.f3467b).mo14501a(C2040h.m4893a("2.0/device", this.f3467b)).mo14511c(C2040h.m4903b("2.0/device", this.f3467b)).mo14502a(C2040h.m4906e(this.f3467b)).mo14507b(ShareTarget.METHOD_POST).mo14503a(jSONObject).mo14513d(((Boolean) this.f3467b.mo14311a(C1857b.f3326ew)).booleanValue()).mo14500a(new JSONObject()).mo14499a(((Integer) this.f3467b.mo14311a(C1857b.f3197cV)).intValue()).mo14505a(), this.f3467b) {
            /* renamed from: a */
            public void mo13362a(int i, String str, JSONObject jSONObject) {
                C2040h.m4896a(i, this.f3467b);
            }

            /* renamed from: a */
            public void mo13364a(JSONObject jSONObject, int i) {
                C1881b.this.m4152a(jSONObject);
            }
        };
        r0.mo14230a(C1857b.f3090aT);
        r0.mo14232b(C1857b.f3091aU);
        this.f3467b.mo14303S().mo14205a((C1877a) r0);
    }

    public void run() {
        try {
            if (C2092v.m5047a()) {
                mo14144b("Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            m4153b(jSONObject);
            m4154c(jSONObject);
        } catch (JSONException e) {
            if (C2092v.m5047a()) {
                mo14143a("Unable to build JSON message with collected data", e);
            }
        }
    }
}
