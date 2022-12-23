package com.ironsource.mediationsdk.adunit.p210c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.C6433j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.C6463D;
import com.ironsource.mediationsdk.C6569ac;
import com.ironsource.mediationsdk.C6635ag;
import com.ironsource.mediationsdk.C6650c;
import com.ironsource.mediationsdk.C6653d;
import com.ironsource.mediationsdk.C6660g;
import com.ironsource.mediationsdk.C6661h;
import com.ironsource.mediationsdk.C6663i;
import com.ironsource.mediationsdk.C6716r;
import com.ironsource.mediationsdk.C6792z;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p209b.C6592b;
import com.ironsource.mediationsdk.adunit.p209b.C6593c;
import com.ironsource.mediationsdk.adunit.p209b.C6594d;
import com.ironsource.mediationsdk.adunit.p209b.C6601i;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6604b;
import com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c;
import com.ironsource.mediationsdk.adunit.p215e.C6626a;
import com.ironsource.mediationsdk.adunit.p215e.C6628b;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p217c.C6652b;
import com.ironsource.mediationsdk.sdk.C6729k;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6763a;
import com.ironsource.mediationsdk.utils.C6769f;
import com.ironsource.mediationsdk.utils.C6779m;
import com.ironsource.mediationsdk.utils.C6780n;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.c.e */
public abstract class C6612e<Smash extends C6622c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements C6433j, C6593c, C6604b, C6628b, C6635ag, C6650c, C6660g {

    /* renamed from: a */
    protected C6626a<Smash> f17140a;

    /* renamed from: b */
    protected ConcurrentHashMap<String, C6758b> f17141b;

    /* renamed from: c */
    protected ConcurrentHashMap<String, C6663i.C6664a> f17142c;

    /* renamed from: d */
    protected C6661h f17143d;

    /* renamed from: e */
    protected C6663i f17144e;

    /* renamed from: f */
    protected int f17145f;

    /* renamed from: g */
    protected String f17146g = "";

    /* renamed from: h */
    protected JSONObject f17147h;

    /* renamed from: i */
    protected C6758b f17148i;

    /* renamed from: j */
    protected Placement f17149j;

    /* renamed from: k */
    protected boolean f17150k = false;

    /* renamed from: l */
    protected C6780n f17151l;

    /* renamed from: m */
    protected C6602a f17152m;

    /* renamed from: n */
    protected C6615a f17153n;

    /* renamed from: o */
    protected C6609c f17154o;

    /* renamed from: p */
    protected C6792z f17155p;

    /* renamed from: q */
    protected C6594d f17156q;

    /* renamed from: r */
    protected C6606b f17157r;

    /* renamed from: s */
    protected IronSourceSegment f17158s;

    /* renamed from: t */
    protected final Object f17159t = new Object();

    /* renamed from: u */
    private C6769f f17160u;

    /* renamed from: v */
    private C6769f f17161v;

    /* renamed from: w */
    private C6763a f17162w;

    /* renamed from: x */
    private long f17163x = 0;

    /* renamed from: y */
    private Boolean f17164y;

    /* renamed from: z */
    private Set<ImpressionDataListener> f17165z = new HashSet();

    /* renamed from: com.ironsource.mediationsdk.adunit.c.e$a */
    public enum C6615a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public C6612e(C6602a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + aVar.f17118a + ", loading mode = " + aVar.f17125h.f17128a);
        C6769f fVar = new C6769f();
        this.f17158s = ironSourceSegment;
        this.f17152m = aVar;
        this.f17156q = new C6594d(this.f17152m.f17118a, C6594d.C6596b.MEDIATION, this);
        this.f17157r = new C6606b(this.f17152m.f17118a);
        this.f17154o = new C6609c(this.f17152m.f17125h, this);
        mo36578a(C6615a.NONE);
        this.f17165z = set;
        this.f17140a = new C6626a<>(this.f17152m.f17121d.f17683o, this.f17152m.f17121d.f17675g, this);
        this.f17156q.f17099a.mo36521a();
        this.f17141b = new ConcurrentHashMap<>();
        this.f17142c = new ConcurrentHashMap<>();
        this.f17149j = null;
        C6716r.m20447a().mo36850a(this.f17152m.f17118a, this.f17152m.f17123f);
        this.f17147h = new JSONObject();
        if (this.f17152m.mo36550a()) {
            this.f17143d = new C6661h(this.f17152m.f17118a.toString(), this.f17152m.f17121d, this);
        }
        m20128a(this.f17152m.f17120c, this.f17152m.f17121d.f17674f);
        m20136k();
        m20137l();
        this.f17160u = new C6769f();
        mo36578a(C6615a.READY_TO_LOAD);
        this.f17156q.f17099a.mo36522a(C6769f.m20576a(fVar));
        this.f17155p = new C6792z(aVar.f17126i, this);
        this.f17162w = new C6763a();
        if (this.f17152m.f17125h.mo36566b()) {
            IronLog.INTERNAL.verbose("first automatic load");
            mo36584d();
        }
    }

    /* renamed from: a */
    private static String m20123a(C6758b bVar, int i) {
        return String.format("%s%s", new Object[]{Integer.valueOf(i), bVar.mo36939a()});
    }

    /* renamed from: a */
    private String m20124a(List<C6758b> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36575a("waterfall.size() = " + list.size()));
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C6758b bVar = list.get(i);
            C6622c b = m20132b(bVar, str);
            if (b != null) {
                copyOnWriteArrayList.add(b);
                sb.append(m20123a(bVar, b.mo36604l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f17140a.mo36612a(this.f17152m.f17125h.f17128a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(mo36575a("updateWaterfall() - next waterfall is " + sb.toString()));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20125a(int i, String str, boolean z) {
        mo36578a(C6615a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36575a("errorCode = " + i + ", errorReason = " + str));
        if (this.f17152m.f17125h.mo36565a()) {
            if (z) {
                this.f17156q.f17100b.mo36524a(C6769f.m20576a(this.f17161v), i, str);
            }
            C6716r.m20447a().mo36851a(this.f17152m.f17118a, new IronSourceError(i, str));
        } else {
            if (z) {
                this.f17156q.f17103e.mo36529a(i, str);
            }
            mo36581a(false, false);
        }
        this.f17154o.mo36567a();
    }

    /* renamed from: a */
    private void m20128a(List<NetworkSettings> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f17144e = new C6663i(arrayList, i);
    }

    /* renamed from: a */
    private boolean m20129a(C6615a aVar, C6615a aVar2) {
        boolean z;
        synchronized (this.f17159t) {
            if (this.f17153n == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(mo36575a("set state from '" + this.f17153n + "' to '" + aVar2 + "'"));
                z = true;
                this.f17153n = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m20131a(NetworkSettings networkSettings) {
        AdapterBaseInterface a = C6653d.m20285a().mo36663a(networkSettings, this.f17152m.f17118a);
        return (a instanceof AdapterSettingsInterface) && this.f17140a.mo36615a(this.f17152m.f17125h.f17128a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a).getLoadWhileShowSupportedState(networkSettings));
    }

    /* renamed from: b */
    private Smash m20132b(C6758b bVar, String str) {
        NetworkSettings a = this.f17152m.mo36549a(bVar.mo36939a());
        if (a != null) {
            C6653d.m20285a().mo36663a(a, this.f17152m.f17118a);
            BaseAdAdapter a2 = mo36573a(a, this.f17152m.f17118a);
            if (a2 != null) {
                Smash a3 = mo36574a(a, a2, C6782o.m20647a().mo36991b(this.f17152m.f17118a), str);
                this.f17141b.put(a3.mo36401k(), bVar);
                this.f17142c.put(bVar.mo36939a(), C6663i.C6664a.ISAuctionPerformanceDidntAttemptToLoad);
                return a3;
            }
            String str2 = "addSmashToWaterfall - could not load ad adapter for " + a.getProviderInstanceName();
            IronLog.INTERNAL.error(mo36575a(str2));
            this.f17156q.f17103e.mo36533b(str2);
        } else {
            String str3 = "could not find matching provider settings for auction response item - item = " + bVar.mo36939a();
            IronLog.INTERNAL.error(mo36575a(str3));
            this.f17156q.f17103e.mo36534c(str3);
        }
        return null;
    }

    /* renamed from: c */
    private void m20133c(Smash smash) {
        IronLog.INTERNAL.verbose(mo36575a(""));
        String b = this.f17141b.get(smash.mo36401k()).mo36940b();
        smash.mo36596b(b);
        smash.mo36595a(b);
    }

    /* renamed from: i */
    private boolean m20134i() {
        boolean z;
        synchronized (this.f17159t) {
            z = this.f17153n == C6615a.LOADING;
        }
        return z;
    }

    /* renamed from: j */
    private boolean m20135j() {
        boolean z;
        synchronized (this.f17159t) {
            z = this.f17153n == C6615a.AUCTION;
        }
        return z;
    }

    /* renamed from: k */
    private void m20136k() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : this.f17152m.f17120c) {
            arrayList.add(new C6779m(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f17152m.f17118a)));
        }
        this.f17151l = new C6780n(arrayList);
    }

    /* renamed from: l */
    private void m20137l() {
        JSONObject jSONObject;
        IronLog.INTERNAL.verbose(mo36575a(""));
        for (NetworkSettings next : this.f17152m.f17120c) {
            if (next.isIronSource() || next.isBidder(this.f17152m.f17118a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.f17152m.f17119b);
                if (this.f17152m.f17118a == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = next.getInterstitialSettings();
                } else if (this.f17152m.f17118a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = next.getRewardedVideoSettings();
                } else {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ad unit not supported - " + this.f17152m.f17118a);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(C6652b.m20271a(jSONObject));
                AdData adData = new AdData((String) null, hashMap);
                AdapterBaseInterface a = C6653d.m20285a().mo36663a(next, this.f17152m.f17118a);
                if (a != null) {
                    try {
                        a.init(adData, ContextProvider.getInstance().getApplicationContext(), (NetworkInitializationListener) null);
                    } catch (Exception e) {
                        C6601i iVar = this.f17156q.f17103e;
                        iVar.mo36531a("initNetworks - exception while calling networkAdapter.init - " + e);
                    }
                } else {
                    this.f17156q.f17103e.mo36531a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    /* renamed from: m */
    private void m20138m() {
        IronLog.INTERNAL.verbose(mo36575a(""));
        m20124a(m20139n(), m20145t());
    }

    /* renamed from: n */
    private List<C6758b> m20139n() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings next : this.f17152m.f17120c) {
            C6779m mVar = new C6779m(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f17152m.f17118a));
            if (!next.isBidder(this.f17152m.f17118a) && !this.f17151l.mo36987b(mVar) && m20131a(next)) {
                copyOnWriteArrayList.add(new C6758b(mVar.mo36401k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: o */
    private void m20140o() {
        Iterator it = m20141p().iterator();
        while (it.hasNext()) {
            m20133c((C6622c) it.next());
        }
    }

    /* renamed from: p */
    private ArrayList<Smash> m20141p() {
        StringBuilder sb;
        IronLog.INTERNAL.verbose(mo36575a("mWaterfall.size() = " + this.f17140a.mo36611a().size()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.f17140a.mo36611a().size() || i2 >= this.f17152m.f17122e) {
                break;
            }
            C6622c cVar = (C6622c) this.f17140a.mo36611a().get(i);
            if (cVar.mo36600f()) {
                if (cVar.mo36598d() || cVar.mo36599e()) {
                    IronLog.INTERNAL.verbose("smash = " + cVar.mo36605m());
                } else if (!cVar.mo36603i()) {
                    arrayList.add(cVar);
                } else if (i2 == 0) {
                    sb.append(cVar.mo36401k());
                    sb.append(". No other instances will be loaded at the same time.");
                    String sb2 = sb.toString();
                    IronLog.INTERNAL.verbose(mo36575a(sb2));
                    IronSourceUtils.sendAutomationLog(sb2);
                    arrayList.add(cVar);
                    i2++;
                } else {
                    sb = new StringBuilder("Advanced Loading: Won't start loading bidder ");
                    sb.append(cVar.mo36401k());
                    sb.append(" as a non bidder is being loaded");
                    String sb3 = sb.toString();
                    IronLog.INTERNAL.verbose(mo36575a(sb3));
                    IronSourceUtils.sendAutomationLog(sb3);
                }
                i2++;
            } else {
                IronLog.INTERNAL.verbose(mo36575a(String.format("smash %s is not ready to load", new Object[]{cVar.mo36605m()})));
            }
            i++;
        }
        if (i2 == 0) {
            m20125a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", true);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r2 <= 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        new java.util.Timer().schedule(new com.ironsource.mediationsdk.adunit.p210c.C6612e.C66131(r4), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        m20143r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r2 = r4.f17152m.f17121d.f17677i - com.ironsource.mediationsdk.utils.C6769f.m20576a(r4.f17160u);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20142q() {
        /*
            r4 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r4.mo36575a((java.lang.String) r1)
            r0.verbose(r1)
            java.lang.Object r0 = r4.f17159t
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r4.f17153n     // Catch:{ all -> 0x0041 }
            com.ironsource.mediationsdk.adunit.c.e$a r2 = com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a.AUCTION     // Catch:{ all -> 0x0041 }
            if (r1 != r2) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0016:
            com.ironsource.mediationsdk.adunit.c.e$a r1 = com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a.AUCTION     // Catch:{ all -> 0x0041 }
            r4.mo36578a((com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a) r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.ironsource.mediationsdk.utils.f r0 = r4.f17160u
            long r0 = com.ironsource.mediationsdk.utils.C6769f.m20576a(r0)
            com.ironsource.mediationsdk.adunit.c.a r2 = r4.f17152m
            com.ironsource.mediationsdk.utils.c r2 = r2.f17121d
            long r2 = r2.f17677i
            long r2 = r2 - r0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.ironsource.mediationsdk.adunit.c.e$1 r1 = new com.ironsource.mediationsdk.adunit.c.e$1
            r1.<init>()
            r0.schedule(r1, r2)
            return
        L_0x003d:
            r4.m20143r()
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p210c.C6612e.m20142q():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m20143r() {
        IronLog.INTERNAL.verbose(mo36575a(""));
        AsyncTask.execute(new Runnable() {
            public final void run() {
                int i;
                C6612e.this.f17147h = new JSONObject();
                C6612e.this.f17156q.f17101c.mo36512a();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (NetworkSettings next : C6612e.this.f17152m.f17120c) {
                    if (!C6612e.this.f17151l.mo36987b(new C6779m(next.getProviderInstanceName(), next.getMaxAdsPerSession(C6612e.this.f17152m.f17118a))) && C6612e.this.m20131a(next)) {
                        if (next.isBidder(C6612e.this.f17152m.f17118a)) {
                            AdapterBaseInterface a = C6653d.m20285a().mo36663a(next, C6612e.this.f17152m.f17118a);
                            if (a instanceof AdapterBidderInterface) {
                                try {
                                    Map<String, Object> biddingData = ((AdapterBidderInterface) a).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                    if (biddingData != null) {
                                        hashMap.put(next.getProviderInstanceName(), biddingData);
                                        sb.append(next.getInstanceType(C6612e.this.f17152m.f17118a) + next.getProviderInstanceName() + ",");
                                    } else {
                                        C6601i iVar = C6612e.this.f17156q.f17103e;
                                        iVar.mo36535d("missing bidding data for " + next.getProviderInstanceName());
                                    }
                                } catch (Exception e) {
                                    C6601i iVar2 = C6612e.this.f17156q.f17103e;
                                    iVar2.mo36545n("exception while calling networkAdapter.getBiddingData - " + e);
                                }
                            } else {
                                C6612e.this.f17156q.f17103e.mo36531a(a == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface");
                            }
                        } else {
                            arrayList.add(next.getProviderInstanceName());
                            sb.append(next.getInstanceType(C6612e.this.f17152m.f17118a) + next.getProviderInstanceName() + ",");
                        }
                    }
                }
                IronLog ironLog = IronLog.INTERNAL;
                C6612e eVar = C6612e.this;
                ironLog.verbose(eVar.mo36575a("auction waterfallString = " + sb));
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    IronLog.INTERNAL.verbose(C6612e.this.mo36575a("auction failed - no candidates"));
                    C6612e.this.f17156q.f17101c.mo36514a(0, 1005, "No candidates available for auctioning");
                    C6612e eVar2 = C6612e.this;
                    IronSource.AD_UNIT ad_unit = eVar2.f17152m.f17118a;
                    if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                        i = 1035;
                    } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                        i = 1024;
                    } else {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.warning("ad unit not supported - " + ad_unit);
                        i = IronSourceError.ERROR_CODE_GENERIC;
                    }
                    eVar2.m20125a(i, "no auction candidates", true);
                    return;
                }
                C6612e.this.f17156q.f17101c.mo36515a(sb.toString());
                if (C6612e.this.f17143d != null) {
                    C6612e.this.f17143d.mo36677a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6612e.this.f17144e, C6782o.m20647a().mo36991b(C6612e.this.f17152m.f17118a), C6612e.this.f17158s);
                } else {
                    IronLog.INTERNAL.error(C6612e.this.mo36575a("mAuctionHandler is null"));
                }
            }
        });
    }

    /* renamed from: s */
    private void m20144s() {
        this.f17162w.mo36954a(this.f17152m.f17118a, false);
    }

    /* renamed from: t */
    private static String m20145t() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Adapter mo36573a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Smash mo36574a(NetworkSettings networkSettings, Adapter adapter, int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo36575a(String str) {
        String name = this.f17152m.f17118a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return name + " - " + str;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36507a(C6592b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f17140a.f17209b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f17140a.f17209b);
        }
        JSONObject jSONObject = this.f17147h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f17147h);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C6782o.m20647a().mo36991b(this.f17152m.f17118a)));
        if (!(bVar == C6592b.LOAD_AD_SUCCESS || bVar == C6592b.LOAD_AD_FAILED || bVar == C6592b.LOAD_AD_FAILED_WITH_REASON || bVar == C6592b.AUCTION_SUCCESS || bVar == C6592b.AUCTION_FAILED || bVar == C6592b.AD_UNIT_CAPPED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f17145f));
            if (!TextUtils.isEmpty(this.f17146g)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f17146g);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo36576a(int i) {
        C6601i iVar = this.f17156q.f17103e;
        iVar.mo36547p("waterfalls hold too many with size = " + i);
    }

    /* renamed from: a */
    public final void mo36176a(int i, String str, int i2, String str2, long j) {
        String str3 = "";
        IronLog.INTERNAL.verbose(mo36575a(str3));
        if (m20135j()) {
            String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
            IronLog.INTERNAL.verbose(mo36575a(str4));
            StringBuilder sb = new StringBuilder();
            IronSource.AD_UNIT ad_unit = this.f17152m.f17118a;
            if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                str3 = "BN";
            }
            sb.append(str3);
            sb.append(": ");
            sb.append(str4);
            IronSourceUtils.sendAutomationLog(sb.toString());
            this.f17145f = i2;
            this.f17146g = str2;
            this.f17147h = new JSONObject();
            m20138m();
            this.f17156q.f17101c.mo36514a(j, i, str);
            mo36578a(C6615a.LOADING);
            m20140o();
            return;
        }
        this.f17156q.f17103e.mo36539h("unexpected auction fail - error = " + i + ", " + str);
    }

    /* renamed from: a */
    public final void mo36577a(IronSourceSegment ironSourceSegment) {
        this.f17158s = ironSourceSegment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36578a(C6615a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36575a("from " + this.f17153n + " to " + aVar));
        synchronized (this.f17159t) {
            this.f17153n = aVar;
        }
    }

    /* renamed from: a */
    public final void mo36558a(C6622c<?> cVar) {
        IronLog.INTERNAL.verbose(mo36575a(cVar.mo36605m()));
        if (cVar.mo36607o() != this.f17140a.f17209b) {
            String str = "onLoadSuccess was invoked with state = " + this.f17153n + " auctionId: " + cVar.mo36607o() + " and the current id is " + this.f17140a.f17209b;
            IronLog.INTERNAL.verbose(str);
            this.f17156q.f17103e.mo36540i(str);
            return;
        }
        this.f17142c.put(cVar.mo36401k(), C6663i.C6664a.ISAuctionPerformanceLoadedSuccessfully);
        if (m20129a(C6615a.LOADING, C6615a.READY_TO_SHOW)) {
            this.f17156q.f17100b.mo36525a(C6769f.m20576a(this.f17161v), this.f17152m.f17118a == IronSource.AD_UNIT.REWARDED_VIDEO && this.f17152m.f17125h.f17128a == C6607a.C6608a.MANUAL);
            if (this.f17152m.f17125h.mo36566b()) {
                this.f17155p.mo37016a(0);
            }
            if (this.f17152m.mo36550a()) {
                C6758b bVar = this.f17141b.get(cVar.mo36401k());
                if (bVar != null) {
                    C6626a<Smash> aVar = this.f17140a;
                    aVar.mo36614a(aVar.f17209b, bVar.mo36938a(""));
                    C6661h.m20330a(bVar, cVar.mo36604l(), this.f17148i);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Smash> it = this.f17140a.mo36611a().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C6622c) it.next()).mo36401k());
                    }
                    C6661h.m20332a((ArrayList<String>) arrayList, this.f17141b, cVar.mo36604l(), this.f17148i, bVar);
                } else {
                    String k = cVar.mo36401k();
                    String str2 = "winner instance missing from waterfall - " + k;
                    IronLog.INTERNAL.verbose(mo36575a(str2));
                    this.f17156q.f17103e.mo36530a(1010, str2, k);
                }
            }
            if (this.f17152m.f17125h.mo36565a()) {
                C6606b bVar2 = this.f17157r;
                AdInfo a = this.f17140a.mo36610a(cVar.mo36607o());
                if (bVar2.f17127a == IronSource.AD_UNIT.INTERSTITIAL) {
                    C6463D.m19392a().mo36012a(a);
                } else if (bVar2.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    C6569ac a2 = C6569ac.m19976a();
                    if (a2.f16996a != null && (a2.f16996a instanceof RewardedVideoManualListener)) {
                        C6423c.f16330a.mo35933a(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.ac.1.run():void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.ac.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    }
                    if (a2.f16997b != null && (a2.f16997b instanceof C6729k)) {
                        C6423c.f16330a.mo35933a(new Runnable(a) {

                            /* renamed from: a */
                            private /* synthetic */ AdInfo f17002a;

                            public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.ac.11.run():void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.ac.11.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    }
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.f17127a);
                }
            } else {
                mo36581a(true, false);
            }
        } else {
            this.f17156q.f17103e.mo36540i(String.format("unexpected load success for smash - %s", new Object[]{cVar.mo36605m()}));
        }
    }

    /* renamed from: a */
    public final void mo36579a(ImpressionDataListener impressionDataListener) {
        this.f17165z.add(impressionDataListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r6.hasNext() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        m20133c((com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c) r6.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36559a(com.ironsource.mediationsdk.logger.IronSourceError r6, com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c<?> r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.f17159t
            monitor-enter(r1)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r3.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = r7.mo36605m()     // Catch:{ all -> 0x00ce }
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = " - error = "
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            r3.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r5.mo36575a((java.lang.String) r3)     // Catch:{ all -> 0x00ce }
            r2.verbose(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = r7.mo36607o()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r3 = r5.f17140a     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r3.f17209b     // Catch:{ all -> 0x00ce }
            if (r2 != r3) goto L_0x0098
            com.ironsource.mediationsdk.adunit.c.e$a r2 = r5.f17153n     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a.AUCTION     // Catch:{ all -> 0x00ce }
            if (r2 != r3) goto L_0x003a
            goto L_0x0098
        L_0x003a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r5.f17142c     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r7.mo36401k()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C6663i.C6664a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ all -> 0x00ce }
            boolean r2 = r5.m20134i()     // Catch:{ all -> 0x00ce }
            if (r2 != 0) goto L_0x007e
            boolean r2 = r5.mo36585f()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0052
            goto L_0x007e
        L_0x0052:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f17156q     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.i r2 = r2.f17103e     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = "unexpected load failed for state - "
            r3.<init>(r4)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r4 = r5.f17153n     // Catch:{ all -> 0x00ce }
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = " smash - "
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.mo36605m()     // Catch:{ all -> 0x00ce }
            r3.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = ", error - "
            r3.append(r7)     // Catch:{ all -> 0x00ce }
            r3.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00ce }
            r2.mo36541j(r6)     // Catch:{ all -> 0x00ce }
            goto L_0x0082
        L_0x007e:
            java.util.ArrayList r0 = r5.m20141p()     // Catch:{ all -> 0x00ce }
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            java.util.Iterator r6 = r0.iterator()
        L_0x0087:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()
            com.ironsource.mediationsdk.adunit.d.a.c r7 = (com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c) r7
            r5.m20133c(r7)
            goto L_0x0087
        L_0x0097:
            return
        L_0x0098:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "onAdLoadFailed was invoked with state ="
            r6.<init>(r0)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r0 = r5.f17153n     // Catch:{ all -> 0x00ce }
            r6.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = " auctionId: "
            r6.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.mo36607o()     // Catch:{ all -> 0x00ce }
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = " and the current id is "
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r7 = r5.f17140a     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.f17209b     // Catch:{ all -> 0x00ce }
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00ce }
            r7.verbose(r6)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.d r7 = r5.f17156q     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.i r7 = r7.f17103e     // Catch:{ all -> 0x00ce }
            r7.mo36541j(r6)     // Catch:{ all -> 0x00ce }
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p210c.C6612e.mo36559a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36580a(C6758b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo36938a(str);
            if (a != null) {
                for (ImpressionDataListener next : this.f17165z) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info(mo36575a("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a));
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(mo36575a("no auctionResponseItem or listener"));
    }

    /* renamed from: a */
    public final void mo36182a(List<C6758b> list, String str, C6758b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(mo36575a(""));
        if (m20135j()) {
            this.f17146g = "";
            this.f17145f = i;
            this.f17148i = bVar;
            this.f17147h = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f17156q.f17103e.mo36532b(i2, str2);
            }
            this.f17162w.mo36954a(this.f17152m.f17118a, jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false);
            if (this.f17162w.mo36955a(this.f17152m.f17118a)) {
                this.f17156q.f17101c.mo36517c(str);
                m20125a(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", false);
                return;
            }
            String a = m20124a(list, str);
            this.f17156q.f17101c.mo36513a(j);
            this.f17156q.f17101c.mo36516b(a);
            mo36578a(C6615a.LOADING);
            m20140o();
            return;
        }
        C6601i iVar = this.f17156q.f17103e;
        iVar.mo36538g("unexpected auction success for auctionId - " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (mo36572b() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3.f17164y.booleanValue() != false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35940a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f17150k
            if (r0 == 0) goto L_0x0048
            com.ironsource.mediationsdk.adunit.c.a r0 = r3.f17152m
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f17125h
            boolean r0 = r0.mo36565a()
            if (r0 == 0) goto L_0x000f
            goto L_0x0048
        L_0x000f:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.f17164y
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0027:
            r2 = r1
            goto L_0x0043
        L_0x0029:
            r2 = 1
            if (r4 == 0) goto L_0x0039
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0039
            boolean r0 = r3.mo36572b()
            if (r0 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            if (r4 != 0) goto L_0x0027
            java.lang.Boolean r0 = r3.f17164y
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r3.mo36581a((boolean) r4, (boolean) r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p210c.C6612e.mo35940a(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36581a(boolean z, boolean z2) {
        synchronized (this.f17159t) {
            if (this.f17164y == null || this.f17164y.booleanValue() != z) {
                this.f17164y = Boolean.valueOf(z);
                long j = 0;
                if (this.f17163x != 0) {
                    j = new Date().getTime() - this.f17163x;
                }
                this.f17163x = new Date().getTime();
                this.f17156q.f17100b.mo36527a(z, j, z2);
                this.f17157r.mo36564a(z, this.f17140a.mo36610a(this.f17140a.f17209b));
            }
        }
    }

    /* renamed from: b */
    public final void mo36560b(C6622c<?> cVar) {
        IronLog.INTERNAL.verbose(mo36575a(cVar.mo36605m()));
        C6606b bVar = this.f17157r;
        Placement placement = this.f17149j;
        AdInfo a = this.f17140a.mo36610a(cVar.mo36607o());
        if (bVar.f17127a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6463D.m19392a().mo36020e(a);
        } else if (bVar.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36423b(placement, a);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f17127a);
        }
    }

    /* renamed from: b */
    public final void mo36582b(ImpressionDataListener impressionDataListener) {
        this.f17165z.remove(impressionDataListener);
    }

    /* renamed from: b */
    public final void mo36583b(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36575a("track = " + z));
        this.f17150k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo36572b();

    /* renamed from: c_ */
    public final void mo36187c_() {
        if (this.f17152m.f17125h.mo36566b()) {
            mo36578a(C6615a.READY_TO_LOAD);
            mo36581a(false, true);
            mo36584d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        if (r5.f17152m.mo36550a() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        m20138m();
        m20140o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36584d() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.mo36575a((java.lang.String) r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f17159t
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f17125h     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36566b()     // Catch:{ all -> 0x0107 }
            r2 = 1
            if (r1 == 0) goto L_0x0034
            com.ironsource.mediationsdk.utils.n r1 = r5.f17151l     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36986a()     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "all smashes are capped"
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = r5.mo36575a((java.lang.String) r1)     // Catch:{ all -> 0x0107 }
            r3.verbose(r4)     // Catch:{ all -> 0x0107 }
            r3 = 80001(0x13881, float:1.12105E-40)
            r5.m20125a(r3, r1, r2)     // Catch:{ all -> 0x0107 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            return
        L_0x0034:
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f17125h     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f17128a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a.C6608a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0107 }
            r4 = 0
            if (r1 == r3) goto L_0x0075
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f17153n     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a.SHOWING     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x0075
            java.lang.String r1 = "load cannot be invoked while showing an ad"
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r5.mo36575a((java.lang.String) r1)     // Catch:{ all -> 0x0107 }
            r2.error(r3)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r3 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.f17118a     // Catch:{ all -> 0x0107 }
            int r3 = com.ironsource.mediationsdk.adunit.p208a.C6590a.m20034b(r3)     // Catch:{ all -> 0x0107 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f17125h     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36565a()     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x006d
            com.ironsource.mediationsdk.adunit.c.b r1 = r5.f17157r     // Catch:{ all -> 0x0107 }
            r1.mo36562a(r2)     // Catch:{ all -> 0x0107 }
            goto L_0x0073
        L_0x006d:
            com.ironsource.mediationsdk.adunit.c.b r1 = r5.f17157r     // Catch:{ all -> 0x0107 }
            r2 = 0
            r1.mo36564a((boolean) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ all -> 0x0107 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            return
        L_0x0075:
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f17125h     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f17128a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a.C6608a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0107 }
            if (r1 == r3) goto L_0x00a6
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f17153n     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a.READY_TO_LOAD     // Catch:{ all -> 0x0107 }
            if (r1 == r3) goto L_0x008b
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f17153n     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a.READY_TO_SHOW     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x0099
        L_0x008b:
            com.ironsource.mediationsdk.r r1 = com.ironsource.mediationsdk.C6716r.m20447a()     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r3 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.f17118a     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36852a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x00a6
        L_0x0099:
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "load is already in progress"
            java.lang.String r2 = r5.mo36575a((java.lang.String) r2)     // Catch:{ all -> 0x0107 }
            r1.error(r2)     // Catch:{ all -> 0x0107 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            return
        L_0x00a6:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            r5.f17147h = r1     // Catch:{ all -> 0x0107 }
            r5.m20144s()     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = r1.f17118a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x00c3
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f17152m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f17125h     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f17128a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a.C6608a.MANUAL     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r2 = r4
        L_0x00c4:
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f17156q     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.b.h r1 = r1.f17100b     // Catch:{ all -> 0x0107 }
            r1.mo36526a(r2)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            r5.f17161v = r1     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f17152m     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36550a()     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x00f2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r1 = r5.f17142c     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x00ee
            com.ironsource.mediationsdk.i r1 = r5.f17144e     // Catch:{ all -> 0x0107 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r5.f17142c     // Catch:{ all -> 0x0107 }
            r1.mo36681a((java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.C6663i.C6664a>) r2)     // Catch:{ all -> 0x0107 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r1 = r5.f17142c     // Catch:{ all -> 0x0107 }
            r1.clear()     // Catch:{ all -> 0x0107 }
        L_0x00ee:
            r5.m20142q()     // Catch:{ all -> 0x0107 }
            goto L_0x00f7
        L_0x00f2:
            com.ironsource.mediationsdk.adunit.c.e$a r1 = com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a.LOADING     // Catch:{ all -> 0x0107 }
            r5.mo36578a((com.ironsource.mediationsdk.adunit.p210c.C6612e.C6615a) r1)     // Catch:{ all -> 0x0107 }
        L_0x00f7:
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r5.f17152m
            boolean r0 = r0.mo36550a()
            if (r0 != 0) goto L_0x0106
            r5.m20138m()
            r5.m20140o()
        L_0x0106:
            return
        L_0x0107:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p210c.C6612e.mo36584d():void");
    }

    /* renamed from: e */
    public final void mo36189e() {
        IronLog.INTERNAL.verbose(mo36575a(""));
        mo36584d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo36585f() {
        boolean z;
        synchronized (this.f17159t) {
            z = this.f17153n == C6615a.READY_TO_SHOW;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo36586g() {
        this.f17165z.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo36587h() {
        Placement placement = this.f17149j;
        return placement == null ? "" : placement.getPlacementName();
    }
}
