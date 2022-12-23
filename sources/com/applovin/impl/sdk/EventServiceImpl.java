package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.network.C2007h;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventServiceImpl implements AppLovinEventService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f2821a;

    /* renamed from: b */
    private final Map<String, Object> f2822b;

    /* renamed from: c */
    private final AtomicBoolean f2823c = new AtomicBoolean();

    public EventServiceImpl(C1959m mVar) {
        this.f2821a = mVar;
        if (((Boolean) mVar.mo14311a(C1857b.f3154be)).booleanValue()) {
            this.f2822b = JsonUtils.toStringObjectMap((String) this.f2821a.mo14342b(C1859d.f3359t, JsonUtils.EMPTY_JSON), new HashMap());
            return;
        }
        this.f2822b = new HashMap();
        mVar.mo14318a(C1859d.f3359t, JsonUtils.EMPTY_JSON);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m3737a() {
        return ((String) this.f2821a.mo14311a(C1857b.f3092aV)) + "4.0/pix";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m3740a(C2021p pVar, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        boolean contains = this.f2821a.mo14344b(C1857b.f3152bc).contains(pVar.mo14617a());
        hashMap.put("AppLovin-Event", contains ? pVar.mo14617a() : "postinstall");
        if (!contains) {
            hashMap.put("AppLovin-Sub-Event", pVar.mo14617a());
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m3741a(C2021p pVar, boolean z) {
        boolean contains = this.f2821a.mo14344b(C1857b.f3152bc).contains(pVar.mo14617a());
        Map<String, Object> a = this.f2821a.mo14306V().mo14598a((Map<String, String>) null, z, false);
        a.put("event", contains ? pVar.mo14617a() : "postinstall");
        a.put("event_id", pVar.mo14620d());
        a.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(pVar.mo14619c()));
        if (!contains) {
            a.put("sub_event", pVar.mo14617a());
        }
        return Utils.stringifyObjectMap(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m3742b() {
        return ((String) this.f2821a.mo14311a(C1857b.f3093aW)) + "4.0/pix";
    }

    /* renamed from: c */
    private void m3745c() {
        if (((Boolean) this.f2821a.mo14311a(C1857b.f3154be)).booleanValue()) {
            this.f2821a.mo14318a(C1859d.f3359t, CollectionUtils.toJsonString(this.f2822b, JsonUtils.EMPTY_JSON));
        }
    }

    public Map<String, Object> getSuperProperties() {
        return new HashMap(this.f2822b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f2823c.compareAndSet(false, true)) {
            this.f2821a.mo14371w().trackEvent("landing");
        }
    }

    public void setSuperProperty(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (obj == null) {
                this.f2822b.remove(str);
            } else {
                List<String> b = this.f2821a.mo14344b(C1857b.f3153bd);
                if (Utils.objectIsOfType(obj, b, this.f2821a)) {
                    this.f2822b.put(str, Utils.sanitizeSuperProperty(obj, this.f2821a));
                } else if (C2092v.m5047a()) {
                    C2092v.m5053i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b);
                    return;
                } else {
                    return;
                }
            }
            m3745c();
        } else if (C2092v.m5047a()) {
            C2092v.m5053i("AppLovinEventService", "Super property key cannot be null or empty");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap(1);
        }
        hashMap.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, hashMap);
    }

    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, (Map<String, String>) null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        if (C2092v.m5047a()) {
            C2092v A = this.f2821a.mo14286A();
            A.mo14789b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final C2021p pVar = new C2021p(str, map, this.f2822b);
        try {
            this.f2821a.mo14303S().mo14206a((C1877a) new C1934z(this.f2821a, new Runnable() {
                public void run() {
                    EventServiceImpl.this.f2821a.mo14305U().mo14541a(C2007h.m4678o().mo14575c(EventServiceImpl.this.m3737a()).mo14578d(EventServiceImpl.this.m3742b()).mo14569a((Map<String, String>) EventServiceImpl.this.m3741a(pVar, false)).mo14573b((Map<String, String>) EventServiceImpl.this.m3740a(pVar, (Map<String, String>) map2)).mo14576c(pVar.mo14618b()).mo14574b(((Boolean) EventServiceImpl.this.f2821a.mo14311a(C1857b.f3328ey)).booleanValue()).mo14570a(((Boolean) EventServiceImpl.this.f2821a.mo14311a(C1857b.f3319ep)).booleanValue()).mo14571a());
                }
            }), C1908o.C1910a.BACKGROUND);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v A2 = this.f2821a.mo14286A();
                A2.mo14790b("AppLovinEventService", "Unable to track event: " + pVar, th);
            }
        }
    }

    public void trackEventSynchronously(String str) {
        if (C2092v.m5047a()) {
            C2092v A = this.f2821a.mo14286A();
            A.mo14789b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        C2021p pVar = new C2021p(str, new HashMap(), this.f2822b);
        this.f2821a.mo14305U().mo14541a(C2007h.m4678o().mo14575c(m3737a()).mo14578d(m3742b()).mo14569a(m3741a(pVar, true)).mo14573b(m3740a(pVar, (Map<String, String>) null)).mo14576c(pVar.mo14618b()).mo14574b(((Boolean) this.f2821a.mo14311a(C1857b.f3328ey)).booleanValue()).mo14570a(((Boolean) this.f2821a.mo14311a(C1857b.f3319ep)).booleanValue()).mo14571a());
    }

    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        }
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v.m5049c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            }
        }
        trackEvent("iap", hashMap);
    }
}
