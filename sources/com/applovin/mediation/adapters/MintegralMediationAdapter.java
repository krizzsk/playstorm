package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
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
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.interstitialvideo.out.MBBidInterstitialVideoHandler;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.mbridge.msdk.system.C9131a;
import com.mbridge.msdk.video.p346bt.module.p349b.C9245g;
import com.mbridge.msdk.widget.MBAdChoice;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class MintegralMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider {
    private static final String APP_ID_PARAMETER = "app_id";
    private static final String APP_KEY_PARAMETER = "app_key";
    private static final String BAD_REQUEST = "request parameter is null";
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 5;
    private static final String EXCEPTION_APP_ID_EMPTY = "EXCEPTION_APP_ID_EMPTY";
    private static final String EXCEPTION_APP_NOT_FOUND = "EXCEPTION_APP_NOT_FOUND";
    private static final String EXCEPTION_IV_RECALLNET_INVALIDATE = "EXCEPTION_IV_RECALLNET_INVALIDATE";
    private static final String EXCEPTION_RETURN_EMPTY = "EXCEPTION_RETURN_EMPTY";
    private static final String EXCEPTION_SIGN_ERROR = "EXCEPTION_SIGN_ERROR";
    private static final String EXCEPTION_TIMEOUT = "EXCEPTION_TIMEOUT";
    private static final String EXCEPTION_UNIT_ADTYPE_ERROR = "EXCEPTION_UNIT_ADTYPE_ERROR";
    private static final String EXCEPTION_UNIT_ID_EMPTY = "EXCEPTION_UNIT_ID_EMPTY";
    private static final String EXCEPTION_UNIT_NOT_FOUND = "EXCEPTION_UNIT_NOT_FOUND";
    private static final String EXCEPTION_UNIT_NOT_FOUND_IN_APP = "EXCEPTION_UNIT_NOT_FOUND_IN_APP";
    private static final String NETWORK_ERROR = "network exception";
    private static final String NETWORK_IO_ERROR = "Network error,I/O exception";
    private static final String NOT_INITIALIZED = "init error";
    private static final String NO_FILL_1 = "no ads available can show";
    private static final String NO_FILL_2 = "no ads available";
    private static final String NO_FILL_3 = "no server ads available";
    private static final String NO_FILL_4 = "no ads source";
    private static final String NO_FILL_5 = "load no ad";
    private static final String TIMEOUT = "load timeout";
    private static final String UNIT_ID_EMPTY = "UnitId is null";
    private static final AtomicBoolean initialized = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static final Map<String, MBBidInterstitialVideoHandler> mbBidInterstitialVideoHandlers = new HashMap();
    /* access modifiers changed from: private */
    public static final Map<String, MBBidRewardVideoHandler> mbBidRewardVideoHandlers = new HashMap();
    /* access modifiers changed from: private */
    public static final Map<String, MBInterstitialVideoHandler> mbInterstitialVideoHandlers = new HashMap();
    /* access modifiers changed from: private */
    public static final Map<String, MBRewardVideoHandler> mbRewardVideoHandlers = new HashMap();
    private static final MintegralMediationAdapterRouter router = ((MintegralMediationAdapterRouter) MediationAdapterRouter.getSharedInstance(MintegralMediationAdapterRouter.class));
    private static String sSdkVersion;
    /* access modifiers changed from: private */
    public List<View> clickableViews;
    /* access modifiers changed from: private */
    public MaxNativeAdView maxNativeAdView;
    /* access modifiers changed from: private */
    public MBBannerView mbBannerView;
    private MBBidInterstitialVideoHandler mbBidInterstitialVideoHandler;
    /* access modifiers changed from: private */
    public MBBidNativeHandler mbBidNativeHandler;
    private MBBidRewardVideoHandler mbBidRewardVideoHandler;
    private MBInterstitialVideoHandler mbInterstitialVideoHandler;
    private MBRewardVideoHandler mbRewardVideoHandler;
    private String mbUnitId;
    /* access modifiers changed from: private */
    public Campaign nativeAdCampaign;

    public String getAdapterVersion() {
        return "16.1.61.0";
    }

    public MintegralMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        Boolean privacySetting;
        MBridgeConstans.DEBUG = maxAdapterInitializationParameters.isTesting();
        if (initialized.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id");
            String string2 = maxAdapterInitializationParameters.getServerParameters().getString("app_key");
            log("Initializing Mintegral SDK with app id: " + string + " and app key: " + string2 + APSSharedUtil.TRUNCATE_SEPARATOR);
            C9131a mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            Context context = getContext(activity);
            Boolean privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterInitializationParameters);
            if (privacySetting2 != null) {
                boolean booleanValue = privacySetting2.booleanValue();
                mBridgeSDK.setUserPrivateInfoType(context, MBridgeConstans.AUTHORITY_ALL_INFO, booleanValue ? 1 : 0);
                mBridgeSDK.setConsentStatus(context, booleanValue);
            }
            if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterInitializationParameters)) != null && privacySetting.booleanValue()) {
                mBridgeSDK.setDoNotTrackStatus(true);
            }
            mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap(string, string2), context);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public String getSdkVersion() {
        if (sSdkVersion == null) {
            sSdkVersion = getVersionString(MBConfiguration.class, "SDK_VERSION");
        }
        return sSdkVersion;
    }

    public void onDestroy() {
        MBInterstitialVideoHandler mBInterstitialVideoHandler = this.mbInterstitialVideoHandler;
        if (mBInterstitialVideoHandler != null) {
            mBInterstitialVideoHandler.setInterstitialVideoListener((InterstitialVideoListener) null);
            this.mbInterstitialVideoHandler = null;
        }
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = this.mbBidInterstitialVideoHandler;
        if (mBBidInterstitialVideoHandler != null) {
            mBBidInterstitialVideoHandler.setInterstitialVideoListener((InterstitialVideoListener) null);
            this.mbBidInterstitialVideoHandler = null;
        }
        MBRewardVideoHandler mBRewardVideoHandler = this.mbRewardVideoHandler;
        if (mBRewardVideoHandler != null) {
            mBRewardVideoHandler.setRewardVideoListener((C9245g) null);
            this.mbRewardVideoHandler = null;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mbBidRewardVideoHandler;
        if (mBBidRewardVideoHandler != null) {
            mBBidRewardVideoHandler.setRewardVideoListener((C9245g) null);
            this.mbBidRewardVideoHandler = null;
        }
        MBBannerView mBBannerView = this.mbBannerView;
        if (mBBannerView != null) {
            mBBannerView.release();
            this.mbBannerView = null;
        }
        MBBidNativeHandler mBBidNativeHandler = this.mbBidNativeHandler;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(this.maxNativeAdView, this.clickableViews, this.nativeAdCampaign);
            this.mbBidNativeHandler.bidRelease();
            this.mbBidNativeHandler.setAdListener((NativeListener.NativeAdListener) null);
            this.mbBidNativeHandler = null;
        }
        this.nativeAdCampaign = null;
        router.removeAdapter(this, this.mbUnitId);
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(BidManager.getBuyerUid(getContext(activity)));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        boolean containsKey = maxAdapterResponseParameters.getServerParameters().containsKey("is_muted");
        int i = maxAdapterResponseParameters.getServerParameters().getBoolean("is_muted") ? 1 : 2;
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, maxAdapterResponseParameters.getServerParameters());
        router.addInterstitialAdapter(this, maxInterstitialAdapterListener, this.mbUnitId);
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding interstitial ad for unit id: " + this.mbUnitId + " and placement id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            if (mbBidInterstitialVideoHandlers.containsKey(this.mbUnitId)) {
                this.mbBidInterstitialVideoHandler = mbBidInterstitialVideoHandlers.get(this.mbUnitId);
            } else {
                MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = new MBBidInterstitialVideoHandler(activity, string, this.mbUnitId);
                this.mbBidInterstitialVideoHandler = mBBidInterstitialVideoHandler;
                mbBidInterstitialVideoHandlers.put(this.mbUnitId, mBBidInterstitialVideoHandler);
            }
            this.mbBidInterstitialVideoHandler.setInterstitialVideoListener(router.getInterstitialListener());
            if (this.mbBidInterstitialVideoHandler.isBidReady()) {
                log("A bidding interstitial ad is ready already");
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbBidInterstitialVideoHandler.getRequestId())) {
                    router.onAdLoaded(this.mbUnitId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbBidInterstitialVideoHandler.getRequestId());
                router.onAdLoaded(this.mbUnitId, bundle);
                return;
            }
            if (containsKey) {
                this.mbBidInterstitialVideoHandler.playVideoMute(i);
            }
            this.mbBidInterstitialVideoHandler.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log("Loading mediated interstitial ad for unit id: " + this.mbUnitId + " and placement id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (mbInterstitialVideoHandlers.containsKey(this.mbUnitId)) {
            this.mbInterstitialVideoHandler = mbInterstitialVideoHandlers.get(this.mbUnitId);
        } else {
            MBInterstitialVideoHandler mBInterstitialVideoHandler = new MBInterstitialVideoHandler(activity, string, this.mbUnitId);
            this.mbInterstitialVideoHandler = mBInterstitialVideoHandler;
            mbInterstitialVideoHandlers.put(this.mbUnitId, mBInterstitialVideoHandler);
        }
        this.mbInterstitialVideoHandler.setInterstitialVideoListener(router.getInterstitialListener());
        if (this.mbInterstitialVideoHandler.isReady()) {
            log("A mediated interstitial ad is ready already");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbInterstitialVideoHandler.getRequestId())) {
                router.onAdLoaded(this.mbUnitId);
                return;
            }
            Bundle bundle2 = new Bundle(1);
            bundle2.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbInterstitialVideoHandler.getRequestId());
            router.onAdLoaded(this.mbUnitId, bundle2);
            return;
        }
        if (containsKey) {
            this.mbInterstitialVideoHandler.playVideoMute(i);
        }
        this.mbInterstitialVideoHandler.load();
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        router.addShowingAdapter(this);
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = this.mbBidInterstitialVideoHandler;
        if (mBBidInterstitialVideoHandler == null || !mBBidInterstitialVideoHandler.isBidReady()) {
            MBInterstitialVideoHandler mBInterstitialVideoHandler = this.mbInterstitialVideoHandler;
            if (mBInterstitialVideoHandler == null || !mBInterstitialVideoHandler.isReady()) {
                log("Unable to show interstitial - no ad loaded...");
                router.onAdDisplayFailed(this.mbUnitId, new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
                return;
            }
            log("Showing mediated interstitial...");
            this.mbInterstitialVideoHandler.show();
            return;
        }
        log("Showing bidding interstitial...");
        this.mbBidInterstitialVideoHandler.showFromBid();
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        boolean containsKey = maxAdapterResponseParameters.getServerParameters().containsKey("is_muted");
        int i = maxAdapterResponseParameters.getServerParameters().getBoolean("is_muted") ? 1 : 2;
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, maxAdapterResponseParameters.getServerParameters());
        router.addRewardedAdapter(this, maxRewardedAdapterListener, this.mbUnitId);
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding rewarded ad for unit id: " + this.mbUnitId + " and placement id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            if (mbBidRewardVideoHandlers.containsKey(this.mbUnitId)) {
                this.mbBidRewardVideoHandler = mbBidRewardVideoHandlers.get(this.mbUnitId);
            } else {
                MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(activity, string, this.mbUnitId);
                this.mbBidRewardVideoHandler = mBBidRewardVideoHandler;
                mbBidRewardVideoHandlers.put(this.mbUnitId, mBBidRewardVideoHandler);
            }
            this.mbBidRewardVideoHandler.setRewardVideoListener(router.getRewardedListener());
            if (this.mbBidRewardVideoHandler.isBidReady()) {
                log("A bidding rewarded ad is ready already");
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbBidRewardVideoHandler.getRequestId())) {
                    router.onAdLoaded(this.mbUnitId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbBidRewardVideoHandler.getRequestId());
                router.onAdLoaded(this.mbUnitId, bundle);
                return;
            }
            if (containsKey) {
                this.mbBidRewardVideoHandler.playVideoMute(i);
            }
            this.mbBidRewardVideoHandler.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log("Loading mediated rewarded ad for unit id: " + this.mbUnitId + " and placement id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (mbRewardVideoHandlers.containsKey(this.mbUnitId)) {
            this.mbRewardVideoHandler = mbRewardVideoHandlers.get(this.mbUnitId);
        } else {
            MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(activity, string, this.mbUnitId);
            this.mbRewardVideoHandler = mBRewardVideoHandler;
            mbRewardVideoHandlers.put(this.mbUnitId, mBRewardVideoHandler);
        }
        this.mbRewardVideoHandler.setRewardVideoListener(router.getRewardedListener());
        if (this.mbRewardVideoHandler.isReady()) {
            log("A mediated rewarded ad is ready already");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbRewardVideoHandler.getRequestId())) {
                router.onAdLoaded(this.mbUnitId);
                return;
            }
            Bundle bundle2 = new Bundle(1);
            bundle2.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbRewardVideoHandler.getRequestId());
            router.onAdLoaded(this.mbUnitId, bundle2);
            return;
        }
        if (containsKey) {
            this.mbRewardVideoHandler.playVideoMute(i);
        }
        this.mbRewardVideoHandler.load();
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        router.addShowingAdapter(this);
        configureReward(maxAdapterResponseParameters);
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        String string = serverParameters.getString("reward_id", "");
        String string2 = serverParameters.getString("user_id", "");
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mbBidRewardVideoHandler;
        if (mBBidRewardVideoHandler == null || !mBBidRewardVideoHandler.isBidReady()) {
            MBRewardVideoHandler mBRewardVideoHandler = this.mbRewardVideoHandler;
            if (mBRewardVideoHandler == null || !mBRewardVideoHandler.isReady()) {
                log("Unable to show rewarded ad - no ad loaded...");
                router.onAdDisplayFailed(this.mbUnitId, new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
                return;
            }
            log("Showing mediated rewarded ad...");
            this.mbRewardVideoHandler.show(string, string2);
            return;
        }
        log("Showing bidding rewarded ad...");
        this.mbBidRewardVideoHandler.showFromBid(string, string2);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        BannerSize bannerSize = toBannerSize(maxAdFormat);
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, maxAdapterResponseParameters.getServerParameters());
        MBBannerView mBBannerView = new MBBannerView(getContext(activity));
        this.mbBannerView = mBBannerView;
        mBBannerView.init(bannerSize, string, this.mbUnitId);
        this.mbBannerView.setAllowShowCloseBtn(false);
        this.mbBannerView.setRefreshTime(0);
        this.mbBannerView.setBannerAdListener(new BannerAdListener() {
            public void onLoadSuccessed(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                mintegralMediationAdapter.log("Banner ad loaded for: " + mBridgeIds);
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(MintegralMediationAdapter.this.mbBannerView.getRequestId())) {
                    maxAdViewAdapterListener.onAdViewAdLoaded(MintegralMediationAdapter.this.mbBannerView);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, MintegralMediationAdapter.this.mbBannerView.getRequestId());
                maxAdViewAdapterListener.onAdViewAdLoaded(MintegralMediationAdapter.this.mbBannerView, bundle);
            }

            public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                mintegralMediationAdapter.log("Banner ad failed to load: " + str + " for: " + mBridgeIds);
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MintegralMediationAdapter.toMaxError(str));
            }

            public void onLogImpression(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad displayed");
                maxAdViewAdapterListener.onAdViewAdDisplayed();
            }

            public void onClick(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onLeaveApp(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad will leave application");
            }

            public void showFullScreen(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad expanded");
                maxAdViewAdapterListener.onAdViewAdExpanded();
            }

            public void closeFullScreen(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad collapsed");
                maxAdViewAdapterListener.onAdViewAdCollapsed();
            }

            public void onCloseBanner(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad closed");
            }
        });
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding banner ad for unit id: " + this.mbUnitId + " and placement id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            this.mbBannerView.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log("Loading mediated banner ad for unit id: " + this.mbUnitId + " and placement id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        this.mbBannerView.load();
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, maxAdapterResponseParameters.getServerParameters());
        log("Loading bidding native ad for unit id: " + this.mbUnitId + " and placement id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string, this.mbUnitId);
        nativeProperties.put("ad_num", 1);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, true);
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
        MBBidNativeHandler mBBidNativeHandler = new MBBidNativeHandler(nativeProperties, getContext(activity));
        this.mbBidNativeHandler = mBBidNativeHandler;
        mBBidNativeHandler.setAdListener(nativeAdListener);
        this.mbBidNativeHandler.bidLoad(maxAdapterResponseParameters.getBidResponse());
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
    public static MaxAdapterError toMaxError(String str) {
        MaxAdapterError maxAdapterError;
        if (NOT_INITIALIZED.equals(str) || str.contains(EXCEPTION_IV_RECALLNET_INVALIDATE)) {
            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
        } else if (str.contains(NO_FILL_1) || str.contains(NO_FILL_2) || str.contains(NO_FILL_3) || str.contains(NO_FILL_4) || str.contains(NO_FILL_5) || str.contains(EXCEPTION_RETURN_EMPTY)) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (NETWORK_ERROR.equalsIgnoreCase(str) || str.contains(NETWORK_IO_ERROR)) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (BAD_REQUEST.equalsIgnoreCase(str)) {
            maxAdapterError = MaxAdapterError.BAD_REQUEST;
        } else if (TIMEOUT.equalsIgnoreCase(str) || str.contains(EXCEPTION_TIMEOUT)) {
            maxAdapterError = MaxAdapterError.TIMEOUT;
        } else if (str.contains(EXCEPTION_SIGN_ERROR) || str.contains(EXCEPTION_UNIT_NOT_FOUND) || str.contains(EXCEPTION_UNIT_ID_EMPTY) || str.contains(EXCEPTION_UNIT_NOT_FOUND_IN_APP) || str.contains(EXCEPTION_UNIT_ADTYPE_ERROR) || str.contains(EXCEPTION_APP_ID_EMPTY) || str.contains(EXCEPTION_APP_NOT_FOUND) || str.contains(UNIT_ID_EMPTY)) {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), 0, str);
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private BannerSize toBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER) {
            return new BannerSize(3, 0, 0);
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return new BannerSize(2, 0, 0);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private static class MintegralMediationAdapterRouter extends MediationAdapterRouter {
        private final InterstitialVideoListener interstitialVideoListener = new InterstitialVideoListener() {
            public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
                String str;
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial successfully loaded and video has been downloaded for: " + mBridgeIds);
                String unitId = mBridgeIds.getUnitId();
                MBInterstitialVideoHandler mBInterstitialVideoHandler = (MBInterstitialVideoHandler) MintegralMediationAdapter.mbInterstitialVideoHandlers.get(unitId);
                MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = (MBBidInterstitialVideoHandler) MintegralMediationAdapter.mbBidInterstitialVideoHandlers.get(unitId);
                if (mBBidInterstitialVideoHandler != null) {
                    str = mBBidInterstitialVideoHandler.getRequestId();
                } else {
                    str = mBInterstitialVideoHandler.getRequestId();
                }
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(str)) {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str);
                MintegralMediationAdapterRouter.this.onAdLoaded(unitId, bundle);
            }

            public void onLoadSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial successfully loaded but video still needs to be downloaded for: " + mBridgeIds);
            }

            public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial failed to load: " + str + " for: " + mBridgeIds);
                MintegralMediationAdapterRouter.this.onAdLoadFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            public void onAdShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial displayed");
                MintegralMediationAdapterRouter.this.onAdDisplayed(mBridgeIds.getUnitId());
            }

            public void onShowFail(MBridgeIds mBridgeIds, String str) {
                MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, str);
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial failed to show: " + maxAdapterError);
                MintegralMediationAdapterRouter.this.onAdDisplayFailed(mBridgeIds.getUnitId(), maxAdapterError);
            }

            public void onVideoAdClicked(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial clicked");
                MintegralMediationAdapterRouter.this.onAdClicked(mBridgeIds.getUnitId());
            }

            public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Interstitial hidden");
                MintegralMediationAdapterRouter.this.onAdHidden(mBridgeIds.getUnitId());
            }

            public void onVideoComplete(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial video completed");
            }

            public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Interstitial with reward hidden");
            }

            public void onEndcardShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial endcard shown");
            }
        };
        private final RewardVideoListener rewardVideoListener = new RewardVideoListener() {
            public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
                String str;
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad successfully loaded and video has been downloaded for: " + mBridgeIds);
                String unitId = mBridgeIds.getUnitId();
                MBRewardVideoHandler mBRewardVideoHandler = (MBRewardVideoHandler) MintegralMediationAdapter.mbRewardVideoHandlers.get(unitId);
                MBBidRewardVideoHandler mBBidRewardVideoHandler = (MBBidRewardVideoHandler) MintegralMediationAdapter.mbBidRewardVideoHandlers.get(unitId);
                if (mBBidRewardVideoHandler != null) {
                    str = mBBidRewardVideoHandler.getRequestId();
                } else {
                    str = mBRewardVideoHandler.getRequestId();
                }
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(str)) {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str);
                MintegralMediationAdapterRouter.this.onAdLoaded(unitId, bundle);
            }

            public void onLoadSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad successfully loaded but video still needs to be downloaded for: " + mBridgeIds);
            }

            public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad failed to load: " + str + " for: " + mBridgeIds);
                MintegralMediationAdapterRouter.this.onAdLoadFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            public void onAdShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad displayed");
                String unitId = mBridgeIds.getUnitId();
                MintegralMediationAdapterRouter.this.onAdDisplayed(unitId);
                MintegralMediationAdapterRouter.this.onRewardedAdVideoStarted(unitId);
            }

            public void onShowFail(MBridgeIds mBridgeIds, String str) {
                MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, str);
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad failed to show: " + maxAdapterError);
                MintegralMediationAdapterRouter.this.onAdDisplayFailed(mBridgeIds.getUnitId(), maxAdapterError);
            }

            public void onVideoAdClicked(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad clicked");
                MintegralMediationAdapterRouter.this.onAdClicked(mBridgeIds.getUnitId());
            }

            public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad hidden");
                String unitId = mBridgeIds.getUnitId();
                if (rewardInfo.isCompleteView()) {
                    MintegralMediationAdapterRouter.this.onRewardedAdVideoCompleted(unitId);
                    MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                    mintegralMediationAdapterRouter.onUserRewarded(unitId, mintegralMediationAdapterRouter.getReward(unitId));
                } else if (MintegralMediationAdapterRouter.this.shouldAlwaysRewardUser(unitId)) {
                    MintegralMediationAdapterRouter mintegralMediationAdapterRouter2 = MintegralMediationAdapterRouter.this;
                    mintegralMediationAdapterRouter2.onUserRewarded(unitId, mintegralMediationAdapterRouter2.getReward(unitId));
                }
                MintegralMediationAdapterRouter.this.onAdHidden(unitId);
            }

            public void onVideoComplete(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad video completed");
            }

            public void onEndcardShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad endcard shown");
            }
        };

        /* access modifiers changed from: package-private */
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }

        private MintegralMediationAdapterRouter() {
        }

        /* access modifiers changed from: package-private */
        public InterstitialVideoListener getInterstitialListener() {
            return this.interstitialVideoListener;
        }

        /* access modifiers changed from: package-private */
        public RewardVideoListener getRewardedListener() {
            return this.rewardVideoListener;
        }
    }

    private class NativeAdListener implements NativeListener.NativeAdListener, OnMBMediaViewListener {
        /* access modifiers changed from: private */
        public final Context context;
        /* access modifiers changed from: private */
        public final MaxNativeAdAdapterListener listener;
        /* access modifiers changed from: private */
        public final MaxAdapterResponseParameters parameters;
        private final String placementId;
        private final String unitId;

        NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context2, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.context = context2;
            this.listener = maxNativeAdAdapterListener;
            this.unitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.placementId = BundleUtils.getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, maxAdapterResponseParameters.getServerParameters());
        }

        public void onAdLoaded(List<Campaign> list, int i) {
            if (list == null || list.isEmpty()) {
                MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                mintegralMediationAdapter.log("Native ad failed to load for unit id: " + this.unitId + " placement id: " + this.placementId + " with error: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            Campaign campaign = list.get(0);
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.parameters.getServerParameters())) || !TextUtils.isEmpty(campaign.getAppName())) {
                Campaign unused = MintegralMediationAdapter.this.nativeAdCampaign = campaign;
                MintegralMediationAdapter mintegralMediationAdapter2 = MintegralMediationAdapter.this;
                mintegralMediationAdapter2.log("Native ad loaded for unit id: " + this.unitId + " placement id: " + this.placementId);
                processNativeAd(campaign);
                return;
            }
            MintegralMediationAdapter mintegralMediationAdapter3 = MintegralMediationAdapter.this;
            mintegralMediationAdapter3.log("Native ad failed to load for unit id: " + this.unitId + " placement id: " + this.placementId + " with error: missing required assets");
            this.listener.onNativeAdLoadFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
        }

        public void onAdLoadError(String str) {
            MaxAdapterError access$100 = MintegralMediationAdapter.toMaxError(str);
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Native ad failed to load for unit id: " + this.unitId + " placement id: " + this.placementId + " with error: " + access$100);
            this.listener.onNativeAdLoadFailed(access$100);
        }

        public void onLoggingImpression(int i) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Native ad shown for unit id: " + this.unitId + " placement id: " + this.placementId);
            this.listener.onNativeAdDisplayed((Bundle) null);
        }

        public void onAdClick(Campaign campaign) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Native ad clicked for unit id: " + this.unitId + " placement id: " + this.placementId);
            this.listener.onNativeAdClicked();
        }

        public void onAdFramesLoaded(List<Frame> list) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Native ad frames loaded for unit id: " + this.unitId + " placement id: " + this.placementId);
        }

        public void onEnterFullscreen() {
            MintegralMediationAdapter.this.log("Media view entered fullscreen");
        }

        public void onExitFullscreen() {
            MintegralMediationAdapter.this.log("Media view exited fullscreen");
        }

        public void onStartRedirection(Campaign campaign, String str) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Media view started redirection with url: " + str);
        }

        public void onFinishRedirection(Campaign campaign, String str) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Media view finished redirection with url: " + str);
        }

        public void onRedirectionFailed(Campaign campaign, String str) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Media view redirection failed with url: " + str);
        }

        public void onVideoAdClicked(Campaign campaign) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            mintegralMediationAdapter.log("Media view clicked for unit id: " + this.unitId + " placement id: " + this.placementId);
            this.listener.onNativeAdClicked();
        }

        public void onVideoStart() {
            MintegralMediationAdapter.this.log("Media view video started");
        }

        private void processNativeAd(final Campaign campaign) {
            MintegralMediationAdapter.this.getCachingExecutorService().submit(new Runnable() {
                public void run() {
                    String iconUrl = campaign.getIconUrl();
                    String imageUrl = campaign.getImageUrl();
                    Future<Drawable> createDrawableFuture = MintegralMediationAdapter.this.createDrawableFuture(iconUrl, NativeAdListener.this.context.getResources());
                    final MaxNativeAd.MaxNativeAdImage maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(Uri.parse(imageUrl));
                    final MaxNativeAd.MaxNativeAdImage maxNativeAdImage2 = null;
                    try {
                        Drawable drawable = createDrawableFuture.get((long) BundleUtils.getInt("image_task_timeout_seconds", 5, NativeAdListener.this.parameters.getServerParameters()), TimeUnit.SECONDS);
                        if (drawable != null) {
                            maxNativeAdImage2 = new MaxNativeAd.MaxNativeAdImage(drawable);
                        }
                    } catch (Throwable th) {
                        MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                        mintegralMediationAdapter.log("Failed to fetch icon image from URL: " + iconUrl, th);
                    }
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            MBMediaView mBMediaView = new MBMediaView(NativeAdListener.this.context);
                            mBMediaView.setNativeAd(campaign);
                            mBMediaView.setOnMediaViewListener((OnMBMediaViewListener) NativeAdListener.this);
                            MBAdChoice mBAdChoice = new MBAdChoice(NativeAdListener.this.context);
                            mBAdChoice.setCampaign(campaign);
                            MaxNativeAd.Builder optionsView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(campaign.getAppName()).setBody(campaign.getAppDesc()).setCallToAction(campaign.getAdCall()).setIcon(maxNativeAdImage2).setMediaView(mBMediaView).setOptionsView(mBAdChoice);
                            if (AppLovinSdk.VERSION_CODE >= 11040399) {
                                optionsView.setMainImage(maxNativeAdImage);
                            }
                            NativeAdListener.this.listener.onNativeAdLoaded(new MaxMintegralNativeAd(optionsView), (Bundle) null);
                        }
                    });
                }
            });
        }
    }

    private class MaxMintegralNativeAd extends MaxNativeAd {
        public MaxMintegralNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            if (MintegralMediationAdapter.this.nativeAdCampaign == null) {
                MintegralMediationAdapter.this.mo15009e("Failed to register native ad views: native ad is null.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (AppLovinSdkUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
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
            MintegralMediationAdapter.this.mbBidNativeHandler.registerView(maxNativeAdView, arrayList, MintegralMediationAdapter.this.nativeAdCampaign);
            MaxNativeAdView unused = MintegralMediationAdapter.this.maxNativeAdView = maxNativeAdView;
            List unused2 = MintegralMediationAdapter.this.clickableViews = arrayList;
        }
    }
}
