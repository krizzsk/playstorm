package com.smaato.sdk.core.p378ad;

import android.content.SharedPreferences;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.ccpa.CcpaDataStorage;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.gdpr.IabCmpV2DataStorage;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.locationaware.LocationAware;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p379di.AdLoaderProviderFunction;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.SdkConfigHintBuilder;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;

/* renamed from: com.smaato.sdk.core.ad.DiAdLayer */
public final class DiAdLayer {

    /* renamed from: com.smaato.sdk.core.ad.DiAdLayer$AdRequestMapperProviderFunction */
    private interface AdRequestMapperProviderFunction extends Function<AdLoaderPlugin, AdRequestMapper> {
    }

    private DiAdLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiAdLayer$vDv0R8NTMMxmyYRm4ezUYi8FEFU.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$17(DiRegistry diRegistry) {
        diRegistry.registerFactory(AdLoaderProviderFunction.class, $$Lambda$DiAdLayer$ZU1vUWJomp6VglrvQynk_NIik.INSTANCE);
        diRegistry.registerSingletonFactory(Threading.class, $$Lambda$DiAdLayer$9J3kBZNSSLyvaZ0dWzqpCDWse2c.INSTANCE);
        diRegistry.registerFactory(AdRequestMapperProviderFunction.class, $$Lambda$DiAdLayer$uTYdp_iC48dfxJiwdHt5dmWe1ZM.INSTANCE);
        diRegistry.registerFactory(CsmAdResponseParser.class, $$Lambda$DiAdLayer$TDBUCcA7eMaunZuyp4ymuXHrrpE.INSTANCE);
        diRegistry.registerSingletonFactory(AdLoaderAdQualityViolationUtils.class, $$Lambda$DiAdLayer$_doR9sGGrYm6vaQ9Ur5DW8Zi4Jg.INSTANCE);
        diRegistry.registerFactory(CoreDiNames.NAME_DEFAULT_SHARED_PREFERENCES, SharedPreferences.class, $$Lambda$DiAdLayer$qS1hwS1jvq0hYodhyB4I3SsxbDM.INSTANCE);
        diRegistry.registerSingletonFactory(IabCmpV2DataStorage.class, $$Lambda$DiAdLayer$69zXilvRfkXiChTv3gHiuExbFWs.INSTANCE);
        diRegistry.registerSingletonFactory(SomaGdprDataSource.class, $$Lambda$DiAdLayer$ckaYC5kYxl9LQKmkgmD0arGiEN0.INSTANCE);
        diRegistry.registerSingletonFactory(SomaLgpdDataSource.class, $$Lambda$DiAdLayer$GeZXiELKrjcuOr5gvuotEjklfRY.INSTANCE);
        diRegistry.registerSingletonFactory(CcpaDataStorage.class, $$Lambda$DiAdLayer$n29l3g9fWY8CoPRckeNNccwwY3c.INSTANCE);
        diRegistry.registerFactory(FullscreenAdDimensionMapper.class, $$Lambda$DiAdLayer$bHx7rO886tPWr_6coc5k9oSN8kc.INSTANCE);
        diRegistry.registerFactory(RequestInfoMapper.class, $$Lambda$DiAdLayer$mSNK61V1k5sOjS2uKcMj1vXoKNI.INSTANCE);
        diRegistry.registerFactory(RequestInfoProvider.class, $$Lambda$DiAdLayer$OK9A7JV5WSpbDxllw1YAL4C0oV4.INSTANCE);
        diRegistry.registerFactory(AppBackgroundAwareHandler.class, $$Lambda$DiAdLayer$7Wcpskp_eA1kD7RjSno3hL4wKo4.INSTANCE);
        diRegistry.registerFactory(OneTimeActionFactory.class, $$Lambda$DiAdLayer$QCi9wykayfJCI6hrxmFjGYuSvfM.INSTANCE);
    }

    static /* synthetic */ AdLoader lambda$createRegistry$0(DiConstructor diConstructor, AdLoaderPlugin adLoaderPlugin) {
        return new AdLoader((Logger) diConstructor.get(Logger.class), getAdRequestMapper(diConstructor, adLoaderPlugin), adLoaderPlugin, (ApiConnector) diConstructor.get(ApiConnector.class), (SdkConfigHintBuilder) diConstructor.get(SdkConfigHintBuilder.class), (AdLoaderAdQualityViolationUtils) diConstructor.get(AdLoaderAdQualityViolationUtils.class));
    }

    static /* synthetic */ AdLoaderProviderFunction lambda$createRegistry$1(DiConstructor diConstructor) {
        return new AdLoaderProviderFunction() {
            public final Object apply(Object obj) {
                return DiAdLayer.lambda$createRegistry$0(DiConstructor.this, (AdLoaderPlugin) obj);
            }
        };
    }

    static /* synthetic */ Threading lambda$createRegistry$2(DiConstructor diConstructor) {
        return new DefaultThreading();
    }

    static /* synthetic */ AdRequestMapper lambda$createRegistry$3(DiConstructor diConstructor, AdLoaderPlugin adLoaderPlugin) {
        return new AdRequestMapper((Logger) diConstructor.get(Logger.class), adLoaderPlugin);
    }

    static /* synthetic */ AdRequestMapperProviderFunction lambda$createRegistry$4(DiConstructor diConstructor) {
        return new AdRequestMapperProviderFunction() {
            public final Object apply(Object obj) {
                return DiAdLayer.lambda$createRegistry$3(DiConstructor.this, (AdLoaderPlugin) obj);
            }
        };
    }

    static /* synthetic */ CsmAdResponseParser lambda$createRegistry$5(DiConstructor diConstructor) {
        return new CsmAdResponseParser(DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ AdLoaderAdQualityViolationUtils lambda$createRegistry$6(DiConstructor diConstructor) {
        return new AdLoaderAdQualityViolationUtils((AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class));
    }

    static /* synthetic */ IabCmpV2DataStorage lambda$createRegistry$8(DiConstructor diConstructor) {
        return new IabCmpV2DataStorage((SharedPreferences) diConstructor.get(CoreDiNames.NAME_DEFAULT_SHARED_PREFERENCES, SharedPreferences.class));
    }

    static /* synthetic */ SomaGdprDataSource lambda$createRegistry$9(DiConstructor diConstructor) {
        return new SomaGdprDataSource((IabCmpV2DataStorage) diConstructor.get(IabCmpV2DataStorage.class), (LocationAware) diConstructor.get(CoreDiNames.LOCATION_AWARE_GDPR, LocationAware.class));
    }

    static /* synthetic */ SomaLgpdDataSource lambda$createRegistry$10(DiConstructor diConstructor) {
        return new SomaLgpdDataSource((LocationAware) diConstructor.get(CoreDiNames.LOCATION_AWARE_LGPD, LocationAware.class));
    }

    static /* synthetic */ CcpaDataStorage lambda$createRegistry$11(DiConstructor diConstructor) {
        return new CcpaDataStorage((SharedPreferences) diConstructor.get(CoreDiNames.NAME_DEFAULT_SHARED_PREFERENCES, SharedPreferences.class));
    }

    static /* synthetic */ FullscreenAdDimensionMapper lambda$createRegistry$12(DiConstructor diConstructor) {
        return new FullscreenAdDimensionMapper();
    }

    static /* synthetic */ RequestInfoMapper lambda$createRegistry$13(DiConstructor diConstructor) {
        return new RequestInfoMapper();
    }

    static /* synthetic */ RequestInfoProvider lambda$createRegistry$14(DiConstructor diConstructor) {
        return new RequestInfoProvider((DataCollector) diConstructor.get(DataCollector.class), (SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (SomaLgpdDataSource) diConstructor.get(SomaLgpdDataSource.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), ((DataCollector) diConstructor.get(DataCollector.class)).getSystemInfo());
    }

    static /* synthetic */ AppBackgroundAwareHandler lambda$createRegistry$15(DiConstructor diConstructor) {
        return new AppBackgroundAwareHandler(DiLogLayer.getLoggerFrom(diConstructor), Threads.newUiHandler(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class));
    }

    static /* synthetic */ OneTimeActionFactory lambda$createRegistry$16(DiConstructor diConstructor) {
        return new OneTimeActionFactory(Threads.newUiHandler());
    }

    public static <T> T tryGetOrNull(DiConstructor diConstructor, String str, Class<T> cls) {
        Objects.requireNonNull(diConstructor);
        Objects.requireNonNull(cls);
        try {
            return diConstructor.get(str, cls);
        } catch (Exception e) {
            ((Logger) diConstructor.get(Logger.class)).error(LogDomain.CORE, e, "Probably configuration troubles", new Object[0]);
            return null;
        }
    }

    private static AdRequestMapper getAdRequestMapper(DiConstructor diConstructor, AdLoaderPlugin adLoaderPlugin) {
        return (AdRequestMapper) ((AdRequestMapperProviderFunction) diConstructor.get(AdRequestMapperProviderFunction.class)).apply(adLoaderPlugin);
    }

    public static FullscreenAdDimensionMapper getFullscreenAdDimensionMapperFrom(DiConstructor diConstructor) {
        return (FullscreenAdDimensionMapper) diConstructor.get(FullscreenAdDimensionMapper.class);
    }

    /* renamed from: com.smaato.sdk.core.ad.DiAdLayer$DefaultThreading */
    private static class DefaultThreading implements Threading {
        private DefaultThreading() {
        }

        public void runOnBackgroundThread(Runnable runnable) {
            Threads.runOnBackgroundThread(runnable);
        }
    }
}
