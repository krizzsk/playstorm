package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ogury.core.OguryError;
import com.ogury.p375cm.OguryChoiceManagerExternal;
import com.ogury.p376ed.OguryAdFormatErrorCode;
import com.ogury.p376ed.OguryAdImpressionListener;
import com.ogury.p376ed.OguryInterstitialAd;
import com.ogury.p376ed.OguryInterstitialAdListener;
import com.ogury.p376ed.OguryOptinVideoAd;
import com.ogury.p376ed.OguryOptinVideoAdListener;
import com.ogury.p376ed.OguryReward;
import com.ogury.sdk.Ogury;
import com.ogury.sdk.OguryConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import p394io.presage.common.token.OguryTokenProvider;

public class OguryPresageMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private OguryInterstitialAd interstitialAd;
    /* access modifiers changed from: private */
    public boolean isShowing;
    private OguryOptinVideoAd rewardedAd;

    public String getAdapterVersion() {
        return "5.3.0.0";
    }

    public OguryPresageMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("asset_key");
            log("Initializing Ogury Presage SDK with asset key: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            updateUserConsent(maxAdapterInitializationParameters);
            Ogury.start(new OguryConfiguration.Builder(getContext(activity), string).putMonitoringInfo("max_applovin_mediation_version", AppLovinSdk.VERSION).build());
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public String getSdkVersion() {
        return Ogury.getSdkVersion();
    }

    public void onDestroy() {
        this.interstitialAd = null;
        this.rewardedAd = null;
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(OguryTokenProvider.getBidderToken(getContext(activity)));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("interstitial ad for ad unit id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        this.interstitialAd = new OguryInterstitialAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener);
        this.interstitialAd.setListener(interstitialAdListener);
        this.interstitialAd.setAdImpressionListener(interstitialAdListener);
        updateUserConsent(maxAdapterResponseParameters);
        if (this.interstitialAd.isLoaded()) {
            log("Ad is available already");
            maxInterstitialAdapterListener.onInterstitialAdLoaded();
            return;
        }
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            this.interstitialAd.setAdMarkup(bidResponse);
        }
        this.interstitialAd.load();
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (this.interstitialAd.isLoaded()) {
            this.isShowing = true;
            this.interstitialAd.show();
            return;
        }
        log("Interstitial ad not ready");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded ad for ad unit id: " + thirdPartyAdPlacementId);
        this.rewardedAd = new OguryOptinVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        RewardedAdListener rewardedAdListener = new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
        this.rewardedAd.setListener(rewardedAdListener);
        this.rewardedAd.setAdImpressionListener(rewardedAdListener);
        updateUserConsent(maxAdapterResponseParameters);
        if (this.rewardedAd.isLoaded()) {
            log("Ad is available already");
            maxRewardedAdapterListener.onRewardedAdLoaded();
            return;
        }
        this.rewardedAd.load();
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (this.rewardedAd.isLoaded()) {
            configureReward(maxAdapterResponseParameters);
            this.isShowing = true;
            this.rewardedAd.show();
            return;
        }
        log("Rewarded ad not ready");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    private void updateUserConsent(MaxAdapterParameters maxAdapterParameters) {
        Boolean privacySetting;
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting = getPrivacySetting("hasUserConsent", maxAdapterParameters)) != null) {
            OguryChoiceManagerExternal.setConsent(privacySetting.booleanValue(), "CUSTOM");
        }
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(OguryError oguryError) {
        int errorCode = oguryError.getErrorCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (errorCode != 0) {
            switch (errorCode) {
                case 2000:
                    maxAdapterError = MaxAdapterError.UNSPECIFIED;
                    break;
                case 2001:
                case 2002:
                    maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                    break;
                case 2003:
                    maxAdapterError = MaxAdapterError.AD_EXPIRED;
                    break;
                case 2004:
                case 2006:
                    maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                    break;
                case 2005:
                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                    break;
                case 2007:
                case OguryAdFormatErrorCode.SHOW_FAILED /*2010*/:
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                    break;
                case 2008:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                case 2009:
                    maxAdapterError = MaxAdapterError.AD_NOT_READY;
                    break;
            }
        } else {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, oguryError.getMessage());
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private class InterstitialAdListener implements OguryInterstitialAdListener, OguryAdImpressionListener {
        private final String adUnitId;
        private final MaxInterstitialAdapterListener listener;

        InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.adUnitId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        public void onAdLoaded() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Interstitial loaded: " + this.adUnitId);
            this.listener.onInterstitialAdLoaded();
        }

        public void onAdDisplayed() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Interstitial shown: " + this.adUnitId);
        }

        public void onAdImpression() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Interstitial triggered impression: " + this.adUnitId);
            this.listener.onInterstitialAdDisplayed();
        }

        public void onAdClicked() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Interstitial clicked: " + this.adUnitId);
            this.listener.onInterstitialAdClicked();
        }

        public void onAdClosed() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Interstitial hidden: " + this.adUnitId);
            this.listener.onInterstitialAdHidden();
        }

        public void onAdError(OguryError oguryError) {
            if (OguryPresageMediationAdapter.this.isShowing) {
                OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
                oguryPresageMediationAdapter.log("Interstitial (" + this.adUnitId + ") failed to show with error: " + oguryError);
                this.listener.onInterstitialAdDisplayFailed(OguryPresageMediationAdapter.toMaxError(oguryError));
                return;
            }
            OguryPresageMediationAdapter oguryPresageMediationAdapter2 = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter2.log("Interstitial (" + this.adUnitId + ") failed to load with error: " + oguryError);
            this.listener.onInterstitialAdLoadFailed(OguryPresageMediationAdapter.toMaxError(oguryError));
        }
    }

    private class RewardedAdListener implements OguryOptinVideoAdListener, OguryAdImpressionListener {
        private final String adUnitId;
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.adUnitId = str;
            this.listener = maxRewardedAdapterListener;
        }

        public void onAdLoaded() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Rewarded ad loaded: " + this.adUnitId);
            this.listener.onRewardedAdLoaded();
        }

        public void onAdDisplayed() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Rewarded ad shown: " + this.adUnitId);
        }

        public void onAdImpression() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Rewarded ad triggered impression: " + this.adUnitId);
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onAdClicked() {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Rewarded ad clicked: " + this.adUnitId);
            this.listener.onRewardedAdClicked();
        }

        public void onAdClosed() {
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || OguryPresageMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = OguryPresageMediationAdapter.this.getReward();
                OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
                oguryPresageMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            OguryPresageMediationAdapter oguryPresageMediationAdapter2 = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter2.log("Rewarded ad hidden: " + this.adUnitId);
            this.listener.onRewardedAdHidden();
        }

        public void onAdRewarded(OguryReward oguryReward) {
            OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter.log("Rewarded ad (" + this.adUnitId + ") granted reward with rewardName: " + oguryReward.getName() + ", rewardValue: " + oguryReward.getValue());
            this.hasGrantedReward = true;
        }

        public void onAdError(OguryError oguryError) {
            if (OguryPresageMediationAdapter.this.isShowing) {
                OguryPresageMediationAdapter oguryPresageMediationAdapter = OguryPresageMediationAdapter.this;
                oguryPresageMediationAdapter.log("Rewarded ad (" + this.adUnitId + ") failed to show with error: " + oguryError);
                this.listener.onRewardedAdDisplayFailed(OguryPresageMediationAdapter.toMaxError(oguryError));
                return;
            }
            OguryPresageMediationAdapter oguryPresageMediationAdapter2 = OguryPresageMediationAdapter.this;
            oguryPresageMediationAdapter2.log("Rewarded ad (" + this.adUnitId + ") failed to load with error: " + oguryError);
            this.listener.onRewardedAdLoadFailed(OguryPresageMediationAdapter.toMaxError(oguryError));
        }
    }
}
