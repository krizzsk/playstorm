package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C6719a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.n */
public final class C6708n implements BannerSmashListener {

    /* renamed from: a */
    public AbstractAdapter f17558a;

    /* renamed from: b */
    public NetworkSettings f17559b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public C6719a f17560c;

    /* renamed from: d */
    boolean f17561d;

    /* renamed from: e */
    IronSourceBannerLayout f17562e;

    /* renamed from: f */
    public int f17563f;

    /* renamed from: g */
    private Timer f17564g;

    /* renamed from: h */
    private long f17565h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6710a f17566i = C6710a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.n$a */
    public enum C6710a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C6708n(C6719a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i) {
        this.f17563f = i;
        this.f17560c = aVar;
        this.f17558a = abstractAdapter;
        this.f17559b = networkSettings;
        this.f17565h = j;
        abstractAdapter.addBannerListener(this);
    }

    /* renamed from: a */
    private void m20420a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + mo36831a() + " | " + str2, 3);
    }

    /* renamed from: c */
    private void m20422c() {
        if (this.f17558a != null) {
            try {
                String str = C6490J.m19474a().f16546l;
                if (!TextUtils.isEmpty(str)) {
                    this.f17558a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f17558a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                mo36834a(":setCustomParams():" + e.toString());
            }
        }
    }

    /* renamed from: d */
    private void m20423d() {
        try {
            if (this.f17564g != null) {
                this.f17564g.cancel();
            }
        } catch (Exception e) {
            m20420a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f17564g = null;
        }
    }

    /* renamed from: a */
    public final String mo36831a() {
        return this.f17559b.isMultipleInstances() ? this.f17559b.getProviderTypeForReflection() : this.f17559b.getProviderName();
    }

    /* renamed from: a */
    public final void mo36832a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        mo36834a("loadBanner");
        this.f17561d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo36834a("loadBanner - bannerLayout is null or destroyed");
            this.f17560c.mo36748a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.f17558a == null) {
            mo36834a("loadBanner - mAdapter is null");
            this.f17560c.mo36748a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false);
        } else {
            this.f17562e = ironSourceBannerLayout;
            mo36835b();
            if (this.f17566i == C6710a.NO_INIT) {
                mo36833a(C6710a.INIT_IN_PROGRESS);
                m20422c();
                this.f17558a.initBanners(str, str2, this.f17559b.getBannerSettings(), this);
                return;
            }
            mo36833a(C6710a.LOAD_IN_PROGRESS);
            this.f17558a.loadBanner(ironSourceBannerLayout, this.f17559b.getBannerSettings(), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36833a(C6710a aVar) {
        this.f17566i = aVar;
        mo36834a("state=" + aVar.name());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36834a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + mo36831a() + " " + str, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36835b() {
        try {
            m20423d();
            Timer timer = new Timer();
            this.f17564g = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6719a b;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C6708n.this.f17566i == C6710a.INIT_IN_PROGRESS) {
                        C6708n.this.mo36833a(C6710a.NO_INIT);
                        C6708n.this.mo36834a("init timed out");
                        b = C6708n.this.f17560c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
                    } else if (C6708n.this.f17566i == C6710a.LOAD_IN_PROGRESS) {
                        C6708n.this.mo36833a(C6710a.LOAD_FAILED);
                        C6708n.this.mo36834a("load timed out");
                        b = C6708n.this.f17560c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
                    } else if (C6708n.this.f17566i == C6710a.LOADED) {
                        C6708n.this.mo36833a(C6710a.LOAD_FAILED);
                        C6708n.this.mo36834a("reload timed out");
                        C6708n.this.f17560c.mo36752b(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "Timed out"), C6708n.this, false);
                        return;
                    } else {
                        return;
                    }
                    b.mo36748a(ironSourceError, C6708n.this, false);
                }
            }, this.f17565h);
        } catch (Exception e) {
            m20420a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    public final void onBannerAdClicked() {
        C6719a aVar = this.f17560c;
        if (aVar != null) {
            aVar.mo36749a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C6719a aVar = this.f17560c;
        if (aVar != null) {
            aVar.mo36755d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        mo36834a("onBannerAdLoadFailed()");
        m20423d();
        boolean z = ironSourceError.getErrorCode() == 606;
        if (this.f17566i == C6710a.LOAD_IN_PROGRESS) {
            mo36833a(C6710a.LOAD_FAILED);
            this.f17560c.mo36748a(ironSourceError, this, z);
        } else if (this.f17566i == C6710a.LOADED) {
            this.f17560c.mo36752b(ironSourceError, this, z);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        mo36834a("onBannerAdLoaded()");
        m20423d();
        if (this.f17566i == C6710a.LOAD_IN_PROGRESS) {
            mo36833a(C6710a.LOADED);
            this.f17560c.mo36750a(this, view, layoutParams);
        } else if (this.f17566i == C6710a.LOADED) {
            this.f17560c.mo36751a(this, view, layoutParams, this.f17558a.shouldBindBannerViewOnReload());
        }
    }

    public final void onBannerAdScreenDismissed() {
        C6719a aVar = this.f17560c;
        if (aVar != null) {
            aVar.mo36753b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C6719a aVar = this.f17560c;
        if (aVar != null) {
            aVar.mo36754c(this);
        }
    }

    public final void onBannerAdShown() {
        C6719a aVar = this.f17560c;
        if (aVar != null) {
            aVar.mo36756e(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        m20423d();
        if (this.f17566i == C6710a.INIT_IN_PROGRESS) {
            this.f17560c.mo36748a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this, false);
            mo36833a(C6710a.NO_INIT);
        }
    }

    public final void onBannerInitSuccess() {
        m20423d();
        if (this.f17566i == C6710a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f17562e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.f17560c.mo36748a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f17562e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            mo36835b();
            mo36833a(C6710a.LOAD_IN_PROGRESS);
            this.f17558a.loadBanner(this.f17562e, this.f17559b.getBannerSettings(), this);
        }
    }
}
