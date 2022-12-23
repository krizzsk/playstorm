package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.api.ExpirationTimestampFactory;
import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p379di.AdLoaderProviderFunction;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.p380ub.UbCache;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.Supplier;
import java.util.HashMap;

public final class DiAdRepository {
    public static final String CORE_DEFAULT_CONFIGURATION_REPOSITORY = "default_configuration_provider";
    private static final Configuration DEFAULT_CORE_CONFIGURATION = new Configuration(20, AdStateMachine.State.IMPRESSED);

    public interface Provider extends Function<String, AdRepository> {
    }

    private DiAdRepository() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiAdRepository$_SUGDTsWgAN1iTKgGKRyMIBAmE.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(Provider.class, $$Lambda$DiAdRepository$Wa8XsHMm9h7ZbhMVDuukmG7soWc.INSTANCE);
        diRegistry.registerSingletonFactory(CORE_DEFAULT_CONFIGURATION_REPOSITORY, ConfigurationRepository.class, $$Lambda$DiAdRepository$Wu8aO62C_wYFSTeg14U35bM52k.INSTANCE);
    }

    static /* synthetic */ AdRepository lambda$createRegistry$1(DiConstructor diConstructor, String str) {
        return new AdRepositoryImpl(DiLogLayer.getLoggerFrom(diConstructor), (UbCache) diConstructor.get(UbCache.class), (AdLoadersRegistry) diConstructor.get(str, AdLoadersRegistry.class), new Supplier(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object get() {
                return DiAdRepository.lambda$createRegistry$0(DiConstructor.this, this.f$1);
            }
        }, (Schedulers) diConstructor.get(Schedulers.class), (SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (SomaLgpdDataSource) diConstructor.get(SomaLgpdDataSource.class), (UbErrorReporting) diConstructor.getOrNull(UbErrorReporting.class), (ExpirationTimestampFactory) diConstructor.get(ExpirationTimestampFactory.class));
    }

    static /* synthetic */ Provider lambda$createRegistry$2(DiConstructor diConstructor) {
        return new Provider() {
            public final Object apply(Object obj) {
                return DiAdRepository.lambda$createRegistry$1(DiConstructor.this, (String) obj);
            }
        };
    }

    static /* synthetic */ AdLoader lambda$createRegistry$0(DiConstructor diConstructor, String str) {
        return (AdLoader) ((AdLoaderProviderFunction) diConstructor.get(AdLoaderProviderFunction.class)).apply((AdLoaderPlugin) diConstructor.get(str, AdLoaderPlugin.class));
    }

    static /* synthetic */ ConfigurationRepository lambda$createRegistry$3(DiConstructor diConstructor) {
        return new ConfigurationRepository(new HashMap(), DEFAULT_CORE_CONFIGURATION);
    }
}
