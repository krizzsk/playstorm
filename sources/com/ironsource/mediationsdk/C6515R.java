package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6663i;
import com.ironsource.mediationsdk.C6711o;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6696f;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.p216b.C6646b;
import com.ironsource.mediationsdk.p217c.C6652b;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6769f;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p374my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.R */
public final class C6515R extends C6714p implements C6522S, C6646b.C6647a, C6660g {

    /* renamed from: d */
    C6652b f16695d;

    /* renamed from: e */
    C6646b f16696e;

    /* renamed from: f */
    IronSourceBannerLayout f16697f;

    /* renamed from: g */
    C6696f f16698g;

    /* renamed from: h */
    C6523T f16699h;

    /* renamed from: i */
    int f16700i;

    /* renamed from: j */
    final ConcurrentHashMap<String, C6523T> f16701j;

    /* renamed from: k */
    C6661h f16702k;

    /* renamed from: l */
    C6663i f16703l;

    /* renamed from: m */
    ConcurrentHashMap<String, C6663i.C6664a> f16704m;

    /* renamed from: n */
    long f16705n;

    /* renamed from: o */
    private C6521a f16706o = C6515R.C6521a.NONE;

    /* renamed from: p */
    private int f16707p;

    /* renamed from: q */
    private CopyOnWriteArrayList<C6523T> f16708q;

    /* renamed from: r */
    private String f16709r;

    /* renamed from: s */
    private JSONObject f16710s;

    /* renamed from: t */
    private String f16711t = "";

    /* renamed from: u */
    private int f16712u;

    /* renamed from: v */
    private C6758b f16713v;

    /* renamed from: w */
    private ConcurrentHashMap<String, C6758b> f16714w;

    /* renamed from: x */
    private final Object f16715x = new Object();

    /* renamed from: y */
    private C6769f f16716y;

    /* renamed from: com.ironsource.mediationsdk.R$a */
    enum C6521a {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public C6515R(List<NetworkSettings> list, C6652b bVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + bVar.mo36651c());
        this.f16695d = bVar;
        this.f16696e = new C6646b(this.f16695d.mo36655g());
        this.f16701j = new ConcurrentHashMap<>();
        this.f16708q = new CopyOnWriteArrayList<>();
        this.f16714w = new ConcurrentHashMap<>();
        this.f16704m = new ConcurrentHashMap<>();
        this.f16700i = C6782o.m20647a().mo36990b(3);
        C6682l.m20363a().f17404a = this.f16695d.mo36653e();
        if (this.f16695d.mo36651c()) {
            this.f16702k = new C6661h(AdFormat.BANNER, this.f16695d.mo36656h(), this);
        }
        m19665a(list);
        m19668b(list);
        this.f16705n = new Date().getTime();
        mo36267a(C6515R.C6521a.READY_TO_LOAD);
    }

    /* renamed from: a */
    static /* synthetic */ ISBannerSize m19660a(C6515R r) {
        IronSourceBannerLayout ironSourceBannerLayout = r.f16697f;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return r.f16697f.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? ISBannerSize.f16451a : ISBannerSize.BANNER : r.f16697f.getSize();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19661a(int i, Object[][] objArr) {
        mo36265a(i, objArr, this.f16700i);
    }

    /* renamed from: a */
    private void m19664a(C6523T t, C6758b bVar) {
        C6661h.m20331a(bVar, t.mo36399i(), this.f16713v, mo36277f());
        mo36842a(this.f16714w.get(t.mo36401k()), mo36277f());
    }

    /* renamed from: a */
    private void m19665a(List<NetworkSettings> list) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f16703l = new C6663i(arrayList, this.f16695d.mo36656h().f17674f);
    }

    /* renamed from: a */
    private static void m19666a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                String str = "Adaptive=true";
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19667a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f16706o);
        if (mo36271a(C6515R.C6521a.STARTED_LOADING, this.f16695d.mo36651c() ? z ? C6515R.C6521a.AUCTION : C6515R.C6521a.FIRST_AUCTION : z ? C6515R.C6521a.RELOADING : C6515R.C6521a.LOADING)) {
            this.f16716y = new C6769f();
            this.f16709r = "";
            this.f16710s = null;
            this.f16707p = 0;
            this.f16700i = C6782o.m20647a().mo36990b(3);
            m19661a(z ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
            if (this.f16695d.mo36651c()) {
                mo36275e();
                return;
            }
            m19673h();
            m19672g();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.error("wrong state - " + this.f16706o);
    }

    /* renamed from: b */
    private void m19668b(List<NetworkSettings> list) {
        for (int i = 0; i < list.size(); i++) {
            NetworkSettings networkSettings = list.get(i);
            AbstractAdapter a = C6653d.m20285a().mo36662a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a != null) {
                C6523T t = new C6523T(this.f16695d, this, networkSettings, a, this.f16700i, m19680o());
                this.f16701j.put(t.mo36401k(), t);
            } else {
                IronLog.INTERNAL.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
    }

    /* renamed from: b */
    private static boolean m19669b(int i) {
        return i == 3201 || i == 3110 || i == 3111 || i == 3116 || i == 3119 || i == 3112 || i == 3115 || i == 3501 || i == 3502 || i == 3506;
    }

    /* renamed from: c */
    private String m19670c(List<C6758b> list) {
        int i;
        int i2;
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f16708q.clear();
        this.f16714w.clear();
        this.f16704m.clear();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < list.size()) {
            C6758b bVar = list.get(i3);
            C6523T t = this.f16701j.get(bVar.mo36939a());
            if (t != null) {
                AbstractAdapter a = C6653d.m20285a().mo36661a(t.f16971d.f17477a);
                if (a != null) {
                    C6523T t2 = r0;
                    i = i3;
                    i2 = 1;
                    C6523T t3 = new C6523T(this.f16695d, this, t.f16971d.f17477a, a, this.f16700i, this.f16709r, this.f16710s, this.f16712u, this.f16711t, m19680o());
                    t2.f16972e = true;
                    this.f16708q.add(t2);
                    this.f16714w.put(t2.mo36401k(), bVar);
                    this.f16704m.put(bVar.mo36939a(), C6663i.C6664a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    i = i3;
                    i2 = 1;
                }
            } else {
                i = i3;
                i2 = 1;
                IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + bVar.mo36939a());
            }
            C6523T t4 = this.f16701j.get(bVar.mo36939a());
            String str = "1";
            if (t4 == null ? !TextUtils.isEmpty(bVar.mo36940b()) : t4.mo36398h()) {
                str = "2";
            }
            sb.append(str + bVar.mo36939a());
            int i4 = i;
            if (i4 != list.size() - i2) {
                sb.append(",");
            }
            i3 = i4 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* renamed from: f */
    private void m19671f(C6523T t) {
        Iterator<C6523T> it = this.f16708q.iterator();
        while (it.hasNext()) {
            C6523T next = it.next();
            if (!next.equals(t)) {
                next.mo36288d();
            }
        }
    }

    /* renamed from: g */
    private void m19672g() {
        int i = this.f16707p;
        while (true) {
            String str = null;
            if (i < this.f16708q.size()) {
                C6523T t = this.f16708q.get(i);
                if (t.f16972e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loading smash - " + t.mo36406p());
                    this.f16707p = i + 1;
                    IronSourceBannerLayout ironSourceBannerLayout = this.f16697f;
                    if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                        if (t.mo36398h()) {
                            str = this.f16714w.get(t.mo36401k()).mo36940b();
                            t.mo36397b(str);
                        }
                        t.mo36285a(this.f16697f.mo36100a(), this.f16698g, str);
                        return;
                    }
                    return;
                }
                i++;
            } else {
                String str2 = this.f16708q.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("errorReason = " + str2);
                m19671f((C6523T) null);
                if (mo36271a(C6515R.C6521a.LOADING, C6515R.C6521a.READY_TO_LOAD)) {
                    m19661a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16716y))}});
                    C6682l.m20363a().mo36722a(this.f16697f, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2), false);
                    return;
                } else if (mo36271a(C6515R.C6521a.RELOADING, C6515R.C6521a.LOADED)) {
                    m19661a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16716y))}});
                    C6682l.m20363a().mo36722a(this.f16697f, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2), true);
                    this.f16696e.mo36645a(this);
                    return;
                } else {
                    mo36267a(C6515R.C6521a.READY_TO_LOAD);
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("wrong state = " + this.f16706o);
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private void m19673h() {
        List<C6758b> i = m19674i();
        this.f16709r = m20437d();
        m19670c(i);
    }

    /* renamed from: i */
    private List<C6758b> m19674i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6523T next : this.f16701j.values()) {
            if (!next.mo36398h() && !C6774k.m20612b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), mo36277f())) {
                copyOnWriteArrayList.add(new C6758b(next.mo36401k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: j */
    private boolean m19675j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16697f;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: k */
    private ISBannerSize m19676k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16697f;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    /* renamed from: l */
    private boolean m19677l() {
        boolean z;
        synchronized (this.f16715x) {
            if (this.f16706o != C6515R.C6521a.LOADING) {
                if (this.f16706o != C6515R.C6521a.RELOADING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    private boolean m19678m() {
        boolean z;
        synchronized (this.f16715x) {
            if (this.f16706o != C6515R.C6521a.FIRST_AUCTION) {
                if (this.f16706o != C6515R.C6521a.AUCTION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    private boolean m19679n() {
        boolean z;
        synchronized (this.f16715x) {
            z = this.f16706o == C6515R.C6521a.LOADED;
        }
        return z;
    }

    /* renamed from: o */
    private boolean m19680o() {
        return this.f16706o == C6515R.C6521a.RELOADING || this.f16706o == C6515R.C6521a.AUCTION;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36263a() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = "checking with IronsourceLifecycleManager if app in foreground"
            r0.verbose(r1)
            com.ironsource.lifecycle.d r0 = com.ironsource.lifecycle.C6443d.m19366a()
            boolean r0 = r0.mo35958b()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0088
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f16697f
            if (r0 != 0) goto L_0x0020
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner is null"
        L_0x001b:
            r0.verbose(r3)
            r0 = r2
            goto L_0x0056
        L_0x0020:
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x002b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner or one of its parents are INVISIBLE or GONE"
            goto L_0x001b
        L_0x002b:
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f16697f
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L_0x0038
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner has no window focus"
            goto L_0x001b
        L_0x0038:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.f16697f
            boolean r0 = r3.getGlobalVisibleRect(r0)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visible = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.verbose(r4)
        L_0x0056:
            if (r0 == 0) goto L_0x0085
            com.ironsource.mediationsdk.R$a r0 = com.ironsource.mediationsdk.C6515R.C6521a.LOADED
            com.ironsource.mediationsdk.R$a r3 = com.ironsource.mediationsdk.C6515R.C6521a.STARTED_LOADING
            boolean r0 = r6.mo36271a((com.ironsource.mediationsdk.C6515R.C6521a) r0, (com.ironsource.mediationsdk.C6515R.C6521a) r3)
            if (r0 == 0) goto L_0x006d
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "start loading"
            r0.verbose(r3)
            r6.m19667a((boolean) r1)
            goto L_0x0082
        L_0x006d:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wrong state = "
            r3.<init>(r4)
            com.ironsource.mediationsdk.R$a r4 = r6.f16706o
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.error(r3)
        L_0x0082:
            r0 = 0
            r3 = r2
            goto L_0x008b
        L_0x0085:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x008a
        L_0x0088:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x008a:
            r3 = r1
        L_0x008b:
            if (r3 == 0) goto L_0x00af
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r3.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r3 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r2] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r3[r2] = r4
            r6.m19661a((int) r0, (java.lang.Object[][]) r3)
            com.ironsource.mediationsdk.b.b r0 = r6.f16696e
            r0.mo36645a(r6)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6515R.mo36263a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36264a(int i) {
        m19661a(i, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo36176a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog.INTERNAL.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (m19678m()) {
            this.f16711t = str2;
            this.f16712u = i2;
            this.f16710s = null;
            m19673h();
            m19661a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
            mo36267a(this.f16706o == C6515R.C6521a.FIRST_AUCTION ? C6515R.C6521a.LOADING : C6515R.C6521a.RELOADING);
            m19672g();
            return;
        }
        IronLog.INTERNAL.warning("wrong state - mCurrentState = " + this.f16706o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36265a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize k = m19676k();
            if (k != null) {
                m19666a(mediationAdditionalData, k);
            }
            if (this.f16698g != null) {
                mediationAdditionalData.put("placement", mo36277f());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (!TextUtils.isEmpty(this.f16709r)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16709r);
            }
            if (this.f16710s != null && this.f16710s.length() > 0) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16710s);
            }
            if (m19669b(i)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f16712u);
                if (!TextUtils.isEmpty(this.f16711t)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f16711t);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
        C6553d.m19930d().mo36371b(new C6552c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    public final void mo36266a(final IronSourceBannerLayout ironSourceBannerLayout, final C6696f fVar) {
        IronLog.INTERNAL.verbose("");
        mo36838a(IronSource.AD_UNIT.BANNER);
        mo36844a_();
        if (!mo36271a(C6515R.C6521a.READY_TO_LOAD, C6515R.C6521a.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (!C6682l.m20363a().mo36724b()) {
            C65161 r0 = new C6711o.C6713b() {
                /* renamed from: a */
                public final void mo36278a() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("placement = " + fVar.getPlacementName());
                    C6515R.this.f16697f = ironSourceBannerLayout;
                    C6515R.this.f16698g = fVar;
                    if (C6774k.m20612b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), fVar.getPlacementName())) {
                        IronLog.INTERNAL.verbose("placement is capped");
                        C6682l a = C6682l.m20363a();
                        IronSourceBannerLayout ironSourceBannerLayout = ironSourceBannerLayout;
                        a.mo36722a(ironSourceBannerLayout, new IronSourceError(604, "placement " + fVar.getPlacementName() + " is capped"), false);
                        C6515R.this.m19661a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                        C6515R.this.mo36267a(C6515R.C6521a.READY_TO_LOAD);
                        return;
                    }
                    C6515R.this.m19667a(false);
                }

                /* renamed from: a */
                public final void mo36279a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("can't load banner - errorMessage = " + str);
                }
            };
            String str = null;
            if (!C6711o.m20432a(ironSourceBannerLayout)) {
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                str = String.format("can't load banner - %s", objArr);
            }
            if (fVar == null || TextUtils.isEmpty(fVar.getPlacementName())) {
                Object[] objArr2 = new Object[1];
                objArr2[0] = fVar == null ? "placement is null" : "placement name is empty";
                str = String.format("can't load banner - %s", objArr2);
            }
            if (!TextUtils.isEmpty(str)) {
                IronLog.INTERNAL.error(str);
                r0.mo36279a(str);
                return;
            }
            r0.mo36278a();
        } else {
            IronLog.INTERNAL.verbose("can't load banner - already has pending invocation");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36267a(C6521a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.f16706o + "' to '" + aVar + "'");
        synchronized (this.f16715x) {
            this.f16706o = aVar;
        }
    }

    /* renamed from: a */
    public final void mo36268a(C6523T t) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(t.mo36406p());
        if (m19675j()) {
            C6675k.m20355a().mo36714d(this.f17577c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36265a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, t.mo36403m());
    }

    /* renamed from: a */
    public final void mo36269a(C6523T t, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        C6523T t2 = t;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + t.mo36406p());
        if (t2.f16734a != this.f16709r) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + t2.f16734a + " and the current id is " + this.f16709r);
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            t2.mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + t2.f16734a + " State - " + this.f16706o}, new Object[]{IronSourceConstants.EVENTS_EXT1, t.mo36401k()}});
        } else if (m19677l()) {
            C6523T t3 = this.f16699h;
            if (t3 != null) {
                t3.mo36288d();
            }
            m19671f(t);
            this.f16699h = t2;
            IronSourceBannerLayout ironSourceBannerLayout = this.f16697f;
            if (ironSourceBannerLayout != null) {
                ironSourceBannerLayout.mo36101a(view, layoutParams);
            }
            this.f16704m.put(t.mo36401k(), C6663i.C6664a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f16695d.mo36651c()) {
                C6758b bVar = this.f16714w.get(t.mo36401k());
                if (bVar != null) {
                    mo36840a(bVar.mo36938a(mo36277f()));
                    C6661h.m20330a(bVar, t.mo36399i(), this.f16713v);
                    this.f16702k.mo36678a((CopyOnWriteArrayList<C6560aa>) this.f16708q, this.f16714w, t.mo36399i(), this.f16713v, bVar);
                    if (!this.f16695d.mo36656h().f17687s) {
                        m19664a(t2, bVar);
                    }
                } else {
                    String k = t.mo36401k();
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId = " + this.f16709r);
                    m19661a((int) IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            if (this.f16706o == C6515R.C6521a.LOADING) {
                if (m19675j()) {
                    this.f16697f.mo36103a(false);
                    objArr = new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16716y))}};
                } else {
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}, new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16716y))}};
                }
                m19661a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (m19675j()) {
                    this.f16697f.mo36103a(true);
                }
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                m19661a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16716y))}});
            }
            String f = mo36277f();
            C6774k.m20618f(ContextProvider.getInstance().getCurrentActiveActivity(), f);
            if (C6774k.m20612b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), f)) {
                m19661a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            C6782o.m20647a().mo36988a(3);
            mo36267a(C6515R.C6521a.LOADED);
            this.f16696e.mo36645a(this);
        } else {
            IronLog ironLog4 = IronLog.INTERNAL;
            ironLog4.warning("wrong state - mCurrentState = " + this.f16706o);
        }
    }

    /* renamed from: a */
    public final void mo36270a(IronSourceError ironSourceError, C6523T t) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (t.f16734a != this.f16709r) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + t.f16734a + " and the current id is " + this.f16709r);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
            t.mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + t.f16734a + " State - " + this.f16706o}, new Object[]{IronSourceConstants.EVENTS_EXT1, t.mo36401k()}});
        } else if (m19677l()) {
            this.f16704m.put(t.mo36401k(), C6663i.C6664a.ISAuctionPerformanceFailedToLoad);
            m19672g();
        } else {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.warning("wrong state - mCurrentState = " + this.f16706o);
        }
    }

    /* renamed from: a */
    public final void mo36182a(List<C6758b> list, String str, C6758b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (m19678m()) {
            this.f16711t = "";
            this.f16709r = str;
            this.f16712u = i;
            this.f16713v = bVar;
            this.f16710s = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                m19661a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
            }
            mo36843a(jSONObject2, IronSource.AD_UNIT.BANNER);
            if (this.f17575a.mo36955a(IronSource.AD_UNIT.BANNER)) {
                m19661a((int) IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}});
                mo36267a(C6515R.C6521a.READY_TO_LOAD);
                C6682l.m20363a().mo36722a(this.f16697f, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"), false);
                return;
            }
            m19661a((int) IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            mo36267a(this.f16706o == C6515R.C6521a.FIRST_AUCTION ? C6515R.C6521a.LOADING : C6515R.C6521a.RELOADING);
            m19661a((int) IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m19670c(list)}});
            m19672g();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mCurrentState = " + this.f16706o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36271a(C6521a aVar, C6521a aVar2) {
        boolean z;
        synchronized (this.f16715x) {
            if (this.f16706o == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.f16706o + "' to '" + aVar2 + "'");
                z = true;
                this.f16706o = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo36272b(C6523T t) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(t.mo36406p());
        if (m19675j()) {
            C6675k.m20355a().mo36712b(this.f17577c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36265a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, t.mo36403m());
    }

    /* renamed from: c */
    public final void mo36273c(C6523T t) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(t.mo36406p());
        if (m19675j()) {
            C6675k.m20355a().mo36709a(this.f17577c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36265a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, t.mo36403m());
    }

    /* renamed from: d */
    public final void mo36274d(C6523T t) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(t.mo36406p());
        if (m19675j()) {
            C6675k.m20355a().mo36713c(this.f17577c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36265a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, t.mo36403m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo36275e() {
        IronLog.INTERNAL.verbose("");
        AsyncTask.execute(new Runnable() {
            public final void run() {
                boolean z;
                C6515R r = C6515R.this;
                if (!r.f16704m.isEmpty()) {
                    r.f16703l.mo36681a(r.f16704m);
                    r.f16704m.clear();
                }
                C6515R r2 = C6515R.this;
                long d = r2.f16695d.mo36652d() - (new Date().getTime() - r2.f16705n);
                if (d > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + d);
                    new Timer().schedule(new TimerTask() {
                        public final void run() {
                            C6515R.this.mo36275e();
                        }
                    }, d);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C6515R.this.mo36264a((int) IronSourceConstants.BN_AUCTION_REQUEST);
                    C6711o.m20431a(C6515R.this.mo36277f(), C6515R.this.f16701j, new C6711o.C6712a() {
                        /* renamed from: a */
                        public final void mo36281a(Map<String, Object> map, List<String> list, StringBuilder sb) {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("auction waterfallString = " + sb);
                            if (map.size() == 0 && list.size() == 0) {
                                C6515R.this.m19661a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
                                if (C6515R.this.mo36271a(C6515R.C6521a.AUCTION, C6515R.C6521a.LOADED)) {
                                    C6515R.this.f16696e.mo36645a(C6515R.this);
                                    return;
                                }
                                C6682l.m20363a().mo36722a(C6515R.this.f16697f, new IronSourceError(1005, "No candidates available for auctioning"), false);
                                C6515R.this.m19661a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
                                C6515R.this.mo36267a(C6515R.C6521a.READY_TO_LOAD);
                                return;
                            }
                            C6515R.this.m19661a((int) IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
                            if (C6515R.this.f16702k != null) {
                                C6661h hVar = C6515R.this.f16702k;
                                Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                                C6663i iVar = C6515R.this.f16703l;
                                int i = C6515R.this.f16700i;
                                IronSourceSegment ironSourceSegment = C6515R.this.f17576b;
                                hVar.f17312a = C6515R.m19660a(C6515R.this);
                                hVar.mo36677a(applicationContext, map, list, iVar, i, ironSourceSegment);
                                return;
                            }
                            IronLog.INTERNAL.error("mAuctionHandler is null");
                        }
                    });
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo36276e(C6523T t) {
        C6758b bVar;
        IronLog.INTERNAL.verbose(t.mo36406p());
        if (m19679n()) {
            if (this.f16695d.mo36651c() && this.f16695d.mo36656h().f17687s && (bVar = this.f16714w.get(t.mo36401k())) != null) {
                m19664a(t, bVar);
            }
            m19661a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mCurrentState = " + this.f16706o);
        String k = t.mo36401k();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        m19661a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f16706o}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo36277f() {
        C6696f fVar = this.f16698g;
        return fVar != null ? fVar.getPlacementName() : "";
    }
}
