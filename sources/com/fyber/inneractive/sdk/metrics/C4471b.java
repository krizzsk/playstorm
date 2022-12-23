package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.metrics.b */
public class C4471b<T extends C5291e> extends C4470a {

    /* renamed from: g */
    public static final String f11033g = String.valueOf(24);

    /* renamed from: h */
    public static final String f11034h = String.valueOf(3);

    /* renamed from: i */
    public static final String f11035i = String.valueOf(24);

    /* renamed from: j */
    public static final String f11036j = String.valueOf(3);

    /* renamed from: b */
    public final String f11037b;

    /* renamed from: c */
    public final UnitDisplayType f11038c;

    /* renamed from: d */
    public final T f11039d;

    /* renamed from: e */
    public final InneractiveAdRequest f11040e;

    /* renamed from: f */
    public final JSONArray f11041f;

    /* renamed from: com.fyber.inneractive.sdk.metrics.b$a */
    public class C4472a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4476f f11042a;

        /* renamed from: b */
        public final /* synthetic */ Map f11043b;

        public C4472a(C4476f fVar, Map map) {
            this.f11042a = fVar;
            this.f11043b = map;
        }

        public void run() {
            UnitDisplayType unitDisplayType;
            String str;
            int i;
            int i2;
            IAlog.m16699a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
            C4471b bVar = C4471b.this;
            if (bVar.f11037b != null && (unitDisplayType = bVar.f11038c) != null) {
                UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
                if (unitDisplayType == unitDisplayType2 || unitDisplayType == UnitDisplayType.MRECT || unitDisplayType.isFullscreenUnit()) {
                    IAlog.m16699a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f11042a.toString());
                    UnitDisplayType unitDisplayType3 = C4471b.this.f11038c;
                    if (unitDisplayType3 == unitDisplayType2 || unitDisplayType3 == UnitDisplayType.MRECT) {
                        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
                        C4310h hVar = iAConfigManager.f10557v.f10660b;
                        String str2 = C4471b.f11033g;
                        if (hVar.f10657a.containsKey("ad_metrics_interval_banner")) {
                            str2 = hVar.f10657a.get("ad_metrics_interval_banner");
                        }
                        C4310h hVar2 = iAConfigManager.f10557v.f10660b;
                        String str3 = C4471b.f11034h;
                        if (hVar2.f10657a.containsKey("ad_metrics_limit_banner")) {
                            str3 = hVar2.f10657a.get("ad_metrics_limit_banner");
                        }
                        i2 = C5370s.m16783a(str2, 24);
                        i = C5370s.m16783a(str3, 3);
                        str = "LastSentMetricsBanner";
                    } else {
                        IAConfigManager iAConfigManager2 = IAConfigManager.f10525J;
                        C4310h hVar3 = iAConfigManager2.f10557v.f10660b;
                        String str4 = C4471b.f11035i;
                        if (hVar3.f10657a.containsKey("ad_metrics_interval_interstitial")) {
                            str4 = hVar3.f10657a.get("ad_metrics_interval_interstitial");
                        }
                        C4310h hVar4 = iAConfigManager2.f10557v.f10660b;
                        String str5 = C4471b.f11036j;
                        if (hVar4.f10657a.containsKey("ad_metrics_limit_interstitial")) {
                            str5 = hVar4.f10657a.get("ad_metrics_limit_interstitial");
                        }
                        i2 = C5370s.m16783a(str4, 24);
                        i = C5370s.m16783a(str5, 3);
                        str = "LastSentMetricsInterstitial";
                    }
                    Application application = C5350l.f14216a;
                    if (application != null) {
                        SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
                        } catch (JSONException unused) {
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        C4471b bVar2 = C4471b.this;
                        bVar2.getClass();
                        if (IAConfigManager.f10525J.f10557v.f10660b.mo24347a(bVar2.f11032a, false) && !C4470a.m13823a(i2, i, jSONArray, copyOnWriteArrayList)) {
                            copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                            C4471b bVar3 = C4471b.this;
                            InneractiveAdRequest inneractiveAdRequest = bVar3.f11040e;
                            T t = bVar3.f11039d;
                            Map map = this.f11043b;
                            bVar3.getClass();
                            try {
                                C4567p pVar = C4567p.METRIC_MEASUREMENTS_EVENT;
                                JSONArray jSONArray2 = bVar3.f11041f;
                                C4569q.C4570a aVar = new C4569q.C4570a(t);
                                aVar.f11365c = pVar;
                                aVar.f11363a = inneractiveAdRequest;
                                aVar.f11366d = jSONArray2;
                                JSONObject jSONObject = new JSONObject();
                                for (String str6 : map.keySet()) {
                                    Object obj = map.get(str6);
                                    try {
                                        jSONObject.put(str6, obj);
                                    } catch (Exception unused2) {
                                        IAlog.m16703e("Got exception adding param to json object: %s, %s", str6, obj);
                                    }
                                }
                                aVar.f11368f.put(jSONObject);
                                aVar.mo24768a((String) null);
                            } catch (Exception unused3) {
                            }
                        }
                        sharedPreferences.edit().putString(str, new JSONArray(copyOnWriteArrayList).toString()).apply();
                        return;
                    }
                    return;
                }
                IAlog.m16699a("Unit display type %s is not supported for metric event", C4471b.this.f11038c.value());
            }
        }
    }

    public C4471b(T t, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f11039d = t;
        this.f11040e = inneractiveAdRequest;
        this.f11037b = str;
        this.f11038c = unitDisplayType;
        this.f11041f = jSONArray;
    }

    /* renamed from: a */
    public void mo24669a() {
        C4473c cVar = C4473c.f11045c;
        C4476f a = cVar.mo24671a(this.f11037b);
        Map<String, Long> j = a.mo24681j();
        if (!a.mo24672a()) {
            IAlog.m16699a("MetricCreativeReporter: Metric data not valid, data: %s", cVar.mo24671a(this.f11037b).toString());
            return;
        }
        cVar.f11046a.remove(this.f11037b);
        C5357n.m16773a(new C4472a(a, j));
    }
}
