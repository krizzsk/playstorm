package com.applovin.impl.mediation.p031c;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p032d.C1644b;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.C1935f;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.p049d.C1872g;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1925u;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.c */
public class C1627c extends C1877a {

    /* renamed from: a */
    private final String f2233a;

    /* renamed from: c */
    private final MaxAdFormat f2234c;

    /* renamed from: d */
    private final Map<String, Object> f2235d;

    /* renamed from: e */
    private final Map<String, Object> f2236e;

    /* renamed from: f */
    private final JSONArray f2237f;

    /* renamed from: g */
    private final Context f2238g;

    /* renamed from: h */
    private final C1604a.C1605a f2239h;

    public C1627c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, JSONArray jSONArray, Context context, C1959m mVar, C1604a.C1605a aVar) {
        super("TaskFetchMediatedAd " + str, mVar);
        this.f2233a = str;
        this.f2234c = maxAdFormat;
        this.f2235d = map;
        this.f2236e = map2;
        this.f2237f = jSONArray;
        this.f2238g = context;
        this.f2239h = aVar;
    }

    /* renamed from: a */
    private String m3222a() {
        return C1644b.m3306a(this.f3467b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3223a(int i, String str) {
        if (C2092v.m5047a()) {
            mo14147d("Unable to fetch " + this.f2233a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f3467b.mo14304T().mo14128a(C1871f.f3450o);
        }
        C2043j.m4931a((MaxAdListener) this.f2239h, this.f2233a, (MaxError) i == -1009 ? new MaxErrorImpl(-1009, str) : i == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(-1000, str) : new MaxErrorImpl(-1));
    }

    /* renamed from: a */
    private void m3226a(C1872g gVar) {
        long b = gVar.mo14131b(C1871f.f3438c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f3467b.mo14311a(C1857b.f3264dk)).intValue())) {
            gVar.mo14133b(C1871f.f3438c, currentTimeMillis);
            gVar.mo14134c(C1871f.f3439d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3227a(JSONObject jSONObject) {
        try {
            C2040h.m4905d(jSONObject, this.f3467b);
            C2040h.m4904c(jSONObject, this.f3467b);
            C2040h.m4907e(jSONObject, this.f3467b);
            C2040h.m4909f(jSONObject, this.f3467b);
            C1644b.m3307a(jSONObject, this.f3467b);
            C1644b.m3309b(jSONObject, this.f3467b);
            C1935f.m4330a(this.f3467b);
            if (this.f2234c != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, (String) null)) && C2092v.m5047a()) {
                C2092v.m5053i(mo14148e(), "Ad format requested does not match ad unit id's format.");
            }
            this.f3467b.mo14303S().mo14205a((C1877a) m3228b(jSONObject));
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                mo14143a("Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    /* renamed from: b */
    private C1631e m3228b(JSONObject jSONObject) {
        return new C1631e(this.f2233a, this.f2234c, this.f2235d, jSONObject, this.f2238g, this.f3467b, this.f2239h);
    }

    /* renamed from: b */
    private String m3229b() {
        return C1644b.m3308b(this.f3467b);
    }

    /* renamed from: c */
    private Map<String, String> m3230c() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f2233a);
        hashMap.put("AppLovin-Ad-Format", this.f2234c.getLabel());
        return hashMap;
    }

    /* renamed from: c */
    private void m3231c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f3467b.mo14288C().mo13602c()));
            jSONObject2.put(TapjoyConstants.TJC_INSTALLED, C1645c.m3314a(this.f3467b));
            jSONObject2.put("initialized", this.f3467b.mo14289D().mo13596c());
            jSONObject2.put("initialized_classnames", new JSONArray(this.f3467b.mo14289D().mo13595b()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f3467b.mo14288C().mo13599a()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f3467b.mo14288C().mo13601b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (C2092v.m5047a()) {
                mo14143a("Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    /* renamed from: d */
    private void m3232d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f2237f;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* renamed from: e */
    private void m3233e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f2233a);
        jSONObject2.put(FirebaseAnalytics.Param.AD_FORMAT, this.f2234c.getLabel());
        HashMap hashMap = new HashMap(this.f2236e);
        C1573a a = this.f3467b.mo14291F().mo14794a(this.f2233a);
        if (a != null) {
            hashMap.put("previous_winning_network", a.mo13208L());
            hashMap.put("previous_winning_network_name", a.getNetworkName());
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(hashMap));
        jSONObject.put("ad_info", jSONObject2);
    }

    /* renamed from: f */
    private void m3234f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f3467b.mo14290E().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && Utils.isDspDemoApp(this.f3467b.mo14297L())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    /* renamed from: g */
    private void m3235g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f3467b.mo14363p().getExtraParameters()));
    }

    /* renamed from: h */
    private JSONObject m3236h() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f3467b.mo14306V().mo14598a((Map<String, String>) null, false, true));
        m3233e(jSONObject);
        m3232d(jSONObject);
        m3231c(jSONObject);
        m3234f(jSONObject);
        m3235g(jSONObject);
        return jSONObject;
    }

    public void run() {
        if (C2092v.m5047a()) {
            mo14142a("Fetching next ad for ad unit id: " + this.f2233a + " and format: " + this.f2234c);
        }
        if (((Boolean) this.f3467b.mo14311a(C1857b.f3233dF)).booleanValue() && Utils.isVPNConnected() && C2092v.m5047a()) {
            mo14142a("User is connected to a VPN");
        }
        C1872g T = this.f3467b.mo14304T();
        T.mo14128a(C1871f.f3449n);
        if (T.mo14131b(C1871f.f3438c) == 0) {
            T.mo14133b(C1871f.f3438c, System.currentTimeMillis());
        }
        try {
            JSONObject h = m3236h();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f3467b.mo14311a(C1857b.f3319ep)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3467b.mo14374z());
            }
            if (this.f3467b.mo14295J().mo13583a()) {
                hashMap.put("test_mode", "1");
            }
            String c = this.f3467b.mo14295J().mo13586c();
            if (StringUtils.isValidString(c)) {
                hashMap.put("filter_ad_network", c);
                if (!this.f3467b.mo14295J().mo13583a()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.f3467b.mo14295J().mo13585b()) {
                    hashMap.put("force_ad_network", c);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(m3230c());
            m3226a(T);
            C16281 r1 = new C1925u<JSONObject>(C1990c.m4570a(this.f3467b).mo14507b(ShareTarget.METHOD_POST).mo14508b((Map<String, String>) hashMap2).mo14501a(m3222a()).mo14511c(m3229b()).mo14502a((Map<String, String>) hashMap).mo14503a(h).mo14513d(((Boolean) this.f3467b.mo14311a(C1856a.f3038U)).booleanValue()).mo14500a(new JSONObject()).mo14506b(((Long) this.f3467b.mo14311a(C1856a.f3045f)).intValue()).mo14499a(((Integer) this.f3467b.mo14311a(C1857b.f3194cS)).intValue()).mo14510c(((Long) this.f3467b.mo14311a(C1856a.f3044e)).intValue()).mo14505a(), this.f3467b) {
                /* renamed from: a */
                public void mo13362a(int i, String str, JSONObject jSONObject) {
                    C1627c.this.m3223a(i, str);
                }

                /* renamed from: a */
                public void mo13364a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f3572d.mo14475a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f3572d.mo14476b());
                        C1627c.this.m3227a(jSONObject);
                        return;
                    }
                    C1627c.this.m3223a(i, (String) null);
                }
            };
            r1.mo14230a(C1856a.f3042c);
            r1.mo14232b(C1856a.f3043d);
            this.f3467b.mo14303S().mo14205a((C1877a) r1);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                mo14143a("Unable to fetch ad " + this.f2233a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
