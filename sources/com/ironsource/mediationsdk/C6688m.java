package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6708n;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6696f;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.sdk.C6719a;
import com.ironsource.mediationsdk.utils.C6769f;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.m */
public final class C6688m implements C6719a {

    /* renamed from: a */
    private C6708n f17426a;

    /* renamed from: b */
    private IronSourceBannerLayout f17427b;

    /* renamed from: c */
    private C6696f f17428c;

    /* renamed from: d */
    private C6690a f17429d = C6690a.NOT_INITIATED;

    /* renamed from: e */
    private IronSourceLoggerManager f17430e = IronSourceLoggerManager.getLogger();

    /* renamed from: f */
    private String f17431f;

    /* renamed from: g */
    private String f17432g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<C6708n> f17433h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private long f17434i;

    /* renamed from: j */
    private Timer f17435j;

    /* renamed from: k */
    private AtomicBoolean f17436k = new AtomicBoolean();

    /* renamed from: l */
    private AtomicBoolean f17437l = new AtomicBoolean();

    /* renamed from: m */
    private C6769f f17438m;

    /* renamed from: n */
    private C6769f f17439n;

    /* renamed from: o */
    private int f17440o;

    /* renamed from: p */
    private int f17441p;

    /* renamed from: com.ironsource.mediationsdk.m$a */
    enum C6690a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C6688m(List<NetworkSettings> list, String str, String str2, long j, int i, int i2) {
        this.f17431f = str;
        this.f17432g = str2;
        this.f17434i = (long) i;
        C6682l.m20363a().f17404a = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            NetworkSettings networkSettings = list.get(i3);
            AbstractAdapter a = C6653d.m20285a().mo36662a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a == null || !C6655e.m20304a().mo36669a(a)) {
                m20381a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.f17433h.add(new C6708n(this, networkSettings, a, j, i3 + 1));
            }
        }
        this.f17428c = null;
        m20379a(C6690a.READY_TO_LOAD);
    }

    /* renamed from: a */
    private void m20373a(int i) {
        m20377a(i, (Object[][]) null);
    }

    /* renamed from: a */
    private void m20374a(int i, C6708n nVar) {
        m20375a(i, nVar, (Object[][]) null);
    }

    /* renamed from: a */
    private void m20375a(int i, C6708n nVar, Object[][] objArr) {
        m20376a(i, nVar, objArr, this.f17441p);
    }

    /* renamed from: a */
    private void m20376a(int i, C6708n nVar, Object[][] objArr, int i2) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(nVar);
        try {
            if (this.f17427b != null) {
                m20382a(providerAdditionalData, this.f17427b.getSize());
            }
            if (this.f17428c != null) {
                providerAdditionalData.put("placement", this.f17428c.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f17430e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
        C6553d.m19930d().mo36371b(new C6552c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m20377a(int i, Object[][] objArr) {
        m20378a(i, objArr, this.f17441p);
    }

    /* renamed from: a */
    private void m20378a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (this.f17427b != null) {
                m20382a(mediationAdditionalData, this.f17427b.getSize());
            }
            if (this.f17428c != null) {
                mediationAdditionalData.put("placement", this.f17428c.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f17430e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e), 3);
        }
        C6553d.m19930d().mo36371b(new C6552c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private void m20379a(C6690a aVar) {
        this.f17429d = aVar;
        m20381a("state=" + aVar.name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m20380a(com.ironsource.mediationsdk.C6688m r8) {
        /*
            com.ironsource.mediationsdk.m$a r0 = r8.f17429d
            com.ironsource.mediationsdk.m$a r1 = com.ironsource.mediationsdk.C6688m.C6690a.RELOAD_IN_PROGRESS
            if (r0 == r1) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReloadTimer wrong state="
            r0.<init>(r1)
            com.ironsource.mediationsdk.m$a r1 = r8.f17429d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.m20381a((java.lang.String) r0)
            return
        L_0x001e:
            r0 = 0
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r2 = "checking with IronsourceLifecycleManager if app in foreground"
            r1.verbose(r2)
            com.ironsource.lifecycle.d r1 = com.ironsource.lifecycle.C6443d.m19366a()
            boolean r1 = r1.mo35958b()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00e1
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f17427b
            java.lang.String r4 = "banner is null"
            if (r1 != 0) goto L_0x003f
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r4)
        L_0x003d:
            r1 = r3
            goto L_0x0078
        L_0x003f:
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x004d
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0049:
            r1.verbose(r5)
            goto L_0x003d
        L_0x004d:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f17427b
            boolean r1 = r1.hasWindowFocus()
            if (r1 != 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner has no window focus"
            goto L_0x0049
        L_0x005a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r8.f17427b
            boolean r1 = r5.getGlobalVisibleRect(r1)
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "visible = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.verbose(r6)
        L_0x0078:
            if (r1 == 0) goto L_0x00de
            com.ironsource.mediationsdk.utils.o r1 = com.ironsource.mediationsdk.utils.C6782o.m20647a()
            r5 = 3
            int r1 = r1.mo36990b((int) r5)
            r8.f17441p = r1
            r1 = 3011(0xbc3, float:4.22E-42)
            r8.m20373a((int) r1)
            r1 = 3012(0xbc4, float:4.221E-42)
            com.ironsource.mediationsdk.n r5 = r8.f17426a
            r8.m20374a((int) r1, (com.ironsource.mediationsdk.C6708n) r5)
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f17438m = r1
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f17439n = r1
            com.ironsource.mediationsdk.n r1 = r8.f17426a
            java.lang.String r5 = "reloadBanner()"
            r1.mo36834a((java.lang.String) r5)
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17562e
            if (r5 == 0) goto L_0x00c9
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17562e
            boolean r5 = r5.isDestroyed()
            if (r5 == 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            r1.mo36835b()
            com.ironsource.mediationsdk.n$a r4 = com.ironsource.mediationsdk.C6708n.C6710a.LOADED
            r1.mo36833a((com.ironsource.mediationsdk.C6708n.C6710a) r4)
            com.ironsource.mediationsdk.AbstractAdapter r4 = r1.f17558a
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17562e
            com.ironsource.mediationsdk.model.NetworkSettings r6 = r1.f17559b
            org.json.JSONObject r6 = r6.getBannerSettings()
            r4.reloadBanner(r5, r6, r1)
            goto L_0x00dc
        L_0x00c9:
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17562e
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r4 = "banner is destroyed"
        L_0x00d0:
            com.ironsource.mediationsdk.sdk.a r5 = r1.f17560c
            com.ironsource.mediationsdk.logger.IronSourceError r6 = new com.ironsource.mediationsdk.logger.IronSourceError
            r7 = 610(0x262, float:8.55E-43)
            r6.<init>(r7, r4)
            r5.mo36748a((com.ironsource.mediationsdk.logger.IronSourceError) r6, (com.ironsource.mediationsdk.C6708n) r1, (boolean) r3)
        L_0x00dc:
            r1 = r3
            goto L_0x00e4
        L_0x00de:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x00e3:
            r1 = r2
        L_0x00e4:
            if (r1 == 0) goto L_0x0106
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            r1[r3] = r4
            r8.m20377a((int) r0, (java.lang.Object[][]) r1)
            r8.m20388d()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6688m.m20380a(com.ironsource.mediationsdk.m):void");
    }

    /* renamed from: a */
    private void m20381a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f17430e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    /* renamed from: a */
    private void m20382a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
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
        } catch (Exception e) {
            this.f17430e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
    }

    /* renamed from: a */
    private boolean m20383a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f17427b;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: b */
    private void m20384b() {
        Iterator<C6708n> it = this.f17433h.iterator();
        while (it.hasNext()) {
            it.next().f17561d = true;
        }
    }

    /* renamed from: b */
    private void m20385b(C6708n nVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.f17426a = nVar;
        this.f17427b.mo36101a(view, layoutParams);
    }

    /* renamed from: b */
    private void m20386b(C6708n nVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + nVar.mo36831a());
        m20375a((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, nVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17439n))}});
        m20377a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17438m))}});
        this.f17440o = C6782o.m20647a().mo36990b(3);
        C6782o.m20647a().mo36988a(3);
        if (z) {
            m20385b(nVar, view, layoutParams);
        }
        m20388d();
    }

    /* renamed from: c */
    private boolean m20387c() {
        Iterator<C6708n> it = this.f17433h.iterator();
        while (it.hasNext()) {
            C6708n next = it.next();
            if (next.f17561d && this.f17426a != next) {
                m20375a(this.f17429d == C6690a.FIRST_LOAD_IN_PROGRESS ? 3002 : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.f17439n = new C6769f();
                next.mo36832a(this.f17427b.mo36100a(), this.f17431f, this.f17432g);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m20388d() {
        try {
            m20389e();
            if (this.f17434i > 0) {
                Timer timer = new Timer();
                this.f17435j = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        C6688m.m20380a(C6688m.this);
                    }
                }, this.f17434i * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m20389e() {
        Timer timer = this.f17435j;
        if (timer != null) {
            timer.cancel();
            this.f17435j = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36746a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f17430e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.f17430e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            m20378a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, this.f17440o);
            m20389e();
            if (this.f17426a != null) {
                m20375a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.f17426a, (Object[][]) null);
                C6708n nVar = this.f17426a;
                nVar.mo36834a("destroyBanner()");
                if (nVar.f17558a == null) {
                    nVar.mo36834a("destroyBanner() mAdapter == null");
                } else {
                    nVar.f17558a.destroyBanner(nVar.f17559b.getBannerSettings());
                    nVar.mo36833a(C6708n.C6710a.DESTROYED);
                }
                this.f17426a = null;
            }
            ironSourceBannerLayout.mo36104b();
            this.f17427b = null;
            this.f17428c = null;
            m20379a(C6690a.READY_TO_LOAD);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36747a(IronSourceBannerLayout ironSourceBannerLayout, C6696f fVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (fVar != null) {
                        if (!TextUtils.isEmpty(fVar.getPlacementName())) {
                            if (this.f17429d == C6690a.READY_TO_LOAD) {
                                if (!C6682l.m20363a().mo36724b()) {
                                    this.f17441p = C6782o.m20647a().mo36990b(3);
                                    m20379a(C6690a.FIRST_LOAD_IN_PROGRESS);
                                    this.f17427b = ironSourceBannerLayout;
                                    this.f17428c = fVar;
                                    m20377a(3001, (Object[][]) null);
                                    if (C6774k.m20612b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), fVar.getPlacementName())) {
                                        C6682l a = C6682l.m20363a();
                                        a.mo36721a(ironSourceBannerLayout, new IronSourceError(604, "placement " + fVar.getPlacementName() + " is capped"));
                                        m20377a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                                        m20379a(C6690a.READY_TO_LOAD);
                                        return;
                                    }
                                    this.f17438m = new C6769f();
                                    Iterator<C6708n> it = this.f17433h.iterator();
                                    while (it.hasNext()) {
                                        it.next().f17561d = true;
                                    }
                                    this.f17439n = new C6769f();
                                    C6708n nVar = this.f17433h.get(0);
                                    m20375a(3002, nVar, (Object[][]) null);
                                    nVar.mo36832a(ironSourceBannerLayout.mo36100a(), this.f17431f, this.f17432g);
                                    return;
                                }
                            }
                            this.f17430e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = fVar == null ? "placement is null" : "placement name is empty";
                    this.f17430e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e) {
                C6682l a2 = C6682l.m20363a();
                a2.mo36722a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, "loadBanner() failed " + e.getMessage()), false);
                m20377a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_EXCEPTION)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
                m20379a(C6690a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f17430e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    /* renamed from: a */
    public final void mo36748a(IronSourceError ironSourceError, C6708n nVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + nVar.mo36831a());
        if (this.f17429d == C6690a.FIRST_LOAD_IN_PROGRESS || this.f17429d == C6690a.LOAD_IN_PROGRESS) {
            if (z) {
                m20375a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, nVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17439n))}});
            } else {
                m20375a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, nVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17439n))}});
            }
            if (!m20387c()) {
                if (this.f17429d == C6690a.FIRST_LOAD_IN_PROGRESS) {
                    C6682l.m20363a().mo36722a(this.f17427b, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, "No ads to show"), false);
                    m20377a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17438m))}});
                    m20379a(C6690a.READY_TO_LOAD);
                    return;
                }
                m20377a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17438m))}});
                m20379a(C6690a.RELOAD_IN_PROGRESS);
                m20388d();
                return;
            }
            return;
        }
        m20381a("onBannerAdLoadFailed " + nVar.mo36831a() + " wrong state=" + this.f17429d.name());
    }

    /* renamed from: a */
    public final void mo36749a(C6708n nVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + nVar.mo36831a());
        Object[][] objArr = null;
        if (m20383a()) {
            C6675k.m20355a().mo36714d((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20378a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.f17440o);
        m20376a((int) IronSourceConstants.BN_INSTANCE_CLICK, nVar, objArr, this.f17440o);
    }

    /* renamed from: a */
    public final void mo36750a(C6708n nVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + nVar.mo36831a());
        if (this.f17429d == C6690a.FIRST_LOAD_IN_PROGRESS) {
            m20375a((int) IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, nVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17439n))}});
            m20385b(nVar, view, layoutParams);
            C6696f fVar = this.f17428c;
            String placementName = fVar != null ? fVar.getPlacementName() : "";
            C6774k.m20618f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
            if (C6774k.m20612b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
                m20377a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            m20377a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17438m))}});
            this.f17427b.mo36103a(false);
            this.f17440o = C6782o.m20647a().mo36990b(3);
            C6782o.m20647a().mo36988a(3);
            m20379a(C6690a.RELOAD_IN_PROGRESS);
            m20388d();
        } else if (this.f17429d == C6690a.LOAD_IN_PROGRESS) {
            m20379a(C6690a.RELOAD_IN_PROGRESS);
            m20386b(nVar, view, layoutParams, true);
        } else {
            m20375a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, nVar, (Object[][]) null);
        }
    }

    /* renamed from: a */
    public final void mo36751a(C6708n nVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + nVar.mo36831a());
        if (this.f17429d != C6690a.RELOAD_IN_PROGRESS) {
            m20381a("onBannerAdReloaded " + nVar.mo36831a() + " wrong state=" + this.f17429d.name());
            m20375a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, nVar, (Object[][]) null);
            return;
        }
        IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
        m20386b(nVar, view, layoutParams, z);
    }

    /* renamed from: b */
    public final void mo36752b(IronSourceError ironSourceError, C6708n nVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + nVar.mo36831a());
        if (this.f17429d != C6690a.RELOAD_IN_PROGRESS) {
            m20381a("onBannerAdReloadFailed " + nVar.mo36831a() + " wrong state=" + this.f17429d.name());
            return;
        }
        if (z) {
            m20375a((int) IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, nVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17439n))}});
        } else {
            m20375a((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, nVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17439n))}});
        }
        if (this.f17433h.size() == 1) {
            m20377a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f17438m))}});
            m20388d();
            return;
        }
        m20379a(C6690a.LOAD_IN_PROGRESS);
        m20384b();
        m20387c();
    }

    /* renamed from: b */
    public final void mo36753b(C6708n nVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + nVar.mo36831a());
        Object[][] objArr = null;
        if (m20383a()) {
            C6675k.m20355a().mo36712b((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20378a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.f17440o);
        m20376a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, nVar, objArr, this.f17440o);
    }

    /* renamed from: c */
    public final void mo36754c(C6708n nVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + nVar.mo36831a());
        Object[][] objArr = null;
        if (m20383a()) {
            C6675k.m20355a().mo36709a((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20378a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.f17440o);
        m20376a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, nVar, objArr, this.f17440o);
    }

    /* renamed from: d */
    public final void mo36755d(C6708n nVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + nVar.mo36831a());
        Object[][] objArr = null;
        if (m20383a()) {
            C6675k.m20355a().mo36713c((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20378a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.f17440o);
        m20376a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, nVar, objArr, this.f17440o);
    }

    /* renamed from: e */
    public final void mo36756e(C6708n nVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + nVar.mo36831a());
        m20377a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        m20375a((int) IronSourceConstants.BN_INSTANCE_SHOW, nVar, (Object[][]) null);
    }
}
