package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11441b;
import com.tapjoy.internal.C11471bv;
import com.tapjoy.internal.C11630fk;
import com.tapjoy.internal.C11636fo;
import com.tapjoy.internal.C11644fs;
import com.tapjoy.internal.C11650fw;
import com.tapjoy.internal.C11651fx;
import com.tapjoy.internal.C11652fy;
import com.tapjoy.internal.C11662gd;
import com.tapjoy.internal.C11676gi;
import com.tapjoy.internal.C11682gl;
import com.tapjoy.internal.C11706hf;
import com.tapjoy.internal.C11710hg;
import com.tapjoy.internal.C11714hj;
import com.tapjoy.internal.C11728ho;
import com.tapjoy.internal.C11734hq;
import com.tapjoy.internal.C11736hs;
import com.tapjoy.internal.C11787it;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class TJCorePlacement {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public static final String f27342a = TJCorePlacement.class.getSimpleName();

    /* renamed from: A */
    private TJAdUnit.TJAdUnitVideoListener f27343A = new TJAdUnit.TJAdUnitVideoListener() {
        public final void onVideoStart() {
            TJPlacement a = TJCorePlacement.this.mo71875a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoStart(a);
            }
        }

        public final void onVideoCompleted() {
            TJPlacement a = TJCorePlacement.this.mo71875a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoComplete(a);
            }
        }

        public final void onVideoError(String str) {
            TJPlacement a = TJCorePlacement.this.mo71875a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoError(a, str);
            }
        }
    };
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public Context f27344b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public TJPlacementData f27345c;

    /* renamed from: d */
    String f27346d;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public long f27347e;

    /* renamed from: f */
    final C11652fy f27348f = new C11652fy();

    /* renamed from: g */
    TJAdUnit f27349g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public boolean f27350h = false;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public C11734hq f27351i = null;

    /* renamed from: j */
    boolean f27352j;

    /* renamed from: k */
    volatile boolean f27353k = false;

    /* renamed from: l */
    volatile boolean f27354l = false;

    /* renamed from: m */
    volatile boolean f27355m = false;

    /* renamed from: n */
    String f27356n;

    /* renamed from: o */
    String f27357o;

    /* renamed from: p */
    String f27358p;

    /* renamed from: q */
    String f27359q;

    /* renamed from: r */
    HashMap<String, String> f27360r;

    /* renamed from: s */
    private Map<String, TJPlacement> f27361s = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Map<String, String> f27362t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C11636fo f27363u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f27364v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C11787it f27365w = null;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile boolean f27366x = false;

    /* renamed from: y */
    private boolean f27367y;

    /* renamed from: z */
    private TJAdUnit.TJAdUnitWebViewListener f27368z = new TJAdUnit.TJAdUnitWebViewListener() {
        public final void onContentReady() {
            TJCorePlacement.this.mo71882c();
        }

        public final void onClosed() {
            if (TJCorePlacement.this.f27350h) {
                TJPlacementManager.decrementPlacementCacheCount();
                boolean unused = TJCorePlacement.this.f27350h = false;
            }
            if (TJCorePlacement.this.f27364v) {
                TJPlacementManager.decrementPlacementPreRenderCount();
                boolean unused2 = TJCorePlacement.this.f27364v = false;
            }
        }

        public final void onClick() {
            TJCorePlacement.m33069e(TJCorePlacement.this);
        }
    };

    TJCorePlacement(String str, String str2, boolean z) {
        Activity c = C11441b.m33239c();
        this.f27344b = c;
        if (c == null) {
            TapjoyLog.m33194d(f27342a, "getVisibleActivity() is NULL. Activity can be explicitly set via `Tapjoy.setActivity(Activity)`");
        }
        this.f27367y = z;
        TJPlacementData tJPlacementData = new TJPlacementData(str2, getPlacementContentUrl());
        this.f27345c = tJPlacementData;
        tJPlacementData.setPlacementName(str);
        this.f27346d = UUID.randomUUID().toString();
        TJAdUnit tJAdUnit = new TJAdUnit();
        this.f27349g = tJAdUnit;
        tJAdUnit.setWebViewListener(this.f27368z);
        this.f27349g.setVideoListener(this.f27343A);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo71876a() {
        String url = this.f27345c.getUrl();
        if (TextUtils.isEmpty(url)) {
            url = getPlacementContentUrl();
            if (TextUtils.isEmpty(url)) {
                C11676gi.m33885b("TJPlacement.requestContent").mo72565a("TJPlacement is missing APP_ID").mo72572c();
                mo71878a(mo71875a("REQUEST"), TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "TJPlacement is missing APP_ID"));
                return;
            }
            this.f27345c.updateUrl(url);
        }
        String str = f27342a;
        TapjoyLog.m33194d(str, "sendContentRequest -- URL: " + url + " name: " + this.f27345c.getPlacementName());
        mo71880a(url, (Map<String, String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo71880a(String str, Map<String, String> map) {
        if (this.f27366x) {
            String str2 = f27342a;
            TapjoyLog.m33197i(str2, "Placement " + this.f27345c.getPlacementName() + " is already requesting content");
            C11676gi.m33885b("TJPlacement.requestContent").mo72570b("already doing").mo72572c();
            return;
        }
        this.f27345c.resetPlacementRequestData();
        C11652fy fyVar = this.f27348f;
        String str3 = null;
        fyVar.f28332b = null;
        fyVar.f28334d = null;
        fyVar.f28331a = null;
        this.f27349g.resetContentLoadState();
        this.f27366x = false;
        this.f27353k = false;
        this.f27354l = false;
        this.f27355m = false;
        this.f27351i = null;
        this.f27365w = null;
        this.f27366x = true;
        final TJPlacement a = mo71875a("REQUEST");
        if (!this.f27367y) {
            Map<String, String> genericURLParams = TapjoyConnectCore.getGenericURLParams();
            this.f27362t = genericURLParams;
            genericURLParams.putAll(TapjoyConnectCore.getTimeStampAndVerifierParams());
        } else {
            Map<String, String> limitedGenericURLParams = TapjoyConnectCore.getLimitedGenericURLParams();
            this.f27362t = limitedGenericURLParams;
            limitedGenericURLParams.putAll(TapjoyConnectCore.getLimitedTimeStampAndVerifierParams());
        }
        TapjoyUtil.safePut(this.f27362t, TJAdUnitConstants.PARAM_PLACEMENT_NAME, this.f27345c.getPlacementName(), true);
        TapjoyUtil.safePut(this.f27362t, TJAdUnitConstants.PARAM_PLACEMENT_PRELOAD, "true", true);
        TapjoyUtil.safePut(this.f27362t, TapjoyConstants.TJC_DEBUG, Boolean.toString(C11710hg.f28464a), true);
        C11714hj a2 = C11714hj.m33999a();
        Map<String, String> map2 = this.f27362t;
        if (a2.f28481b != null) {
            C11736hs hsVar = a2.f28481b;
            hsVar.mo72666b();
            str3 = hsVar.f28560b.mo72813a();
        }
        TapjoyUtil.safePut(map2, TJAdUnitConstants.PARAM_ACTION_ID_EXCLUSION, str3, true);
        TapjoyUtil.safePut(this.f27362t, TJAdUnitConstants.PARAM_PLACEMENT_BY_SDK, String.valueOf(this.f27352j), true);
        TapjoyUtil.safePut(this.f27362t, TJAdUnitConstants.PARAM_PUSH_ID, a.pushId, true);
        TapjoyUtil.safePut(this.f27362t, TapjoyConstants.TJC_MEDIATION_SOURCE, this.f27356n, true);
        TapjoyUtil.safePut(this.f27362t, TapjoyConstants.TJC_ADAPTER_VERSION, this.f27357o, true);
        if (!TextUtils.isEmpty(TapjoyConnectCore.getCustomParameter())) {
            TapjoyUtil.safePut(this.f27362t, TapjoyConstants.TJC_CUSTOM_PARAMETER, TapjoyConnectCore.getCustomParameter(), true);
        }
        if (map != null) {
            this.f27362t.putAll(map);
        }
        final C11630fk fkVar = new C11630fk(C11662gd.m33848b().mo72578b("placement_request_content_retry_timeout"));
        final C11682gl c = C11662gd.m33848b().mo72579c("placement_request_content_retry_backoff");
        final C11676gi.C11678a d = C11676gi.m33888d("TJPlacement.requestContent");
        final String str4 = str;
        new Thread() {
            public final void run() {
                C11676gi.m33880a("TJPlacement.requestContent", d);
                int i = 0;
                while (!m33090a()) {
                    i++;
                    TJCorePlacement.this.f27362t.put(TapjoyConstants.TJC_RETRY, Integer.toString(i));
                    if (i == 1) {
                        d.mo72567a("retry_timeout", (Object) Long.valueOf(fkVar.f28287b));
                    }
                    d.mo72566a("retry_count", (long) i);
                }
            }

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0335 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private boolean m33090a() {
                /*
                    r12 = this;
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f27342a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Sending content request for placement "
                    r1.<init>(r2)
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r2 = r2.f27345c.getPlacementName()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tapjoy.TapjoyLog.m33197i(r0, r1)
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.hj r1 = com.tapjoy.internal.C11714hj.m33999a()
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r8 = r2.f27345c.getPlacementName()
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    android.content.Context r9 = r2.f27344b
                    com.tapjoy.internal.hr r1 = r1.f28480a
                    com.tapjoy.internal.hj r2 = r1.f28555a
                    r10 = 0
                    com.tapjoy.internal.fd r2 = r2.mo72611a((boolean) r10)
                    com.tapjoy.internal.it r11 = new com.tapjoy.internal.it
                    com.tapjoy.internal.hj r4 = r1.f28555a
                    com.tapjoy.internal.fc r5 = r2.f28157d
                    com.tapjoy.internal.ew r6 = r2.f28158e
                    com.tapjoy.internal.fj r7 = r2.f28159f
                    r3 = r11
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    com.tapjoy.internal.C11787it unused = r0.f27365w = r11
                    com.tapjoy.TapjoyURLConnection r0 = new com.tapjoy.TapjoyURLConnection
                    r0.<init>()
                    java.lang.String r1 = r7
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.util.Map r2 = r2.f27362t
                    r3 = 0
                    com.tapjoy.TapjoyHttpURLResponse r0 = r0.getResponseFromURL((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r3, (java.util.Map<java.lang.String, java.lang.String>) r3, (java.util.Map<java.lang.String, java.lang.String>) r2)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f27345c
                    int r2 = r0.statusCode
                    r1.setHttpStatusCode(r2)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f27345c
                    java.lang.String r2 = r0.response
                    r1.setHttpResponse(r2)
                    java.lang.String r1 = "x-tapjoy-prerender"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r2 = "0"
                    boolean r1 = r1.equals(r2)
                    r2 = 1
                    if (r1 != 0) goto L_0x0087
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f27345c
                    r1.setPrerenderingRequested(r2)
                L_0x0087:
                    java.lang.String r1 = "X-Tapjoy-Debug"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    if (r1 == 0) goto L_0x00a0
                    java.lang.String r3 = com.tapjoy.TJCorePlacement.f27342a
                    java.lang.String r4 = "Tapjoy-Server-Debug: "
                    java.lang.String r1 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = r4.concat(r1)
                    com.tapjoy.TapjoyLog.m33198v(r3, r1)
                L_0x00a0:
                    java.lang.String r1 = "x-tapjoy-handle-dismiss-on-pause"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r3 = "0"
                    boolean r1 = r1.equals(r3)
                    if (r1 != 0) goto L_0x00b7
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f27345c
                    r1.setHandleDismissOnPause(r2)
                L_0x00b7:
                    long r3 = r0.expires
                    r5 = 0
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00de
                    long r3 = r0.expires
                    long r7 = r0.date
                    int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00ca
                    long r7 = r0.date
                    goto L_0x00ce
                L_0x00ca:
                    long r7 = com.tapjoy.internal.C11841u.m34410b()
                L_0x00ce:
                    long r3 = r3 - r7
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00e3
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    long r7 = android.os.SystemClock.elapsedRealtime()
                    long r7 = r7 + r3
                    long unused = r1.f27347e = r7
                    goto L_0x00e3
                L_0x00de:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    long unused = r1.f27347e = r5
                L_0x00e3:
                    if (r0 == 0) goto L_0x033a
                    com.tapjoy.TJPlacement r1 = r8
                    com.tapjoy.TJPlacementListener r1 = r1.getListener()
                    if (r1 == 0) goto L_0x033a
                    int r1 = r0.statusCode
                    if (r1 == 0) goto L_0x02c9
                    r3 = 200(0xc8, float:2.8E-43)
                    if (r1 == r3) goto L_0x011b
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11676gi.m33885b(r1)
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "none"
                    com.tapjoy.internal.gi$a r1 = r1.mo72567a((java.lang.String) r3, (java.lang.Object) r4)
                    java.lang.String r3 = "code"
                    int r0 = r0.statusCode
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    com.tapjoy.internal.gi$a r0 = r1.mo72567a((java.lang.String) r3, (java.lang.Object) r0)
                    r0.mo72572c()
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r1 = r8
                    r0.mo71877a((com.tapjoy.TJPlacement) r1)
                    goto L_0x033a
                L_0x011b:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m33075j(r1)
                    java.lang.String r1 = "Content-Type"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L_0x0203
                    java.lang.String r3 = "json"
                    boolean r1 = r1.contains(r3)
                    if (r1 == 0) goto L_0x0203
                    java.lang.String r1 = "X-Tapjoy-Disable-Preload"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r3 = "1"
                    boolean r1 = r1.equals(r3)
                    if (r1 == 0) goto L_0x01b2
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    java.lang.String r3 = r0.response     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement.m33061a((com.tapjoy.TJCorePlacement) r1, (java.lang.String) r3)     // Catch:{ TapjoyException -> 0x0172 }
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11676gi.m33885b(r1)     // Catch:{ TapjoyException -> 0x0172 }
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "ad"
                    com.tapjoy.internal.gi$a r1 = r1.mo72567a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ TapjoyException -> 0x0172 }
                    r1.mo72572c()     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.internal.fy r1 = r1.f27348f     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.internal.fo r3 = r3.f27363u     // Catch:{ TapjoyException -> 0x0172 }
                    r1.f28331a = r3     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement.m33077l(r1)     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    r1.mo71882c()     // Catch:{ TapjoyException -> 0x0172 }
                    goto L_0x033a
                L_0x0172:
                    r1 = move-exception
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r1 = r1.getMessage()
                    r3.append(r1)
                    java.lang.String r1 = " for placement "
                    r3.append(r1)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r1 = r1.f27345c.getPlacementName()
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    java.lang.String r3 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r3 = com.tapjoy.internal.C11676gi.m33885b(r3)
                    java.lang.String r4 = "server error"
                    com.tapjoy.internal.gi$a r3 = r3.mo72565a((java.lang.String) r4)
                    r3.mo72572c()
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r4 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR
                    com.tapjoy.TJError r6 = new com.tapjoy.TJError
                    int r0 = r0.statusCode
                    r6.<init>(r0, r1)
                    r3.mo71878a(r4, r5, r6)
                    goto L_0x033a
                L_0x01b2:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r3 = r0.response
                    boolean r1 = r1.m33066b((java.lang.String) r3)
                    if (r1 == 0) goto L_0x01d9
                    java.lang.String r0 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r0 = com.tapjoy.internal.C11676gi.m33885b(r0)
                    java.lang.String r1 = "content_type"
                    java.lang.String r3 = "mm"
                    com.tapjoy.internal.gi$a r0 = r0.mo72567a((java.lang.String) r1, (java.lang.Object) r3)
                    r0.mo72572c()
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m33077l(r0)
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    r0.mo71882c()
                    goto L_0x033a
                L_0x01d9:
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11676gi.m33885b(r1)
                    java.lang.String r3 = "asset error"
                    com.tapjoy.internal.gi$a r1 = r1.mo72565a((java.lang.String) r3)
                    r1.mo72572c()
                    java.lang.String r1 = r0.response
                    if (r1 != 0) goto L_0x01ef
                    java.lang.String r1 = "asset error"
                    goto L_0x01f1
                L_0x01ef:
                    java.lang.String r1 = r0.response
                L_0x01f1:
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r4 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR
                    com.tapjoy.TJError r6 = new com.tapjoy.TJError
                    int r0 = r0.statusCode
                    r6.<init>(r0, r1)
                    r3.mo71878a(r4, r5, r6)
                    goto L_0x033a
                L_0x0203:
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11676gi.m33885b(r1)
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "ad"
                    com.tapjoy.internal.gi$a r1 = r1.mo72567a((java.lang.String) r3, (java.lang.Object) r4)
                    r1.mo72572c()
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.fy r1 = r1.f27348f
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.fo r3 = r3.f27363u
                    r1.f28331a = r3
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m33077l(r1)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement$3$1 r3 = new com.tapjoy.TJCorePlacement$3$1
                    r3.<init>()
                    java.lang.String r4 = com.tapjoy.TJCorePlacement.f27342a
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    java.lang.String r6 = "Checking if there is content to cache for placement "
                    r5.<init>(r6)
                    com.tapjoy.TJPlacementData r6 = r1.f27345c
                    java.lang.String r6 = r6.getPlacementName()
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    com.tapjoy.TapjoyLog.m33197i(r4, r5)
                    java.lang.String r4 = "x-tapjoy-cacheable-assets"
                    java.lang.String r0 = r0.getHeaderFieldAsString(r4)
                    r4 = 2
                    boolean r5 = com.tapjoy.TJPlacementManager.canCachePlacement()     // Catch:{ Exception -> 0x02ac }
                    if (r5 != 0) goto L_0x0270
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f27342a     // Catch:{ Exception -> 0x02ac }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r6 = "Placement caching limit reached. No content will be cached for placement "
                    r5.<init>(r6)     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJPlacementData r1 = r1.f27345c     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r1 = r1.getPlacementName()     // Catch:{ Exception -> 0x02ac }
                    r5.append(r1)     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TapjoyLog.m33197i(r0, r1)     // Catch:{ Exception -> 0x02ac }
                    r3.onCachingComplete(r4)     // Catch:{ Exception -> 0x02ac }
                    goto L_0x033a
                L_0x0270:
                    org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x02ac }
                    r5.<init>(r0)     // Catch:{ Exception -> 0x02ac }
                    int r0 = r5.length()     // Catch:{ Exception -> 0x02ac }
                    if (r0 <= 0) goto L_0x02a7
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f27342a     // Catch:{ Exception -> 0x02ac }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r7 = "Begin caching content for placement "
                    r6.<init>(r7)     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJPlacementData r7 = r1.f27345c     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r7 = r7.getPlacementName()     // Catch:{ Exception -> 0x02ac }
                    r6.append(r7)     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TapjoyLog.m33197i(r0, r6)     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJPlacementManager.incrementPlacementCacheCount()     // Catch:{ Exception -> 0x02ac }
                    r1.f27350h = r2     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TapjoyCache r0 = com.tapjoy.TapjoyCache.getInstance()     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJCorePlacement$6 r6 = new com.tapjoy.TJCorePlacement$6     // Catch:{ Exception -> 0x02ac }
                    r6.<init>(r3)     // Catch:{ Exception -> 0x02ac }
                    r0.cacheAssetGroup(r5, r6)     // Catch:{ Exception -> 0x02ac }
                    goto L_0x033a
                L_0x02a7:
                    r3.onCachingComplete(r2)     // Catch:{ Exception -> 0x02ac }
                    goto L_0x033a
                L_0x02ac:
                    r0 = move-exception
                    r3.onCachingComplete(r4)
                    java.lang.String r1 = com.tapjoy.TJCorePlacement.f27342a
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "Error while handling placement cache: "
                    r3.<init>(r4)
                    java.lang.String r0 = r0.getMessage()
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    com.tapjoy.TapjoyLog.m33194d(r1, r0)
                    goto L_0x033a
                L_0x02c9:
                    com.tapjoy.internal.fk r1 = r6
                    com.tapjoy.internal.gl r3 = r9
                    long r3 = r3.f28430e
                    boolean r1 = r1.mo72493a(r3)
                    if (r1 == 0) goto L_0x030c
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11676gi.m33885b(r1)
                    java.lang.String r3 = "network error"
                    com.tapjoy.internal.gi$a r1 = r1.mo72565a((java.lang.String) r3)
                    java.lang.String r3 = "retry_timeout"
                    com.tapjoy.internal.fk r4 = r6
                    long r4 = r4.f28287b
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    com.tapjoy.internal.gi$a r1 = r1.mo72567a((java.lang.String) r3, (java.lang.Object) r4)
                    r1.mo72572c()
                    java.lang.String r1 = r0.response
                    if (r1 != 0) goto L_0x02f9
                    java.lang.String r1 = "network error"
                    goto L_0x02fb
                L_0x02f9:
                    java.lang.String r1 = r0.response
                L_0x02fb:
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r4 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.NETWORK_ERROR
                    com.tapjoy.TJError r6 = new com.tapjoy.TJError
                    int r0 = r0.statusCode
                    r6.<init>(r0, r1)
                    r3.mo71878a(r4, r5, r6)
                    goto L_0x033a
                L_0x030c:
                    com.tapjoy.internal.gl r0 = r9
                    long r1 = r0.f28430e
                    long r3 = r0.f28430e
                    double r3 = (double) r3
                    double r7 = r0.f28429d
                    double r3 = r3 * r7
                    long r3 = (long) r3
                    long r7 = r0.f28427b
                    int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r7 >= 0) goto L_0x0320
                    long r3 = r0.f28427b
                    goto L_0x0328
                L_0x0320:
                    long r7 = r0.f28428c
                    int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r7 <= 0) goto L_0x0328
                    long r3 = r0.f28428c
                L_0x0328:
                    r0.f28430e = r3
                    int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                    if (r3 <= 0) goto L_0x0339
                    monitor-enter(r0)
                    r0.wait(r1)     // Catch:{ InterruptedException -> 0x0335 }
                    goto L_0x0335
                L_0x0333:
                    r1 = move-exception
                    goto L_0x0337
                L_0x0335:
                    monitor-exit(r0)     // Catch:{ all -> 0x0333 }
                    goto L_0x0339
                L_0x0337:
                    monitor-exit(r0)     // Catch:{ all -> 0x0333 }
                    throw r1
                L_0x0339:
                    return r10
                L_0x033a:
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    boolean unused = r0.f27366x = false
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJCorePlacement.C113753.m33090a():boolean");
            }
        }.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m33066b(String str) {
        try {
            C11787it.C11788a aVar = (C11787it.C11788a) this.f27365w.mo72254a(URI.create(this.f27345c.getUrl()), new ByteArrayInputStream(str.getBytes()));
            this.f27351i = aVar.f28767a;
            aVar.f28767a.mo72592b();
            if (!aVar.f28767a.mo72593c()) {
                TapjoyLog.m33196e(f27342a, "Failed to load fiverocks placement");
                return false;
            }
            C11644fs fsVar = null;
            if (this.f27351i instanceof C11728ho) {
                fsVar = new C11650fw(this.f27345c.getPlacementName(), this.f27345c.getPlacementType(), this.f27363u);
            } else if (this.f27351i instanceof C11706hf) {
                fsVar = new C11651fx(this.f27345c.getPlacementName(), this.f27345c.getPlacementType(), this.f27363u);
            }
            this.f27348f.f28331a = fsVar;
            return true;
        } catch (IOException e) {
            TapjoyLog.m33196e(f27342a, e.toString());
            e.printStackTrace();
            return false;
        } catch (C11471bv e2) {
            TapjoyLog.m33196e(f27342a, e2.toString());
            e2.printStackTrace();
            return false;
        }
    }

    public Context getContext() {
        return this.f27344b;
    }

    public void setContext(Context context) {
        this.f27344b = context;
    }

    public TJAdUnit getAdUnit() {
        return this.f27349g;
    }

    public TJPlacementData getPlacementData() {
        return this.f27345c;
    }

    public boolean isContentReady() {
        return this.f27355m;
    }

    public boolean isContentAvailable() {
        return this.f27354l;
    }

    public String getPlacementContentUrl() {
        String e = mo71884e();
        if (!TextUtils.isEmpty(e)) {
            return TapjoyConnectCore.getPlacementURL() + "v1/apps/" + e + "/content?";
        }
        TapjoyLog.m33197i(f27342a, "Placement content URL cannot be generated for null app ID");
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo71881b() {
        if (this.f27351i != null) {
            return "mm";
        }
        return this.f27354l ? "ad" : "none";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71879a(String str, TJPlacement tJPlacement) {
        synchronized (this.f27361s) {
            this.f27361s.put(str, tJPlacement);
            String str2 = f27342a;
            TapjoyLog.m33194d(str2, "Setting " + str + " placement: " + tJPlacement.getGUID());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TJPlacement mo71875a(String str) {
        TJPlacement tJPlacement;
        synchronized (this.f27361s) {
            tJPlacement = this.f27361s.get(str);
            if (tJPlacement != null) {
                String str2 = f27342a;
                TapjoyLog.m33194d(str2, "Returning " + str + " placement: " + tJPlacement.getGUID());
            }
        }
        return tJPlacement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71877a(TJPlacement tJPlacement) {
        C11652fy fyVar = this.f27348f;
        String placementName = this.f27345c.getPlacementName();
        String placementType = this.f27345c.getPlacementType();
        String b = mo71881b();
        fyVar.f28333c = 0;
        fyVar.f28332b = C11676gi.m33889e("PlacementContent.funnel").mo72564a().mo72567a("placement", (Object) placementName).mo72567a("placement_type", (Object) placementType).mo72567a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) b).mo72567a("state", (Object) Integer.valueOf(fyVar.f28333c));
        fyVar.f28332b.mo72572c();
        if (!"none".equals(b)) {
            fyVar.f28335e = C11676gi.m33889e("PlacementContent.ready").mo72564a().mo72567a("placement", (Object) placementName).mo72567a("placement_type", (Object) placementType).mo72567a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) b);
        }
        if (tJPlacement != null && tJPlacement.getListener() != null) {
            String str = f27342a;
            TapjoyLog.m33197i(str, "Content request delivered successfully for placement " + this.f27345c.getPlacementName() + ", contentAvailable: " + isContentAvailable() + ", mediationAgent: " + this.f27358p);
            tJPlacement.getListener().onRequestSuccess(tJPlacement);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71878a(TJPlacement tJPlacement, TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        String str = f27342a;
        TapjoyLog.m33195e(str, new TapjoyErrorMessage(errorType, "Content request failed for placement " + this.f27345c.getPlacementName() + "; Reason= " + tJError.message));
        if (tJPlacement != null && tJPlacement.getListener() != null) {
            tJPlacement.getListener().onRequestFailure(tJPlacement, tJError);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo71882c() {
        if (!this.f27353k) {
            this.f27355m = true;
            String str = f27342a;
            TapjoyLog.m33197i(str, "Content is ready for placement " + this.f27345c.getPlacementName());
            if (this.f27349g.isPrerendered()) {
                C11652fy fyVar = this.f27348f;
                Boolean bool = Boolean.TRUE;
                C11676gi.C11678a aVar = fyVar.f28332b;
                if (aVar != null) {
                    aVar.mo72567a("prerendered", (Object) bool);
                }
                C11676gi.C11678a aVar2 = fyVar.f28335e;
                if (aVar2 != null) {
                    aVar2.mo72567a("prerendered", (Object) bool);
                }
            }
            C11652fy fyVar2 = this.f27348f;
            C11676gi.C11678a aVar3 = fyVar2.f28335e;
            if (aVar3 != null) {
                fyVar2.f28335e = null;
                aVar3.mo72569b().mo72572c();
            }
            TJPlacement a = mo71875a("REQUEST");
            if (a != null && a.getListener() != null) {
                a.getListener().onContentReady(a);
                this.f27353k = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo71883d() {
        TJPlacement a = mo71875a("SHOW");
        if (a != null && a.getListener() != null) {
            m33063b(a);
        }
    }

    /* renamed from: b */
    private void m33063b(TJPlacement tJPlacement) {
        String str = f27342a;
        TapjoyLog.m33197i(str, "Content dismissed for placement " + this.f27345c.getPlacementName());
        this.f27348f.mo72521a();
        if (tJPlacement != null && tJPlacement.f27410a != null) {
            tJPlacement.f27410a.onContentDismiss(tJPlacement);
        }
    }

    public boolean isLimited() {
        return this.f27367y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo71884e() {
        if (!this.f27367y) {
            return TapjoyConnectCore.getAppID();
        }
        return TapjoyConnectCore.getLimitedAppID();
    }

    /* renamed from: e */
    static /* synthetic */ void m33069e(TJCorePlacement tJCorePlacement) {
        TJPlacement a = tJCorePlacement.mo71875a("SHOW");
        String str = f27342a;
        TapjoyLog.m33197i(str, "Handle onClick for placement " + tJCorePlacement.f27345c.getPlacementName());
        if (a != null && a.getListener() != null) {
            a.getListener().onClick(a);
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m33075j(TJCorePlacement tJCorePlacement) {
        C11636fo foVar = new C11636fo(tJCorePlacement.f27345c.getPlacementName(), tJCorePlacement.f27345c.getPlacementType());
        tJCorePlacement.f27363u = foVar;
        tJCorePlacement.f27349g.setAdContentTracker(foVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m33061a(TJCorePlacement tJCorePlacement, String str) {
        if (str != null) {
            try {
                String str2 = f27342a;
                TapjoyLog.m33194d(str2, "Disable preload flag is set for placement " + tJCorePlacement.f27345c.getPlacementName());
                tJCorePlacement.f27345c.setRedirectURL(new JSONObject(str).getString(TapjoyConstants.TJC_REDIRECT_URL));
                tJCorePlacement.f27345c.setPreloadDisabled(true);
                tJCorePlacement.f27345c.setHasProgressSpinner(true);
                String str3 = f27342a;
                TapjoyLog.m33194d(str3, "redirect_url:" + tJCorePlacement.f27345c.getRedirectURL());
            } catch (JSONException unused) {
                throw new TapjoyException("TJPlacement request failed, malformed server response");
            }
        } else {
            throw new TapjoyException("TJPlacement request failed due to null response");
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m33077l(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.f27354l = true;
        tJCorePlacement.mo71877a(tJCorePlacement.mo71875a("REQUEST"));
    }
}
