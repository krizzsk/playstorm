package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.C6433j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C6498L;
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
import com.ironsource.mediationsdk.utils.C6780n;
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

/* renamed from: com.ironsource.mediationsdk.K */
final class C6494K extends C6714p implements C6433j, C6455B, C6501M, C6635ag, C6650c, C6660g {

    /* renamed from: A */
    private long f16564A;

    /* renamed from: B */
    private Boolean f16565B;

    /* renamed from: C */
    private C6792z f16566C;

    /* renamed from: d */
    C6502N f16567d;

    /* renamed from: e */
    C6663i f16568e;

    /* renamed from: f */
    C6661h f16569f;

    /* renamed from: g */
    long f16570g;

    /* renamed from: h */
    final ConcurrentHashMap<String, C6498L> f16571h;

    /* renamed from: i */
    C6780n f16572i;

    /* renamed from: j */
    int f16573j = 1;

    /* renamed from: k */
    C6497a f16574k;

    /* renamed from: l */
    final Object f16575l = new Object();

    /* renamed from: m */
    private ConcurrentHashMap<String, C6758b> f16576m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C6663i.C6664a> f16577n;

    /* renamed from: o */
    private C6758b f16578o;

    /* renamed from: p */
    private JSONObject f16579p;

    /* renamed from: q */
    private C6631af f16580q;

    /* renamed from: r */
    private boolean f16581r;

    /* renamed from: s */
    private String f16582s = "";

    /* renamed from: t */
    private int f16583t;

    /* renamed from: u */
    private NetworkStateReceiver f16584u;

    /* renamed from: v */
    private boolean f16585v = false;

    /* renamed from: w */
    private String f16586w;

    /* renamed from: x */
    private int f16587x;

    /* renamed from: y */
    private boolean f16588y;

    /* renamed from: z */
    private boolean f16589z;

    /* renamed from: com.ironsource.mediationsdk.K$a */
    enum C6497a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6494K(List<NetworkSettings> list, C6706o oVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C6706o oVar2 = oVar;
        long time = new Date().getTime();
        mo36175a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo36178a(C6497a.RV_STATE_INITIATING);
        this.f16565B = null;
        this.f16587x = oVar2.f17545c;
        this.f16588y = oVar2.f17546d;
        this.f16586w = "";
        this.f16579p = null;
        C6765c cVar = oVar2.f17554l;
        this.f16589z = false;
        this.f16567d = new C6502N(oVar2.f17554l.f17683o, oVar2.f17554l.f17675g);
        this.f16576m = new ConcurrentHashMap<>();
        this.f16577n = new ConcurrentHashMap<>();
        this.f16564A = new Date().getTime();
        boolean z = cVar.f17673e > 0;
        this.f16581r = z;
        if (z) {
            this.f16569f = new C6661h("rewardedVideo", cVar, this);
        }
        this.f16580q = new C6631af(cVar, this);
        this.f16571h = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C6653d.m20285a().mo36662a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C6498L l = r0;
                C6498L l2 = new C6498L(str, str2, next, this, oVar2.f17547e, a, this.f16573j);
                String k = l.mo36401k();
                this.f16571h.put(k, l);
                arrayList.add(k);
            }
        }
        this.f16568e = new C6663i(arrayList, cVar.f17674f);
        this.f16572i = new C6780n(new ArrayList(this.f16571h.values()));
        mo36177a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C6399a.C64001.m19216a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.f16566C = new C6792z(oVar2.f17551i, this);
        m19562a(cVar.f17677i);
    }

    /* renamed from: a */
    private String m19560a(C6758b bVar) {
        C6498L l = this.f16571h.get(bVar.mo36939a());
        String num = l != null ? Integer.toString(l.mo36399i()) : TextUtils.isEmpty(bVar.mo36940b()) ? "1" : "2";
        return num + bVar.mo36939a();
    }

    /* renamed from: a */
    private void m19561a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.f16567d.f16624b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16567d.f16624b);
        }
        JSONObject jSONObject = this.f16579p;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16579p);
        }
        if (z && !TextUtils.isEmpty(this.f16586w)) {
            hashMap.put("placement", this.f16586w);
        }
        if (m19568b(i)) {
            C6557h.m19950d();
            C6557h.m19888a((Map<String, Object>) hashMap, this.f16583t, this.f16582s);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16573j));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6557h.m19950d().mo36371b(new C6552c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m19562a(long j) {
        if (this.f16572i.mo36986a()) {
            m19564a("all smashes are capped");
            mo36183b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo36191f();
            return;
        }
        mo36838a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f16581r) {
            if (!this.f16577n.isEmpty()) {
                this.f16568e.mo36681a(this.f16577n);
                this.f16577n.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C6494K k = C6494K.this;
                    synchronized (k.f16575l) {
                        if (k.f16574k != C6497a.RV_STATE_AUCTION_IN_PROGRESS) {
                            k.mo36178a(C6497a.RV_STATE_AUCTION_IN_PROGRESS);
                            AsyncTask.execute(new Runnable() {
                                public final void run() {
                                    StringBuilder sb;
                                    C6494K.m19564a("makeAuction()");
                                    C6494K.this.f16570g = new Date().getTime();
                                    HashMap hashMap = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (C6498L next : C6494K.this.f16571h.values()) {
                                        if (!C6494K.this.f16572i.mo36987b(next) && C6494K.this.f16567d.mo36225b(next)) {
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
                                        C6494K.this.mo36183b((int) IronSourceConstants.RV_AUCTION_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                        C6494K.m19564a("makeAuction() failed - No candidates available for auctioning");
                                        C6494K.this.mo36191f();
                                        return;
                                    }
                                    C6494K.m19564a("makeAuction() - request waterfall is: " + sb2);
                                    C6494K.this.mo36175a(1000);
                                    C6494K.this.mo36175a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                                    C6494K.this.mo36177a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                                    C6494K.this.f16569f.mo36677a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6494K.this.f16568e, C6494K.this.f16573j, C6494K.this.f17576b);
                                }
                            });
                        }
                    }
                }
            }, j);
            return;
        }
        m19564a("auction fallback flow starting");
        m19572g();
        if (this.f16567d.mo36220a().isEmpty()) {
            m19564a("loadSmashes -  waterfall is empty");
            mo36183b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36191f();
            return;
        }
        mo36175a(1000);
        m19575i();
    }

    /* renamed from: a */
    private static void m19563a(C6498L l, String str) {
        String str2 = l.mo36401k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    /* renamed from: a */
    static void m19564a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m19565a(List<C6758b> list, String str, JSONObject jSONObject) {
        this.f16576m.clear();
        this.f16577n.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        StringBuilder sb = new StringBuilder();
        for (C6758b next : list) {
            sb.append(m19560a(next) + ",");
            C6498L l = this.f16571h.get(next.mo36939a());
            if (l != null) {
                AbstractAdapter a = C6653d.m20285a().mo36661a(l.f16971d.f17477a);
                if (a != null) {
                    C6498L l2 = new C6498L(l, this, a, this.f16573j, str, jSONObject, this.f16583t, this.f16582s);
                    l2.f16972e = true;
                    copyOnWriteArrayList.add(l2);
                    this.f16576m.put(l2.mo36401k(), next);
                    this.f16577n.put(next.mo36939a(), C6663i.C6664a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                m19564a("updateWaterfall() - could not find matching smash for auction response item " + next.mo36939a());
            }
        }
        this.f16567d.mo36223a((CopyOnWriteArrayList<C6498L>) copyOnWriteArrayList, str);
        if (this.f16567d.mo36224b()) {
            mo36183b((int) IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.f16567d.f16623a.size()}}));
        }
        m19564a("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m19564a("Updated waterfall is empty");
        }
        mo36183b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m19566a(boolean z, Map<String, Object> map) {
        synchronized (this.f16575l) {
            if (this.f16565B == null || this.f16565B.booleanValue() != z) {
                this.f16565B = Boolean.valueOf(z);
                long time = new Date().getTime() - this.f16564A;
                this.f16564A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                mo36183b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                C6569ac.m19976a().mo36420a(z, this.f16567d.mo36219a(this.f16567d.f16624b));
            }
        }
    }

    /* renamed from: b */
    private static void m19567b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private static boolean m19568b(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    /* renamed from: c */
    private void m19569c(int i) {
        m19561a(i, (Map<String, Object>) null, true, true);
    }

    /* renamed from: c */
    private void m19570c(int i, Map<String, Object> map) {
        m19561a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m19571c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: g */
    private void m19572g() {
        List<C6758b> h = m19574h();
        m19565a(h, "fallback_" + System.currentTimeMillis(), this.f16579p);
    }

    /* renamed from: g */
    private void m19573g(C6498L l) {
        String b = this.f16576m.get(l.mo36401k()).mo36940b();
        l.mo36397b(b);
        l.mo36198a(b);
    }

    /* renamed from: h */
    private List<C6758b> m19574h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6498L next : this.f16571h.values()) {
            if (!next.mo36398h() && !this.f16572i.mo36987b(next) && this.f16567d.mo36225b(next)) {
                copyOnWriteArrayList.add(new C6758b(next.mo36401k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private void m19575i() {
        if (this.f16567d.mo36220a().isEmpty()) {
            m19564a("loadSmashes -  waterfall is empty");
            mo36183b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36191f();
            return;
        }
        mo36178a(C6497a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f16567d.mo36220a().size() && i < this.f16587x; i2++) {
            C6498L l = this.f16567d.mo36220a().get(i2);
            if (l.f16972e) {
                if (!this.f16588y || !l.mo36398h()) {
                    m19573g(l);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + l.mo36401k() + ". No other instances will be loaded at the same time.";
                    m19564a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m19573g(l);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + l.mo36401k() + " as a non bidder is being loaded";
                    m19564a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36175a(int i) {
        m19561a(i, (Map<String, Object>) null, false, false);
    }

    /* renamed from: a */
    public final void mo36176a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m19564a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f16583t = i2;
        this.f16582s = str2;
        this.f16579p = null;
        m19572g();
        if (TextUtils.isEmpty(str)) {
            map = C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            map = C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        mo36183b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        m19575i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36177a(int i, Map<String, Object> map) {
        m19561a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo36001a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f16585v = z;
            if (z) {
                if (this.f16584u == null) {
                    this.f16584u = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f16584u, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f16584u != null) {
                context.getApplicationContext().unregisterReceiver(this.f16584u);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36178a(C6497a aVar) {
        m19564a("current state=" + this.f16574k + ", new state=" + aVar);
        this.f16574k = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36179a(com.ironsource.mediationsdk.C6498L r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f16575l
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadSuccess mState="
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.K$a r2 = r12.f16574k     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m19563a((com.ironsource.mediationsdk.C6498L) r13, (java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r13.f16599b     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.N r2 = r12.f16567d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r2.f16624b     // Catch:{ all -> 0x0170 }
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L_0x011f
            com.ironsource.mediationsdk.K$a r1 = r12.f16574k     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.K$a r2 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r1 != r2) goto L_0x0029
            goto L_0x011f
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r1 = r12.f16577n     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r13.mo36401k()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C6663i.C6664a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0170 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.K$a r1 = r12.f16574k     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.K$a r2 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            if (r1 != r2) goto L_0x011d
            com.ironsource.mediationsdk.K$a r1 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0170 }
            r12.mo36178a((com.ironsource.mediationsdk.C6494K.C6497a) r1)     // Catch:{ all -> 0x0170 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0170 }
            r1.<init>()     // Catch:{ all -> 0x0170 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0170 }
            long r6 = r12.f16570g     // Catch:{ all -> 0x0170 }
            long r1 = r1 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r5][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = "duration"
            r8[r3] = r9     // Catch:{ all -> 0x0170 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0170 }
            r8[r5] = r1     // Catch:{ all -> 0x0170 }
            r7[r3] = r8     // Catch:{ all -> 0x0170 }
            java.util.Map r1 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0170 }
            r12.mo36183b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.z r1 = r12.f16566C     // Catch:{ all -> 0x0170 }
            r6 = 0
            r1.mo37016a(r6)     // Catch:{ all -> 0x0170 }
            boolean r1 = r12.f16581r     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x0119
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r1 = r12.f16576m     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r13.mo36401k()     // Catch:{ all -> 0x0170 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0170 }
            r11 = r1
            com.ironsource.mediationsdk.server.b r11 = (com.ironsource.mediationsdk.server.C6758b) r11     // Catch:{ all -> 0x0170 }
            if (r11 == 0) goto L_0x00ad
            com.ironsource.mediationsdk.N r1 = r12.f16567d     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.N r2 = r12.f16567d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r2.f16624b     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = ""
            com.ironsource.mediationsdk.impressionData.ImpressionData r3 = r11.mo36938a(r3)     // Catch:{ all -> 0x0170 }
            r1.mo36222a((java.lang.String) r2, (com.ironsource.mediationsdk.impressionData.ImpressionData) r3)     // Catch:{ all -> 0x0170 }
            int r1 = r13.mo36399i()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.server.b r2 = r12.f16578o     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.C6661h.m20330a(r11, r1, r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.h r6 = r12.f16569f     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.N r1 = r12.f16567d     // Catch:{ all -> 0x0170 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.mo36220a()     // Catch:{ all -> 0x0170 }
            r7 = r1
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ all -> 0x0170 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r12.f16576m     // Catch:{ all -> 0x0170 }
            int r9 = r13.mo36399i()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.server.b r10 = r12.f16578o     // Catch:{ all -> 0x0170 }
            r6.mo36678a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C6560aa>) r7, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C6758b>) r8, (int) r9, (com.ironsource.mediationsdk.server.C6758b) r10, (com.ironsource.mediationsdk.server.C6758b) r11)     // Catch:{ all -> 0x0170 }
            goto L_0x0119
        L_0x00ad:
            java.lang.String r1 = r13.mo36401k()     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = "onLoadSuccess winner instance "
            r2.<init>(r6)     // Catch:{ all -> 0x0170 }
            r2.append(r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = " missing from waterfall. auctionId: "
            r2.append(r6)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r13.f16599b     // Catch:{ all -> 0x0170 }
            r2.append(r13)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = " and the current id is "
            r2.append(r13)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.N r13 = r12.f16567d     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r13.f16624b     // Catch:{ all -> 0x0170 }
            r2.append(r13)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0170 }
            m19567b((java.lang.String) r13)     // Catch:{ all -> 0x0170 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            r7 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0170 }
            r6[r5] = r7     // Catch:{ all -> 0x0170 }
            r2[r3] = r6     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "reason"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = "Loaded missing "
            r7.<init>(r8)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.K$a r8 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            r7.append(r8)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0170 }
            r6[r5] = r7     // Catch:{ all -> 0x0170 }
            r2[r5] = r6     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "ext1"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            r6[r5] = r1     // Catch:{ all -> 0x0170 }
            r2[r4] = r6     // Catch:{ all -> 0x0170 }
            java.util.Map r1 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r2)     // Catch:{ all -> 0x0170 }
            r12.mo36183b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0170 }
        L_0x0119:
            r13 = 0
            r12.m19566a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r13)     // Catch:{ all -> 0x0170 }
        L_0x011d:
            monitor-exit(r0)     // Catch:{ all -> 0x0170 }
            return
        L_0x011f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadSuccess was invoked with auctionId: "
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r13.f16599b     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = " and the current id is "
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.N r2 = r12.f16567d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r2.f16624b     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m19564a((java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            r1 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0170 }
            r6[r5] = r7     // Catch:{ all -> 0x0170 }
            r2[r3] = r6     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = "reason"
            r4[r3] = r6     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = "onLoadSuccess wrong auction ID "
            r3.<init>(r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.K$a r6 = r12.f16574k     // Catch:{ all -> 0x0170 }
            r3.append(r6)     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0170 }
            r4[r5] = r3     // Catch:{ all -> 0x0170 }
            r2[r5] = r4     // Catch:{ all -> 0x0170 }
            r13.mo36200b(r1, r2)     // Catch:{ all -> 0x0170 }
            monitor-exit(r0)     // Catch:{ all -> 0x0170 }
            return
        L_0x0170:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0170 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6494K.mo36179a(com.ironsource.mediationsdk.L):void");
    }

    /* renamed from: a */
    public final void mo36180a(C6498L l, Placement placement) {
        m19563a(l, "onRewardedVideoAdRewarded");
        C6569ac.m19976a().mo36419a(placement, this.f16567d.mo36219a(l.f16599b));
    }

    /* renamed from: a */
    public final void mo36181a(IronSourceError ironSourceError, C6498L l) {
        C6758b bVar;
        if (this.f16581r && (bVar = this.f16576m.get(l.mo36401k())) != null) {
            C6502N n = this.f16567d;
            n.mo36222a(n.f16624b, bVar.mo36938a(this.f16586w));
        }
        m19563a(l, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f16589z = false;
        m19570c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        C6569ac.m19976a().mo36418a(ironSourceError, this.f16567d.mo36219a(l.f16599b));
        this.f16577n.put(l.mo36401k(), C6663i.C6664a.ISAuctionPerformanceFailedToShow);
        if (this.f16574k != C6497a.RV_STATE_READY_TO_SHOW) {
            m19566a(false, (Map<String, Object>) null);
        }
        this.f16580q.mo36622c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0206, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0208, code lost:
        m19564a("showVideo()");
        r10.f16572i.mo36985a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0218, code lost:
        if (r10.f16572i.mo36987b(r6) == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x021a, code lost:
        r6.mo36202b_();
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6.mo36401k() + " rewarded video is now session capped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0235, code lost:
        com.ironsource.mediationsdk.utils.C6774k.m20617e(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r11.getPlacementName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0254, code lost:
        if (com.ironsource.mediationsdk.utils.C6774k.m20615c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r11.getPlacementName()) == false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0256, code lost:
        m19569c((int) com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x025b, code lost:
        r10.f16566C.mo37015a();
        r6.mo36197a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36002a(com.ironsource.mediationsdk.model.Placement r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f16575l
            monitor-enter(r0)
            r1 = 1113(0x459, float:1.56E-42)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r11 != 0) goto L_0x004a
            java.lang.String r11 = "showRewardedVideo error: empty default placement"
            m19571c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 1021(0x3fd, float:1.431E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ac r7 = com.ironsource.mediationsdk.C6569ac.m19976a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r8 = r10.f16567d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r9 = r10.f16567d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16624b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36219a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36418a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19561a(r1, r11, r4, r3)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x004a:
            java.lang.String r5 = r11.getPlacementName()     // Catch:{ all -> 0x0264 }
            r10.f16586w = r5     // Catch:{ all -> 0x0264 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "showRewardedVideo("
            r5.<init>(r6)     // Catch:{ all -> 0x0264 }
            r5.append(r11)     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0264 }
            r6.log(r7, r5, r4)     // Catch:{ all -> 0x0264 }
            r5 = 1100(0x44c, float:1.541E-42)
            r10.m19569c((int) r5)     // Catch:{ all -> 0x0264 }
            boolean r5 = r10.f16589z     // Catch:{ all -> 0x0264 }
            if (r5 == 0) goto L_0x00b5
            java.lang.String r11 = "showRewardedVideo error: can't show ad while an ad is already showing"
            m19571c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 1022(0x3fe, float:1.432E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ac r7 = com.ironsource.mediationsdk.C6569ac.m19976a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r8 = r10.f16567d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r9 = r10.f16567d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16624b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36219a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36418a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19570c(r1, r11)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x00b5:
            com.ironsource.mediationsdk.K$a r5 = r10.f16574k     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.K$a r6 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0264 }
            if (r5 == r6) goto L_0x00fb
            java.lang.String r11 = "showRewardedVideo error: show called while no ads are available"
            m19571c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 1023(0x3ff, float:1.434E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ac r7 = com.ironsource.mediationsdk.C6569ac.m19976a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r8 = r10.f16567d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r9 = r10.f16567d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16624b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36219a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36418a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19570c(r1, r11)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x00fb:
            com.ironsource.environment.ContextProvider r5 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0264 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = r10.f16586w     // Catch:{ all -> 0x0264 }
            boolean r5 = com.ironsource.mediationsdk.utils.C6774k.m20615c((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0264 }
            if (r5 == 0) goto L_0x015e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = "showRewardedVideo error: placement "
            r11.<init>(r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = r10.f16586w     // Catch:{ all -> 0x0264 }
            r11.append(r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = " is capped"
            r11.append(r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0264 }
            m19571c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 524(0x20c, float:7.34E-43)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ac r7 = com.ironsource.mediationsdk.C6569ac.m19976a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r8 = r10.f16567d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r9 = r10.f16567d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16624b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36219a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36418a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6399a.C64001.m19216a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19570c(r1, r11)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x015e:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ all -> 0x0264 }
            r2.<init>()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r5 = r10.f16567d     // Catch:{ all -> 0x0264 }
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.mo36220a()     // Catch:{ all -> 0x0264 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0264 }
        L_0x016d:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0264 }
            if (r6 == 0) goto L_0x01b8
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.L r6 = (com.ironsource.mediationsdk.C6498L) r6     // Catch:{ all -> 0x0264 }
            boolean r7 = r6.mo36201b()     // Catch:{ all -> 0x0264 }
            if (r7 == 0) goto L_0x018a
            r10.f16589z = r3     // Catch:{ all -> 0x0264 }
            r6.mo36199a((boolean) r3)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.K$a r3 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0264 }
            r10.mo36178a((com.ironsource.mediationsdk.C6494K.C6497a) r3)     // Catch:{ all -> 0x0264 }
            goto L_0x01b9
        L_0x018a:
            java.lang.Long r7 = r6.mo36405o()     // Catch:{ all -> 0x0264 }
            if (r7 == 0) goto L_0x01b4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            r7.<init>()     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = r6.mo36401k()     // Catch:{ all -> 0x0264 }
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = ":"
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.Long r8 = r6.mo36405o()     // Catch:{ all -> 0x0264 }
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = ","
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0264 }
            r2.append(r7)     // Catch:{ all -> 0x0264 }
        L_0x01b4:
            r6.mo36199a((boolean) r4)     // Catch:{ all -> 0x0264 }
            goto L_0x016d
        L_0x01b8:
            r6 = 0
        L_0x01b9:
            if (r6 != 0) goto L_0x0205
            java.lang.String r11 = "showRewardedVideo(): No ads to show"
            m19564a((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ac r3 = com.ironsource.mediationsdk.C6569ac.m19976a()     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r4)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r5 = r10.f16567d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r6 = r10.f16567d     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = r6.f16624b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r5 = r5.mo36219a((java.lang.String) r6)     // Catch:{ all -> 0x0264 }
            r3.mo36418a((com.ironsource.mediationsdk.logger.IronSourceError) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r5)     // Catch:{ all -> 0x0264 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0264 }
            r3.<init>()     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "errorCode"
            r5 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0264 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "reason"
            r3.put(r4, r11)     // Catch:{ all -> 0x0264 }
            int r11 = r2.length()     // Catch:{ all -> 0x0264 }
            if (r11 == 0) goto L_0x01fb
            java.lang.String r11 = "ext1"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0264 }
            r3.put(r11, r2)     // Catch:{ all -> 0x0264 }
        L_0x01fb:
            r10.m19570c(r1, r3)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.af r11 = r10.f16580q     // Catch:{ all -> 0x0264 }
            r11.mo36622c()     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x0205:
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            if (r6 == 0) goto L_0x0263
            java.lang.String r0 = "showVideo()"
            m19564a((java.lang.String) r0)
            com.ironsource.mediationsdk.utils.n r0 = r10.f16572i
            r0.mo36985a(r6)
            com.ironsource.mediationsdk.utils.n r0 = r10.f16572i
            boolean r0 = r0.mo36987b(r6)
            if (r0 == 0) goto L_0x0235
            r6.mo36202b_()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.mo36401k()
            r0.append(r1)
            java.lang.String r1 = " rewarded video is now session capped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
        L_0x0235:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r11.getPlacementName()
            com.ironsource.mediationsdk.utils.C6774k.m20617e(r0, r1)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r11.getPlacementName()
            boolean r0 = com.ironsource.mediationsdk.utils.C6774k.m20615c((android.content.Context) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x025b
            r0 = 1400(0x578, float:1.962E-42)
            r10.m19569c((int) r0)
        L_0x025b:
            com.ironsource.mediationsdk.z r0 = r10.f16566C
            r0.mo37015a()
            r6.mo36197a((com.ironsource.mediationsdk.model.Placement) r11)
        L_0x0263:
            return
        L_0x0264:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6494K.mo36002a(com.ironsource.mediationsdk.model.Placement):void");
    }

    /* renamed from: a */
    public final void mo36182a(List<C6758b> list, String str, C6758b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        m19564a("makeAuction(): success");
        this.f16578o = bVar;
        this.f16583t = i;
        this.f16579p = jSONObject;
        this.f16582s = "";
        if (!TextUtils.isEmpty(str2)) {
            mo36183b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        mo36843a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f17575a.mo36955a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            mo36183b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}}));
            mo36191f();
            return;
        }
        m19565a(list, str, this.f16579p);
        mo36183b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C6399a.C64001.m19216a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
        m19575i();
    }

    /* renamed from: a */
    public final void mo35940a(boolean z) {
        if (this.f16585v) {
            boolean z2 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            Boolean bool = this.f16565B;
            if (bool != null && ((z && !bool.booleanValue() && mo36003c()) || (!z && this.f16565B.booleanValue()))) {
                z2 = true;
            }
            if (z2) {
                m19566a(z, (Map<String, Object>) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36183b(int i, Map<String, Object> map) {
        m19561a(i, map, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
        r11 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        if (r11.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        m19573g((com.ironsource.mediationsdk.C6498L) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36184b(com.ironsource.mediationsdk.C6498L r11) {
        /*
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r1 = r10.f16575l
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "onLoadError mState="
            r2.<init>(r3)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.K$a r3 = r10.f16574k     // Catch:{ all -> 0x0187 }
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0187 }
            m19563a((com.ironsource.mediationsdk.C6498L) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f16599b     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N r3 = r10.f16567d     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r3.f16624b     // Catch:{ all -> 0x0187 }
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0134
            com.ironsource.mediationsdk.K$a r2 = r10.f16574k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.K$a r3 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r2 != r3) goto L_0x002d
            goto L_0x0134
        L_0x002d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r10.f16577n     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r11.mo36401k()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C6663i.C6664a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0187 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.K$a r2 = r10.f16574k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.K$a r3 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            com.ironsource.mediationsdk.K$a r2 = r10.f16574k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.K$a r3 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0046:
            com.ironsource.mediationsdk.N r2 = r10.f16567d     // Catch:{ all -> 0x0187 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.mo36220a()     // Catch:{ all -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0187 }
            r3 = r5
            r6 = r3
        L_0x0052:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00fd
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.L r7 = (com.ironsource.mediationsdk.C6498L) r7     // Catch:{ all -> 0x0187 }
            boolean r8 = r7.f16972e     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00df
            boolean r8 = r10.f16588y     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r7.mo36398h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            if (r3 != 0) goto L_0x008f
            if (r6 == 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Advanced Loading: Starting to load bidder "
            r8.<init>(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo36401k()     // Catch:{ all -> 0x0187 }
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = ". No other instances will be loaded at the same time."
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0187 }
            m19564a((java.lang.String) r8)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r8)     // Catch:{ all -> 0x0187 }
            goto L_0x00b7
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            java.lang.String r11 = "a non bidder is being loaded"
            goto L_0x0096
        L_0x0094:
            java.lang.String r11 = "a non bidder was already loaded successfully"
        L_0x0096:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = "Advanced Loading: Won't start loading bidder "
            r2.<init>(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = r7.mo36401k()     // Catch:{ all -> 0x0187 }
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = " as "
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            r2.append(r11)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0187 }
            m19564a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)     // Catch:{ all -> 0x0187 }
            goto L_0x00fd
        L_0x00b7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r10.f16576m     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo36401k()     // Catch:{ all -> 0x0187 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x0052
            r0.add(r7)     // Catch:{ all -> 0x0187 }
            boolean r8 = r10.f16588y     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r8 = r11.mo36398h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r7 = r7.mo36398h()     // Catch:{ all -> 0x0187 }
            if (r7 != 0) goto L_0x00fd
            int r7 = r0.size()     // Catch:{ all -> 0x0187 }
            int r8 = r10.f16587x     // Catch:{ all -> 0x0187 }
            if (r7 >= r8) goto L_0x00fd
            goto L_0x00f1
        L_0x00df:
            com.ironsource.mediationsdk.L$a r8 = r7.f16598a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.L$a r9 = com.ironsource.mediationsdk.C6498L.C6500a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 == r9) goto L_0x00ee
            com.ironsource.mediationsdk.L$a r8 = r7.f16598a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.L$a r9 = com.ironsource.mediationsdk.C6498L.C6500a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 != r9) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r8 = r5
            goto L_0x00ef
        L_0x00ee:
            r8 = r4
        L_0x00ef:
            if (r8 == 0) goto L_0x00f4
        L_0x00f1:
            r3 = r4
            goto L_0x0052
        L_0x00f4:
            boolean r7 = r7.mo36201b()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0052
            r6 = r4
            goto L_0x0052
        L_0x00fd:
            int r11 = r0.size()     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x011e
            if (r6 != 0) goto L_0x011e
            if (r3 != 0) goto L_0x011e
            java.lang.String r11 = "onLoadError(): No other available smashes"
            m19564a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            boolean r11 = r10.f16589z     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0114
            r11 = 0
            r10.m19566a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r11)     // Catch:{ all -> 0x0187 }
        L_0x0114:
            com.ironsource.mediationsdk.K$a r11 = com.ironsource.mediationsdk.C6494K.C6497a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0187 }
            r10.mo36178a((com.ironsource.mediationsdk.C6494K.C6497a) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.af r11 = r10.f16580q     // Catch:{ all -> 0x0187 }
            r11.mo36623d()     // Catch:{ all -> 0x0187 }
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            java.util.Iterator r11 = r0.iterator()
        L_0x0123:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r11.next()
            com.ironsource.mediationsdk.L r0 = (com.ironsource.mediationsdk.C6498L) r0
            r10.m19573g(r0)
            goto L_0x0123
        L_0x0133:
            return
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "onLoadError was invoked with auctionId:"
            r0.<init>(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f16599b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " and the current id is "
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N r2 = r10.f16567d     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.f16624b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            m19564a((java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r0 = 81315(0x13da3, float:1.13947E-40)
            r2 = 2
            java.lang.Object[][] r3 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x0187 }
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0187 }
            r6[r4] = r7     // Catch:{ all -> 0x0187 }
            r3[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "reason"
            r2[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "loadError wrong auction ID "
            r5.<init>(r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.K$a r6 = r10.f16574k     // Catch:{ all -> 0x0187 }
            r5.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0187 }
            r2[r4] = r5     // Catch:{ all -> 0x0187 }
            r3[r4] = r2     // Catch:{ all -> 0x0187 }
            r11.mo36200b(r0, r3)     // Catch:{ all -> 0x0187 }
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0187:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6494K.mo36184b(com.ironsource.mediationsdk.L):void");
    }

    /* renamed from: b */
    public final void mo36185b(C6498L l, Placement placement) {
        m19563a(l, "onRewardedVideoAdClicked");
        C6569ac.m19976a().mo36423b(placement, this.f16567d.mo36219a(l.f16599b));
    }

    /* renamed from: c */
    public final void mo36186c(C6498L l) {
        this.f16567d.mo36221a(l);
        this.f16573j++;
        m19563a(l, "onRewardedVideoAdOpened");
        if (this.f16581r) {
            C6758b bVar = this.f16576m.get(l.mo36401k());
            if (bVar != null) {
                C6502N n = this.f16567d;
                n.mo36222a(n.f16624b, bVar.mo36938a(this.f16586w));
                C6661h.m20331a(bVar, l.mo36399i(), this.f16578o, this.f16586w);
                this.f16577n.put(l.mo36401k(), C6663i.C6664a.ISAuctionPerformanceShowedSuccessfully);
                mo36842a(bVar, this.f16586w);
            } else {
                String k = l.mo36401k();
                m19567b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                mo36183b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f16574k}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
            }
        }
        C6569ac.m19976a().mo36416a(this.f16567d.mo36219a(l.f16599b));
        m19566a(false, (Map<String, Object>) null);
        this.f16580q.mo36620a();
    }

    /* renamed from: c */
    public final boolean mo36003c() {
        if ((!this.f16585v || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f16574k == C6497a.RV_STATE_READY_TO_SHOW && !this.f16589z) {
            Iterator<C6498L> it = this.f16567d.mo36220a().iterator();
            while (it.hasNext()) {
                if (it.next().mo36201b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo36187c_() {
        mo36178a(C6497a.RV_STATE_NOT_LOADED);
        m19566a(false, C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m19562a(0);
    }

    /* renamed from: d */
    public final void mo36188d(C6498L l) {
        String str;
        m19563a(l, "onRewardedVideoAdClosed, mediation state: " + this.f16574k.name());
        C6569ac.m19976a().mo36422b(this.f16567d.mo36219a(l.f16599b));
        this.f16589z = false;
        boolean z = this.f16574k == C6497a.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<C6498L> it = this.f16567d.mo36220a().iterator();
            while (it.hasNext()) {
                C6498L next = it.next();
                if (next.f16598a == C6498L.C6500a.LOADED) {
                    sb.append(next.mo36401k() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        l.mo36196a((int) IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (l.equals(this.f16567d.f16625c)) {
            this.f16567d.mo36221a((C6498L) null);
            if (this.f16574k != C6497a.RV_STATE_READY_TO_SHOW) {
                m19566a(false, (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: e */
    public final void mo36189e() {
        m19564a("onLoadTriggered: RV load was triggered in " + this.f16574k + " state");
        m19562a(0);
    }

    /* renamed from: e */
    public final void mo36190e(C6498L l) {
        m19563a(l, "onRewardedVideoAdStarted");
        C6569ac.m19976a().mo36421b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo36191f() {
        mo36178a(C6497a.RV_STATE_NOT_LOADED);
        if (!this.f16589z) {
            m19566a(false, (Map<String, Object>) null);
        }
        this.f16580q.mo36623d();
    }

    /* renamed from: f */
    public final void mo36192f(C6498L l) {
        m19563a(l, "onRewardedVideoAdEnded");
        C6569ac.m19976a().mo36424c();
    }
}
