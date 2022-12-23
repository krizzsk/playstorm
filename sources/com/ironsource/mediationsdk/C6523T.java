package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.C6696f;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.p216b.C6648c;
import com.ironsource.mediationsdk.p217c.C6652b;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.C6769f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.T */
public final class C6523T extends C6560aa implements C6648c.C6649a, BannerSmashListener {

    /* renamed from: a */
    String f16734a;

    /* renamed from: b */
    private C6652b f16735b;

    /* renamed from: j */
    private C6648c f16736j;

    /* renamed from: k */
    private C6524a f16737k;

    /* renamed from: l */
    private C6522S f16738l;

    /* renamed from: m */
    private IronSourceBannerLayout f16739m;

    /* renamed from: n */
    private JSONObject f16740n;

    /* renamed from: o */
    private int f16741o;

    /* renamed from: p */
    private String f16742p;

    /* renamed from: q */
    private C6696f f16743q;

    /* renamed from: r */
    private final Object f16744r;

    /* renamed from: s */
    private C6769f f16745s;

    /* renamed from: t */
    private boolean f16746t;

    /* renamed from: com.ironsource.mediationsdk.T$a */
    public enum C6524a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C6523T(C6652b bVar, C6522S s, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C6691a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f16744r = new Object();
        this.f16737k = C6524a.NONE;
        this.f16735b = bVar;
        this.f16736j = new C6648c(bVar.mo36654f());
        this.f16738l = s;
        this.f16975h = i;
        this.f16734a = str;
        this.f16741o = i2;
        this.f16742p = str2;
        this.f16740n = jSONObject;
        this.f16746t = z;
        this.f16970c.addBannerListener(this);
        if (mo36398h()) {
            m19717f();
        }
    }

    C6523T(C6652b bVar, C6522S s, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, s, networkSettings, abstractAdapter, i, "", (JSONObject) null, 0, "", z);
    }

    /* renamed from: a */
    private void m19710a(C6524a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19720r() + "state = " + aVar.name());
        synchronized (this.f16744r) {
            this.f16737k = aVar;
        }
    }

    /* renamed from: a */
    private void m19711a(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            mo36284a(this.f16746t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16745s))}});
        } else {
            mo36284a(this.f16746t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16745s))}});
        }
        C6522S s = this.f16738l;
        if (s != null) {
            s.mo36270a(ironSourceError, this);
        }
    }

    /* renamed from: a */
    private void m19712a(String str) {
        IronLog.INTERNAL.verbose(mo36406p());
        if (m19715a(C6524a.READY_TO_LOAD, C6524a.LOADING)) {
            this.f16745s = new C6769f();
            mo36284a(this.f16746t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002, (Object[][]) null);
            if (this.f16970c != null) {
                try {
                    if (mo36398h()) {
                        this.f16970c.loadBannerForBidding(this.f16739m, this.f16973f, this, str);
                    } else {
                        this.f16970c.loadBanner(this.f16739m, this.f16973f, this);
                    }
                } catch (Exception e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("Exception while trying to load banner from " + this.f16970c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                    e.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, e.getLocalizedMessage()));
                    mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
                }
            }
        } else {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("wrong state - state = " + this.f16737k);
        }
    }

    /* renamed from: a */
    private static void m19713a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
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
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c == 3) {
                i = 5;
            } else if (c == 4) {
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                return;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    private static boolean m19714a(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    /* renamed from: a */
    private boolean m19715a(C6524a aVar, C6524a aVar2) {
        boolean z;
        synchronized (this.f16744r) {
            if (this.f16737k == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(m19720r() + "set state from '" + this.f16737k + "' to '" + aVar2 + "'");
                z = true;
                this.f16737k = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m19716b(int i) {
        mo36284a(i, (Object[][]) null);
    }

    /* renamed from: f */
    private void m19717f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19720r() + "isBidder = " + mo36398h());
        m19710a(C6524a.INIT_IN_PROGRESS);
        m19718g();
        try {
            if (this.f16970c == null) {
                return;
            }
            if (mo36398h()) {
                this.f16970c.initBannerForBidding(this.f16735b.mo36649a(), this.f16735b.mo36650b(), this.f16973f, this);
            } else {
                this.f16970c.initBanners(this.f16735b.mo36649a(), this.f16735b.mo36650b(), this.f16973f, this);
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to init banner from " + this.f16970c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, th.getLocalizedMessage()));
            mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
        }
    }

    /* renamed from: g */
    private void m19718g() {
        if (this.f16970c != null) {
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
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("Exception while trying to set custom params from " + this.f16970c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                e.printStackTrace();
                mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: q */
    private boolean m19719q() {
        boolean z;
        synchronized (this.f16744r) {
            z = this.f16737k == C6524a.LOADED;
        }
        return z;
    }

    /* renamed from: r */
    private String m19720r() {
        return String.format("%s - ", new Object[]{mo36406p()});
    }

    /* renamed from: s */
    private boolean m19721s() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16739m;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public final void mo36195a() {
        IronLog.INTERNAL.verbose(mo36406p());
        m19710a(C6524a.DESTROYED);
        if (this.f16970c == null) {
            IronLog.INTERNAL.warning("mAdapter == null");
            return;
        }
        try {
            this.f16970c.destroyBanner(this.f16971d.f17477a.getBannerSettings());
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to destroy banner from " + this.f16970c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
            e.printStackTrace();
            mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
        }
        m19716b(IronSourceConstants.BN_INSTANCE_DESTROY);
    }

    /* renamed from: a */
    public final void mo36284a(int i, Object[][] objArr) {
        Map<String, Object> n = mo36404n();
        if (m19721s()) {
            n.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            m19713a(n, this.f16739m.getSize());
        }
        if (!TextUtils.isEmpty(this.f16734a)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f16734a);
        }
        JSONObject jSONObject = this.f16740n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16740n);
        }
        C6696f fVar = this.f16743q;
        if (fVar != null) {
            n.put("placement", fVar.getPlacementName());
        }
        if (m19714a(i)) {
            C6553d.m19930d();
            C6553d.m19888a(n, this.f16741o, this.f16742p);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16975h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(mo36401k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        C6553d.m19930d().mo36371b(new C6552c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    public final void mo36285a(IronSourceBannerLayout ironSourceBannerLayout, C6696f fVar, String str) {
        C6522S s;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo36406p());
        this.f16743q = fVar;
        if (!C6711o.m20432a(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            IronLog.INTERNAL.verbose(str2);
            s = this.f16738l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, str2);
        } else if (this.f16970c == null) {
            IronLog.INTERNAL.verbose("mAdapter is null");
            s = this.f16738l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        } else {
            this.f16739m = ironSourceBannerLayout;
            this.f16736j.mo36647a(this);
            try {
                if (mo36398h()) {
                    m19712a(str);
                    return;
                } else {
                    m19717f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                return;
            }
        }
        s.mo36270a(ironSourceError, this);
    }

    /* renamed from: b */
    public final void mo36286b() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo36406p());
        if (m19715a(C6524a.INIT_IN_PROGRESS, C6524a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (m19715a(C6524a.LOADING, C6524a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("unexpected state - " + this.f16737k);
            return;
        }
        m19711a(ironSourceError);
    }

    /* renamed from: c */
    public final Map<String, Object> mo36287c() {
        try {
            if (!mo36398h() || this.f16970c == null) {
                return null;
            }
            return this.f16970c.getBannerBiddingData(this.f16973f);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to getBannerBiddingData from " + this.f16970c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: d */
    public final void mo36288d() {
        this.f16736j.mo36643c();
        super.mo36288d();
    }

    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(mo36406p());
        mo36284a((int) IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        C6522S s = this.f16738l;
        if (s != null) {
            s.mo36268a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(mo36406p());
        mo36284a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        C6522S s = this.f16738l;
        if (s != null) {
            s.mo36274d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19720r() + "error = " + ironSourceError);
        this.f16736j.mo36648d();
        if (m19715a(C6524a.LOADING, C6524a.LOAD_FAILED)) {
            m19711a(ironSourceError);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(mo36406p());
        this.f16736j.mo36648d();
        if (m19715a(C6524a.LOADING, C6524a.LOADED)) {
            mo36284a(this.f16746t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6769f.m20576a(this.f16745s))}});
            C6522S s = this.f16738l;
            if (s != null) {
                s.mo36269a(this, view, layoutParams);
                return;
            }
            return;
        }
        mo36284a(this.f16746t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(mo36406p());
        mo36284a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        C6522S s = this.f16738l;
        if (s != null) {
            s.mo36272b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(mo36406p());
        mo36284a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        C6522S s = this.f16738l;
        if (s != null) {
            s.mo36273c(this);
        }
    }

    public final void onBannerAdShown() {
        IronLog.INTERNAL.verbose(mo36406p());
        if (m19719q()) {
            mo36284a((int) IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            C6522S s = this.f16738l;
            if (s != null) {
                s.mo36276e(this);
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mState = " + this.f16737k);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        mo36284a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f16737k}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo36401k()}});
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19720r() + "error = " + ironSourceError);
        this.f16736j.mo36648d();
        if (m19715a(C6524a.INIT_IN_PROGRESS, C6524a.NONE)) {
            C6522S s = this.f16738l;
            if (s != null) {
                s.mo36270a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this);
                return;
            }
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mState = " + this.f16737k);
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(mo36406p());
        if (m19715a(C6524a.INIT_IN_PROGRESS, C6524a.READY_TO_LOAD) && !mo36398h()) {
            if (!C6711o.m20432a(this.f16739m)) {
                this.f16738l.mo36270a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f16739m == null ? "banner is null" : "banner is destroyed"), this);
            } else {
                m19712a((String) null);
            }
        }
    }
}
