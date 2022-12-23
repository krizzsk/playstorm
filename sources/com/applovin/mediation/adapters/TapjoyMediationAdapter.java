package com.applovin.mediation.adapters;

import android.app.Activity;
import android.text.TextUtils;
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
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJPrivacyPolicy;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyConnectFlag;
import java.util.HashMap;
import java.util.Hashtable;
import org.json.JSONObject;

public class TapjoyMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter {
    private TJPlacement interstitialPlacement;
    private TJPlacement rewardedPlacement;

    public String getAdapterVersion() {
        return "12.10.0.1";
    }

    public TapjoyMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return Tapjoy.getVersion();
    }

    public void onDestroy() {
        TJPlacement tJPlacement = this.interstitialPlacement;
        if (tJPlacement != null) {
            tJPlacement.setVideoListener((TJPlacementVideoListener) null);
            this.interstitialPlacement = null;
        }
        TJPlacement tJPlacement2 = this.rewardedPlacement;
        if (tJPlacement2 != null) {
            tJPlacement2.setVideoListener((TJPlacementVideoListener) null);
            this.rewardedPlacement = null;
        }
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!Tapjoy.isConnected()) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY);
            log("Initializing Tapjoy SDK with sdk key: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            Tapjoy.setDebugEnabled(maxAdapterInitializationParameters.isTesting());
            Hashtable hashtable = new Hashtable(1);
            hashtable.put(TapjoyConnectFlag.ENABLE_LOGGING, String.valueOf(maxAdapterInitializationParameters.isTesting()));
            updateConsentAndActivity(maxAdapterInitializationParameters, activity);
            Tapjoy.connect(activity != null ? activity.getApplicationContext() : getApplicationContext(), string, hashtable, new TJConnectListener() {
                public void onConnectSuccess() {
                    TapjoyMediationAdapter.this.log("Tapjoy SDK initialized");
                    onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS, (String) null);
                }

                public void onConnectFailure() {
                    TapjoyMediationAdapter.this.log("Tapjoy SDK failed to initialized");
                    onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE, (String) null);
                }
            });
            return;
        }
        updateConsentAndActivity(maxAdapterInitializationParameters, activity);
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS, (String) null);
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        updateConsentAndActivity(maxAdapterSignalCollectionParameters, activity);
        maxSignalCollectionListener.onSignalCollected(Tapjoy.getUserToken());
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Loading interstitial...");
        if (!Tapjoy.isConnected()) {
            log("Tapjoy SDK is not initialized");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateConsentAndActivity(maxAdapterResponseParameters, activity);
        TJPlacement createPlacement = createPlacement(maxAdapterResponseParameters, new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialPlacement = createPlacement;
        if (createPlacement != null) {
            createPlacement.requestContent();
        } else {
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.BAD_REQUEST);
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial...");
        if (this.interstitialPlacement.isContentReady()) {
            this.interstitialPlacement.showContent();
            return;
        }
        log("Interstitial ad not ready");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Loading rewarded ad...");
        if (!Tapjoy.isConnected()) {
            log("Tapjoy SDK is not initialized");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateConsentAndActivity(maxAdapterResponseParameters, activity);
        TJPlacement createPlacement = createPlacement(maxAdapterResponseParameters, new RewardedListener(maxRewardedAdapterListener));
        this.rewardedPlacement = createPlacement;
        if (createPlacement != null) {
            createPlacement.requestContent();
        } else {
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.BAD_REQUEST);
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedPlacement.isContentReady()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedPlacement.showContent();
            return;
        }
        log("Rewarded ad not ready");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    private void updateConsentAndActivity(MaxAdapterParameters maxAdapterParameters, Activity activity) {
        TJPrivacyPolicy privacyPolicy = Tapjoy.getPrivacyPolicy();
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            privacyPolicy.setBelowConsentAge(privacySetting.booleanValue());
        }
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
            privacyPolicy.setSubjectToGDPR(true);
            Boolean privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterParameters);
            if (privacySetting2 != null) {
                privacyPolicy.setUserConsent(privacySetting2.booleanValue() ? "1" : "0");
            }
        } else if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY) {
            privacyPolicy.setSubjectToGDPR(false);
        }
        if (AppLovinSdk.VERSION_CODE >= 91100) {
            Boolean privacySetting3 = getPrivacySetting("isDoNotSell", maxAdapterParameters);
            if (privacySetting3 != null) {
                privacyPolicy.setUSPrivacy(privacySetting3.booleanValue() ? "1YY-" : "1YN-");
            } else {
                privacyPolicy.setUSPrivacy("1---");
            }
        }
        Tapjoy.setActivity(activity);
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    private TJPlacement createPlacement(MaxAdapterResponseParameters maxAdapterResponseParameters, TJPlacementListener tJPlacementListener) {
        TJPlacement placement = Tapjoy.getPlacement(maxAdapterResponseParameters.getThirdPartyAdPlacementId(), tJPlacementListener);
        placement.setMediationName("applovin");
        placement.setAdapterVersion("12.10.0.1");
        if (tJPlacementListener instanceof TJPlacementVideoListener) {
            placement.setVideoListener((TJPlacementVideoListener) tJPlacementListener);
        }
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            try {
                placement.setAuctionData((HashMap) AppLovinSdkUtils.toMap(new JSONObject(maxAdapterResponseParameters.getBidResponse())));
            } catch (Throwable th) {
                log("Failed to load ad due to JSON deserialization error: ", th);
                return null;
            }
        }
        return placement;
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(TJError tJError) {
        String str;
        int i;
        if (tJError != null) {
            i = tJError.code;
            str = tJError.message;
        } else {
            i = 0;
            str = "";
        }
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (i == -1011) {
            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
        } else if (i == 204) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i, str);
    }

    private class InterstitialListener implements TJPlacementListener, TJPlacementVideoListener {
        final MaxInterstitialAdapterListener listener;

        public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onRequestSuccess(TJPlacement tJPlacement) {
            if (tJPlacement.isContentAvailable()) {
                TapjoyMediationAdapter.this.log("Interstitial request succeeded");
                return;
            }
            TapjoyMediationAdapter.this.log("Interstitial request failed");
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            MaxAdapterError access$000 = TapjoyMediationAdapter.toMaxError(tJError);
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Interstitial failed to load with error: " + access$000);
            this.listener.onInterstitialAdLoadFailed(access$000);
        }

        public void onContentReady(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial loaded");
            this.listener.onInterstitialAdLoaded();
        }

        public void onContentShow(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial shown");
        }

        public void onClick(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        public void onContentDismiss(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial hidden");
            this.listener.onInterstitialAdHidden();
        }

        public void onVideoStart(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial video start");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onVideoError(TJPlacement tJPlacement, String str) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.UNSPECIFIED.getErrorCode(), MaxAdapterError.UNSPECIFIED.getErrorMessage(), 0, str);
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Interstitial failed with error message: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        public void onVideoComplete(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial video completed");
        }
    }

    private class RewardedListener implements TJPlacementListener, TJPlacementVideoListener {
        private boolean hasGrantedReward;
        final MaxRewardedAdapterListener listener;

        public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        RewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onRequestSuccess(TJPlacement tJPlacement) {
            if (tJPlacement.isContentAvailable()) {
                TapjoyMediationAdapter.this.log("Rewarded request succeeded");
                return;
            }
            TapjoyMediationAdapter.this.log("Rewarded request failed");
            this.listener.onRewardedAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            MaxAdapterError access$000 = TapjoyMediationAdapter.toMaxError(tJError);
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Rewarded failed to load with error: " + access$000);
            this.listener.onRewardedAdLoadFailed(access$000);
        }

        public void onContentReady(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded loaded");
            this.listener.onRewardedAdLoaded();
        }

        public void onContentShow(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded shown");
        }

        public void onClick(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded clicked");
            this.listener.onRewardedAdClicked();
        }

        public void onContentDismiss(TJPlacement tJPlacement) {
            if (this.hasGrantedReward || TapjoyMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = TapjoyMediationAdapter.this.getReward();
                TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
                tapjoyMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            TapjoyMediationAdapter.this.log("Rewarded hidden");
            this.listener.onRewardedAdHidden();
        }

        public void onVideoStart(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded video began");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onVideoError(TJPlacement tJPlacement, String str) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.UNSPECIFIED.getErrorCode(), MaxAdapterError.UNSPECIFIED.getErrorMessage(), 0, str);
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Rewarded failed with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        public void onVideoComplete(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded video completed");
            this.listener.onRewardedAdVideoCompleted();
            this.hasGrantedReward = true;
        }
    }
}
