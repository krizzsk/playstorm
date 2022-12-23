package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
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
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
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
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ByteDanceMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final int ABNORMAL_MATERIAL_DATA_ERROR = 104;
    private static final int ADSLOT_EMPTY = 40004;
    private static final int ADSLOT_ID_ERROR = 40006;
    private static final int ADSLOT_SIZE_EMPTY = 40005;
    private static final int AD_DATA_ERROR = -4;
    private static final int APP_EMPTY = 40002;
    private static final int BANNER_AD_LOAD_IMAGE_ERROR = -5;
    private static final int CONTENT_TYPE = 40000;
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 10;
    private static final int ERROR_ACCESS_METHOD_API_SDK = 40017;
    private static final int ERROR_ACCESS_METHOD_PASS = 40012;
    private static final int ERROR_ADTYPE_DIFFER = 40019;
    private static final int ERROR_AD_TYPE = 40011;
    private static final int ERROR_APK_SIGN_CHECK_ERROR = 40021;
    private static final int ERROR_CODE_ADCOUNT_ERROR = 40007;
    private static final int ERROR_CODE_CLICK_EVENT_ERROR = 60002;
    private static final int ERROR_IMAGE_SIZE = 40008;
    private static final int ERROR_MEDIA_ID = 40009;
    private static final int ERROR_MEDIA_TYPE = 40010;
    private static final int ERROR_NEW_REGISTER_LIMIT = 40020;
    private static final int ERROR_ORIGIN_AD_ERROR = 40022;
    private static final int ERROR_PACKAGE_NAME = 40018;
    private static final int ERROR_REDIRECT = 40014;
    private static final int ERROR_REQUEST_INVALID = 40015;
    private static final int ERROR_SLOT_ID_APP_ID_DIFFER = 40016;
    private static final int ERROR_SPLASH_AD_TYPE = 40013;
    private static final int ERROR_TEMPLATE_METHODS = 40029;
    private static final int ERROR_UNION_OS_ERROR = 40023;
    private static final int ERROR_UNION_SDK_NOT_INSTALLED = 40025;
    private static final int ERROR_UNION_SDK_TOO_OLD = 40024;
    private static final int ERROR_VERIFY_REWARD = 60007;
    private static final int FAIL_PARSE_RENDERING_RESULT_DATA_ERROR = 101;
    private static final int FREQUENT_CALL_ERROR = -8;
    private static final int INSERT_AD_LOAD_IMAGE_ERROR = -6;
    private static final int INVALID_MAIN_TEMPLATE_ERROR = 102;
    private static final int INVALID_TEMPLATE_DIFFERENCE_ERROR = 103;
    private static final int NET_ERROR = -2;
    private static final int NO_AD = 20001;
    private static final int NO_AD_PARSE = -3;

    /* renamed from: OK */
    private static final int f4130OK = 20000;
    private static final int PARSE_FAIL = -1;
    private static final int RENDERING_ERROR = 106;
    private static final int RENDERING_TIMEOUT_ERROR = 107;
    private static final int REQUEST_BODY_ERROR = -9;
    private static final int REQUEST_PB_ERROR = 40001;
    private static final int ROR_CODE_SHOW_EVENT_ERROR = 60001;
    private static final int SPLASH_AD_LOAD_IMAGE_ERROR = -7;
    private static final int SPLASH_CACHE_EXPIRED_ERROR = -11;
    private static final int SPLASH_CACHE_PARSE_ERROR = -10;
    private static final int SPLASH_NOT_HAVE_CACHE_ERROR = -12;
    private static final int SYS_ERROR = 50001;
    private static final int TEMPLATE_DATA_PARSING_ERROR = 105;
    private static final int WAP_EMPTY = 40003;
    /* access modifiers changed from: private */
    public static final ExecutorService executor = Executors.newCachedThreadPool();
    private static final AtomicBoolean initialized = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus status;
    /* access modifiers changed from: private */
    public TTNativeExpressAd expressAdViewAd;
    /* access modifiers changed from: private */
    public TTFullScreenVideoAd interstitialAd;
    private InterstitialAdListener interstitialAdListener;
    /* access modifiers changed from: private */
    public TTFeedAd nativeAd;
    /* access modifiers changed from: private */
    public NativeAdListener nativeAdListener;
    /* access modifiers changed from: private */
    public TTRewardVideoAd rewardedAd;
    private RewardedAdListener rewardedAdListener;

    /* access modifiers changed from: private */
    public boolean isVideoMediaView(int i) {
        return i == 5 || i == 50 || i == 15;
    }

    public String getAdapterVersion() {
        return "4.5.0.4.1";
    }

    public ByteDanceMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        Boolean privacySetting;
        Boolean privacySetting2;
        if (initialized.compareAndSet(false, true)) {
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            Bundle serverParameters = maxAdapterInitializationParameters.getServerParameters();
            String string = serverParameters.getString("app_id");
            log("Initializing SDK with app id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            TTAdConfig.Builder builder = new TTAdConfig.Builder();
            builder.data(createAdConfigData(serverParameters, true));
            if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterInitializationParameters)) != null) {
                builder.setGDPR(privacySetting2.booleanValue() ? 1 : 0);
            }
            Boolean privacySetting3 = getPrivacySetting("isAgeRestrictedUser", maxAdapterInitializationParameters);
            if (privacySetting3 != null) {
                builder.coppa(privacySetting3.booleanValue() ? 1 : 0);
            }
            if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterInitializationParameters)) != null) {
                builder.setCCPA(privacySetting.booleanValue() ? 1 : 0);
            }
            TTAdSdk.init(getContext(activity), builder.appId(string).debug(maxAdapterInitializationParameters.isTesting()).supportMultiProcess(false).build(), new TTAdSdk.InitCallback() {
                public void success() {
                    ByteDanceMediationAdapter.this.log("SDK initialized");
                    MaxAdapter.InitializationStatus unused = ByteDanceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(ByteDanceMediationAdapter.status, (String) null);
                }

                public void fail(int i, String str) {
                    ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
                    byteDanceMediationAdapter.log("SDK failed to initialize with code: " + i + " and message: " + str);
                    MaxAdapter.InitializationStatus unused = ByteDanceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(ByteDanceMediationAdapter.status, str);
                }
            });
            return;
        }
        log("attempted initialization already - marking initialization as completed");
        onCompletionListener.onCompletion(status, (String) null);
    }

    public String getSdkVersion() {
        return TTAdSdk.getAdManager().getSDKVersion();
    }

    public void onDestroy() {
        this.interstitialAdListener = null;
        this.interstitialAd = null;
        this.rewardedAdListener = null;
        this.rewardedAd = null;
        TTNativeExpressAd tTNativeExpressAd = this.expressAdViewAd;
        if (tTNativeExpressAd != null) {
            tTNativeExpressAd.destroy();
            this.expressAdViewAd = null;
        }
        this.nativeAd = null;
        this.nativeAdListener = null;
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        if (status != MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS) {
            log("Could not collect signal. SDK not initialized.");
            maxSignalCollectionListener.onSignalCollectionFailed("Could not collect signal. SDK not initialized.");
            return;
        }
        maxSignalCollectionListener.onSignalCollected(TTAdSdk.getAdManager().getBiddingToken());
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("interstitial ad for code id \"");
        sb.append(thirdPartyAdPlacementId);
        sb.append("\"...");
        log(sb.toString());
        updateAdConfig(maxAdapterResponseParameters);
        AdSlot.Builder adCount = new AdSlot.Builder().setCodeId(thirdPartyAdPlacementId).setImageAcceptedSize(1080, 1920).setSupportDeepLink(true).setAdCount(1);
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            adCount.withBid(bidResponse);
        }
        this.interstitialAdListener = new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener);
        TTAdSdk.getAdManager().createAdNative(getContext(activity)).loadFullScreenVideoAd(adCount.build(), this.interstitialAdListener);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for code id \"" + thirdPartyAdPlacementId + "\"...");
        this.interstitialAd.setFullScreenVideoAdInteractionListener(this.interstitialAdListener);
        this.interstitialAd.showFullScreenVideoAd(activity);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("rewarded ad for code id \"");
        sb.append(thirdPartyAdPlacementId);
        sb.append("\"...");
        log(sb.toString());
        updateAdConfig(maxAdapterResponseParameters);
        AdSlot.Builder userID = new AdSlot.Builder().setCodeId(thirdPartyAdPlacementId).setImageAcceptedSize(1080, 1920).setSupportDeepLink(true).setAdCount(1).setUserID(getWrappingSdk().getUserIdentifier());
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            userID.withBid(bidResponse);
        }
        this.rewardedAdListener = new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
        TTAdSdk.getAdManager().createAdNative(getContext(activity)).loadRewardVideoAd(userID.build(), this.rewardedAdListener);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for code id \"" + thirdPartyAdPlacementId + "\"...");
        configureReward(maxAdapterResponseParameters);
        this.rewardedAd.setRewardAdInteractionListener(this.rewardedAdListener);
        this.rewardedAd.showRewardVideoAd(activity);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        boolean z = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        String str = "";
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : str);
        if (z) {
            str = "native ";
        }
        sb.append(str);
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for code id \"");
        sb.append(thirdPartyAdPlacementId);
        sb.append("\"...");
        log(sb.toString());
        updateAdConfig(maxAdapterResponseParameters);
        AppLovinSdkUtils.Size size = maxAdFormat.getSize();
        AdSlot.Builder adCount = new AdSlot.Builder().setCodeId(thirdPartyAdPlacementId).setExpressViewAcceptedSize((float) size.getWidth(), (float) size.getHeight()).setSupportDeepLink(true).setAdCount(1);
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            adCount.withBid(bidResponse);
        }
        TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(getContext(activity));
        if (z) {
            createAdNative.loadFeedAd(adCount.build(), new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener));
        } else {
            createAdNative.loadBannerExpressAd(adCount.build(), new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener));
        }
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("native ad for code id \"");
        sb.append(thirdPartyAdPlacementId);
        sb.append("\"...");
        log(sb.toString());
        updateAdConfig(maxAdapterResponseParameters);
        if (AppLovinSdk.VERSION_CODE < 11010000) {
            log("Failing ad load for AppLovin SDK < 11.1.0 which requires an Activity context");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.UNSPECIFIED);
            return;
        }
        AdSlot.Builder adCount = new AdSlot.Builder().setCodeId(thirdPartyAdPlacementId).setImageAcceptedSize(640, 320).setSupportDeepLink(true).setAdCount(1);
        if (isValidString) {
            adCount.withBid(bidResponse);
        }
        this.nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
        TTAdSdk.getAdManager().createAdNative(getContext(activity)).loadFeedAd(adCount.build(), this.nativeAdListener);
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
    public Callable<Drawable> createDrawableTask(final String str, final Resources resources) {
        return new Callable<Drawable>() {
            public Drawable call() throws Exception {
                return new BitmapDrawable(resources, BitmapFactory.decodeStream(new URL(str).openStream()));
            }
        };
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(int i, String str) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (i != 20000) {
            if (i != NO_AD) {
                if (!(i == ERROR_TEMPLATE_METHODS || i == SYS_ERROR || i == ERROR_VERIFY_REWARD)) {
                    switch (i) {
                        case -12:
                        case -10:
                        case -9:
                        case -8:
                        case -7:
                        case -6:
                        case -5:
                        case -4:
                        case -3:
                        case -1:
                            break;
                        case -11:
                            maxAdapterError = MaxAdapterError.AD_EXPIRED;
                            break;
                        case -2:
                            maxAdapterError = MaxAdapterError.NO_CONNECTION;
                            break;
                        default:
                            switch (i) {
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                    break;
                                default:
                                    switch (i) {
                                        case 40000:
                                        case REQUEST_PB_ERROR /*40001*/:
                                        case APP_EMPTY /*40002*/:
                                        case WAP_EMPTY /*40003*/:
                                        case ADSLOT_EMPTY /*40004*/:
                                        case ADSLOT_SIZE_EMPTY /*40005*/:
                                        case ADSLOT_ID_ERROR /*40006*/:
                                        case ERROR_CODE_ADCOUNT_ERROR /*40007*/:
                                        case ERROR_IMAGE_SIZE /*40008*/:
                                        case ERROR_MEDIA_ID /*40009*/:
                                        case ERROR_MEDIA_TYPE /*40010*/:
                                        case ERROR_AD_TYPE /*40011*/:
                                        case ERROR_ACCESS_METHOD_PASS /*40012*/:
                                        case ERROR_SPLASH_AD_TYPE /*40013*/:
                                        case ERROR_REDIRECT /*40014*/:
                                        case ERROR_REQUEST_INVALID /*40015*/:
                                        case ERROR_SLOT_ID_APP_ID_DIFFER /*40016*/:
                                        case ERROR_ACCESS_METHOD_API_SDK /*40017*/:
                                        case ERROR_PACKAGE_NAME /*40018*/:
                                        case ERROR_ADTYPE_DIFFER /*40019*/:
                                        case ERROR_NEW_REGISTER_LIMIT /*40020*/:
                                        case ERROR_APK_SIGN_CHECK_ERROR /*40021*/:
                                        case ERROR_ORIGIN_AD_ERROR /*40022*/:
                                        case ERROR_UNION_OS_ERROR /*40023*/:
                                        case ERROR_UNION_SDK_TOO_OLD /*40024*/:
                                        case ERROR_UNION_SDK_NOT_INSTALLED /*40025*/:
                                            break;
                                        default:
                                            switch (i) {
                                                case ROR_CODE_SHOW_EVENT_ERROR /*60001*/:
                                                case ERROR_CODE_CLICK_EVENT_ERROR /*60002*/:
                                                    break;
                                            }
                                    }
                            }
                    }
                }
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
            } else {
                maxAdapterError = MaxAdapterError.NO_FILL;
            }
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i, str);
        }
        throw new IllegalStateException("Returned error code for success");
    }

    /* access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private String createAdConfigData(Bundle bundle, Boolean bool) {
        if (bool.booleanValue()) {
            return String.format("[{\"name\":\"mediation\",\"value\":\"MAX\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", new Object[]{getAdapterVersion()});
        }
        return String.format("[{\"name\":\"mediation\",\"value\":\"MAX\"},{\"name\":\"adapter_version\",\"value\":\"%s\"},{\"name\":\"hybrid_id\",\"value\":\"%s\"}]", new Object[]{getAdapterVersion(), BundleUtils.getString("event_id", bundle)});
    }

    private void updateAdConfig(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        TTAdConfig.Builder builder = new TTAdConfig.Builder();
        builder.data(createAdConfigData(maxAdapterResponseParameters.getServerParameters(), false));
        TTAdSdk.updateAdConfig(builder.build());
    }

    private class InterstitialAdListener implements TTAdNative.FullScreenVideoAdListener, TTFullScreenVideoAd.FullScreenVideoAdInteractionListener {
        private final String codeId;
        private final MaxInterstitialAdapterListener listener;

        InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.codeId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
            TTFullScreenVideoAd unused = ByteDanceMediationAdapter.this.interstitialAd = tTFullScreenVideoAd;
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad loaded: " + this.codeId);
            this.listener.onInterstitialAdLoaded();
        }

        public void onError(int i, String str) {
            MaxAdapterError access$200 = ByteDanceMediationAdapter.toMaxError(i, str);
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad (" + this.codeId + ") failed to load with error: " + access$200);
            this.listener.onInterstitialAdLoadFailed(access$200);
        }

        public void onFullScreenVideoCached() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad cached: " + this.codeId);
        }

        public void onAdShow() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad displayed: " + this.codeId);
            this.listener.onInterstitialAdDisplayed();
        }

        public void onAdVideoBarClick() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad clicked: " + this.codeId);
            this.listener.onInterstitialAdClicked();
        }

        public void onAdClose() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad hidden: " + this.codeId);
            this.listener.onInterstitialAdHidden();
        }

        public void onVideoComplete() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad video completed: " + this.codeId);
        }

        public void onSkippedVideo() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Interstitial ad skipped: " + this.codeId);
        }
    }

    private class RewardedAdListener implements TTAdNative.RewardVideoAdListener, TTRewardVideoAd.RewardAdInteractionListener {
        private final String codeId;
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.codeId = str;
            this.listener = maxRewardedAdapterListener;
        }

        public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
            TTRewardVideoAd unused = ByteDanceMediationAdapter.this.rewardedAd = tTRewardVideoAd;
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad loaded: " + this.codeId);
            this.listener.onRewardedAdLoaded();
        }

        public void onError(int i, String str) {
            MaxAdapterError access$200 = ByteDanceMediationAdapter.toMaxError(i, str);
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad (" + this.codeId + ") failed to load with error: " + access$200);
            this.listener.onRewardedAdLoadFailed(access$200);
        }

        public void onRewardVideoCached() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad cached: " + this.codeId);
        }

        public void onAdShow() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad displayed: " + this.codeId);
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onVideoError() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad failed to display: " + this.codeId);
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        }

        public void onAdVideoBarClick() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad clicked: " + this.codeId);
            this.listener.onRewardedAdClicked();
        }

        public void onAdClose() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad hidden: " + this.codeId);
            if (this.hasGrantedReward || ByteDanceMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = ByteDanceMediationAdapter.this.getReward();
                ByteDanceMediationAdapter byteDanceMediationAdapter2 = ByteDanceMediationAdapter.this;
                byteDanceMediationAdapter2.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        public void onVideoComplete() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad video completed: " + this.codeId);
            this.listener.onRewardedAdVideoCompleted();
        }

        public void onRewardVerify(boolean z, int i, String str, int i2, String str2) {
            if (z) {
                ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
                byteDanceMediationAdapter.log("Rewarded user with reward: " + i + " " + str);
                this.hasGrantedReward = true;
                return;
            }
            ByteDanceMediationAdapter byteDanceMediationAdapter2 = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter2.log("Failed to reward user with error: " + i2 + " " + str2);
        }

        public void onSkippedVideo() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Rewarded ad video skipped: " + this.codeId);
        }
    }

    private class AdViewListener implements TTAdNative.NativeExpressAdListener, TTNativeExpressAd.ExpressAdInteractionListener {
        private final MaxAdFormat adFormat;
        private final String codeId;
        private final MaxAdViewAdapterListener listener;

        AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.codeId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
            if (list == null || list.isEmpty()) {
                ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
                byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad (" + this.codeId + ") failed to load: no fill");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            ByteDanceMediationAdapter byteDanceMediationAdapter2 = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter2.log(this.adFormat.getLabel() + " ad (" + this.codeId + ") loaded with " + list.size() + " ads");
            TTNativeExpressAd unused = ByteDanceMediationAdapter.this.expressAdViewAd = list.get(0);
            ByteDanceMediationAdapter.this.expressAdViewAd.setExpressInteractionListener((TTNativeExpressAd.ExpressAdInteractionListener) this);
            ByteDanceMediationAdapter.this.expressAdViewAd.render();
        }

        public void onError(int i, String str) {
            MaxAdapterError access$200 = ByteDanceMediationAdapter.toMaxError(i, str);
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log(this.adFormat.getLabel() + " ad (" + this.codeId + ") failed to load with error: " + access$200);
            this.listener.onAdViewAdLoadFailed(access$200);
        }

        public void onRenderSuccess(View view, float f, float f2) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log(this.adFormat.getLabel() + " ad loaded: " + this.codeId);
            this.listener.onAdViewAdLoaded(view);
        }

        public void onRenderFail(View view, String str, int i) {
            MaxAdapterError access$200 = ByteDanceMediationAdapter.toMaxError(i, str);
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log(this.adFormat.getLabel() + " ad (" + this.codeId + ") failed to load with error: " + access$200);
            this.listener.onAdViewAdLoadFailed(access$200);
        }

        public void onAdShow(View view, int i) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log(this.adFormat.getLabel() + " ad shown: " + this.codeId);
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdClicked(View view, int i) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log(this.adFormat.getLabel() + " ad clicked: " + this.codeId);
            this.listener.onAdViewAdClicked();
        }
    }

    private class NativeAdViewListener implements TTAdNative.FeedAdListener, TTNativeAd.AdInteractionListener, TTFeedAd.VideoAdListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final String codeId;
        final MaxAdViewAdapterListener listener;
        final Bundle serverParameters;

        NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.codeId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.adFormat = maxAdFormat;
            this.activityRef = new WeakReference<>(activity);
            this.listener = maxAdViewAdapterListener;
        }

        public void onFeedAdLoad(List<TTFeedAd> list) {
            ExecutorService executorService;
            if (list == null || list.size() == 0) {
                ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
                byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad (" + this.codeId + ") failed to load: no fill");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            ByteDanceMediationAdapter byteDanceMediationAdapter2 = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter2.log("Native " + this.adFormat.getLabel() + " ad loaded: " + this.codeId + ". Preparing assets...");
            final TTFeedAd tTFeedAd = list.get(0);
            if (AppLovinSdk.VERSION_CODE >= 11000000) {
                executorService = ByteDanceMediationAdapter.this.getCachingExecutorService();
            } else {
                executorService = ByteDanceMediationAdapter.executor;
            }
            final Activity activity = (Activity) this.activityRef.get();
            final Context access$600 = ByteDanceMediationAdapter.this.getContext(activity);
            final ExecutorService executorService2 = executorService;
            executorService.execute(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:23:0x00f1  */
                /* JADX WARNING: Removed duplicated region for block: B:28:0x00fe  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0101  */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x0118  */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x012d  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x0134  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r9 = this;
                        android.content.Context r0 = r2
                        android.content.res.Resources r0 = r0.getResources()
                        com.bytedance.sdk.openadsdk.TTFeedAd r1 = r3
                        com.bytedance.sdk.openadsdk.TTImage r1 = r1.getIcon()
                        boolean r1 = r1.isValid()
                        r2 = 11000000(0xa7d8c0, float:1.5414283E-38)
                        java.lang.String r3 = ") to queue to be fetched"
                        r4 = 0
                        if (r1 == 0) goto L_0x0063
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r1 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r1 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>()
                        java.lang.String r6 = "Adding native ad icon ("
                        r5.append(r6)
                        com.bytedance.sdk.openadsdk.TTFeedAd r6 = r3
                        com.bytedance.sdk.openadsdk.TTImage r6 = r6.getIcon()
                        java.lang.String r6 = r6.getImageUrl()
                        r5.append(r6)
                        r5.append(r3)
                        java.lang.String r5 = r5.toString()
                        r1.log(r5)
                        com.bytedance.sdk.openadsdk.TTFeedAd r1 = r3
                        com.bytedance.sdk.openadsdk.TTImage r1 = r1.getIcon()
                        java.lang.String r1 = r1.getImageUrl()
                        int r5 = com.applovin.sdk.AppLovinSdk.VERSION_CODE
                        if (r5 < r2) goto L_0x0054
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r5 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r5 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        java.util.concurrent.Future r1 = r5.createDrawableFuture(r1, r0)
                        goto L_0x0064
                    L_0x0054:
                        java.util.concurrent.ExecutorService r5 = r4
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r6 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r6 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        java.util.concurrent.Callable r1 = r6.createDrawableTask(r1, r0)
                        java.util.concurrent.Future r1 = r5.submit(r1)
                        goto L_0x0064
                    L_0x0063:
                        r1 = r4
                    L_0x0064:
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r5 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r5 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        com.bytedance.sdk.openadsdk.TTFeedAd r6 = r3
                        int r6 = r6.getImageMode()
                        boolean r5 = r5.isVideoMediaView(r6)
                        if (r5 == 0) goto L_0x007c
                        com.bytedance.sdk.openadsdk.TTFeedAd r0 = r3
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r2 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        r0.setVideoAdListener(r2)
                        goto L_0x00e2
                    L_0x007c:
                        com.bytedance.sdk.openadsdk.TTFeedAd r5 = r3
                        java.util.List r5 = r5.getImageList()
                        if (r5 == 0) goto L_0x00e2
                        com.bytedance.sdk.openadsdk.TTFeedAd r5 = r3
                        java.util.List r5 = r5.getImageList()
                        int r5 = r5.size()
                        if (r5 <= 0) goto L_0x00e2
                        com.bytedance.sdk.openadsdk.TTFeedAd r5 = r3
                        java.util.List r5 = r5.getImageList()
                        r6 = 0
                        java.lang.Object r5 = r5.get(r6)
                        com.bytedance.sdk.openadsdk.TTImage r5 = (com.bytedance.sdk.openadsdk.TTImage) r5
                        boolean r6 = r5.isValid()
                        if (r6 == 0) goto L_0x00e2
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r6 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r6 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "Adding native ad media ("
                        r7.append(r8)
                        java.lang.String r8 = r5.getImageUrl()
                        r7.append(r8)
                        r7.append(r3)
                        java.lang.String r3 = r7.toString()
                        r6.log(r3)
                        java.lang.String r3 = r5.getImageUrl()
                        int r5 = com.applovin.sdk.AppLovinSdk.VERSION_CODE
                        if (r5 < r2) goto L_0x00d3
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r2 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r2 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        java.util.concurrent.Future r0 = r2.createDrawableFuture(r3, r0)
                        goto L_0x00e3
                    L_0x00d3:
                        java.util.concurrent.ExecutorService r2 = r4
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r5 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r5 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        java.util.concurrent.Callable r0 = r5.createDrawableTask(r3, r0)
                        java.util.concurrent.Future r0 = r2.submit(r0)
                        goto L_0x00e3
                    L_0x00e2:
                        r0 = r4
                    L_0x00e3:
                        r2 = 10
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r3 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        android.os.Bundle r3 = r3.serverParameters
                        java.lang.String r5 = "image_task_timeout_seconds"
                        int r2 = com.applovin.impl.sdk.utils.BundleUtils.getInt(r5, r2, r3)
                        if (r1 == 0) goto L_0x00fe
                        long r5 = (long) r2
                        java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00fb }
                        java.lang.Object r1 = r1.get(r5, r3)     // Catch:{ all -> 0x00fb }
                        android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch:{ all -> 0x00fb }
                        goto L_0x00ff
                    L_0x00fb:
                        r0 = move-exception
                        r1 = r4
                        goto L_0x010c
                    L_0x00fe:
                        r1 = r4
                    L_0x00ff:
                        if (r0 == 0) goto L_0x0115
                        long r2 = (long) r2
                        java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x010b }
                        java.lang.Object r0 = r0.get(r2, r5)     // Catch:{ all -> 0x010b }
                        android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch:{ all -> 0x010b }
                        goto L_0x0116
                    L_0x010b:
                        r0 = move-exception
                    L_0x010c:
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r2 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r2 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        java.lang.String r3 = "Image fetching tasks failed"
                        r2.mo15010e(r3, r0)
                    L_0x0115:
                        r0 = r4
                    L_0x0116:
                        if (r1 == 0) goto L_0x011d
                        com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r4 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                        r4.<init>((android.graphics.drawable.Drawable) r1)
                    L_0x011d:
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener r1 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.this
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter r1 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                        com.bytedance.sdk.openadsdk.TTFeedAd r2 = r3
                        int r2 = r2.getImageMode()
                        boolean r1 = r1.isVideoMediaView(r2)
                        if (r1 == 0) goto L_0x0134
                        com.bytedance.sdk.openadsdk.TTFeedAd r0 = r3
                        android.view.View r0 = r0.getAdView()
                        goto L_0x0144
                    L_0x0134:
                        android.widget.ImageView r1 = new android.widget.ImageView
                        android.content.Context r2 = r2
                        r1.<init>(r2)
                        if (r0 == 0) goto L_0x0143
                        r2 = r1
                        android.widget.ImageView r2 = (android.widget.ImageView) r2
                        r2.setImageDrawable(r0)
                    L_0x0143:
                        r0 = r1
                    L_0x0144:
                        com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener$1$1 r1 = new com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdViewListener$1$1
                        r1.<init>(r4, r0)
                        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.C21161.run():void");
                }
            });
        }

        public void onError(int i, String str) {
            MaxAdapterError access$200 = ByteDanceMediationAdapter.toMaxError(i, str);
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad (" + this.codeId + ") failed to load with error: " + access$200);
            this.listener.onAdViewAdLoadFailed(access$200);
        }

        public void onAdShow(TTNativeAd tTNativeAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad displayed: " + this.codeId);
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdClicked(View view, TTNativeAd tTNativeAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad clicked: " + this.codeId);
            this.listener.onAdViewAdClicked();
        }

        public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad creative clicked: " + this.codeId);
            this.listener.onAdViewAdClicked();
        }

        public void onVideoLoad(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad video loaded");
        }

        public void onVideoError(int i, int i2) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad video error: " + i);
        }

        public void onVideoAdStartPlay(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad video started playing");
        }

        public void onVideoAdPaused(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad video paused");
        }

        public void onVideoAdContinuePlay(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad video continued");
        }

        public void onProgressUpdate(long j, long j2) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad video progress updated (" + j + ") by duration (" + j2 + ")");
        }

        public void onVideoAdComplete(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad video completed");
        }
    }

    private class NativeAdListener implements TTAdNative.FeedAdListener, TTNativeAd.AdInteractionListener, TTFeedAd.VideoAdListener {
        final String codeId;
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final Bundle serverParameters;

        public void onProgressUpdate(long j, long j2) {
        }

        NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context2, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.codeId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context2;
            this.listener = maxNativeAdAdapterListener;
        }

        public void onFeedAdLoad(List<TTFeedAd> list) {
            if (list == null || list.size() == 0) {
                ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
                byteDanceMediationAdapter.log("Native ad (" + this.codeId + ") failed to load: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            ByteDanceMediationAdapter byteDanceMediationAdapter2 = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter2.log("Native ad loaded: " + this.codeId + ". Preparing assets...");
            final TTFeedAd tTFeedAd = list.get(0);
            TTFeedAd unused = ByteDanceMediationAdapter.this.nativeAd = tTFeedAd;
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(tTFeedAd.getTitle())) {
                ByteDanceMediationAdapter.this.getCachingExecutorService().execute(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d2  */
                    /* JADX WARNING: Removed duplicated region for block: B:22:0x00df  */
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e2  */
                    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fd  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r8 = this;
                            com.bytedance.sdk.openadsdk.TTFeedAd r0 = r5
                            com.bytedance.sdk.openadsdk.TTImage r0 = r0.getIcon()
                            boolean r0 = r0.isValid()
                            java.lang.String r1 = ") to queue to be fetched"
                            r2 = 0
                            if (r0 == 0) goto L_0x004f
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r0 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter r0 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Adding native ad icon ("
                            r3.append(r4)
                            com.bytedance.sdk.openadsdk.TTFeedAd r4 = r5
                            com.bytedance.sdk.openadsdk.TTImage r4 = r4.getIcon()
                            java.lang.String r4 = r4.getImageUrl()
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r3 = r3.toString()
                            r0.log(r3)
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r0 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter r0 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                            com.bytedance.sdk.openadsdk.TTFeedAd r3 = r5
                            com.bytedance.sdk.openadsdk.TTImage r3 = r3.getIcon()
                            java.lang.String r3 = r3.getImageUrl()
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r4 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            android.content.Context r4 = r4.context
                            android.content.res.Resources r4 = r4.getResources()
                            java.util.concurrent.Future r0 = r0.createDrawableFuture(r3, r4)
                            goto L_0x0050
                        L_0x004f:
                            r0 = r2
                        L_0x0050:
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r3 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter r3 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                            com.bytedance.sdk.openadsdk.TTFeedAd r4 = r5
                            int r4 = r4.getImageMode()
                            boolean r3 = r3.isVideoMediaView(r4)
                            if (r3 == 0) goto L_0x0068
                            com.bytedance.sdk.openadsdk.TTFeedAd r1 = r5
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r3 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            r1.setVideoAdListener(r3)
                            goto L_0x00c3
                        L_0x0068:
                            com.bytedance.sdk.openadsdk.TTFeedAd r3 = r5
                            java.util.List r3 = r3.getImageList()
                            if (r3 == 0) goto L_0x00c3
                            com.bytedance.sdk.openadsdk.TTFeedAd r3 = r5
                            java.util.List r3 = r3.getImageList()
                            int r3 = r3.size()
                            if (r3 <= 0) goto L_0x00c3
                            com.bytedance.sdk.openadsdk.TTFeedAd r3 = r5
                            java.util.List r3 = r3.getImageList()
                            r4 = 0
                            java.lang.Object r3 = r3.get(r4)
                            com.bytedance.sdk.openadsdk.TTImage r3 = (com.bytedance.sdk.openadsdk.TTImage) r3
                            boolean r4 = r3.isValid()
                            if (r4 == 0) goto L_0x00c3
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r4 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter r4 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder
                            r5.<init>()
                            java.lang.String r6 = "Adding native ad media ("
                            r5.append(r6)
                            java.lang.String r6 = r3.getImageUrl()
                            r5.append(r6)
                            r5.append(r1)
                            java.lang.String r1 = r5.toString()
                            r4.log(r1)
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r1 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter r1 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                            java.lang.String r3 = r3.getImageUrl()
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r4 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            android.content.Context r4 = r4.context
                            android.content.res.Resources r4 = r4.getResources()
                            java.util.concurrent.Future r1 = r1.createDrawableFuture(r3, r4)
                            goto L_0x00c4
                        L_0x00c3:
                            r1 = r2
                        L_0x00c4:
                            r3 = 10
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r4 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            android.os.Bundle r4 = r4.serverParameters
                            java.lang.String r5 = "image_task_timeout_seconds"
                            int r3 = com.applovin.impl.sdk.utils.BundleUtils.getInt(r5, r3, r4)
                            if (r0 == 0) goto L_0x00df
                            long r4 = (long) r3
                            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00dc }
                            java.lang.Object r0 = r0.get(r4, r6)     // Catch:{ all -> 0x00dc }
                            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch:{ all -> 0x00dc }
                            goto L_0x00e0
                        L_0x00dc:
                            r0 = move-exception
                            r1 = r2
                            goto L_0x00f0
                        L_0x00df:
                            r0 = r2
                        L_0x00e0:
                            if (r1 == 0) goto L_0x00fa
                            long r3 = (long) r3
                            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ec }
                            java.lang.Object r1 = r1.get(r3, r5)     // Catch:{ all -> 0x00ec }
                            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch:{ all -> 0x00ec }
                            goto L_0x00fb
                        L_0x00ec:
                            r1 = move-exception
                            r7 = r1
                            r1 = r0
                            r0 = r7
                        L_0x00f0:
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener r3 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter r3 = com.applovin.mediation.adapters.ByteDanceMediationAdapter.this
                            java.lang.String r4 = "Image fetching tasks failed"
                            r3.mo15010e(r4, r0)
                            r0 = r1
                        L_0x00fa:
                            r1 = r2
                        L_0x00fb:
                            if (r0 == 0) goto L_0x0102
                            com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r2 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                            r2.<init>((android.graphics.drawable.Drawable) r0)
                        L_0x0102:
                            com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener$1$1 r0 = new com.applovin.mediation.adapters.ByteDanceMediationAdapter$NativeAdListener$1$1
                            r0.<init>(r1, r2)
                            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.C21141.run():void");
                    }
                });
                return;
            }
            ByteDanceMediationAdapter byteDanceMediationAdapter3 = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter3.mo15009e("Native ad (" + tTFeedAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
        }

        public void onError(int i, String str) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native ad (" + this.codeId + ") failed to load with error code (" + i + ") and message: " + str);
            this.listener.onNativeAdLoadFailed(ByteDanceMediationAdapter.toMaxError(i, str));
        }

        public void onAdShow(TTNativeAd tTNativeAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native ad displayed: " + this.codeId);
            this.listener.onNativeAdDisplayed((Bundle) null);
        }

        public void onAdClicked(View view, TTNativeAd tTNativeAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native ad clicked: " + this.codeId);
            this.listener.onNativeAdClicked();
        }

        public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native ad creative clicked: " + this.codeId);
            this.listener.onNativeAdClicked();
        }

        public void onVideoLoad(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter.this.log("Native ad video loaded");
        }

        public void onVideoError(int i, int i2) {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            byteDanceMediationAdapter.log("Native ad video error: " + i);
        }

        public void onVideoAdStartPlay(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter.this.log("Native ad video started playing");
        }

        public void onVideoAdPaused(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter.this.log("Native ad video paused");
        }

        public void onVideoAdContinuePlay(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter.this.log("Native ad video continued");
        }

        public void onVideoAdComplete(TTFeedAd tTFeedAd) {
            ByteDanceMediationAdapter.this.log("Native ad video completed");
        }
    }

    private class MaxByteDanceNativeAd extends MaxNativeAd {
        public MaxByteDanceNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            TTFeedAd access$900 = ByteDanceMediationAdapter.this.nativeAd;
            if (access$900 == null) {
                ByteDanceMediationAdapter.this.mo15009e("Failed to register native ad view for interaction. Native ad is null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (AppLovinSdkUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (AppLovinSdkUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (!(getIcon() == null || maxNativeAdView.getIconImageView() == null)) {
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            if (!(getMediaView() == null || maxNativeAdView.getMediaContentViewGroup() == null)) {
                arrayList.add(maxNativeAdView.getMediaContentViewGroup());
            }
            ArrayList arrayList2 = new ArrayList();
            if (AppLovinSdkUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                arrayList2.add(maxNativeAdView.getCallToActionButton());
            }
            access$900.registerViewForInteraction(maxNativeAdView, arrayList, arrayList2, ByteDanceMediationAdapter.this.nativeAdListener);
        }
    }
}
