package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6504O;
import com.ironsource.mediationsdk.C6642b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6697g;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.sdk.C6726h;
import com.ironsource.mediationsdk.sdk.C6730l;
import com.ironsource.mediationsdk.utils.C6766d;
import com.ironsource.mediationsdk.utils.C6767e;
import com.ironsource.mediationsdk.utils.C6772i;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.G */
final class C6481G extends C6542a implements C6726h, C6766d, C6772i {

    /* renamed from: m */
    C6730l f16431m;

    /* renamed from: n */
    C6716r f16432n = C6716r.m20447a();

    /* renamed from: o */
    private final String f16433o = getClass().getName();

    /* renamed from: p */
    private boolean f16434p = false;

    /* renamed from: q */
    private boolean f16435q = false;

    /* renamed from: r */
    private boolean f16436r;

    /* renamed from: s */
    private InterstitialPlacement f16437s;

    /* renamed from: t */
    private boolean f16438t = false;

    /* renamed from: u */
    private Map<String, C6482H> f16439u = new ConcurrentHashMap();

    /* renamed from: v */
    private CopyOnWriteArraySet<String> f16440v = new CopyOnWriteArraySet<>();

    /* renamed from: w */
    private long f16441w;

    /* renamed from: x */
    private boolean f16442x;

    C6481G() {
        this.f16871a = new C6767e("interstitial", this);
        this.f16442x = false;
    }

    /* renamed from: a */
    private int m19409a(C6642b.C6643a... aVarArr) {
        Iterator it = this.f16873c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            for (C6642b.C6643a aVar : aVarArr) {
                if (bVar.f17240a == aVar) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m19410a(int i, C6642b bVar, Object[][] objArr) {
        m19411a(i, bVar, objArr, false);
    }

    /* renamed from: a */
    private void m19411a(int i, C6642b bVar, Object[][] objArr, boolean z) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (z) {
            try {
                if (this.f16437s != null && !TextUtils.isEmpty(this.f16437s.getPlacementName())) {
                    providerAdditionalData.put("placement", this.f16437s.getPlacementName());
                }
            } catch (Exception e) {
                this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C6553d.m19930d().mo36371b(new C6552c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m19412a(int i, Object[][] objArr) {
        m19413a(i, objArr, false);
    }

    /* renamed from: a */
    private void m19413a(int i, Object[][] objArr, boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z) {
            try {
                if (this.f16437s != null && !TextUtils.isEmpty(this.f16437s.getPlacementName())) {
                    mediationAdditionalData.put("placement", this.f16437s.getPlacementName());
                }
            } catch (Exception e) {
                this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C6553d.m19930d().mo36371b(new C6552c(i, mediationAdditionalData));
    }

    /* renamed from: b */
    private void m19414b(int i, C6642b bVar, Object[][] objArr) {
        m19411a(i, bVar, objArr, true);
    }

    /* renamed from: c */
    private void m19415c(C6642b bVar) {
        if (!bVar.mo36633c()) {
            m19419i();
            m19417h();
            return;
        }
        bVar.mo36629a(C6642b.C6643a.INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m19416g(com.ironsource.mediationsdk.C6482H r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16878h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r2.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r9.f16433o     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r10.mo36637j()     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C6653d.m20285a()     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f17242c     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f17242c     // Catch:{ all -> 0x00c4 }
            org.json.JSONObject r2 = r2.getInterstitialSettings()     // Catch:{ all -> 0x00c4 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo36662a(r1, r2, r4, r4)     // Catch:{ all -> 0x00c4 }
            r1 = 0
            if (r0 != 0) goto L_0x0059
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16878h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r3.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r10.f17243d     // Catch:{ all -> 0x00c4 }
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x0059:
            r10.f17241b = r0     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6642b.C6643a.INIT_PENDING     // Catch:{ all -> 0x00c4 }
            r10.mo36629a(r2)     // Catch:{ all -> 0x00c4 }
            r9.mo36352b(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r9.f16877g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r9.f16876f     // Catch:{ all -> 0x0096 }
            r10.mo36060h()     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17241b     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0094
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17241b     // Catch:{ all -> 0x0096 }
            r5.addInterstitialListener(r10)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f17256q     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r7.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = r10.f17243d     // Catch:{ all -> 0x0096 }
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = ":initInterstitial()"
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0096 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f17241b     // Catch:{ all -> 0x0096 }
            org.json.JSONObject r5 = r10.f16443r     // Catch:{ all -> 0x0096 }
            r3.initInterstitial(r2, r4, r5, r10)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r9)
            return r0
        L_0x0096:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f16878h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r9.f16433o     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r10.mo36637j()     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6642b.C6643a.INIT_FAILED     // Catch:{ all -> 0x00c4 }
            r10.mo36629a(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x00c4:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6481G.m19416g(com.ironsource.mediationsdk.H):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19417h() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f16873c
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6642b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f17240a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6642b.C6643a.NOT_INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f17240a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6642b.C6643a.INIT_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f17240a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6642b.C6643a.INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f17240a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6642b.C6643a.LOAD_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r1 = r1.f17240a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.AVAILABLE
            if (r1 != r3) goto L_0x0006
        L_0x0031:
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 == 0) goto L_0x0064
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f16878h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f16873c
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6642b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f17240a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6642b.C6643a.EXHAUSTED
            if (r3 != r4) goto L_0x0045
            r1.mo36059g()
            goto L_0x0045
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f16878h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6481G.m19417h():void");
    }

    /* renamed from: h */
    private synchronized void m19418h(C6482H h) {
        m19410a(2002, (C6642b) h, (Object[][]) null);
        h.mo36061i();
        if (h.f17241b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = h.f17256q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":loadInterstitial()", 1);
            h.f16445t = new Date().getTime();
            h.f17241b.loadInterstitial(h.f16443r, h);
        }
    }

    /* renamed from: i */
    private AbstractAdapter m19419i() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f16873c.size() && abstractAdapter == null; i2++) {
            if (((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.AVAILABLE || ((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.INITIATED || ((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.INIT_PENDING || ((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.LOAD_PENDING) {
                i++;
                if (i >= this.f16872b) {
                    break;
                }
            } else if (((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.NOT_INITIATED && (abstractAdapter = m19416g((C6482H) this.f16873c.get(i2))) == null) {
                ((C6642b) this.f16873c.get(i2)).mo36629a(C6642b.C6643a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* renamed from: j */
    private synchronized void m19420j() {
        Iterator it = this.f16873c.iterator();
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.AVAILABLE || bVar.f17240a == C6642b.C6643a.LOAD_PENDING || bVar.f17240a == C6642b.C6643a.NOT_AVAILABLE) {
                bVar.mo36629a(C6642b.C6643a.INITIATED);
            }
        }
    }

    /* renamed from: k */
    private void m19421k() {
        for (int i = 0; i < this.f16873c.size(); i++) {
            String providerTypeForReflection = ((C6642b) this.f16873c.get(i)).f17242c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C6653d.m20285a().mo36662a(((C6642b) this.f16873c.get(i)).f17242c, ((C6642b) this.f16873c.get(i)).f17242c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36039a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f16433o + " Should Track Network State: " + z, 0);
        this.f16879i = z;
    }

    /* renamed from: a */
    public final synchronized void mo36040a(C6482H h) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h.f17243d + " :onInterstitialInitSuccess()", 1);
        m19410a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, (C6642b) h, (Object[][]) null);
        this.f16436r = true;
        if (this.f16434p) {
            if (m19409a(C6642b.C6643a.AVAILABLE, C6642b.C6643a.LOAD_PENDING) < this.f16872b) {
                h.mo36629a(C6642b.C6643a.LOAD_PENDING);
                m19418h(h);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36041a(C6482H h, long j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":onInterstitialAdReady()", 1);
        m19410a(2003, (C6642b) h, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        long time = new Date().getTime() - this.f16441w;
        h.mo36629a(C6642b.C6643a.AVAILABLE);
        this.f16435q = false;
        if (this.f16438t) {
            this.f16438t = false;
            this.f16431m.onInterstitialAdReady();
            m19412a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(time)}});
        }
    }

    /* renamed from: a */
    public final synchronized void mo36042a(IronSourceError ironSourceError, C6482H h) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            m19410a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, (C6642b) h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            if (m19409a(C6642b.C6643a.INIT_FAILED) >= this.f16873c.size()) {
                IronSourceLoggerManager ironSourceLoggerManager2 = this.f16878h;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                ironSourceLoggerManager2.log(ironSourceTag2, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
                if (this.f16434p) {
                    this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
                    m19412a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_GENERIC)}});
                    this.f16438t = false;
                }
                this.f16436r = true;
            } else {
                if (m19419i() == null && this.f16434p) {
                    if (m19409a(C6642b.C6643a.INIT_FAILED, C6642b.C6643a.NOT_AVAILABLE, C6642b.C6643a.CAPPED_PER_SESSION, C6642b.C6643a.CAPPED_PER_DAY, C6642b.C6643a.EXHAUSTED) >= this.f16873c.size()) {
                        this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
                        m19412a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
                        this.f16438t = false;
                    }
                }
                m19417h();
                return;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager3 = this.f16878h;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager3.logException(ironSourceTag3, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + h.mo36637j() + ")", e);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36043a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.C6482H r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f16878h     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r9.f17243d     // Catch:{ all -> 0x012c }
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ":onInterstitialAdLoadFailed("
            r2.append(r3)     // Catch:{ all -> 0x012c }
            r2.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x012c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r0.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r9.f17243d     // Catch:{ all -> 0x012c }
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ":onInterstitialAdLoadFailed("
            r0.append(r1)     // Catch:{ all -> 0x012c }
            r0.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x012c }
            int r0 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            r1 = 1158(0x486, float:1.623E-42)
            r2 = 2
            r4 = 0
            if (r0 != r1) goto L_0x0074
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r8 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r3] = r8     // Catch:{ all -> 0x012c }
            r7.m19410a((int) r0, (com.ironsource.mediationsdk.C6642b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
            goto L_0x00aa
        L_0x0074:
            r0 = 2200(0x898, float:3.083E-42)
            r1 = 3
            java.lang.Object[][] r1 = new java.lang.Object[r1][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r6 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x012c }
            r5[r3] = r6     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "reason"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            java.lang.String r8 = r8.getErrorMessage()     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r3] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r2] = r8     // Catch:{ all -> 0x012c }
            r7.m19410a((int) r0, (com.ironsource.mediationsdk.C6642b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
        L_0x00aa:
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C6642b.C6643a.NOT_AVAILABLE     // Catch:{ all -> 0x012c }
            r9.mo36629a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a[] r8 = new com.ironsource.mediationsdk.C6642b.C6643a[r2]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C6642b.C6643a.AVAILABLE     // Catch:{ all -> 0x012c }
            r8[r4] = r9     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C6642b.C6643a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r8[r3] = r9     // Catch:{ all -> 0x012c }
            int r8 = r7.m19409a((com.ironsource.mediationsdk.C6642b.C6643a[]) r8)     // Catch:{ all -> 0x012c }
            int r9 = r7.f16872b     // Catch:{ all -> 0x012c }
            if (r8 < r9) goto L_0x00c3
            monitor-exit(r7)
            return
        L_0x00c3:
            java.util.concurrent.CopyOnWriteArrayList r9 = r7.f16873c     // Catch:{ all -> 0x012c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x012c }
        L_0x00c9:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b r10 = (com.ironsource.mediationsdk.C6642b) r10     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r11 = r10.f17240a     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6642b.C6643a.INITIATED     // Catch:{ all -> 0x012c }
            if (r11 != r0) goto L_0x00c9
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C6642b.C6643a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r10.mo36629a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.H r10 = (com.ironsource.mediationsdk.C6482H) r10     // Catch:{ all -> 0x012c }
            r7.m19418h(r10)     // Catch:{ all -> 0x012c }
            monitor-exit(r7)
            return
        L_0x00e7:
            com.ironsource.mediationsdk.AbstractAdapter r9 = r7.m19419i()     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x00ef
            monitor-exit(r7)
            return
        L_0x00ef:
            boolean r9 = r7.f16434p     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x012a
            com.ironsource.mediationsdk.b$a[] r9 = new com.ironsource.mediationsdk.C6642b.C6643a[r3]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C6642b.C6643a.INIT_PENDING     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            int r9 = r7.m19409a((com.ironsource.mediationsdk.C6642b.C6643a[]) r9)     // Catch:{ all -> 0x012c }
            int r8 = r8 + r9
            if (r8 != 0) goto L_0x012a
            r7.m19417h()     // Catch:{ all -> 0x012c }
            r7.f16435q = r4     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.r r8 = r7.f16432n     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r9 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "No ads to show"
            r0 = 509(0x1fd, float:7.13E-43)
            r10.<init>(r0, r11)     // Catch:{ all -> 0x012c }
            r8.mo36851a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r9, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x012c }
            r8 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r9 = new java.lang.Object[r3][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "errorCode"
            r10[r4] = r11     // Catch:{ all -> 0x012c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012c }
            r10[r3] = r11     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            r7.m19412a((int) r8, (java.lang.Object[][]) r9)     // Catch:{ all -> 0x012c }
        L_0x012a:
            monitor-exit(r7)
            return
        L_0x012c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6481G.mo36043a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.H, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36044a(InterstitialPlacement interstitialPlacement) {
        this.f16437s = interstitialPlacement;
        this.f16431m.f17601e = interstitialPlacement;
    }

    /* renamed from: a */
    public final void mo36045a(String str) {
        if (this.f16434p) {
            this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            this.f16434p = false;
            this.f16435q = false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36046a(String str, String str2) {
        this.f16878h.log(IronSourceLogger.IronSourceTag.NATIVE, this.f16433o + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        m19412a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.f16877g = str;
        this.f16876f = str2;
        Iterator it = this.f16873c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (this.f16871a.mo36962b(bVar)) {
                m19410a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.f16871a.mo36963c(bVar)) {
                bVar.mo36629a(C6642b.C6643a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.f16873c.size()) {
            this.f16436r = true;
        }
        m19421k();
        for (int i2 = 0; i2 < this.f16872b && m19419i() != null; i2++) {
        }
        m19412a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    public final void mo36047a(List<IronSource.AD_UNIT> list, boolean z, C6697g gVar) {
    }

    /* renamed from: b */
    public final void mo36048b(C6482H h) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":onInterstitialAdOpened()", 1);
        m19414b(2005, h, (Object[][]) null);
        this.f16431m.onInterstitialAdOpened();
    }

    /* renamed from: b */
    public final void mo36049b(IronSourceError ironSourceError, C6482H h) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        m19414b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.f16442x = false;
        m19415c((C6642b) h);
        Iterator it = this.f16873c.iterator();
        while (it.hasNext()) {
            if (((C6642b) it.next()).f17240a == C6642b.C6643a.AVAILABLE) {
                this.f16434p = true;
                InterstitialPlacement interstitialPlacement = this.f16437s;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                mo36052d();
                return;
            }
        }
        this.f16431m.onInterstitialAdShowFailed(ironSourceError);
    }

    /* renamed from: c */
    public final synchronized void mo36050c() {
        try {
            if (this.f16442x) {
                this.f16878h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                C6463D.m19392a().mo36013a(new IronSourceError(1037, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.f16437s = null;
            this.f16431m.f17601e = null;
            if (!this.f16435q) {
                if (!this.f16432n.mo36852a(IronSource.AD_UNIT.INTERSTITIAL)) {
                    C6504O.C6509a b = C6504O.m19641a().mo36232b();
                    if (b == C6504O.C6509a.NOT_INIT) {
                        this.f16878h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    } else if (b == C6504O.C6509a.INIT_IN_PROGRESS) {
                        if (C6504O.m19641a().mo36234c()) {
                            this.f16878h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                            return;
                        }
                        this.f16441w = new Date().getTime();
                        m19412a(2001, (Object[][]) null);
                        this.f16434p = true;
                        this.f16438t = true;
                        return;
                    } else if (b == C6504O.C6509a.INIT_FAILED) {
                        this.f16878h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else if (this.f16873c.size() == 0) {
                        this.f16878h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else {
                        this.f16441w = new Date().getTime();
                        m19412a(2001, (Object[][]) null);
                        this.f16438t = true;
                        m19420j();
                        if (m19409a(C6642b.C6643a.INITIATED) != 0) {
                            this.f16434p = true;
                            this.f16435q = true;
                            Iterator it = this.f16873c.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                C6642b bVar = (C6642b) it.next();
                                if (bVar.f17240a == C6642b.C6643a.INITIATED) {
                                    bVar.mo36629a(C6642b.C6643a.LOAD_PENDING);
                                    m19418h((C6482H) bVar);
                                    i++;
                                    if (i >= this.f16872b) {
                                        return;
                                    }
                                }
                            }
                            return;
                        } else if (!this.f16436r) {
                            this.f16434p = true;
                            return;
                        } else {
                            IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                            this.f16878h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                            this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, buildGenericError);
                            m19412a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                            this.f16438t = false;
                            return;
                        }
                    }
                }
            }
            this.f16878h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e) {
            e.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            this.f16878h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.f16438t) {
                this.f16438t = false;
                m19412a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
            }
        }
    }

    /* renamed from: c */
    public final void mo36051c(C6482H h) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":onInterstitialAdClosed()", 1);
        this.f16442x = false;
        m19414b(IronSourceConstants.IS_INSTANCE_CLOSED, h, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C6782o.m20647a().mo36990b(2))}});
        C6782o.m20647a().mo36988a(2);
        this.f16431m.onInterstitialAdClosed();
    }

    /* renamed from: d */
    public final void mo36052d() {
        if (this.f16442x) {
            this.f16878h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.f16431m.onInterstitialAdShowFailed(new IronSourceError(1036, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.f16434p) {
            this.f16878h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.f16431m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (!this.f16879i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            for (int i = 0; i < this.f16873c.size(); i++) {
                C6642b bVar = (C6642b) this.f16873c.get(i);
                if (bVar.f17240a == C6642b.C6643a.AVAILABLE) {
                    C6774k.m20613c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f16437s);
                    if (C6774k.m20608b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f16437s) != C6774k.C6776a.f17744d) {
                        m19413a((int) IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    m19414b(IronSourceConstants.IS_INSTANCE_SHOW, bVar, (Object[][]) null);
                    this.f16442x = true;
                    C6482H h = (C6482H) bVar;
                    if (h.f17241b != null) {
                        h.f17256q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, h.f17243d + ":showInterstitial()", 1);
                        h.mo36634d();
                        h.f17241b.showInterstitial(h.f16443r, h);
                    }
                    if (bVar.mo36632b()) {
                        m19410a((int) IronSourceConstants.IS_CAP_SESSION, bVar, (Object[][]) null);
                    }
                    this.f16871a.mo36960a(bVar);
                    if (this.f16871a.mo36963c(bVar)) {
                        bVar.mo36629a(C6642b.C6643a.CAPPED_PER_DAY);
                        m19410a(250, bVar, new Object[][]{new Object[]{"status", "true"}});
                    }
                    this.f16434p = false;
                    if (!bVar.mo36633c()) {
                        m19419i();
                        return;
                    }
                    return;
                }
            }
            this.f16431m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - No adapters ready to show"));
        } else {
            this.f16878h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.f16431m.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    /* renamed from: d */
    public final void mo36053d(C6482H h) {
        this.f16878h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, h.f17243d + ":onInterstitialAdShowSucceeded()", 1);
        m19414b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, h, (Object[][]) null);
        Iterator it = this.f16873c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.AVAILABLE) {
                m19415c(bVar);
                z = true;
            }
        }
        if (!z && (h.f17240a == C6642b.C6643a.CAPPED_PER_SESSION || h.f17240a == C6642b.C6643a.EXHAUSTED || h.f17240a == C6642b.C6643a.CAPPED_PER_DAY)) {
            m19417h();
        }
        m19420j();
        this.f16431m.onInterstitialAdShowSucceeded();
    }

    /* renamed from: e */
    public final void mo36054e(C6482H h) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":onInterstitialAdClicked()", 1);
        m19414b(2006, h, (Object[][]) null);
        this.f16431m.onInterstitialAdClicked();
    }

    /* renamed from: e */
    public final synchronized boolean mo36055e() {
        boolean z;
        if (this.f16879i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f16873c.iterator();
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.AVAILABLE) {
                C6482H h = (C6482H) bVar;
                if (h.f17241b != null) {
                    h.f17256q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, h.f17243d + ":isInterstitialReady()", 1);
                    z = h.f17241b.isInterstitialReady(h.f16443r);
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo36056f() {
        if (this.f16434p) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            this.f16432n.mo36851a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.f16434p = false;
            this.f16435q = false;
            if (this.f16438t) {
                m19413a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.f16438t = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo36057f(C6482H h) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h.f17243d + ":onInterstitialAdVisible()", 1);
    }

    /* renamed from: g */
    public final void mo36058g() {
        Iterator it = this.f16873c.iterator();
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.CAPPED_PER_DAY) {
                m19410a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo36629a(bVar.mo36632b() ? C6642b.C6643a.CAPPED_PER_SESSION : bVar.mo36631a() ? C6642b.C6643a.EXHAUSTED : C6642b.C6643a.INITIATED);
            }
        }
    }
}
