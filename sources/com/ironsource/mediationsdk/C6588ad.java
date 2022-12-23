package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.C6433j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C6642b;
import com.ironsource.mediationsdk.logger.C6687c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.sdk.C6730l;
import com.ironsource.mediationsdk.sdk.C6755o;
import com.ironsource.mediationsdk.utils.C6766d;
import com.ironsource.mediationsdk.utils.C6767e;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ad */
final class C6588ad extends C6542a implements C6433j, C6650c, C6755o, C6766d {

    /* renamed from: m */
    C6730l f17033m;

    /* renamed from: n */
    boolean f17034n = false;

    /* renamed from: o */
    int f17035o;

    /* renamed from: p */
    C6792z f17036p;

    /* renamed from: q */
    private final String f17037q = getClass().getSimpleName();

    /* renamed from: r */
    private boolean f17038r = false;

    /* renamed from: s */
    private NetworkStateReceiver f17039s;

    /* renamed from: t */
    private Placement f17040t;

    /* renamed from: u */
    private Timer f17041u = null;

    /* renamed from: v */
    private List<C6642b.C6643a> f17042v = Arrays.asList(new C6642b.C6643a[]{C6642b.C6643a.INIT_FAILED, C6642b.C6643a.CAPPED_PER_SESSION, C6642b.C6643a.EXHAUSTED, C6642b.C6643a.CAPPED_PER_DAY});

    /* renamed from: w */
    private boolean f17043w = false;

    /* renamed from: x */
    private long f17044x = new Date().getTime();

    /* renamed from: y */
    private boolean f17045y = false;

    C6588ad() {
        this.f16871a = new C6767e("rewarded_video", this);
    }

    /* renamed from: a */
    private void m19989a(int i) {
        m19991a(i, (Object[][]) null);
    }

    /* renamed from: a */
    private void m19990a(int i, C6642b bVar, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6557h.m19950d().mo36371b(new C6552c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m19991a(int i, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6557h.m19950d().mo36371b(new C6552c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private synchronized void m19992a(C6642b bVar, int i) {
        Object[][] objArr;
        C6774k.m20614c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f17040t);
        if (C6774k.m20615c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), m20007p())) {
            m19991a((int) IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{"placement", m20007p()}});
        }
        this.f16871a.mo36960a(bVar);
        if (this.f17040t != null) {
            if (this.f17034n) {
                m19993a(((C6629ae) bVar).f17224v, true, this.f17040t.getPlacementId());
                int placementId = this.f17040t.getPlacementId();
                int i2 = 0;
                while (i2 < i && i2 < this.f16873c.size()) {
                    if (!this.f17042v.contains(((C6642b) this.f16873c.get(i2)).f17240a)) {
                        m19993a(((C6629ae) this.f16873c.get(i2)).f17224v, false, placementId);
                    }
                    i2++;
                }
            }
            String p = m20007p();
            m19990a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "true"}});
            int i3 = 0;
            while (i3 < this.f16873c.size() && i3 < i) {
                C6642b bVar2 = (C6642b) this.f16873c.get(i3);
                if (bVar2.f17240a == C6642b.C6643a.NOT_AVAILABLE || bVar2.f17240a == C6642b.C6643a.NEEDS_RELOAD) {
                    m19990a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar2, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "false"}});
                }
                i3++;
            }
        } else {
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        if (this.f17040t != null) {
            objArr = new Object[][]{new Object[]{"placement", m20007p()}};
        } else {
            objArr = null;
        }
        m19990a((int) IronSourceConstants.RV_INSTANCE_SHOW, bVar, objArr);
        this.f17045y = true;
        this.f17036p.mo37015a();
        ((C6629ae) bVar).f17225w = C6782o.m20647a().mo36990b(1);
        C6629ae aeVar = (C6629ae) bVar;
        if (aeVar.f17241b != null) {
            aeVar.f17256q.log(IronSourceLogger.IronSourceTag.INTERNAL, aeVar.f17243d + ":showRewardedVideo()", 1);
            aeVar.mo36634d();
            aeVar.f17241b.showRewardedVideo(aeVar.f17220r, aeVar);
        }
    }

    /* renamed from: a */
    private synchronized void m19993a(String str, boolean z, int i) {
        String str2 = "";
        try {
            str2 = (str2 + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable(str2, z, i) {

                /* renamed from: a */
                private /* synthetic */ String f17652a;

                /* renamed from: b */
                private /* synthetic */ boolean f17653b;

                /* renamed from: c */
                private /* synthetic */ int f17654c;

                {
                    this.f17652a = r1;
                    this.f17653b = r2;
                    this.f17654c = r3;
                }

                public final void run() {
                    String str = this.f17652a;
                    boolean z = this.f17653b;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, this.f17654c)));
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
                        logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
                        if (str == null) {
                            sb.append("null");
                        } else {
                            sb.append(str);
                        }
                        sb.append(", hit:");
                        sb.append(z);
                        sb.append(")");
                        IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
                        logger2.log(ironSourceTag2, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new C6687c());
            thread.start();
        } catch (Throwable th) {
            this.f16878h.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z + ")", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m19994a(java.util.Map<java.lang.String, java.lang.Object> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.b r0 = r2.f16874d     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.f16881k     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0023
            r2.f16881k = r1     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.b r3 = r2.f16874d     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.ae r3 = (com.ironsource.mediationsdk.C6629ae) r3     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r2.m19998h(r3)     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0021
            com.ironsource.mediationsdk.sdk.l r3 = r2.f17033m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f16880j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            boolean r0 = r2.m20002k()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003d
            r3 = 0
            boolean r3 = r2.m19995a((boolean) r1, (boolean) r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            com.ironsource.mediationsdk.sdk.l r3 = r2.f17033m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f16880j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return
        L_0x003d:
            com.ironsource.mediationsdk.sdk.l r0 = r2.f17033m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r1 = r2.f16880j     // Catch:{ all -> 0x004a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x004a }
            r0.mo36914a((boolean) r1, (java.util.Map<java.lang.String, java.lang.Object>) r3)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r2)
            return
        L_0x004a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.m19994a(java.util.Map):void");
    }

    /* renamed from: a */
    private synchronized boolean m19995a(boolean z, boolean z2) {
        boolean z3;
        Boolean bool;
        z3 = false;
        if (this.f16880j == null) {
            mo36452d();
            if (z) {
                bool = Boolean.TRUE;
            } else if (!m20002k() && m19999h()) {
                bool = Boolean.FALSE;
            }
        } else if (z && !this.f16880j.booleanValue()) {
            bool = Boolean.TRUE;
        } else if (!z && this.f16880j.booleanValue() && ((!m20001j() || z2) && !m20002k())) {
            bool = Boolean.FALSE;
        }
        this.f16880j = bool;
        z3 = true;
        return z3;
    }

    /* renamed from: b */
    private void m19996b(boolean z) {
        if (!z && mo36451c()) {
            m19991a(1000, (Object[][]) null);
            m19991a(1003, new Object[][]{new Object[]{"duration", 0}});
            this.f17043w = false;
        } else if (m20000i()) {
            m19991a(1000, (Object[][]) null);
            this.f17043w = true;
            this.f17044x = new Date().getTime();
        }
    }

    /* renamed from: f */
    private AbstractAdapter m19997f() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f16873c.size() && abstractAdapter == null; i2++) {
            if (((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.AVAILABLE || ((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.INITIATED) {
                i++;
                if (i >= this.f16872b) {
                    break;
                }
            } else if (((C6642b) this.f16873c.get(i2)).f17240a == C6642b.C6643a.NOT_INITIATED && (abstractAdapter = m19998h((C6629ae) this.f16873c.get(i2))) == null) {
                ((C6642b) this.f16873c.get(i2)).mo36629a(C6642b.C6643a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        return r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m19998h(com.ironsource.mediationsdk.C6629ae r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16878h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r2.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r9.f17037q     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r10.f17243d     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C6653d.m20285a()     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f17242c     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f17242c     // Catch:{ all -> 0x00d7 }
            org.json.JSONObject r2 = r2.getRewardedVideoSettings()     // Catch:{ all -> 0x00d7 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo36662a(r1, r2, r4, r4)     // Catch:{ all -> 0x00d7 }
            r1 = 0
            if (r0 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16878h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r3.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r10.f17243d     // Catch:{ all -> 0x00d7 }
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x0057:
            r10.f17241b = r0     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6642b.C6643a.INITIATED     // Catch:{ all -> 0x00d7 }
            r10.mo36629a(r2)     // Catch:{ all -> 0x00d7 }
            r9.mo36352b(r10)     // Catch:{ all -> 0x00d7 }
            r2 = 1001(0x3e9, float:1.403E-42)
            r9.m19990a((int) r2, (com.ironsource.mediationsdk.C6642b) r10, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r9.f16877g     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r9.f16876f     // Catch:{ all -> 0x00a9 }
            r10.mo36060h()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17241b     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x00a7
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.f17222t     // Catch:{ all -> 0x00a9 }
            r5.set(r3)     // Catch:{ all -> 0x00a9 }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00a9 }
            r5.<init>()     // Catch:{ all -> 0x00a9 }
            long r5 = r5.getTime()     // Catch:{ all -> 0x00a9 }
            r10.f17223u = r5     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17241b     // Catch:{ all -> 0x00a9 }
            r5.addRewardedVideoListener(r10)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f17256q     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = r10.f17243d     // Catch:{ all -> 0x00a9 }
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = ":initRewardedVideo()"
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a9 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f17241b     // Catch:{ all -> 0x00a9 }
            org.json.JSONObject r5 = r10.f17220r     // Catch:{ all -> 0x00a9 }
            r3.initRewardedVideo(r2, r4, r5, r10)     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r9)
            return r0
        L_0x00a9:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f16878h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r4.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r9.f17037q     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r10.mo36637j()     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00d7 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6642b.C6643a.INIT_FAILED     // Catch:{ all -> 0x00d7 }
            r10.mo36629a(r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x00d7:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.m19998h(com.ironsource.mediationsdk.ae):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: h */
    private synchronized boolean m19999h() {
        int i;
        Iterator it = this.f16873c.iterator();
        i = 0;
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.INIT_FAILED || bVar.f17240a == C6642b.C6643a.CAPPED_PER_DAY || bVar.f17240a == C6642b.C6643a.CAPPED_PER_SESSION || bVar.f17240a == C6642b.C6643a.NOT_AVAILABLE || bVar.f17240a == C6642b.C6643a.NEEDS_RELOAD || bVar.f17240a == C6642b.C6643a.EXHAUSTED) {
                i++;
            }
        }
        return this.f16873c.size() == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m20000i() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f16873c     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6642b) r1     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = r1.f17240a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.NOT_AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17240a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.NEEDS_RELOAD     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17240a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17240a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.INITIATED     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17240a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.INIT_PENDING     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r1 = r1.f17240a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6642b.C6643a.LOAD_PENDING     // Catch:{ all -> 0x003c }
            if (r1 != r2) goto L_0x0007
        L_0x0037:
            r0 = 1
        L_0x0038:
            monitor-exit(r4)
            return r0
        L_0x003a:
            r0 = 0
            goto L_0x0038
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.m20000i():boolean");
    }

    /* renamed from: j */
    private synchronized boolean m20001j() {
        boolean z;
        z = false;
        Iterator it = this.f16873c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C6642b) it.next()).f17240a == C6642b.C6643a.AVAILABLE) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: k */
    private synchronized boolean m20002k() {
        if (this.f16874d == null) {
            return false;
        }
        return ((C6629ae) this.f16874d).mo36618o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m20003l() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.AbstractAdapter r0 = r9.m19997f()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r9)
            return
        L_0x0009:
            r0 = 4
            com.ironsource.mediationsdk.b$a[] r1 = new com.ironsource.mediationsdk.C6642b.C6643a[r0]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6642b.C6643a.NOT_AVAILABLE     // Catch:{ all -> 0x005a }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6642b.C6643a.NEEDS_RELOAD     // Catch:{ all -> 0x005a }
            r4 = 1
            r1[r4] = r2     // Catch:{ all -> 0x005a }
            r2 = 2
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_SESSION     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            r2 = 3
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_DAY     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            java.util.concurrent.CopyOnWriteArrayList r2 = r9.f16873c     // Catch:{ all -> 0x005a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005a }
            r4 = r3
        L_0x0027:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b r5 = (com.ironsource.mediationsdk.C6642b) r5     // Catch:{ all -> 0x005a }
            r6 = r3
        L_0x0034:
            if (r6 >= r0) goto L_0x0027
            r7 = r1[r6]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r8 = r5.f17240a     // Catch:{ all -> 0x005a }
            if (r8 != r7) goto L_0x003e
            int r4 = r4 + 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x0041:
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f16873c     // Catch:{ all -> 0x005a }
            int r0 = r0.size()     // Catch:{ all -> 0x005a }
            if (r4 >= r0) goto L_0x004e
            r9.m20004m()     // Catch:{ all -> 0x005a }
            monitor-exit(r9)
            return
        L_0x004e:
            boolean r0 = r9.m19995a((boolean) r3, (boolean) r3)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r9.m19994a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r9)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.m20003l():void");
    }

    /* renamed from: m */
    private synchronized void m20004m() {
        if (m20005n()) {
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator it = this.f16873c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C6642b bVar = (C6642b) it.next();
                if (bVar.f17240a == C6642b.C6643a.EXHAUSTED) {
                    bVar.mo36059g();
                }
                if (bVar.f17240a == C6642b.C6643a.AVAILABLE) {
                    z = true;
                }
            }
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (m19995a(z, false)) {
                this.f17033m.onRewardedVideoAvailabilityChanged(this.f16880j.booleanValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m20005n() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f16873c     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002a }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6642b) r1     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = r1.f17240a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.NOT_INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r2 = r1.f17240a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6642b.C6643a.INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r1 = r1.f17240a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6642b.C6643a.AVAILABLE     // Catch:{ all -> 0x002a }
            if (r1 != r2) goto L_0x0007
        L_0x0025:
            r0 = 0
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            r0 = 1
            goto L_0x0026
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.m20005n():boolean");
    }

    /* renamed from: o */
    private void m20006o() {
        for (int i = 0; i < this.f16873c.size(); i++) {
            String providerTypeForReflection = ((C6642b) this.f16873c.get(i)).f17242c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C6653d.m20285a().mo36662a(((C6642b) this.f16873c.get(i)).f17242c, ((C6642b) this.f16873c.get(i)).f17242c.getRewardedVideoSettings(), false, false);
                return;
            }
        }
    }

    /* renamed from: p */
    private String m20007p() {
        Placement placement = this.f17040t;
        return placement == null ? "" : placement.getPlacementName();
    }

    /* renamed from: q */
    private void m20008q() {
        Iterator it = this.f16873c.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.AVAILABLE && bVar.mo36638l() != null && bVar.mo36638l().longValue() < j) {
                j = bVar.mo36638l().longValue();
            }
        }
        if (j != Long.MAX_VALUE) {
            this.f17036p.mo37016a(System.currentTimeMillis() - j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36039a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f17037q + " Should Track Network State: " + z, 0);
        try {
            this.f16879i = z;
            if (this.f16879i) {
                if (this.f17039s == null) {
                    this.f17039s = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f17039s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f17039s != null) {
                context.getApplicationContext().unregisterReceiver(this.f17039s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo36443a(C6629ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f17243d + ":onRewardedVideoAdOpened()", 1);
        m19990a(1005, (C6642b) aeVar, new Object[][]{new Object[]{"placement", m20007p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f17225w)}});
        this.f17033m.onRewardedVideoAdOpened();
    }

    /* renamed from: a */
    public final void mo36444a(IronSourceError ironSourceError, C6629ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f17243d + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.f17045y = false;
        int i = aeVar.f17225w;
        m19990a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, (C6642b) aeVar, new Object[][]{new Object[]{"placement", m20007p()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(i)}});
        m19996b(false);
        this.f17033m.onRewardedVideoAdShowFailed(ironSourceError);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36445a(Placement placement) {
        this.f17040t = placement;
        this.f17033m.f17602f = placement.getPlacementName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36446a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16878h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r2.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = r9.f17037q     // Catch:{ all -> 0x01a1 }
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ":showRewardedVideo(placementName: "
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            r2.append(r10)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.l r0 = r9.f17033m     // Catch:{ all -> 0x01a1 }
            r0.f17602f = r10     // Catch:{ all -> 0x01a1 }
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "placement"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x01a1 }
            r4[r3] = r10     // Catch:{ all -> 0x01a1 }
            r1[r6] = r4     // Catch:{ all -> 0x01a1 }
            r9.m19991a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f17045y     // Catch:{ all -> 0x01a1 }
            r0 = 3
            if (r10 == 0) goto L_0x0057
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f16878h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01a1 }
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.l r10 = r9.f17033m     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r10 = r9.f16879i     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x007f
            com.ironsource.environment.ContextProvider r10 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01a1 }
            android.app.Activity r10 = r10.getCurrentActiveActivity()     // Catch:{ all -> 0x01a1 }
            boolean r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x007f
            java.lang.String r10 = "showRewardedVideo error: can't show ad when there's no internet connection"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f16878h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.l r10 = r9.f17033m     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoInternetConnectionShowFailError(r0)     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x007f:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ all -> 0x01a1 }
            r10.<init>()     // Catch:{ all -> 0x01a1 }
            r0 = r6
        L_0x0085:
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f16873c     // Catch:{ all -> 0x01a1 }
            int r1 = r1.size()     // Catch:{ all -> 0x01a1 }
            if (r0 >= r1) goto L_0x0173
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f16873c     // Catch:{ all -> 0x01a1 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6642b) r1     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f16878h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = "showRewardedVideo, iterating on: "
            r7.<init>(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = r1.f17243d     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = ", Status: "
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r8 = r1.f17240a     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01a1 }
            r4.log(r5, r7, r6)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r4 = r1.f17240a     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C6642b.C6643a.AVAILABLE     // Catch:{ all -> 0x01a1 }
            if (r4 != r5) goto L_0x016f
            r4 = r1
            com.ironsource.mediationsdk.ae r4 = (com.ironsource.mediationsdk.C6629ae) r4     // Catch:{ all -> 0x01a1 }
            boolean r4 = r4.mo36618o()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0120
            r9.m19992a((com.ironsource.mediationsdk.C6642b) r1, (int) r0)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f16882l     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00d7
            com.ironsource.mediationsdk.b r10 = r9.f16875e     // Catch:{ all -> 0x01a1 }
            boolean r10 = r1.equals(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x00d7
            r9.mo36351b()     // Catch:{ all -> 0x01a1 }
        L_0x00d7:
            boolean r10 = r1.mo36632b()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00ed
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_SESSION     // Catch:{ all -> 0x01a1 }
            r1.mo36629a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 1401(0x579, float:1.963E-42)
            r0 = 0
            r9.m19990a((int) r10, (com.ironsource.mediationsdk.C6642b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m20003l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x00ed:
            com.ironsource.mediationsdk.utils.e r10 = r9.f16871a     // Catch:{ all -> 0x01a1 }
            boolean r10 = r10.mo36963c((com.ironsource.mediationsdk.C6642b) r1)     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x0112
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_DAY     // Catch:{ all -> 0x01a1 }
            r1.mo36629a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "status"
            r2[r6] = r4     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "true"
            r2[r3] = r4     // Catch:{ all -> 0x01a1 }
            r0[r6] = r2     // Catch:{ all -> 0x01a1 }
            r9.m19990a((int) r10, (com.ironsource.mediationsdk.C6642b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m20003l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0112:
            boolean r10 = r1.mo36631a()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x011e
            r9.m19997f()     // Catch:{ all -> 0x01a1 }
            r9.m20004m()     // Catch:{ all -> 0x01a1 }
        L_0x011e:
            monitor-exit(r9)
            return
        L_0x0120:
            java.lang.Long r4 = r1.mo36639m()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0148
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r4.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = r1.f17243d     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.Long r5 = r1.mo36639m()     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01a1 }
            r10.append(r4)     // Catch:{ all -> 0x01a1 }
        L_0x0148:
            r4 = r1
            com.ironsource.mediationsdk.ae r4 = (com.ironsource.mediationsdk.C6629ae) r4     // Catch:{ all -> 0x01a1 }
            r9.mo36448a((boolean) r6, (com.ironsource.mediationsdk.C6629ae) r4)     // Catch:{ all -> 0x01a1 }
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "FailedToShowVideoException"
            r4.<init>(r5)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f16878h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r8.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r1.f17243d     // Catch:{ all -> 0x01a1 }
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = " Failed to show video"
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x01a1 }
            r5.logException(r7, r1, r4)     // Catch:{ all -> 0x01a1 }
        L_0x016f:
            int r0 = r0 + 1
            goto L_0x0085
        L_0x0173:
            boolean r0 = r9.m20002k()     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0186
            com.ironsource.mediationsdk.b r10 = r9.f16874d     // Catch:{ all -> 0x01a1 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f16873c     // Catch:{ all -> 0x01a1 }
            int r0 = r0.size()     // Catch:{ all -> 0x01a1 }
            r9.m19992a((com.ironsource.mediationsdk.C6642b) r10, (int) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0186:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x01a1 }
            r0.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "ext1"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01a1 }
            r0.put(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.l r10 = r9.f17033m     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r1)     // Catch:{ all -> 0x01a1 }
            r10.mo36913a((com.ironsource.mediationsdk.logger.IronSourceError) r1, (java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x01a1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.mo36446a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36447a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16878h     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r9.f17037q     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ":initRewardedVideo(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r10)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r11)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            long r0 = r0.getTime()     // Catch:{ all -> 0x00df }
            r2 = 81312(0x13da0, float:1.13942E-40)
            r9.m19989a((int) r2)     // Catch:{ all -> 0x00df }
            r9.f16877g = r10     // Catch:{ all -> 0x00df }
            r9.f16876f = r11     // Catch:{ all -> 0x00df }
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f16873c     // Catch:{ all -> 0x00df }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00df }
            r11 = 0
            r2 = r11
        L_0x0047:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x00df }
            r5 = 2
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.b r4 = (com.ironsource.mediationsdk.C6642b) r4     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.utils.e r6 = r9.f16871a     // Catch:{ all -> 0x00df }
            boolean r6 = r6.mo36962b((com.ironsource.mediationsdk.C6642b) r4)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x006f
            r6 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "status"
            r5[r11] = r8     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "false"
            r5[r3] = r8     // Catch:{ all -> 0x00df }
            r7[r11] = r5     // Catch:{ all -> 0x00df }
            r9.m19990a((int) r6, (com.ironsource.mediationsdk.C6642b) r4, (java.lang.Object[][]) r7)     // Catch:{ all -> 0x00df }
        L_0x006f:
            com.ironsource.mediationsdk.utils.e r5 = r9.f16871a     // Catch:{ all -> 0x00df }
            boolean r5 = r5.mo36963c((com.ironsource.mediationsdk.C6642b) r4)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0047
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_DAY     // Catch:{ all -> 0x00df }
            r4.mo36629a(r5)     // Catch:{ all -> 0x00df }
            int r2 = r2 + 1
            goto L_0x0047
        L_0x007f:
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f16873c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r2 != r10) goto L_0x008e
            com.ironsource.mediationsdk.sdk.l r10 = r9.f17033m     // Catch:{ all -> 0x00df }
            r10.onRewardedVideoAvailabilityChanged(r11)     // Catch:{ all -> 0x00df }
            monitor-exit(r9)
            return
        L_0x008e:
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.m19989a((int) r10)     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.sdk.l r10 = r9.f17033m     // Catch:{ all -> 0x00df }
            r2 = 0
            r10.f17602f = r2     // Catch:{ all -> 0x00df }
            r9.f17043w = r3     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            r9.f17044x = r6     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            long r6 = r6 - r0
            r10 = 81313(0x13da1, float:1.13944E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "duration"
            r1[r11] = r2     // Catch:{ all -> 0x00df }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00df }
            r1[r3] = r2     // Catch:{ all -> 0x00df }
            r0[r11] = r1     // Catch:{ all -> 0x00df }
            r9.m19991a((int) r10, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x00df }
            r9.m20006o()     // Catch:{ all -> 0x00df }
        L_0x00c8:
            int r10 = r9.f16872b     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f16873c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            com.ironsource.mediationsdk.AbstractAdapter r10 = r9.m19997f()     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00dd
            int r11 = r11 + 1
            goto L_0x00c8
        L_0x00dd:
            monitor-exit(r9)
            return
        L_0x00df:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.mo36447a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo35940a(boolean z) {
        Boolean bool;
        if (this.f16879i) {
            boolean z2 = false;
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (this.f16880j != null) {
                if (z && !this.f16880j.booleanValue() && m20001j()) {
                    bool = Boolean.TRUE;
                } else if (!z && this.f16880j.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.f16880j = bool;
                z2 = true;
            }
            if (z2) {
                this.f17038r = !z;
                this.f17033m.onRewardedVideoAvailabilityChanged(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36448a(boolean r9, com.ironsource.mediationsdk.C6629ae r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r8.f16878h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r2.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = r10.f17243d     // Catch:{ all -> 0x0117 }
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ": onRewardedVideoAvailabilityChanged(available:"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            r2.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0117 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0117 }
            boolean r0 = r8.f17038r     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x002a
            monitor-exit(r8)
            return
        L_0x002a:
            r0 = 0
            if (r9 == 0) goto L_0x0058
            boolean r1 = r8.f17043w     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x0058
            r8.f17043w = r0     // Catch:{ all -> 0x0117 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0117 }
            r1.<init>()     // Catch:{ all -> 0x0117 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0117 }
            long r4 = r8.f17044x     // Catch:{ all -> 0x0117 }
            long r1 = r1 - r4
            r4 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r5 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0117 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0117 }
            java.lang.String r7 = "duration"
            r6[r0] = r7     // Catch:{ all -> 0x0117 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0117 }
            r6[r3] = r1     // Catch:{ all -> 0x0117 }
            r5[r0] = r6     // Catch:{ all -> 0x0117 }
            r8.m19991a((int) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x0117 }
            r8.m20008q()     // Catch:{ all -> 0x0117 }
        L_0x0058:
            com.ironsource.mediationsdk.b r1 = r8.f16874d     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0073
            boolean r0 = r8.m19995a((boolean) r9, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0071
            com.ironsource.mediationsdk.sdk.l r0 = r8.f17033m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f16880j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x0071:
            monitor-exit(r8)
            return
        L_0x0073:
            com.ironsource.mediationsdk.b r1 = r8.f16875e     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ba
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f16878h     // Catch:{ all -> 0x00ee }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r4.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = r10.f17243d     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = " is a premium adapter, canShowPremium: "
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            boolean r5 = r8.mo36350a()     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ee }
            r1.log(r2, r4, r3)     // Catch:{ all -> 0x00ee }
            boolean r1 = r8.mo36350a()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ba
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_SESSION     // Catch:{ all -> 0x00ee }
            r10.mo36629a(r1)     // Catch:{ all -> 0x00ee }
            boolean r0 = r8.m19995a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00b8
            com.ironsource.mediationsdk.sdk.l r0 = r8.f17033m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f16880j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x00b8:
            monitor-exit(r8)
            return
        L_0x00ba:
            com.ironsource.mediationsdk.utils.e r1 = r8.f16871a     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.mo36963c((com.ironsource.mediationsdk.C6642b) r10)     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00dc
            boolean r1 = r10.mo36633c()     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00dc
            boolean r0 = r8.m19995a((boolean) r3, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            com.ironsource.mediationsdk.sdk.l r0 = r8.f17033m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f16880j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x0115
        L_0x00dc:
            boolean r0 = r8.m19995a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            r8.m19994a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x00ee }
        L_0x00e6:
            r8.m19997f()     // Catch:{ all -> 0x00ee }
            r8.m20004m()     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r8)
            return
        L_0x00ee:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f16878h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "onRewardedVideoAvailabilityChanged(available:"
            r3.<init>(r4)     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ", provider:"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r10.mo36637j()     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ")"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0117 }
            r1.logException(r2, r9, r0)     // Catch:{ all -> 0x0117 }
        L_0x0115:
            monitor-exit(r8)
            return
        L_0x0117:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.mo36448a(boolean, com.ironsource.mediationsdk.ae):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo36351b() {
        super.mo36351b();
        Iterator it = this.f16873c.iterator();
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.equals(this.f16875e)) {
                bVar.mo36629a(C6642b.C6643a.CAPPED_PER_SESSION);
                m19997f();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo36449b(C6629ae aeVar) {
        String str;
        this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, aeVar.f17243d + ":onRewardedVideoAdClosed()", 1);
        this.f17045y = false;
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = this.f16873c.iterator();
            while (it.hasNext()) {
                C6642b bVar = (C6642b) it.next();
                if (((C6629ae) bVar).mo36618o()) {
                    sb.append(bVar.f17243d + ";");
                }
            }
        } catch (Throwable unused) {
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3][];
        objArr[0] = new Object[]{"placement", m20007p()};
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
        objArr[1] = objArr2;
        objArr[2] = new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f17225w)};
        m19990a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (C6642b) aeVar, objArr);
        C6782o.m20647a().mo36988a(1);
        if (!aeVar.mo36632b() && !this.f16871a.mo36963c((C6642b) aeVar)) {
            m19990a(1001, (C6642b) aeVar, (Object[][]) null);
        }
        m19996b(false);
        this.f17033m.onRewardedVideoAdClosed();
        m20008q();
        Iterator it2 = this.f16873c.iterator();
        while (it2.hasNext()) {
            C6642b bVar2 = (C6642b) it2.next();
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Fetch on ad closed, iterating on: " + bVar2.f17243d + ", Status: " + bVar2.f17240a, 0);
            if (bVar2.f17240a == C6642b.C6643a.NOT_AVAILABLE || bVar2.f17240a == C6642b.C6643a.NEEDS_RELOAD) {
                try {
                    if (!bVar2.f17243d.equals(aeVar.f17243d)) {
                        this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, bVar2.f17243d + ":reload smash", 1);
                        ((C6629ae) bVar2).mo36617n();
                        m19990a(1001, bVar2, (Object[][]) null);
                    }
                } catch (Throwable th) {
                    this.f16878h.log(IronSourceLogger.IronSourceTag.NATIVE, bVar2.f17243d + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo36450c(C6629ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f17243d + ":onRewardedVideoAdStarted()", 1);
        m19990a((int) IronSourceConstants.RV_INSTANCE_STARTED, (C6642b) aeVar, new Object[][]{new Object[]{"placement", m20007p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f17225w)}});
        this.f17033m.onRewardedVideoAdStarted();
    }

    /* renamed from: c */
    public final synchronized boolean mo36451c() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f17037q + ":isRewardedVideoAvailable()", 1);
        if (this.f16879i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f16873c.iterator();
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.mo36633c() && ((C6629ae) bVar).mo36618o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo36187c_() {
        if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) || this.f16880j == null) {
            IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
            m19991a((int) IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, (Object[][]) null);
            return;
        }
        if (m19995a(false, true)) {
            m19994a(C6399a.C64001.m19216a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        }
        m19996b(true);
        Iterator it = this.f16873c.iterator();
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.AVAILABLE || bVar.f17240a == C6642b.C6643a.NOT_AVAILABLE) {
                bVar.mo36629a(C6642b.C6643a.NEEDS_RELOAD);
            }
        }
        Iterator it2 = this.f16873c.iterator();
        while (it2.hasNext()) {
            C6642b bVar2 = (C6642b) it2.next();
            if (bVar2.f17240a == C6642b.C6643a.NEEDS_RELOAD) {
                try {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.info(bVar2.f17243d + ":reload smash");
                    m19990a(1001, bVar2, (Object[][]) null);
                    ((C6629ae) bVar2).mo36617n();
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error(bVar2.f17243d + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo36452d() {
        if (this.f17035o <= 0) {
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.f17041u;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f17041u = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                cancel();
                C6588ad.this.mo36454e();
                C6588ad.this.mo36452d();
            }
        }, (long) (this.f17035o * 1000));
    }

    /* renamed from: d */
    public final void mo36453d(C6629ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f17243d + ":onRewardedVideoAdEnded()", 1);
        m19990a((int) IronSourceConstants.RV_INSTANCE_ENDED, (C6642b) aeVar, new Object[][]{new Object[]{"placement", m20007p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f17225w)}});
        this.f17033m.onRewardedVideoAdEnded();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo36454e() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0092 }
            android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ all -> 0x0092 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
            java.lang.Boolean r0 = r8.f16880j     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0015
            goto L_0x0090
        L_0x0015:
            java.lang.Boolean r0 = r8.f16880j     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x008e
            r0 = 102(0x66, float:1.43E-43)
            r1 = 0
            r8.m19991a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.m19991a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1
            r8.f17043w = r0     // Catch:{ all -> 0x0092 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.f16873c     // Catch:{ all -> 0x0092 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0092 }
        L_0x0031:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x008e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b r3 = (com.ironsource.mediationsdk.C6642b) r3     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r4 = r3.f17240a     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C6642b.C6643a.NOT_AVAILABLE     // Catch:{ all -> 0x0092 }
            if (r4 != r5) goto L_0x0031
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r8.f16878h     // Catch:{ all -> 0x006b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "Fetch from timer: "
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = r3.f17243d     // Catch:{ all -> 0x006b }
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = ":reload smash"
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006b }
            r4.log(r5, r6, r0)     // Catch:{ all -> 0x006b }
            r4 = 1001(0x3e9, float:1.403E-42)
            r8.m19990a((int) r4, (com.ironsource.mediationsdk.C6642b) r3, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x006b }
            r4 = r3
            com.ironsource.mediationsdk.ae r4 = (com.ironsource.mediationsdk.C6629ae) r4     // Catch:{ all -> 0x006b }
            r4.mo36617n()     // Catch:{ all -> 0x006b }
            goto L_0x0031
        L_0x006b:
            r4 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r8.f16878h     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r7.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r3.f17243d     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = " Failed to call fetchVideo(), "
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r4.getLocalizedMessage()     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0092 }
            r5.log(r6, r3, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0031
        L_0x008e:
            monitor-exit(r8)
            return
        L_0x0090:
            monitor-exit(r8)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6588ad.mo36454e():void");
    }

    /* renamed from: e */
    public final void mo36455e(C6629ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f17243d + ":onRewardedVideoAdRewarded()", 1);
        if (this.f17040t == null) {
            this.f17040t = C6490J.m19474a().f16543i.f17849c.f17496a.mo36830a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C6642b) aeVar);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, aeVar.f17225w);
            if (this.f17040t != null) {
                providerAdditionalData.put("placement", m20007p());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f17040t.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.f17040t.getRewardAmount());
            } else {
                this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6552c cVar = new C6552c(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.f16877g)) {
            cVar.mo36392a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo36393b(), aeVar.mo36637j()));
            if (!TextUtils.isEmpty(C6490J.m19474a().f16547m)) {
                cVar.mo36392a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, (Object) C6490J.m19474a().f16547m);
            }
            Map<String, String> map = C6490J.m19474a().f16548n;
            if (map != null) {
                for (String next : map.keySet()) {
                    cVar.mo36392a(ContentMetadata.KEY_CUSTOM_PREFIX + next, (Object) map.get(next));
                }
            }
        }
        C6557h.m19950d().mo36371b(cVar);
        Placement placement = this.f17040t;
        if (placement != null) {
            this.f17033m.onRewardedVideoAdRewarded(placement);
        } else {
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    /* renamed from: f */
    public final void mo36456f(C6629ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f17243d + ":onRewardedVideoAdClicked()", 1);
        if (this.f17040t == null) {
            this.f17040t = C6490J.m19474a().f16543i.f17849c.f17496a.mo36830a();
        }
        if (this.f17040t == null) {
            this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            return;
        }
        m19990a(1006, (C6642b) aeVar, new Object[][]{new Object[]{"placement", m20007p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f17225w)}});
        this.f17033m.onRewardedVideoAdClicked(this.f17040t);
    }

    /* renamed from: g */
    public final void mo36058g() {
        Iterator it = this.f16873c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C6642b bVar = (C6642b) it.next();
            if (bVar.f17240a == C6642b.C6643a.CAPPED_PER_DAY) {
                m19990a((int) IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo36629a(C6642b.C6643a.NOT_AVAILABLE);
                if (((C6629ae) bVar).mo36618o() && bVar.mo36633c()) {
                    bVar.mo36629a(C6642b.C6643a.AVAILABLE);
                    z = true;
                }
            }
        }
        if (z && m19995a(true, false)) {
            this.f17033m.onRewardedVideoAvailabilityChanged(true);
        }
    }

    /* renamed from: g */
    public final void mo36457g(C6629ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16878h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f17243d + ":onRewardedVideoAdVisible()", 1);
        if (this.f17040t != null) {
            m19990a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (C6642b) aeVar, new Object[][]{new Object[]{"placement", m20007p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f17225w)}});
            return;
        }
        this.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
    }
}
