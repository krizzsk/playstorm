package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.cache.session.C4246c;
import com.fyber.inneractive.sdk.cache.session.C4247d;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4271d0;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.network.C4547h0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.network.C4579u;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5347j0;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.l */
public abstract class C4421l<AdContent extends C4419j, EventsListener extends InneractiveUnitController.EventsListener> implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener {

    /* renamed from: a */
    public InneractiveAdSpot f10920a;

    /* renamed from: b */
    public AdContent f10921b;

    /* renamed from: c */
    public EventsListener f10922c;

    /* renamed from: d */
    public boolean f10923d = false;

    /* renamed from: e */
    public boolean f10924e = false;

    /* renamed from: f */
    public boolean f10925f = false;

    /* renamed from: g */
    public boolean f10926g = false;

    /* renamed from: h */
    public boolean f10927h = false;

    /* renamed from: i */
    public boolean f10928i = true;

    /* renamed from: j */
    public Runnable f10929j;

    /* renamed from: com.fyber.inneractive.sdk.flow.l$a */
    public class C4422a implements C4579u<String> {

        /* renamed from: a */
        public final /* synthetic */ String f10930a;

        /* renamed from: b */
        public final /* synthetic */ long f10931b;

        public C4422a(C4421l lVar, String str, long j) {
            this.f10930a = str;
            this.f10931b = j;
        }

        /* renamed from: a */
        public void mo24228a(Object obj, Exception exc, boolean z) {
            String str = (String) obj;
            int i = IAlog.f14137a;
            IAlog.m16697a(1, (Exception) null, "Hit Request - %s", this.f10930a);
            IAlog.m16699a("Hit Request: Hitting URL finished: %s", this.f10930a);
            if (exc == null) {
                IAlog.m16699a("Hit Request: Hitting URL response code: %s", str);
            } else {
                IAlog.m16699a("Hit Request: Hitting URL failed: %s", exc);
            }
            IAlog.m16699a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f10931b));
        }
    }

    /* renamed from: A */
    public void mo24595A() {
        C5291e c;
        OnGlobalImpressionDataListener onGlobalImpressionDataListener;
        ImpressionData impressionData;
        if (!this.f10925f && this.f10922c != null) {
            IAlog.m16699a("%sCalling external interface onAdImpression", IAlog.m16696a((Object) this));
            this.f10922c.onAdImpression(this.f10920a);
            AdContent adcontent = this.f10921b;
            if (!(adcontent == null || (c = adcontent.mo24367c()) == null)) {
                IAConfigManager iAConfigManager = IAConfigManager.f10525J;
                C4271d0 d0Var = iAConfigManager.f10559x;
                if (d0Var != null) {
                    UnitDisplayType unitDisplayType = c.f14079n;
                    ImpressionData impressionData2 = c.f14083r;
                    d0Var.mo24287a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData2 != null ? impressionData2.getAdvertiserDomain() : null);
                    d0Var.mo24287a(unitDisplayType, "LAST_APP_BUNDLE_ID", c.f14090y);
                    if (!(unitDisplayType == UnitDisplayType.REWARDED || (impressionData = c.f14083r) == null || impressionData.getVideo() == null || !c.f14083r.getVideo().isSkippable())) {
                        d0Var.mo24288a(unitDisplayType, "LAST_VAST_SKIPED");
                    }
                    if (this.f10921b.isVideoAd()) {
                        d0Var.mo24288a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    }
                    d0Var.mo24288a(unitDisplayType, "LAST_CLICKED");
                }
                C5347j0 j0Var = iAConfigManager.f10527A;
                C4346z zVar = this.f10921b.f10916d;
                ImpressionData impressionData3 = c.f14083r;
                j0Var.getClass();
                if (!(zVar == null || (onGlobalImpressionDataListener = j0Var.f14207a) == null)) {
                    C4345y yVar = (C4345y) zVar;
                    onGlobalImpressionDataListener.onImpression(yVar.f10746b, yVar.f10745a, impressionData3);
                }
                EventsListener eventslistener = this.f10922c;
                if (eventslistener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                    ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f10920a, c.f14083r);
                } else if (eventslistener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                    ((InneractiveAdViewEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f10920a, c.f14083r);
                }
            }
            this.f10925f = true;
        }
    }

    /* renamed from: B */
    public void mo24596B() {
        if (this.f10922c != null) {
            IAlog.m16699a("%sCalling external interface onAdWillOpenExternalApp", IAlog.m16696a((Object) this));
            this.f10922c.onAdWillOpenExternalApp(this.f10920a);
        }
        mo24597C();
    }

    /* renamed from: C */
    public final void mo24597C() {
        this.f10927h = false;
        this.f10926g = false;
    }

    /* renamed from: D */
    public void mo24598D() {
        AdContent adcontent = this.f10921b;
        if (adcontent != null && adcontent.mo24367c() != null) {
            String str = this.f10921b.mo24367c().f14080o;
            if (!TextUtils.isEmpty(str)) {
                IAlog.m16702d("%sfiring rewarded completion!", IAlog.m16696a((Object) this));
                int i = IAlog.f14137a;
                IAlog.m16697a(1, (Exception) null, "AD_REWARDED_COMPLETION", new Object[0]);
                mo24605b(str);
            }
        }
    }

    /* renamed from: b */
    public void mo24604b(C5291e eVar) {
        String str = eVar.f14076k;
        if (str != null && str.trim().length() > 0) {
            IAlog.m16702d("%sfiring impression!", IAlog.m16696a((Object) this));
            int i = IAlog.f14137a;
            IAlog.m16697a(1, (Exception) null, "AD_IMPRESSION", new Object[0]);
            mo24605b(str);
        }
    }

    public boolean canRefreshAd() {
        return true;
    }

    public void destroy() {
        if (this.f10923d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
            this.f10923d = false;
        }
        Runnable runnable = this.f10929j;
        if (runnable != null) {
            C5357n.f14225b.removeCallbacks(runnable);
            this.f10929j = null;
        }
        this.f10921b = null;
        this.f10922c = null;
        this.f10920a = null;
    }

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f10920a = inneractiveAdSpot;
        this.f10921b = inneractiveAdSpot.getAdContent();
        this.f10922c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public void onApplicationInBackground() {
        mo24596B();
        mo24597C();
    }

    public void onInternalBrowserDismissed() {
        IAlog.m16699a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f10923d) {
            this.f10923d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
        }
        if (this.f10922c != null) {
            IAlog.m16699a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.m16696a((Object) this));
            this.f10922c.onAdWillCloseInternalBrowser(this.f10920a);
        }
        mo24597C();
    }

    /* renamed from: w */
    public int mo24606w() {
        return -1;
    }

    /* renamed from: x */
    public int mo24607x() {
        return -1;
    }

    /* renamed from: y */
    public boolean mo24608y() {
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            return adcontent.mo24373d();
        }
        return true;
    }

    /* renamed from: z */
    public void mo24609z() {
        C5291e c;
        if (this.f10922c != null) {
            IAlog.m16699a("%sCalling external interface onAdClicked", IAlog.m16696a((Object) this));
            this.f10922c.onAdClicked(this.f10920a);
        }
        AdContent adcontent = this.f10921b;
        if (adcontent != null && (c = adcontent.mo24367c()) != null) {
            IAConfigManager.f10525J.f10559x.mo24287a(c.f14079n, "LAST_CLICKED", "1");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x010a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0133 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.util.C5320d0.C5321a mo24599a(android.content.Context r17, java.lang.String r18, com.fyber.inneractive.sdk.util.C5364p0 r19, com.fyber.inneractive.sdk.util.C5325e r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            java.lang.String r4 = "Got exception adding param to json object: %s, %s"
            boolean r5 = r0.f10928i
            java.lang.String r6 = "none"
            r7 = 0
            if (r5 == 0) goto L_0x035e
            boolean r5 = r0.f10923d
            if (r5 == 0) goto L_0x0017
            goto L_0x035e
        L_0x0017:
            r16.mo24609z()
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            if (r5 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - is empty"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "empty url"
            r3.<init>(r4)
            r1.<init>(r2, r3, r6)
            return r1
        L_0x0036:
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            java.lang.String r6 = "url"
            r8 = 0
            if (r5 != 0) goto L_0x0064
            android.net.Uri r5 = android.net.Uri.parse(r18)
            java.lang.String r9 = r5.getScheme()
            java.lang.String r10 = r5.getHost()
            if (r9 == 0) goto L_0x0064
            java.lang.String r11 = "fybernativebrowser"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0064
            if (r10 == 0) goto L_0x0064
            java.lang.String r9 = "navigate"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0064
            java.lang.String r5 = r5.getQueryParameter(r6)
            goto L_0x0065
        L_0x0064:
            r5 = r8
        L_0x0065:
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            r10 = 1
            if (r9 != 0) goto L_0x006f
            r9 = r5
        L_0x006d:
            r5 = r7
            goto L_0x007b
        L_0x006f:
            java.lang.String r5 = "FYBER_OPEN_BROWSER"
            r9 = r18
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x007a
            goto L_0x006d
        L_0x007a:
            r5 = r10
        L_0x007b:
            com.fyber.inneractive.sdk.util.d0$d r11 = com.fyber.inneractive.sdk.util.C5320d0.C5324d.OPEN_EVERYTHING
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r12 = r0.f10920a
            if (r12 == 0) goto L_0x0086
            java.lang.String r12 = r12.getLocalUniqueId()
            goto L_0x0087
        L_0x0086:
            r12 = r8
        L_0x0087:
            com.fyber.inneractive.sdk.util.d0$a r5 = com.fyber.inneractive.sdk.util.C5320d0.m16717a(r1, r9, r5, r11, r12)
            int r11 = com.fyber.inneractive.sdk.util.IAlog.f14137a
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r13 = "VAST_EVENT"
            r12[r7] = r13
            r12[r10] = r5
            r13 = 2
            r12[r13] = r9
            java.lang.String r14 = "%s EVENT_CLICK %s %s"
            com.fyber.inneractive.sdk.util.IAlog.m16697a(r10, r8, r14, r12)
            com.fyber.inneractive.sdk.util.d0$c r12 = r5.f14158a
            com.fyber.inneractive.sdk.util.d0$c r14 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            java.lang.String r15 = "is_auto_click"
            if (r12 != r14) goto L_0x014a
            com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.C4565o.CLICK_PARSING_FAILURE
            boolean r3 = r0.f10924e
            if (r3 != 0) goto L_0x0140
            r0.f10924e = r10
            java.lang.Throwable r3 = r5.f14159b
            if (r3 != 0) goto L_0x00b5
            java.lang.String r3 = "null-exception!"
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r3 = r3.getMessage()
        L_0x00b9:
            AdContent r11 = r0.f10921b     // Catch:{ all -> 0x0140 }
            if (r11 != 0) goto L_0x00c9
            com.fyber.inneractive.sdk.network.q$a r11 = new com.fyber.inneractive.sdk.network.q$a     // Catch:{ all -> 0x0140 }
            r11.<init>(r8)     // Catch:{ all -> 0x0140 }
            r11.f11364b = r1     // Catch:{ all -> 0x0140 }
            r11.f11363a = r8     // Catch:{ all -> 0x0140 }
            r11.f11366d = r8     // Catch:{ all -> 0x0140 }
            goto L_0x00e4
        L_0x00c9:
            com.fyber.inneractive.sdk.network.q$a r11 = new com.fyber.inneractive.sdk.network.q$a     // Catch:{ all -> 0x0140 }
            AdContent r12 = r0.f10921b     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r14 = r12.f10913a     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.response.e r12 = r12.mo24367c()     // Catch:{ all -> 0x0140 }
            AdContent r8 = r0.f10921b     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.config.global.s r8 = r8.f10915c     // Catch:{ all -> 0x0140 }
            org.json.JSONArray r8 = r8.mo24342c()     // Catch:{ all -> 0x0140 }
            r11.<init>(r12)     // Catch:{ all -> 0x0140 }
            r11.f11364b = r1     // Catch:{ all -> 0x0140 }
            r11.f11363a = r14     // Catch:{ all -> 0x0140 }
            r11.f11366d = r8     // Catch:{ all -> 0x0140 }
        L_0x00e4:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            if (r9 != 0) goto L_0x00ee
            java.lang.String r8 = "null"
            goto L_0x00ef
        L_0x00ee:
            r8 = r9
        L_0x00ef:
            r1.put(r6, r8)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00fc
        L_0x00f3:
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r12[r7] = r6     // Catch:{ all -> 0x0140 }
            r12[r10] = r8     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r4, r12)     // Catch:{ all -> 0x0140 }
        L_0x00fc:
            java.lang.String r6 = "message"
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0140 }
            if (r8 == 0) goto L_0x0106
            java.lang.String r3 = "empty"
        L_0x0106:
            r1.put(r6, r3)     // Catch:{ Exception -> 0x010a }
            goto L_0x0113
        L_0x010a:
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r8[r7] = r6     // Catch:{ all -> 0x0140 }
            r8[r10] = r3     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r4, r8)     // Catch:{ all -> 0x0140 }
        L_0x0113:
            java.lang.String r3 = "ctx_name"
            java.lang.String r6 = r5.f14160c     // Catch:{ all -> 0x0140 }
            r1.put(r3, r6)     // Catch:{ Exception -> 0x011b }
            goto L_0x0124
        L_0x011b:
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r8[r7] = r3     // Catch:{ all -> 0x0140 }
            r8[r10] = r6     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r4, r8)     // Catch:{ all -> 0x0140 }
        L_0x0124:
            org.json.JSONArray r3 = r11.f11368f     // Catch:{ all -> 0x0140 }
            r3.put(r1)     // Catch:{ all -> 0x0140 }
            boolean r2 = r2.f14232c     // Catch:{ all -> 0x0140 }
            if (r2 == 0) goto L_0x013c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0140 }
            r1.put(r15, r2)     // Catch:{ Exception -> 0x0133 }
            goto L_0x013c
        L_0x0133:
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r1[r7] = r15     // Catch:{ all -> 0x0140 }
            r1[r10] = r2     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r4, r1)     // Catch:{ all -> 0x0140 }
        L_0x013c:
            r1 = 0
            r11.mo24768a((java.lang.String) r1)     // Catch:{ all -> 0x0140 }
        L_0x0140:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r7] = r9
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - failed opening URL %s"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            return r5
        L_0x014a:
            boolean r4 = r0.f10927h
            if (r4 != 0) goto L_0x02ad
            r0.f10927h = r10
            AdContent r4 = r0.f10921b
            if (r4 != 0) goto L_0x016a
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = "InneractiveAdRendererImpl: no ad content?"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r8, r4)
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4567p.FYBER_SUCCESS_CLICK
            r12 = 0
            r4.<init>(r12)
            r4.f11365c = r8
            r4.f11363a = r12
            r4.f11366d = r12
            goto L_0x018e
        L_0x016a:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = "InneractiveAdRendererImpl: ad content exists!"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r8, r4)
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4567p.FYBER_SUCCESS_CLICK
            AdContent r12 = r0.f10921b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r14 = r12.f10913a
            com.fyber.inneractive.sdk.response.e r12 = r12.mo24367c()
            AdContent r11 = r0.f10921b
            com.fyber.inneractive.sdk.config.global.s r11 = r11.f10915c
            org.json.JSONArray r11 = r11.mo24342c()
            r4.<init>(r12)
            r4.f11365c = r8
            r4.f11363a = r14
            r4.f11366d = r11
        L_0x018e:
            com.fyber.inneractive.sdk.network.q$b r8 = new com.fyber.inneractive.sdk.network.q$b
            r8.<init>()
            com.fyber.inneractive.sdk.network.q$b r11 = r8.mo24770a(r6, r9)
            com.fyber.inneractive.sdk.util.d0$c r12 = r5.f14158a
            java.lang.String r12 = r12.toString()
            java.lang.String r14 = "opened_from"
            com.fyber.inneractive.sdk.network.q$b r11 = r11.mo24770a(r14, r12)
            java.lang.String r12 = "opened_by"
            java.lang.String r14 = "renderer"
            com.fyber.inneractive.sdk.network.q$b r11 = r11.mo24770a(r12, r14)
            java.lang.String r12 = "origin"
            r11.mo24770a(r12, r3)
            boolean r11 = r2.f14232c
            if (r11 == 0) goto L_0x01bb
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8.mo24770a(r15, r2)
            goto L_0x026e
        L_0x01bb:
            float r11 = r2.f14230a
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ca
            float r11 = r2.f14231b
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ca
            r11 = r10
            goto L_0x01cb
        L_0x01ca:
            r11 = r7
        L_0x01cb:
            if (r11 == 0) goto L_0x026e
            boolean r11 = r16.mo24608y()
            int r14 = r16.mo24607x()
            if (r11 == 0) goto L_0x01d8
            goto L_0x01dc
        L_0x01d8:
            int r14 = com.fyber.inneractive.sdk.util.C5350l.m16760b((int) r14)
        L_0x01dc:
            if (r14 != 0) goto L_0x01e0
            r11 = r12
            goto L_0x01e4
        L_0x01e0:
            float r11 = r2.f14230a
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x01e4:
            boolean r14 = r16.mo24608y()
            int r15 = r16.mo24606w()
            if (r14 == 0) goto L_0x01ef
            goto L_0x01f3
        L_0x01ef:
            int r15 = com.fyber.inneractive.sdk.util.C5350l.m16760b((int) r15)
        L_0x01f3:
            if (r15 != 0) goto L_0x01f6
            goto L_0x01fb
        L_0x01f6:
            float r2 = r2.f14231b
            float r12 = (float) r15
            float r12 = r2 / r12
        L_0x01fb:
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Float r14 = java.lang.Float.valueOf(r11)
            r2[r7] = r14
            java.lang.Float r14 = java.lang.Float.valueOf(r12)
            r2[r10] = r14
            java.lang.String r14 = "Point location -  x - %.2f , y- %.2f"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r14, r2)
            boolean r2 = r16.mo24608y()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r14[r7] = r11
            java.lang.String r11 = "%.2f"
            java.lang.String r14 = java.lang.String.format(r2, r11, r14)
            java.lang.String r15 = "td_x"
            com.fyber.inneractive.sdk.network.q$b r14 = r8.mo24770a(r15, r14)
            boolean r15 = r16.mo24608y()
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r15[r7] = r12
            java.lang.String r2 = java.lang.String.format(r2, r11, r15)
            java.lang.String r11 = "td_y"
            r14.mo24770a(r11, r2)
            boolean r2 = r16.mo24608y()
            if (r2 == 0) goto L_0x0254
            int r2 = com.fyber.inneractive.sdk.util.C5350l.m16764c()
            if (r2 != r10) goto L_0x024c
            java.lang.String r2 = "p"
            goto L_0x024e
        L_0x024c:
            java.lang.String r2 = "l"
        L_0x024e:
            java.lang.String r11 = "o"
            r8.mo24770a(r11, r2)
            goto L_0x026e
        L_0x0254:
            int r2 = r16.mo24607x()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = "b_w"
            r8.mo24770a(r11, r2)
            int r2 = r16.mo24606w()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = "b_h"
            r8.mo24770a(r11, r2)
        L_0x026e:
            com.fyber.inneractive.sdk.util.e r2 = com.fyber.inneractive.sdk.util.C5325e.VAST_ENDCARD
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02a2
            AdContent r2 = r0.f10921b
            if (r2 == 0) goto L_0x0287
            com.fyber.inneractive.sdk.config.global.s r2 = r2.f10915c
            if (r2 == 0) goto L_0x0287
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.b> r3 = com.fyber.inneractive.sdk.config.global.features.C4284b.class
            com.fyber.inneractive.sdk.config.global.features.e r2 = r2.mo24338a(r3)
            com.fyber.inneractive.sdk.config.global.features.b r2 = (com.fyber.inneractive.sdk.config.global.features.C4284b) r2
            goto L_0x0288
        L_0x0287:
            r2 = 0
        L_0x0288:
            if (r2 == 0) goto L_0x0296
            com.fyber.inneractive.sdk.model.vast.a r2 = r2.f10624e
            if (r2 == 0) goto L_0x0291
            boolean r2 = r2.f11059d
            goto L_0x0292
        L_0x0291:
            r2 = r7
        L_0x0292:
            if (r2 == 0) goto L_0x0296
            r2 = r10
            goto L_0x0297
        L_0x0296:
            r2 = r7
        L_0x0297:
            if (r2 == 0) goto L_0x02a2
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            java.lang.String r2 = r2.f10551p
            java.lang.String r3 = "cta_lng"
            r8.mo24770a(r3, r2)
        L_0x02a2:
            org.json.JSONArray r2 = r4.f11368f
            org.json.JSONObject r3 = r8.f11378a
            r2.put(r3)
            r2 = 0
            r4.mo24768a((java.lang.String) r2)
        L_0x02ad:
            if (r1 == 0) goto L_0x02d5
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r16)
            r1[r7] = r2
            java.lang.String r2 = "%sBlocking clicks until grace has ended"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            r0.f10928i = r7
            java.lang.Runnable r1 = r0.f10929j
            if (r1 == 0) goto L_0x02c7
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.C5357n.f14225b
            r2.removeCallbacks(r1)
        L_0x02c7:
            com.fyber.inneractive.sdk.flow.k r1 = new com.fyber.inneractive.sdk.flow.k
            r1.<init>(r0)
            r0.f10929j = r1
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.C5357n.f14225b
            r3 = 1500(0x5dc, double:7.41E-321)
            r2.postDelayed(r1, r3)
        L_0x02d5:
            com.fyber.inneractive.sdk.util.d0$c r1 = r5.f14158a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_APPLICATION
            if (r1 != r2) goto L_0x02eb
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in external application"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            EventsListener r1 = r0.f10922c
            if (r1 == 0) goto L_0x035d
            r16.mo24596B()
            goto L_0x035d
        L_0x02eb:
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPENED_IN_INTERNAL_BROWSER
            if (r1 != r2) goto L_0x02fc
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in internal browser"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            r0.f10923d = r10
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setInternalBrowserListener(r16)
            goto L_0x035d
        L_0x02fc:
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_BROWSER
            if (r1 == r2) goto L_0x0304
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r2) goto L_0x035d
        L_0x0304:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "InneractiveAdRendererImpl: handleOpenResult - opened in external browser"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r3, r2)
            AdContent r2 = r0.f10921b
            if (r2 == 0) goto L_0x0318
            com.fyber.inneractive.sdk.response.e r2 = r2.mo24367c()
            AdContent r3 = r0.f10921b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r3 = r3.f10913a
            goto L_0x031a
        L_0x0318:
            r2 = 0
            r3 = 0
        L_0x031a:
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4567p.EXTERNAL_BROWSER_OPENED
            r4.<init>(r2)
            r4.f11365c = r8
            r4.f11363a = r3
            r2 = 0
            r4.f11366d = r2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r7] = r6
            r2[r10] = r9
            com.fyber.inneractive.sdk.network.q$a r2 = r4.mo24767a((java.lang.Object[]) r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "fallback"
            r3[r7] = r4
            com.fyber.inneractive.sdk.util.d0$c r4 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r4) goto L_0x0340
            java.lang.String r1 = "chrome"
            goto L_0x0342
        L_0x0340:
            java.lang.String r1 = "na"
        L_0x0342:
            r3[r10] = r1
            AdContent r1 = r0.f10921b
            com.fyber.inneractive.sdk.config.global.s r1 = r1.f10915c
            org.json.JSONArray r1 = r1.mo24342c()
            r3[r13] = r1
            com.fyber.inneractive.sdk.network.q$a r1 = r2.mo24767a((java.lang.Object[]) r3)
            r2 = 0
            r1.mo24768a((java.lang.String) r2)
            EventsListener r1 = r0.f10922c
            if (r1 == 0) goto L_0x035d
            r16.mo24596B()
        L_0x035d:
            return r5
        L_0x035e:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - external/browser is already opened"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "external/browser is already open"
            r3.<init>(r4)
            r1.<init>(r2, r3, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4421l.mo24599a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.p0, com.fyber.inneractive.sdk.util.e):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: b */
    public void mo24605b(String str) {
        C4547h0 h0Var = new C4547h0(new C4422a(this, str, System.currentTimeMillis()), str);
        IAConfigManager.f10525J.f10555t.f11387a.offer(h0Var);
        h0Var.mo24717a(C4559m0.QUEUED);
    }

    /* renamed from: a */
    public void mo24602a(C5291e eVar) {
        String str = eVar.f14077l;
        if (str != null && str.trim().length() > 0) {
            int i = IAlog.f14137a;
            IAlog.m16697a(1, (Exception) null, "AD_CLICKED", new Object[0]);
            mo24605b(str);
        }
    }

    /* renamed from: a */
    public void mo24603a(String str) {
        if (!this.f10926g) {
            this.f10926g = true;
            C4567p pVar = C4567p.VAST_EVENT_COMPANION_CLICKED;
            AdContent adcontent = this.f10921b;
            InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f10913a : null;
            C5291e c = adcontent != null ? adcontent.mo24367c() : null;
            AdContent adcontent2 = this.f10921b;
            JSONArray c2 = adcontent2 != null ? adcontent2.f10915c.mo24342c() : null;
            C4569q.C4570a aVar = new C4569q.C4570a(c);
            aVar.f11365c = pVar;
            aVar.f11363a = inneractiveAdRequest;
            aVar.f11366d = c2;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "na";
            }
            try {
                jSONObject.put("mime", str);
            } catch (Exception unused) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "mime", str);
            }
            aVar.f11368f.put(jSONObject);
            aVar.mo24768a((String) null);
        }
    }

    /* renamed from: a */
    public void mo24601a(InneractiveUnitController.AdDisplayError adDisplayError) {
        String simpleName = adDisplayError.getClass().getSimpleName();
        String message = adDisplayError.getMessage();
        AdContent adcontent = this.f10921b;
        C5291e eVar = null;
        InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f10913a : null;
        if (adcontent != null) {
            eVar = adcontent.mo24367c();
        }
        C4574r.m14050a(simpleName, message, inneractiveAdRequest, eVar);
        if (this.f10922c != null) {
            IAlog.m16699a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.m16696a((Object) this), adDisplayError.getMessage());
            this.f10922c.onAdEnteredErrorState(this.f10920a, adDisplayError);
        }
    }

    /* renamed from: a */
    public void mo24600a(C4250a aVar, C4251b bVar) {
        C4247d dVar = IAConfigManager.f10525J.f10559x.f10601a;
        if (dVar != null) {
            C5357n.m16773a(new C4246c(dVar, aVar, bVar));
        }
    }
}
