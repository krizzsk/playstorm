package com.smaato.sdk.banner.csm;

import android.app.Application;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdInteractorProviderFunction;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.DiAdLayer;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import java.util.ServiceLoader;

public final class BannerCsmModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return "BANNER_CSM_DI_NAME";
    }

    public String version() {
        return "21.8.3";
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new BannerCsmAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return BannerCsmModuleInterface.lambda$getAdLoaderPluginFactory$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$BannerCsmModuleInterface$mPVhqufUUuEW01LSlZxcdTTFy8.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$getAdLoaderPluginFactory$0(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, BannerCsmAdPresenterBuilderImpl.class);
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return adFormat == AdFormat.CSM && BannerAdPresenter.class.isAssignableFrom(cls);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                BannerCsmModuleInterface.this.lambda$moduleDiRegistry$8$BannerCsmModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$8$BannerCsmModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), CsmAdInteractorProviderFunction.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerCsmModuleInterface.this.lambda$moduleDiRegistry$3$BannerCsmModuleInterface(diConstructor);
            }
        });
        diRegistry.registerFactory(moduleDiName(), ImpressionDetector.class, $$Lambda$BannerCsmModuleInterface$wSuljcijSBIan_fqaHenekKsuM.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), StateMachine.class, $$Lambda$BannerCsmModuleInterface$JRr1hNWPaMAxMj8DnqjSg_YFQ4.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$BannerCsmModuleInterface$X1iIMk5VkW1crrICQ86lnsxYsjA.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerCsmModuleInterface.this.lambda$moduleDiRegistry$7$BannerCsmModuleInterface(diConstructor);
            }
        });
    }

    public /* synthetic */ CsmAdInteractorProviderFunction lambda$moduleDiRegistry$3$BannerCsmModuleInterface(DiConstructor diConstructor) {
        return new CsmAdInteractorProviderFunction(diConstructor) {
            public final /* synthetic */ DiConstructor f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return BannerCsmModuleInterface.this.lambda$moduleDiRegistry$2$BannerCsmModuleInterface(this.f$1, (CsmAdObject) obj);
            }
        };
    }

    public /* synthetic */ CsmAdInteractor lambda$moduleDiRegistry$2$BannerCsmModuleInterface(DiConstructor diConstructor, CsmAdObject csmAdObject) {
        return new CsmAdInteractor(DiLogLayer.getLoggerFrom(diConstructor), csmAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(moduleDiName(), StateMachine.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get(moduleDiName(), ImpressionDetector.class));
    }

    static /* synthetic */ ImpressionDetector lambda$moduleDiRegistry$4(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.CREATED);
    }

    public /* synthetic */ VisibilityTrackerCreator lambda$moduleDiRegistry$7$BannerCsmModuleInterface(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), moduleDiName());
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRegistry.m32956of(new Consumer(adPresenterNameShaper) {
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BannerCsmModuleInterface.this.lambda$moduleAdPresenterDiRegistry$10$BannerCsmModuleInterface(this.f$1, (DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleAdPresenterDiRegistry$10$BannerCsmModuleInterface(AdPresenterNameShaper adPresenterNameShaper, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.CSM, BannerAdPresenter.class), BannerCsmAdPresenterBuilderImpl.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerCsmModuleInterface.this.lambda$moduleAdPresenterDiRegistry$9$BannerCsmModuleInterface(diConstructor);
            }
        });
    }

    public /* synthetic */ BannerCsmAdPresenterBuilderImpl lambda$moduleAdPresenterDiRegistry$9$BannerCsmModuleInterface(DiConstructor diConstructor) {
        return new BannerCsmAdPresenterBuilderImpl((Function) diConstructor.get(moduleDiName(), CsmAdInteractorProviderFunction.class), (VisibilityTrackerCreator) diConstructor.get(moduleDiName(), VisibilityTrackerCreator.class), ServiceLoader.load(SMABannerNetworkEvent.class, ((Application) diConstructor.get(Application.class)).getClassLoader()), (CsmAdResponseParser) diConstructor.get(CsmAdResponseParser.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "BannerCsmModuleInterface{supportedFormat: " + AdFormat.CSM + "}";
    }
}
