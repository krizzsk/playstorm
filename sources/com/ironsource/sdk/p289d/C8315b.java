package com.ironsource.sdk.p289d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ironsource.environment.p205e.C6421a;
import com.ironsource.mediationsdk.adunit.p208a.C6590a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.C8158b;
import com.ironsource.sdk.C8313d;
import com.ironsource.sdk.C8332e;
import com.ironsource.sdk.C8335f;
import com.ironsource.sdk.controller.C8189c;
import com.ironsource.sdk.controller.C8197g;
import com.ironsource.sdk.controller.C8219j;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.p286a.C8150a;
import com.ironsource.sdk.p286a.C8154d;
import com.ironsource.sdk.p286a.C8155e;
import com.ironsource.sdk.p286a.C8156f;
import com.ironsource.sdk.p288c.C8166a;
import com.ironsource.sdk.p292f.C8338b;
import com.ironsource.sdk.p293g.C8339a;
import com.ironsource.sdk.p293g.C8342c;
import com.ironsource.sdk.p293g.C8343d;
import com.ironsource.sdk.p294h.C8357e;
import com.ironsource.sdk.p296j.C8365b;
import com.ironsource.sdk.p296j.C8366c;
import com.ironsource.sdk.p296j.C8368e;
import com.ironsource.sdk.p296j.C8369f;
import com.ironsource.sdk.p296j.p297a.C8361a;
import com.ironsource.sdk.p296j.p297a.C8362b;
import com.ironsource.sdk.p296j.p297a.C8363c;
import com.ironsource.sdk.p296j.p297a.C8364d;
import com.ironsource.sdk.service.C8385a;
import com.ironsource.sdk.service.C8387c;
import com.ironsource.sdk.service.C8388d;
import com.ironsource.sdk.utils.C8391a;
import com.ironsource.sdk.utils.C8392b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d.b */
public final class C8315b implements C8331c, C8332e, C8335f, C8361a, C8362b, C8363c, C8364d {

    /* renamed from: g */
    private static C8315b f19913g;

    /* renamed from: a */
    public C8197g f19914a;

    /* renamed from: b */
    C8368e f19915b;

    /* renamed from: c */
    String f19916c;

    /* renamed from: d */
    String f19917d;

    /* renamed from: e */
    C8219j f19918e;

    /* renamed from: f */
    private final String f19919f = IronSourceConstants.SUPERSONIC_CONFIG_NAME;

    /* renamed from: h */
    private long f19920h;

    /* renamed from: i */
    private C8388d f19921i;

    /* renamed from: j */
    private C8387c f19922j;

    /* renamed from: k */
    private boolean f19923k = false;

    /* renamed from: l */
    private C8189c f19924l;

    private C8315b(Context context) {
        m23819b(context);
    }

    private C8315b(String str, String str2, Context context) {
        this.f19916c = str;
        this.f19917d = str2;
        m23819b(context);
    }

    /* renamed from: a */
    public static synchronized C8315b m23813a(Context context) {
        C8315b a;
        synchronized (C8315b.class) {
            a = m23814a(context, 0);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C8315b m23814a(Context context, int i) {
        C8315b bVar;
        synchronized (C8315b.class) {
            Logger.m24028i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f19913g == null) {
                f19913g = new C8315b(context);
            }
            bVar = f19913g;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C8332e m23815a(String str, String str2, Context context) {
        C8315b bVar;
        synchronized (C8315b.class) {
            if (f19913g == null) {
                C8154d.m23441a(C8156f.f19419a);
                f19913g = new C8315b(str, str2, context);
            } else {
                C8388d.m24005a().mo56907b(str);
                C8388d.m24005a().mo56902a(str2);
            }
            bVar = f19913g;
        }
        return bVar;
    }

    /* renamed from: a */
    private static C8369f m23816a(C8342c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C8369f) cVar.f20025g;
    }

    /* renamed from: a */
    private void m23817a(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f19923k = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C8314a(this));
            } catch (Throwable th) {
                C8150a aVar = new C8150a();
                aVar.mo56415a("generalmessage", th.getMessage());
                C8154d.m23442a(C8156f.f19435q, (Map<String, Object>) aVar.f19410a);
            }
        }
    }

    /* renamed from: b */
    private static C8366c m23818b(C8342c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C8366c) cVar.f20025g;
    }

    /* renamed from: b */
    private void m23819b(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            C8392b.m24038a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C8357e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            C8392b.m24037a().mo56912a(SDKUtils.getSDKVersion());
            this.f19921i = m23822c(context);
            this.f19918e = new C8219j();
            C8189c cVar = new C8189c();
            this.f19924l = cVar;
            if (context instanceof Activity) {
                cVar.mo56508a((Activity) context);
            }
            this.f19914a = new C8197g(context, this.f19924l, this.f19921i, this.f19918e, C6421a.f16325a);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.m24028i("IronSourceAdsPublisherAgent", "C'tor");
            m23817a(context, networkConfiguration);
            this.f19922j = new C8387c();
            C6590a.m20031a("sdkv", (Object) "5.115");
            this.f19922j.mo56895a();
            this.f19922j.mo56896a(context);
            this.f19922j.mo56897b();
            this.f19922j.mo56899c();
            this.f19922j.mo56898b(context);
            this.f19920h = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m23820b(C8158b bVar, Map<String, String> map) {
        if (bVar.f19449h) {
            m23823c(bVar, map);
        } else {
            m23825d(bVar, map);
        }
    }

    /* renamed from: c */
    private static C8365b m23821c(C8342c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C8365b) cVar.f20025g;
    }

    /* renamed from: c */
    private C8388d m23822c(Context context) {
        C8388d a = C8388d.m24005a();
        a.mo56906b();
        a.mo56901a(context, this.f19916c, this.f19917d);
        return a;
    }

    /* renamed from: c */
    private void m23823c(final C8158b bVar, final Map<String, String> map) {
        Logger.m24024d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.f19443b);
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8342c a = C8315b.this.f19918e.mo56571a(C8343d.C8348e.Interstitial, bVar.f19443b);
                if (a != null) {
                    C8315b.this.f19914a.mo56524a(a, (Map<String, String>) map, (C8363c) C8315b.this);
                }
            }
        });
    }

    /* renamed from: d */
    private C8342c m23824d(C8343d.C8348e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f19918e.mo56571a(eVar, str);
    }

    /* renamed from: d */
    private void m23825d(final C8158b bVar, final Map<String, String> map) {
        Logger.m24024d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f19443b);
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8343d.C8348e eVar = bVar.mo56419a() ? C8343d.C8348e.Banner : C8343d.C8348e.Interstitial;
                C8219j jVar = C8315b.this.f19918e;
                C8158b bVar = bVar;
                String str = bVar.f19443b;
                String str2 = bVar.f19444c;
                HashMap hashMap = new HashMap();
                hashMap.put("instanceId", bVar.f19443b);
                hashMap.put("instanceName", bVar.f19444c);
                hashMap.put("rewarded", Boolean.toString(bVar.f19442a));
                hashMap.put("inAppBidding", Boolean.toString(bVar.f19445d));
                hashMap.put("apiVersion", "2");
                String str3 = "0";
                hashMap.put("width", bVar.f19446e != null ? Integer.toString(bVar.f19446e.f19407a) : str3);
                if (bVar.f19446e != null) {
                    str3 = Integer.toString(bVar.f19446e.f19408b);
                }
                hashMap.put("height", str3);
                hashMap.put(Constants.ScionAnalytics.PARAM_LABEL, bVar.f19446e != null ? bVar.f19446e.f19409c : "");
                hashMap.put("isBanner", Boolean.toString(bVar.mo56419a()));
                if (bVar.f19447f != null) {
                    hashMap.putAll(bVar.f19447f);
                }
                C8342c cVar = new C8342c(str, str2, hashMap, bVar.f19448g);
                jVar.mo56574a(eVar, str, cVar);
                C8150a aVar = new C8150a();
                C8150a a = aVar.mo56415a("isbiddinginstance", Boolean.valueOf(bVar.f19445d)).mo56415a("demandsourcename", bVar.f19444c).mo56415a("producttype", C8313d.m23811a(bVar));
                C8385a aVar2 = C8385a.f20107a;
                a.mo56415a("custom_c", Long.valueOf(C8385a.m23995c(bVar.f19443b)));
                C8154d.m23442a(C8156f.f19425g, (Map<String, Object>) aVar.f19410a);
                if (eVar == C8343d.C8348e.Banner) {
                    C8315b.this.f19914a.mo56527a(C8315b.this.f19916c, C8315b.this.f19917d, cVar, (C8362b) C8315b.this);
                    bVar.f19449h = true;
                    C8315b.this.f19914a.mo56523a(cVar, (Map<String, String>) map, (C8362b) C8315b.this);
                    return;
                }
                C8315b.this.f19914a.mo56528a(C8315b.this.f19916c, C8315b.this.f19917d, cVar, (C8363c) C8315b.this);
                bVar.f19449h = true;
                C8315b.this.f19914a.mo56524a(cVar, (Map<String, String>) map, (C8363c) C8315b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo56775a() {
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56540d();
            }
        });
    }

    /* renamed from: a */
    public final void mo56776a(Activity activity) {
        try {
            Logger.m24028i("IronSourceAdsPublisherAgent", "release()");
            C8391a.m24035a();
            this.f19924l.mo56509b();
            this.f19914a.mo56536b((Context) activity);
            this.f19914a.destroy();
            this.f19914a = null;
        } catch (Exception unused) {
        }
        f19913g = null;
    }

    /* renamed from: a */
    public final void mo56777a(Activity activity, C8158b bVar, Map<String, String> map) {
        this.f19924l.mo56508a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        C8385a aVar = C8385a.f20107a;
        C8385a.m23993a(bVar.f19443b, currentTimeMillis);
        C8150a aVar2 = new C8150a();
        aVar2.mo56415a("isbiddinginstance", Boolean.valueOf(bVar.f19445d)).mo56415a("demandsourcename", bVar.f19444c).mo56415a("producttype", C8313d.m23811a(bVar)).mo56415a("custom_c", Long.valueOf(currentTimeMillis));
        C8154d.m23442a(C8156f.f19423e, (Map<String, Object>) aVar2.f19410a);
        Logger.m24024d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f19443b);
        if (bVar.f19445d) {
            try {
                map.put("adm", SDKUtils.decodeString(map.get("adm")));
            } catch (Exception e) {
                C8150a a = new C8150a().mo56415a("callfailreason", e.getMessage()).mo56415a("generalmessage", bVar.f19449h ? C8338b.f19991a : C8338b.f19992b).mo56415a("isbiddinginstance", Boolean.valueOf(bVar.f19445d)).mo56415a("demandsourcename", bVar.f19444c).mo56415a("producttype", C8313d.m23811a(bVar));
                C8385a aVar3 = C8385a.f20107a;
                C8150a a2 = a.mo56415a("custom_c", Long.valueOf(C8385a.m23995c(bVar.f19443b)));
                C8385a aVar4 = C8385a.f20107a;
                C8385a.m23994b(bVar.f19443b);
                C8154d.m23442a(C8156f.f19428j, (Map<String, Object>) a2.f19410a);
                e.printStackTrace();
                Logger.m24024d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e.getMessage());
            }
            m23820b(bVar, map);
            return;
        }
        m23820b(bVar, map);
    }

    /* renamed from: a */
    public final void mo56778a(Activity activity, final Map<String, String> map) {
        if (activity != null) {
            this.f19924l.mo56508a(activity);
        }
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56532a((Map<String, String>) map, C8315b.this.f19915b);
            }
        });
    }

    /* renamed from: a */
    public final void mo56779a(C8158b bVar, final Map<String, String> map) {
        Logger.m24028i("IronSourceAdsPublisherAgent", "showAd " + bVar.f19443b);
        final C8342c a = this.f19918e.mo56571a(C8343d.C8348e.Interstitial, bVar.f19443b);
        if (a != null) {
            this.f19914a.mo56525a((Runnable) new Runnable() {
                public final void run() {
                    C8315b.this.f19914a.mo56537b(a, map, C8315b.this);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56780a(C8343d.C8348e eVar, String str) {
        C8366c b;
        C8342c d = m23824d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C8343d.C8348e.RewardedVideo) {
            C8369f a = m23816a(d);
            if (a != null) {
                a.onRVAdClosed();
            }
        } else if (eVar == C8343d.C8348e.Interstitial && (b = m23818b(d)) != null) {
            b.onInterstitialClose();
        }
    }

    /* renamed from: a */
    public final void mo56781a(C8343d.C8348e eVar, String str, C8339a aVar) {
        C8365b c;
        C8342c d = m23824d(eVar, str);
        if (d != null) {
            d.mo56846a(2);
            if (eVar == C8343d.C8348e.RewardedVideo) {
                C8369f a = m23816a(d);
                if (a != null) {
                    a.onRVInitSuccess(aVar);
                }
            } else if (eVar == C8343d.C8348e.Interstitial) {
                C8366c b = m23818b(d);
                if (b != null) {
                    b.onInterstitialInitSuccess();
                }
            } else if (eVar == C8343d.C8348e.Banner && (c = m23821c(d)) != null) {
                c.onBannerInitSuccess();
            }
        }
    }

    /* renamed from: a */
    public final void mo56782a(C8343d.C8348e eVar, String str, String str2) {
        C8365b c;
        C8342c d = m23824d(eVar, str);
        C8150a a = new C8150a().mo56415a("demandsourcename", str).mo56415a("producttype", eVar).mo56415a("callfailreason", str2);
        C8385a aVar = C8385a.f20107a;
        C8150a a2 = a.mo56415a("custom_c", Long.valueOf(C8385a.m23995c(d.f20020b)));
        C8385a aVar2 = C8385a.f20107a;
        C8385a.m23994b(d.f20020b);
        if (d != null) {
            a2.mo56415a("isbiddinginstance", Boolean.valueOf(C8155e.m23444a(d)));
            d.mo56846a(3);
            if (eVar == C8343d.C8348e.RewardedVideo) {
                C8369f a3 = m23816a(d);
                if (a3 != null) {
                    a3.onRVInitFail(str2);
                }
            } else if (eVar == C8343d.C8348e.Interstitial) {
                C8366c b = m23818b(d);
                if (b != null) {
                    b.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C8343d.C8348e.Banner && (c = m23821c(d)) != null) {
                c.onBannerInitFailed(str2);
            }
        }
        C8154d.m23442a(C8156f.f19426h, (Map<String, Object>) a2.f19410a);
    }

    /* renamed from: a */
    public final void mo56783a(C8343d.C8348e eVar, String str, String str2, JSONObject jSONObject) {
        C8365b c;
        C8342c d = m23824d(eVar, str);
        if (d != null && !TextUtils.isEmpty(str2)) {
            try {
                Logger.m24028i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + d.f20019a);
                if (eVar == C8343d.C8348e.Interstitial) {
                    C8366c b = m23818b(d);
                    if (b != null) {
                        jSONObject.put("demandSourceName", str);
                        b.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C8343d.C8348e.RewardedVideo) {
                    C8369f a = m23816a(d);
                    if (a != null) {
                        jSONObject.put("demandSourceName", str);
                        a.onRVEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C8343d.C8348e.Banner && (c = m23821c(d)) != null) {
                    jSONObject.put("demandSourceName", str);
                    if (str2.equalsIgnoreCase("impressions")) {
                        c.onBannerShowSuccess();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo56784a(final C8368e eVar) {
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56530a(C8315b.this.f19916c, C8315b.this.f19917d, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56785a(String str, int i) {
        C8369f a;
        C8342c d = m23824d(C8343d.C8348e.RewardedVideo, str);
        if (d != null && (a = m23816a(d)) != null) {
            a.onRVAdCredited(i);
        }
    }

    /* renamed from: a */
    public final void mo56786a(String str, C8166a aVar) {
        C8365b c;
        C8342c d = m23824d(C8343d.C8348e.Banner, str);
        if (d != null && (c = m23821c(d)) != null) {
            c.onBannerLoadSuccess(aVar);
        }
    }

    /* renamed from: a */
    public final void mo56787a(String str, String str2) {
        C8369f a;
        C8342c d = m23824d(C8343d.C8348e.RewardedVideo, str);
        if (d != null && (a = m23816a(d)) != null) {
            a.onRVShowFail(str2);
        }
    }

    /* renamed from: a */
    public final void mo56788a(String str, String str2, int i) {
        C8343d.C8348e productType;
        C8342c a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (productType = SDKUtils.getProductType(str)) != null && (a = this.f19918e.mo56571a(productType, str2)) != null) {
            a.f20021c = i;
        }
    }

    /* renamed from: a */
    public final void mo56789a(final String str, final String str2, final C8368e eVar) {
        this.f19916c = str;
        this.f19917d = str2;
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56530a(str, str2, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56790a(final String str, final String str2, String str3, Map<String, String> map, C8366c cVar) {
        this.f19916c = str;
        this.f19917d = str2;
        final C8342c a = this.f19918e.mo56572a(C8343d.C8348e.Interstitial, str3, map, cVar);
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56528a(str, str2, a, (C8363c) C8315b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo56791a(final String str, final String str2, String str3, Map<String, String> map, C8369f fVar) {
        this.f19916c = str;
        this.f19917d = str2;
        final C8342c a = this.f19918e.mo56572a(C8343d.C8348e.RewardedVideo, str3, map, fVar);
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56529a(str, str2, a, (C8364d) C8315b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo56792a(String str, String str2, Map<String, String> map, C8368e eVar) {
        this.f19916c = str;
        this.f19917d = str2;
        this.f19915b = eVar;
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C8368e eVar2 = eVar;
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56531a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo56793a(final Map<String, String> map, final C8368e eVar) {
        this.f19915b = eVar;
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56531a(C8315b.this.f19916c, C8315b.this.f19917d, (Map<String, String>) map, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56794a(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f19921i.mo56904a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56533a(jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final boolean mo56795a(C8158b bVar) {
        Logger.m24024d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f19443b);
        C8342c a = this.f19918e.mo56571a(C8343d.C8348e.Interstitial, bVar.f19443b);
        if (a == null) {
            return false;
        }
        return a.f20024f;
    }

    /* renamed from: a */
    public final boolean mo56796a(String str) {
        return this.f19914a.mo56539c(str);
    }

    /* renamed from: b */
    public final void mo56797b(Activity activity) {
        if (!this.f19923k) {
            mo56808d(activity);
        }
    }

    /* renamed from: b */
    public final void mo56798b(C8343d.C8348e eVar, String str) {
        C8365b c;
        C8342c d = m23824d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C8343d.C8348e.RewardedVideo) {
            C8369f a = m23816a(d);
            if (a != null) {
                a.onRVAdClicked();
            }
        } else if (eVar == C8343d.C8348e.Interstitial) {
            C8366c b = m23818b(d);
            if (b != null) {
                b.onInterstitialClick();
            }
        } else if (eVar == C8343d.C8348e.Banner && (c = m23821c(d)) != null) {
            c.onBannerClick();
        }
    }

    /* renamed from: b */
    public final void mo56799b(String str) {
        C8369f a;
        C8342c d = m23824d(C8343d.C8348e.RewardedVideo, str);
        if (d != null && (a = m23816a(d)) != null) {
            a.onRVNoMoreOffers();
        }
    }

    /* renamed from: b */
    public final void mo56800b(String str, int i) {
        C8342c d = m23824d(C8343d.C8348e.Interstitial, str);
        C8366c b = m23818b(d);
        if (d != null && b != null) {
            b.onInterstitialAdRewarded(str, i);
        }
    }

    /* renamed from: b */
    public final void mo56801b(String str, String str2) {
        C8342c d = m23824d(C8343d.C8348e.Interstitial, str);
        C8150a aVar = new C8150a();
        aVar.mo56415a("callfailreason", str2).mo56415a("demandsourcename", str);
        if (d != null) {
            C8150a a = aVar.mo56415a("producttype", C8155e.m23443a(d, C8343d.C8348e.Interstitial)).mo56415a("generalmessage", d.f20023e == 2 ? C8338b.f19991a : C8338b.f19992b).mo56415a("isbiddinginstance", Boolean.valueOf(C8155e.m23444a(d)));
            C8385a aVar2 = C8385a.f20107a;
            a.mo56415a("custom_c", Long.valueOf(C8385a.m23995c(d.f20020b)));
            C8385a aVar3 = C8385a.f20107a;
            C8385a.m23994b(d.f20020b);
            C8366c b = m23818b(d);
            if (b != null) {
                b.onInterstitialLoadFailed(str2);
            }
        }
        C8154d.m23442a(C8156f.f19424f, (Map<String, Object>) aVar.f19410a);
    }

    /* renamed from: b */
    public final void mo56802b(final JSONObject jSONObject) {
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56535a(jSONObject, (C8364d) C8315b.this);
            }
        });
    }

    /* renamed from: c */
    public final void mo56803c(Activity activity) {
        if (!this.f19923k) {
            mo56812e(activity);
        }
    }

    /* renamed from: c */
    public final void mo56804c(C8343d.C8348e eVar, String str) {
        C8369f a;
        C8342c d = m23824d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C8343d.C8348e.Interstitial) {
            C8366c b = m23818b(d);
            if (b != null) {
                b.onInterstitialOpen();
            }
        } else if (eVar == C8343d.C8348e.RewardedVideo && (a = m23816a(d)) != null) {
            a.onRVAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo56805c(String str) {
        C8342c d = m23824d(C8343d.C8348e.Interstitial, str);
        C8150a a = new C8150a().mo56415a("demandsourcename", str);
        if (d != null) {
            C8150a a2 = a.mo56415a("producttype", C8155e.m23443a(d, C8343d.C8348e.Interstitial)).mo56415a("isbiddinginstance", Boolean.valueOf(C8155e.m23444a(d)));
            C8385a aVar = C8385a.f20107a;
            a2.mo56415a("custom_c", Long.valueOf(C8385a.m23995c(d.f20020b)));
            C8385a aVar2 = C8385a.f20107a;
            C8385a.m23994b(d.f20020b);
            C8366c b = m23818b(d);
            if (b != null) {
                b.onInterstitialLoadSuccess();
            }
        }
        C8154d.m23442a(C8156f.f19429k, (Map<String, Object>) a.f19410a);
    }

    /* renamed from: c */
    public final void mo56806c(String str, String str2) {
        C8366c b;
        C8342c d = m23824d(C8343d.C8348e.Interstitial, str);
        if (d != null && (b = m23818b(d)) != null) {
            b.onInterstitialShowFailed(str2);
        }
    }

    /* renamed from: c */
    public final void mo56807c(JSONObject jSONObject) {
        final String optString = jSONObject.optString("demandSourceName");
        if (!TextUtils.isEmpty(optString)) {
            this.f19914a.mo56525a((Runnable) new Runnable() {
                public final void run() {
                    C8315b.this.f19914a.mo56526a(optString, (C8363c) C8315b.this);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo56808d(Activity activity) {
        try {
            this.f19914a.mo56543f();
            this.f19914a.mo56536b((Context) activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void mo56809d(String str) {
        C8366c b;
        C8342c d = m23824d(C8343d.C8348e.Interstitial, str);
        if (d != null && (b = m23818b(d)) != null) {
            b.onInterstitialShowSuccess();
        }
    }

    /* renamed from: d */
    public final void mo56810d(String str, String str2) {
        C8365b c;
        C8342c d = m23824d(C8343d.C8348e.Banner, str);
        if (d != null && (c = m23821c(d)) != null) {
            c.onBannerLoadFail(str2);
        }
    }

    /* renamed from: d */
    public final void mo56811d(final JSONObject jSONObject) {
        this.f19914a.mo56525a((Runnable) new Runnable() {
            public final void run() {
                C8315b.this.f19914a.mo56534a(jSONObject, (C8363c) C8315b.this);
            }
        });
    }

    /* renamed from: e */
    public final void mo56812e(Activity activity) {
        this.f19924l.mo56508a(activity);
        this.f19914a.mo56542e();
        this.f19914a.mo56522a((Context) activity);
    }
}
