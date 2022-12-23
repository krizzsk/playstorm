package com.smaato.sdk.richmedia.p387ad;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.flow.SdkSchedulers;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.network.trackers.BeaconTrackerAdQualityViolationUtils;
import com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.util.HtmlPlayerUtils;

/* renamed from: com.smaato.sdk.richmedia.ad.DiRichMediaAdLayer */
public final class DiRichMediaAdLayer {

    /* renamed from: com.smaato.sdk.richmedia.ad.DiRichMediaAdLayer$RichMediaAdInteractorProviderFunction */
    private interface RichMediaAdInteractorProviderFunction extends Function<RichMediaAdObject, RichMediaAdInteractor> {
    }

    private DiRichMediaAdLayer() {
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
                DiRichMediaAdLayer.lambda$createRegistry$12(AdPresenterNameShaper.this, this.f$1, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$12(AdPresenterNameShaper adPresenterNameShaper, String str, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.RICH_MEDIA, InterstitialAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str, adPresenterNameShaper) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$createRegistry$0(this.f$0, this.f$1, diConstructor);
            }
        });
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.RICH_MEDIA, BannerAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$createRegistry$1(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.VIDEO, BannerAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$createRegistry$2(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(WebViewRendererImpl.class, $$Lambda$DiRichMediaAdLayer$IOTQNdWXRBnSAZpxKHU80H7auc.INSTANCE);
        diRegistry.registerSingletonFactory(LoadedWebViewCache.class, $$Lambda$DiRichMediaAdLayer$FxKYNNidyaJ0ZGzVOfQoGA8lHo.INSTANCE);
        diRegistry.registerFactory("RichMediaModuleInterfacebannerRichMedia", RichMediaAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$createRegistry$6(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory("RichMediaModuleInterfaceinterstitialRichMedia", RichMediaAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$createRegistry$8(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(str, StateMachine.class, $$Lambda$DiRichMediaAdLayer$BADUzyX5Z5vxnufdLKhnvZrazA.INSTANCE);
        diRegistry.registerFactory("RichMediaModuleInterfacebannerRichMedia", ImpressionDetector.class, $$Lambda$DiRichMediaAdLayer$Wl1mqPI43NofqJxduv4mmXQUVc.INSTANCE);
        diRegistry.registerFactory("RichMediaModuleInterfaceinterstitialRichMedia", ImpressionDetector.class, $$Lambda$DiRichMediaAdLayer$mqobUxXxf7HSNnB4eAb5F3RoD48.INSTANCE);
    }

    static /* synthetic */ AdPresenterBuilder lambda$createRegistry$0(String str, AdPresenterNameShaper adPresenterNameShaper, DiConstructor diConstructor) {
        return new InterstitialRichMediaAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (RichMediaAdResponseParser) diConstructor.get(str, RichMediaAdResponseParser.class), (RichMediaVisibilityTrackerCreator) diConstructor.get(str, RichMediaVisibilityTrackerCreator.class), (Timer) diConstructor.get(adPresenterNameShaper.shapeName(AdFormat.INTERSTITIAL, InterstitialAdPresenter.class), Timer.class), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (MraidConfigurator) diConstructor.get(str, MraidConfigurator.class), (Function) diConstructor.get("RichMediaModuleInterfaceinterstitialRichMedia", RichMediaAdInteractorProviderFunction.class), (OMWebViewViewabilityTracker) diConstructor.get(OMWebViewViewabilityTracker.class), (WebViewRenderer) diConstructor.get(WebViewRendererImpl.class), (LoadedWebViewCache) diConstructor.get(LoadedWebViewCache.class));
    }

    static /* synthetic */ AdPresenterBuilder lambda$createRegistry$1(String str, DiConstructor diConstructor) {
        return new BannerRichMediaAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (RichMediaAdResponseParser) diConstructor.get(str, RichMediaAdResponseParser.class), (RichMediaVisibilityTrackerCreator) diConstructor.get(str, RichMediaVisibilityTrackerCreator.class), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (MraidConfigurator) diConstructor.get(str, MraidConfigurator.class), (Function) diConstructor.get("RichMediaModuleInterfacebannerRichMedia", RichMediaAdInteractorProviderFunction.class), (OMWebViewViewabilityTracker) diConstructor.get(OMWebViewViewabilityTracker.class), (WebViewRenderer) diConstructor.get(WebViewRendererImpl.class), (LoadedWebViewCache) diConstructor.get(LoadedWebViewCache.class));
    }

    static /* synthetic */ AdPresenterBuilder lambda$createRegistry$2(String str, DiConstructor diConstructor) {
        return new BannerHtmlPlayerAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (RichMediaAdResponseParser) diConstructor.get(str, RichMediaAdResponseParser.class), (RichMediaVisibilityTrackerCreator) diConstructor.get(str, RichMediaVisibilityTrackerCreator.class), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (MraidConfigurator) diConstructor.get(str, MraidConfigurator.class), (Function) diConstructor.get("RichMediaModuleInterfacebannerRichMedia", RichMediaAdInteractorProviderFunction.class), (OMWebViewViewabilityTracker) diConstructor.get(OMWebViewViewabilityTracker.class), (WebViewRenderer) diConstructor.get(WebViewRendererImpl.class), (LoadedWebViewCache) diConstructor.get(LoadedWebViewCache.class), (HtmlPlayerUtils) diConstructor.get(HtmlPlayerUtils.class));
    }

    static /* synthetic */ WebViewRendererImpl lambda$createRegistry$3(DiConstructor diConstructor) {
        return new WebViewRendererImpl((Context) diConstructor.get(Application.class), new SdkSchedulers(), (RichMediaWebViewFactory) diConstructor.get(RichMediaWebViewFactory.class), (ApiParams) diConstructor.get(ApiParams.class));
    }

    static /* synthetic */ LoadedWebViewCache lambda$createRegistry$4(DiConstructor diConstructor) {
        return new LoadedWebViewCache();
    }

    static /* synthetic */ RichMediaAdInteractorProviderFunction lambda$createRegistry$6(String str, DiConstructor diConstructor) {
        return new RichMediaAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiRichMediaAdLayer.lambda$createRegistry$5(DiConstructor.this, this.f$1, (RichMediaAdObject) obj);
            }
        };
    }

    static /* synthetic */ RichMediaAdInteractor lambda$createRegistry$5(DiConstructor diConstructor, String str, RichMediaAdObject richMediaAdObject) {
        return new RichMediaAdInteractor((Logger) diConstructor.get(Logger.class), richMediaAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkHandler) diConstructor.get(LinkHandler.class), (AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("RichMediaModuleInterfacebannerRichMedia", ImpressionDetector.class), (BeaconTrackerAdQualityViolationUtils) diConstructor.get(BeaconTrackerAdQualityViolationUtils.class), (ApiParams) diConstructor.get(ApiParams.class));
    }

    static /* synthetic */ RichMediaAdInteractorProviderFunction lambda$createRegistry$8(String str, DiConstructor diConstructor) {
        return new RichMediaAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiRichMediaAdLayer.lambda$createRegistry$7(DiConstructor.this, this.f$1, (RichMediaAdObject) obj);
            }
        };
    }

    static /* synthetic */ RichMediaAdInteractor lambda$createRegistry$7(DiConstructor diConstructor, String str, RichMediaAdObject richMediaAdObject) {
        return new RichMediaAdInteractor((Logger) diConstructor.get(Logger.class), richMediaAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkHandler) diConstructor.get(LinkHandler.class), (AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("RichMediaModuleInterfaceinterstitialRichMedia", ImpressionDetector.class), (BeaconTrackerAdQualityViolationUtils) diConstructor.get(BeaconTrackerAdQualityViolationUtils.class), (ApiParams) diConstructor.get(ApiParams.class));
    }

    static /* synthetic */ ImpressionDetector lambda$createRegistry$10(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.CREATED);
    }

    static /* synthetic */ ImpressionDetector lambda$createRegistry$11(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.IMPRESSED);
    }
}
