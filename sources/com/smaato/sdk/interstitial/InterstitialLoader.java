package com.smaato.sdk.interstitial;

import android.app.Application;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderException;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdRequest;
import com.smaato.sdk.core.p378ad.AdSettings;
import com.smaato.sdk.core.p378ad.FullscreenAdDimensionMapper;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p378ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.repository.AdTypeStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.p382fi.Supplier;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdImpl;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

final class InterstitialLoader {
    private final Application applicationContext;
    private final FullscreenAdDimensionMapper fullscreenAdDimensionMapper;
    private final InterstitialAdPresenterStorage interstitialAdPresenterStorage;
    private Map<String, Object> objectExtras = new HashMap();
    private final AdRepository repository;
    private final SdkConfiguration sdkConfiguration;
    private final SharedKeyValuePairsHolder sharedKeyValuePairsHolder;
    private final Supplier<UUID> uuidSupplier;

    InterstitialLoader(AdRepository adRepository, InterstitialAdPresenterStorage interstitialAdPresenterStorage2, Application application, SdkConfiguration sdkConfiguration2, SharedKeyValuePairsHolder sharedKeyValuePairsHolder2, FullscreenAdDimensionMapper fullscreenAdDimensionMapper2, Supplier<UUID> supplier) {
        this.repository = (AdRepository) Objects.requireNonNull(adRepository);
        this.interstitialAdPresenterStorage = interstitialAdPresenterStorage2;
        this.applicationContext = (Application) Objects.requireNonNull(application);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.sharedKeyValuePairsHolder = (SharedKeyValuePairsHolder) Objects.requireNonNull(sharedKeyValuePairsHolder2);
        this.fullscreenAdDimensionMapper = (FullscreenAdDimensionMapper) Objects.requireNonNull(fullscreenAdDimensionMapper2);
        this.uuidSupplier = supplier;
    }

    /* access modifiers changed from: package-private */
    public KeyValuePairs getKeyValuePairs() {
        return this.sharedKeyValuePairsHolder.getKeyValuePairs();
    }

    /* access modifiers changed from: package-private */
    public void setKeyValuePairs(KeyValuePairs keyValuePairs) {
        this.sharedKeyValuePairsHolder.setKeyValuePairs(keyValuePairs);
    }

    /* access modifiers changed from: package-private */
    public void setObjectExtras(Map<String, Object> map) {
        this.objectExtras = map;
    }

    /* access modifiers changed from: package-private */
    public void loadAd(String str, String str2, EventListener eventListener, AdFormat adFormat, String str3, String str4, String str5, AdRequestParams adRequestParams, boolean z) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        Objects.requireNonNull(eventListener);
        Objects.requireNonNull(adFormat);
        Threads.runOnUi(new Runnable(adRequestParams, str, str2, adFormat, str3, str4, str5, eventListener, z) {
            public final /* synthetic */ AdRequestParams f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ AdFormat f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ EventListener f$8;
            public final /* synthetic */ boolean f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
            }

            public final void run() {
                InterstitialLoader.this.lambda$loadAd$0$InterstitialLoader(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
            }
        });
    }

    public /* synthetic */ void lambda$loadAd$0$InterstitialLoader(AdRequestParams adRequestParams, final String str, final String str2, AdFormat adFormat, String str3, String str4, String str5, final EventListener eventListener, boolean z) {
        String string = this.applicationContext.getString(C11097R.string.smaato_sdk_core_fullscreen_dimension);
        String str6 = null;
        try {
            AdSettings build = new AdSettings.Builder().setPublisherId(str).setAdSpaceId(str2).setAdFormat(adFormat).setWidth(UIUtils.getDisplayWidthInDp()).setHeight(UIUtils.getDisplayHeightInDp()).setMediationNetworkName(str3).setMediationNetworkSDKVersion(str4).setMediationAdapterVersion(str5).setAdDimension(this.fullscreenAdDimensionMapper.getDimension(string)).setVideoSkipInterval(adRequestParams != null ? adRequestParams.getVideoSkipInterval() : null).setDisplayAdCloseInterval(adRequestParams != null ? adRequestParams.getDisplayAdCloseInterval() : null).build();
            InterstitialAdTypeStrategy interstitialAdTypeStrategy = new InterstitialAdTypeStrategy(str, str2);
            AdRequest.Builder keyValuePairs = new AdRequest.Builder().setAdSettings(build).setUserInfo(this.sdkConfiguration.getUserInfo()).setKeyValuePairs(getKeyValuePairs());
            if (adRequestParams != null) {
                str6 = adRequestParams.getUBUniqueId();
            }
            this.repository.loadAd(interstitialAdTypeStrategy, keyValuePairs.setUbUniqueId(str6).setIsSplash(Boolean.valueOf(z)).build(), new AdRepository.Listener() {
                public void onAdLoadSuccess(AdTypeStrategy adTypeStrategy, AdPresenter adPresenter) {
                    InterstitialLoader.this.handleAdLoaded(adPresenter, eventListener);
                }

                public void onAdLoadError(AdTypeStrategy adTypeStrategy, AdLoaderException adLoaderException) {
                    InterstitialLoader.this.handleAdFailedToLoad(new InterstitialRequestError(InterstitialErrorMapperUtil.map(adLoaderException.getErrorType()), str, str2), eventListener);
                }
            }, this.objectExtras);
        } catch (Exception unused) {
            eventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.INVALID_REQUEST, str, str2));
        }
    }

    /* access modifiers changed from: private */
    public void handleAdLoaded(AdPresenter adPresenter, EventListener eventListener) {
        if (adPresenter instanceof InterstitialAdPresenter) {
            Threads.runOnUi(new Runnable(eventListener, (InterstitialAdPresenter) adPresenter) {
                public final /* synthetic */ EventListener f$1;
                public final /* synthetic */ InterstitialAdPresenter f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    InterstitialLoader.this.lambda$handleAdLoaded$1$InterstitialLoader(this.f$1, this.f$2);
                }
            });
        } else if (adPresenter instanceof InterstitialCsmAdPresenter) {
            Threads.runOnUi(new Runnable(eventListener, (InterstitialCsmAdPresenter) adPresenter) {
                public final /* synthetic */ EventListener f$1;
                public final /* synthetic */ InterstitialCsmAdPresenter f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    InterstitialLoader.this.lambda$handleAdLoaded$2$InterstitialLoader(this.f$1, this.f$2);
                }
            });
        } else {
            handleAdFailedToLoad(new InterstitialRequestError(InterstitialError.INTERNAL_ERROR, adPresenter.getPublisherId(), adPresenter.getAdSpaceId()), eventListener);
        }
    }

    /* access modifiers changed from: private */
    public void handleAdFailedToLoad(InterstitialRequestError interstitialRequestError, EventListener eventListener) {
        Threads.runOnUi(new Runnable(interstitialRequestError) {
            public final /* synthetic */ InterstitialRequestError f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                EventListener.this.onAdFailedToLoad(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: handleLoadedCsmInterstitialAd */
    public void lambda$handleAdLoaded$2$InterstitialLoader(EventListener eventListener, InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
        if (interstitialCsmAdPresenter.isValid()) {
            eventListener.onAdLoaded(new InterstitialCsmAdImpl(interstitialCsmAdPresenter, eventListener));
        } else {
            eventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.CREATIVE_RESOURCE_EXPIRED, interstitialCsmAdPresenter.getPublisherId(), interstitialCsmAdPresenter.getAdSpaceId()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleLoadedInterstitialAd */
    public void lambda$handleAdLoaded$1$InterstitialLoader(EventListener eventListener, InterstitialAdPresenter interstitialAdPresenter) {
        if (interstitialAdPresenter.isValid()) {
            eventListener.onAdLoaded(new InterstitialAdImpl(interstitialAdPresenter, this.uuidSupplier, this.interstitialAdPresenterStorage, eventListener));
        } else {
            eventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.CREATIVE_RESOURCE_EXPIRED, interstitialAdPresenter.getPublisherId(), interstitialAdPresenter.getAdSpaceId()));
        }
    }
}
