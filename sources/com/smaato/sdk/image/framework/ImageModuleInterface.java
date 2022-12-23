package com.smaato.sdk.image.framework;

import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.DiAdLayer;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceTransformer;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.image.p383ad.DiImageAdLayer;
import com.smaato.sdk.image.p383ad.ImageAdLoaderPlugin;
import com.smaato.sdk.image.p383ad.ImageAdPresenterBuilderAdQualityViolationUtils;
import com.smaato.sdk.image.p383ad.ImageAdResponseParser;
import com.smaato.sdk.image.resourceloader.ImageNetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.image.resourceloader.ImagePersistingStrategy;
import com.smaato.sdk.image.resourceloader.ImageResourceTransformer;
import java.util.concurrent.ExecutorService;

public class ImageModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return ImageDiNames.MODULE_DI_NAME;
    }

    public String version() {
        return "21.8.3";
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return adFormat == AdFormat.STATIC_IMAGE && (InterstitialAdPresenter.class.isAssignableFrom(cls) || BannerAdPresenter.class.isAssignableFrom(cls));
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new ImageAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return ImageModuleInterface.lambda$getAdLoaderPluginFactory$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$ImageModuleInterface$PKIZx8XbPMtvUJosV6bl5RKEUL4.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$getAdLoaderPluginFactory$0(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, AdPresenterBuilder.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                ImageModuleInterface.this.lambda$moduleDiRegistry$6$ImageModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$6$ImageModuleInterface(DiRegistry diRegistry) {
        setupResourceLoaderDiRegistry(diRegistry);
        diRegistry.registerSingletonFactory(ImageAdPresenterBuilderAdQualityViolationUtils.class, $$Lambda$ImageModuleInterface$lRqfxge6055rvG__quRdfqhnefg.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), ImageAdResponseParser.class, $$Lambda$ImageModuleInterface$kvrstu6qU0BMGwVQVhLURUloem8.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$ImageModuleInterface$iKldmym8US1TEiy6clRwuw6BqJQ.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return ImageModuleInterface.this.lambda$moduleDiRegistry$5$ImageModuleInterface(diConstructor);
            }
        });
    }

    static /* synthetic */ ImageAdPresenterBuilderAdQualityViolationUtils lambda$moduleDiRegistry$2(DiConstructor diConstructor) {
        return new ImageAdPresenterBuilderAdQualityViolationUtils((ApiParams) diConstructor.get(ApiParams.class));
    }

    static /* synthetic */ ImageAdResponseParser lambda$moduleDiRegistry$3(DiConstructor diConstructor) {
        return new ImageAdResponseParser(DiLogLayer.getLoggerFrom(diConstructor));
    }

    public /* synthetic */ VisibilityTrackerCreator lambda$moduleDiRegistry$5$ImageModuleInterface(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), moduleDiName());
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiImageAdLayer.createRegistry(adPresenterNameShaper, moduleDiName());
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    private void setupResourceLoaderDiRegistry(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(moduleDiName(), ResourceLoader.class, $$Lambda$ImageModuleInterface$BI38nPEiC5mPzhI__pKQKMH20tc.INSTANCE);
        diRegistry.registerSingletonFactory("ImageModuleInterfaceRESOURCE_LOADING_DEVICE_LOCAL_EXECUTOR", ExecutorService.class, $$Lambda$ImageModuleInterface$hudHLNrDI2QS_FmYA1W7_9tQ1gM.INSTANCE);
        diRegistry.registerSingletonFactory("ImageModuleInterfaceRESOURCE_LOADING_NETWORK_EXECUTOR", ExecutorService.class, $$Lambda$ImageModuleInterface$tdgxTXP9jvqG3gj_LU0Lnsqku7g.INSTANCE);
        diRegistry.registerFactory(ImageNetworkResourceStreamPreparationStrategy.class, $$Lambda$ImageModuleInterface$6DrCFuqNTfTzJbFAsMDe0KCfyYo.INSTANCE);
        diRegistry.registerFactory(ImagePersistingStrategy.class, $$Lambda$ImageModuleInterface$dvu0bKRhK0VIyHZIHRqvx2Z6Hws.INSTANCE);
        diRegistry.registerFactory(ImageResourceTransformer.class, $$Lambda$ImageModuleInterface$pTrhNa_hAWEmsZT8uC0BuEPqle0.INSTANCE);
    }

    static /* synthetic */ ResourceLoader lambda$setupResourceLoaderDiRegistry$7(DiConstructor diConstructor) {
        return new ResourceLoader(DiLogLayer.getLoggerFrom(diConstructor), CoreLightModuleInterface.getHttpClientWithStatusToException(diConstructor), (PersistingStrategy) diConstructor.get(ImagePersistingStrategy.class), (ResourceTransformer) diConstructor.get(ImageResourceTransformer.class));
    }

    static /* synthetic */ ImageNetworkResourceStreamPreparationStrategy lambda$setupResourceLoaderDiRegistry$10(DiConstructor diConstructor) {
        return new ImageNetworkResourceStreamPreparationStrategy((HeaderUtils) diConstructor.get(HeaderUtils.class));
    }

    static /* synthetic */ ImagePersistingStrategy lambda$setupResourceLoaderDiRegistry$11(DiConstructor diConstructor) {
        return new ImagePersistingStrategy();
    }

    static /* synthetic */ ImageResourceTransformer lambda$setupResourceLoaderDiRegistry$12(DiConstructor diConstructor) {
        return new ImageResourceTransformer();
    }

    public String toString() {
        return "ImageModuleInterface{supportedFormat: " + AdFormat.STATIC_IMAGE + "}";
    }
}
