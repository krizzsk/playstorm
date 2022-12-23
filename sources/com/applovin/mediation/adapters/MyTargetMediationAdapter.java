package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.p374my.target.ads.InterstitialAd;
import com.p374my.target.ads.MyTargetView;
import com.p374my.target.ads.Reward;
import com.p374my.target.ads.RewardedAd;
import com.p374my.target.common.MyTargetManager;
import com.p374my.target.common.MyTargetPrivacy;
import com.p374my.target.common.MyTargetVersion;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.nativeads.NativeAd;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import com.p374my.target.nativeads.factories.NativeViewsFactory;
import com.p374my.target.nativeads.views.MediaAdView;
import com.p374my.target.nativeads.views.NativeAdView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class MyTargetMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private MyTargetView adView;
    private InterstitialAd interstitialAd;
    /* access modifiers changed from: private */
    public NativeAd nativeAd;
    /* access modifiers changed from: private */
    public NativeAdView nativeAdView;
    private RewardedAd rewardedAd;

    public String getAdapterVersion() {
        return "5.15.1.6";
    }

    public String getSdkVersion() {
        return MyTargetVersion.VERSION;
    }

    public MyTargetMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void onDestroy() {
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.destroy();
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.destroy();
            this.rewardedAd = null;
        }
        MyTargetView myTargetView = this.adView;
        if (myTargetView != null) {
            myTargetView.destroy();
            this.adView = null;
        }
        NativeAd nativeAd2 = this.nativeAd;
        if (nativeAd2 != null) {
            nativeAd2.setListener((NativeAd.NativeAdListener) null);
            this.nativeAd.unregisterView();
            this.nativeAd = null;
            this.nativeAdView = null;
        }
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (initialized.compareAndSet(false, true)) {
            if (maxAdapterInitializationParameters.isTesting()) {
                MyTargetManager.setDebugMode(true);
            }
            log("Initializing myTarget SDK... ");
            MyTargetManager.initSdk(getContext(activity));
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(MyTargetManager.getBidderToken(getContext(activity)));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" interstitial ad for slot id: ");
        sb.append(parseInt);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        InterstitialAd interstitialAd2 = new InterstitialAd(parseInt, activity);
        this.interstitialAd = interstitialAd2;
        interstitialAd2.setListener(new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialAd.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.interstitialAd.loadFromBid(bidResponse);
        } else {
            this.interstitialAd.load();
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.show();
            return;
        }
        log("Interstitial ad is null");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" rewarded ad for slot id: ");
        sb.append(parseInt);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        RewardedAd rewardedAd2 = new RewardedAd(parseInt, activity);
        this.rewardedAd = rewardedAd2;
        rewardedAd2.setListener(new RewardedAdListener(maxRewardedAdapterListener));
        this.rewardedAd.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.rewardedAd.loadFromBid(bidResponse);
        } else {
            this.rewardedAd.load();
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
            return;
        }
        log("Rewarded ad is null");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" ad view with format: ");
        sb.append(maxAdFormat.getLabel());
        sb.append(" for slot id: ");
        sb.append(parseInt);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        MyTargetView myTargetView = new MyTargetView(getContext(activity));
        this.adView = myTargetView;
        myTargetView.setSlotId(parseInt);
        this.adView.setAdSize(getBannerSize(maxAdFormat));
        this.adView.setRefreshAd(false);
        this.adView.setListener(new AdViewListener(maxAdViewAdapterListener));
        this.adView.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.adView.loadFromBid(bidResponse);
        } else {
            this.adView.load();
        }
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" native ad for slot id: ");
        sb.append(parseInt);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
        NativeAd nativeAd2 = new NativeAd(parseInt, getContext(activity));
        this.nativeAd = nativeAd2;
        nativeAd2.setListener(nativeAdListener);
        this.nativeAd.setMediaListener(nativeAdListener);
        this.nativeAd.getCustomParams().setCustomParam("mediation", "7");
        this.nativeAd.setAdChoicesPlacement(maxAdapterResponseParameters.getServerParameters().getInt("ad_choices_placement", 0));
        this.nativeAd.setCachePolicy(maxAdapterResponseParameters.getServerParameters().getInt("cache_policy", 0));
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.nativeAd.loadFromBid(bidResponse);
        } else {
            this.nativeAd.load();
        }
    }

    private void updatePrivacyStates(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Boolean privacySetting;
        Boolean privacySetting2;
        Boolean privacySetting3 = getPrivacySetting("isAgeRestrictedUser", maxAdapterResponseParameters);
        if (privacySetting3 != null) {
            MyTargetPrivacy.setUserAgeRestricted(privacySetting3.booleanValue());
        }
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterResponseParameters)) != null) {
            MyTargetPrivacy.setUserConsent(privacySetting2.booleanValue());
        }
        if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterResponseParameters)) != null) {
            MyTargetPrivacy.setCcpaUserConsent(privacySetting.booleanValue());
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

    private static MyTargetView.AdSize getBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return MyTargetView.AdSize.ADSIZE_320x50;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return MyTargetView.AdSize.ADSIZE_300x250;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return MyTargetView.AdSize.ADSIZE_728x90;
        }
        return MyTargetView.AdSize.ADSIZE_320x50;
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(String str) {
        return new MaxAdapterError(MaxAdapterError.NO_FILL.getErrorCode(), MaxAdapterError.NO_FILL.getErrorMessage(), 0, str);
    }

    private class InterstitialListener implements InterstitialAd.InterstitialAdListener {
        private final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onLoad(InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial loaded");
            this.listener.onInterstitialAdLoaded();
        }

        public void onNoAd(String str, InterstitialAd interstitialAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Interstitial failed to load with reason: " + str);
            this.listener.onInterstitialAdLoadFailed(MyTargetMediationAdapter.toMaxError(str));
        }

        public void onDisplay(InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial displayed");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onClick(InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        public void onVideoCompleted(InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial video completed");
        }

        public void onDismiss(InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial dismissed");
            this.listener.onInterstitialAdHidden();
        }
    }

    private class RewardedAdListener implements RewardedAd.RewardedAdListener {
        private boolean hasGrantedReward = false;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onLoad(RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded();
        }

        public void onNoAd(String str, RewardedAd rewardedAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Rewarded ad failed to load with reason: " + str);
            this.listener.onRewardedAdLoadFailed(MyTargetMediationAdapter.toMaxError(str));
        }

        public void onDisplay(RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad displayed");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onClick(RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        public void onReward(Reward reward, RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad reward granted");
            this.hasGrantedReward = true;
        }

        public void onDismiss(RewardedAd rewardedAd) {
            if (this.hasGrantedReward || MyTargetMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = MyTargetMediationAdapter.this.getReward();
                MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
                myTargetMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            MyTargetMediationAdapter.this.log("Rewarded ad dismissed");
            this.listener.onRewardedAdHidden();
        }
    }

    private class AdViewListener implements MyTargetView.MyTargetViewListener {
        private final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        public void onLoad(MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view loaded");
            this.listener.onAdViewAdLoaded(myTargetView);
        }

        public void onNoAd(String str, MyTargetView myTargetView) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Ad view failed to load with reason: " + str);
            this.listener.onAdViewAdLoadFailed(MyTargetMediationAdapter.toMaxError(str));
        }

        public void onShow(MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view displayed");
            this.listener.onAdViewAdDisplayed();
        }

        public void onClick(MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view clicked");
            this.listener.onAdViewAdClicked();
        }
    }

    private class NativeAdListener implements NativeAd.NativeAdListener, NativeAd.NativeAdMediaListener {
        private final Context context;
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;
        private final String slotId;

        NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context2, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.slotId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context2;
            this.listener = maxNativeAdAdapterListener;
        }

        public void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd) {
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage;
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage2;
            MyTargetMediationAdapter.this.log("Native ad loaded: " + this.slotId);
            if (MyTargetMediationAdapter.this.nativeAd != nativeAd) {
                MyTargetMediationAdapter.this.mo15009e("Mismatched instance of native ads - adapter: " + MyTargetMediationAdapter.this.nativeAd + " and listener: " + nativeAd);
                this.listener.onNativeAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
                return;
            }
            boolean isValidString = AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters));
            NativePromoBanner banner = nativeAd.getBanner();
            if (!isValidString || !TextUtils.isEmpty(banner.getTitle())) {
                ImageData icon = banner.getIcon();
                ImageData image = banner.getImage();
                MediaAdView mediaAdView = NativeViewsFactory.getMediaAdView(this.context);
                if (icon != null) {
                    maxNativeAdImage = icon.getBitmap() != null ? new MaxNativeAd.MaxNativeAdImage((Drawable) new BitmapDrawable(this.context.getResources(), icon.getBitmap())) : new MaxNativeAd.MaxNativeAdImage(Uri.parse(icon.getUrl()));
                } else {
                    maxNativeAdImage = null;
                }
                if (image != null) {
                    maxNativeAdImage2 = image.getBitmap() != null ? new MaxNativeAd.MaxNativeAdImage((Drawable) new BitmapDrawable(this.context.getResources(), image.getBitmap())) : new MaxNativeAd.MaxNativeAdImage(Uri.parse(image.getUrl()));
                } else {
                    maxNativeAdImage2 = null;
                }
                NativeAdView unused = MyTargetMediationAdapter.this.nativeAdView = NativeViewsFactory.getNativeAdView(this.context);
                MyTargetMediationAdapter.this.nativeAdView.setupView(nativeAd.getBanner());
                MaxNativeAd.Builder advertiser = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(banner.getTitle()).setBody(banner.getDescription()).setCallToAction(banner.getCtaText()).setIcon(maxNativeAdImage).setMediaView(mediaAdView).setAdvertiser(banner.getAdvertisingLabel());
                if (AppLovinSdk.VERSION_CODE >= 11040399) {
                    advertiser.setMainImage(maxNativeAdImage2);
                }
                if (AppLovinSdk.VERSION_CODE >= 11040000) {
                    advertiser.setMediaContentAspectRatio(mediaAdView.getMediaAspectRatio());
                }
                this.listener.onNativeAdLoaded(new MaxMyTargetNativeAd(advertiser), (Bundle) null);
                return;
            }
            MyTargetMediationAdapter.this.mo15009e("Native ad (" + nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
        }

        public void onNoAd(String str, NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad (" + this.slotId + ") failed to load with reason: " + str);
            this.listener.onNativeAdLoadFailed(MyTargetMediationAdapter.toMaxError(str));
        }

        public void onShow(NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad shown: " + this.slotId);
            this.listener.onNativeAdDisplayed((Bundle) null);
        }

        public void onClick(NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad clicked: " + this.slotId);
            this.listener.onNativeAdClicked();
        }

        public void onVideoPlay(NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad video started: " + this.slotId);
        }

        public void onVideoPause(NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad video paused: " + this.slotId);
        }

        public void onVideoComplete(NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad video completed: " + this.slotId);
        }

        public void onIconLoad(NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad icon loaded: " + this.slotId);
        }

        public void onImageLoad(NativeAd nativeAd) {
            MyTargetMediationAdapter myTargetMediationAdapter = MyTargetMediationAdapter.this;
            myTargetMediationAdapter.log("Native ad image loaded: " + this.slotId);
        }
    }

    private class MaxMyTargetNativeAd extends MaxNativeAd {
        private MaxMyTargetNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            NativeAd access$100 = MyTargetMediationAdapter.this.nativeAd;
            if (access$100 == null) {
                MyTargetMediationAdapter.this.mo15009e("Failed to register native ad views: native ad is null.");
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
            if (AppLovinSdkUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
                arrayList.add(maxNativeAdView.getAdvertiserTextView());
            }
            access$100.registerView(maxNativeAdView, arrayList);
        }
    }
}
