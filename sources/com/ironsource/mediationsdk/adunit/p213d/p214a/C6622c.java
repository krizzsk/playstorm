package com.ironsource.mediationsdk.adunit.p213d.p214a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6656f;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p208a.C6590a;
import com.ironsource.mediationsdk.adunit.p209b.C6592b;
import com.ironsource.mediationsdk.adunit.p209b.C6593c;
import com.ironsource.mediationsdk.adunit.p209b.C6594d;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6604b;
import com.ironsource.mediationsdk.adunit.p213d.C6619a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p216b.C6648c;
import com.ironsource.mediationsdk.p217c.C6652b;
import com.ironsource.mediationsdk.utils.C6769f;
import com.ironsource.mediationsdk.utils.C6780n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.c */
public abstract class C6622c<Listener extends C6604b> implements AdapterAdListener, NetworkInitializationListener, C6593c, C6648c.C6649a, C6780n.C6781a {

    /* renamed from: a */
    protected C6619a f17186a;

    /* renamed from: b */
    protected Listener f17187b;

    /* renamed from: c */
    protected C6594d f17188c = new C6594d(this.f17186a.f17175a, C6594d.C6596b.PROVIDER, this);

    /* renamed from: d */
    protected C6623a f17189d;

    /* renamed from: e */
    protected Placement f17190e;

    /* renamed from: f */
    protected AdData f17191f;

    /* renamed from: g */
    protected Object f17192g;

    /* renamed from: h */
    private BaseAdAdapter<?, AdapterAdListener> f17193h;

    /* renamed from: i */
    private C6691a f17194i;

    /* renamed from: j */
    private JSONObject f17195j;

    /* renamed from: k */
    private String f17196k;

    /* renamed from: l */
    private Long f17197l;

    /* renamed from: m */
    private C6769f f17198m;

    /* renamed from: n */
    private C6648c f17199n;

    /* renamed from: com.ironsource.mediationsdk.adunit.d.a.c$a */
    public enum C6623a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    public C6622c(C6619a aVar, BaseAdAdapter<?, ?> baseAdAdapter, C6691a aVar2, Listener listener) {
        this.f17186a = aVar;
        this.f17187b = listener;
        this.f17194i = aVar2;
        this.f17195j = aVar2.f17478b;
        this.f17193h = baseAdAdapter;
        this.f17199n = new C6648c((long) (this.f17186a.f17178d * 1000));
        this.f17192g = new Object();
        mo36594a(C6623a.NONE);
    }

    /* renamed from: a */
    private void m20182a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.f17188c == null) {
            return;
        }
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f17188c.f17100b.mo36528b(j, i);
        } else if (!TextUtils.isEmpty(str)) {
            this.f17188c.f17100b.mo36524a(j, i, str);
        } else {
            this.f17188c.f17100b.mo36523a(j, i);
        }
    }

    /* renamed from: a */
    private boolean mo36592a() {
        return this.f17189d == C6623a.INIT_IN_PROGRESS;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36507a(C6592b bVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f17193h != null ? this.f17193h.getNetworkAdapter().getAdapterVersion() : str);
            if (this.f17193h != null) {
                str = this.f17193h.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
        } catch (Exception unused) {
            IronLog.INTERNAL.error(mo36597c("could not get adapter version for event data" + mo36605m()));
        }
        hashMap.put("spId", this.f17194i.f17477a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f17194i.f17477a.getAdSourceNameForEvents());
        hashMap.put("instanceType", Integer.valueOf(mo36604l()));
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f17196k)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f17196k);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f17186a.f17179e));
        if (this.f17186a.f17180f != null && this.f17186a.f17180f.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f17186a.f17180f);
        }
        if (!TextUtils.isEmpty(this.f17186a.f17181g)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f17186a.f17181g);
        }
        if (!(bVar == C6592b.LOAD_AD || bVar == C6592b.LOAD_AD_SUCCESS || bVar == C6592b.LOAD_AD_FAILED || bVar == C6592b.LOAD_AD_FAILED_WITH_REASON || bVar == C6592b.LOAD_AD_NO_FILL || bVar == C6592b.AD_OPENED || bVar == C6592b.AD_CLOSED || bVar == C6592b.SHOW_AD || bVar == C6592b.SHOW_AD_FAILED || bVar == C6592b.AD_CLICKED || bVar == C6592b.AD_REWARDED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f17186a.f17182h));
            if (!TextUtils.isEmpty(this.f17186a.f17183i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f17186a.f17183i);
            }
        }
        if (!TextUtils.isEmpty(this.f17186a.f17177c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f17186a.f17177c.getCustomNetwork());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36594a(C6623a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36597c("to " + aVar));
        this.f17189d = aVar;
    }

    /* renamed from: a */
    public final void mo36595a(String str) {
        try {
            IronLog.INTERNAL.verbose(mo36597c(""));
            boolean z = false;
            this.f17188c.f17100b.mo36526a(false);
            this.f17197l = null;
            this.f17198m = new C6769f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.f17186a.f17176b);
            hashMap.putAll(C6652b.m20271a(this.f17195j));
            this.f17191f = new AdData(str, hashMap);
            synchronized (this.f17192g) {
                if (this.f17189d != C6623a.NONE) {
                    z = true;
                } else {
                    mo36594a(C6623a.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str2 = "loadAd - incorrect state while loading, state = " + this.f17189d;
                IronLog.INTERNAL.error(mo36597c(str2));
                this.f17188c.f17103e.mo36545n(str2);
                onInitFailed(C6590a.m20029a(this.f17186a.f17175a), str2);
                return;
            }
            this.f17199n.mo36647a(this);
            AdapterBaseInterface networkAdapter = this.f17193h.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f17191f, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str3 = "loadAd - network adapter not available " + mo36605m();
            IronLog.INTERNAL.error(mo36597c(str3));
            this.f17188c.f17103e.mo36531a(str3);
            onInitFailed(C6590a.m20029a(this.f17186a.f17175a), str3);
        } catch (Throwable th) {
            String str4 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(mo36597c(str4));
            C6594d dVar = this.f17188c;
            if (dVar != null) {
                dVar.f17103e.mo36545n(str4);
            }
            onInitFailed(C6590a.m20029a(this.f17186a.f17175a), str4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r0 = r6.f17187b;
        r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out");
        com.ironsource.mediationsdk.utils.C6769f.m20576a(r6.f17198m);
        r0.mo36559a(r1, r6);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36286b() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state = "
            r1.<init>(r2)
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r6.f17189d
            r1.append(r2)
            java.lang.String r2 = ", isBidder = "
            r1.append(r2)
            boolean r2 = r6.mo36603i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r6.mo36597c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.utils.f r0 = r6.f17198m
            long r0 = com.ironsource.mediationsdk.utils.C6769f.m20576a(r0)
            java.lang.String r2 = "time out"
            java.lang.Object r3 = r6.f17192g
            monitor-enter(r3)
            boolean r4 = r6.mo36598d()     // Catch:{ all -> 0x0088 }
            r5 = 1025(0x401, float:1.436E-42)
            if (r4 == 0) goto L_0x005f
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a.FAILED     // Catch:{ all -> 0x0088 }
            r6.mo36594a((com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a) r4)     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f17188c     // Catch:{ all -> 0x0088 }
            if (r4 == 0) goto L_0x004f
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f17188c     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.f17100b     // Catch:{ all -> 0x0088 }
            r4.mo36523a((long) r0, (int) r5)     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f17188c     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.f17100b     // Catch:{ all -> 0x0088 }
            r4.mo36524a((long) r0, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0088 }
        L_0x004f:
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            Listener r0 = r6.f17187b
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r2)
            com.ironsource.mediationsdk.utils.f r2 = r6.f17198m
            com.ironsource.mediationsdk.utils.C6769f.m20576a(r2)
            r0.mo36559a(r1, r6)
            return
        L_0x005f:
            java.lang.String r0 = "unexpected timeout for %s, state - %s, error - %s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0088 }
            r2 = 0
            java.lang.String r4 = r6.mo36605m()     // Catch:{ all -> 0x0088 }
            r1[r2] = r4     // Catch:{ all -> 0x0088 }
            r2 = 1
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = r6.f17189d     // Catch:{ all -> 0x0088 }
            r1[r2] = r4     // Catch:{ all -> 0x0088 }
            r2 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0088 }
            r1[r2] = r4     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.d r1 = r6.f17188c     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x0086
            com.ironsource.mediationsdk.adunit.b.d r1 = r6.f17188c     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.i r1 = r1.f17103e     // Catch:{ all -> 0x0088 }
            r1.mo36544m(r0)     // Catch:{ all -> 0x0088 }
        L_0x0086:
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            return
        L_0x0088:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.mo36286b():void");
    }

    /* renamed from: b */
    public final void mo36596b(String str) {
        C6656f.m20309a();
        this.f17196k = C6656f.m20320d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo36597c(String str) {
        String str2 = this.f17186a.f17175a.name() + " - " + mo36605m() + " - state = " + this.f17189d;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* renamed from: c */
    public void mo36593c() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f17193h;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.f17193h = null;
            } catch (Exception e) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f17194i.f17477a.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(mo36597c(str));
                this.f17188c.f17103e.mo36545n(str);
            }
        }
        C6594d dVar = this.f17188c;
        if (dVar != null) {
            dVar.mo36508a();
            this.f17188c = null;
        }
        C6648c cVar = this.f17199n;
        if (cVar != null) {
            cVar.mo36643c();
            this.f17199n = null;
        }
    }

    /* renamed from: d */
    public final boolean mo36598d() {
        return this.f17189d == C6623a.INIT_IN_PROGRESS || this.f17189d == C6623a.LOADING;
    }

    /* renamed from: e */
    public final boolean mo36599e() {
        return this.f17189d == C6623a.LOADED;
    }

    /* renamed from: f */
    public final boolean mo36600f() {
        return this.f17189d != C6623a.FAILED;
    }

    /* renamed from: g */
    public final void mo36601g() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        C6594d dVar = this.f17188c;
        if (dVar != null) {
            dVar.f17102d.mo36494a();
        }
    }

    /* renamed from: h */
    public final Long mo36602h() {
        return this.f17197l;
    }

    /* renamed from: i */
    public final boolean mo36603i() {
        return this.f17194i.f17479c;
    }

    /* renamed from: j */
    public final int mo36400j() {
        return this.f17194i.f17481e;
    }

    /* renamed from: k */
    public final String mo36401k() {
        return this.f17194i.f17477a.getProviderName();
    }

    /* renamed from: l */
    public final int mo36604l() {
        return this.f17194i.f17480d;
    }

    /* renamed from: m */
    public final String mo36605m() {
        return String.format("%s %s", new Object[]{mo36401k(), Integer.valueOf(hashCode())});
    }

    /* renamed from: n */
    public final String mo36606n() {
        return this.f17194i.f17477a.getProviderTypeForReflection();
    }

    /* renamed from: o */
    public final String mo36607o() {
        return this.f17186a.f17181g;
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        C6594d dVar = this.f17188c;
        if (dVar != null) {
            dVar.f17102d.mo36502d(mo36609q());
        }
        this.f17187b.mo36560b(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error = "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r7.mo36597c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.b.c r0 = r7.f17199n
            if (r0 == 0) goto L_0x0026
            r0.mo36648d()
        L_0x0026:
            com.ironsource.mediationsdk.utils.f r0 = r7.f17198m
            long r5 = com.ironsource.mediationsdk.utils.C6769f.m20576a(r0)
            java.lang.Object r0 = r7.f17192g
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f17189d     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a.LOADING     // Catch:{ all -> 0x00bb }
            if (r1 != r2) goto L_0x004d
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.m20182a(r2, r3, r4, r5)     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r8 = com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a.FAILED     // Catch:{ all -> 0x00bb }
            r7.mo36594a((com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a) r8)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            Listener r8 = r7.f17187b
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r0.<init>(r9, r10)
            r8.mo36559a(r0, r7)
            return
        L_0x004d:
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f17189d     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a.FAILED     // Catch:{ all -> 0x00bb }
            if (r1 != r2) goto L_0x005c
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.m20182a(r2, r3, r4, r5)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x005c:
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f17189d     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a.LOADED     // Catch:{ all -> 0x00bb }
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0091
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r1 = com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED     // Catch:{ all -> 0x00bb }
            if (r8 != r1) goto L_0x0091
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00bb }
            r7.f17197l = r8     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.d r8 = r7.f17188c     // Catch:{ all -> 0x00bb }
            if (r8 == 0) goto L_0x008f
            com.ironsource.mediationsdk.adunit.b.d r8 = r7.f17188c     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.i r8 = r8.f17103e     // Catch:{ all -> 0x00bb }
            java.lang.String r9 = "ad expired for %s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.model.a r1 = r7.f17194i     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.f17477a     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = r1.getProviderName()     // Catch:{ all -> 0x00bb }
            r10[r4] = r1     // Catch:{ all -> 0x00bb }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x00bb }
            r8.mo36548q(r9)     // Catch:{ all -> 0x00bb }
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x0091:
            java.lang.String r8 = "unexpected load failed for %s, state - %s, error - %s, %s"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = r7.mo36605m()     // Catch:{ all -> 0x00bb }
            r1[r4] = r2     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r7.f17189d     // Catch:{ all -> 0x00bb }
            r1[r3] = r2     // Catch:{ all -> 0x00bb }
            r2 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00bb }
            r1[r2] = r9     // Catch:{ all -> 0x00bb }
            r9 = 3
            r1[r9] = r10     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = java.lang.String.format(r8, r1)     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.f17188c     // Catch:{ all -> 0x00bb }
            if (r9 == 0) goto L_0x00b9
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.f17188c     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.i r9 = r9.f17103e     // Catch:{ all -> 0x00bb }
            r9.mo36541j(r8)     // Catch:{ all -> 0x00bb }
        L_0x00b9:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType, int, java.lang.String):void");
    }

    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        C6648c cVar = this.f17199n;
        if (cVar != null) {
            cVar.mo36648d();
        }
        if (this.f17189d == C6623a.LOADING) {
            long a = C6769f.m20576a(this.f17198m);
            C6594d dVar = this.f17188c;
            if (dVar != null) {
                dVar.f17100b.mo36525a(a, false);
            }
            mo36594a(C6623a.LOADED);
            this.f17187b.mo36558a(this);
        } else if (this.f17189d != C6623a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", new Object[]{mo36605m(), this.f17189d});
            C6594d dVar2 = this.f17188c;
            if (dVar2 != null) {
                dVar2.f17103e.mo36540i(format);
            }
        }
    }

    public void onInitFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36597c("error = " + i + ", " + str));
        if (mo36592a()) {
            C6648c cVar = this.f17199n;
            if (cVar != null) {
                cVar.mo36648d();
            }
            mo36594a(C6623a.FAILED);
            Listener listener = this.f17187b;
            IronSourceError ironSourceError = new IronSourceError(i, str);
            C6769f.m20576a(this.f17198m);
            listener.mo36559a(ironSourceError, this);
        } else if (this.f17189d != C6623a.FAILED) {
            String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", new Object[]{mo36605m(), this.f17189d, Integer.valueOf(i), str});
            C6594d dVar = this.f17188c;
            if (dVar != null) {
                dVar.f17103e.mo36537f(format);
            }
        }
    }

    public void onInitSuccess() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        if (mo36592a()) {
            C6648c cVar = this.f17199n;
            if (cVar != null) {
                cVar.mo36648d();
            }
            mo36594a(C6623a.READY_TO_LOAD);
            IronLog.INTERNAL.verbose(mo36597c(""));
            mo36594a(C6623a.LOADING);
            try {
                this.f17199n.mo36647a(this);
                this.f17193h.loadAd(this.f17191f, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo36597c(str));
                C6594d dVar = this.f17188c;
                if (dVar != null) {
                    dVar.f17103e.mo36545n(str);
                }
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, str);
            }
        } else if (this.f17189d != C6623a.FAILED) {
            String format = String.format("unexpected init success for %s, state - %s", new Object[]{mo36605m(), this.f17189d});
            C6594d dVar2 = this.f17188c;
            if (dVar2 != null) {
                dVar2.f17103e.mo36536e(format);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo36608p() {
        return this.f17189d == C6623a.SHOWING;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final String mo36609q() {
        Placement placement = this.f17190e;
        return placement == null ? "" : placement.getPlacementName();
    }
}
