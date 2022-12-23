package com.smaato.sdk.rewarded;

import android.app.Application;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdLoaderException;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdRequest;
import com.smaato.sdk.core.p378ad.AdSettings;
import com.smaato.sdk.core.p378ad.FullscreenAdDimensionMapper;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.p378ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.repository.AdTypeStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.rewarded.RewardedInterstitialInstance;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenter;
import com.smaato.sdk.rewarded.repository.RewardedAdTypeStrategy;
import java.util.HashMap;
import java.util.Map;

final class RewardedInterstitialInstance {
    /* access modifiers changed from: private */
    public final Application applicationContext;
    private final FullscreenAdDimensionMapper fullscreenAdDimensionMapper;
    /* access modifiers changed from: private */
    public final Logger logger;
    private Map<String, Object> objectExtras = new HashMap();
    private final AdRepository repository;
    /* access modifiers changed from: private */
    public final RewardedAdErrorMapper rewardedAdErrorMapper;
    /* access modifiers changed from: private */
    public final RewardedFactory rewardedFactory;
    private final SdkConfiguration sdkConfiguration;
    private final SharedKeyValuePairsHolder sharedKeyValuePairsHolder;

    RewardedInterstitialInstance(RewardedFactory rewardedFactory2, AdRepository adRepository, RewardedAdErrorMapper rewardedAdErrorMapper2, SdkConfiguration sdkConfiguration2, SharedKeyValuePairsHolder sharedKeyValuePairsHolder2, FullscreenAdDimensionMapper fullscreenAdDimensionMapper2, Application application, Logger logger2) {
        this.rewardedFactory = (RewardedFactory) Objects.requireNonNull(rewardedFactory2);
        this.repository = (AdRepository) Objects.requireNonNull(adRepository);
        this.rewardedAdErrorMapper = (RewardedAdErrorMapper) Objects.requireNonNull(rewardedAdErrorMapper2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.sharedKeyValuePairsHolder = (SharedKeyValuePairsHolder) Objects.requireNonNull(sharedKeyValuePairsHolder2);
        this.fullscreenAdDimensionMapper = (FullscreenAdDimensionMapper) Objects.requireNonNull(fullscreenAdDimensionMapper2);
        this.applicationContext = (Application) Objects.requireNonNull(application);
        this.logger = (Logger) Objects.requireNonNull(logger2);
    }

    /* access modifiers changed from: package-private */
    public void setObjectExtras(Map<String, Object> map) {
        this.objectExtras = map;
    }

    /* access modifiers changed from: package-private */
    public void loadAd(final String str, final String str2, final EventListener eventListener, String str3, String str4, String str5, AdRequestParams adRequestParams) {
        if (!isMissingParameter(eventListener, "eventListener")) {
            AdRequest buildAdRequest = buildAdRequest(str, str2, str3, str4, str5, adRequestParams);
            if (buildAdRequest == null) {
                Threads.runOnUi(new Runnable(str, str2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        EventListener.this.onAdFailedToLoad(new RewardedRequestError(RewardedError.INVALID_REQUEST, this.f$1, this.f$2));
                    }
                });
                return;
            }
            this.repository.loadAd(new RewardedAdTypeStrategy(str, str2), buildAdRequest, new AdRepository.Listener() {
                public void onAdLoadSuccess(AdTypeStrategy adTypeStrategy, AdPresenter adPresenter) {
                    if (adPresenter instanceof RewardedAdPresenter) {
                        Objects.onNotNull(eventListener, new Consumer(adPresenter) {
                            public final /* synthetic */ AdPresenter f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void accept(Object obj) {
                                RewardedInterstitialInstance.C111601.this.lambda$onAdLoadSuccess$1$RewardedInterstitialInstance$1(this.f$1, (EventListener) obj);
                            }
                        });
                    } else if (adPresenter instanceof RewardedCsmAdPresenter) {
                        Objects.onNotNull(eventListener, new Consumer(adPresenter) {
                            public final /* synthetic */ AdPresenter f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void accept(Object obj) {
                                RewardedInterstitialInstance.C111601.this.lambda$onAdLoadSuccess$3$RewardedInterstitialInstance$1(this.f$1, (EventListener) obj);
                            }
                        });
                    } else {
                        onAdLoadError(adTypeStrategy, new AdLoaderException(AdLoader.Error.INVALID_RESPONSE, new Exception("Bad response type for Rewarded Interstitial")));
                    }
                }

                public /* synthetic */ void lambda$onAdLoadSuccess$1$RewardedInterstitialInstance$1(AdPresenter adPresenter, EventListener eventListener) {
                    Threads.runOnUi(new Runnable(eventListener, adPresenter) {
                        public final /* synthetic */ EventListener f$1;
                        public final /* synthetic */ AdPresenter f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            RewardedInterstitialInstance.C111601.this.lambda$onAdLoadSuccess$0$RewardedInterstitialInstance$1(this.f$1, this.f$2);
                        }
                    });
                }

                public /* synthetic */ void lambda$onAdLoadSuccess$0$RewardedInterstitialInstance$1(EventListener eventListener, AdPresenter adPresenter) {
                    eventListener.onAdLoaded(RewardedInterstitialInstance.this.rewardedFactory.buildRewardedAd(RewardedInterstitialInstance.this.applicationContext, Threads.newUiHandler(), RewardedInterstitialInstance.this.logger, (RewardedAdPresenter) adPresenter, eventListener));
                }

                public /* synthetic */ void lambda$onAdLoadSuccess$3$RewardedInterstitialInstance$1(AdPresenter adPresenter, EventListener eventListener) {
                    Threads.runOnUi(new Runnable(eventListener, adPresenter) {
                        public final /* synthetic */ EventListener f$1;
                        public final /* synthetic */ AdPresenter f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            RewardedInterstitialInstance.C111601.this.lambda$onAdLoadSuccess$2$RewardedInterstitialInstance$1(this.f$1, this.f$2);
                        }
                    });
                }

                public /* synthetic */ void lambda$onAdLoadSuccess$2$RewardedInterstitialInstance$1(EventListener eventListener, AdPresenter adPresenter) {
                    eventListener.onAdLoaded(RewardedInterstitialInstance.this.rewardedFactory.buildRewardedCsmAd(Threads.newUiHandler(), RewardedInterstitialInstance.this.logger, (RewardedCsmAdPresenter) adPresenter, eventListener));
                }

                public void onAdLoadError(AdTypeStrategy adTypeStrategy, AdLoaderException adLoaderException) {
                    Objects.onNotNull(eventListener, new Consumer(adLoaderException, str, str2) {
                        public final /* synthetic */ AdLoaderException f$1;
                        public final /* synthetic */ String f$2;
                        public final /* synthetic */ String f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void accept(Object obj) {
                            RewardedInterstitialInstance.C111601.this.lambda$onAdLoadError$5$RewardedInterstitialInstance$1(this.f$1, this.f$2, this.f$3, (EventListener) obj);
                        }
                    });
                }

                public /* synthetic */ void lambda$onAdLoadError$5$RewardedInterstitialInstance$1(AdLoaderException adLoaderException, String str, String str2, EventListener eventListener) {
                    Threads.runOnUi(new Runnable(eventListener, adLoaderException, str, str2) {
                        public final /* synthetic */ EventListener f$1;
                        public final /* synthetic */ AdLoaderException f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ String f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        public final void run() {
                            RewardedInterstitialInstance.C111601.this.lambda$onAdLoadError$4$RewardedInterstitialInstance$1(this.f$1, this.f$2, this.f$3, this.f$4);
                        }
                    });
                }

                public /* synthetic */ void lambda$onAdLoadError$4$RewardedInterstitialInstance$1(EventListener eventListener, AdLoaderException adLoaderException, String str, String str2) {
                    eventListener.onAdFailedToLoad(new RewardedRequestError(RewardedInterstitialInstance.this.rewardedAdErrorMapper.map(adLoaderException.getErrorType()), str, str2));
                }
            }, this.objectExtras);
        }
    }

    private boolean isMissingParameter(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        this.logger.error(LogDomain.REWARDED, "Failed to proceed with RewardedInterstitial::loadAd. Missing required parameter: %s", str);
        return true;
    }

    private AdRequest buildAdRequest(String str, String str2, String str3, String str4, String str5, AdRequestParams adRequestParams) {
        String str6;
        try {
            AdRequest.Builder keyValuePairs = new AdRequest.Builder().setAdSettings(new AdSettings.Builder().setPublisherId(str).setAdSpaceId(str2).setAdFormat(AdFormat.VIDEO).setAdDimension(this.fullscreenAdDimensionMapper.getDimension(this.applicationContext.getString(C11155R.string.smaato_sdk_core_fullscreen_dimension))).setWidth(UIUtils.getDisplayWidthInDp()).setHeight(UIUtils.getDisplayHeightInDp()).setMediationNetworkName(str3).setMediationNetworkSDKVersion(str4).setMediationAdapterVersion(str5).build()).setUserInfo(this.sdkConfiguration.getUserInfo()).setKeyValuePairs(getKeyValuePairs());
            if (adRequestParams == null) {
                str6 = null;
            } else {
                str6 = adRequestParams.getUBUniqueId();
            }
            return keyValuePairs.setUbUniqueId(str6).build();
        } catch (Exception e) {
            this.logger.error(LogDomain.REWARDED, "Failed to proceed with RewardedInterstitial::loadAd. %s", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public KeyValuePairs getKeyValuePairs() {
        return this.sharedKeyValuePairsHolder.getKeyValuePairs();
    }

    /* access modifiers changed from: package-private */
    public void setKeyValuePairs(KeyValuePairs keyValuePairs) {
        this.sharedKeyValuePairsHolder.setKeyValuePairs(keyValuePairs);
    }
}
