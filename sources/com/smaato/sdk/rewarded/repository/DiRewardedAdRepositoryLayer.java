package com.smaato.sdk.rewarded.repository;

import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.repository.AdLoadersRegistry;
import com.smaato.sdk.core.repository.MultipleAdLoadersRegistry;
import com.smaato.sdk.rewarded.framework.RewardedAdModuleInterface;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

public final class DiRewardedAdRepositoryLayer {
    private static final AdStateMachine.State DEFAULT_IMPRESSION_STATE = AdStateMachine.State.IMPRESSED;

    private DiRewardedAdRepositoryLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of(C11173xae2ea466.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(RetainedAdPresenterRepository.class, C11175xf90b8680.INSTANCE);
        diRegistry.registerFactory("RewardedAdModuleInterface.RewardedAdLoadExecutioner", ExecutorService.class, C11176x32045df6.INSTANCE);
        diRegistry.registerSingletonFactory(RewardedAdModuleInterface.MODULE_DI_NAME, AdLoadersRegistry.class, C11174x98512de4.INSTANCE);
        diRegistry.registerSingletonFactory(RewardedAdModuleInterface.MODULE_DI_NAME, ConfigurationRepository.class, C11177xf31f4827.INSTANCE);
    }

    static /* synthetic */ RetainedAdPresenterRepository lambda$createRegistry$0(DiConstructor diConstructor) {
        return new RetainedAdPresenterRepository(new HashMap());
    }

    static /* synthetic */ AdLoadersRegistry lambda$createRegistry$2(DiConstructor diConstructor) {
        return new MultipleAdLoadersRegistry((ConfigurationRepository) diConstructor.get(RewardedAdModuleInterface.MODULE_DI_NAME, ConfigurationRepository.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ ConfigurationRepository lambda$createRegistry$3(DiConstructor diConstructor) {
        return (ConfigurationRepository) ((DiConfiguration.Provider) diConstructor.get(DiConfiguration.Provider.class)).apply(new Configuration(20, DEFAULT_IMPRESSION_STATE));
    }
}
