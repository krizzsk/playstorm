package com.applovin.mediation.adapters;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.banner.p377ad.AutoReloadInterval;
import com.smaato.sdk.banner.p377ad.BannerAdSize;
import com.smaato.sdk.banner.widget.BannerError;
import com.smaato.sdk.banner.widget.BannerView;
import com.smaato.sdk.core.Config;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.lifecycle.Lifecycling;
import com.smaato.sdk.core.log.LogLevel;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.iahb.InAppBid;
import com.smaato.sdk.iahb.InAppBiddingException;
import com.smaato.sdk.iahb.SmaatoSdkInAppBidding;
import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.Interstitial;
import com.smaato.sdk.interstitial.InterstitialAd;
import com.smaato.sdk.interstitial.InterstitialError;
import com.smaato.sdk.interstitial.InterstitialRequestError;
import com.smaato.sdk.nativead.NativeAd;
import com.smaato.sdk.nativead.NativeAdError;
import com.smaato.sdk.nativead.NativeAdRenderer;
import com.smaato.sdk.nativead.NativeAdRequest;
import com.smaato.sdk.rewarded.RewardedError;
import com.smaato.sdk.rewarded.RewardedInterstitial;
import com.smaato.sdk.rewarded.RewardedInterstitialAd;
import com.smaato.sdk.rewarded.RewardedRequestError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class SmaatoMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final SmaatoMediationAdapterRouter ROUTER;
    /* access modifiers changed from: private */
    public BannerView adView;
    private InterstitialAd interstitialAd;
    /* access modifiers changed from: private */
    public NativeAdRenderer nativeAdRenderer;
    private String placementId;
    private RewardedInterstitialAd rewardedAd;

    public String getAdapterVersion() {
        return "21.8.3.1";
    }

    static {
        if (AppLovinSdk.VERSION_CODE >= 90802) {
            ROUTER = (SmaatoMediationAdapterRouter) MediationAdapterRouter.getSharedInstance(SmaatoMediationAdapterRouter.class);
        } else {
            ROUTER = new SmaatoMediationAdapterRouter();
        }
    }

    public SmaatoMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("pub_id", "");
            log("Initializing Smaato SDK with publisher id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            SmaatoSdk.init((Application) getContext(activity), Config.builder().setLogLevel(maxAdapterInitializationParameters.isTesting() ? LogLevel.DEBUG : LogLevel.ERROR).setHttpsOnly(maxAdapterInitializationParameters.getServerParameters().getBoolean(CoreDiNames.NAME_HTTPS_ONLY)).build(), string);
            updateAgeRestrictedUser(maxAdapterInitializationParameters);
            updateLocationCollectionEnabled(maxAdapterInitializationParameters);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public String getSdkVersion() {
        return SmaatoSdk.getVersion();
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateLocationCollectionEnabled(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(SmaatoSdk.collectSignals(getContext(activity)));
    }

    public void onDestroy() {
        BannerView bannerView = this.adView;
        if (bannerView != null) {
            bannerView.setEventListener((BannerView.EventListener) null);
            this.adView.destroy();
            this.adView = null;
        }
        this.interstitialAd = null;
        this.rewardedAd = null;
        this.nativeAdRenderer = null;
        ROUTER.removeAdapter(this, this.placementId);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        updateLocationCollectionEnabled(maxAdapterResponseParameters);
        BannerView bannerView = new BannerView(getContext(activity));
        this.adView = bannerView;
        bannerView.setAutoReloadInterval(AutoReloadInterval.DISABLED);
        this.adView.setEventListener(new BannerView.EventListener() {
            public void onAdLoaded(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView loaded");
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(bannerView.getCreativeId())) {
                    maxAdViewAdapterListener.onAdViewAdLoaded(SmaatoMediationAdapter.this.adView);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, bannerView.getCreativeId());
                maxAdViewAdapterListener.onAdViewAdLoaded(SmaatoMediationAdapter.this.adView, bundle);
            }

            public void onAdFailedToLoad(BannerView bannerView, BannerError bannerError) {
                SmaatoMediationAdapter smaatoMediationAdapter = SmaatoMediationAdapter.this;
                smaatoMediationAdapter.log("AdView load failed to load with error: " + bannerError);
                maxAdViewAdapterListener.onAdViewAdLoadFailed(SmaatoMediationAdapter.toMaxError(bannerError));
            }

            public void onAdImpression(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView displayed");
                maxAdViewAdapterListener.onAdViewAdDisplayed();
            }

            public void onAdClicked(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onAdTTLExpired(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView ad expired");
            }
        });
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            AdRequestParams createBiddingAdRequestParams = createBiddingAdRequestParams(bidResponse);
            if (createBiddingAdRequestParams == null || createBiddingAdRequestParams.getUBUniqueId() == null) {
                log(maxAdFormat.getLabel() + " ad load failed: ad request null with invalid bid response");
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                return;
            }
            this.adView.loadAd(thirdPartyAdPlacementId, toAdSize(maxAdFormat), createBiddingAdRequestParams);
            return;
        }
        this.adView.loadAd(thirdPartyAdPlacementId, toAdSize(maxAdFormat));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("interstitial ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        updateLocationCollectionEnabled(maxAdapterResponseParameters);
        ROUTER.addInterstitialAdapter(this, maxInterstitialAdapterListener, thirdPartyAdPlacementId);
        InterstitialAd interstitialAd2 = ROUTER.getInterstitialAd(thirdPartyAdPlacementId);
        if (interstitialAd2 != null && interstitialAd2.isAvailableForPresentation()) {
            log("Interstitial ad already loaded for placement: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
            maxInterstitialAdapterListener.onInterstitialAdLoaded();
        } else if (AppLovinSdkUtils.isValidString(bidResponse)) {
            AdRequestParams createBiddingAdRequestParams = createBiddingAdRequestParams(bidResponse);
            if (createBiddingAdRequestParams == null || createBiddingAdRequestParams.getUBUniqueId() == null) {
                log("Interstitial load failed: ad request null with invalid bid response");
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                return;
            }
            Interstitial.loadAd(thirdPartyAdPlacementId, ROUTER, createBiddingAdRequestParams);
        } else {
            Interstitial.loadAd(thirdPartyAdPlacementId, ROUTER);
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for placement: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        ROUTER.addShowingAdapter(this);
        InterstitialAd interstitialAd2 = ROUTER.getInterstitialAd(thirdPartyAdPlacementId);
        this.interstitialAd = interstitialAd2;
        if (interstitialAd2 == null || !interstitialAd2.isAvailableForPresentation()) {
            log("Interstitial not ready.");
            ROUTER.onAdDisplayFailed(thirdPartyAdPlacementId, new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
            return;
        }
        this.interstitialAd.showAd(activity);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("rewarded ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        updateLocationCollectionEnabled(maxAdapterResponseParameters);
        ROUTER.addRewardedAdapter(this, maxRewardedAdapterListener, thirdPartyAdPlacementId);
        RewardedInterstitialAd rewardedAd2 = ROUTER.getRewardedAd(thirdPartyAdPlacementId);
        if (rewardedAd2 != null && rewardedAd2.isAvailableForPresentation()) {
            log("Rewarded ad already loaded for placement: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
            maxRewardedAdapterListener.onRewardedAdLoaded();
        } else if (AppLovinSdkUtils.isValidString(bidResponse)) {
            AdRequestParams createBiddingAdRequestParams = createBiddingAdRequestParams(bidResponse);
            if (createBiddingAdRequestParams == null || createBiddingAdRequestParams.getUBUniqueId() == null) {
                log("Rewarded ad load failed: ad request null with invalid bid response");
                maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                return;
            }
            RewardedInterstitial.loadAd(thirdPartyAdPlacementId, ROUTER, createBiddingAdRequestParams);
        } else {
            RewardedInterstitial.loadAd(thirdPartyAdPlacementId, ROUTER);
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for placement: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        ROUTER.addShowingAdapter(this);
        RewardedInterstitialAd rewardedAd2 = ROUTER.getRewardedAd(thirdPartyAdPlacementId);
        this.rewardedAd = rewardedAd2;
        if (rewardedAd2 == null || !rewardedAd2.isAvailableForPresentation()) {
            log("Rewarded ad not ready.");
            ROUTER.onAdDisplayFailed(thirdPartyAdPlacementId, new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
            return;
        }
        configureReward(maxAdapterResponseParameters);
        this.rewardedAd.showAd();
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("native ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        if (activity == null) {
            log("Native ad load failed: Activity is null");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(new MaxAdapterError(-5601, "Missing Activity"));
            return;
        }
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        updateLocationCollectionEnabled(maxAdapterResponseParameters);
        NativeAd.loadAd(Lifecycling.m32960of(activity), NativeAdRequest.builder().adSpaceId(thirdPartyAdPlacementId).shouldReturnUrlsForImageAssets(false).build(), (NativeAd.Listener) new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener));
    }

    private void updateLocationCollectionEnabled(MaxAdapterParameters maxAdapterParameters) {
        if (AppLovinSdk.VERSION_CODE >= 11000000) {
            Object obj = maxAdapterParameters.getLocalExtraParameters().get("is_location_collection_enabled");
            if (obj instanceof Boolean) {
                log("Setting location collection enabled: " + obj);
                SmaatoSdk.setGPSEnabled(((Boolean) obj).booleanValue());
            }
        }
    }

    private void updateAgeRestrictedUser(MaxAdapterParameters maxAdapterParameters) {
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            SmaatoSdk.setCoppa(privacySetting.booleanValue());
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
        return activity != null ? activity.getApplication() : getApplicationContext();
    }

    private BannerAdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return BannerAdSize.XX_LARGE_320x50;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return BannerAdSize.MEDIUM_RECTANGLE_300x250;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return BannerAdSize.LEADERBOARD_728x90;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(BannerError bannerError) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (C21602.$SwitchMap$com$smaato$sdk$banner$widget$BannerError[bannerError.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 2:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 4:
            case 5:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 6:
                maxAdapterError = MaxAdapterError.AD_EXPIRED;
                break;
            case 7:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), bannerError.ordinal(), bannerError.name());
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(NativeAdError nativeAdError) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        int i = C21602.$SwitchMap$com$smaato$sdk$nativead$NativeAdError[nativeAdError.ordinal()];
        if (i == 1) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (i == 2) {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        } else if (i == 3) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (i == 4 || i == 5) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), nativeAdError.ordinal(), nativeAdError.name());
    }

    private AdRequestParams createBiddingAdRequestParams(String str) {
        try {
            return AdRequestParams.builder().setUBUniqueId(SmaatoSdkInAppBidding.saveBid(InAppBid.create(str))).build();
        } catch (InAppBiddingException e) {
            log("Error occurred in saving pre-bid: " + str, e);
            return null;
        }
    }

    private class NativeAdListener implements NativeAd.Listener {
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

        public void onAdLoaded(final NativeAd nativeAd, final NativeAdRenderer nativeAdRenderer) {
            SmaatoMediationAdapter smaatoMediationAdapter = SmaatoMediationAdapter.this;
            smaatoMediationAdapter.log("Native ad loaded: " + this.placementId);
            NativeAdRenderer unused = SmaatoMediationAdapter.this.nativeAdRenderer = nativeAdRenderer;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:20:0x00e3  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r7 = this;
                        com.smaato.sdk.nativead.NativeAdRenderer r0 = r5
                        com.smaato.sdk.nativead.NativeAdAssets r0 = r0.getAssets()
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r1 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        android.os.Bundle r1 = r1.serverParameters
                        java.lang.String r2 = "template"
                        java.lang.String r3 = ""
                        java.lang.String r1 = com.applovin.impl.sdk.utils.BundleUtils.getString(r2, r3, r1)
                        boolean r1 = com.applovin.sdk.AppLovinSdkUtils.isValidString(r1)
                        if (r1 == 0) goto L_0x0052
                        java.lang.String r1 = r0.title()
                        boolean r1 = android.text.TextUtils.isEmpty(r1)
                        if (r1 == 0) goto L_0x0052
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r0 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        com.applovin.mediation.adapters.SmaatoMediationAdapter r0 = com.applovin.mediation.adapters.SmaatoMediationAdapter.this
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Native ad ("
                        r1.append(r2)
                        com.smaato.sdk.nativead.NativeAd r2 = r4
                        r1.append(r2)
                        java.lang.String r2 = ") does not have required assets."
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r0.mo15009e(r1)
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r0 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener r0 = r0.listener
                        com.applovin.mediation.adapter.MaxAdapterError r1 = new com.applovin.mediation.adapter.MaxAdapterError
                        r2 = -5400(0xffffffffffffeae8, float:NaN)
                        java.lang.String r3 = "Missing Native Ad Assets"
                        r1.<init>((int) r2, (java.lang.String) r3)
                        r0.onNativeAdLoadFailed(r1)
                        return
                    L_0x0052:
                        com.smaato.sdk.nativead.NativeAdAssets$Image r1 = r0.icon()
                        r2 = 0
                        if (r1 == 0) goto L_0x0071
                        com.smaato.sdk.nativead.NativeAdAssets$Image r1 = r0.icon()
                        android.graphics.drawable.Drawable r1 = r1.drawable()
                        if (r1 == 0) goto L_0x0071
                        com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r1 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                        com.smaato.sdk.nativead.NativeAdAssets$Image r3 = r0.icon()
                        android.graphics.drawable.Drawable r3 = r3.drawable()
                        r1.<init>((android.graphics.drawable.Drawable) r3)
                        goto L_0x0072
                    L_0x0071:
                        r1 = r2
                    L_0x0072:
                        java.util.List r3 = r0.images()
                        int r3 = r3.size()
                        if (r3 <= 0) goto L_0x00a7
                        java.util.List r3 = r0.images()
                        r4 = 0
                        java.lang.Object r3 = r3.get(r4)
                        com.smaato.sdk.nativead.NativeAdAssets$Image r3 = (com.smaato.sdk.nativead.NativeAdAssets.Image) r3
                        android.graphics.drawable.Drawable r4 = r3.drawable()
                        if (r4 == 0) goto L_0x00a7
                        android.widget.ImageView r4 = new android.widget.ImageView
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r5 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        android.content.Context r5 = r5.context
                        r4.<init>(r5)
                        android.graphics.drawable.Drawable r5 = r3.drawable()
                        r4.setImageDrawable(r5)
                        com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r5 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                        android.graphics.drawable.Drawable r3 = r3.drawable()
                        r5.<init>((android.graphics.drawable.Drawable) r3)
                        goto L_0x00a9
                    L_0x00a7:
                        r4 = r2
                        r5 = r4
                    L_0x00a9:
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r3 = new com.applovin.mediation.nativeAds.MaxNativeAd$Builder
                        r3.<init>()
                        com.applovin.mediation.MaxAdFormat r6 = com.applovin.mediation.MaxAdFormat.NATIVE
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r3 = r3.setAdFormat(r6)
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r1 = r3.setIcon(r1)
                        java.lang.String r3 = r0.title()
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r1 = r1.setTitle(r3)
                        java.lang.String r3 = r0.sponsored()
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r1 = r1.setAdvertiser(r3)
                        java.lang.String r3 = r0.text()
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r1 = r1.setBody(r3)
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r1 = r1.setMediaView(r4)
                        java.lang.String r0 = r0.cta()
                        com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r1.setCallToAction(r0)
                        int r1 = com.applovin.sdk.AppLovinSdk.VERSION_CODE
                        r3 = 11040399(0xa8768f, float:1.5470894E-38)
                        if (r1 < r3) goto L_0x00e6
                        r0.setMainImage(r5)
                    L_0x00e6:
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$MaxSmaatoNativeAd r1 = new com.applovin.mediation.adapters.SmaatoMediationAdapter$MaxSmaatoNativeAd
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r3 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        com.applovin.mediation.adapters.SmaatoMediationAdapter r3 = com.applovin.mediation.adapters.SmaatoMediationAdapter.this
                        r1.<init>(r0)
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r0 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        com.applovin.mediation.adapters.SmaatoMediationAdapter r0 = com.applovin.mediation.adapters.SmaatoMediationAdapter.this
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r4 = "Native ad fully loaded: "
                        r3.append(r4)
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r4 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        java.lang.String r4 = r4.placementId
                        r3.append(r4)
                        java.lang.String r3 = r3.toString()
                        r0.log(r3)
                        com.applovin.mediation.adapters.SmaatoMediationAdapter$NativeAdListener r0 = com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.this
                        com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener r0 = r0.listener
                        r0.onNativeAdLoaded(r1, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.SmaatoMediationAdapter.NativeAdListener.C21611.run():void");
                }
            });
        }

        public void onAdFailedToLoad(NativeAd nativeAd, NativeAdError nativeAdError) {
            MaxAdapterError access$500 = SmaatoMediationAdapter.toMaxError(nativeAdError);
            SmaatoMediationAdapter smaatoMediationAdapter = SmaatoMediationAdapter.this;
            smaatoMediationAdapter.log("Native ad (" + this.placementId + ") failed to load with error: " + access$500);
            this.listener.onNativeAdLoadFailed(access$500);
        }

        public void onAdImpressed(NativeAd nativeAd) {
            SmaatoMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed((Bundle) null);
        }

        public void onAdClicked(NativeAd nativeAd) {
            SmaatoMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        public void onTtlExpired(NativeAd nativeAd) {
            SmaatoMediationAdapter.this.log("Native ad expired");
        }
    }

    private class MaxSmaatoNativeAd extends MaxNativeAd {
        private MaxSmaatoNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            if (SmaatoMediationAdapter.this.nativeAdRenderer == null) {
                SmaatoMediationAdapter.this.mo15009e("Failed to register native ad view for interaction. Native ad renderer is null");
                return;
            }
            SmaatoMediationAdapter.this.nativeAdRenderer.registerForImpression(maxNativeAdView);
            SmaatoMediationAdapter.this.nativeAdRenderer.registerForClicks(maxNativeAdView);
        }
    }

    private static class SmaatoMediationAdapterRouter extends MediationAdapterRouter implements EventListener, com.smaato.sdk.rewarded.EventListener {
        private boolean hasGrantedReward;
        private final Map<String, InterstitialAd> interstitialAds;
        private final Object interstitialAdsLock;
        private final Map<String, RewardedInterstitialAd> rewardedAds;
        private final Object rewardedAdsLock;

        /* access modifiers changed from: package-private */
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }

        public void onAdOpened(InterstitialAd interstitialAd) {
        }

        private SmaatoMediationAdapterRouter() {
            this.interstitialAds = new HashMap();
            this.interstitialAdsLock = new Object();
            this.rewardedAds = new HashMap();
            this.rewardedAdsLock = new Object();
        }

        public InterstitialAd getInterstitialAd(String str) {
            InterstitialAd interstitialAd;
            synchronized (this.interstitialAdsLock) {
                interstitialAd = this.interstitialAds.get(str);
            }
            return interstitialAd;
        }

        public RewardedInterstitialAd getRewardedAd(String str) {
            RewardedInterstitialAd rewardedInterstitialAd;
            synchronized (this.rewardedAdsLock) {
                rewardedInterstitialAd = this.rewardedAds.get(str);
            }
            return rewardedInterstitialAd;
        }

        public void onAdLoaded(InterstitialAd interstitialAd) {
            String adSpaceId = interstitialAd.getAdSpaceId();
            synchronized (this.interstitialAdsLock) {
                this.interstitialAds.put(adSpaceId, interstitialAd);
            }
            log("Interstitial loaded for placement: " + adSpaceId + APSSharedUtil.TRUNCATE_SEPARATOR);
            onAdLoaded(adSpaceId, interstitialAd.getCreativeId());
        }

        public void onAdFailedToLoad(InterstitialRequestError interstitialRequestError) {
            String adSpaceId = interstitialRequestError.getAdSpaceId();
            log("Interstitial failed to load for placement: " + adSpaceId + "...with error: " + interstitialRequestError.getInterstitialError());
            onAdLoadFailed(adSpaceId, toMaxError(interstitialRequestError.getInterstitialError()));
        }

        public void onAdError(InterstitialAd interstitialAd, InterstitialError interstitialError) {
            log("Interstitial failed to display with error: " + interstitialError);
            if (interstitialAd != null) {
                String adSpaceId = interstitialAd.getAdSpaceId();
                synchronized (this.interstitialAdsLock) {
                    this.interstitialAds.remove(adSpaceId);
                }
                onAdDisplayFailed(adSpaceId, new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", interstitialError.ordinal(), interstitialError.name()));
            }
        }

        public void onAdImpression(InterstitialAd interstitialAd) {
            String adSpaceId = interstitialAd.getAdSpaceId();
            synchronized (this.interstitialAdsLock) {
                this.interstitialAds.remove(adSpaceId);
            }
            log("Interstitial displayed");
            onAdDisplayed(adSpaceId);
        }

        public void onAdClicked(InterstitialAd interstitialAd) {
            log("Interstitial clicked");
            onAdClicked(interstitialAd.getAdSpaceId());
        }

        public void onAdClosed(InterstitialAd interstitialAd) {
            log("Interstitial hidden");
            onAdHidden(interstitialAd.getAdSpaceId());
        }

        public void onAdTTLExpired(InterstitialAd interstitialAd) {
            log("Interstitial expired");
            synchronized (this.interstitialAdsLock) {
                this.interstitialAds.remove(interstitialAd.getAdSpaceId());
            }
        }

        private static MaxAdapterError toMaxError(InterstitialError interstitialError) {
            MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
            switch (C21602.$SwitchMap$com$smaato$sdk$interstitial$InterstitialError[interstitialError.ordinal()]) {
                case 1:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                case 2:
                    maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                    break;
                case 3:
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                    break;
                case 4:
                case 5:
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                    break;
                case 6:
                    maxAdapterError = MaxAdapterError.AD_EXPIRED;
                    break;
                case 7:
                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                    break;
            }
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), interstitialError.ordinal(), interstitialError.name());
        }

        public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
            String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
            synchronized (this.rewardedAdsLock) {
                this.rewardedAds.put(adSpaceId, rewardedInterstitialAd);
            }
            log("Rewarded ad loaded for placement: " + adSpaceId + APSSharedUtil.TRUNCATE_SEPARATOR);
            onAdLoaded(adSpaceId, rewardedInterstitialAd.getCreativeId());
        }

        public void onAdFailedToLoad(RewardedRequestError rewardedRequestError) {
            String adSpaceId = rewardedRequestError.getAdSpaceId();
            log("Rewarded ad failed to load for placement: " + adSpaceId + "...with error: " + rewardedRequestError.getRewardedError());
            onAdLoadFailed(adSpaceId, toMaxError(rewardedRequestError.getRewardedError()));
        }

        public void onAdError(RewardedInterstitialAd rewardedInterstitialAd, RewardedError rewardedError) {
            log("Rewarded ad failed to display with error: " + rewardedError);
            if (rewardedInterstitialAd != null) {
                String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
                synchronized (this.rewardedAdsLock) {
                    this.rewardedAds.remove(adSpaceId);
                }
                onAdDisplayFailed(adSpaceId, new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", rewardedError.ordinal(), rewardedError.name()));
            }
        }

        public void onAdStarted(RewardedInterstitialAd rewardedInterstitialAd) {
            String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
            synchronized (this.rewardedAdsLock) {
                this.rewardedAds.remove(adSpaceId);
            }
            log("Rewarded ad displayed");
            onAdDisplayed(adSpaceId);
            onRewardedAdVideoStarted(adSpaceId);
        }

        public void onAdClicked(RewardedInterstitialAd rewardedInterstitialAd) {
            log("Rewarded ad clicked");
            onAdClicked(rewardedInterstitialAd.getAdSpaceId());
        }

        public void onAdReward(RewardedInterstitialAd rewardedInterstitialAd) {
            log("Rewarded ad video completed");
            onRewardedAdVideoCompleted(rewardedInterstitialAd.getAdSpaceId());
            this.hasGrantedReward = true;
        }

        public void onAdClosed(RewardedInterstitialAd rewardedInterstitialAd) {
            String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
            if (this.hasGrantedReward || shouldAlwaysRewardUser(adSpaceId)) {
                MaxReward reward = getReward(adSpaceId);
                log("Rewarded user with reward: " + reward);
                onUserRewarded(adSpaceId, reward);
            }
            log("Rewarded ad hidden");
            onAdHidden(adSpaceId);
        }

        public void onAdTTLExpired(RewardedInterstitialAd rewardedInterstitialAd) {
            log("Rewarded ad expired");
            synchronized (this.rewardedAdsLock) {
                this.rewardedAds.remove(rewardedInterstitialAd.getAdSpaceId());
            }
        }

        private void onAdLoaded(String str, String str2) {
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(str2)) {
                onAdLoaded(str);
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str2);
            onAdLoaded(str, bundle);
        }

        private static MaxAdapterError toMaxError(RewardedError rewardedError) {
            MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
            switch (C21602.$SwitchMap$com$smaato$sdk$rewarded$RewardedError[rewardedError.ordinal()]) {
                case 1:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                case 2:
                    maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                    break;
                case 3:
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                    break;
                case 4:
                case 5:
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                    break;
                case 6:
                    maxAdapterError = MaxAdapterError.AD_EXPIRED;
                    break;
            }
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), rewardedError.ordinal(), rewardedError.name());
        }
    }

    /* renamed from: com.applovin.mediation.adapters.SmaatoMediationAdapter$2 */
    static /* synthetic */ class C21602 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$banner$widget$BannerError;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$interstitial$InterstitialError;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$nativead$NativeAdError;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$rewarded$RewardedError;

        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|(2:39|40)|41|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|(2:39|40)|41|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|(2:39|40)|41|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00eb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0109 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0113 */
        static {
            /*
                com.smaato.sdk.rewarded.RewardedError[] r0 = com.smaato.sdk.rewarded.RewardedError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$rewarded$RewardedError = r0
                r1 = 1
                com.smaato.sdk.rewarded.RewardedError r2 = com.smaato.sdk.rewarded.RewardedError.NO_AD_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$smaato$sdk$rewarded$RewardedError     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.rewarded.RewardedError r3 = com.smaato.sdk.rewarded.RewardedError.INVALID_REQUEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$smaato$sdk$rewarded$RewardedError     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.rewarded.RewardedError r4 = com.smaato.sdk.rewarded.RewardedError.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$smaato$sdk$rewarded$RewardedError     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.rewarded.RewardedError r5 = com.smaato.sdk.rewarded.RewardedError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$smaato$sdk$rewarded$RewardedError     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.rewarded.RewardedError r6 = com.smaato.sdk.rewarded.RewardedError.CACHE_LIMIT_REACHED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$com$smaato$sdk$rewarded$RewardedError     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.rewarded.RewardedError r7 = com.smaato.sdk.rewarded.RewardedError.CREATIVE_RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.smaato.sdk.interstitial.InterstitialError[] r6 = com.smaato.sdk.interstitial.InterstitialError.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                $SwitchMap$com$smaato$sdk$interstitial$InterstitialError = r6
                com.smaato.sdk.interstitial.InterstitialError r7 = com.smaato.sdk.interstitial.InterstitialError.NO_AD_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r6 = $SwitchMap$com$smaato$sdk$interstitial$InterstitialError     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.smaato.sdk.interstitial.InterstitialError r7 = com.smaato.sdk.interstitial.InterstitialError.INVALID_REQUEST     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r6 = $SwitchMap$com$smaato$sdk$interstitial$InterstitialError     // Catch:{ NoSuchFieldError -> 0x006e }
                com.smaato.sdk.interstitial.InterstitialError r7 = com.smaato.sdk.interstitial.InterstitialError.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x006e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r6 = $SwitchMap$com$smaato$sdk$interstitial$InterstitialError     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.interstitial.InterstitialError r7 = com.smaato.sdk.interstitial.InterstitialError.CACHE_LIMIT_REACHED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r6 = $SwitchMap$com$smaato$sdk$interstitial$InterstitialError     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.smaato.sdk.interstitial.InterstitialError r7 = com.smaato.sdk.interstitial.InterstitialError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r6 = $SwitchMap$com$smaato$sdk$interstitial$InterstitialError     // Catch:{ NoSuchFieldError -> 0x008c }
                com.smaato.sdk.interstitial.InterstitialError r7 = com.smaato.sdk.interstitial.InterstitialError.CREATIVE_RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x008c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                r6 = 7
                int[] r7 = $SwitchMap$com$smaato$sdk$interstitial$InterstitialError     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.smaato.sdk.interstitial.InterstitialError r8 = com.smaato.sdk.interstitial.InterstitialError.AD_UNLOADED     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                com.smaato.sdk.nativead.NativeAdError[] r7 = com.smaato.sdk.nativead.NativeAdError.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                $SwitchMap$com$smaato$sdk$nativead$NativeAdError = r7
                com.smaato.sdk.nativead.NativeAdError r8 = com.smaato.sdk.nativead.NativeAdError.NO_AD_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r7 = $SwitchMap$com$smaato$sdk$nativead$NativeAdError     // Catch:{ NoSuchFieldError -> 0x00b2 }
                com.smaato.sdk.nativead.NativeAdError r8 = com.smaato.sdk.nativead.NativeAdError.INVALID_REQUEST     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                int[] r7 = $SwitchMap$com$smaato$sdk$nativead$NativeAdError     // Catch:{ NoSuchFieldError -> 0x00bc }
                com.smaato.sdk.nativead.NativeAdError r8 = com.smaato.sdk.nativead.NativeAdError.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x00bc }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bc }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x00bc }
            L_0x00bc:
                int[] r7 = $SwitchMap$com$smaato$sdk$nativead$NativeAdError     // Catch:{ NoSuchFieldError -> 0x00c6 }
                com.smaato.sdk.nativead.NativeAdError r8 = com.smaato.sdk.nativead.NativeAdError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x00c6 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c6 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x00c6 }
            L_0x00c6:
                int[] r7 = $SwitchMap$com$smaato$sdk$nativead$NativeAdError     // Catch:{ NoSuchFieldError -> 0x00d0 }
                com.smaato.sdk.nativead.NativeAdError r8 = com.smaato.sdk.nativead.NativeAdError.CACHE_LIMIT_REACHED     // Catch:{ NoSuchFieldError -> 0x00d0 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d0 }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x00d0 }
            L_0x00d0:
                com.smaato.sdk.banner.widget.BannerError[] r7 = com.smaato.sdk.banner.widget.BannerError.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                $SwitchMap$com$smaato$sdk$banner$widget$BannerError = r7
                com.smaato.sdk.banner.widget.BannerError r8 = com.smaato.sdk.banner.widget.BannerError.NO_AD_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x00e1 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x00e1 }
            L_0x00e1:
                int[] r1 = $SwitchMap$com$smaato$sdk$banner$widget$BannerError     // Catch:{ NoSuchFieldError -> 0x00eb }
                com.smaato.sdk.banner.widget.BannerError r7 = com.smaato.sdk.banner.widget.BannerError.INVALID_REQUEST     // Catch:{ NoSuchFieldError -> 0x00eb }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
                r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00eb }
            L_0x00eb:
                int[] r0 = $SwitchMap$com$smaato$sdk$banner$widget$BannerError     // Catch:{ NoSuchFieldError -> 0x00f5 }
                com.smaato.sdk.banner.widget.BannerError r1 = com.smaato.sdk.banner.widget.BannerError.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = $SwitchMap$com$smaato$sdk$banner$widget$BannerError     // Catch:{ NoSuchFieldError -> 0x00ff }
                com.smaato.sdk.banner.widget.BannerError r1 = com.smaato.sdk.banner.widget.BannerError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x00ff }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ff }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00ff }
            L_0x00ff:
                int[] r0 = $SwitchMap$com$smaato$sdk$banner$widget$BannerError     // Catch:{ NoSuchFieldError -> 0x0109 }
                com.smaato.sdk.banner.widget.BannerError r1 = com.smaato.sdk.banner.widget.BannerError.CACHE_LIMIT_REACHED     // Catch:{ NoSuchFieldError -> 0x0109 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0109 }
            L_0x0109:
                int[] r0 = $SwitchMap$com$smaato$sdk$banner$widget$BannerError     // Catch:{ NoSuchFieldError -> 0x0113 }
                com.smaato.sdk.banner.widget.BannerError r1 = com.smaato.sdk.banner.widget.BannerError.CREATIVE_RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                int[] r0 = $SwitchMap$com$smaato$sdk$banner$widget$BannerError     // Catch:{ NoSuchFieldError -> 0x011d }
                com.smaato.sdk.banner.widget.BannerError r1 = com.smaato.sdk.banner.widget.BannerError.AD_UNLOADED     // Catch:{ NoSuchFieldError -> 0x011d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011d }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x011d }
            L_0x011d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.SmaatoMediationAdapter.C21602.<clinit>():void");
        }
    }
}
