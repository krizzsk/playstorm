package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.C6663i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6698h;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6765c;
import com.ironsource.mediationsdk.utils.C6780n;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.U */
final class C6525U extends C6714p implements C6454A, C6529V, C6660g {

    /* renamed from: d */
    C6780n f16755d;

    /* renamed from: e */
    final ConcurrentHashMap<String, C6530W> f16756e;

    /* renamed from: f */
    String f16757f;

    /* renamed from: g */
    JSONObject f16758g;

    /* renamed from: h */
    C6661h f16759h;

    /* renamed from: i */
    C6663i f16760i;

    /* renamed from: j */
    long f16761j;

    /* renamed from: k */
    long f16762k;

    /* renamed from: l */
    private C6528a f16763l;

    /* renamed from: m */
    private CopyOnWriteArrayList<C6530W> f16764m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C6758b> f16765n;

    /* renamed from: o */
    private ConcurrentHashMap<String, C6663i.C6664a> f16766o;

    /* renamed from: p */
    private C6758b f16767p;

    /* renamed from: q */
    private String f16768q;

    /* renamed from: r */
    private int f16769r;

    /* renamed from: s */
    private boolean f16770s;

    /* renamed from: t */
    private boolean f16771t;

    /* renamed from: u */
    private long f16772u;

    /* renamed from: v */
    private int f16773v;

    /* renamed from: w */
    private String f16774w = "";

    /* renamed from: x */
    private boolean f16775x = false;

    /* renamed from: com.ironsource.mediationsdk.U$a */
    enum C6528a {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6525U(List<NetworkSettings> list, C6698h hVar, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C6698h hVar2 = hVar;
        long time = new Date().getTime();
        m19729a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED);
        mo36299a(C6528a.STATE_NOT_INITIALIZED);
        this.f16756e = new ConcurrentHashMap<>();
        this.f16764m = new CopyOnWriteArrayList<>();
        this.f16765n = new ConcurrentHashMap<>();
        this.f16766o = new ConcurrentHashMap<>();
        this.f16768q = "";
        this.f16757f = "";
        this.f16758g = null;
        this.f16769r = hVar2.f17503c;
        this.f16770s = hVar2.f17504d;
        C6716r.m20447a().mo36850a(IronSource.AD_UNIT.INTERSTITIAL, i);
        C6765c cVar = hVar2.f17509i;
        this.f16762k = cVar.f17677i;
        boolean z = cVar.f17673e > 0;
        this.f16771t = z;
        if (z) {
            this.f16759h = new C6661h("interstitial", cVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C6653d.m20285a().mo36662a(next, next.getInterstitialSettings(), false, false);
            if (a != null) {
                C6655e a2 = C6655e.m20304a();
                if (a2.mo36670a(a, a2.f17295a, "interstitial")) {
                    C6530W w = r0;
                    C6530W w2 = new C6530W(str, str2, next, this, hVar2.f17505e, a);
                    String k = w.mo36401k();
                    this.f16756e.put(k, w);
                    arrayList.add(k);
                }
            }
        }
        this.f16760i = new C6663i(arrayList, cVar.f17674f);
        this.f16755d = new C6780n(new ArrayList(this.f16756e.values()));
        for (C6530W next2 : this.f16756e.values()) {
            if (next2.mo36398h()) {
                next2.mo36317b();
            }
        }
        this.f16761j = new Date().getTime();
        mo36299a(C6528a.STATE_READY_TO_LOAD);
        m19733a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    private String m19728a(C6758b bVar) {
        C6530W w = this.f16756e.get(bVar.mo36939a());
        String num = w != null ? Integer.toString(w.mo36399i()) : TextUtils.isEmpty(bVar.mo36940b()) ? "1" : "2";
        return num + bVar.mo36939a();
    }

    /* renamed from: a */
    private void m19729a(int i) {
        m19734a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m19730a(int i, C6530W w) {
        m19732a(i, w, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m19731a(int i, C6530W w, Object[][] objArr) {
        m19732a(i, w, objArr, false);
    }

    /* renamed from: a */
    private void m19732a(int i, C6530W w, Object[][] objArr, boolean z) {
        Map<String, Object> n = w.mo36404n();
        if (!TextUtils.isEmpty(this.f16757f)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16757f);
        }
        JSONObject jSONObject = this.f16758g;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16758g);
        }
        if (z && !TextUtils.isEmpty(this.f16768q)) {
            n.put("placement", this.f16768q);
        }
        if (m19744c(i)) {
            C6553d.m19930d();
            C6553d.m19888a(n, this.f16773v, this.f16774w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6553d.m19930d().mo36371b(new C6552c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    private void m19733a(int i, Object[][] objArr) {
        m19734a(i, objArr, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19734a(int i, Object[][] objArr, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f16757f)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16757f);
        }
        JSONObject jSONObject = this.f16758g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16758g);
        }
        if (z && !TextUtils.isEmpty(this.f16768q)) {
            hashMap.put("placement", this.f16768q);
        }
        if (m19744c(i)) {
            C6553d.m19930d();
            C6553d.m19888a((Map<String, Object>) hashMap, this.f16773v, this.f16774w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                m19742b("sendMediationEvent " + e.getMessage());
            }
        }
        C6553d.m19930d().mo36371b(new C6552c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private static void m19736a(C6530W w, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + w.mo36401k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m19737a(List<C6758b> list) {
        this.f16764m.clear();
        this.f16765n.clear();
        this.f16766o.clear();
        StringBuilder sb = new StringBuilder();
        for (C6758b next : list) {
            sb.append(m19728a(next) + ",");
            C6530W w = this.f16756e.get(next.mo36939a());
            if (w != null) {
                w.f16972e = true;
                this.f16764m.add(w);
                this.f16765n.put(w.mo36401k(), next);
                this.f16766o.put(next.mo36939a(), C6663i.C6664a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m19742b("updateWaterfall() - could not find matching smash for auction response item " + next.mo36939a());
            }
        }
        m19742b("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m19742b("Updated waterfall is empty");
        }
        m19733a((int) IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    /* renamed from: b */
    private void m19738b(int i) {
        m19734a(i, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m19739b(int i, C6530W w) {
        m19732a(i, w, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m19740b(int i, C6530W w, Object[][] objArr) {
        m19732a(i, w, objArr, true);
    }

    /* renamed from: b */
    private void m19741b(int i, Object[][] objArr) {
        m19734a((int) IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    /* renamed from: b */
    static void m19742b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    /* renamed from: c */
    private static void m19743c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m19744c(int i) {
        return i == 2002 || i == 2003 || i == 2200 || i == 2213 || i == 2005 || i == 2204 || i == 2201 || i == 2203 || i == 2006 || i == 2004 || i == 2110 || i == 2301 || i == 2300 || i == 2303;
    }

    /* renamed from: g */
    private void m19745g() {
        List<C6758b> h = m19747h();
        this.f16757f = m20437d();
        m19737a(h);
    }

    /* renamed from: g */
    private void m19746g(C6530W w) {
        String b = this.f16765n.get(w.mo36401k()).mo36940b();
        w.mo36397b(b);
        m19730a(2002, w);
        w.mo36316a(b);
    }

    /* renamed from: h */
    private List<C6758b> m19747h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6530W next : this.f16756e.values()) {
            if (!next.mo36398h() && !this.f16755d.mo36987b(next)) {
                copyOnWriteArrayList.add(new C6758b(next.mo36401k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private void m19748i() {
        if (this.f16764m.isEmpty()) {
            mo36299a(C6528a.STATE_READY_TO_LOAD);
            m19734a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1035}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C6716r.m20447a().mo36851a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1035, "Empty waterfall"));
            return;
        }
        mo36299a(C6528a.STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f16764m.size() && i < this.f16769r; i2++) {
            C6530W w = this.f16764m.get(i2);
            if (w.f16972e) {
                if (!this.f16770s || !w.mo36398h()) {
                    m19746g(w);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + w.mo36401k() + ". No other instances will be loaded at the same time.";
                    m19742b(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m19746g(w);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + w.mo36401k() + " as a non bidder is being loaded";
                    m19742b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36298a() {
        mo36299a(C6528a.STATE_AUCTION);
        AsyncTask.execute(new Runnable() {
            public final void run() {
                StringBuilder sb;
                C6525U.this.f16757f = "";
                C6525U.this.f16758g = null;
                StringBuilder sb2 = new StringBuilder();
                long time = C6525U.this.f16762k - (new Date().getTime() - C6525U.this.f16761j);
                if (time > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("delaying auction by " + time);
                    C6423c cVar = C6423c.f16330a;
                    C6423c.m19280b(new Runnable() {
                        public final void run() {
                            C6525U.this.mo36298a();
                        }
                    }, time);
                    return;
                }
                C6525U.this.m19734a(2000, (Object[][]) null, false);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (C6530W next : C6525U.this.f16756e.values()) {
                    if (!C6525U.this.f16755d.mo36987b(next)) {
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
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    C6525U.this.m19734a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}, false);
                    C6525U.m19742b("makeAuction() failed - No candidates available for auctioning");
                    C6716r.m20447a().mo36851a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
                    C6525U.this.m19734a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                    C6525U.this.mo36299a(C6528a.STATE_READY_TO_LOAD);
                    return;
                }
                C6525U.this.m19734a((int) IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
                int b = C6782o.m20647a().mo36990b(2);
                if (C6525U.this.f16759h != null) {
                    C6525U.this.f16759h.mo36677a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6525U.this.f16760i, b, C6525U.this.f17576b);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo36176a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m19742b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.f16773v = i2;
        this.f16774w = str2;
        this.f16758g = null;
        m19745g();
        if (TextUtils.isEmpty(str)) {
            m19733a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            m19733a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        m19748i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36299a(C6528a aVar) {
        this.f16763l = aVar;
        m19742b("state=" + aVar);
    }

    /* renamed from: a */
    public final void mo36300a(C6530W w) {
        synchronized (this) {
            m19736a(w, "onInterstitialAdOpened");
            m19739b(2005, w);
            if (this.f16771t) {
                C6758b bVar = this.f16765n.get(w.mo36401k());
                if (bVar != null) {
                    mo36840a(bVar.mo36938a(this.f16768q));
                    C6661h.m20331a(bVar, w.mo36399i(), this.f16767p, this.f16768q);
                    this.f16766o.put(w.mo36401k(), C6663i.C6664a.ISAuctionPerformanceShowedSuccessfully);
                    mo36842a(bVar, this.f16768q);
                } else {
                    String k = w.mo36401k();
                    m19742b("onInterstitialAdOpened showing instance " + k + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1011};
                    m19733a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f16763l}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            C6463D.m19392a().mo36017b(this.f17577c);
        }
    }

    /* renamed from: a */
    public final void mo36301a(C6530W w, long j) {
        C6530W w2 = w;
        synchronized (this) {
            m19736a(w2, "onInterstitialAdReady");
            m19731a(2003, w2, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            if (this.f16766o.containsKey(w.mo36401k())) {
                this.f16766o.put(w.mo36401k(), C6663i.C6664a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f16763l == C6528a.STATE_LOADING_SMASHES) {
                mo36299a(C6528a.STATE_READY_TO_SHOW);
                m19733a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f16772u)}});
                if (this.f16771t) {
                    C6758b bVar = this.f16765n.get(w.mo36401k());
                    if (bVar != null) {
                        mo36840a(bVar.mo36938a(""));
                        C6661h.m20330a(bVar, w.mo36399i(), this.f16767p);
                        this.f16759h.mo36678a((CopyOnWriteArrayList<C6560aa>) this.f16764m, this.f16765n, w.mo36399i(), this.f16767p, bVar);
                    } else {
                        String k = w.mo36401k();
                        m19742b("onInterstitialAdReady winner instance " + k + " missing from waterfall");
                        m19733a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                    }
                }
                C6463D.m19392a().mo36012a(this.f17577c);
            }
        }
    }

    /* renamed from: a */
    public final void mo36302a(IronSourceError ironSourceError, C6530W w) {
        C6758b bVar;
        synchronized (this) {
            if (this.f16771t && (bVar = this.f16765n.get(w.mo36401k())) != null) {
                mo36840a(bVar.mo36938a(this.f16768q));
            }
            m19736a(w, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            C6463D.m19392a().mo36014a(ironSourceError, this.f17577c);
            m19740b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, w, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.f16766o.put(w.mo36401k(), C6663i.C6664a.ISAuctionPerformanceFailedToShow);
            mo36299a(C6528a.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if (r11 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r9 = "a non bidder is being loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f5, code lost:
        r9 = "a non bidder was already loaded successfully";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r9 = "Advanced Loading: Won't start loading bidder " + r1.mo36401k() + " as " + r9;
        m19742b(r9);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36303a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.C6530W r10, long r11) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "onInterstitialAdLoadFailed error="
            r1.<init>(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = " state="
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.U$a r2 = r8.f16763l     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b9 }
            m19736a((com.ironsource.mediationsdk.C6530W) r10, (java.lang.String) r1)     // Catch:{ all -> 0x01b9 }
            int r1 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            r2 = 1158(0x486, float:1.623E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L_0x005c
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r9 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r5] = r9     // Catch:{ all -> 0x01b9 }
            r8.m19731a((int) r1, (com.ironsource.mediationsdk.C6530W) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0092
        L_0x005c:
            r1 = 2200(0x898, float:3.083E-42)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r7 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r7     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "reason"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r5] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r3] = r9     // Catch:{ all -> 0x01b9 }
            r8.m19731a((int) r1, (com.ironsource.mediationsdk.C6530W) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
        L_0x0092:
            if (r10 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r9 = r8.f16766o     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.mo36401k()     // Catch:{ all -> 0x01b9 }
            boolean r9 = r9.containsKey(r11)     // Catch:{ all -> 0x01b9 }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r9 = r8.f16766o     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.mo36401k()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.i$a r12 = com.ironsource.mediationsdk.C6663i.C6664a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x01b9 }
            r9.put(r11, r12)     // Catch:{ all -> 0x01b9 }
        L_0x00ab:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.W> r9 = r8.f16764m     // Catch:{ all -> 0x01b9 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01b9 }
            r11 = r4
            r12 = r11
        L_0x00b3:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x0152
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W r1 = (com.ironsource.mediationsdk.C6530W) r1     // Catch:{ all -> 0x01b9 }
            boolean r2 = r1.f16972e     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0134
            boolean r2 = r8.f16770s     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r1.mo36398h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            if (r11 != 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "Advanced Loading: Starting to load bidder "
            r2.<init>(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = r1.mo36401k()     // Catch:{ all -> 0x01b9 }
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = ". No other instances will be loaded at the same time."
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b9 }
            m19742b((java.lang.String) r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0118
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00f7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = r1.mo36401k()     // Catch:{ all -> 0x01b9 }
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = " as "
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            r10.append(r9)     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x01b9 }
            m19742b((java.lang.String) r9)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x01b9 }
            goto L_0x0152
        L_0x0118:
            r0.add(r1)     // Catch:{ all -> 0x01b9 }
            boolean r2 = r8.f16770s     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r2 = r10.mo36398h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r1 = r1.mo36398h()     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x0152
            int r1 = r0.size()     // Catch:{ all -> 0x01b9 }
            int r2 = r8.f16769r     // Catch:{ all -> 0x01b9 }
            if (r1 >= r2) goto L_0x0152
            goto L_0x0146
        L_0x0134:
            com.ironsource.mediationsdk.W$a r2 = r1.f16785a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r6 = com.ironsource.mediationsdk.C6530W.C6532a.INIT_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 == r6) goto L_0x0143
            com.ironsource.mediationsdk.W$a r2 = r1.f16785a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r6 = com.ironsource.mediationsdk.C6530W.C6532a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 != r6) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r2 = r4
            goto L_0x0144
        L_0x0143:
            r2 = r5
        L_0x0144:
            if (r2 == 0) goto L_0x0149
        L_0x0146:
            r11 = r5
            goto L_0x00b3
        L_0x0149:
            boolean r1 = r1.mo36320g()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x00b3
            r12 = r5
            goto L_0x00b3
        L_0x0152:
            int r9 = r0.size()     // Catch:{ all -> 0x01b9 }
            if (r9 != 0) goto L_0x018c
            com.ironsource.mediationsdk.U$a r9 = r8.f16763l     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.U$a r10 = com.ironsource.mediationsdk.C6525U.C6528a.STATE_LOADING_SMASHES     // Catch:{ all -> 0x01b9 }
            if (r9 != r10) goto L_0x018c
            if (r11 != 0) goto L_0x018c
            com.ironsource.mediationsdk.r r9 = com.ironsource.mediationsdk.C6716r.m20447a()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "No ads to show"
            r1 = 509(0x1fd, float:7.13E-43)
            r11.<init>(r1, r12)     // Catch:{ all -> 0x01b9 }
            r9.mo36851a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r10, (com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x01b9 }
            r9 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r10 = new java.lang.Object[r5][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "errorCode"
            r11[r4] = r12     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01b9 }
            r11[r5] = r12     // Catch:{ all -> 0x01b9 }
            r10[r4] = r11     // Catch:{ all -> 0x01b9 }
            r8.m19733a((int) r9, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.U$a r9 = com.ironsource.mediationsdk.C6525U.C6528a.STATE_READY_TO_LOAD     // Catch:{ all -> 0x01b9 }
            r8.mo36299a((com.ironsource.mediationsdk.C6525U.C6528a) r9)     // Catch:{ all -> 0x01b9 }
        L_0x018c:
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "smashesToLoad.size() = "
            r10.<init>(r11)
            int r11 = r0.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.verbose(r10)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a8:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b8
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.W r10 = (com.ironsource.mediationsdk.C6530W) r10
            r8.m19746g(r10)
            goto L_0x01a8
        L_0x01b8:
            return
        L_0x01b9:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6525U.mo36303a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.W, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0194, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36304a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.U$a r0 = r9.f16763l     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.U$a r1 = com.ironsource.mediationsdk.C6525U.C6528a.STATE_SHOWING     // Catch:{ all -> 0x01e1 }
            r2 = 2111(0x83f, float:2.958E-42)
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 != r1) goto L_0x0040
            java.lang.String r10 = "showInterstitial error: can't show ad while an ad is already showing"
            m19743c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 1036(0x40c, float:1.452E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.D r6 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17577c     // Catch:{ all -> 0x01e1 }
            r6.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19734a((int) r2, (java.lang.Object[][]) r0, (boolean) r5)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0040:
            com.ironsource.mediationsdk.U$a r0 = r9.f16763l     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.U$a r1 = com.ironsource.mediationsdk.C6525U.C6528a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x01e1 }
            r6 = 509(0x1fd, float:7.13E-43)
            if (r0 == r1) goto L_0x0091
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "showInterstitial() error state="
            r10.<init>(r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.U$a r0 = r9.f16763l     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e1 }
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01e1 }
            m19742b((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = "showInterstitial error: show called while no ads are available"
            m19743c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r0.<init>(r6, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.D r1 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17577c     // Catch:{ all -> 0x01e1 }
            r1.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r1[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e1 }
            r1[r3] = r6     // Catch:{ all -> 0x01e1 }
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19733a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0091:
            if (r10 != 0) goto L_0x00c7
            java.lang.String r10 = "showInterstitial error: empty default placement"
            m19743c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 1020(0x3fc, float:1.43E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.D r6 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17577c     // Catch:{ all -> 0x01e1 }
            r6.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19733a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x00c7:
            r9.f16768q = r10     // Catch:{ all -> 0x01e1 }
            r0 = 2100(0x834, float:2.943E-42)
            r9.m19738b((int) r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            boolean r0 = com.ironsource.mediationsdk.utils.C6774k.m20606a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0123
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "placement "
            r10.<init>(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r9.f16768q     // Catch:{ all -> 0x01e1 }
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = " is capped"
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01e1 }
            m19743c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 524(0x20c, float:7.34E-43)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.D r6 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17577c     // Catch:{ all -> 0x01e1 }
            r6.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19741b((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0123:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.W> r0 = r9.f16764m     // Catch:{ all -> 0x01e1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x0129:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.W r1 = (com.ironsource.mediationsdk.C6530W) r1     // Catch:{ all -> 0x01e1 }
            boolean r7 = r1.mo36320g()     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x0195
            com.ironsource.mediationsdk.U$a r0 = com.ironsource.mediationsdk.C6525U.C6528a.STATE_SHOWING     // Catch:{ all -> 0x01e1 }
            r9.mo36299a((com.ironsource.mediationsdk.C6525U.C6528a) r0)     // Catch:{ all -> 0x01e1 }
            r1.mo36318c()     // Catch:{ all -> 0x01e1 }
            r0 = 2201(0x899, float:3.084E-42)
            r9.m19739b((int) r0, (com.ironsource.mediationsdk.C6530W) r1)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.n r0 = r9.f16755d     // Catch:{ all -> 0x01e1 }
            r0.mo36985a(r1)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.n r0 = r9.f16755d     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo36987b(r1)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0175
            r1.mo36319f()     // Catch:{ all -> 0x01e1 }
            r0 = 2401(0x961, float:3.365E-42)
            r9.m19730a((int) r0, (com.ironsource.mediationsdk.C6530W) r1)     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r0.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r1.mo36401k()     // Catch:{ all -> 0x01e1 }
            r0.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = " was session capped"
            r0.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x01e1 }
        L_0x0175:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.C6774k.m20616d(r0, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            boolean r10 = com.ironsource.mediationsdk.utils.C6774k.m20606a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            if (r10 == 0) goto L_0x0193
            r10 = 2400(0x960, float:3.363E-42)
            r9.m19738b((int) r10)     // Catch:{ all -> 0x01e1 }
        L_0x0193:
            monitor-exit(r9)
            return
        L_0x0195:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = "showInterstitial "
            r7.<init>(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r1.mo36401k()     // Catch:{ all -> 0x01e1 }
            r7.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = " isReadyToShow() == false"
            r7.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01e1 }
            m19742b((java.lang.String) r1)     // Catch:{ all -> 0x01e1 }
            goto L_0x0129
        L_0x01b1:
            com.ironsource.mediationsdk.D r10 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r1 = r9.f17577c     // Catch:{ all -> 0x01e1 }
            r10.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r10 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "errorCode"
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r10[r5] = r0     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "reason"
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "Show Fail - No ads to show"
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r10[r3] = r0     // Catch:{ all -> 0x01e1 }
            r9.m19741b((int) r2, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x01e1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6525U.mo36304a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo36182a(List<C6758b> list, String str, C6758b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        this.f16757f = str;
        this.f16767p = bVar;
        this.f16758g = jSONObject;
        this.f16773v = i;
        this.f16774w = "";
        if (!TextUtils.isEmpty(str2)) {
            m19734a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        mo36843a(jSONObject2, IronSource.AD_UNIT.INTERSTITIAL);
        if (this.f17575a.mo36955a(IronSource.AD_UNIT.INTERSTITIAL)) {
            m19734a((int) IronSourceConstants.IS_AD_UNIT_CAPPED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}}, false);
            mo36299a(C6528a.STATE_READY_TO_LOAD);
            C6716r.m20447a().mo36851a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
            return;
        }
        m19734a((int) IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}}, false);
        m19737a(list);
        m19748i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36305a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z, 0);
        this.f16775x = z;
    }

    /* renamed from: b */
    public final void mo36306b(C6530W w) {
        synchronized (this) {
            m19736a(w, "onInterstitialAdClosed");
            m19740b(IronSourceConstants.IS_INSTANCE_CLOSED, w, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C6782o.m20647a().mo36990b(2))}});
            C6782o.m20647a().mo36988a(2);
            C6463D.m19392a().mo36018c(this.f17577c);
            mo36299a(C6528a.STATE_READY_TO_LOAD);
        }
    }

    /* renamed from: b */
    public final void mo36307b(IronSourceError ironSourceError, C6530W w) {
        m19731a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, w, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    /* renamed from: c */
    public final void mo36308c(C6530W w) {
        m19736a(w, "onInterstitialAdShowSucceeded");
        C6463D.m19392a().mo36019d(this.f17577c);
        m19739b((int) IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, w);
    }

    /* renamed from: d */
    public final void mo36309d(C6530W w) {
        m19736a(w, "onInterstitialAdClicked");
        C6463D.m19392a().mo36020e(this.f17577c);
        m19739b(2006, w);
    }

    /* renamed from: e */
    public final synchronized void mo36310e() {
        if (this.f16763l == C6528a.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            C6463D.m19392a().mo36013a(new IronSourceError(1037, "loadInterstitial: load cannot be invoked while showing an ad"));
        } else if ((this.f16763l == C6528a.STATE_READY_TO_LOAD || this.f16763l == C6528a.STATE_READY_TO_SHOW) && !C6716r.m20447a().mo36852a(IronSource.AD_UNIT.INTERSTITIAL)) {
            this.f16757f = "";
            this.f16768q = "";
            this.f16758g = null;
            mo36838a(IronSource.AD_UNIT.INTERSTITIAL);
            mo36844a_();
            m19734a(2001, (Object[][]) null, false);
            this.f16772u = new Date().getTime();
            if (this.f16771t) {
                if (!this.f16766o.isEmpty()) {
                    this.f16760i.mo36681a(this.f16766o);
                    this.f16766o.clear();
                }
                mo36298a();
                return;
            }
            m19745g();
            m19748i();
        } else {
            m19742b("loadInterstitial: load is already in progress");
        }
    }

    /* renamed from: e */
    public final void mo36311e(C6530W w) {
        m19736a(w, "onInterstitialAdVisible");
    }

    /* renamed from: f */
    public final void mo36312f(C6530W w) {
        m19730a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36313f() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16775x     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0039 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0039 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x001a
        L_0x0014:
            com.ironsource.mediationsdk.U$a r0 = r3.f16763l     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.U$a r2 = com.ironsource.mediationsdk.C6525U.C6528a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x0039 }
            if (r0 == r2) goto L_0x001c
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.W> r0 = r3.f16764m     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x0022:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.W r2 = (com.ironsource.mediationsdk.C6530W) r2     // Catch:{ all -> 0x0039 }
            boolean r2 = r2.mo36320g()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0022
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6525U.mo36313f():boolean");
    }
}
