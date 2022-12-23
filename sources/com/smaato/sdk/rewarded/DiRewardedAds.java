package com.smaato.sdk.rewarded;

import android.app.Application;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.api.VideoTypeAdRequestExtrasProvider;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p378ad.DiAdLayer;
import com.smaato.sdk.core.p378ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.rewarded.framework.RewardedAdModuleInterface;
import com.smaato.sdk.rewarded.repository.DiRewardedAdRepositoryLayer;
import com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository;

public final class DiRewardedAds {
    private DiRewardedAds() {
    }

    public static DiRegistry createRewardedAdsRegistry() {
        return DiRegistry.m32956of($$Lambda$DiRewardedAds$NXb5HZ9Cm1maZaEccRwhdrICd_c.INSTANCE);
    }

    static /* synthetic */ void lambda$createRewardedAdsRegistry$6(DiRegistry diRegistry) {
        diRegistry.registerFactory(RewardedInterstitialInstance.class, $$Lambda$DiRewardedAds$aEP6r9pGq1u1tE5K2_HTaOXi_M.INSTANCE);
        diRegistry.registerSingletonFactory(RewardedAdModuleInterface.MODULE_DI_NAME, SharedKeyValuePairsHolder.class, $$Lambda$DiRewardedAds$tkHrS8X1zoyez0S1Pm8hyUFJ58.INSTANCE);
        diRegistry.registerFactory(RewardedAdErrorMapper.class, $$Lambda$DiRewardedAds$NLX8zMNqKeQplS2VdyhRPhiZtAw.INSTANCE);
        diRegistry.registerFactory(RewardedFactory.class, $$Lambda$DiRewardedAds$2OVoIg_tEEmwNVzFwlqncFOnPD4.INSTANCE);
        diRegistry.registerFactory(RewardedAdModuleInterface.MODULE_DI_NAME, AdRequestExtrasProvider.class, $$Lambda$DiRewardedAds$KlllOiUZAiclxilo4hLmIf5mZOg.INSTANCE);
        diRegistry.addFrom(DiRewardedAdRepositoryLayer.createRegistry());
    }

    static /* synthetic */ RewardedInterstitialInstance lambda$createRewardedAdsRegistry$0(DiConstructor diConstructor) {
        return new RewardedInterstitialInstance((RewardedFactory) diConstructor.get(RewardedFactory.class), (AdRepository) ((DiAdRepository.Provider) diConstructor.get(DiAdRepository.Provider.class)).apply(RewardedAdModuleInterface.MODULE_DI_NAME), (RewardedAdErrorMapper) diConstructor.get(RewardedAdErrorMapper.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (SharedKeyValuePairsHolder) diConstructor.get(RewardedAdModuleInterface.MODULE_DI_NAME, SharedKeyValuePairsHolder.class), DiAdLayer.getFullscreenAdDimensionMapperFrom(diConstructor), (Application) diConstructor.get(Application.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ SharedKeyValuePairsHolder lambda$createRewardedAdsRegistry$1(DiConstructor diConstructor) {
        return new SharedKeyValuePairsHolder();
    }

    static /* synthetic */ RewardedAdErrorMapper lambda$createRewardedAdsRegistry$2(DiConstructor diConstructor) {
        return new RewardedAdErrorMapper();
    }

    static /* synthetic */ RewardedFactory lambda$createRewardedAdsRegistry$4(DiConstructor diConstructor) {
        return new RewardedFactory((RetainedAdPresenterRepository) diConstructor.get(RetainedAdPresenterRepository.class), $$Lambda$DiRewardedAds$h94QkrJ6D2_s53dq5hC4P9N2eC8.INSTANCE);
    }

    static /* synthetic */ AdRequestExtrasProvider lambda$createRewardedAdsRegistry$5(DiConstructor diConstructor) {
        return new VideoTypeAdRequestExtrasProvider("rewarded");
    }
}
