package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1497b;
import com.applovin.impl.adview.activity.p027b.C1440a;
import com.applovin.impl.sdk.network.C2007h;
import com.applovin.impl.sdk.p046ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p046ad.C1835f;
import com.applovin.impl.sdk.p049d.C1865a;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1899j;
import com.applovin.impl.sdk.p050e.C1900k;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class AppLovinAdServiceImpl implements AppLovinAdService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f2772a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2092v f2773b;

    /* renamed from: c */
    private final Handler f2774c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Map<C1828d, C1781b> f2775d;

    /* renamed from: e */
    private final Object f2776e = new Object();

    /* renamed from: f */
    private final Map<String, String> f2777f = new HashMap();

    /* renamed from: g */
    private final AtomicReference<JSONObject> f2778g = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$a */
    private class C1780a implements AppLovinAdLoadListener {

        /* renamed from: b */
        private final C1781b f2788b;

        private C1780a(C1781b bVar) {
            this.f2788b = bVar;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            HashSet<AppLovinAdLoadListener> hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            C1828d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof C1835f)) {
                AppLovinAdServiceImpl.this.f2772a.mo14310Z().mo14053a(appLovinAdImpl);
                appLovinAd = new C1835f(adZone, AppLovinAdServiceImpl.this.f2772a);
            }
            synchronized (this.f2788b.f2789a) {
                hashSet = new HashSet<>(this.f2788b.f2791c);
                this.f2788b.f2791c.clear();
                this.f2788b.f2790b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m3724a(appLovinAd, a);
            }
        }

        public void failedToReceiveAd(int i) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.f2788b.f2789a) {
                hashSet = new HashSet<>(this.f2788b.f2791c);
                this.f2788b.f2791c.clear();
                this.f2788b.f2790b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m3714a(i, a);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$b */
    private static class C1781b {

        /* renamed from: a */
        final Object f2789a;

        /* renamed from: b */
        boolean f2790b;

        /* renamed from: c */
        final Collection<AppLovinAdLoadListener> f2791c;

        private C1781b() {
            this.f2789a = new Object();
            this.f2791c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f2790b + ", pendingAdListeners=" + this.f2791c + '}';
        }
    }

    AppLovinAdServiceImpl(C1959m mVar) {
        this.f2772a = mVar;
        this.f2773b = mVar.mo14286A();
        HashMap hashMap = new HashMap(5);
        this.f2775d = hashMap;
        hashMap.put(C1828d.m3850g(), new C1781b());
        this.f2775d.put(C1828d.m3851h(), new C1781b());
        this.f2775d.put(C1828d.m3852i(), new C1781b());
        this.f2775d.put(C1828d.m3853j(), new C1781b());
        this.f2775d.put(C1828d.m3854k(), new C1781b());
    }

    /* renamed from: a */
    private Uri m3709a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            if (!C2092v.m5047a()) {
                return null;
            }
            C2092v A = this.f2772a.mo14286A();
            A.mo14792d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private C1781b m3710a(C1828d dVar) {
        C1781b bVar;
        synchronized (this.f2776e) {
            bVar = this.f2775d.get(dVar);
            if (bVar == null) {
                bVar = new C1781b();
                this.f2775d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private String m3712a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f2773b;
                vVar.mo14790b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m3713a(String str, long j, long j2, List<Long> list, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i != C1940h.f3603a) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C1940h.m4342a(i)));
        }
        return appendQueryParameter.build().toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3714a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2774c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C2092v.m5049c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m3715a(Uri uri, C1829e eVar, AppLovinAdView appLovinAdView, C1497b bVar) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.f2772a)) {
            C2043j.m4955c(bVar.mo12894g(), (AppLovinAd) eVar, appLovinAdView);
        }
        bVar.mo12902o();
    }

    /* renamed from: a */
    private void m3716a(Uri uri, C1829e eVar, AppLovinAdView appLovinAdView, C1497b bVar, Context context, C1959m mVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri a = m3709a(uri, "primaryUrl");
            List<Uri> b = m3728b(uri, "primaryTrackingUrl");
            Uri a2 = m3709a(uri, "fallbackUrl");
            List<Uri> b2 = m3728b(uri, "fallbackTrackingUrl");
            if (a != null || a2 != null) {
                if (!m3725a(a, "primary", b, eVar, appLovinAdView, bVar, context, mVar)) {
                    m3725a(a2, "backup", b2, eVar, appLovinAdView, bVar, context, mVar);
                }
                if (bVar != null) {
                    bVar.mo12902o();
                }
            } else if (C2092v.m5047a()) {
                mVar.mo14286A().mo14793e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
            }
        } else if (C2092v.m5047a()) {
            mVar.mo14286A().mo14793e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    /* renamed from: a */
    private void m3717a(Uri uri, C1829e eVar, C1497b bVar, final C1440a aVar) {
        if (C2092v.m5048a(this.f2772a)) {
            C2092v vVar = this.f2773b;
            vVar.mo14789b("AppLovinAdService", "Forwarding click " + uri);
        }
        eVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f2772a.mo14363p().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (aVar != null) {
                this.f2774c.post(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            if (C2092v.m5048a(AppLovinAdServiceImpl.this.f2772a)) {
                                AppLovinAdServiceImpl.this.f2773b.mo14789b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            aVar.mo12776h();
                        }
                    }
                });
            } else if (bVar != null && !Utils.isBML(eVar.getSize())) {
                if (C2092v.m5048a(this.f2772a)) {
                    this.f2773b.mo14789b("AppLovinAdService", "Closing ad after forwarding click");
                }
                bVar.mo12899l();
            }
        }
    }

    /* renamed from: a */
    private void m3720a(C1828d dVar, C1780a aVar) {
        AppLovinAdImpl a = this.f2772a.mo14310Z().mo14052a(dVar);
        if (a != null) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f2773b;
                vVar.mo14789b("AppLovinAdService", "Using pre-loaded ad: " + a + " for " + dVar);
            }
            aVar.adReceived(a);
            return;
        }
        m3723a((C1877a) new C1900k(dVar, aVar, this.f2772a));
    }

    /* renamed from: a */
    private void m3721a(C1828d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        } else if (appLovinAdLoadListener != null) {
            if (C2092v.m5047a()) {
                C2092v A = this.f2772a.mo14286A();
                A.mo14789b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
            }
            C1781b a = m3710a(dVar);
            synchronized (a.f2789a) {
                a.f2791c.add(appLovinAdLoadListener);
                if (!a.f2790b) {
                    a.f2790b = true;
                    m3720a(dVar, new C1780a(a));
                } else if (C2092v.m5047a()) {
                    this.f2773b.mo14789b("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    /* renamed from: a */
    private void m3722a(C1865a aVar) {
        if (StringUtils.isValidString(aVar.mo14092a())) {
            this.f2772a.mo14305U().mo14541a(C2007h.m4678o().mo14575c(aVar.mo14092a()).mo14578d(StringUtils.isValidString(aVar.mo14093b()) ? aVar.mo14093b() : null).mo14573b(aVar.mo14094c()).mo14570a(false).mo14577c(aVar.mo14095d()).mo14571a());
        } else if (C2092v.m5047a()) {
            this.f2773b.mo14792d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    /* renamed from: a */
    private void m3723a(C1877a aVar) {
        if (!this.f2772a.mo14351d() && C2092v.m5047a()) {
            C2092v.m5052h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f2772a.mo14314a();
        this.f2772a.mo14303S().mo14206a(aVar, C1908o.C1910a.MAIN);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3724a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2774c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C2092v.m5049c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m3725a(Uri uri, String str, List<Uri> list, C1829e eVar, AppLovinAdView appLovinAdView, C1497b bVar, Context context, C1959m mVar) {
        if (C2092v.m5047a()) {
            C2092v A = mVar.mo14286A();
            A.mo14789b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean openUri = Utils.openUri(context, uri, mVar);
        boolean a = C2092v.m5047a();
        if (openUri) {
            if (a) {
                C2092v A2 = mVar.mo14286A();
                A2.mo14789b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            for (Uri uri2 : list) {
                mVar.mo14308X().dispatchPostbackAsync(uri2.toString(), (AppLovinPostbackListener) null);
            }
            if (bVar != null) {
                C2043j.m4955c(bVar.mo12894g(), (AppLovinAd) eVar, appLovinAdView);
            }
        } else if (a) {
            mVar.mo14286A().mo14793e("AppLovinAdService", "URL failed to open");
        }
        return openUri;
    }

    /* renamed from: a */
    private boolean m3726a(String str) {
        String str2 = this.f2772a.mo14363p().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    /* renamed from: b */
    private List<Uri> m3728b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String parse : queryParameters) {
            try {
                arrayList.add(Uri.parse(parse));
            } catch (Throwable unused) {
                if (C2092v.m5047a()) {
                    C2092v A = this.f2772a.mo14286A();
                    A.mo14792d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
            }
        }
        return arrayList;
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f2777f) {
            this.f2777f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(C1828d dVar) {
        AppLovinAdImpl b = this.f2772a.mo14310Z().mo14054b(dVar);
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2773b;
            vVar.mo14789b("AppLovinAdService", "Dequeued ad: " + b + " for zone: " + dVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return b;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f2778g.getAndSet((Object) null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        HashMap hashMap;
        synchronized (this.f2777f) {
            hashMap = new HashMap(this.f2777f);
            this.f2777f.clear();
        }
        return hashMap;
    }

    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String a = this.f2772a.mo14306V().mo14597a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a;
    }

    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        m3721a(C1828d.m3844a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2773b;
            vVar.mo14789b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        m3721a(C1828d.m3845a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* JADX WARNING: type inference failed for: r11v27, types: [com.applovin.impl.sdk.e.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadNextAdForAdToken(java.lang.String r11, com.applovin.sdk.AppLovinAdLoadListener r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0007
            java.lang.String r11 = r11.trim()
            goto L_0x0008
        L_0x0007:
            r11 = 0
        L_0x0008:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = -8
            java.lang.String r2 = "AppLovinAdService"
            if (r0 == 0) goto L_0x0020
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x001c
            java.lang.String r11 = "Invalid ad token specified"
            com.applovin.impl.sdk.C2092v.m5053i(r2, r11)
        L_0x001c:
            r10.m3714a((int) r1, (com.applovin.sdk.AppLovinAdLoadListener) r12)
            return
        L_0x0020:
            com.applovin.impl.sdk.ad.c r0 = new com.applovin.impl.sdk.ad.c
            com.applovin.impl.sdk.m r3 = r10.f2772a
            r0.<init>(r11, r3)
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo13924b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p046ad.C1826c.C1827a.REGULAR
            if (r11 != r3) goto L_0x0057
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x004b
            com.applovin.impl.sdk.v r11 = r10.f2773b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Loading next ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r11.mo14789b(r2, r1)
        L_0x004b:
            com.applovin.impl.sdk.e.l r11 = new com.applovin.impl.sdk.e.l
            com.applovin.impl.sdk.m r1 = r10.f2772a
            r11.<init>(r0, r12, r1)
        L_0x0052:
            r10.m3723a((com.applovin.impl.sdk.p050e.C1877a) r11)
            goto L_0x010a
        L_0x0057:
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo13924b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p046ad.C1826c.C1827a.AD_RESPONSE_JSON
            if (r11 != r3) goto L_0x00ed
            org.json.JSONObject r5 = r0.mo13926d()
            if (r5 == 0) goto L_0x00df
            com.applovin.impl.sdk.m r11 = r10.f2772a
            com.applovin.impl.sdk.utils.C2040h.m4909f(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2772a
            com.applovin.impl.sdk.utils.C2040h.m4905d(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2772a
            com.applovin.impl.sdk.utils.C2040h.m4904c(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2772a
            com.applovin.impl.sdk.utils.C2040h.m4907e(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2772a
            com.applovin.impl.sdk.C1935f.m4330a((com.applovin.impl.sdk.C1959m) r11)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            java.lang.String r1 = "ads"
            org.json.JSONArray r11 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r5, r1, r11)
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x00bd
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x00ab
            com.applovin.impl.sdk.v r11 = r10.f2773b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Rendering ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo14789b(r2, r0)
        L_0x00ab:
            com.applovin.impl.sdk.m r11 = r10.f2772a
            com.applovin.impl.sdk.ad.d r6 = com.applovin.impl.sdk.utils.Utils.getZone(r5, r11)
            com.applovin.impl.sdk.e.p r11 = new com.applovin.impl.sdk.e.p
            com.applovin.impl.sdk.ad.b r7 = com.applovin.impl.sdk.p046ad.C1825b.DECODED_AD_TOKEN_JSON
            com.applovin.impl.sdk.m r9 = r10.f2772a
            r4 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0052
        L_0x00bd:
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x00d9
            com.applovin.impl.sdk.v r11 = r10.f2773b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "No ad returned from the server for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo14793e(r2, r0)
        L_0x00d9:
            r11 = 204(0xcc, float:2.86E-43)
            r12.failedToReceiveAd(r11)
            goto L_0x010a
        L_0x00df:
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x0107
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "Unable to retrieve ad response JSON from token: "
            goto L_0x00fa
        L_0x00ed:
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x0107
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "Invalid ad token specified: "
        L_0x00fa:
            r11.append(r3)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.applovin.impl.sdk.C2092v.m5053i(r2, r11)
        L_0x0107:
            r12.failedToReceiveAd(r1)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinAdServiceImpl.loadNextAdForAdToken(java.lang.String, com.applovin.sdk.AppLovinAdLoadListener):void");
    }

    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f2773b;
                vVar.mo14789b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            }
            m3721a(C1828d.m3846a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings == null || removeTrimmedEmptyStrings.isEmpty()) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinAdService", "No zones were provided");
            }
            m3714a(-7, appLovinAdLoadListener);
            return;
        }
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2773b;
            vVar.mo14789b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
        }
        m3723a((C1877a) new C1899j(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.f2772a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2773b;
            vVar.mo14789b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        m3721a(C1828d.m3848b(str), appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<C1865a> list) {
        if (list != null && !list.isEmpty()) {
            for (C1865a a : list) {
                m3722a(a);
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f2778g.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f2775d + '}';
    }

    public void trackAndLaunchClick(C1829e eVar, AppLovinAdView appLovinAdView, C1497b bVar, Uri uri, PointF pointF, boolean z) {
        if (eVar != null) {
            if (C2092v.m5047a()) {
                this.f2773b.mo14789b("AppLovinAdService", "Tracking click on an ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo13966a(pointF, z));
            if (appLovinAdView == null || uri == null) {
                if (C2092v.m5047a()) {
                    this.f2773b.mo14793e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
                }
            } else if (m3726a(uri.getScheme())) {
                m3717a(uri, eVar, bVar, (C1440a) null);
            } else if (Utils.isDeepLinkPlusUrl(uri)) {
                m3716a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.f2772a);
            } else {
                m3715a(uri, eVar, appLovinAdView, bVar);
            }
        } else if (C2092v.m5047a()) {
            this.f2773b.mo14793e("AppLovinAdService", "Unable to track ad view click. No ad specified");
        }
    }

    public void trackAndLaunchVideoClick(C1829e eVar, Uri uri, PointF pointF, C1440a aVar, Context context) {
        if (eVar != null) {
            if (C2092v.m5047a()) {
                this.f2773b.mo14789b("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo13965a(pointF));
            if (m3726a(uri.getScheme())) {
                m3717a(uri, eVar, (C1497b) null, aVar);
            } else if (Utils.isDeepLinkPlusUrl(uri)) {
                m3716a(uri, eVar, (AppLovinAdView) null, (C1497b) null, context, this.f2772a);
            } else {
                Utils.openUri(context, uri, this.f2772a);
            }
        } else if (C2092v.m5047a()) {
            this.f2773b.mo14793e("AppLovinAdService", "Unable to track video click. No ad specified");
        }
    }

    public void trackAppKilled(C1829e eVar) {
        if (eVar != null) {
            if (C2092v.m5047a()) {
                this.f2773b.mo14789b("AppLovinAdService", "Tracking app killed during ad...");
            }
            List<C1865a> as = eVar.mo13999as();
            if (as != null && !as.isEmpty()) {
                for (C1865a next : as) {
                    m3722a(new C1865a(next.mo14092a(), next.mo14093b()));
                }
            } else if (C2092v.m5047a()) {
                C2092v vVar = this.f2773b;
                vVar.mo14792d("AppLovinAdService", "Unable to track app killed during AD #" + eVar.getAdIdNumber() + ". Missing app killed tracking URL.");
            }
        } else if (C2092v.m5047a()) {
            this.f2773b.mo14793e("AppLovinAdService", "Unable to track app killed. No ad specified");
        }
    }

    public void trackFullScreenAdClosed(C1829e eVar, long j, List<Long> list, long j2, boolean z, int i) {
        boolean a = C2092v.m5047a();
        if (eVar != null) {
            if (a) {
                this.f2773b.mo14789b("AppLovinAdService", "Tracking ad closed...");
            }
            List<C1865a> ar = eVar.mo13998ar();
            if (ar != null && !ar.isEmpty()) {
                for (C1865a next : ar) {
                    long j3 = j;
                    long j4 = j2;
                    List<Long> list2 = list;
                    boolean z2 = z;
                    int i2 = i;
                    String a2 = m3713a(next.mo14092a(), j3, j4, list2, z2, i2);
                    String a3 = m3713a(next.mo14093b(), j3, j4, list2, z2, i2);
                    if (StringUtils.isValidString(a2)) {
                        m3722a(new C1865a(a2, a3));
                    } else if (C2092v.m5047a()) {
                        C2092v vVar = this.f2773b;
                        vVar.mo14793e("AppLovinAdService", "Failed to parse url: " + next.mo14092a());
                    }
                }
            } else if (C2092v.m5047a()) {
                C2092v vVar2 = this.f2773b;
                vVar2.mo14792d("AppLovinAdService", "Unable to track ad closed for AD #" + eVar.getAdIdNumber() + ". Missing ad close tracking URL." + eVar.getAdIdNumber());
            }
        } else if (a) {
            this.f2773b.mo14793e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
        }
    }

    public void trackImpression(C1829e eVar) {
        if (eVar != null) {
            if (C2092v.m5047a()) {
                this.f2773b.mo14789b("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo12620at());
        } else if (C2092v.m5047a()) {
            this.f2773b.mo14793e("AppLovinAdService", "Unable to track impression click. No ad specified");
        }
    }

    public void trackVideoEnd(C1829e eVar, long j, int i, boolean z) {
        boolean a = C2092v.m5047a();
        if (eVar != null) {
            if (a) {
                this.f2773b.mo14789b("AppLovinAdService", "Tracking video end on ad...");
            }
            List<C1865a> aq = eVar.mo13997aq();
            if (aq != null && !aq.isEmpty()) {
                String l = Long.toString(System.currentTimeMillis());
                for (C1865a next : aq) {
                    if (StringUtils.isValidString(next.mo14092a())) {
                        long j2 = j;
                        int i2 = i;
                        String str = l;
                        boolean z2 = z;
                        String a2 = m3712a(next.mo14092a(), j2, i2, str, z2);
                        String a3 = m3712a(next.mo14093b(), j2, i2, str, z2);
                        if (a2 != null) {
                            m3722a(new C1865a(a2, a3));
                        } else if (C2092v.m5047a()) {
                            C2092v vVar = this.f2773b;
                            vVar.mo14793e("AppLovinAdService", "Failed to parse url: " + next.mo14092a());
                        }
                    } else if (C2092v.m5047a()) {
                        this.f2773b.mo14792d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                    }
                }
            } else if (C2092v.m5047a()) {
                C2092v vVar2 = this.f2773b;
                vVar2.mo14792d("AppLovinAdService", "Unable to submit persistent postback for AD #" + eVar.getAdIdNumber() + ". Missing video end tracking URL.");
            }
        } else if (a) {
            this.f2773b.mo14793e("AppLovinAdService", "Unable to track video end. No ad specified");
        }
    }
}
