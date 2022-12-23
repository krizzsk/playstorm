package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p209b.C6593c;
import com.ironsource.mediationsdk.adunit.p209b.C6594d;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p217c.C6652b;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.P */
public final class C6513P<Listener extends AdapterAdInteractionListener> extends BaseAdInteractionAdapter<C6513P<Listener>, Listener> implements AdapterDebugInterface, AdapterAPSDataInterface, AdapterBaseInterface, AdapterBidderInterface, AdapterConsentInterface, AdapterMetaDataInterface, AdapterSettingsInterface, InterstitialSmashListener, RewardedVideoSmashListener {

    /* renamed from: a */
    IronSource.AD_UNIT f16681a;

    /* renamed from: b */
    private AbstractAdapter f16682b;

    /* renamed from: c */
    private C6594d f16683c;

    /* renamed from: d */
    private NetworkInitializationListener f16684d;

    /* renamed from: e */
    private AdapterAdListener f16685e;

    public C6513P(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.f16682b = abstractAdapter;
        this.f16681a = ad_unit;
        this.f16683c = new C6594d(ad_unit, C6594d.C6596b.PROVIDER, (C6593c) null);
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f16682b.addInterstitialListener(this);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f16682b.addRewardedVideoListener(this);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(m19652a("ad unit not supported - " + this.f16681a));
        }
    }

    /* renamed from: a */
    private String m19652a(String str) {
        String ad_unit = this.f16681a.toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return ad_unit + " - " + str;
    }

    /* renamed from: a */
    private boolean m19653a(IronSourceError ironSourceError) {
        if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
            return ironSourceError.getErrorCode() == 1158;
        }
        if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return ironSourceError.getErrorCode() == 1058;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error(m19652a("ad unit not supported - " + this.f16681a));
        return false;
    }

    public final String getAdapterVersion() {
        try {
            return this.f16682b.getVersion();
        } catch (Exception e) {
            String str = "Exception while calling adapter.getVersion() from " + this.f16682b.getProviderName() + " - " + e.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str));
            this.f16683c.f17103e.mo36545n(str);
            return null;
        }
    }

    public final Map<String, Object> getBiddingData(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f16682b.getInterstitialBiddingData(jSONObject);
            }
            if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f16682b.getRewardedVideoBiddingData(jSONObject);
            }
            IronLog.INTERNAL.error(m19652a("ad unit not supported - " + this.f16681a));
            return null;
        } catch (Throwable th) {
            String str = "getBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str));
            C6594d dVar = this.f16683c;
            if (dVar == null) {
                return null;
            }
            dVar.f17103e.mo36546o(str);
            return null;
        }
    }

    public final LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        try {
            return this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO ? this.f16682b.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings()) : LoadWhileShowSupportState.NONE;
        } catch (Exception e) {
            IronLog.INTERNAL.error(m19652a("Exception while calling adapter.getLoadWhileShowSupportedState from " + this.f16682b.getProviderName() + " - " + e.getLocalizedMessage()));
            return LoadWhileShowSupportState.NONE;
        }
    }

    public final /* bridge */ /* synthetic */ AdapterBaseInterface getNetworkAdapter() {
        return this;
    }

    public final String getNetworkSDKVersion() {
        try {
            return this.f16682b.getCoreSDKVersion();
        } catch (Exception e) {
            String str = "Exception while calling adapter.getCoreSDKVersion() from " + this.f16682b.getProviderName() + " - " + e.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str));
            this.f16683c.f17103e.mo36545n(str);
            return null;
        }
    }

    public final void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.f16684d = networkInitializationListener;
        String string = adData.getString(DataKeys.USER_ID);
        try {
            String str = C6490J.m19474a().f16546l;
            if (!TextUtils.isEmpty(str)) {
                this.f16682b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f16682b.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Throwable th) {
            String str2 = "setCustomParams exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str2));
            C6594d dVar = this.f16683c;
            if (dVar != null) {
                dVar.f17103e.mo36546o(str2);
            }
        }
        JSONObject a = C6652b.m20272a(adData.getConfiguration());
        try {
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f16682b.initInterstitialForBidding("", string, a, this);
                } else {
                    this.f16682b.initInterstitial("", string, a, this);
                }
            } else if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f16682b.initRewardedVideoWithCallback("", string, a, this);
            } else {
                IronLog.INTERNAL.error("ad unit not supported - " + this.f16681a);
            }
        } catch (Throwable th2) {
            String str3 = "init failed - " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str3));
            C6594d dVar2 = this.f16683c;
            if (dVar2 != null) {
                dVar2.f17103e.mo36546o(str3);
            }
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, str3));
            } else if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, str3));
            }
        }
    }

    public final boolean isAdAvailable(AdData adData) {
        JSONObject a = C6652b.m20272a(adData.getConfiguration());
        try {
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f16682b.isInterstitialReady(a);
            }
            if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f16682b.isRewardedVideoAvailable(a);
            }
            IronLog.INTERNAL.error(m19652a("ad unit not supported - " + this.f16681a));
            return false;
        } catch (Throwable th) {
            String str = "isAdAvailable exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str));
            C6594d dVar = this.f16683c;
            if (dVar == null) {
                return false;
            }
            dVar.f17103e.mo36546o(str);
            return false;
        }
    }

    public final /* synthetic */ void loadAd(AdData adData, Activity activity, Object obj) {
        this.f16685e = (AdapterAdInteractionListener) obj;
        JSONObject a = C6652b.m20272a(adData.getConfiguration());
        try {
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f16682b.loadInterstitialForBidding(a, this, adData.getServerData());
                } else {
                    this.f16682b.loadInterstitial(a, this);
                }
            } else if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                Integer num2 = adData.getInt("instanceType");
                if (num2 == null || num2.intValue() != 1) {
                    this.f16682b.loadRewardedVideoForBidding(a, this, adData.getServerData());
                } else {
                    this.f16682b.fetchRewardedVideoForAutomaticLoad(a, this);
                }
            } else {
                IronLog.INTERNAL.error(m19652a("ad unit not supported - " + this.f16681a));
            }
        } catch (Throwable th) {
            String str = "loadAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str));
            C6594d dVar = this.f16683c;
            if (dVar != null) {
                dVar.f17103e.mo36546o(str);
            }
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
            } else if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
            }
        }
    }

    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m19652a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadFailed(m19653a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m19652a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowSuccess();
        }
    }

    public final void onInterstitialAdVisible() {
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m19652a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f16684d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        NetworkInitializationListener networkInitializationListener = this.f16684d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    public final void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdEnded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    public final void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdRewardListener) {
            ((AdapterAdRewardListener) adapterAdListener).onAdRewarded();
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m19652a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdStarted();
        }
    }

    public final void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdVisible();
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19652a("available = " + z));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener == null) {
            return;
        }
        if (z) {
            adapterAdListener.onAdLoadSuccess();
        } else {
            adapterAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, "");
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m19652a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f16684d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        NetworkInitializationListener networkInitializationListener = this.f16684d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m19652a("error = " + ironSourceError));
        if (this.f16685e != null) {
            if (m19653a(ironSourceError)) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                boolean z = false;
                if (this.f16681a != IronSource.AD_UNIT.INTERSTITIAL) {
                    if (this.f16681a != IronSource.AD_UNIT.REWARDED_VIDEO) {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.error(m19652a("ad unit not supported - " + this.f16681a));
                    } else if (ironSourceError.getErrorCode() == 1057) {
                        z = true;
                    }
                }
                adapterErrorType = z ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            this.f16685e.onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m19652a(""));
        AdapterAdListener adapterAdListener = this.f16685e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    public final void releaseMemory() {
        AbstractAdapter abstractAdapter = this.f16682b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.releaseMemory(this.f16681a, new JSONObject());
                this.f16682b = null;
            } catch (Exception e) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f16682b.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(m19652a(str));
                this.f16683c.f17103e.mo36545n(str);
            }
        }
        this.f16684d = null;
        this.f16685e = null;
        C6594d dVar = this.f16683c;
        if (dVar != null) {
            dVar.mo36508a();
            this.f16683c = null;
        }
    }

    public final void setAPSData(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        AbstractAdapter abstractAdapter = this.f16682b;
        if (abstractAdapter != null && (abstractAdapter instanceof SetAPSInterface)) {
            ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
        }
    }

    public final void setAdapterDebug(boolean z) {
        AbstractAdapter abstractAdapter = this.f16682b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setAdapterDebug(Boolean.valueOf(z));
            } catch (Exception e) {
                String str = "Exception while calling adapter.setAdapterDebug(adapterDebug) from " + this.f16682b.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(m19652a(str));
                this.f16683c.f17103e.mo36545n(str);
            }
        }
    }

    public final void setConsent(boolean z) {
        AbstractAdapter abstractAdapter = this.f16682b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setConsent(z);
            } catch (Exception e) {
                String str = "Exception while calling adapter.setConsent(consent) from " + this.f16682b.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(m19652a(str));
                this.f16683c.f17103e.mo36545n(str);
            }
        }
    }

    public final void setMetaData(String str, List<String> list) {
        AbstractAdapter abstractAdapter = this.f16682b;
        if (abstractAdapter != null) {
            abstractAdapter.setMetaData(str, list);
        }
    }

    public final void showAd(AdData adData, Listener listener) {
        this.f16685e = listener;
        JSONObject a = C6652b.m20272a(adData.getConfiguration());
        try {
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                this.f16682b.showInterstitial(a, this);
            } else if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f16682b.showRewardedVideo(a, this);
            } else {
                IronLog.INTERNAL.error(m19652a("ad unit not supported - " + this.f16681a));
            }
        } catch (Throwable th) {
            String str = "showAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m19652a(str));
            C6594d dVar = this.f16683c;
            if (dVar != null) {
                dVar.f17103e.mo36546o(str);
            }
            if (this.f16681a == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, str));
            } else if (this.f16681a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoAdShowFailed(new IronSourceError(1038, str));
            }
        }
    }
}
