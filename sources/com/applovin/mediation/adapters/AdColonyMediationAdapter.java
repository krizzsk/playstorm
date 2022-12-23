package com.applovin.mediation.adapters;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAdSize;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyAdViewListener;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonySignalsListener;
import com.adcolony.sdk.AdColonyZone;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class AdColonyMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    /* access modifiers changed from: private */
    public AdColonyAdView loadedAdViewAd;
    /* access modifiers changed from: private */
    public AdColonyInterstitial loadedInterstitialAd;
    /* access modifiers changed from: private */
    public AdColonyInterstitial loadedRewardedAd;

    public String getAdapterVersion() {
        return "4.8.0.0";
    }

    public AdColonyMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return AdColony.getSDKVersion();
    }

    public void onDestroy() {
        AdColonyInterstitial adColonyInterstitial = this.loadedInterstitialAd;
        if (adColonyInterstitial != null) {
            adColonyInterstitial.destroy();
            this.loadedInterstitialAd = null;
        }
        AdColonyInterstitial adColonyInterstitial2 = this.loadedRewardedAd;
        if (adColonyInterstitial2 != null) {
            adColonyInterstitial2.destroy();
            this.loadedRewardedAd = null;
        }
        AdColonyAdView adColonyAdView = this.loadedAdViewAd;
        if (adColonyAdView != null) {
            adColonyAdView.destroy();
            this.loadedAdViewAd = null;
        }
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal for " + maxAdapterSignalCollectionParameters.getAdFormat() + " ad...");
        AdColony.collectSignals(new AdColonySignalsListener() {
            public void onSuccess(String str) {
                AdColonyMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }

            public void onFailure() {
                AdColonyMediationAdapter.this.log("Signal collection failed");
                maxSignalCollectionListener.onSignalCollectionFailed("AdColony has not yet been configured or there was an error parsing data");
            }
        });
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (initialized.compareAndSet(false, true)) {
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id");
            log("Initializing AdColony SDK with app id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            status = AdColony.configure(activity != null ? activity.getApplication() : (Application) getApplicationContext(), getOptions(maxAdapterInitializationParameters), string, getZoneIds(maxAdapterInitializationParameters)) ? MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
        }
        onCompletionListener.onCompletion(status, (String) null);
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(TextUtils.isEmpty(bidResponse) ? "bidding " : "");
        sb.append(" interstitial ad for zone id ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        if (!isAdColonyConfigured()) {
            log("AdColony SDK is not initialized");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        AdColony.setAppOptions(getOptions(maxAdapterResponseParameters));
        AdColony.requestInterstitial(thirdPartyAdPlacementId, new InterstitialListener(maxInterstitialAdapterListener));
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        AdColonyInterstitial adColonyInterstitial = this.loadedInterstitialAd;
        if (adColonyInterstitial == null) {
            log("Interstitial ad not ready");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        } else if (adColonyInterstitial.isExpired()) {
            log("Interstitial ad is expired");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        } else if (!this.loadedInterstitialAd.show()) {
            log("Interstitial ad failed to display");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        }
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(TextUtils.isEmpty(bidResponse) ? "bidding " : "");
        sb.append(" rewarded ad for zone id ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        if (!isAdColonyConfigured()) {
            log("AdColony SDK is not initialized");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        AdColony.setAppOptions(getOptions(maxAdapterResponseParameters));
        RewardedAdListener rewardedAdListener = new RewardedAdListener(maxRewardedAdapterListener);
        AdColony.setRewardListener(rewardedAdListener);
        AdColony.requestInterstitial(thirdPartyAdPlacementId, rewardedAdListener);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        AdColonyInterstitial adColonyInterstitial = this.loadedRewardedAd;
        if (adColonyInterstitial == null) {
            log("Rewarded ad not ready");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        } else if (adColonyInterstitial.isExpired()) {
            log("Rewarded ad is expired");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        } else {
            configureReward(maxAdapterResponseParameters);
            if (!this.loadedRewardedAd.show()) {
                log("Rewarded ad failed to display");
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
            }
        }
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(TextUtils.isEmpty(bidResponse) ? "bidding " : "");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for zone id ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        if (!isAdColonyConfigured()) {
            log("AdColony SDK is not initialized");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        AdColony.setAppOptions(getOptions(maxAdapterResponseParameters));
        AdColony.requestAdView(thirdPartyAdPlacementId, new AdViewAdListener(maxAdFormat, maxAdViewAdapterListener), sizeFromAdFormat(maxAdFormat));
    }

    private boolean isAdColonyConfigured() {
        return !AdColony.getSDKVersion().isEmpty();
    }

    private String[] getZoneIds(MaxAdapterParameters maxAdapterParameters) {
        ArrayList<String> stringArrayList = maxAdapterParameters.getServerParameters().getStringArrayList("zone_ids");
        if (stringArrayList == null || stringArrayList.size() == 0) {
            return new String[0];
        }
        String[] strArr = new String[stringArrayList.size()];
        for (int i = 0; i < stringArrayList.size(); i++) {
            strArr[i] = stringArrayList.get(i);
        }
        return strArr;
    }

    private AdColonyAppOptions getOptions(MaxAdapterParameters maxAdapterParameters) {
        String str;
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        AdColonyAppOptions adColonyAppOptions = new AdColonyAppOptions();
        adColonyAppOptions.setTestModeEnabled(maxAdapterParameters.isTesting());
        adColonyAppOptions.setMediationNetwork("AppLovin", AppLovinSdk.VERSION);
        String str2 = "1";
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
            adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.GDPR, true);
            Boolean privacySetting = getPrivacySetting("hasUserConsent", maxAdapterParameters);
            if (privacySetting != null) {
                if (privacySetting.booleanValue()) {
                    str = str2;
                } else {
                    str = "0";
                }
                adColonyAppOptions.setPrivacyConsentString(AdColonyAppOptions.GDPR, str);
            }
        } else if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY) {
            adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.GDPR, false);
        }
        if (AppLovinSdk.VERSION_CODE >= 91100) {
            Boolean privacySetting2 = getPrivacySetting("isDoNotSell", maxAdapterParameters);
            if (privacySetting2 != null) {
                adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.CCPA, true);
                if (privacySetting2.booleanValue()) {
                    str2 = "0";
                }
                adColonyAppOptions.setPrivacyConsentString(AdColonyAppOptions.CCPA, str2);
            } else {
                adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.CCPA, false);
            }
        }
        Boolean privacySetting3 = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting3 != null) {
            adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.COPPA, privacySetting3.booleanValue());
        }
        if (maxAdapterParameters instanceof MaxAdapterResponseParameters) {
            String bidResponse = ((MaxAdapterResponseParameters) maxAdapterParameters).getBidResponse();
            if (!TextUtils.isEmpty(bidResponse)) {
                adColonyAppOptions.setOption("adm", bidResponse);
            }
        }
        if (serverParameters.containsKey("app_orientation")) {
            adColonyAppOptions.setAppOrientation(serverParameters.getInt("app_orientation"));
        }
        if (serverParameters.containsKey(TapjoyConstants.TJC_APP_VERSION_NAME)) {
            adColonyAppOptions.setAppVersion(serverParameters.getString(TapjoyConstants.TJC_APP_VERSION_NAME));
        }
        if (serverParameters.containsKey("keep_screen_on")) {
            adColonyAppOptions.setKeepScreenOn(serverParameters.getBoolean("keep_screen_on"));
        }
        if (serverParameters.containsKey("multi_window_enabled")) {
            adColonyAppOptions.setMultiWindowEnabled(serverParameters.getBoolean("multi_window_enabled"));
        }
        if (serverParameters.containsKey("origin_store")) {
            adColonyAppOptions.setOriginStore(serverParameters.getString("origin_store"));
        }
        if (serverParameters.containsKey("requested_ad_orientation")) {
            adColonyAppOptions.setRequestedAdOrientation(serverParameters.getInt("requested_ad_orientation"));
        }
        if (serverParameters.containsKey(TapjoyConstants.TJC_PLUGIN) && serverParameters.containsKey("plugin_version")) {
            adColonyAppOptions.setPlugin(serverParameters.getString(TapjoyConstants.TJC_PLUGIN), serverParameters.getString("plugin_version"));
        }
        if (serverParameters.containsKey("user_id")) {
            adColonyAppOptions.setUserID(serverParameters.getString("user_id"));
        }
        return adColonyAppOptions;
    }

    private AdColonyAdSize sizeFromAdFormat(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdColonyAdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdColonyAdSize.LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdColonyAdSize.MEDIUM_RECTANGLE;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    private class InterstitialListener extends AdColonyInterstitialListener {
        private final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial loaded");
            AdColonyInterstitial unused = AdColonyMediationAdapter.this.loadedInterstitialAd = adColonyInterstitial;
            this.listener.onInterstitialAdLoaded();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log("Interstitial failed to fill for zone: " + adColonyZone.getZoneID());
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        public void onOpened(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial shown");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial hidden");
            this.listener.onInterstitialAdHidden();
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log("Interstitial expiring: " + adColonyInterstitial.getZoneID());
        }

        public void onLeftApplication(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial left application");
        }

        public void onClicked(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }
    }

    private class RewardedAdListener extends AdColonyInterstitialListener implements AdColonyRewardListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onReward(AdColonyReward adColonyReward) {
            if (adColonyReward.success()) {
                AdColonyMediationAdapter.this.log("Rewarded ad granted reward");
                this.hasGrantedReward = true;
                return;
            }
            AdColonyMediationAdapter.this.log("Rewarded ad did not grant reward");
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad loaded");
            AdColonyInterstitial unused = AdColonyMediationAdapter.this.loadedRewardedAd = adColonyInterstitial;
            this.listener.onRewardedAdLoaded();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log("Rewarded ad failed to fill for zone: " + adColonyZone.getZoneID());
            this.listener.onRewardedAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        public void onOpened(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad shown");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || AdColonyMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = AdColonyMediationAdapter.this.getReward();
                AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
                adColonyMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            AdColonyMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdHidden();
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log("Rewarded ad expiring: " + adColonyInterstitial.getZoneID());
        }

        public void onLeftApplication(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad left application");
        }

        public void onClicked(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }
    }

    private class AdViewAdListener extends AdColonyAdViewListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;

        AdViewAdListener(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
            this.adFormat = maxAdFormat;
        }

        public void onRequestFilled(AdColonyAdView adColonyAdView) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log(this.adFormat.getLabel() + " ad loaded");
            AdColonyAdView unused = AdColonyMediationAdapter.this.loadedAdViewAd = adColonyAdView;
            this.listener.onAdViewAdLoaded(AdColonyMediationAdapter.this.loadedAdViewAd);
        }

        public void onLeftApplication(AdColonyAdView adColonyAdView) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log(this.adFormat.getLabel() + " ad left application");
        }

        public void onClicked(AdColonyAdView adColonyAdView) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log(this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            AdColonyMediationAdapter adColonyMediationAdapter = AdColonyMediationAdapter.this;
            adColonyMediationAdapter.log(this.adFormat.getLabel() + " ad failed to fill for zone: " + adColonyZone.getZoneID());
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
        }
    }
}
