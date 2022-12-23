package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.mediation.MaxAdFormat;
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
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class UnityAdsMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus initializationStatus;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private BannerView bannerView;
    private String biddingAdId;

    public String getAdapterVersion() {
        return "4.2.1.0";
    }

    public UnityAdsMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        Context context = getContext(activity);
        updatePrivacyConsent(maxAdapterInitializationParameters, context);
        if (initialized.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("game_id", (String) null);
            log("Initializing UnityAds SDK with game id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            initializationStatus = MaxAdapter.InitializationStatus.INITIALIZING;
            MediationMetaData mediationMetaData = new MediationMetaData(context);
            mediationMetaData.setName("MAX");
            mediationMetaData.setVersion(AppLovinSdk.VERSION);
            mediationMetaData.set(TapjoyConstants.TJC_ADAPTER_VERSION, (Object) getAdapterVersion());
            mediationMetaData.commit();
            UnityAds.setDebugMode(maxAdapterInitializationParameters.isTesting());
            UnityAds.initialize(context, string, maxAdapterInitializationParameters.isTesting(), new IUnityAdsInitializationListener() {
                public void onInitializationComplete() {
                    UnityAdsMediationAdapter.this.log("UnityAds SDK initialized");
                    MaxAdapter.InitializationStatus unused = UnityAdsMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS, (String) null);
                }

                public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
                    UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                    unityAdsMediationAdapter.log("UnityAds SDK failed to initialize with error: " + str);
                    MaxAdapter.InitializationStatus unused = UnityAdsMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE, str);
                }
            });
            return;
        }
        log("UnityAds SDK already initialized");
        onCompletionListener.onCompletion(initializationStatus, (String) null);
    }

    public String getSdkVersion() {
        return UnityAds.getVersion();
    }

    public void onDestroy() {
        BannerView bannerView2 = this.bannerView;
        if (bannerView2 != null) {
            bannerView2.destroy();
            this.bannerView = null;
        }
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        UnityAds.getToken(new IUnityAdsTokenListener() {
            public void onUnityAdsTokenReady(String str) {
                UnityAdsMediationAdapter.this.log("Collected signal");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append("interstitial ad for placement \"");
        sb.append(thirdPartyAdPlacementId);
        sb.append("\"...");
        log(sb.toString());
        updatePrivacyConsent(maxAdapterResponseParameters, activity.getApplicationContext());
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            this.biddingAdId = UUID.randomUUID().toString();
        }
        UnityAds.load(thirdPartyAdPlacementId, createAdLoadOptions(maxAdapterResponseParameters), new IUnityAdsLoadListener() {
            public void onUnityAdsAdLoaded(String str) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Interstitial placement \"" + str + "\" loaded");
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }

            public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Interstitial placement \"" + str + "\" failed to load with error: " + unityAdsLoadError + ": " + str2);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(UnityAdsMediationAdapter.toMaxError(unityAdsLoadError, str2));
            }
        });
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for placement \"" + thirdPartyAdPlacementId + "\"...");
        UnityAds.show(activity, thirdPartyAdPlacementId, createAdShowOptions(), new IUnityAdsShowListener() {
            public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Interstitial placement \"" + str + "\" failed to display with error: " + unityAdsShowError + ": " + str2);
                maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", unityAdsShowError.ordinal(), str2));
            }

            public void onUnityAdsShowStart(String str) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Interstitial placement \"" + str + "\" displayed");
                maxInterstitialAdapterListener.onInterstitialAdDisplayed();
            }

            public void onUnityAdsShowClick(String str) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Interstitial placement \"" + str + "\" clicked");
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }

            public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Interstitial placement \"" + str + "\" hidden with completion state: " + unityAdsShowCompletionState);
                maxInterstitialAdapterListener.onInterstitialAdHidden();
            }
        });
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append("rewarded ad for placement \"");
        sb.append(thirdPartyAdPlacementId);
        sb.append("\"...");
        log(sb.toString());
        updatePrivacyConsent(maxAdapterResponseParameters, activity.getApplicationContext());
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            this.biddingAdId = UUID.randomUUID().toString();
        }
        UnityAds.load(thirdPartyAdPlacementId, createAdLoadOptions(maxAdapterResponseParameters), new IUnityAdsLoadListener() {
            public void onUnityAdsAdLoaded(String str) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Rewarded ad placement \"" + str + "\" loaded");
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }

            public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Rewarded ad placement \"" + str + "\" failed to load with error: " + unityAdsLoadError + ": " + str2);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(UnityAdsMediationAdapter.toMaxError(unityAdsLoadError, str2));
            }
        });
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for placement \"" + thirdPartyAdPlacementId + "\"...");
        configureReward(maxAdapterResponseParameters);
        UnityAds.show(activity, thirdPartyAdPlacementId, createAdShowOptions(), new IUnityAdsShowListener() {
            public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Rewarded ad placement \"" + str + "\" failed to display with error: " + unityAdsShowError + ": " + str2);
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", unityAdsShowError.ordinal(), str2));
            }

            public void onUnityAdsShowStart(String str) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Rewarded ad placement \"" + str + "\" displayed");
                maxRewardedAdapterListener.onRewardedAdDisplayed();
                maxRewardedAdapterListener.onRewardedAdVideoStarted();
            }

            public void onUnityAdsShowClick(String str) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Rewarded ad placement \"" + str + "\" clicked");
                maxRewardedAdapterListener.onRewardedAdClicked();
            }

            public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                UnityAdsMediationAdapter unityAdsMediationAdapter = UnityAdsMediationAdapter.this;
                unityAdsMediationAdapter.log("Rewarded ad placement \"" + str + "\" hidden with completion state: " + unityAdsShowCompletionState);
                maxRewardedAdapterListener.onRewardedAdVideoCompleted();
                if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED || UnityAdsMediationAdapter.this.shouldAlwaysRewardUser()) {
                    maxRewardedAdapterListener.onUserRewarded(UnityAdsMediationAdapter.this.getReward());
                }
                maxRewardedAdapterListener.onRewardedAdHidden();
            }
        });
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading banner ad for placement \"" + thirdPartyAdPlacementId + "\"...");
        if (activity == null) {
            log("Banner ad load failed: Activity is null");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(new MaxAdapterError(-5601, "Missing Activity"));
            return;
        }
        updatePrivacyConsent(maxAdapterResponseParameters, activity.getApplicationContext());
        BannerView bannerView2 = new BannerView(activity, thirdPartyAdPlacementId, toUnityBannerSize(maxAdFormat));
        this.bannerView = bannerView2;
        bannerView2.setListener(new BannerView.IListener() {
            public void onBannerLoaded(BannerView bannerView) {
                UnityAdsMediationAdapter.this.log("Banner ad loaded");
                maxAdViewAdapterListener.onAdViewAdLoaded(bannerView);
            }

            public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
                UnityAdsMediationAdapter.this.log("Banner ad failed to load");
                maxAdViewAdapterListener.onAdViewAdLoadFailed(UnityAdsMediationAdapter.toMaxError(bannerErrorInfo));
            }

            public void onBannerClick(BannerView bannerView) {
                UnityAdsMediationAdapter.this.log("Banner ad clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onBannerLeftApplication(BannerView bannerView) {
                UnityAdsMediationAdapter.this.log("Banner ad left application");
            }
        });
        this.bannerView.load();
    }

    private UnityAdsLoadOptions createAdLoadOptions(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (AppLovinSdkUtils.isValidString(bidResponse) && AppLovinSdkUtils.isValidString(this.biddingAdId)) {
            unityAdsLoadOptions.setObjectId(this.biddingAdId);
            unityAdsLoadOptions.setAdMarkup(bidResponse);
        }
        return unityAdsLoadOptions;
    }

    private UnityAdsShowOptions createAdShowOptions() {
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        if (AppLovinSdkUtils.isValidString(this.biddingAdId)) {
            unityAdsShowOptions.setObjectId(this.biddingAdId);
        }
        return unityAdsShowOptions;
    }

    private UnityBannerSize toUnityBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return new UnityBannerSize(320, 50);
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return new UnityBannerSize(728, 90);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(BannerErrorInfo bannerErrorInfo) {
        MaxAdapterError maxAdapterError;
        if (bannerErrorInfo.errorCode == BannerErrorCode.NO_FILL) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (bannerErrorInfo.errorCode == BannerErrorCode.NATIVE_ERROR) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (bannerErrorInfo.errorCode == BannerErrorCode.WEBVIEW_ERROR) {
            maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), bannerErrorInfo.errorCode.ordinal(), bannerErrorInfo.errorMessage);
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        int i = C21708.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i == 1) {
            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
        } else if (i == 2) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (i == 3) {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        } else if (i == 4) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (i == 5) {
            maxAdapterError = MaxAdapterError.TIMEOUT;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), unityAdsLoadError.ordinal(), str);
    }

    /* renamed from: com.applovin.mediation.adapters.UnityAdsMediationAdapter$8 */
    static /* synthetic */ class C21708 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsShowError[] r0 = com.unity3d.ads.UnityAds.UnityAdsShowError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = r0
                r1 = 1
                com.unity3d.ads.UnityAds$UnityAdsShowError r2 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.ads.UnityAds$UnityAdsShowError r3 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r4 = com.unity3d.ads.UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r5 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch:{ NoSuchFieldError -> 0x003e }
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.unity3d.ads.UnityAds$UnityAdsLoadError[] r5 = com.unity3d.ads.UnityAds.UnityAdsLoadError.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = r5
                com.unity3d.ads.UnityAds$UnityAdsLoadError r6 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x006f }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r5 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch:{ NoSuchFieldError -> 0x008d }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.UnityAdsMediationAdapter.C21708.<clinit>():void");
        }
    }

    private static MaxAdapterError toMaxError(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (C21708.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 2:
                maxAdapterError = MaxAdapterError.AD_NOT_READY;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
                break;
            case 4:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 5:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 6:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
            case 7:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), unityAdsShowError.ordinal(), str);
    }

    private void updatePrivacyConsent(MaxAdapterParameters maxAdapterParameters, Context context) {
        Boolean privacySetting;
        Boolean privacySetting2;
        MetaData metaData = new MetaData(context);
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterParameters)) != null) {
            metaData.set("gdpr.consent", (Object) privacySetting2);
            metaData.commit();
        }
        if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterParameters)) != null) {
            metaData.set("privacy.consent", (Object) Boolean.valueOf(!privacySetting.booleanValue()));
            metaData.commit();
        }
        metaData.set("privacy.mode", (Object) "mixed");
        metaData.commit();
        Boolean privacySetting3 = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting3 != null) {
            metaData.set("user.nonbehavioral", (Object) privacySetting3);
            metaData.commit();
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

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }
}
