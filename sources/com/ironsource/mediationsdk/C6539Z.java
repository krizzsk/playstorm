package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C6642b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.Z */
public final class C6539Z extends C6560aa implements RewardedVideoSmashListener {

    /* renamed from: A */
    private String f16840A;

    /* renamed from: B */
    private String f16841B;

    /* renamed from: C */
    private final Object f16842C = new Object();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Object f16843D = new Object();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6541a f16844a = C6541a.NO_INIT;

    /* renamed from: b */
    boolean f16845b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6538Y f16846j;

    /* renamed from: k */
    private Timer f16847k;

    /* renamed from: l */
    private int f16848l;

    /* renamed from: m */
    private String f16849m;

    /* renamed from: n */
    private String f16850n;

    /* renamed from: o */
    private String f16851o;

    /* renamed from: p */
    private boolean f16852p;

    /* renamed from: q */
    private boolean f16853q;

    /* renamed from: r */
    private Placement f16854r;

    /* renamed from: s */
    private long f16855s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f16856t;

    /* renamed from: u */
    private JSONObject f16857u;

    /* renamed from: v */
    private String f16858v;

    /* renamed from: w */
    private int f16859w;

    /* renamed from: x */
    private String f16860x;

    /* renamed from: y */
    private int f16861y;

    /* renamed from: z */
    private int f16862z;

    /* renamed from: com.ironsource.mediationsdk.Z$a */
    public enum C6541a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C6539Z(String str, String str2, NetworkSettings networkSettings, C6538Y y, int i, AbstractAdapter abstractAdapter) {
        super(new C6691a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f16849m = str;
        this.f16850n = str2;
        this.f16846j = y;
        this.f16847k = null;
        this.f16848l = i;
        this.f16970c.addRewardedVideoListener(this);
        this.f16852p = false;
        this.f16853q = false;
        this.f16845b = false;
        this.f16854r = null;
        this.f16856t = "";
        this.f16857u = null;
        this.f16975h = 1;
        m19859g();
    }

    /* renamed from: a */
    private void m19846a(int i) {
        m19847a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m19847a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo36404n();
        if (!TextUtils.isEmpty(this.f16856t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16856t);
        }
        JSONObject jSONObject = this.f16857u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16857u);
        }
        if (z && (placement = this.f16854r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.f16854r.getPlacementName());
        }
        if (m19854b(i)) {
            C6557h.m19950d();
            C6557h.m19888a(n, this.f16859w, this.f16860x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16975h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo36401k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6557h.m19950d().mo36371b(new C6552c(i, new JSONObject(n)));
        if (i == 1203) {
            C6782o.m20647a().mo36988a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19848a(C6541a aVar) {
        m19851a("current state=" + this.f16844a + ", new state=" + aVar);
        synchronized (this.f16843D) {
            this.f16844a = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19851a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo36401k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m19852a(String str, String str2, int i, String str3, int i2, String str4) {
        this.f16858v = str2;
        this.f16851o = str;
        this.f16861y = i;
        this.f16841B = str3;
        this.f16862z = i2;
        this.f16840A = str4;
    }

    /* renamed from: b */
    private static boolean m19854b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1213 || i == 1212 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* renamed from: c */
    private void m19856c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo36401k() + " : " + str, 3);
    }

    /* renamed from: g */
    private void m19859g() {
        this.f16858v = "";
        this.f16861y = -1;
        this.f16841B = "";
        this.f16851o = "";
        this.f16862z = this.f16975h;
        this.f16840A = "";
    }

    /* renamed from: q */
    private boolean m19860q() {
        try {
            return this.f16970c.isRewardedVideoAvailable(this.f16973f);
        } catch (Exception e) {
            m19856c("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            mo36345b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: r */
    private void m19861r() {
        try {
            String str = C6490J.m19474a().f16546l;
            if (!TextUtils.isEmpty(str)) {
                this.f16970c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f16970c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m19851a("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: s */
    private void m19862s() {
        synchronized (this.f16842C) {
            if (this.f16847k != null) {
                this.f16847k.cancel();
                this.f16847k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public long m19863t() {
        return new Date().getTime() - this.f16855s;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36195a() {
        try {
            if (mo36398h()) {
                return this.f16970c.getRewardedVideoBiddingData(this.f16973f);
            }
            return null;
        } catch (Throwable th) {
            m19856c("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo36345b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo36340a(int i, Object[][] objArr) {
        m19847a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo36341a(Placement placement, int i) {
        m19862s();
        m19851a("showVideo()");
        this.f16854r = placement;
        this.f16975h = i;
        m19848a(C6541a.SHOW_IN_PROGRESS);
        mo36340a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f16970c.showRewardedVideo(this.f16973f, this);
        } catch (Throwable th) {
            m19856c("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(1038, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo36342a(String str, String str2, JSONObject jSONObject, int i, String str3, int i2, String str4) {
        C6541a aVar;
        m19851a("loadVideo() auctionId: " + str2 + " state: " + this.f16844a);
        this.f16976i = null;
        this.f16972e = false;
        this.f16845b = true;
        synchronized (this.f16843D) {
            aVar = this.f16844a;
            if (!(this.f16844a == C6541a.LOAD_IN_PROGRESS || this.f16844a == C6541a.SHOW_IN_PROGRESS)) {
                m19848a(C6541a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C6541a.LOAD_IN_PROGRESS) {
            mo36345b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
            this.f16853q = true;
            m19852a(str, str2, i, str3, i2, str4);
            this.f16846j.mo36332b(this, str2);
        } else if (aVar == C6541a.SHOW_IN_PROGRESS) {
            mo36345b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
            this.f16852p = true;
            m19852a(str, str2, i, str3, i2, str4);
        } else {
            this.f16974g = str4;
            this.f16856t = str2;
            this.f16857u = jSONObject;
            this.f16859w = i;
            this.f16860x = str3;
            this.f16975h = i2;
            synchronized (this.f16842C) {
                m19862s();
                Timer timer = new Timer();
                this.f16847k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str;
                        int i2;
                        String str2 = "Rewarded Video - load instance time out";
                        synchronized (C6539Z.this.f16843D) {
                            if (C6539Z.this.f16844a != C6541a.LOAD_IN_PROGRESS) {
                                if (C6539Z.this.f16844a != C6541a.INIT_IN_PROGRESS) {
                                    i = 0;
                                    z = false;
                                }
                            }
                            if (C6539Z.this.f16844a == C6541a.LOAD_IN_PROGRESS) {
                                str = str2;
                                i2 = 1025;
                            } else {
                                i2 = 1032;
                                str = "Rewarded Video - init instance time out";
                            }
                            C6539Z.this.m19848a(C6541a.NOT_LOADED);
                            z = true;
                            String str3 = str;
                            i = i2;
                            str2 = str3;
                        }
                        C6539Z.this.m19851a(str2);
                        if (z) {
                            C6539Z.this.mo36345b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(C6539Z.this.m19863t())}});
                            C6539Z.this.mo36345b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(C6539Z.this.m19863t())}});
                            C6538Y e = C6539Z.this.f16846j;
                            C6539Z z2 = C6539Z.this;
                            e.mo36332b(z2, z2.f16856t);
                            return;
                        }
                        C6539Z.this.mo36345b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(C6539Z.this.m19863t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C6539Z.this.f16844a.name()}});
                    }
                }, (long) (this.f16848l * 1000));
            }
            this.f16855s = new Date().getTime();
            m19846a(1001);
            try {
                if (mo36398h()) {
                    this.f16970c.loadRewardedVideoForBidding(this.f16973f, this, str);
                } else if (aVar == C6541a.NO_INIT) {
                    m19861r();
                    this.f16970c.initRewardedVideo(this.f16849m, this.f16850n, this.f16973f, this);
                } else {
                    this.f16970c.fetchRewardedVideoForAutomaticLoad(this.f16973f, this);
                }
            } catch (Throwable th) {
                m19856c("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoLoadFailed(new IronSourceError(1030, th.getLocalizedMessage()));
                mo36345b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo36343a(boolean z, int i) {
        this.f16975h = i;
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m19847a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo36344b() {
        m19851a("initForBidding()");
        m19848a(C6541a.INIT_IN_PROGRESS);
        m19861r();
        try {
            this.f16970c.initRewardedVideoForBidding(this.f16849m, this.f16850n, this.f16973f, this);
        } catch (Throwable th) {
            m19856c("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo36345b(int i, Object[][] objArr) {
        m19847a(i, objArr, false);
    }

    /* renamed from: c */
    public final boolean mo36346c() {
        return mo36398h() ? this.f16845b && this.f16844a == C6541a.LOADED && m19860q() : m19860q();
    }

    /* renamed from: f */
    public final void mo36347f() {
        this.f16970c.setMediationState(C6642b.C6643a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m19847a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    public final void onRewardedVideoAdClicked() {
        m19851a("onRewardedVideoAdClicked");
        this.f16846j.mo36331b(this, this.f16854r);
        mo36340a(1006, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r12.f16846j.mo36330b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r12.f16852p == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        m19851a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
        r12.f16852p = false;
        mo36342a(r12.f16851o, r12.f16858v, r12.f16857u, r12.f16861y, r12.f16841B, r12.f16862z, r12.f16840A);
        m19859g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRewardedVideoAdClosed() {
        /*
            r12 = this;
            java.lang.String r0 = "onRewardedVideoAdClosed"
            r12.m19851a((java.lang.String) r0)
            java.lang.Object r0 = r12.f16843D
            monitor-enter(r0)
            com.ironsource.mediationsdk.Z$a r1 = r12.f16844a     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.Z$a r2 = com.ironsource.mediationsdk.C6539Z.C6541a.SHOW_IN_PROGRESS     // Catch:{ all -> 0x0077 }
            r3 = 0
            if (r1 == r2) goto L_0x004b
            r1 = 1203(0x4b3, float:1.686E-42)
            r2 = 0
            r12.mo36340a((int) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0077 }
            r1 = 81316(0x13da4, float:1.13948E-40)
            r2 = 2
            java.lang.Object[][] r4 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0077 }
            r6 = 5009(0x1391, float:7.019E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0077 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x0077 }
            r4[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "reason"
            r2[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "adClosed: "
            r3.<init>(r5)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.Z$a r5 = r12.f16844a     // Catch:{ all -> 0x0077 }
            r3.append(r5)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0077 }
            r2[r7] = r3     // Catch:{ all -> 0x0077 }
            r4[r7] = r2     // Catch:{ all -> 0x0077 }
            r12.mo36345b(r1, r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x004b:
            com.ironsource.mediationsdk.Z$a r1 = com.ironsource.mediationsdk.C6539Z.C6541a.NOT_LOADED     // Catch:{ all -> 0x0077 }
            r12.m19848a((com.ironsource.mediationsdk.C6539Z.C6541a) r1)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.Y r0 = r12.f16846j
            r0.mo36330b(r12)
            boolean r0 = r12.f16852p
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding"
            r12.m19851a((java.lang.String) r0)
            r12.f16852p = r3
            java.lang.String r5 = r12.f16851o
            java.lang.String r6 = r12.f16858v
            org.json.JSONObject r7 = r12.f16857u
            int r8 = r12.f16861y
            java.lang.String r9 = r12.f16841B
            int r10 = r12.f16862z
            java.lang.String r11 = r12.f16840A
            r4 = r12
            r4.mo36342a(r5, r6, r7, r8, r9, r10, r11)
            r12.m19859g()
        L_0x0076:
            return
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6539Z.onRewardedVideoAdClosed():void");
    }

    public final void onRewardedVideoAdEnded() {
        m19851a("onRewardedVideoAdEnded");
        this.f16846j.mo36334d(this);
        mo36340a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m19851a("onRewardedVideoAdOpened");
        this.f16846j.mo36325a(this);
        mo36340a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m19851a("onRewardedVideoAdRewarded");
        this.f16846j.mo36326a(this, this.f16854r);
        Map<String, Object> n = mo36404n();
        Placement placement = this.f16854r;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f16854r.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f16854r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C6490J.m19474a().f16547m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C6490J.m19474a().f16547m);
        }
        if (C6490J.m19474a().f16548n != null) {
            for (String next : C6490J.m19474a().f16548n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C6490J.m19474a().f16548n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f16856t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16856t);
        }
        JSONObject jSONObject = this.f16857u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16857u);
        }
        if (m19854b(1010)) {
            C6557h.m19950d();
            C6557h.m19888a(n, this.f16859w, this.f16860x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16975h));
        C6552c cVar = new C6552c(1010, new JSONObject(n));
        cVar.mo36392a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo36393b(), mo36401k()));
        C6557h.m19950d().mo36371b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m19851a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo36340a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f16843D) {
            if (this.f16844a != C6541a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo36345b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f16844a}});
                return;
            }
            m19848a(C6541a.NOT_LOADED);
            this.f16846j.mo36328a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m19851a("onRewardedVideoAdStarted");
        this.f16846j.mo36333c(this);
        mo36340a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m19851a("onRewardedVideoAdVisible");
        mo36340a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m19851a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f16844a.name());
        synchronized (this.f16843D) {
            if (this.f16844a == C6541a.LOAD_IN_PROGRESS) {
                m19848a(z ? C6541a.LOADED : C6541a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m19862s();
            mo36345b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(m19863t())}});
            if (this.f16853q) {
                this.f16853q = false;
                m19851a("onRewardedVideoAvailabilityChanged to " + z + "and mShouldLoadAfterLoad is true - calling loadVideo");
                mo36342a(this.f16851o, this.f16858v, this.f16857u, this.f16861y, this.f16841B, this.f16862z, this.f16840A);
                m19859g();
            } else if (z) {
                this.f16846j.mo36327a(this, this.f16856t);
            } else {
                this.f16846j.mo36332b(this, this.f16856t);
            }
        } else if (z) {
            mo36345b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16844a.name()}});
        } else {
            mo36345b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{"duration", Long.valueOf(m19863t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16844a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m19851a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m19862s();
        mo36345b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{"duration", Long.valueOf(m19863t())}});
        mo36345b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19863t())}});
        synchronized (this.f16843D) {
            if (this.f16844a != C6541a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo36345b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f16844a}});
                return;
            }
            m19848a(C6541a.NO_INIT);
            this.f16846j.mo36332b(this, this.f16856t);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m19851a("onRewardedVideoInitSuccess");
        synchronized (this.f16843D) {
            if (this.f16844a != C6541a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo36345b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f16844a}});
                return;
            }
            m19848a(C6541a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m19847a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(m19863t())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f16976i = Long.valueOf(System.currentTimeMillis());
        }
        m19847a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19863t())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
