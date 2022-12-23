package com.applovin.impl.sdk.p050e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.p049d.C1872g;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.h */
public abstract class C1893h extends C1877a {

    /* renamed from: a */
    protected final C1828d f3497a;

    public C1893h(C1828d dVar, String str, C1959m mVar) {
        super(str, mVar);
        this.f3497a = dVar;
    }

    /* renamed from: a */
    private void m4202a(C1872g gVar) {
        long b = gVar.mo14131b(C1871f.f3438c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f3467b.mo14311a(C1857b.f3264dk)).intValue())) {
            gVar.mo14133b(C1871f.f3438c, currentTimeMillis);
            gVar.mo14134c(C1871f.f3439d);
        }
    }

    /* renamed from: i */
    private Map<String, String> m4203i() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f3497a.mo13931a());
        if (this.f3497a.mo13933c() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f3497a.mo13933c().getLabel());
        }
        if (this.f3497a.mo13934d() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f3497a.mo13934d().getLabel());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1877a mo14182a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14183a() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.f3497a.mo13931a());
        if (this.f3497a.mo13933c() != null) {
            hashMap.put("size", this.f3497a.mo13933c().getLabel());
        }
        if (this.f3497a.mo13934d() != null) {
            hashMap.put("require", this.f3497a.mo13934d().getLabel());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14184a(int i) {
        if (C2092v.m5047a()) {
            mo14147d("Unable to fetch " + this.f3497a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f3467b.mo14304T().mo14128a(C1871f.f3443h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo14185b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14186b(JSONObject jSONObject) {
        C2040h.m4905d(jSONObject, this.f3467b);
        C2040h.m4904c(jSONObject, this.f3467b);
        C2040h.m4907e(jSONObject, this.f3467b);
        C1828d.m3847a(jSONObject);
        this.f3467b.mo14303S().mo14205a(mo14182a(jSONObject));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo14187c();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1825b mo14188h() {
        return this.f3497a.mo13935e() ? C1825b.APPLOVIN_PRIMARY_ZONE : C1825b.APPLOVIN_CUSTOM_ZONE;
    }

    public void run() {
        Map<String, String> map;
        if (C2092v.m5047a()) {
            mo14142a("Fetching next ad of zone: " + this.f3497a);
        }
        if (((Boolean) this.f3467b.mo14311a(C1857b.f3233dF)).booleanValue() && Utils.isVPNConnected() && C2092v.m5047a()) {
            mo14142a("User is connected to a VPN");
        }
        C1872g T = this.f3467b.mo14304T();
        T.mo14128a(C1871f.f3436a);
        if (T.mo14131b(C1871f.f3438c) == 0) {
            T.mo14133b(C1871f.f3438c, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f3467b.mo14369u().getAndResetCustomPostBody();
            boolean booleanValue = ((Boolean) this.f3467b.mo14311a(C1857b.f3258de)).booleanValue();
            String str = ShareTarget.METHOD_POST;
            if (booleanValue) {
                JSONObject jSONObject = new JSONObject(this.f3467b.mo14306V().mo14598a(mo14183a(), false, true));
                map = new HashMap<>();
                map.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f3467b.mo14311a(C1857b.f3319ep)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3467b.mo14374z());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
            } else {
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(this.f3467b.mo14306V().mo14598a(mo14183a(), false, false));
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = ShareTarget.METHOD_GET;
                }
                map = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(mo14149f())) {
                map.putAll(this.f3467b.mo14369u().getAndResetCustomQueryParams());
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(m4203i());
            m4202a(T);
            C1990c.C1991a<T> b = C1990c.m4570a(this.f3467b).mo14501a(mo14185b()).mo14511c(mo14187c()).mo14502a(map).mo14507b(str).mo14508b((Map<String, String>) hashMap).mo14500a(new JSONObject()).mo14499a(((Integer) this.f3467b.mo14311a(C1857b.f3194cS)).intValue()).mo14504a(((Boolean) this.f3467b.mo14311a(C1857b.f3195cT)).booleanValue()).mo14509b(((Boolean) this.f3467b.mo14311a(C1857b.f3196cU)).booleanValue()).mo14506b(((Integer) this.f3467b.mo14311a(C1857b.f3193cR)).intValue());
            if (andResetCustomPostBody != null) {
                b.mo14503a(andResetCustomPostBody);
                b.mo14513d(((Boolean) this.f3467b.mo14311a(C1857b.f3327ex)).booleanValue());
            }
            C18941 r1 = new C1925u<JSONObject>(b.mo14505a(), this.f3467b) {
                /* renamed from: a */
                public void mo13362a(int i, String str, JSONObject jSONObject) {
                    C1893h.this.mo14184a(i);
                }

                /* renamed from: a */
                public void mo13364a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f3572d.mo14475a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f3572d.mo14476b());
                        C1893h.this.mo14186b(jSONObject);
                        return;
                    }
                    C1893h.this.mo14184a(i);
                }
            };
            r1.mo14230a(C1857b.f3088aR);
            r1.mo14232b(C1857b.f3089aS);
            this.f3467b.mo14303S().mo14205a((C1877a) r1);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                mo14143a("Unable to fetch ad " + this.f3497a, th);
            }
            mo14184a(0);
        }
    }
}
