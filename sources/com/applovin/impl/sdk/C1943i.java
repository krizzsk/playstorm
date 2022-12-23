package com.applovin.impl.sdk;

import android.os.Bundle;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.C1563c;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.network.C1983a;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.network.C2007h;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.i */
public class C1943i implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1959m f3614a;

    /* renamed from: b */
    private final AppLovinCommunicator f3615b;

    C1943i(C1959m mVar) {
        this.f3614a = mVar;
        this.f3615b = AppLovinCommunicator.getInstance(mVar.mo14297L());
        if (!mVar.mo14352e() && ((Boolean) mVar.mo14311a(C1857b.f3303eX)).booleanValue()) {
            this.f3615b.mo12593a(mVar);
            this.f3615b.subscribe((AppLovinCommunicatorSubscriber) this, C1563c.f1994a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.os.Bundle m4350b(com.applovin.impl.mediation.p028a.C1573a r4) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r4.mo13142f()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.mo13208L()
            java.lang.String r2 = "network_name"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getAdUnitId()
            java.lang.String r2 = "max_ad_unit_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.mo13162l()
            java.lang.String r2 = "third_party_ad_placement_id"
            r0.putString(r2, r1)
            com.applovin.mediation.MaxAdFormat r1 = r4.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getCreativeId()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r4.getCreativeId()
            java.lang.String r2 = "creative_id"
            r0.putString(r2, r1)
        L_0x0049:
            java.lang.String r1 = r4.getDspName()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r4.getDspName()
            java.lang.String r2 = "dsp_name"
            r0.putString(r2, r1)
        L_0x005c:
            boolean r1 = r4.mo13161k()
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_js_network_name"
        L_0x0068:
            r0.putString(r2, r1)
            goto L_0x007f
        L_0x006c:
            java.lang.String r1 = r4.mo13208L()
            java.lang.String r2 = "CUSTOM_NETWORK_SDK"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_sdk_network_name"
            goto L_0x0068
        L_0x007f:
            org.json.JSONObject r1 = r4.mo13138b()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle((org.json.JSONObject) r1)
            r0.putAll(r1)
            boolean r1 = r4 instanceof com.applovin.impl.mediation.p028a.C1574b
            if (r1 == 0) goto L_0x00c2
            com.applovin.impl.mediation.a.b r4 = (com.applovin.impl.mediation.p028a.C1574b) r4
            android.view.View r4 = r4.mo13176w()
            if (r4 == 0) goto L_0x00bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r2 = 64
            r1.append(r2)
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r4 = "N/A"
        L_0x00bd:
            java.lang.String r1 = "ad_view"
            r0.putString(r1, r4)
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1943i.m4350b(com.applovin.impl.mediation.a.a):android.os.Bundle");
    }

    /* renamed from: a */
    public void mo14256a() {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue()) {
            mo14257a(new Bundle(), "privacy_setting_updated");
        }
    }

    /* renamed from: a */
    public void mo14257a(Bundle bundle, String str) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue() && !this.f3614a.mo14352e()) {
            this.f3615b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f3614a.mo14344b(C1857b.f3302eW).contains(str)));
        }
    }

    /* renamed from: a */
    public void mo14258a(C1573a aVar) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue() && this.f3615b.hasSubscriber("max_revenue_events")) {
            Bundle b = m4350b(aVar);
            b.putAll(JsonUtils.toBundle(aVar.mo13139c()));
            b.putString(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, this.f3614a.mo14366s().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f3614a.mo14364q().getName(), b);
            mo14257a(b, "max_revenue_events");
        }
    }

    /* renamed from: a */
    public void mo14259a(C1573a aVar, String str) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue() && this.f3615b.hasSubscriber("max_ad_events")) {
            Bundle b = m4350b(aVar);
            b.putString("type", str);
            if (C2092v.m5047a()) {
                C2092v A = this.f3614a.mo14286A();
                A.mo14789b("CommunicatorService", "Sending \"max_ad_events\" message: " + b);
            }
            mo14257a(b, "max_ad_events");
        }
    }

    /* renamed from: a */
    public void mo14260a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            mo14257a(bundle, "adapter_initialization_status");
        }
    }

    /* renamed from: a */
    public void mo14261a(String str, String str2) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            mo14257a(bundle, "network_sdk_version_updated");
        }
    }

    /* renamed from: a */
    public void mo14262a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            mo14257a(bundle, "receive_http_response");
        }
    }

    /* renamed from: a */
    public void mo14263a(String str, String str2, String str3) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue()) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            mo14257a(bundle, "responses");
        }
    }

    /* renamed from: a */
    public void mo14264a(JSONObject jSONObject, boolean z) {
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3614a.mo14374z());
            bundle.putString("applovin_random_token", this.f3614a.mo14362o());
            bundle.putString("compass_random_token", this.f3614a.mo14361n());
            bundle.putString(TapjoyConstants.TJC_DEVICE_TYPE_NAME, AppLovinSdkUtils.isTablet(this.f3614a.mo14297L()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(C1645c.m3314a(this.f3614a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", new JSONObject());
            Bundle bundle2 = (Bundle) bundle.clone();
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "user_engagement_sdk_settings", new JSONObject());
            JsonUtils.putString(jSONObject3, "lsc", "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=");
            JsonUtils.putString(jSONObject3, "psp", "Y29tLmFuZHJvaWQudmVuZGluZw==");
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            mo14257a(bundle2, "user_engagement_sdk_init");
            Bundle bundle3 = (Bundle) bundle.clone();
            bundle3.putString("user_id", this.f3614a.mo14360m());
            bundle3.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject())));
            if (C2092v.m5047a()) {
                C2092v A = this.f3614a.mo14286A();
                A.mo14789b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            mo14257a(bundle3, "safedk_init");
            Bundle bundle4 = (Bundle) bundle.clone();
            bundle4.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "adjust_settings", new JSONObject())));
            mo14257a(bundle4, "adjust_init");
            Bundle bundle5 = (Bundle) bundle.clone();
            bundle5.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "discovery_settings", new JSONObject())));
            mo14257a(bundle5, "discovery_init");
        }
    }

    /* renamed from: a */
    public boolean mo14265a(String str) {
        return C1563c.f1994a.contains(str);
    }

    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        int i;
        Map<String, Object> map;
        if (((Boolean) this.f3614a.mo14311a(C1857b.f3303eX)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3614a.mo14374z());
                }
                this.f3614a.mo14305U().mo14541a(new C2007h.C2009a().mo14575c(messageData.getString("url")).mo14578d(messageData.getString("backup_url")).mo14569a(stringMap).mo14576c(map2).mo14573b(stringMap2).mo14570a(((Boolean) this.f3614a.mo14311a(C1857b.f3319ep)).booleanValue()).mo14568a(string).mo14571a());
            } else if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", ShareTarget.METHOD_POST);
                long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f3614a.mo14311a(C1857b.f3261dh)).longValue();
                int i2 = messageData2.getInt("retry_count", ((Integer) this.f3614a.mo14311a(C1857b.f3262di)).intValue());
                long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f3614a.mo14311a(C1857b.f3263dj)).longValue();
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j = millis2;
                if (ShareTarget.METHOD_GET.equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f3614a.mo14306V().mo14598a((Map<String, String>) null, false, false))));
                    }
                    i = i2;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        Map<String, Object> h = this.f3614a.mo14306V().mo14606h();
                        Map<String, Object> d = this.f3614a.mo14306V().mo14602d();
                        if (!d.containsKey("idfv") || !d.containsKey("idfv_scope")) {
                            i = i2;
                        } else {
                            i = i2;
                            int intValue = ((Integer) d.get("idfv_scope")).intValue();
                            d.remove("idfv");
                            d.remove("idfv_scope");
                            h.put("idfv", (String) d.get("idfv"));
                            h.put("idfv_scope", Integer.valueOf(intValue));
                        }
                        h.put("server_installed_at", this.f3614a.mo14311a(C1857b.f3102af));
                        h.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3614a.mo14374z());
                        map.put(TapjoyConstants.TJC_APP_PLACEMENT, h);
                        map.put("device", d);
                    } else {
                        i = i2;
                    }
                }
                this.f3614a.mo14303S().mo14206a((C1877a) new C1983a(appLovinCommunicatorMessage.getPublisherId(), C1990c.m4570a(this.f3614a).mo14501a(messageData2.getString("url")).mo14511c(messageData2.getString("backup_url")).mo14502a(stringMap3).mo14507b(string2).mo14508b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).mo14503a(map != null ? new JSONObject(map) : null).mo14506b((int) millis).mo14499a(i).mo14510c((int) j).mo14500a(new JSONObject()).mo14512c(messageData2.getBoolean("is_encoding_enabled", false)).mo14505a(), this.f3614a), C1908o.C1910a.MAIN);
            } else if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f3614a.mo14369u().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f3614a.mo14369u().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f3614a.mo14290E().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            }
        }
    }
}
