package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
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
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class GoogleMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus status;
    /* access modifiers changed from: private */
    public AdView adView;
    /* access modifiers changed from: private */
    public InterstitialAd interstitialAd;
    /* access modifiers changed from: private */
    public NativeAd nativeAd;
    /* access modifiers changed from: private */
    public NativeAdView nativeAdView;
    /* access modifiers changed from: private */
    public RewardedAd rewardedAd;
    /* access modifiers changed from: private */
    public RewardedAdListener rewardedAdListener;
    /* access modifiers changed from: private */
    public RewardedInterstitialAd rewardedInterstitialAd;
    /* access modifiers changed from: private */
    public RewardedInterstitialAdListener rewardedInterstitialAdListener;

    public String getAdapterVersion() {
        return "21.0.0.2";
    }

    public GoogleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        log("Initializing Google SDK...");
        if (initialized.compareAndSet(false, true)) {
            Context context = getContext(activity);
            MobileAds.disableMediationAdapterInitialization(context);
            if (maxAdapterInitializationParameters.getServerParameters().getBoolean("init_without_callback", false)) {
                status = MaxAdapter.InitializationStatus.DOES_NOT_APPLY;
                MobileAds.initialize(context);
                onCompletionListener.onCompletion(status, (String) null);
                return;
            }
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            MobileAds.initialize(context, new OnInitializationCompleteListener() {
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                    AdapterStatus adapterStatus = initializationStatus.getAdapterStatusMap().get("com.google.android.gms.ads.MobileAds");
                    AdapterStatus.State initializationState = adapterStatus != null ? adapterStatus.getInitializationState() : null;
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    googleMediationAdapter.log("Initialization complete with status " + initializationState);
                    MaxAdapter.InitializationStatus unused = GoogleMediationAdapter.status = AdapterStatus.State.READY == initializationState ? MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS : MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
                    onCompletionListener.onCompletion(GoogleMediationAdapter.status, (String) null);
                }
            });
            return;
        }
        onCompletionListener.onCompletion(status, (String) null);
    }

    public String getSdkVersion() {
        if (status != null) {
            return String.valueOf(MobileAds.getVersion());
        }
        return getAdapterVersion().substring(0, getAdapterVersion().lastIndexOf(46));
    }

    public void onDestroy() {
        log("Destroy called for adapter " + this);
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.setFullScreenContentCallback((FullScreenContentCallback) null);
            this.interstitialAd = null;
        }
        RewardedInterstitialAd rewardedInterstitialAd2 = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd2 != null) {
            rewardedInterstitialAd2.setFullScreenContentCallback((FullScreenContentCallback) null);
            this.rewardedInterstitialAd = null;
            this.rewardedInterstitialAdListener = null;
        }
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.setFullScreenContentCallback((FullScreenContentCallback) null);
            this.rewardedAd = null;
            this.rewardedAdListener = null;
        }
        AdView adView2 = this.adView;
        if (adView2 != null) {
            adView2.destroy();
            this.adView = null;
        }
        NativeAd nativeAd2 = this.nativeAd;
        if (nativeAd2 != null) {
            nativeAd2.destroy();
            this.nativeAd = null;
        }
        NativeAdView nativeAdView2 = this.nativeAdView;
        if (nativeAdView2 != null) {
            nativeAdView2.destroy();
            this.nativeAdView = null;
        }
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        setRequestConfiguration(maxAdapterSignalCollectionParameters);
        Context context = getContext(activity);
        QueryInfo.generate(context, toAdFormat(maxAdapterSignalCollectionParameters), createAdRequestWithParameters(true, maxAdapterSignalCollectionParameters.getAdFormat(), maxAdapterSignalCollectionParameters, context), new QueryInfoGenerationCallback() {
            public void onSuccess(QueryInfo queryInfo) {
                GoogleMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(queryInfo.getQuery());
            }

            public void onFailure(String str) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Signal collection failed with error: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }
        });
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("interstitial ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        InterstitialAd.load(activity, thirdPartyAdPlacementId, createAdRequestWithParameters(isValidString, MaxAdFormat.INTERSTITIAL, maxAdapterResponseParameters, activity), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Interstitial ad loaded: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
                InterstitialAd unused = GoogleMediationAdapter.this.interstitialAd = interstitialAd;
                GoogleMediationAdapter.this.interstitialAd.setFullScreenContentCallback(new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener));
                ResponseInfo responseInfo = GoogleMediationAdapter.this.interstitialAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdk.VERSION_CODE < 9150000 || !AppLovinSdkUtils.isValidString(responseId)) {
                    maxInterstitialAdapterListener.onInterstitialAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, responseId);
                maxInterstitialAdapterListener.onInterstitialAdLoaded(bundle);
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError access$200 = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + access$200);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(access$200);
            }
        });
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.show(activity);
            return;
        }
        log("Interstitial ad failed to show: " + thirdPartyAdPlacementId);
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("rewarded interstitial ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        RewardedInterstitialAd.load((Context) activity, thirdPartyAdPlacementId, createAdRequestWithParameters(isValidString, MaxAdFormat.REWARDED_INTERSTITIAL, maxAdapterResponseParameters, activity), (RewardedInterstitialAdLoadCallback) new RewardedInterstitialAdLoadCallback() {
            public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded interstitial ad loaded: " + thirdPartyAdPlacementId);
                RewardedInterstitialAd unused = GoogleMediationAdapter.this.rewardedInterstitialAd = rewardedInterstitialAd;
                String str = null;
                RewardedInterstitialAdListener unused2 = GoogleMediationAdapter.this.rewardedInterstitialAdListener = new RewardedInterstitialAdListener(thirdPartyAdPlacementId, maxRewardedInterstitialAdapterListener);
                GoogleMediationAdapter.this.rewardedInterstitialAd.setFullScreenContentCallback(GoogleMediationAdapter.this.rewardedInterstitialAdListener);
                ResponseInfo responseInfo = GoogleMediationAdapter.this.rewardedInterstitialAd.getResponseInfo();
                if (responseInfo != null) {
                    str = responseInfo.getResponseId();
                }
                if (AppLovinSdk.VERSION_CODE <= 9150000 || !AppLovinSdkUtils.isValidString(str)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded(bundle);
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError access$200 = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + access$200);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoadFailed(access$200);
            }
        });
    }

    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded interstitial ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (this.rewardedInterstitialAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedInterstitialAd.show(activity, new OnUserEarnedRewardListener() {
                public void onUserEarnedReward(RewardItem rewardItem) {
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    googleMediationAdapter.log("Rewarded interstitial ad user earned reward: " + thirdPartyAdPlacementId);
                    boolean unused = GoogleMediationAdapter.this.rewardedInterstitialAdListener.hasGrantedReward = true;
                }
            });
            return;
        }
        log("Rewarded interstitial ad failed to show: " + thirdPartyAdPlacementId);
        maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("rewarded ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        RewardedAd.load((Context) activity, thirdPartyAdPlacementId, createAdRequestWithParameters(isValidString, MaxAdFormat.REWARDED, maxAdapterResponseParameters, activity), (RewardedAdLoadCallback) new RewardedAdLoadCallback() {
            public void onAdLoaded(RewardedAd rewardedAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded ad loaded: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
                RewardedAd unused = GoogleMediationAdapter.this.rewardedAd = rewardedAd;
                RewardedAdListener unused2 = GoogleMediationAdapter.this.rewardedAdListener = new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
                GoogleMediationAdapter.this.rewardedAd.setFullScreenContentCallback(GoogleMediationAdapter.this.rewardedAdListener);
                ResponseInfo responseInfo = GoogleMediationAdapter.this.rewardedAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdk.VERSION_CODE < 9150000 || !AppLovinSdkUtils.isValidString(responseId)) {
                    maxRewardedAdapterListener.onRewardedAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, responseId);
                maxRewardedAdapterListener.onRewardedAdLoaded(bundle);
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError access$200 = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + access$200);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(access$200);
            }
        });
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show(activity, new OnUserEarnedRewardListener() {
                public void onUserEarnedReward(RewardItem rewardItem) {
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    googleMediationAdapter.log("Rewarded ad user earned reward: " + thirdPartyAdPlacementId);
                    boolean unused = GoogleMediationAdapter.this.rewardedAdListener.hasGrantedReward = true;
                }
            });
            return;
        }
        log("Rewarded ad failed to show: " + thirdPartyAdPlacementId);
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        boolean z = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        String str = "";
        sb.append(isValidString ? "bidding " : str);
        if (z) {
            str = "native ";
        }
        sb.append(str);
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for placement id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        setRequestConfiguration(maxAdapterResponseParameters);
        Context context = getContext(activity);
        AdRequest createAdRequestWithParameters = createAdRequestWithParameters(isValidString, maxAdFormat, maxAdapterResponseParameters, context);
        boolean z2 = false;
        if (z) {
            NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
            builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
            if (maxAdFormat == MaxAdFormat.MREC) {
                z2 = true;
            }
            builder.setRequestMultipleImages(z2);
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener);
            new AdLoader.Builder(context, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdViewListener).withAdListener(nativeAdViewListener).build().loadAd(createAdRequestWithParameters);
            return;
        }
        AdView adView2 = new AdView(context);
        this.adView = adView2;
        adView2.setAdUnitId(thirdPartyAdPlacementId);
        this.adView.setAdListener(new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener));
        this.adView.setAdSize(toAdSize(maxAdFormat, maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false), context));
        this.adView.loadAd(createAdRequestWithParameters);
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append(" native ad for placement id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        setRequestConfiguration(maxAdapterResponseParameters);
        Context applicationContext = activity != null ? activity.getApplicationContext() : getApplicationContext();
        AdRequest createAdRequestWithParameters = createAdRequestWithParameters(isValidString, MaxAdFormat.NATIVE, maxAdapterResponseParameters, applicationContext);
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
        builder.setRequestMultipleImages(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters()).contains("medium"));
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, applicationContext, maxNativeAdAdapterListener);
        new AdLoader.Builder(applicationContext, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdListener).withAdListener(nativeAdListener).build().loadAd(createAdRequestWithParameters);
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(AdError adError) {
        int code = adError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code != 0) {
            if (code != 1) {
                if (code != 2) {
                    if (code != 3) {
                        switch (code) {
                            case 8:
                            case 11:
                                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                        }
                    }
                    maxAdapterError = MaxAdapterError.NO_FILL;
                } else {
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                }
            }
            maxAdapterError = MaxAdapterError.BAD_REQUEST;
        } else {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), code, adError.getMessage());
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat, boolean z, Context context) {
        if (maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER) {
            if (!z) {
                return maxAdFormat == MaxAdFormat.BANNER ? AdSize.BANNER : AdSize.LEADERBOARD;
            }
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels));
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.MEDIUM_RECTANGLE;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    private AdFormat toAdFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (maxAdapterSignalCollectionParameters.getServerParameters().getBoolean("is_native") || adFormat == MaxAdFormat.NATIVE) {
            return AdFormat.NATIVE;
        }
        if (adFormat.isAdViewAd()) {
            return AdFormat.BANNER;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return AdFormat.INTERSTITIAL;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return AdFormat.REWARDED;
        }
        if (adFormat == MaxAdFormat.REWARDED_INTERSTITIAL) {
            return AdFormat.REWARDED_INTERSTITIAL;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + adFormat);
    }

    private void setRequestConfiguration(MaxAdapterParameters maxAdapterParameters) {
        RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            builder.setTagForChildDirectedTreatment(privacySetting.booleanValue() ? 1 : 0);
        }
        String string = maxAdapterParameters.getServerParameters().getString("test_device_ids", (String) null);
        if (!TextUtils.isEmpty(string)) {
            builder.setTestDeviceIds(Arrays.asList(string.split(",")));
        }
        MobileAds.setRequestConfiguration(builder.build());
    }

    private AdRequest createAdRequestWithParameters(boolean z, MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters, Context context) {
        Boolean privacySetting;
        Boolean privacySetting2;
        AdRequest.Builder builder = new AdRequest.Builder();
        Bundle bundle = new Bundle(6);
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        if (z) {
            bundle.putString("query_info_type", "requester_type_2");
            if (AppLovinSdk.VERSION_CODE >= 11000000 && maxAdFormat.isAdViewAd()) {
                Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner");
                if ((obj instanceof String) && "true".equalsIgnoreCase((String) obj)) {
                    AdSize adSize = toAdSize(maxAdFormat, true, context);
                    bundle.putInt("adaptive_banner_w", adSize.getWidth());
                    bundle.putInt("adaptive_banner_h", adSize.getHeight());
                }
            }
            if (maxAdapterParameters instanceof MaxAdapterResponseParameters) {
                String bidResponse = ((MaxAdapterResponseParameters) maxAdapterParameters).getBidResponse();
                if (AppLovinSdkUtils.isValidString(bidResponse)) {
                    builder.setAdString(bidResponse);
                }
            }
        }
        if (serverParameters.getBoolean("set_mediation_identifier", true)) {
            builder.setRequestAgent("applovin");
        }
        String string = BundleUtils.getString("event_id", serverParameters);
        if (AppLovinSdkUtils.isValidString(string)) {
            bundle.putString("placement_req_id", string);
        }
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterParameters)) != null && !privacySetting2.booleanValue()) {
            bundle.putString("npa", "1");
        }
        if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterParameters)) != null && privacySetting.booleanValue()) {
            bundle.putInt("rdp", 1);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("gad_rdp", 1).commit();
        }
        if (AppLovinSdk.VERSION_CODE >= 11000000) {
            Map<String, Object> localExtraParameters = maxAdapterParameters.getLocalExtraParameters();
            Object obj2 = localExtraParameters.get("google_max_ad_content_rating");
            if (obj2 instanceof String) {
                bundle.putString("max_ad_content_rating", (String) obj2);
            }
            Object obj3 = localExtraParameters.get("google_content_url");
            if (obj3 instanceof String) {
                builder.setContentUrl((String) obj3);
            }
            Object obj4 = localExtraParameters.get("google_neighbouring_content_url_strings");
            if (obj4 instanceof List) {
                try {
                    builder.setNeighboringContentUrls((List) obj4);
                } catch (Throwable th) {
                    mo15010e("Neighbouring content URL strings extra param needs to be of type List<String>.", th);
                }
            }
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    private static void updateMuteState(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters.containsKey("is_muted")) {
            MobileAds.setAppMuted(serverParameters.getBoolean("is_muted"));
        }
    }

    private int getAdChoicesPlacement(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        if (AppLovinSdk.VERSION_CODE < 11000000) {
            return 1;
        }
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        Object obj = localExtraParameters != null ? localExtraParameters.get("admob_ad_choices_placement") : null;
        if (isValidAdChoicesPlacement(obj)) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    private boolean isValidAdChoicesPlacement(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private class InterstitialAdListener extends FullScreenContentCallback {
        private final MaxInterstitialAdapterListener listener;
        private final String placementId;

        InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.placementId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad shown: " + this.placementId);
            this.listener.onInterstitialAdDisplayed();
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad clicked: " + this.placementId);
            this.listener.onInterstitialAdClicked();
        }

        public void onAdDismissedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad hidden: " + this.placementId);
            this.listener.onInterstitialAdHidden();
        }
    }

    private class RewardedInterstitialAdListener extends FullScreenContentCallback {
        /* access modifiers changed from: private */
        public boolean hasGrantedReward;
        private final MaxRewardedInterstitialAdapterListener listener;
        private final String placementId;

        private RewardedInterstitialAdListener(String str, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
            this.placementId = str;
            this.listener = maxRewardedInterstitialAdapterListener;
        }

        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded interstitial ad shown: " + this.placementId);
            this.listener.onRewardedInterstitialAdDisplayed();
            this.listener.onRewardedInterstitialAdVideoStarted();
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded interstitial ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onRewardedInterstitialAdDisplayFailed(maxAdapterError);
        }

        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded interstitial ad clicked: " + this.placementId);
            this.listener.onRewardedInterstitialAdClicked();
        }

        public void onAdDismissedFullScreenContent() {
            this.listener.onRewardedInterstitialAdVideoCompleted();
            if (this.hasGrantedReward || GoogleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = GoogleMediationAdapter.this.getReward();
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded interstitial ad rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
            googleMediationAdapter2.log("Rewarded interstitial ad hidden: " + this.placementId);
            this.listener.onRewardedInterstitialAdHidden();
        }
    }

    private class RewardedAdListener extends FullScreenContentCallback {
        /* access modifiers changed from: private */
        public boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final String placementId;

        RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.placementId = str;
            this.listener = maxRewardedAdapterListener;
        }

        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded ad shown: " + this.placementId);
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded ad clicked: " + this.placementId);
            this.listener.onRewardedAdClicked();
        }

        public void onAdDismissedFullScreenContent() {
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || GoogleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = GoogleMediationAdapter.this.getReward();
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
            googleMediationAdapter2.log("Rewarded ad hidden: " + this.placementId);
            this.listener.onRewardedAdHidden();
        }
    }

    private class AdViewListener extends AdListener {
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;

        AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        public void onAdLoaded() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad loaded: " + this.placementId);
            if (AppLovinSdk.VERSION_CODE >= 9150000) {
                Bundle bundle = new Bundle(3);
                ResponseInfo responseInfo = GoogleMediationAdapter.this.adView.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdkUtils.isValidString(responseId)) {
                    bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, responseId);
                }
                AdSize adSize = GoogleMediationAdapter.this.adView.getAdSize();
                if (adSize != null) {
                    bundle.putInt("ad_width", adSize.getWidth());
                    bundle.putInt("ad_height", adSize.getHeight());
                }
                this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.adView, bundle);
                return;
            }
            this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.adView);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError access$200 = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad (" + this.placementId + ") failed to load with error code: " + access$200);
            this.listener.onAdViewAdLoadFailed(access$200);
        }

        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad shown: " + this.placementId);
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdOpened() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdClicked();
        }

        public void onAdClosed() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad closed");
        }
    }

    private class NativeAdViewListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        public void onNativeAdLoaded(NativeAd nativeAd) {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad loaded: " + this.placementId);
            if (TextUtils.isEmpty(nativeAd.getHeadline())) {
                GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                googleMediationAdapter2.log("Native " + this.adFormat.getLabel() + " ad failed to load: Google native ad is missing one or more required assets");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                nativeAd.destroy();
                return;
            }
            NativeAd unused = GoogleMediationAdapter.this.nativeAd = nativeAd;
            final Activity activity = (Activity) this.activityRef.get();
            final Context access$1200 = GoogleMediationAdapter.this.getContext(activity);
            final MediaView mediaView = new MediaView(access$1200);
            MediaContent mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null) {
                mediaView.setMediaContent(mediaContent);
            }
            NativeAd.Image icon = nativeAd.getIcon();
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = null;
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(icon.getDrawable());
                } else {
                    maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(icon.getUri());
                }
            }
            final MaxNativeAd build = new MaxNativeAd.Builder().setAdFormat(this.adFormat).setIcon(maxNativeAdImage).setTitle(nativeAd.getHeadline()).setBody(nativeAd.getBody()).setMediaView(mediaView).setCallToAction(nativeAd.getCallToAction()).build();
            final String string = BundleUtils.getString("template", "", this.serverParameters);
            if (string.contains("vertical") && AppLovinSdk.VERSION_CODE < 9140500) {
                GoogleMediationAdapter.this.log("Vertical native banners are only supported on MAX SDK 9.14.5 and above. Default horizontal native template will be used.");
            }
            final NativeAd nativeAd2 = nativeAd;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    MaxNativeAdView maxNativeAdView;
                    if (AppLovinSdk.VERSION_CODE < 9140000) {
                        GoogleMediationAdapter.this.log("Native ads with media views are only supported on MAX SDK version 9.14.0 and above. Default native template will be used.");
                        maxNativeAdView = new MaxNativeAdView(build, activity);
                    } else if (AppLovinSdk.VERSION_CODE >= 11010000) {
                        maxNativeAdView = new MaxNativeAdView(build, string, access$1200);
                    } else {
                        maxNativeAdView = new MaxNativeAdView(build, string, activity);
                    }
                    NativeAdView unused = GoogleMediationAdapter.this.nativeAdView = new NativeAdView(access$1200);
                    GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconContentView());
                    GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                    GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                    GoogleMediationAdapter.this.nativeAdView.setMediaView(mediaView);
                    GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                    GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd2);
                    GoogleMediationAdapter.this.nativeAdView.addView(maxNativeAdView);
                    ResponseInfo responseInfo = nativeAd2.getResponseInfo();
                    String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                    if (AppLovinSdk.VERSION_CODE < 9150000 || !AppLovinSdkUtils.isValidString(responseId)) {
                        NativeAdViewListener.this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView);
                        return;
                    }
                    Bundle bundle = new Bundle(1);
                    bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, responseId);
                    NativeAdViewListener.this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView, bundle);
                }
            });
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError access$200 = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad (" + this.placementId + ") failed to load with error: " + access$200);
            this.listener.onAdViewAdLoadFailed(access$200);
        }

        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad shown");
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        public void onAdOpened() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdExpanded();
        }

        public void onAdClosed() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad closed");
            this.listener.onAdViewAdCollapsed();
        }
    }

    private class NativeAdListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context2, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context2;
            this.listener = maxNativeAdAdapterListener;
        }

        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native ad loaded: " + this.placementId);
            NativeAd unused = GoogleMediationAdapter.this.nativeAd = nativeAd;
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(nativeAd.getHeadline())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        Drawable drawable;
                        MediaView mediaView;
                        float f;
                        MaxNativeAd.MaxNativeAdImage maxNativeAdImage;
                        MediaContent mediaContent = nativeAd.getMediaContent();
                        List<NativeAd.Image> images = nativeAd.getImages();
                        String str = null;
                        if (mediaContent != null) {
                            MediaView mediaView2 = new MediaView(NativeAdListener.this.context);
                            mediaView2.setMediaContent(mediaContent);
                            drawable = mediaContent.getMainImage();
                            f = mediaContent.getAspectRatio();
                            mediaView = mediaView2;
                        } else {
                            if (images != null && images.size() > 0) {
                                ImageView imageView = new ImageView(NativeAdListener.this.context);
                                Drawable drawable2 = images.get(0).getDrawable();
                                if (drawable2 != null) {
                                    imageView.setImageDrawable(drawable2);
                                    f = ((float) drawable2.getIntrinsicWidth()) / ((float) drawable2.getIntrinsicHeight());
                                    drawable = null;
                                    mediaView = imageView;
                                }
                            }
                            f = 0.0f;
                            mediaView = null;
                            drawable = null;
                        }
                        NativeAd.Image icon = nativeAd.getIcon();
                        if (icon != null) {
                            maxNativeAdImage = icon.getDrawable() != null ? new MaxNativeAd.MaxNativeAdImage(icon.getDrawable()) : new MaxNativeAd.MaxNativeAdImage(icon.getUri());
                        } else {
                            maxNativeAdImage = null;
                        }
                        MaxNativeAd.Builder callToAction = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setIcon(maxNativeAdImage).setTitle(nativeAd.getHeadline()).setAdvertiser(nativeAd.getAdvertiser()).setBody(nativeAd.getBody()).setMediaView(mediaView).setCallToAction(nativeAd.getCallToAction());
                        if (AppLovinSdk.VERSION_CODE >= 11040399) {
                            callToAction.setMainImage(new MaxNativeAd.MaxNativeAdImage(drawable));
                        }
                        if (AppLovinSdk.VERSION_CODE >= 11040000) {
                            callToAction.setMediaContentAspectRatio(f);
                        }
                        MaxGoogleNativeAd maxGoogleNativeAd = new MaxGoogleNativeAd(callToAction);
                        ResponseInfo responseInfo = nativeAd.getResponseInfo();
                        if (responseInfo != null) {
                            str = responseInfo.getResponseId();
                        }
                        Bundle bundle = new Bundle(1);
                        bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str);
                        NativeAdListener.this.listener.onNativeAdLoaded(maxGoogleNativeAd, bundle);
                    }
                });
                return;
            }
            GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
            googleMediationAdapter2.mo15009e("Native ad (" + nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError access$200 = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native ad (" + this.placementId + ") failed to load with error: " + access$200);
            this.listener.onNativeAdLoadFailed(access$200);
        }

        public void onAdImpression() {
            GoogleMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed((Bundle) null);
        }

        public void onAdClicked() {
            GoogleMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        public void onAdOpened() {
            GoogleMediationAdapter.this.log("Native ad opened");
        }

        public void onAdClosed() {
            GoogleMediationAdapter.this.log("Native ad closed");
        }
    }

    private class MaxGoogleNativeAd extends MaxNativeAd {
        public MaxGoogleNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            if (GoogleMediationAdapter.this.nativeAd == null) {
                GoogleMediationAdapter.this.mo15009e("Failed to register native ad views: native ad is null.");
                return;
            }
            NativeAdView unused = GoogleMediationAdapter.this.nativeAdView = new NativeAdView(maxNativeAdView.getContext());
            View mainView = maxNativeAdView.getMainView();
            maxNativeAdView.removeView(mainView);
            GoogleMediationAdapter.this.nativeAdView.addView(mainView);
            maxNativeAdView.addView(GoogleMediationAdapter.this.nativeAdView);
            GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
            GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
            GoogleMediationAdapter.this.nativeAdView.setAdvertiserView(maxNativeAdView.getAdvertiserTextView());
            GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
            GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
            View mediaView = getMediaView();
            if (mediaView instanceof MediaView) {
                GoogleMediationAdapter.this.nativeAdView.setMediaView((MediaView) mediaView);
            } else if (mediaView instanceof ImageView) {
                GoogleMediationAdapter.this.nativeAdView.setImageView(mediaView);
            }
            GoogleMediationAdapter.this.nativeAdView.setNativeAd(GoogleMediationAdapter.this.nativeAd);
        }
    }
}
