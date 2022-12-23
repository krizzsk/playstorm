package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.C4033Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.internal.security.CertificateUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class FacebookMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus sStatus;
    /* access modifiers changed from: private */
    public AdView mAdView;
    private InterstitialAd mInterstitialAd;
    /* access modifiers changed from: private */
    public NativeAd mNativeAd;
    /* access modifiers changed from: private */
    public NativeBannerAd mNativeBannerAd;
    private RewardedVideoAd mRewardedInterAd;
    private RewardedVideoAd mRewardedVideoAd;
    /* access modifiers changed from: private */
    public final AtomicBoolean onInterstitialAdHiddenCalled = new AtomicBoolean();
    /* access modifiers changed from: private */
    public final AtomicBoolean onRewardedAdHiddenCalled = new AtomicBoolean();
    /* access modifiers changed from: private */
    public final AtomicBoolean onRewardedAdVideoCompletedCalled = new AtomicBoolean();

    public String getAdapterVersion() {
        return "6.11.0.4";
    }

    public FacebookMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        updateAdSettings(maxAdapterInitializationParameters);
        if (INITIALIZED.compareAndSet(false, true)) {
            sStatus = MaxAdapter.InitializationStatus.INITIALIZING;
            ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("placement_ids");
            C21181 r1 = new AudienceNetworkAds.InitListener() {
                public void onInitialized(AudienceNetworkAds.InitResult initResult) {
                    if (initResult.isSuccess()) {
                        FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                        facebookMediationAdapter.log("Facebook SDK successfully finished initialization: " + initResult.getMessage());
                        MaxAdapter.InitializationStatus unused = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                        onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, (String) null);
                        return;
                    }
                    FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                    facebookMediationAdapter2.log("Facebook SDK failed to finished initialization: " + initResult.getMessage());
                    MaxAdapter.InitializationStatus unused2 = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, initResult.getMessage());
                }
            };
            if (maxAdapterInitializationParameters.isTesting()) {
                AdSettings.setDebugBuild(true);
            }
            log("Initializing Facebook SDK with placements: " + stringArrayList);
            AudienceNetworkAds.buildInitSettings(getContext(activity)).withMediationService(getMediationIdentifier()).withPlacementIds(stringArrayList).withInitListener(r1).initialize();
            return;
        }
        log("Facebook attempted initialization already - marking initialization as completed");
        onCompletionListener.onCompletion(sStatus, (String) null);
    }

    public String getSdkVersion() {
        return getVersionString(BuildConfig.class, "VERSION_NAME");
    }

    public void onDestroy() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.mInterstitialAd = null;
        }
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.mRewardedVideoAd = null;
        }
        RewardedVideoAd rewardedVideoAd2 = this.mRewardedInterAd;
        if (rewardedVideoAd2 != null) {
            rewardedVideoAd2.destroy();
            this.mRewardedInterAd = null;
        }
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
            this.mNativeAd = null;
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
            this.mNativeBannerAd = null;
        }
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(BidderTokenProvider.getBidderToken(getContext(activity)));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateAdSettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mInterstitialAd = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd.buildLoadAdConfig().withAdListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        if (!this.mInterstitialAd.isAdLoaded() || this.mInterstitialAd.isAdInvalidated()) {
            log("Loading bidding interstitial ad...");
            this.mInterstitialAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
            return;
        }
        log("An interstitial ad has been loaded already");
        maxInterstitialAdapterListener.onInterstitialAdLoaded();
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
            log("Unable to show interstitial - no ad loaded...");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        } else if (!this.mInterstitialAd.isAdInvalidated()) {
            this.mInterstitialAd.show();
        } else {
            log("Unable to show interstitial - ad expired...");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        }
    }

    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded interstitial: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mRewardedInterAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener = rewardedVideoAd.buildLoadAdConfig().withAdExperience(AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL).withAdListener(new RewardedVideoAdExtendedListener() {
            private boolean hasGrantedReward;

            public void onAdLoaded(C4033Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded interstitial ad loaded: " + thirdPartyAdPlacementId);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
            }

            public void onError(C4033Ad ad, AdError adError) {
                MaxAdapterError access$100 = FacebookMediationAdapter.toMaxError(adError);
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + access$100);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoadFailed(access$100);
            }

            public void onAdClicked(C4033Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded interstitial ad clicked: " + thirdPartyAdPlacementId);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdClicked();
            }

            public void onRewardedVideoClosed() {
                if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                        MaxReward reward = FacebookMediationAdapter.this.getReward();
                        FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                        facebookMediationAdapter.log("Rewarded user with reward: " + reward);
                        maxRewardedInterstitialAdapterListener.onUserRewarded(reward);
                    }
                    FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                    facebookMediationAdapter2.log("Rewarded interstitial ad hidden: " + thirdPartyAdPlacementId);
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdHidden();
                    return;
                }
                FacebookMediationAdapter facebookMediationAdapter3 = FacebookMediationAdapter.this;
                facebookMediationAdapter3.log("Rewarded interstitial ad hidden: " + thirdPartyAdPlacementId);
            }

            public void onRewardedVideoCompleted() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded interstitial ad video completed: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoCompleted();
                    this.hasGrantedReward = true;
                }
            }

            public void onLoggingImpression(C4033Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded interstitial ad logging impression: " + thirdPartyAdPlacementId);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayed();
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoStarted();
            }

            public void onRewardedVideoActivityDestroyed() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded interstitial ad Activity destroyed: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoCompleted();
                }
                if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdHidden();
                }
            }
        });
        if (!this.mRewardedInterAd.isAdLoaded() || this.mRewardedInterAd.isAdInvalidated()) {
            log("Loading bidding rewarded interstitial ad...");
            this.mRewardedInterAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
            return;
        }
        log("A rewarded interstitial ad has been loaded already");
        maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
    }

    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        log("Showing rewarded interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        RewardedVideoAd rewardedVideoAd = this.mRewardedInterAd;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded()) {
            log("Unable to show rewarded interstitial ad - no ad loaded...");
            maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        } else if (!this.mRewardedInterAd.isAdInvalidated()) {
            configureReward(maxAdapterResponseParameters);
            this.mRewardedInterAd.show();
        } else {
            log("Unable to show rewarded interstitial ad - ad expired...");
            maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        }
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mRewardedVideoAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener = rewardedVideoAd.buildLoadAdConfig().withAdListener(new RewardedAdListener(maxRewardedAdapterListener));
        if (!this.mRewardedVideoAd.isAdLoaded() || this.mRewardedVideoAd.isAdInvalidated()) {
            log("Loading bidding rewarded ad...");
            this.mRewardedVideoAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
            return;
        }
        log("A rewarded ad has been loaded already");
        maxRewardedAdapterListener.onRewardedAdLoaded();
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded()) {
            log("Unable to show rewarded ad - no ad loaded...");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        } else if (!this.mRewardedVideoAd.isAdInvalidated()) {
            configureReward(maxAdapterResponseParameters);
            this.mRewardedVideoAd.show();
        } else {
            log("Unable to show rewarded ad - ad expired...");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        }
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb = new StringBuilder();
        sb.append("Loading");
        sb.append(z ? " native " : " ");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateAdSettings(maxAdapterResponseParameters);
        if (z) {
            NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
            this.mNativeAd = nativeAd;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdViewListener(maxAdapterResponseParameters.getServerParameters(), maxAdFormat, activity, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
            return;
        }
        AdView adView = new AdView(getContext(activity), thirdPartyAdPlacementId, toAdSize(maxAdFormat));
        this.mAdView = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new AdViewListener(maxAdFormat, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        boolean z = BundleUtils.getBoolean("is_native_banner", maxAdapterResponseParameters.getServerParameters());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading native ");
        sb.append(z ? "banner " : "");
        sb.append("ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateAdSettings(maxAdapterResponseParameters);
        Context context = getContext(activity);
        if (z) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(context, thirdPartyAdPlacementId);
            this.mNativeBannerAd = nativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
            return;
        }
        NativeAd nativeAd = new NativeAd(context, thirdPartyAdPlacementId);
        this.mNativeAd = nativeAd;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER_HEIGHT_50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.BANNER_HEIGHT_90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    private void updateAdSettings(MaxAdapterParameters maxAdapterParameters) {
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        if (serverParameters.containsKey("video_autoplay")) {
            AdSettings.setVideoAutoplay(serverParameters.getBoolean("video_autoplay"));
        }
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            AdSettings.setMixedAudience(privacySetting.booleanValue());
        }
        String string = serverParameters.getString("test_device_ids", (String) null);
        if (!TextUtils.isEmpty(string)) {
            AdSettings.addTestDevices(Arrays.asList(string.split(",")));
        }
        AdSettings.setMediationService(getMediationIdentifier());
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
    public static MaxAdapterError toMaxError(AdError adError) {
        int errorCode = adError.getErrorCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (errorCode != 2006) {
            if (errorCode != 2100) {
                if (errorCode != 9001) {
                    if (errorCode != 2008) {
                        if (errorCode != 2009) {
                            switch (errorCode) {
                                case 1000:
                                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                                    break;
                                case 1001:
                                    maxAdapterError = MaxAdapterError.NO_FILL;
                                    break;
                                case 1002:
                                    break;
                                default:
                                    switch (errorCode) {
                                        case 2000:
                                            break;
                                        case 2001:
                                            break;
                                        case 2002:
                                            break;
                                        case 2003:
                                        case 2004:
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case 6001:
                                                case 6002:
                                                case 6003:
                                                    maxAdapterError = new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets");
                                                    break;
                                                default:
                                                    switch (errorCode) {
                                                        case AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE /*7001*/:
                                                        case AdError.LOAD_CALLED_WHILE_SHOWING_AD /*7002*/:
                                                        case AdError.INCORRECT_STATE_ERROR /*7004*/:
                                                        case AdError.NATIVE_AD_IS_NOT_LOADED /*7007*/:
                                                            break;
                                                        case AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED /*7003*/:
                                                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                                            break;
                                                        case AdError.MISSING_DEPENDENCIES_ERROR /*7005*/:
                                                        case AdError.API_NOT_SUPPORTED /*7006*/:
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        }
                        maxAdapterError = MaxAdapterError.TIMEOUT;
                        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
                    }
                    maxAdapterError = MaxAdapterError.SERVER_ERROR;
                    return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
                }
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
            }
            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
        }
        maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
    }

    private String getMediationIdentifier() {
        return "APPLOVIN_" + AppLovinSdk.VERSION + CertificateUtil.DELIMITER + getAdapterVersion();
    }

    /* access modifiers changed from: private */
    public MaxNativeAdView createMaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        if (AppLovinSdk.VERSION_CODE >= 11010000) {
            return new MaxNativeAdView(maxNativeAd, str, getApplicationContext());
        }
        return new MaxNativeAdView(maxNativeAd, str, activity);
    }

    /* access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private class InterstitialAdListener implements InterstitialAdExtendedListener {
        private final MaxInterstitialAdapterListener listener;

        public void onRewardedAdCompleted() {
        }

        public void onRewardedAdServerFailed() {
        }

        public void onRewardedAdServerSucceeded() {
        }

        InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onAdLoaded(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Interstitial ad loaded: " + ad.getPlacementId());
            this.listener.onInterstitialAdLoaded();
        }

        public void onError(C4033Ad ad, AdError adError) {
            MaxAdapterError access$100 = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Interstitial ad (" + ad.getPlacementId() + ") failed to load with error: " + access$100);
            this.listener.onInterstitialAdLoadFailed(access$100);
        }

        public void onAdClicked(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Interstitial ad clicked: " + ad.getPlacementId());
            this.listener.onInterstitialAdClicked();
        }

        public void onLoggingImpression(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Interstitial ad logging impression: " + ad.getPlacementId());
            this.listener.onInterstitialAdDisplayed();
        }

        public void onInterstitialDisplayed(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Interstitial ad displayed: " + ad.getPlacementId());
        }

        public void onInterstitialDismissed(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Interstitial ad hidden: " + ad.getPlacementId());
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }

        public void onInterstitialActivityDestroyed() {
            FacebookMediationAdapter.this.log("Interstitial ad Activity destroyed");
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }
    }

    private class RewardedAdListener implements RewardedVideoAdExtendedListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onAdLoaded(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Rewarded ad loaded: " + ad.getPlacementId());
            this.listener.onRewardedAdLoaded();
        }

        public void onError(C4033Ad ad, AdError adError) {
            MaxAdapterError access$100 = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Rewarded ad (" + ad.getPlacementId() + ") failed to load with error (" + access$100);
            this.listener.onRewardedAdLoadFailed(access$100);
        }

        public void onAdClicked(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Rewarded ad clicked: " + ad.getPlacementId());
            this.listener.onRewardedAdClicked();
        }

        public void onRewardedVideoClosed() {
            FacebookMediationAdapter.this.log("Rewarded ad hidden");
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = FacebookMediationAdapter.this.getReward();
                    FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                    facebookMediationAdapter.log("Rewarded user with reward: " + reward);
                    this.listener.onUserRewarded(reward);
                }
                this.listener.onRewardedAdHidden();
            }
        }

        public void onRewardedVideoCompleted() {
            FacebookMediationAdapter.this.log("Rewarded ad video completed");
            if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdVideoCompleted();
                this.hasGrantedReward = true;
            }
        }

        public void onLoggingImpression(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Rewarded ad logging impression: " + ad.getPlacementId());
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onRewardedVideoActivityDestroyed() {
            FacebookMediationAdapter.this.log("Rewarded ad Activity destroyed");
            if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdVideoCompleted();
            }
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdHidden();
            }
        }
    }

    private class AdViewListener implements AdListener {
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        public void onAdLoaded(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log(this.adFormat.getLabel() + " ad loaded: " + ad.getPlacementId());
            this.listener.onAdViewAdLoaded(FacebookMediationAdapter.this.mAdView);
        }

        public void onError(C4033Ad ad, AdError adError) {
            MaxAdapterError access$100 = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log(this.adFormat.getLabel() + " ad (" + ad.getPlacementId() + ") failed to load with error (" + access$100);
            this.listener.onAdViewAdLoadFailed(access$100);
        }

        public void onAdClicked(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log(this.adFormat.getLabel() + " ad clicked: " + ad.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        public void onLoggingImpression(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log(this.adFormat.getLabel() + " ad displayed: " + ad.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }
    }

    private class NativeAdViewListener implements NativeAdListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final Bundle serverParameters;

        NativeAdViewListener(Bundle bundle, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.serverParameters = bundle;
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        public void onAdLoaded(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad loaded: " + ad.getPlacementId());
            if (FacebookMediationAdapter.this.mNativeAd == null || FacebookMediationAdapter.this.mNativeAd != ad) {
                FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                facebookMediationAdapter2.log("Native " + this.adFormat.getLabel() + " ad failed to load: no fill");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
            } else if (FacebookMediationAdapter.this.mNativeAd.isAdInvalidated()) {
                FacebookMediationAdapter facebookMediationAdapter3 = FacebookMediationAdapter.this;
                facebookMediationAdapter3.log("Native " + this.adFormat.getLabel() + " ad failed to load: ad is no longer valid");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.AD_EXPIRED);
            } else if (this.adFormat == MaxAdFormat.MREC) {
                this.listener.onAdViewAdLoaded(NativeAdView.render(FacebookMediationAdapter.this.getContext((Activity) this.activityRef.get()), FacebookMediationAdapter.this.mNativeAd));
            } else if (AppLovinSdk.VERSION_CODE >= 9140000) {
                renderNativeAdView();
            } else {
                FacebookMediationAdapter facebookMediationAdapter4 = FacebookMediationAdapter.this;
                facebookMediationAdapter4.log("Native " + this.adFormat.getLabel() + " failed to load: AppLovin SDK version must be at least 9.14.0");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            }
        }

        public void onMediaDownloaded(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native " + this.adFormat.getLabel() + " successfully downloaded media: " + ad.getPlacementId());
        }

        public void onError(C4033Ad ad, AdError adError) {
            MaxAdapterError access$100 = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad (" + ad.getPlacementId() + ") failed to load with error: " + access$100);
            this.listener.onAdViewAdLoadFailed(access$100);
        }

        public void onLoggingImpression(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native " + this.adFormat.getLabel() + " shown: " + ad.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdClicked(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native " + this.adFormat.getLabel() + " clicked: " + ad.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        private void renderNativeAdView() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    MaxNativeAdView maxNativeAdView;
                    Activity activity = (Activity) NativeAdViewListener.this.activityRef.get();
                    Context access$700 = FacebookMediationAdapter.this.getContext(activity);
                    MediaView mediaView = new MediaView(access$700);
                    MediaView mediaView2 = new MediaView(access$700);
                    MaxNativeAd build = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(FacebookMediationAdapter.this.mNativeAd.getAdHeadline()).setAdvertiser(FacebookMediationAdapter.this.mNativeAd.getAdvertiserName()).setBody(FacebookMediationAdapter.this.mNativeAd.getAdBodyText()).setCallToAction(FacebookMediationAdapter.this.mNativeAd.getAdCallToAction()).setIconView(mediaView).setMediaView(mediaView2).setOptionsView(new AdOptionsView(access$700, FacebookMediationAdapter.this.mNativeAd, (NativeAdLayout) null)).build();
                    String string = BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters);
                    if (string.contains("vertical")) {
                        if (AppLovinSdk.VERSION_CODE < 9140500) {
                            FacebookMediationAdapter.this.log("Vertical native banners are only supported on MAX SDK 9.14.5 and above. Default native template will be used.");
                        }
                        if (string.equals("vertical")) {
                            maxNativeAdView = FacebookMediationAdapter.this.createMaxNativeAdView(build, NativeAdViewListener.this.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", activity);
                        } else {
                            maxNativeAdView = FacebookMediationAdapter.this.createMaxNativeAdView(build, string, activity);
                        }
                    } else if (AppLovinSdk.VERSION_CODE < 9140500) {
                        FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                        if (!AppLovinSdkUtils.isValidString(string)) {
                            string = "no_body_banner_template";
                        }
                        maxNativeAdView = facebookMediationAdapter.createMaxNativeAdView(build, string, activity);
                    } else {
                        FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                        if (!AppLovinSdkUtils.isValidString(string)) {
                            string = "media_banner_template";
                        }
                        maxNativeAdView = facebookMediationAdapter2.createMaxNativeAdView(build, string, activity);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!(build.getIconView() == null || maxNativeAdView.getIconContentView() == null)) {
                        arrayList.add(maxNativeAdView.getIconContentView());
                    }
                    Object mediaContentViewGroup = AppLovinSdk.VERSION_CODE >= 11000000 ? maxNativeAdView.getMediaContentViewGroup() : maxNativeAdView.getMediaContentView();
                    if (!(build.getMediaView() == null || mediaContentViewGroup == null)) {
                        arrayList.add(mediaContentViewGroup);
                    }
                    if (AppLovinSdkUtils.isValidString(build.getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                        arrayList.add(maxNativeAdView.getTitleTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(build.getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                        arrayList.add(maxNativeAdView.getCallToActionButton());
                    }
                    if (AppLovinSdkUtils.isValidString(build.getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
                        arrayList.add(maxNativeAdView.getAdvertiserTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(build.getBody()) && maxNativeAdView.getBodyTextView() != null) {
                        arrayList.add(maxNativeAdView.getBodyTextView());
                    }
                    FacebookMediationAdapter.this.mNativeAd.registerViewForInteraction((View) maxNativeAdView, mediaView2, mediaView, (List<View>) arrayList);
                    NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdView);
                }
            });
        }
    }

    private class MaxNativeAdListener implements NativeAdListener {
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final Bundle serverParameters;

        MaxNativeAdListener(Bundle bundle, Context context2, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = bundle;
            this.context = context2;
            this.listener = maxNativeAdAdapterListener;
        }

        public void onAdLoaded(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native ad loaded: " + ad.getPlacementId());
            final NativeAdBase access$600 = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (access$600 == null || access$600 != ad) {
                FacebookMediationAdapter.this.log("Native ad failed to load: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
            } else if (access$600.isAdInvalidated()) {
                FacebookMediationAdapter.this.log("Native ad failed to load: ad is no longer valid");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.AD_EXPIRED);
            } else if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(access$600.getAdHeadline())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        final MediaView mediaView = new MediaView(MaxNativeAdListener.this.context);
                        Drawable preloadedIconViewDrawable = access$600.getPreloadedIconViewDrawable();
                        final NativeAdBase.Image adIcon = access$600.getAdIcon();
                        if (preloadedIconViewDrawable != null) {
                            MaxNativeAdListener maxNativeAdListener = MaxNativeAdListener.this;
                            maxNativeAdListener.handleNativeAdLoaded(access$600, preloadedIconViewDrawable, mediaView, maxNativeAdListener.context);
                        } else if (adIcon != null) {
                            FacebookMediationAdapter.this.getCachingExecutorService().execute(new Runnable() {
                                public void run() {
                                    Drawable drawable = null;
                                    if (AppLovinSdkUtils.isValidString(adIcon.getUrl())) {
                                        FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                                        facebookMediationAdapter.log("Adding native ad icon (" + adIcon.getUrl() + ") to queue to be fetched");
                                        Future<Drawable> createDrawableFuture = FacebookMediationAdapter.this.createDrawableFuture(adIcon.getUrl(), MaxNativeAdListener.this.context.getResources());
                                        int i = BundleUtils.getInt("image_task_timeout_seconds", 10, MaxNativeAdListener.this.serverParameters);
                                        if (createDrawableFuture != null) {
                                            try {
                                                drawable = createDrawableFuture.get((long) i, TimeUnit.SECONDS);
                                            } catch (Throwable th) {
                                                FacebookMediationAdapter.this.mo15010e("Image fetching tasks failed", th);
                                            }
                                        }
                                    }
                                    MaxNativeAdListener.this.handleNativeAdLoaded(access$600, drawable, mediaView, MaxNativeAdListener.this.context);
                                }
                            });
                        } else {
                            FacebookMediationAdapter.this.log("No native ad icon (optional) available for the current creative.");
                            MaxNativeAdListener maxNativeAdListener2 = MaxNativeAdListener.this;
                            maxNativeAdListener2.handleNativeAdLoaded(access$600, (Drawable) null, mediaView, maxNativeAdListener2.context);
                        }
                    }
                });
            } else {
                FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                facebookMediationAdapter2.mo15009e("Native ad (" + access$600 + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
            }
        }

        public void onMediaDownloaded(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native ad successfully downloaded media: " + ad.getPlacementId());
        }

        public void onError(C4033Ad ad, AdError adError) {
            MaxAdapterError access$100 = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native ad (" + ad.getPlacementId() + ") failed to load with error (" + access$100);
            this.listener.onNativeAdLoadFailed(access$100);
        }

        public void onLoggingImpression(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native shown: " + ad.getPlacementId());
            this.listener.onNativeAdDisplayed((Bundle) null);
        }

        public void onAdClicked(C4033Ad ad) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            facebookMediationAdapter.log("Native clicked: " + ad.getPlacementId());
            this.listener.onNativeAdClicked();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleNativeAdLoaded(com.facebook.ads.NativeAdBase r6, android.graphics.drawable.Drawable r7, com.facebook.ads.MediaView r8, android.content.Context r9) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof com.facebook.ads.NativeAd
                r1 = 0
                if (r0 == 0) goto L_0x001d
                com.facebook.ads.NativeAdBase$Image r2 = r6.getAdCoverImage()
                if (r2 == 0) goto L_0x001d
                com.facebook.ads.NativeAdBase$Image r2 = r6.getAdCoverImage()
                java.lang.String r2 = r2.getUrl()
                android.net.Uri r2 = android.net.Uri.parse(r2)
                com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r3 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                r3.<init>((android.net.Uri) r2)
                goto L_0x001e
            L_0x001d:
                r3 = r1
            L_0x001e:
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = new com.applovin.mediation.nativeAds.MaxNativeAd$Builder
                r2.<init>()
                com.applovin.mediation.MaxAdFormat r4 = com.applovin.mediation.MaxAdFormat.NATIVE
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = r2.setAdFormat(r4)
                java.lang.String r4 = r6.getAdHeadline()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = r2.setTitle(r4)
                java.lang.String r4 = r6.getAdvertiserName()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = r2.setAdvertiser(r4)
                java.lang.String r4 = r6.getAdBodyText()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = r2.setBody(r4)
                java.lang.String r4 = r6.getAdCallToAction()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = r2.setCallToAction(r4)
                com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r4 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                r4.<init>((android.graphics.drawable.Drawable) r7)
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = r2.setIcon(r4)
                com.facebook.ads.AdOptionsView r4 = new com.facebook.ads.AdOptionsView
                r4.<init>(r9, r6, r1)
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r2 = r2.setOptionsView(r4)
                if (r0 == 0) goto L_0x0067
                int r0 = com.applovin.sdk.AppLovinSdk.VERSION_CODE
                r4 = 11040399(0xa8768f, float:1.5470894E-38)
                if (r0 < r4) goto L_0x0067
                r2.setMainImage(r3)
            L_0x0067:
                r0 = 0
                boolean r6 = r6 instanceof com.facebook.ads.NativeBannerAd
                if (r6 == 0) goto L_0x0083
                android.widget.ImageView r6 = new android.widget.ImageView
                r6.<init>(r9)
                r6.setImageDrawable(r7)
                r2.setMediaView(r6)
                if (r7 == 0) goto L_0x0092
                int r6 = r7.getIntrinsicWidth()
                float r6 = (float) r6
                int r7 = r7.getIntrinsicHeight()
                goto L_0x008f
            L_0x0083:
                r2.setMediaView(r8)
                int r6 = r8.getMediaWidth()
                float r6 = (float) r6
                int r7 = r8.getMediaHeight()
            L_0x008f:
                float r7 = (float) r7
                float r0 = r6 / r7
            L_0x0092:
                int r6 = com.applovin.sdk.AppLovinSdk.VERSION_CODE
                r7 = 11040000(0xa87500, float:1.5470335E-38)
                if (r6 < r7) goto L_0x009c
                r2.setMediaContentAspectRatio(r0)
            L_0x009c:
                com.applovin.mediation.adapters.FacebookMediationAdapter$MaxFacebookNativeAd r6 = new com.applovin.mediation.adapters.FacebookMediationAdapter$MaxFacebookNativeAd
                com.applovin.mediation.adapters.FacebookMediationAdapter r7 = com.applovin.mediation.adapters.FacebookMediationAdapter.this
                r6.<init>(r2)
                com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener r7 = r5.listener
                r7.onNativeAdLoaded(r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.handleNativeAdLoaded(com.facebook.ads.NativeAdBase, android.graphics.drawable.Drawable, com.facebook.ads.MediaView, android.content.Context):void");
        }
    }

    private class MaxFacebookNativeAd extends MaxNativeAd {
        private MaxFacebookNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        public void prepareViewForInteraction(final MaxNativeAdView maxNativeAdView) {
            final NativeAdBase access$600 = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (access$600 == null) {
                FacebookMediationAdapter.this.mo15009e("Failed to register native ad views: native ad is null.");
                return;
            }
            final ArrayList arrayList = new ArrayList();
            if (AppLovinSdkUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (AppLovinSdkUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
                arrayList.add(maxNativeAdView.getAdvertiserTextView());
            }
            if (AppLovinSdkUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (AppLovinSdkUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (!(getIcon() == null || maxNativeAdView.getIconImageView() == null)) {
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            if (!(getMediaView() == null || maxNativeAdView.getMediaContentViewGroup() == null)) {
                arrayList.add(maxNativeAdView.getMediaContentViewGroup());
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    NativeAdBase nativeAdBase = access$600;
                    if (!(nativeAdBase instanceof NativeBannerAd)) {
                        ((NativeAd) nativeAdBase).registerViewForInteraction((View) maxNativeAdView, (MediaView) MaxFacebookNativeAd.this.getMediaView(), (MediaView) MaxFacebookNativeAd.this.getIconView(), (List<View>) arrayList);
                    } else if (maxNativeAdView.getIconImageView() != null) {
                        MaxNativeAdView maxNativeAdView = maxNativeAdView;
                        ((NativeBannerAd) access$600).registerViewForInteraction((View) maxNativeAdView, maxNativeAdView.getIconImageView(), (List<View>) arrayList);
                    } else if (MaxFacebookNativeAd.this.getMediaView() != null) {
                        ((NativeBannerAd) access$600).registerViewForInteraction((View) maxNativeAdView, (ImageView) MaxFacebookNativeAd.this.getMediaView(), (List<View>) arrayList);
                    } else {
                        FacebookMediationAdapter.this.mo15009e("Failed to register native ad view for interaction: icon image view and media view are null");
                    }
                }
            });
        }
    }
}
