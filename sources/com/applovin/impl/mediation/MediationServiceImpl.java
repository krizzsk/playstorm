package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.mediation.p028a.C1577e;
import com.applovin.impl.mediation.p028a.C1578f;
import com.applovin.impl.mediation.p028a.C1579g;
import com.applovin.impl.mediation.p028a.C1581h;
import com.applovin.impl.mediation.p031c.C1629d;
import com.applovin.impl.mediation.p031c.C1636f;
import com.applovin.impl.mediation.p031c.C1637g;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f2022a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2092v f2023b;

    /* renamed from: c */
    private final AtomicReference<JSONObject> f2024c = new AtomicReference<>();

    /* renamed from: com.applovin.impl.mediation.MediationServiceImpl$a */
    public class C1569a implements C1604a.C1605a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b */
        private final C1573a f2046b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1604a.C1605a f2047c;

        public C1569a(C1573a aVar, C1604a.C1605a aVar2) {
            this.f2046b = aVar;
            this.f2047c = aVar2;
        }

        /* renamed from: a */
        public void mo13122a(C1604a.C1605a aVar) {
            this.f2047c = aVar;
        }

        /* renamed from: a */
        public void mo13123a(MaxAd maxAd, Bundle bundle) {
            this.f2046b.mo13168r();
            this.f2046b.mo13134a(bundle);
            MediationServiceImpl.this.m2920a(this.f2046b);
            C2043j.m4925a((MaxAdListener) this.f2047c, maxAd);
        }

        /* renamed from: b */
        public void mo13124b(MaxAd maxAd, Bundle bundle) {
            if (C2092v.m5047a()) {
                MediationServiceImpl.this.f2023b.mo14789b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f2046b, this.f2047c);
            this.f2046b.mo13134a(bundle);
            MediationServiceImpl.this.f2022a.mo14334ag().mo14259a(this.f2046b, "DID_DISPLAY");
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f2022a.mo14332ae().mo14643a((Object) maxAd);
                MediationServiceImpl.this.f2022a.mo14338ak().mo14381a((Object) maxAd);
            }
            C2043j.m4951b((MaxAdListener) this.f2047c, maxAd);
        }

        /* renamed from: c */
        public void mo13125c(final MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((C1573a) maxAd).mo13137a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.f2022a.mo14334ag().mo14259a((C1573a) maxAd, "DID_HIDE");
            long j = 0;
            if (maxAd instanceof C1575c) {
                j = ((C1575c) maxAd).mo13180A();
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f2022a.mo14332ae().mo14646b((Object) maxAd);
                        MediationServiceImpl.this.f2022a.mo14338ak().mo14380a();
                    }
                    C2043j.m4956c(C1569a.this.f2047c, maxAd);
                }
            }, j);
        }

        /* renamed from: d */
        public void mo13126d(MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((C1573a) maxAd).mo13137a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.m2921a(this.f2046b, this.f2047c);
            C2043j.m4959d(this.f2047c, maxAd);
        }

        public void onAdClicked(MaxAd maxAd) {
            mo13126d(maxAd, (Bundle) null);
        }

        public void onAdCollapsed(MaxAd maxAd) {
            C2043j.m4967h(this.f2047c, maxAd);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.m2932b(this.f2046b, maxError, this.f2047c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof C1575c)) {
                ((C1575c) maxAd).mo13185F();
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            mo13124b(maxAd, (Bundle) null);
        }

        public void onAdExpanded(MaxAd maxAd) {
            C2043j.m4965g(this.f2047c, maxAd);
        }

        public void onAdHidden(MaxAd maxAd) {
            mo13125c(maxAd, (Bundle) null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f2046b.mo13168r();
            MediationServiceImpl.this.m2922a(this.f2046b, maxError, (MaxAdListener) this.f2047c);
        }

        public void onAdLoaded(MaxAd maxAd) {
            mo13123a(maxAd, (Bundle) null);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C2043j.m4963f(this.f2047c, maxAd);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C2043j.m4961e(this.f2047c, maxAd);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C2043j.m4928a((MaxAdListener) this.f2047c, maxAd, maxReward);
            MediationServiceImpl.this.f2022a.mo14303S().mo14206a((C1877a) new C1636f((C1575c) maxAd, MediationServiceImpl.this.f2022a), C1908o.C1910a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(C1959m mVar) {
        this.f2022a = mVar;
        this.f2023b = mVar.mo14286A();
        mVar.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    /* renamed from: a */
    private C1730g m2912a(C1575c cVar) {
        C1730g g = cVar.mo13143g();
        if (g != null) {
            return g;
        }
        this.f2022a.mo14332ae().mo14644a(false);
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2023b;
            vVar.mo14792d("MediationService", "Failed to show " + cVar + ": adapter not found");
            C2092v.m5053i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        }
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2920a(C1573a aVar) {
        this.f2022a.mo14334ag().mo14259a(aVar, "DID_LOAD");
        if (aVar.mo13140d().endsWith("load")) {
            this.f2022a.mo14334ag().mo14258a(aVar);
        }
        long o = aVar.mo13165o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(o));
        m2928a("load", (Map<String, String>) hashMap, (C1578f) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2921a(C1573a aVar, C1604a.C1605a aVar2) {
        this.f2022a.mo14334ag().mo14259a(aVar, "DID_CLICKED");
        this.f2022a.mo14334ag().mo14259a(aVar, "DID_CLICK");
        if (aVar.mo13140d().endsWith("click")) {
            this.f2022a.mo14334ag().mo14258a(aVar);
            C2043j.m4933a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
        }
        m2926a("mclick", (C1578f) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2922a(C1573a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        m2925a(maxError, aVar);
        destroyAd(aVar);
        C2043j.m4931a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2923a(C1575c cVar, C1604a.C1605a aVar) {
        this.f2022a.mo14332ae().mo14644a(false);
        m2924a(cVar, (MaxAdListener) aVar);
        if (C2092v.m5047a()) {
            this.f2023b.mo14789b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, aVar);
    }

    /* renamed from: a */
    private void m2924a(C1575c cVar, MaxAdListener maxAdListener) {
        long longValue = ((Long) this.f2022a.mo14311a(C1856a.f3023F)).longValue();
        if (longValue > 0) {
            final C1575c cVar2 = cVar;
            final long j = longValue;
            final MaxAdListener maxAdListener2 = maxAdListener;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (!cVar2.mo13169s().get()) {
                        String str = "Ad (" + cVar2.mo13209M() + ") has not been displayed after " + j + "ms. Failing ad display...";
                        if (C2092v.m5047a()) {
                            C2092v.m5053i("MediationService", str);
                        }
                        MediationServiceImpl.this.m2932b(cVar2, new MaxErrorImpl(-1, str), maxAdListener2);
                        MediationServiceImpl.this.f2022a.mo14332ae().mo14646b((Object) cVar2);
                        MediationServiceImpl.this.f2022a.mo14338ak().mo14380a();
                    }
                }
            }, longValue);
        }
    }

    /* renamed from: a */
    private void m2925a(MaxError maxError, C1573a aVar) {
        long o = aVar.mo13165o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(o));
        m2929a("mlerr", (Map<String, String>) hashMap, maxError, (C1578f) aVar);
    }

    /* renamed from: a */
    private void m2926a(String str, C1578f fVar) {
        m2929a(str, (Map<String, String>) Collections.EMPTY_MAP, (MaxError) null, fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2927a(String str, C1581h hVar, C1730g gVar) {
        HashMap hashMap = new HashMap(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", gVar.mo13622i(), hashMap);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", gVar.mo13621h(), hashMap);
        m2929a("serr", (Map<String, String>) hashMap, (MaxError) new MaxErrorImpl(str), (C1578f) hVar);
    }

    /* renamed from: a */
    private void m2928a(String str, Map<String, String> map, C1578f fVar) {
        m2929a(str, map, (MaxError) null, fVar);
    }

    /* renamed from: a */
    private void m2929a(String str, Map<String, String> map, MaxError maxError, C1578f fVar) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("{PLACEMENT}", StringUtils.emptyIfNull(fVar.getPlacement()));
        hashMap.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(fVar.mo13222Z()));
        if (fVar instanceof C1573a) {
            hashMap.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((C1573a) fVar).getCreativeId()));
        }
        this.f2022a.mo14303S().mo14206a((C1877a) new C1629d(str, hashMap, maxError, fVar, this.f2022a), C1908o.C1910a.MEDIATION_POSTBACKS);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2932b(C1573a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f2022a.mo14334ag().mo14259a(aVar, "DID_FAIL_DISPLAY");
        processAdDisplayErrorPostback(maxError, aVar);
        if (aVar.mo13169s().compareAndSet(false, true)) {
            C2043j.m4926a(maxAdListener, (MaxAd) aVar, maxError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2933b(C1575c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f2022a.mo14303S().mo14206a((C1877a) new C1637g(cVar, this.f2022a), C1908o.C1910a.MEDIATION_REWARD);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final C1581h hVar, Context context, final C1579g.C1580a aVar) {
        String str;
        C2092v vVar;
        String str2;
        StringBuilder sb;
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar != null) {
            final C1730g a = this.f2022a.mo14288C().mo13598a(hVar, true);
            if (a != null) {
                Activity an = context instanceof Activity ? (Activity) context : this.f2022a.mo14341an();
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m2911a(hVar, maxAdFormat);
                if (((Boolean) this.f2022a.mo14311a(C1856a.f3035R)).booleanValue()) {
                    this.f2022a.mo14289D().mo13590a((C1578f) hVar, an);
                }
                C15673 r1 = new MaxSignalCollectionListener() {
                    public void onSignalCollected(String str) {
                        aVar.mo13253a(C1579g.m3049a(hVar, a, str));
                        a.mo13623j();
                    }

                    public void onSignalCollectionFailed(String str) {
                        MediationServiceImpl.this.m2927a(str, hVar, a);
                        aVar.mo13253a(C1579g.m3051b(hVar, a, str));
                        a.mo13623j();
                    }
                };
                if (!hVar.mo13133a()) {
                    if (C2092v.m5047a()) {
                        vVar = this.f2023b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for adapter: ";
                    }
                    a.mo13611a((MaxAdapterSignalCollectionParameters) a2, hVar, an, (MaxSignalCollectionListener) r1);
                    return;
                } else if (this.f2022a.mo14289D().mo13594a((C1578f) hVar)) {
                    if (C2092v.m5047a()) {
                        vVar = this.f2023b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for now-initialized adapter: ";
                    }
                    a.mo13611a((MaxAdapterSignalCollectionParameters) a2, hVar, an, (MaxSignalCollectionListener) r1);
                    return;
                } else {
                    if (C2092v.m5047a()) {
                        C2092v vVar2 = this.f2023b;
                        vVar2.mo14793e("MediationService", "Skip collecting signal for not-initialized adapter: " + a.mo13617d());
                    }
                    str = "Adapter not initialized yet";
                }
                sb.append(str2);
                sb.append(a.mo13617d());
                vVar.mo14789b("MediationService", sb.toString());
                a.mo13611a((MaxAdapterSignalCollectionParameters) a2, hVar, an, (MaxSignalCollectionListener) r1);
                return;
            }
            str = "Could not load adapter";
            aVar.mo13253a(C1579g.m3050a(hVar, str));
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof C1573a) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f2023b;
                vVar.mo14791c("MediationService", "Destroying " + maxAd);
            }
            C1573a aVar = (C1573a) maxAd;
            C1730g g = aVar.mo13143g();
            if (g != null) {
                g.mo13623j();
                aVar.mo13170t();
            }
            this.f2022a.mo14287B().mo14139c(aVar.mo13142f());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f2024c.getAndSet((Object) null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, C1604a.C1605a aVar) {
        String str3 = str;
        C1604a.C1605a aVar2 = aVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar2 != null) {
            if (C2092v.m5047a() && TextUtils.isEmpty(this.f2022a.mo14367t())) {
                C2092v.m5053i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
            }
            if (C2092v.m5047a() && !this.f2022a.mo14351d()) {
                C2092v.m5052h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
            }
            this.f2022a.mo14314a();
            if (str.length() != 16 && !str.startsWith("test_mode") && !this.f2022a.mo14374z().startsWith("05TMD") && C2092v.m5047a()) {
                C2092v.m5053i("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
            }
            MaxAdFormat maxAdFormat2 = maxAdFormat;
            if (this.f2022a.mo14327a(maxAdFormat)) {
                if (C2092v.m5047a()) {
                    C2092v.m5053i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                }
                C2043j.m4931a((MaxAdListener) aVar2, str, (MaxError) new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                return;
            }
            this.f2022a.mo14294I().mo13381a(str, str2, maxAdFormat, map, map2, context, aVar);
        } else {
            throw new IllegalArgumentException("No listener specified");
        }
    }

    public void loadThirdPartyMediatedAd(String str, C1573a aVar, Activity activity, C1604a.C1605a aVar2) {
        if (aVar != null) {
            if (C2092v.m5047a()) {
                this.f2023b.mo14789b("MediationService", "Loading " + aVar + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f2022a.mo14334ag().mo14259a(aVar, "WILL_LOAD");
            C1730g a = this.f2022a.mo14288C().mo13597a((C1578f) aVar);
            if (a != null) {
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m2909a(aVar);
                if (((Boolean) this.f2022a.mo14311a(C1856a.f3036S)).booleanValue()) {
                    this.f2022a.mo14289D().mo13590a((C1578f) aVar, activity);
                }
                C1573a a3 = aVar.mo13132a(a);
                a.mo13613a(str, a3);
                a3.mo13166p();
                a.mo13614a(str, a2, a3, activity, new C1569a(a3, aVar2));
                return;
            }
            String str2 = "Failed to load " + aVar + ": adapter not loaded";
            if (C2092v.m5047a()) {
                C2092v.m5053i("MediationService", str2);
            }
            m2922a(aVar, (MaxError) new MaxErrorImpl(-5001, str2), (MaxAdListener) aVar2);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c = this.f2022a.mo14332ae().mo14648c();
            if (c instanceof C1573a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (C1573a) c);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, C1573a aVar) {
        m2929a("mierr", (Map<String, String>) Collections.EMPTY_MAP, maxError, (C1578f) aVar);
    }

    public void processAdLossPostback(C1573a aVar, Float f) {
        String f2 = f != null ? f.toString() : "";
        HashMap hashMap = new HashMap(1);
        hashMap.put("{MBR}", f2);
        m2928a("mloss", (Map<String, String>) hashMap, (C1578f) aVar);
    }

    public void processAdapterInitializationPostback(C1578f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        m2929a("minit", (Map<String, String>) hashMap, (MaxError) new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(C1573a aVar, C1604a.C1605a aVar2) {
        if (aVar.mo13140d().endsWith("cimp")) {
            this.f2022a.mo14334ag().mo14258a(aVar);
            C2043j.m4933a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
        }
        m2926a("mcimp", (C1578f) aVar);
    }

    public void processRawAdImpressionPostback(C1573a aVar, C1604a.C1605a aVar2) {
        this.f2022a.mo14334ag().mo14259a(aVar, "WILL_DISPLAY");
        if (aVar.mo13140d().endsWith("mimp")) {
            this.f2022a.mo14334ag().mo14258a(aVar);
            C2043j.m4933a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
        }
        HashMap hashMap = new HashMap(1);
        if (aVar instanceof C1575c) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((C1575c) aVar).mo13192y()));
        }
        m2928a("mimp", (Map<String, String>) hashMap, (C1578f) aVar);
    }

    public void processViewabilityAdImpressionPostback(C1577e eVar, long j, C1604a.C1605a aVar) {
        if (eVar.mo13140d().endsWith("vimp")) {
            this.f2022a.mo14334ag().mo14258a((C1573a) eVar);
            C2043j.m4933a((MaxAdRevenueListener) aVar, (MaxAd) eVar);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar.mo13203G()));
        m2928a("mvimp", (Map<String, String>) hashMap, (C1578f) eVar);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f2024c.set(jSONObject);
    }

    public void showFullscreenAd(C1575c cVar, Activity activity, C1604a.C1605a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null) {
            this.f2022a.mo14332ae().mo14644a(true);
            final C1730g a = m2912a(cVar);
            long z = cVar.mo13193z();
            if (C2092v.m5047a()) {
                C2092v vVar = this.f2023b;
                vVar.mo14791c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + z + "ms...");
            }
            final C1575c cVar2 = cVar;
            final Activity activity2 = activity;
            final C1604a.C1605a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    MediationServiceImpl.this.m2933b(cVar2);
                    a.mo13608a((C1573a) cVar2, activity2);
                    MediationServiceImpl.this.m2923a(cVar2, aVar2);
                }
            }, z);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    public void showFullscreenAd(C1575c cVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, C1604a.C1605a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null) {
            this.f2022a.mo14332ae().mo14644a(true);
            final C1730g a = m2912a(cVar);
            long z = cVar.mo13193z();
            if (C2092v.m5047a()) {
                C2092v vVar = this.f2023b;
                vVar.mo14791c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + z + "ms...");
            }
            final C1575c cVar2 = cVar;
            final ViewGroup viewGroup2 = viewGroup;
            final Lifecycle lifecycle2 = lifecycle;
            final Activity activity2 = activity;
            final C1604a.C1605a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    MediationServiceImpl.this.m2933b(cVar2);
                    a.mo13609a((C1573a) cVar2, viewGroup2, lifecycle2, activity2);
                    MediationServiceImpl.this.m2923a(cVar2, aVar2);
                }
            }, z);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }
}
