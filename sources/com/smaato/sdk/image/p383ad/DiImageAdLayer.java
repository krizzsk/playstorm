package com.smaato.sdk.image.p383ad;

import android.graphics.Bitmap;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.network.trackers.BeaconTrackerAdQualityViolationUtils;
import com.smaato.sdk.core.openmeasurement.OMImageViewabilityTracker;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;
import java.io.InputStream;

/* renamed from: com.smaato.sdk.image.ad.DiImageAdLayer */
public final class DiImageAdLayer {

    /* renamed from: com.smaato.sdk.image.ad.DiImageAdLayer$ImageAdInteractorProviderFunction */
    private interface ImageAdInteractorProviderFunction extends Function<ImageAdObject, ImageAdInteractor> {
    }

    private DiImageAdLayer() {
    }

    public static DiRegistry createRegistry(AdPresenterNameShaper adPresenterNameShaper, String str) {
        Objects.requireNonNull(adPresenterNameShaper);
        Objects.requireNonNull(str);
        return DiRegistry.m32956of(new Consumer(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                DiImageAdLayer.lambda$createRegistry$9(AdPresenterNameShaper.this, this.f$1, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$9(AdPresenterNameShaper adPresenterNameShaper, String str, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.STATIC_IMAGE, InterstitialAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str, adPresenterNameShaper) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$createRegistry$0(this.f$0, this.f$1, diConstructor);
            }
        });
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.STATIC_IMAGE, BannerAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$createRegistry$1(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory("ImageModuleInterfacebannerImage", ImageAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$createRegistry$3(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory("ImageModuleInterfaceinterstitialImage", ImageAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$createRegistry$5(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(str, StateMachine.class, $$Lambda$DiImageAdLayer$vlPeQMWsGWOfUB3YVLFf5kxxIzY.INSTANCE);
        diRegistry.registerFactory("ImageModuleInterfacebannerImage", ImpressionDetector.class, $$Lambda$DiImageAdLayer$mGvlyvsyyTyKB_0GFEg8Gbsy2is.INSTANCE);
        diRegistry.registerFactory("ImageModuleInterfaceinterstitialImage", ImpressionDetector.class, $$Lambda$DiImageAdLayer$TReIN6cBCRlcy0ZraocX9flUKDM.INSTANCE);
    }

    static /* synthetic */ AdPresenterBuilder lambda$createRegistry$0(String str, AdPresenterNameShaper adPresenterNameShaper, DiConstructor diConstructor) {
        return new InterstitialImageAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (Function) diConstructor.get("ImageModuleInterfaceinterstitialImage", ImageAdInteractorProviderFunction.class), (ImageAdResponseParser) diConstructor.get(str, ImageAdResponseParser.class), (VisibilityTrackerCreator) diConstructor.get(str, VisibilityTrackerCreator.class), (Timer) diConstructor.get(adPresenterNameShaper.shapeName(AdFormat.INTERSTITIAL, InterstitialAdPresenter.class), Timer.class), getImageResourceLoader(str, diConstructor), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (ImageAdPresenterBuilderAdQualityViolationUtils) diConstructor.get(ImageAdPresenterBuilderAdQualityViolationUtils.class));
    }

    static /* synthetic */ AdPresenterBuilder lambda$createRegistry$1(String str, DiConstructor diConstructor) {
        return new BannerImageAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (Function) diConstructor.get("ImageModuleInterfacebannerImage", ImageAdInteractorProviderFunction.class), (ImageAdResponseParser) diConstructor.get(str, ImageAdResponseParser.class), (VisibilityTrackerCreator) diConstructor.get(str, VisibilityTrackerCreator.class), getImageResourceLoader(str, diConstructor), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (ImageAdPresenterBuilderAdQualityViolationUtils) diConstructor.get(ImageAdPresenterBuilderAdQualityViolationUtils.class), (OMImageViewabilityTracker) diConstructor.get(OMImageViewabilityTracker.class));
    }

    static /* synthetic */ ImageAdInteractorProviderFunction lambda$createRegistry$3(String str, DiConstructor diConstructor) {
        return new ImageAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiImageAdLayer.lambda$createRegistry$2(DiConstructor.this, this.f$1, (ImageAdObject) obj);
            }
        };
    }

    static /* synthetic */ ImageAdInteractor lambda$createRegistry$2(DiConstructor diConstructor, String str, ImageAdObject imageAdObject) {
        return new ImageAdInteractor((Logger) diConstructor.get(Logger.class), imageAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkHandler) diConstructor.get(LinkHandler.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("ImageModuleInterfacebannerImage", ImpressionDetector.class), (BeaconTrackerAdQualityViolationUtils) diConstructor.get(BeaconTrackerAdQualityViolationUtils.class));
    }

    static /* synthetic */ ImageAdInteractorProviderFunction lambda$createRegistry$5(String str, DiConstructor diConstructor) {
        return new ImageAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiImageAdLayer.lambda$createRegistry$4(DiConstructor.this, this.f$1, (ImageAdObject) obj);
            }
        };
    }

    static /* synthetic */ ImageAdInteractor lambda$createRegistry$4(DiConstructor diConstructor, String str, ImageAdObject imageAdObject) {
        return new ImageAdInteractor((Logger) diConstructor.get(Logger.class), imageAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkHandler) diConstructor.get(LinkHandler.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("ImageModuleInterfaceinterstitialImage", ImpressionDetector.class), (BeaconTrackerAdQualityViolationUtils) diConstructor.get(BeaconTrackerAdQualityViolationUtils.class));
    }

    static /* synthetic */ ImpressionDetector lambda$createRegistry$7(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.CREATED);
    }

    static /* synthetic */ ImpressionDetector lambda$createRegistry$8(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.IMPRESSED);
    }

    private static ResourceLoader<InputStream, Bitmap> getImageResourceLoader(String str, DiConstructor diConstructor) {
        Objects.requireNonNull(diConstructor);
        return (ResourceLoader) diConstructor.get(str, ResourceLoader.class);
    }
}
