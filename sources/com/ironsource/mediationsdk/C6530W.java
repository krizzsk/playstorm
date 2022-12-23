package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C6642b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.W */
public final class C6530W extends C6560aa implements InterstitialSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6532a f16785a = C6532a.NO_INIT;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6529V f16786b;

    /* renamed from: j */
    private Timer f16787j;

    /* renamed from: k */
    private int f16788k;

    /* renamed from: l */
    private String f16789l;

    /* renamed from: m */
    private String f16790m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f16791n;

    /* renamed from: o */
    private final Object f16792o = new Object();

    /* renamed from: com.ironsource.mediationsdk.W$a */
    public enum C6532a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public C6530W(String str, String str2, NetworkSettings networkSettings, C6529V v, int i, AbstractAdapter abstractAdapter) {
        super(new C6691a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f16789l = str;
        this.f16790m = str2;
        this.f16786b = v;
        this.f16787j = null;
        this.f16788k = i;
        this.f16970c.addInterstitialListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19778a(C6532a aVar) {
        m19784d("current state=" + this.f16785a + ", new state=" + aVar);
        this.f16785a = aVar;
    }

    /* renamed from: c */
    private void m19783c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + mo36401k() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19784d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo36401k() + " : " + str, 0);
    }

    /* renamed from: e */
    private void m19785e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo36401k() + " : " + str, 3);
    }

    /* renamed from: q */
    private void m19786q() {
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
            m19784d("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: r */
    private void m19787r() {
        synchronized (this.f16792o) {
            if (this.f16787j != null) {
                this.f16787j.cancel();
                this.f16787j = null;
            }
        }
    }

    /* renamed from: s */
    private void m19788s() {
        synchronized (this.f16792o) {
            m19784d("start timer");
            m19787r();
            Timer timer = new Timer();
            this.f16787j = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6530W w = C6530W.this;
                    w.m19784d("timed out state=" + C6530W.this.f16785a.name() + " isBidder=" + C6530W.this.mo36398h());
                    if (C6530W.this.f16785a != C6532a.INIT_IN_PROGRESS || !C6530W.this.mo36398h()) {
                        C6530W.this.m19778a(C6532a.LOAD_FAILED);
                        C6530W.this.f16786b.mo36303a(ErrorBuilder.buildLoadFailedError("timed out"), C6530W.this, new Date().getTime() - C6530W.this.f16791n);
                        return;
                    }
                    C6530W.this.m19778a(C6532a.NO_INIT);
                }
            }, (long) (this.f16788k * 1000));
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo36195a() {
        try {
            if (mo36398h()) {
                return this.f16970c.getInterstitialBiddingData(this.f16973f);
            }
            return null;
        } catch (Throwable th) {
            m19785e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo36316a(String str) {
        try {
            this.f16791n = new Date().getTime();
            m19784d("loadInterstitial");
            this.f16972e = false;
            if (mo36398h()) {
                m19788s();
                m19778a(C6532a.LOAD_IN_PROGRESS);
                this.f16970c.loadInterstitialForBidding(this.f16973f, this, str);
            } else if (this.f16785a == C6532a.NO_INIT) {
                m19788s();
                m19778a(C6532a.INIT_IN_PROGRESS);
                m19786q();
                this.f16970c.initInterstitial(this.f16789l, this.f16790m, this.f16973f, this);
            } else {
                m19788s();
                m19778a(C6532a.LOAD_IN_PROGRESS);
                this.f16970c.loadInterstitial(this.f16973f, this);
            }
        } catch (Throwable th) {
            m19785e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo36317b() {
        m19784d("initForBidding()");
        m19778a(C6532a.INIT_IN_PROGRESS);
        m19786q();
        try {
            this.f16970c.initInterstitialForBidding(this.f16789l, this.f16790m, this.f16973f, this);
        } catch (Throwable th) {
            m19785e(mo36401k() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: c */
    public final void mo36318c() {
        try {
            this.f16970c.showInterstitial(this.f16973f, this);
        } catch (Throwable th) {
            m19785e(mo36401k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: f */
    public final void mo36319f() {
        this.f16970c.setMediationState(C6642b.C6643a.CAPPED_PER_SESSION, "interstitial");
    }

    /* renamed from: g */
    public final boolean mo36320g() {
        try {
            return this.f16970c.isInterstitialReady(this.f16973f);
        } catch (Throwable th) {
            m19785e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        m19783c("onInterstitialAdClicked");
        this.f16786b.mo36309d(this);
    }

    public final void onInterstitialAdClosed() {
        m19783c("onInterstitialAdClosed");
        this.f16786b.mo36306b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m19783c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f16785a.name());
        m19787r();
        if (this.f16785a == C6532a.LOAD_IN_PROGRESS) {
            m19778a(C6532a.LOAD_FAILED);
            this.f16786b.mo36303a(ironSourceError, this, new Date().getTime() - this.f16791n);
        }
    }

    public final void onInterstitialAdOpened() {
        m19783c("onInterstitialAdOpened");
        this.f16786b.mo36300a(this);
    }

    public final void onInterstitialAdReady() {
        m19783c("onInterstitialAdReady state=" + this.f16785a.name());
        m19787r();
        if (this.f16785a == C6532a.LOAD_IN_PROGRESS) {
            m19778a(C6532a.LOADED);
            this.f16786b.mo36301a(this, new Date().getTime() - this.f16791n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        m19783c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f16786b.mo36302a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        m19783c("onInterstitialAdShowSucceeded");
        this.f16786b.mo36308c(this);
    }

    public final void onInterstitialAdVisible() {
        m19783c("onInterstitialAdVisible");
        this.f16786b.mo36311e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        m19783c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f16785a.name());
        if (this.f16785a == C6532a.INIT_IN_PROGRESS) {
            m19787r();
            m19778a(C6532a.NO_INIT);
            this.f16786b.mo36307b(ironSourceError, this);
            if (!mo36398h()) {
                this.f16786b.mo36303a(ironSourceError, this, new Date().getTime() - this.f16791n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        m19783c("onInterstitialInitSuccess state=" + this.f16785a.name());
        if (this.f16785a == C6532a.INIT_IN_PROGRESS) {
            m19787r();
            if (mo36398h()) {
                m19778a(C6532a.INIT_SUCCESS);
            } else {
                m19778a(C6532a.LOAD_IN_PROGRESS);
                m19788s();
                try {
                    this.f16970c.loadInterstitial(this.f16973f, this);
                } catch (Throwable th) {
                    m19785e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
                }
            }
            this.f16786b.mo36312f(this);
        }
    }
}
