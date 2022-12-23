package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.saypromo.SPAdManager;
import com.saypromo.listeners.ISayPromoAdsExtendedListener;
import com.saypromo.listeners.ISayPromoMaxTokenListener;
import java.util.Locale;

public class SayGamesMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter {
    private static final String KEY_APP_ID = "app_id";
    private static final String KEY_PLACEMENT_IDS = "placement_ids";
    /* access modifiers changed from: private */
    public boolean adShowRequested;
    /* access modifiers changed from: private */
    public boolean adShown;

    public String getAdapterVersion() {
        return "7.0.32.0";
    }

    public void onDestroy() {
    }

    public SayGamesMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return SPAdManager.getSDKVersion();
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        checkExistence(SPAdManager.class);
        if (maxAdapterInitializationParameters.isTesting()) {
            SPAdManager.SetLogLevel(8);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        String string = maxAdapterSignalCollectionParameters.getServerParameters().getString("app_id");
        if (TextUtils.isEmpty(string)) {
            maxSignalCollectionListener.onSignalCollectionFailed("No \"app_id\" provided.");
            return;
        }
        Bundle bundle = maxAdapterSignalCollectionParameters.getServerParameters().getBundle(KEY_PLACEMENT_IDS);
        if (bundle == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("No \"placement_ids\" provided.");
            return;
        }
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        String lowerCase = adFormat.getLabel().toLowerCase(Locale.ENGLISH);
        if (!bundle.containsKey(lowerCase)) {
            maxSignalCollectionListener.onSignalCollectionFailed("No placement id for \"" + lowerCase + "\" found.");
            return;
        }
        String string2 = bundle.getString(lowerCase);
        if (TextUtils.isEmpty(string2)) {
            maxSignalCollectionListener.onSignalCollectionFailed("Placement id for " + adFormat.getLabel() + " is invalid.");
            return;
        }
        log("Collecting signal for " + adFormat + " ad with app ID: \"" + string + "\" and placement ID: \"" + string2 + "\"...");
        SPAdManager.getMaxToken(activity, string, string2, new ISayPromoMaxTokenListener() {
            public void onMaxTokenGenerated(String str) {
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String string = maxAdapterResponseParameters.getServerParameters().getString("app_id");
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad for app ID: \"" + string + "\" and placement ID: \"" + thirdPartyAdPlacementId + "\"...");
        SPAdManager.loadMaxInterstitial(activity, string, thirdPartyAdPlacementId, maxAdapterResponseParameters.getBidResponse(), new SayGamesInterstitialListener(maxInterstitialAdapterListener));
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for placement ID: \"" + thirdPartyAdPlacementId + "\"...");
        if (SPAdManager.isInterstitialReady(thirdPartyAdPlacementId)) {
            this.adShowRequested = true;
            SPAdManager.showInterstitialWithCustomEventInfo(activity);
            return;
        }
        log("Ad not ready");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String string = maxAdapterResponseParameters.getServerParameters().getString("app_id");
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded ad for app ID: \"" + string + "\" and placement ID: \"" + thirdPartyAdPlacementId + "\"...");
        SPAdManager.loadMaxRewarded(activity, string, thirdPartyAdPlacementId, maxAdapterResponseParameters.getBidResponse(), new SayGamesRewardedAdListener(maxRewardedAdapterListener));
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for placement ID: \"" + thirdPartyAdPlacementId + "\"...");
        if (SPAdManager.isRewardedReady(thirdPartyAdPlacementId)) {
            this.adShowRequested = true;
            configureReward(maxAdapterResponseParameters);
            SPAdManager.showRewardedVideoWithCustomEventInfo(activity, thirdPartyAdPlacementId);
            return;
        }
        log("Ad not ready");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
    }

    /* access modifiers changed from: private */
    public MaxAdapterError toMaxError(SPAdManager.SayPromoAdsError sayPromoAdsError, String str) {
        int i;
        if (sayPromoAdsError == SPAdManager.SayPromoAdsError.NO_FILL) {
            i = 204;
        } else if (sayPromoAdsError == SPAdManager.SayPromoAdsError.INITIALIZE_FAILED) {
            i = MaxAdapterError.ERROR_CODE_INTERNAL_ERROR;
        } else if (sayPromoAdsError == SPAdManager.SayPromoAdsError.NOT_INITIALIZED) {
            i = MaxAdapterError.ERROR_CODE_NOT_INITIALIZED;
        } else {
            i = sayPromoAdsError == SPAdManager.SayPromoAdsError.INVALID_ARGUMENT ? MaxAdapterError.ERROR_CODE_INVALID_CONFIGURATION : MaxAdapterError.ERROR_CODE_UNSPECIFIED;
        }
        return new MaxAdapterError(i, "", sayPromoAdsError.ordinal(), str);
    }

    private class SayGamesInterstitialListener implements ISayPromoAdsExtendedListener {
        private final MaxInterstitialAdapterListener listener;

        private SayGamesInterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onSayPromoAdsReady(String str) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Interstitial ad loaded for placement ID: \"" + str + "\"");
            this.listener.onInterstitialAdLoaded();
        }

        public void onSayPromoAdsStart(String str) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Interstitial ad displayed for placement ID: \"" + str + "\"");
            this.listener.onInterstitialAdDisplayed();
            boolean unused = SayGamesMediationAdapter.this.adShown = true;
        }

        public void onSayPromoAdsClick(String str) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Interstitial ad clicked for placement ID: \"" + str + "\"");
            this.listener.onInterstitialAdClicked();
        }

        public void onSayPromoAdsFinish(String str, SPAdManager.FinishState finishState) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Interstitial ad finished for placement ID: \"" + str + "\" with state: " + finishState);
            if (finishState != SPAdManager.FinishState.ERROR || SayGamesMediationAdapter.this.adShown) {
                this.listener.onInterstitialAdHidden();
            } else {
                this.listener.onInterstitialAdDisplayFailed(MaxAdapterError.INTERNAL_ERROR);
            }
        }

        public void onSayPromoAdsError(SPAdManager.SayPromoAdsError sayPromoAdsError, String str) {
            if (!SayGamesMediationAdapter.this.adShowRequested) {
                SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
                sayGamesMediationAdapter.log("Interstitial ad failed to load with error: " + sayPromoAdsError + " - " + str);
                this.listener.onInterstitialAdLoadFailed(SayGamesMediationAdapter.this.toMaxError(sayPromoAdsError, str));
            } else if (!SayGamesMediationAdapter.this.adShown) {
                SayGamesMediationAdapter sayGamesMediationAdapter2 = SayGamesMediationAdapter.this;
                sayGamesMediationAdapter2.log("Interstitial ad failed to display with error: " + sayPromoAdsError + " - " + str);
                this.listener.onInterstitialAdDisplayFailed(SayGamesMediationAdapter.this.toMaxError(sayPromoAdsError, str));
            } else {
                SayGamesMediationAdapter sayGamesMediationAdapter3 = SayGamesMediationAdapter.this;
                sayGamesMediationAdapter3.log("Interstitial ad experienced error during display: " + sayPromoAdsError + " - " + str);
            }
        }

        public void onSayPromoAdsPlacementStateChanged(String str, SPAdManager.PlacementState placementState, SPAdManager.PlacementState placementState2) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Interstitial ad changed state for placement ID: \"" + str + "\" old state: " + placementState + " new state: " + placementState2);
        }
    }

    private class SayGamesRewardedAdListener implements ISayPromoAdsExtendedListener {
        private final MaxRewardedAdapterListener listener;

        private SayGamesRewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onSayPromoAdsReady(String str) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Rewarded ad loaded for placement ID: \"" + str + "\"");
            this.listener.onRewardedAdLoaded();
        }

        public void onSayPromoAdsStart(String str) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Rewarded ad displayed for placement ID: \"" + str + "\"");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
            boolean unused = SayGamesMediationAdapter.this.adShown = true;
        }

        public void onSayPromoAdsClick(String str) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Rewarded ad clicked for placement ID: \"" + str + "\"");
            this.listener.onRewardedAdClicked();
        }

        public void onSayPromoAdsFinish(String str, SPAdManager.FinishState finishState) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Rewarded ad finished for placement ID: \"" + str + "\" with state: " + finishState);
            if (finishState == SPAdManager.FinishState.COMPLETED) {
                this.listener.onRewardedAdVideoCompleted();
                this.listener.onUserRewarded(SayGamesMediationAdapter.this.getReward());
                this.listener.onRewardedAdHidden();
            } else if (finishState == SPAdManager.FinishState.SKIPPED) {
                this.listener.onRewardedAdVideoCompleted();
                if (SayGamesMediationAdapter.this.shouldAlwaysRewardUser()) {
                    this.listener.onUserRewarded(SayGamesMediationAdapter.this.getReward());
                }
                this.listener.onRewardedAdHidden();
            } else if (finishState != SPAdManager.FinishState.ERROR) {
            } else {
                if (SayGamesMediationAdapter.this.adShown) {
                    this.listener.onRewardedAdVideoCompleted();
                    if (SayGamesMediationAdapter.this.shouldAlwaysRewardUser()) {
                        this.listener.onUserRewarded(SayGamesMediationAdapter.this.getReward());
                    }
                    this.listener.onRewardedAdHidden();
                    return;
                }
                this.listener.onRewardedAdDisplayFailed(MaxAdapterError.INTERNAL_ERROR);
            }
        }

        public void onSayPromoAdsError(SPAdManager.SayPromoAdsError sayPromoAdsError, String str) {
            if (!SayGamesMediationAdapter.this.adShowRequested) {
                SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
                sayGamesMediationAdapter.log("Rewarded ad failed to load with error: " + sayPromoAdsError + " - " + str);
                this.listener.onRewardedAdLoadFailed(SayGamesMediationAdapter.this.toMaxError(sayPromoAdsError, str));
            } else if (!SayGamesMediationAdapter.this.adShown) {
                SayGamesMediationAdapter sayGamesMediationAdapter2 = SayGamesMediationAdapter.this;
                sayGamesMediationAdapter2.log("Rewarded ad failed to display with error: " + sayPromoAdsError + " - " + str);
                this.listener.onRewardedAdDisplayFailed(SayGamesMediationAdapter.this.toMaxError(sayPromoAdsError, str));
            } else {
                SayGamesMediationAdapter sayGamesMediationAdapter3 = SayGamesMediationAdapter.this;
                sayGamesMediationAdapter3.log("Rewarded ad experienced error during display: " + sayPromoAdsError + " - " + str);
            }
        }

        public void onSayPromoAdsPlacementStateChanged(String str, SPAdManager.PlacementState placementState, SPAdManager.PlacementState placementState2) {
            SayGamesMediationAdapter sayGamesMediationAdapter = SayGamesMediationAdapter.this;
            sayGamesMediationAdapter.log("Rewarded ad changed state for placement ID: \"" + str + "\" old state: " + placementState + " new state: " + placementState2);
        }
    }
}
