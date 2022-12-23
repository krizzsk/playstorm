package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.C6433j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C6663i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6706o;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6765c;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.C6780n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.X */
final class C6533X extends C6714p implements C6433j, C6455B, C6538Y, C6635ag, C6650c, C6660g {

    /* renamed from: A */
    private Boolean f16801A;

    /* renamed from: B */
    private C6537a f16802B;

    /* renamed from: C */
    private int f16803C;

    /* renamed from: D */
    private String f16804D = "";

    /* renamed from: E */
    private boolean f16805E = false;

    /* renamed from: F */
    private NetworkStateReceiver f16806F;

    /* renamed from: G */
    private C6792z f16807G;

    /* renamed from: d */
    final ConcurrentHashMap<String, C6539Z> f16808d;

    /* renamed from: e */
    C6780n f16809e;

    /* renamed from: f */
    C6661h f16810f;

    /* renamed from: g */
    C6663i f16811g;

    /* renamed from: h */
    String f16812h;

    /* renamed from: i */
    JSONObject f16813i;

    /* renamed from: j */
    int f16814j = 1;

    /* renamed from: k */
    long f16815k;

    /* renamed from: l */
    private CopyOnWriteArrayList<C6539Z> f16816l;

    /* renamed from: m */
    private List<C6758b> f16817m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C6758b> f16818n;

    /* renamed from: o */
    private ConcurrentHashMap<String, C6663i.C6664a> f16819o;

    /* renamed from: p */
    private C6758b f16820p;

    /* renamed from: q */
    private C6631af f16821q;

    /* renamed from: r */
    private boolean f16822r;

    /* renamed from: s */
    private boolean f16823s;

    /* renamed from: t */
    private boolean f16824t;

    /* renamed from: u */
    private String f16825u;

    /* renamed from: v */
    private long f16826v;

    /* renamed from: w */
    private long f16827w;

    /* renamed from: x */
    private int f16828x;

    /* renamed from: y */
    private boolean f16829y;

    /* renamed from: z */
    private boolean f16830z;

    /* renamed from: com.ironsource.mediationsdk.X$a */
    enum C6537a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6533X(List<NetworkSettings> list, C6706o oVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C6706o oVar2 = oVar;
        long time = new Date().getTime();
        mo36322a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo36324a(C6537a.RV_STATE_INITIATING);
        this.f16801A = null;
        this.f16828x = oVar2.f17545c;
        this.f16829y = oVar2.f17546d;
        this.f16825u = "";
        C6765c cVar = oVar2.f17554l;
        this.f16830z = false;
        this.f16816l = new CopyOnWriteArrayList<>();
        this.f16817m = new ArrayList();
        this.f16818n = new ConcurrentHashMap<>();
        this.f16819o = new ConcurrentHashMap<>();
        this.f16827w = new Date().getTime();
        this.f16822r = cVar.f17673e > 0;
        this.f16823s = cVar.f17681m;
        this.f16824t = !cVar.f17682n;
        this.f16826v = cVar.f17680l;
        if (this.f16822r) {
            this.f16810f = new C6661h("rewardedVideo", cVar, this);
        }
        this.f16821q = new C6631af(cVar, this);
        this.f16808d = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C6653d.m20285a().mo36662a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C6655e a2 = C6655e.m20304a();
                if (a2.mo36670a(a, a2.f17296b, "rewarded video")) {
                    C6539Z z = r0;
                    C6539Z z2 = new C6539Z(str, str2, next, this, oVar2.f17547e, a);
                    String k = z.mo36401k();
                    this.f16808d.put(k, z);
                    arrayList.add(k);
                }
            }
        }
        this.f16811g = new C6663i(arrayList, cVar.f17674f);
        this.f16809e = new C6780n(new ArrayList(this.f16808d.values()));
        for (C6539Z next2 : this.f16808d.values()) {
            if (next2.mo36398h()) {
                next2.mo36344b();
            }
        }
        mo36323a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C6399a.C64001.m19216a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.f16807G = new C6792z(oVar2.f17551i, this);
        m19797a(cVar.f17677i);
    }

    /* renamed from: a */
    private String m19795a(C6758b bVar) {
        C6539Z z = this.f16808d.get(bVar.mo36939a());
        String num = z != null ? Integer.toString(z.mo36399i()) : TextUtils.isEmpty(bVar.mo36940b()) ? "1" : "2";
        return num + bVar.mo36939a();
    }

    /* renamed from: a */
    private void m19796a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z2 && !TextUtils.isEmpty(this.f16812h)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16812h);
        }
        JSONObject jSONObject = this.f16813i;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16813i);
        }
        if (z && !TextUtils.isEmpty(this.f16825u)) {
            hashMap.put("placement", this.f16825u);
        }
        if (m19808c(i)) {
            C6557h.m19950d();
            C6557h.m19888a((Map<String, Object>) hashMap, this.f16803C, this.f16804D);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16814j));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6557h.m19950d().mo36371b(new C6552c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m19797a(long j) {
        if (this.f16809e.mo36986a()) {
            mo36329b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo36336g();
            return;
        }
        mo36844a_();
        if (this.f16822r) {
            if (!this.f16819o.isEmpty()) {
                this.f16811g.mo36681a(this.f16819o);
                this.f16819o.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C6533X x = C6533X.this;
                    x.mo36324a(C6537a.RV_STATE_AUCTION_IN_PROGRESS);
                    AsyncTask.execute(new Runnable() {
                        public final void run() {
                            StringBuilder sb;
                            C6533X.m19798a("makeAuction()");
                            C6533X.this.f16812h = "";
                            C6533X.this.f16813i = null;
                            C6533X.this.mo36838a(IronSource.AD_UNIT.REWARDED_VIDEO);
                            C6533X.this.f16815k = new Date().getTime();
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (C6539Z next : C6533X.this.f16808d.values()) {
                                if (next.mo36398h()) {
                                    next.f16845b = false;
                                }
                                if (!C6533X.this.f16809e.mo36987b(next)) {
                                    if (next.mo36398h()) {
                                        Map<String, Object> a = next.mo36195a();
                                        if (a != null) {
                                            hashMap.put(next.mo36401k(), a);
                                            sb = new StringBuilder();
                                        }
                                    } else {
                                        arrayList.add(next.mo36401k());
                                        sb = new StringBuilder();
                                    }
                                    sb.append(next.mo36399i());
                                    sb.append(next.mo36401k());
                                    sb.append(",");
                                    sb2.append(sb.toString());
                                }
                            }
                            if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                C6533X.this.mo36329b((int) IronSourceConstants.RV_AUCTION_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                C6533X.m19798a("makeAuction() failed - No candidates available for auctioning");
                                C6533X.this.mo36336g();
                                return;
                            }
                            C6533X.m19798a("makeAuction() - request waterfall is: " + sb2);
                            C6533X.this.mo36322a(1000);
                            C6533X.this.mo36322a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                            C6533X.this.mo36323a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                            C6533X.this.f16810f.mo36677a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6533X.this.f16811g, C6533X.this.f16814j, C6533X.this.f17576b);
                        }
                    });
                }
            }, j);
            return;
        }
        IronLog.INTERNAL.verbose("auction is disabled, fallback flow will occur");
        m19810h();
        if (this.f16817m.isEmpty()) {
            mo36329b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36336g();
            return;
        }
        mo36322a(1000);
        if (!this.f16824t || !this.f16830z) {
            mo36335f();
        }
    }

    /* renamed from: a */
    static void m19798a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m19799a(List<C6758b> list) {
        this.f16817m = list;
        StringBuilder sb = new StringBuilder();
        for (C6758b a : list) {
            sb.append(m19795a(a) + ",");
        }
        m19798a("updateNextWaterfallToLoad() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m19798a("Updated waterfall is empty");
        }
        mo36329b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m19800a(boolean z, Map<String, Object> map) {
        Boolean bool = this.f16801A;
        if (bool == null || bool.booleanValue() != z) {
            this.f16801A = Boolean.valueOf(z);
            long time = new Date().getTime() - this.f16827w;
            this.f16827w = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("duration", Long.valueOf(time));
            mo36329b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            C6569ac.m19976a().mo36420a(z, this.f17577c);
        }
    }

    /* renamed from: b */
    private void m19801b(int i) {
        m19796a(i, new HashMap(), true, true);
    }

    /* renamed from: b */
    private static void m19802b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private void m19803b(List<C6758b> list) {
        this.f16816l.clear();
        this.f16818n.clear();
        this.f16819o.clear();
        for (C6758b next : list) {
            C6539Z z = this.f16808d.get(next.mo36939a());
            if (z != null) {
                z.f16972e = true;
                this.f16816l.add(z);
                this.f16818n.put(z.mo36401k(), next);
                this.f16819o.put(next.mo36939a(), C6663i.C6664a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m19798a("updateWaterfall() - could not find matching smash for auction response item " + next.mo36939a());
            }
        }
        this.f16817m.clear();
    }

    /* renamed from: b */
    private void m19804b(boolean z) {
        m19800a(z, (Map<String, Object>) new HashMap());
    }

    /* renamed from: c */
    private void m19805c(int i, Map<String, Object> map) {
        m19796a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m19806c(C6539Z z, String str) {
        String str2 = z.mo36401k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    /* renamed from: c */
    private static void m19807c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m19808c(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    /* renamed from: e */
    private void m19809e(C6539Z z) {
        String b = this.f16818n.get(z.mo36401k()).mo36940b();
        C6656f.m20309a();
        C6539Z z2 = z;
        z2.mo36342a(b, this.f16812h, this.f16813i, this.f16803C, this.f16804D, this.f16814j, C6656f.m20320d(b));
    }

    /* renamed from: h */
    private void m19810h() {
        this.f16812h = m20437d();
        m19799a(m19811i());
    }

    /* renamed from: i */
    private List<C6758b> m19811i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6539Z next : this.f16808d.values()) {
            if (!next.mo36398h() && !this.f16809e.mo36987b(next)) {
                copyOnWriteArrayList.add(new C6758b(next.mo36401k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: j */
    private void m19812j() {
        if (this.f16816l.isEmpty()) {
            mo36329b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36336g();
            return;
        }
        mo36324a(C6537a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f16816l.size() && i < this.f16828x; i2++) {
            C6539Z z = this.f16816l.get(i2);
            if (z.f16972e) {
                if (!this.f16829y || !z.mo36398h()) {
                    m19809e(z);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + z.mo36401k() + ". No other instances will be loaded at the same time.";
                    m19798a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m19809e(z);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + z.mo36401k() + " as a non bidder is being loaded";
                    m19798a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36322a(int i) {
        m19796a(i, new HashMap(), false, false);
    }

    /* renamed from: a */
    public final void mo36176a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m19798a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f16803C = i2;
        this.f16804D = str2;
        this.f16813i = null;
        m19810h();
        if (TextUtils.isEmpty(str)) {
            map = C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            map = C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        mo36329b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        if (!this.f16824t || !this.f16830z) {
            mo36335f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36323a(int i, Map<String, Object> map) {
        m19796a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo36001a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f16805E = z;
            if (z) {
                if (this.f16806F == null) {
                    this.f16806F = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f16806F, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f16806F != null) {
                context.getApplicationContext().unregisterReceiver(this.f16806F);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36324a(C6537a aVar) {
        m19798a("current state=" + this.f16802B + ", new state=" + aVar);
        this.f16802B = aVar;
    }

    /* renamed from: a */
    public final void mo36325a(C6539Z z) {
        synchronized (this) {
            this.f16814j++;
            m19806c(z, "onRewardedVideoAdOpened");
            if (this.f16822r) {
                C6758b bVar = this.f16818n.get(z.mo36401k());
                if (bVar != null) {
                    mo36840a(bVar.mo36938a(this.f16825u));
                    C6661h.m20331a(bVar, z.mo36399i(), this.f16820p, this.f16825u);
                    this.f16819o.put(z.mo36401k(), C6663i.C6664a.ISAuctionPerformanceShowedSuccessfully);
                    mo36842a(bVar, this.f16825u);
                } else {
                    String k = z.mo36401k();
                    m19802b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                    mo36329b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f16802B}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
                }
            }
            C6569ac.m19976a().mo36416a(this.f17577c);
            this.f16821q.mo36620a();
        }
    }

    /* renamed from: a */
    public final void mo36326a(C6539Z z, Placement placement) {
        m19806c(z, "onRewardedVideoAdRewarded");
        C6569ac.m19976a().mo36419a(placement, this.f17577c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0148, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36327a(com.ironsource.mediationsdk.C6539Z r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "onLoadSuccess "
            m19806c((com.ironsource.mediationsdk.C6539Z) r12, (java.lang.String) r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r11.f16812h     // Catch:{ all -> 0x0149 }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r11.f16812h     // Catch:{ all -> 0x0149 }
            boolean r0 = r13.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "onLoadSuccess was invoked with auctionId: "
            r0.<init>(r4)     // Catch:{ all -> 0x0149 }
            r0.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = " and the current id is "
            r0.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r11.f16812h     // Catch:{ all -> 0x0149 }
            r0.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0149 }
            m19798a((java.lang.String) r13)     // Catch:{ all -> 0x0149 }
            r13 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = "errorCode"
            r4[r1] = r5     // Catch:{ all -> 0x0149 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0149 }
            r4[r3] = r5     // Catch:{ all -> 0x0149 }
            r0[r1] = r4     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "reason"
            r2[r1] = r4     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "onLoadSuccess wrong auction ID "
            r1.<init>(r4)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.X$a r4 = r11.f16802B     // Catch:{ all -> 0x0149 }
            r1.append(r4)     // Catch:{ all -> 0x0149 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0149 }
            r2[r3] = r1     // Catch:{ all -> 0x0149 }
            r0[r3] = r2     // Catch:{ all -> 0x0149 }
            r12.mo36345b(r13, r0)     // Catch:{ all -> 0x0149 }
            monitor-exit(r11)
            return
        L_0x0062:
            com.ironsource.mediationsdk.X$a r0 = r11.f16802B     // Catch:{ all -> 0x0149 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r4 = r11.f16819o     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = r12.mo36401k()     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C6663i.C6664a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0149 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.X$a r4 = r11.f16802B     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.X$a r5 = com.ironsource.mediationsdk.C6533X.C6537a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0149 }
            if (r4 != r5) goto L_0x0147
            com.ironsource.mediationsdk.X$a r4 = com.ironsource.mediationsdk.C6533X.C6537a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0149 }
            r11.mo36324a((com.ironsource.mediationsdk.C6533X.C6537a) r4)     // Catch:{ all -> 0x0149 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0149 }
            r4.<init>()     // Catch:{ all -> 0x0149 }
            long r4 = r4.getTime()     // Catch:{ all -> 0x0149 }
            long r6 = r11.f16815k     // Catch:{ all -> 0x0149 }
            long r4 = r4 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r9 = "duration"
            r8[r1] = r9     // Catch:{ all -> 0x0149 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0149 }
            r8[r3] = r4     // Catch:{ all -> 0x0149 }
            r7[r1] = r8     // Catch:{ all -> 0x0149 }
            java.util.Map r4 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0149 }
            r11.mo36329b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.z r4 = r11.f16807G     // Catch:{ all -> 0x0149 }
            r5 = 0
            r4.mo37016a(r5)     // Catch:{ all -> 0x0149 }
            boolean r4 = r11.f16822r     // Catch:{ all -> 0x0149 }
            if (r4 == 0) goto L_0x0144
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r4 = r11.f16818n     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = r12.mo36401k()     // Catch:{ all -> 0x0149 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0149 }
            r10 = r4
            com.ironsource.mediationsdk.server.b r10 = (com.ironsource.mediationsdk.server.C6758b) r10     // Catch:{ all -> 0x0149 }
            if (r10 == 0) goto L_0x00de
            java.lang.String r13 = ""
            com.ironsource.mediationsdk.impressionData.ImpressionData r13 = r10.mo36938a(r13)     // Catch:{ all -> 0x0149 }
            r11.mo36840a((com.ironsource.mediationsdk.impressionData.ImpressionData) r13)     // Catch:{ all -> 0x0149 }
            int r13 = r12.mo36399i()     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.server.b r0 = r11.f16820p     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.C6661h.m20330a(r10, r13, r0)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.h r5 = r11.f16810f     // Catch:{ all -> 0x0149 }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Z> r13 = r11.f16816l     // Catch:{ all -> 0x0149 }
            r6 = r13
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x0149 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r7 = r11.f16818n     // Catch:{ all -> 0x0149 }
            int r8 = r12.mo36399i()     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.server.b r9 = r11.f16820p     // Catch:{ all -> 0x0149 }
            r5.mo36678a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C6560aa>) r6, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C6758b>) r7, (int) r8, (com.ironsource.mediationsdk.server.C6758b) r9, (com.ironsource.mediationsdk.server.C6758b) r10)     // Catch:{ all -> 0x0149 }
            goto L_0x0144
        L_0x00de:
            java.lang.String r12 = r12.mo36401k()     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = "onLoadSuccess winner instance "
            r4.<init>(r5)     // Catch:{ all -> 0x0149 }
            r4.append(r12)     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = " missing from waterfall. auctionId: "
            r4.append(r5)     // Catch:{ all -> 0x0149 }
            r4.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = " and the current id is "
            r4.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r11.f16812h     // Catch:{ all -> 0x0149 }
            r4.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0149 }
            m19802b((java.lang.String) r13)     // Catch:{ all -> 0x0149 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r4 = 3
            java.lang.Object[][] r4 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r6 = "errorCode"
            r5[r1] = r6     // Catch:{ all -> 0x0149 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0149 }
            r5[r3] = r6     // Catch:{ all -> 0x0149 }
            r4[r1] = r5     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r6 = "reason"
            r5[r1] = r6     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = "Loaded missing "
            r6.<init>(r7)     // Catch:{ all -> 0x0149 }
            r6.append(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0149 }
            r5[r3] = r0     // Catch:{ all -> 0x0149 }
            r4[r3] = r5     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = "ext1"
            r0[r1] = r5     // Catch:{ all -> 0x0149 }
            r0[r3] = r12     // Catch:{ all -> 0x0149 }
            r4[r2] = r0     // Catch:{ all -> 0x0149 }
            java.util.Map r12 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r4)     // Catch:{ all -> 0x0149 }
            r11.mo36329b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r12)     // Catch:{ all -> 0x0149 }
        L_0x0144:
            r11.m19804b((boolean) r3)     // Catch:{ all -> 0x0149 }
        L_0x0147:
            monitor-exit(r11)
            return
        L_0x0149:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6533X.mo36327a(com.ironsource.mediationsdk.Z, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo36328a(IronSourceError ironSourceError, C6539Z z) {
        C6758b bVar;
        synchronized (this) {
            if (this.f16822r && (bVar = this.f16818n.get(z.mo36401k())) != null) {
                mo36840a(bVar.mo36938a(this.f16825u));
            }
            m19806c(z, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            m19805c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            C6569ac.m19976a().mo36418a(ironSourceError, this.f17577c);
            this.f16830z = false;
            this.f16819o.put(z.mo36401k(), C6663i.C6664a.ISAuctionPerformanceFailedToShow);
            if (this.f16802B != C6537a.RV_STATE_READY_TO_SHOW) {
                m19804b(false);
            }
            this.f16821q.mo36622c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo36002a(Placement placement) {
        if (placement == null) {
            m19807c("showRewardedVideo error: empty default placement");
            C6569ac.m19976a().mo36418a(new IronSourceError(1021, "showRewardedVideo error: empty default placement"), this.f17577c);
            m19796a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.f16825u = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 0);
        m19801b((int) IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.f16830z) {
            m19807c("showRewardedVideo error: can't show ad while an ad is already showing");
            C6569ac.m19976a().mo36418a(new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing"), this.f17577c);
            m19805c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.f16802B != C6537a.RV_STATE_READY_TO_SHOW) {
            m19807c("showRewardedVideo error: show called while no ads are available");
            C6569ac.m19976a().mo36418a(new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available"), this.f17577c);
            m19805c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (C6774k.m20615c(ContextProvider.getInstance().getApplicationContext(), this.f16825u)) {
            String str = "showRewardedVideo error: placement " + this.f16825u + " is capped";
            m19807c(str);
            C6569ac.m19976a().mo36418a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str), this.f17577c);
            m19805c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<C6539Z> it = this.f16816l.iterator();
            while (it.hasNext()) {
                C6539Z next = it.next();
                if (next.mo36346c()) {
                    this.f16830z = true;
                    next.mo36343a(true, this.f16814j);
                    m19798a("showVideo()");
                    this.f16809e.mo36985a(next);
                    if (this.f16809e.mo36987b(next)) {
                        next.mo36347f();
                        IronSourceUtils.sendAutomationLog(next.mo36401k() + " rewarded video is now session capped");
                    }
                    C6774k.m20617e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (C6774k.m20615c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        m19801b((int) IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.f16807G.mo37015a();
                    next.mo36341a(placement, this.f16814j);
                    mo36324a(C6537a.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.mo36405o() != null) {
                    stringBuffer.append(next.mo36401k() + CertificateUtil.DELIMITER + next.mo36405o() + ",");
                }
                next.mo36343a(false, this.f16814j);
            }
            m19798a("showRewardedVideo(): No ads to show");
            C6569ac.m19976a().mo36418a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), this.f17577c);
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            m19805c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, (Map<String, Object>) hashMap);
            this.f16821q.mo36622c();
        }
    }

    /* renamed from: a */
    public final void mo36182a(List<C6758b> list, String str, C6758b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        m19798a("makeAuction(): success");
        this.f16812h = str;
        this.f16820p = bVar;
        this.f16813i = jSONObject;
        this.f16803C = i;
        this.f16804D = "";
        if (!TextUtils.isEmpty(str2)) {
            mo36329b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        mo36843a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f17575a.mo36955a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            mo36329b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}}));
            mo36336g();
            return;
        }
        mo36329b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C6399a.C64001.m19216a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
        m19799a(list);
        if (!this.f16824t || !this.f16830z) {
            mo36335f();
        }
    }

    /* renamed from: a */
    public final void mo35940a(boolean z) {
        if (this.f16805E) {
            boolean z2 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            Boolean bool = this.f16801A;
            if (bool != null && ((z && !bool.booleanValue() && mo36003c()) || (!z && this.f16801A.booleanValue()))) {
                z2 = true;
            }
            if (z2) {
                m19804b(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36329b(int i, Map<String, Object> map) {
        m19796a(i, map, false, true);
    }

    /* renamed from: b */
    public final void mo36330b(C6539Z z) {
        synchronized (this) {
            z.mo36340a((int) IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            m19806c(z, "onRewardedVideoAdClosed, mediation state: " + this.f16802B.name());
            C6569ac.m19976a().mo36422b(this.f17577c);
            this.f16830z = false;
            if (this.f16802B != C6537a.RV_STATE_READY_TO_SHOW) {
                m19804b(false);
            }
            if (!this.f16823s) {
                this.f16821q.mo36621b();
            } else if (this.f16817m != null && this.f16817m.size() > 0) {
                new Timer().schedule(new TimerTask() {
                    public final void run() {
                        C6533X.this.mo36335f();
                    }
                }, this.f16826v);
            }
        }
    }

    /* renamed from: b */
    public final void mo36331b(C6539Z z, Placement placement) {
        m19806c(z, "onRewardedVideoAdClicked");
        C6569ac.m19976a().mo36423b(placement, this.f17577c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r9.hasNext() == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        m19809e((com.ironsource.mediationsdk.C6539Z) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36332b(com.ironsource.mediationsdk.C6539Z r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadError state="
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r2 = r8.f16802B     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m19806c((com.ironsource.mediationsdk.C6539Z) r9, (java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r8.f16812h     // Catch:{ all -> 0x0170 }
            boolean r1 = r10.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0170 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "onLoadError was invoked with auctionId:"
            r0.<init>(r1)     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = " and the current id is "
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r8.f16812h     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0170 }
            m19798a((java.lang.String) r10)     // Catch:{ all -> 0x0170 }
            r10 = 81315(0x13da3, float:1.13947E-40)
            r0 = 2
            java.lang.Object[][] r1 = new java.lang.Object[r0][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "errorCode"
            r4[r3] = r5     // Catch:{ all -> 0x0170 }
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0170 }
            r4[r2] = r5     // Catch:{ all -> 0x0170 }
            r1[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "reason"
            r0[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "loadError wrong auction ID "
            r3.<init>(r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r4 = r8.f16802B     // Catch:{ all -> 0x0170 }
            r3.append(r4)     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0[r2] = r3     // Catch:{ all -> 0x0170 }
            r1[r2] = r0     // Catch:{ all -> 0x0170 }
            r9.mo36345b(r10, r1)     // Catch:{ all -> 0x0170 }
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r10 = r8.f16819o     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r9.mo36401k()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C6663i.C6664a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0170 }
            r10.put(r1, r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r10 = r8.f16802B     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r1 = com.ironsource.mediationsdk.C6533X.C6537a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            com.ironsource.mediationsdk.X$a r10 = r8.f16802B     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r1 = com.ironsource.mediationsdk.C6533X.C6537a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x008b:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Z> r10 = r8.f16816l     // Catch:{ all -> 0x0170 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0170 }
            r1 = r3
            r4 = r1
        L_0x0093:
            boolean r5 = r10.hasNext()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z r5 = (com.ironsource.mediationsdk.C6539Z) r5     // Catch:{ all -> 0x0170 }
            boolean r6 = r5.f16972e     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0120
            boolean r6 = r8.f16829y     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            boolean r6 = r5.mo36398h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x00d0
            if (r4 == 0) goto L_0x00b2
            goto L_0x00d0
        L_0x00b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "Advanced Loading: Starting to load bidder "
            r6.<init>(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo36401k()     // Catch:{ all -> 0x0170 }
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = ". No other instances will be loaded at the same time."
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0170 }
            m19798a((java.lang.String) r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6)     // Catch:{ all -> 0x0170 }
            goto L_0x00f8
        L_0x00d0:
            if (r1 == 0) goto L_0x00d5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00d7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r5.mo36401k()     // Catch:{ all -> 0x0170 }
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = " as "
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            r10.append(r9)     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0170 }
            m19798a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x0170 }
            goto L_0x013e
        L_0x00f8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r6 = r8.f16818n     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo36401k()     // Catch:{ all -> 0x0170 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0093
            r0.add(r5)     // Catch:{ all -> 0x0170 }
            boolean r6 = r8.f16829y     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r6 = r9.mo36398h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r5 = r5.mo36398h()     // Catch:{ all -> 0x0170 }
            if (r5 != 0) goto L_0x013e
            int r5 = r0.size()     // Catch:{ all -> 0x0170 }
            int r6 = r8.f16828x     // Catch:{ all -> 0x0170 }
            if (r5 >= r6) goto L_0x013e
            goto L_0x0132
        L_0x0120:
            com.ironsource.mediationsdk.Z$a r6 = r5.f16844a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r7 = com.ironsource.mediationsdk.C6539Z.C6541a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 == r7) goto L_0x012f
            com.ironsource.mediationsdk.Z$a r6 = r5.f16844a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r7 = com.ironsource.mediationsdk.C6539Z.C6541a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 != r7) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r6 = r3
            goto L_0x0130
        L_0x012f:
            r6 = r2
        L_0x0130:
            if (r6 == 0) goto L_0x0135
        L_0x0132:
            r1 = r2
            goto L_0x0093
        L_0x0135:
            boolean r5 = r5.mo36346c()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x0093
            r4 = r2
            goto L_0x0093
        L_0x013e:
            int r9 = r0.size()     // Catch:{ all -> 0x0170 }
            if (r9 != 0) goto L_0x015a
            if (r4 != 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            java.lang.String r9 = "onLoadError(): No other available smashes"
            m19798a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            r8.m19804b((boolean) r3)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r9 = com.ironsource.mediationsdk.C6533X.C6537a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0170 }
            r8.mo36324a((com.ironsource.mediationsdk.C6533X.C6537a) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.af r9 = r8.f16821q     // Catch:{ all -> 0x0170 }
            r9.mo36623d()     // Catch:{ all -> 0x0170 }
        L_0x015a:
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            java.util.Iterator r9 = r0.iterator()
        L_0x015f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016f
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.Z r10 = (com.ironsource.mediationsdk.C6539Z) r10
            r8.m19809e(r10)
            goto L_0x015f
        L_0x016f:
            return
        L_0x0170:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6533X.mo36332b(com.ironsource.mediationsdk.Z, java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo36333c(C6539Z z) {
        m19806c(z, "onRewardedVideoAdStarted");
        C6569ac.m19976a().mo36421b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36003c() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16805E     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0040 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0040 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)
            return r1
        L_0x0016:
            com.ironsource.mediationsdk.X$a r0 = r3.f16802B     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.X$a r2 = com.ironsource.mediationsdk.C6533X.C6537a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0040 }
            if (r0 != r2) goto L_0x003e
            boolean r0 = r3.f16830z     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Z> r0 = r3.f16816l     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.Z r2 = (com.ironsource.mediationsdk.C6539Z) r2     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.mo36346c()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0027
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6533X.mo36003c():boolean");
    }

    /* renamed from: c_ */
    public final void mo36187c_() {
        mo36324a(C6537a.RV_STATE_NOT_LOADED);
        m19800a(false, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m19797a(0);
    }

    /* renamed from: d */
    public final void mo36334d(C6539Z z) {
        m19806c(z, "onRewardedVideoAdEnded");
        C6569ac.m19976a().mo36424c();
    }

    /* renamed from: e */
    public final synchronized void mo36189e() {
        m19798a("onLoadTriggered: RV load was triggered in " + this.f16802B + " state");
        m19797a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo36335f() {
        m19803b(this.f16817m);
        m19812j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo36336g() {
        mo36324a(C6537a.RV_STATE_NOT_LOADED);
        m19804b(false);
        this.f16821q.mo36623d();
    }
}
