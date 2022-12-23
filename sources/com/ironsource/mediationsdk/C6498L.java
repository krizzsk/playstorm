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

/* renamed from: com.ironsource.mediationsdk.L */
public final class C6498L extends C6560aa implements RewardedVideoSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6500a f16598a;

    /* renamed from: b */
    String f16599b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6501M f16600j;

    /* renamed from: k */
    private Timer f16601k;

    /* renamed from: l */
    private int f16602l;

    /* renamed from: m */
    private String f16603m;

    /* renamed from: n */
    private String f16604n;

    /* renamed from: o */
    private Placement f16605o;

    /* renamed from: p */
    private long f16606p;

    /* renamed from: q */
    private JSONObject f16607q;

    /* renamed from: r */
    private int f16608r;

    /* renamed from: s */
    private String f16609s;

    /* renamed from: t */
    private final Object f16610t;

    /* renamed from: u */
    private final Object f16611u;

    /* renamed from: v */
    private long f16612v;

    /* renamed from: com.ironsource.mediationsdk.L$a */
    public enum C6500a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6498L(com.ironsource.mediationsdk.C6498L r10, com.ironsource.mediationsdk.C6501M r11, com.ironsource.mediationsdk.AbstractAdapter r12, int r13, java.lang.String r14, org.json.JSONObject r15, int r16, java.lang.String r17) {
        /*
            r9 = this;
            r8 = r9
            r0 = r10
            java.lang.String r1 = r0.f16603m
            java.lang.String r2 = r0.f16604n
            com.ironsource.mediationsdk.model.a r3 = r0.f16971d
            com.ironsource.mediationsdk.model.NetworkSettings r3 = r3.f17477a
            int r5 = r0.f16602l
            r0 = r9
            r4 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r14
            r8.f16599b = r0
            r0 = r15
            r8.f16607q = r0
            r0 = r16
            r8.f16608r = r0
            r0 = r17
            r8.f16609s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6498L.<init>(com.ironsource.mediationsdk.L, com.ironsource.mediationsdk.M, com.ironsource.mediationsdk.AbstractAdapter, int, java.lang.String, org.json.JSONObject, int, java.lang.String):void");
    }

    public C6498L(String str, String str2, NetworkSettings networkSettings, C6501M m, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new C6691a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f16610t = new Object();
        this.f16611u = new Object();
        this.f16603m = str;
        this.f16604n = str2;
        this.f16600j = m;
        this.f16601k = null;
        this.f16602l = i;
        this.f16970c.updateRewardedVideoListener(this);
        this.f16975h = i2;
        this.f16598a = C6500a.NO_INIT;
        this.f16612v = 0;
        if (this.f16971d.f17479c) {
            m19607c("initForBidding()");
            m19601a(C6500a.INIT_IN_PROGRESS);
            m19610g();
            try {
                this.f16970c.initRewardedVideoForBidding(this.f16603m, this.f16604n, this.f16973f, this);
            } catch (Throwable th) {
                m19608d("initForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    /* renamed from: a */
    private void m19599a(int i) {
        m19600a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m19600a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo36404n();
        if (!TextUtils.isEmpty(this.f16599b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16599b);
        }
        JSONObject jSONObject = this.f16607q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16607q);
        }
        if (z && (placement = this.f16605o) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.f16605o.getPlacementName());
        }
        if (m19605b(i)) {
            C6557h.m19950d();
            C6557h.m19888a(n, this.f16608r, this.f16609s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16975h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo36401k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6557h.m19950d().mo36371b(new C6552c(i, new JSONObject(n)));
        if (i == 1203) {
            C6782o.m20647a().mo36988a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19601a(C6500a aVar) {
        m19607c("current state=" + this.f16598a + ", new state=" + aVar);
        synchronized (this.f16610t) {
            this.f16598a = aVar;
        }
    }

    /* renamed from: b */
    private static boolean m19605b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19607c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo36401k() + " " + hashCode() + "  : " + str, 0);
    }

    /* renamed from: d */
    private void m19608d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo36401k() + " " + hashCode() + " : " + str, 3);
    }

    /* renamed from: f */
    private boolean m19609f() {
        try {
            return this.f16970c.isRewardedVideoAvailable(this.f16973f);
        } catch (Exception e) {
            m19608d("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            mo36200b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: g */
    private void m19610g() {
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
            m19607c("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: q */
    private void m19611q() {
        synchronized (this.f16611u) {
            if (this.f16601k != null) {
                this.f16601k.cancel();
                this.f16601k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public long m19612r() {
        return new Date().getTime() - this.f16606p;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36195a() {
        try {
            if (mo36398h()) {
                return this.f16970c.getRewardedVideoBiddingData(this.f16973f);
            }
            return null;
        } catch (Throwable th) {
            m19608d("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo36200b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo36196a(int i, Object[][] objArr) {
        m19600a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo36197a(Placement placement) {
        m19611q();
        m19607c("showVideo()");
        this.f16605o = placement;
        m19601a(C6500a.SHOW_IN_PROGRESS);
        mo36196a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f16970c.showRewardedVideo(this.f16973f, this);
        } catch (Throwable th) {
            m19608d("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(1038, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo36198a(String str) {
        C6500a aVar;
        m19607c("loadVideo() auctionId: " + this.f16599b + " state: " + this.f16598a);
        this.f16976i = null;
        this.f16972e = false;
        synchronized (this.f16610t) {
            aVar = this.f16598a;
            if (!(this.f16598a == C6500a.LOAD_IN_PROGRESS || this.f16598a == C6500a.SHOW_IN_PROGRESS)) {
                m19601a(C6500a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C6500a.LOAD_IN_PROGRESS) {
            mo36200b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == C6500a.SHOW_IN_PROGRESS) {
            mo36200b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.f16611u) {
                Timer timer = new Timer();
                this.f16601k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str = "Rewarded Video - load instance time out";
                        if (C6498L.this.f16598a == C6500a.LOAD_IN_PROGRESS || C6498L.this.f16598a == C6500a.INIT_IN_PROGRESS) {
                            if (C6498L.this.f16598a == C6500a.LOAD_IN_PROGRESS) {
                                i = 1025;
                            } else {
                                i = 1032;
                                str = "Rewarded Video - init instance time out";
                            }
                            C6498L.this.m19601a(C6500a.NOT_LOADED);
                            z = true;
                        } else {
                            i = 0;
                            z = false;
                        }
                        C6498L.this.m19607c(str);
                        if (z) {
                            C6498L.this.mo36200b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(C6498L.this.m19612r())}});
                            C6498L.this.mo36200b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(C6498L.this.m19612r())}});
                            C6498L.this.f16600j.mo36184b(C6498L.this);
                            return;
                        }
                        C6498L.this.mo36200b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(C6498L.this.m19612r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C6498L.this.f16598a.name()}});
                    }
                }, (long) (this.f16602l * 1000));
            }
            this.f16606p = new Date().getTime();
            m19599a(1001);
            try {
                if (mo36398h()) {
                    this.f16970c.loadRewardedVideoForBidding(this.f16973f, this, str);
                    return;
                }
                m19610g();
                this.f16970c.initRewardedVideo(this.f16603m, this.f16604n, this.f16973f, this);
            } catch (Throwable th) {
                m19608d("loadVideo exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                mo36200b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(mo36398h() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo36199a(boolean z) {
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m19600a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo36200b(int i, Object[][] objArr) {
        m19600a(i, objArr, false);
    }

    /* renamed from: b */
    public final boolean mo36201b() {
        return mo36398h() ? this.f16598a == C6500a.LOADED && m19609f() : m19609f();
    }

    /* renamed from: b_ */
    public final void mo36202b_() {
        this.f16970c.setMediationState(C6642b.C6643a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m19600a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    /* renamed from: c */
    public final LoadWhileShowSupportState mo36203c() {
        try {
            return this.f16970c.getLoadWhileShowSupportState(this.f16973f);
        } catch (Exception e) {
            m19608d("Exception while calling adapter.getLoadWhileShowSupportState() - " + e.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    /* renamed from: e */
    public final int mo36204e() {
        return 2;
    }

    public final void onRewardedVideoAdClicked() {
        m19607c("onRewardedVideoAdClicked");
        this.f16600j.mo36185b(this, this.f16605o);
        mo36196a(1006, (Object[][]) null);
    }

    public final void onRewardedVideoAdClosed() {
        m19607c("onRewardedVideoAdClosed");
        synchronized (this.f16610t) {
            if (this.f16598a != C6500a.SHOW_IN_PROGRESS) {
                mo36196a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)};
                mo36200b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f16598a}});
                return;
            }
            m19601a(C6500a.ENDED);
            this.f16612v = new Date().getTime();
            this.f16600j.mo36188d(this);
        }
    }

    public final void onRewardedVideoAdEnded() {
        m19607c("onRewardedVideoAdEnded");
        this.f16600j.mo36192f(this);
        mo36196a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m19607c("onRewardedVideoAdOpened");
        this.f16600j.mo36186c(this);
        mo36196a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m19607c("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f16600j.mo36180a(this, this.f16605o);
        Map<String, Object> n = mo36404n();
        Placement placement = this.f16605o;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f16605o.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f16605o.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C6490J.m19474a().f16547m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C6490J.m19474a().f16547m);
        }
        if (C6490J.m19474a().f16548n != null) {
            for (String next : C6490J.m19474a().f16548n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C6490J.m19474a().f16548n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f16599b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16599b);
        }
        JSONObject jSONObject = this.f16607q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16607q);
        }
        if (m19605b(1010)) {
            C6557h.m19950d();
            C6557h.m19888a(n, this.f16608r, this.f16609s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16975h));
        C6552c cVar = new C6552c(1010, new JSONObject(n));
        cVar.mo36392a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo36393b(), mo36401k()));
        long j = this.f16612v;
        if (j != 0) {
            long j2 = time - j;
            m19607c("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            cVar.mo36392a("duration", (Object) Long.valueOf(j2));
        }
        C6557h.m19950d().mo36371b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m19607c("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo36196a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f16610t) {
            if (this.f16598a != C6500a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo36200b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f16598a}});
                return;
            }
            m19601a(C6500a.ENDED);
            this.f16600j.mo36181a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m19607c("onRewardedVideoAdStarted");
        this.f16600j.mo36190e(this);
        mo36196a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m19607c("onRewardedVideoAdVisible");
        mo36196a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m19607c("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f16598a.name());
        synchronized (this.f16610t) {
            if (this.f16598a == C6500a.LOAD_IN_PROGRESS) {
                m19601a(z ? C6500a.LOADED : C6500a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m19611q();
            mo36200b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(m19612r())}});
            if (z) {
                this.f16600j.mo36179a(this);
            } else {
                this.f16600j.mo36184b(this);
            }
        } else if (z) {
            mo36200b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16598a.name()}});
        } else {
            mo36200b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{"duration", Long.valueOf(m19612r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16598a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m19607c("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m19611q();
        mo36200b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{"duration", Long.valueOf(m19612r())}});
        mo36200b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19612r())}});
        synchronized (this.f16610t) {
            if (this.f16598a != C6500a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo36200b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f16598a}});
                return;
            }
            m19601a(C6500a.NO_INIT);
            this.f16600j.mo36184b(this);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m19607c("onRewardedVideoInitSuccess");
        synchronized (this.f16610t) {
            if (this.f16598a != C6500a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo36200b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f16598a}});
                return;
            }
            m19601a(C6500a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m19600a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(m19612r())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f16976i = Long.valueOf(System.currentTimeMillis());
        }
        m19600a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19612r())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
