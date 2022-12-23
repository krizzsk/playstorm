package com.applovin.impl.mediation.p031c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p032d.C1643a;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.p049d.C1872g;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.utils.C2036e;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.e */
public class C1631e extends C1877a {

    /* renamed from: a */
    private static final AtomicBoolean f2248a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f2249c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MaxAdFormat f2250d;

    /* renamed from: e */
    private final JSONObject f2251e;

    /* renamed from: f */
    private final List<C1573a> f2252f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1604a.C1605a f2253g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final WeakReference<Context> f2254h;

    /* renamed from: i */
    private long f2255i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final List<MaxNetworkResponseInfo> f2256j;

    /* renamed from: com.applovin.impl.mediation.c.e$a */
    private class C1634a extends C1877a {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f2261c = SystemClock.elapsedRealtime();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f2262d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C1573a f2263e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final List<C1573a> f2264f;

        C1634a(int i, List<C1573a> list) {
            super(C1631e.this.mo14148e(), C1631e.this.f3467b);
            this.f2262d = i;
            this.f2263e = list.get(i);
            this.f2264f = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3261a(C1573a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            MaxNetworkResponseInfo.AdLoadState adLoadState2 = adLoadState;
            C1631e.this.f2256j.add(new MaxNetworkResponseInfoImpl(adLoadState2, aVar.mo13158h(), new MaxMediatedNetworkInfoImpl(C1645c.m3315a(aVar.mo13207K(), this.f3467b)), j, maxError));
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m3270e(String str) {
        }

        public void run() {
            if (C2092v.m5047a()) {
                mo14142a("Loading ad " + (this.f2262d + 1) + " of " + this.f2264f.size() + ": " + this.f2263e.mo13208L());
            }
            m3270e("started to load ad");
            Context context = (Context) C1631e.this.f2254h.get();
            this.f3467b.mo14290E().loadThirdPartyMediatedAd(C1631e.this.f2249c, this.f2263e, context instanceof Activity ? (Activity) context : this.f3467b.mo14341an(), new C1643a(C1631e.this.f2253g) {
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C1634a.this.f2261c;
                    if (C2092v.m5047a()) {
                        C1634a aVar = C1634a.this;
                        aVar.mo14142a("Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    if (C2092v.m5047a()) {
                        C1634a aVar2 = C1634a.this;
                        aVar2.m3270e("failed to load ad: " + maxError.getCode());
                    }
                    C1634a aVar3 = C1634a.this;
                    aVar3.m3261a(aVar3.f2263e, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (C1634a.this.f2262d < C1634a.this.f2264f.size() - 1) {
                        C1634a.this.f3467b.mo14303S().mo14206a((C1877a) new C1634a(C1634a.this.f2262d + 1, C1634a.this.f2264f), C1645c.m3312a(C1631e.this.f2250d));
                        return;
                    }
                    C1631e.this.m3253a((MaxError) new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }

                public void onAdLoaded(MaxAd maxAd) {
                    C1634a.this.m3270e("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C1634a.this.f2261c;
                    if (C2092v.m5047a()) {
                        C1634a aVar = C1634a.this;
                        aVar.mo14142a("Ad loaded in " + elapsedRealtime + "ms");
                    }
                    C1573a aVar2 = (C1573a) maxAd;
                    C1634a.this.m3261a(aVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, (MaxError) null);
                    int b = C1634a.this.f2262d;
                    while (true) {
                        b++;
                        if (b < C1634a.this.f2264f.size()) {
                            C1634a aVar3 = C1634a.this;
                            aVar3.m3261a((C1573a) aVar3.f2264f.get(b), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1, (MaxError) null);
                        } else {
                            C1631e.this.m3250a(aVar2);
                            return;
                        }
                    }
                }
            });
        }
    }

    C1631e(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, C1959m mVar, C1604a.C1605a aVar) {
        super("TaskProcessMediationWaterfall:" + str + CertificateUtil.DELIMITER + maxAdFormat.getLabel(), mVar);
        this.f2249c = str;
        this.f2250d = maxAdFormat;
        this.f2251e = jSONObject;
        this.f2253g = aVar;
        this.f2254h = new WeakReference<>(context);
        this.f2252f = new ArrayList(jSONObject.length());
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, CampaignUnit.JSON_KEY_ADS, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f2252f.add(C1573a.m2943a(map, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, mVar));
        }
        this.f2256j = new ArrayList(this.f2252f.size());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3250a(C1573a aVar) {
        this.f3467b.mo14291F().mo14795a(aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2255i;
        if (C2092v.m5047a()) {
            mo14144b("Waterfall loaded in " + elapsedRealtime + "ms for " + aVar.mo13208L());
        }
        aVar.mo13135a((MaxAdWaterfallInfo) new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.f2256j));
        C2043j.m4925a((MaxAdListener) this.f2253g, (MaxAd) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3253a(MaxError maxError) {
        C1872g T;
        C1871f fVar;
        if (maxError.getCode() == 204) {
            T = this.f3467b.mo14304T();
            fVar = C1871f.f3451p;
        } else if (maxError.getCode() == -5001) {
            T = this.f3467b.mo14304T();
            fVar = C1871f.f3452q;
        } else {
            T = this.f3467b.mo14304T();
            fVar = C1871f.f3453r;
        }
        T.mo14128a(fVar);
        ArrayList arrayList = new ArrayList(this.f2256j.size());
        for (MaxNetworkResponseInfo next : this.f2256j) {
            if (next.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2255i;
        if (C2092v.m5047a()) {
            mo14144b("Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl((C1573a) null, JsonUtils.getString(this.f2251e, "waterfall_name", ""), JsonUtils.getString(this.f2251e, "waterfall_test_name", ""), elapsedRealtime, this.f2256j));
        C2043j.m4931a((MaxAdListener) this.f2253g, this.f2249c, maxError);
    }

    public void run() {
        this.f2255i = SystemClock.elapsedRealtime();
        if (this.f2251e.optBoolean("is_testing", false) && !this.f3467b.mo14295J().mo13583a() && f2248a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", C1631e.this.f3467b.mo14341an());
                }
            });
        }
        if (this.f2252f.size() > 0) {
            if (C2092v.m5047a()) {
                mo14142a("Starting waterfall for " + this.f2252f.size() + " ad(s)...");
            }
            this.f3467b.mo14303S().mo14205a((C1877a) new C1634a(0, this.f2252f));
            return;
        }
        if (C2092v.m5047a()) {
            mo14145c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f2249c, this.f2250d, this.f2251e, this.f3467b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f2251e, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j);
            C16332 r5 = new Runnable() {
                public void run() {
                    C1631e.this.m3253a(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", false).booleanValue()) {
                C2036e.m4876a(millis, this.f3467b, r5);
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(r5, millis);
            }
        } else {
            m3253a((MaxError) maxErrorImpl);
        }
    }
}
