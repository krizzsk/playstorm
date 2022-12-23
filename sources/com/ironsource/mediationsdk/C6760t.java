package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.C6790y;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C6720b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.t */
public final class C6760t extends C6790y implements BannerSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6720b f17655i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f17656j;

    /* renamed from: k */
    private String f17657k;

    /* renamed from: l */
    private String f17658l;

    /* renamed from: m */
    private JSONObject f17659m;

    public C6760t(String str, String str2, NetworkSettings networkSettings, C6720b bVar, int i, AbstractAdapter abstractAdapter) {
        super(new C6691a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f17655i = bVar;
        this.f17905d = i;
        this.f17657k = str;
        this.f17658l = str2;
        this.f17659m = networkSettings.getBannerSettings();
        this.f17902a.initBannerForBidding(str, str2, this.f17904c, this);
    }

    /* renamed from: a */
    public final void mo36947a() {
        IronLog.INTERNAL.verbose("");
        if (this.f17902a == null) {
            IronLog.INTERNAL.error("destroyBanner() mAdapter == null");
        } else if (mo37007a(C6790y.C6791a.LOADED, C6790y.C6791a.NOT_LOADED) || mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.NOT_LOADED)) {
            mo37013h();
            this.f17902a.destroyBanner(this.f17903b.f17477a.getBannerSettings());
        } else {
            IronLog.INTERNAL.error("cannot destroy banner not loaded");
        }
    }

    /* renamed from: a */
    public final void mo36948a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2, JSONObject jSONObject, List<String> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("loadBanner state=" + mo37012g());
        C6790y.C6791a a = mo37002a(new C6790y.C6791a[]{C6790y.C6791a.NOT_LOADED, C6790y.C6791a.LOADED}, C6790y.C6791a.LOAD_IN_PROGRESS);
        if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
            IronLog.INTERNAL.error("loadBanner - bannerLayout is null or destroyed");
            this.f17655i.mo36856a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, iSDemandOnlyBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false, new Date().getTime() - this.f17656j);
        } else if (str == null) {
            IronLog.INTERNAL.error("loadBanner - serverData is null");
            this.f17655i.mo36856a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "serverData==null"), this, false, new Date().getTime() - this.f17656j);
        } else if (this.f17902a == null) {
            IronLog.INTERNAL.error("loadBanner - mAdapter is null");
            this.f17655i.mo36856a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false, new Date().getTime() - this.f17656j);
        } else if (a == C6790y.C6791a.NOT_LOADED) {
            this.f17656j = new Date().getTime();
            IronLog.INTERNAL.verbose("start timer");
            mo37005a((TimerTask) new TimerTask() {
                public final void run() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("load timed out state=" + C6760t.this.mo37012g());
                    if (C6760t.this.mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.NOT_LOADED)) {
                        C6760t.this.f17655i.mo36856a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"), C6760t.this, false, new Date().getTime() - C6760t.this.f17656j);
                    }
                }
            });
            this.f17906e = str2;
            this.f17907f = jSONObject;
            this.f17908g = list;
            this.f17902a.initBannerForBidding(this.f17657k, this.f17658l, this.f17659m, this);
            this.f17902a.loadBannerBiddingForDemandOnly(iSDemandOnlyBannerLayout, this.f17659m, this, str);
        } else {
            this.f17655i.mo36856a(a == C6790y.C6791a.LOAD_IN_PROGRESS ? new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_ALREADY_IN_PROGRESS, "load already in progress") : new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "load while show"), this, false, new Date().getTime() - this.f17656j);
        }
    }

    /* renamed from: b */
    public final String mo36949b() {
        return this.f17903b.f17477a.isMultipleInstances() ? this.f17903b.f17477a.getProviderTypeForReflection() : this.f17903b.f17477a.getProviderName();
    }

    /* renamed from: c */
    public final Map<String, Object> mo36950c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f17902a != null ? this.f17902a.getVersion() : str);
            if (this.f17902a != null) {
                str = this.f17902a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f17903b.f17477a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f17903b.f17477a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", 2);
            if (!TextUtils.isEmpty(this.f17906e)) {
                hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f17906e);
            }
            if (this.f17907f != null && this.f17907f.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f17907f);
            }
            if (!TextUtils.isEmpty(this.f17909h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f17909h);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo37009d() + ")", e);
        }
        return hashMap;
    }

    public final void onBannerAdClicked() {
        C6720b bVar = this.f17655i;
        if (bVar != null) {
            bVar.mo36857a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C6720b bVar = this.f17655i;
        if (bVar != null) {
            bVar.mo36861d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
        if (mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.NOT_LOADED)) {
            mo37013h();
            boolean z = ironSourceError.getErrorCode() == 606;
            if (this.f17655i != null) {
                this.f17655i.mo36856a(ironSourceError, this, z, new Date().getTime() - this.f17656j);
            }
            mo37003a(C6790y.C6791a.NOT_LOADED);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("");
        if (mo37007a(C6790y.C6791a.LOAD_IN_PROGRESS, C6790y.C6791a.LOADED)) {
            C6720b bVar = this.f17655i;
            if (bVar != null) {
                bVar.mo36858a(this, view, layoutParams);
            }
            mo37013h();
        }
    }

    public final void onBannerAdScreenDismissed() {
        C6720b bVar = this.f17655i;
        if (bVar != null) {
            bVar.mo36859b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C6720b bVar = this.f17655i;
        if (bVar != null) {
            bVar.mo36860c(this);
        }
    }

    public final void onBannerAdShown() {
        C6720b bVar = this.f17655i;
        if (bVar != null) {
            bVar.mo36862e(this);
            this.f17655i.mo36860c(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("");
    }
}
