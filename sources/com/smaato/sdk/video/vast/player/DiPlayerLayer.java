package com.smaato.sdk.video.vast.player;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.framework.VideoDiNames;
import com.smaato.sdk.video.utils.AnimationHelper;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerActionValidatorFactory;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerCreator;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerStateMachineFactory;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerTransitionValidatorFactory;
import com.smaato.sdk.video.vast.tracking.VastBeaconTrackerCreator;
import com.smaato.sdk.video.vast.tracking.VastEventTrackerCreator;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;
import com.smaato.sdk.video.vast.utils.VastScenarioResourceDataConverter;
import com.smaato.sdk.video.vast.widget.SurfaceViewVideoPlayerViewFactory;
import com.smaato.sdk.video.vast.widget.VideoPlayerViewFactory;
import com.smaato.sdk.video.vast.widget.companion.CompanionErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.companion.CompanionPresenterFactory;
import com.smaato.sdk.video.vast.widget.icon.IconErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.icon.IconPresenterFactory;

public final class DiPlayerLayer {
    private DiPlayerLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiPlayerLayer$EdC70s5nmZyl2PUy6LrpEPAfyh4.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$0(DiRegistry diRegistry) {
        diRegistry.addFrom(buildVastTrackersCreatorRegistry());
        diRegistry.addFrom(buildVastVideoPlayerCreatorRegistry());
        diRegistry.addFrom(buildSystemMediaPlayerRegistry());
        diRegistry.addFrom(buildVastElementVisibilityConfigBuilderRegistry());
    }

    private static DiRegistry buildVastTrackersCreatorRegistry() {
        return DiRegistry.m32956of($$Lambda$DiPlayerLayer$58WOhhaP1tIdQidY3WwKMdMxMiM.INSTANCE);
    }

    static /* synthetic */ void lambda$buildVastTrackersCreatorRegistry$3(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastEventTrackerCreator.class, $$Lambda$DiPlayerLayer$n_WxjVF1VPXXPTk_KMvbHHJg.INSTANCE);
        diRegistry.registerFactory(VastBeaconTrackerCreator.class, $$Lambda$DiPlayerLayer$Z4QiwAIlH5lBqJJ1vudMYlQxbG4.INSTANCE);
    }

    static /* synthetic */ VastEventTrackerCreator lambda$buildVastTrackersCreatorRegistry$1(DiConstructor diConstructor) {
        return new VastEventTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (MacrosInjectorProviderFunction) diConstructor.get(MacrosInjectorProviderFunction.class), DiNetworkLayer.getNetworkingExecutorServiceFrom(diConstructor));
    }

    static /* synthetic */ VastBeaconTrackerCreator lambda$buildVastTrackersCreatorRegistry$2(DiConstructor diConstructor) {
        return new VastBeaconTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (MacrosInjectorProviderFunction) diConstructor.get(MacrosInjectorProviderFunction.class), DiNetworkLayer.getNetworkingExecutorServiceFrom(diConstructor));
    }

    private static DiRegistry buildVastVideoPlayerCreatorRegistry() {
        return DiRegistry.m32956of($$Lambda$DiPlayerLayer$wDyYG1nGxz3h3bIl8dXrSrSQTI.INSTANCE);
    }

    static /* synthetic */ void lambda$buildVastVideoPlayerCreatorRegistry$13(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastVideoPlayerCreator.class, $$Lambda$DiPlayerLayer$mLrZVH37WGOiESBHqT5TqbTxqLg.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerViewFactory.class, $$Lambda$DiPlayerLayer$HCXFhd9Pb_caUYTVbleu4o8LGY8.INSTANCE);
        diRegistry.registerFactory(VideoPlayerViewFactory.class, $$Lambda$DiPlayerLayer$TCOZdAfz0E729Pemjwnx2Dj6vbE.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerModelFactory.class, $$Lambda$DiPlayerLayer$9cUP82QTOr6qyjwbPoC1BeO9zsQ.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerPresenterFactory.class, $$Lambda$DiPlayerLayer$MF4NbFilF_t6EKERM3MV_t4xdhE.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerStateMachineFactory.class, $$Lambda$DiPlayerLayer$eyUApr_unvpaRDbtI8IidMWoJ40.INSTANCE);
        diRegistry.registerFactory(VideoPlayerPresenterFactory.class, $$Lambda$DiPlayerLayer$8MSlWTUXKg4bZdMRanjp3QVtevU.INSTANCE);
        diRegistry.registerFactory(VideoPlayerPreparer.class, $$Lambda$DiPlayerLayer$WvIBqnGd9G9qBghAPbOfu5NaGJU.INSTANCE);
        diRegistry.registerFactory(VastScenarioResourceDataConverter.class, $$Lambda$DiPlayerLayer$VQVEZVxdx5QuFlboadcESc7JbyM.INSTANCE);
        diRegistry.addFrom(buildRepeatableActionRegistry());
        diRegistry.addFrom(buildIconPresenterFactoryRegistry());
        diRegistry.addFrom(buildCompanionPresenterFactoryRegistry());
    }

    static /* synthetic */ VastVideoPlayerCreator lambda$buildVastVideoPlayerCreatorRegistry$4(DiConstructor diConstructor) {
        return new VastVideoPlayerCreator((VastVideoPlayerViewFactory) diConstructor.get(VastVideoPlayerViewFactory.class), (VastVideoPlayerModelFactory) diConstructor.get(VastVideoPlayerModelFactory.class), (VastVideoPlayerPresenterFactory) diConstructor.get(VastVideoPlayerPresenterFactory.class));
    }

    static /* synthetic */ VastVideoPlayerViewFactory lambda$buildVastVideoPlayerCreatorRegistry$5(DiConstructor diConstructor) {
        return new VastVideoPlayerViewFactory();
    }

    static /* synthetic */ VideoPlayerViewFactory lambda$buildVastVideoPlayerCreatorRegistry$6(DiConstructor diConstructor) {
        return new SurfaceViewVideoPlayerViewFactory();
    }

    static /* synthetic */ VastVideoPlayerModelFactory lambda$buildVastVideoPlayerCreatorRegistry$7(DiConstructor diConstructor) {
        return new VastVideoPlayerModelFactory((LinkHandler) diConstructor.get(LinkHandler.class), (VastEventTrackerCreator) diConstructor.get(VastEventTrackerCreator.class), (VastBeaconTrackerCreator) diConstructor.get(VastBeaconTrackerCreator.class), true);
    }

    static /* synthetic */ VastVideoPlayerPresenterFactory lambda$buildVastVideoPlayerCreatorRegistry$8(DiConstructor diConstructor) {
        return new VastVideoPlayerPresenterFactory((VideoPlayerPresenterFactory) diConstructor.get(VideoPlayerPresenterFactory.class), (CompanionPresenterFactory) diConstructor.get(CompanionPresenterFactory.class), (IconPresenterFactory) diConstructor.get(IconPresenterFactory.class), (VisibilityTrackerCreator) diConstructor.get(VideoDiNames.MODULE_DI_NAME, VisibilityTrackerCreator.class), (VastVideoPlayerStateMachineFactory) diConstructor.get(VastVideoPlayerStateMachineFactory.class));
    }

    static /* synthetic */ VastVideoPlayerStateMachineFactory lambda$buildVastVideoPlayerCreatorRegistry$9(DiConstructor diConstructor) {
        return new VastVideoPlayerStateMachineFactory(VastPlayerState.SHOW_VIDEO);
    }

    static /* synthetic */ VideoPlayerPresenterFactory lambda$buildVastVideoPlayerCreatorRegistry$10(DiConstructor diConstructor) {
        return new VideoPlayerPresenterFactory((VideoPlayerPreparer) diConstructor.get(VideoPlayerPreparer.class), (VisibilityTrackerCreator) diConstructor.get(VideoDiNames.MODULE_DI_NAME, VisibilityTrackerCreator.class), (RepeatableActionFactory) diConstructor.get(RepeatableActionFactory.class), true);
    }

    static /* synthetic */ VideoPlayerPreparer lambda$buildVastVideoPlayerCreatorRegistry$11(DiConstructor diConstructor) {
        return new VideoPlayerPreparer((VideoPlayerCreator) diConstructor.get(VideoPlayerCreator.class));
    }

    static /* synthetic */ VastScenarioResourceDataConverter lambda$buildVastVideoPlayerCreatorRegistry$12(DiConstructor diConstructor) {
        return new VastScenarioResourceDataConverter();
    }

    private static DiRegistry buildCompanionPresenterFactoryRegistry() {
        return DiRegistry.m32956of($$Lambda$DiPlayerLayer$b2Lv5f049guPQijVj_132MAZKKM.INSTANCE);
    }

    static /* synthetic */ void lambda$buildCompanionPresenterFactoryRegistry$16(DiRegistry diRegistry) {
        diRegistry.registerFactory(CompanionErrorCodeStrategy.class, $$Lambda$DiPlayerLayer$Ytprsop66qyux2PcKpALMOSsi1s.INSTANCE);
        diRegistry.registerFactory(CompanionPresenterFactory.class, $$Lambda$DiPlayerLayer$GBejORQVFmdUXy5uKw2YC9kcr5A.INSTANCE);
    }

    static /* synthetic */ CompanionErrorCodeStrategy lambda$buildCompanionPresenterFactoryRegistry$14(DiConstructor diConstructor) {
        return new CompanionErrorCodeStrategy();
    }

    static /* synthetic */ CompanionPresenterFactory lambda$buildCompanionPresenterFactoryRegistry$15(DiConstructor diConstructor) {
        return new CompanionPresenterFactory((VastScenarioResourceDataConverter) diConstructor.get(VastScenarioResourceDataConverter.class), (VisibilityTrackerCreator) diConstructor.get("VAST_ELEMENT_VISIBILITY", VisibilityTrackerCreator.class), (VastWebComponentSecurityPolicy) diConstructor.get(VastWebComponentSecurityPolicy.class), (CompanionErrorCodeStrategy) diConstructor.get(CompanionErrorCodeStrategy.class));
    }

    private static DiRegistry buildIconPresenterFactoryRegistry() {
        return DiRegistry.m32956of($$Lambda$DiPlayerLayer$thBxBAa92W_63zsdXDpcwPUX8E.INSTANCE);
    }

    static /* synthetic */ void lambda$buildIconPresenterFactoryRegistry$20(DiRegistry diRegistry) {
        diRegistry.registerFactory(IconErrorCodeStrategy.class, $$Lambda$DiPlayerLayer$hX7RwUE3NoQW6XN27NmsMeQ5s44.INSTANCE);
        diRegistry.registerFactory(IconPresenterFactory.class, $$Lambda$DiPlayerLayer$H9JKW7LWzQDiwVbZpX9P6jsd58.INSTANCE);
        diRegistry.registerFactory("ICON_ANIMATION_HELPER", AnimationHelper.class, $$Lambda$DiPlayerLayer$1BDUt1J4MP9OfMCZH6wfWJj2B5E.INSTANCE);
    }

    static /* synthetic */ IconErrorCodeStrategy lambda$buildIconPresenterFactoryRegistry$17(DiConstructor diConstructor) {
        return new IconErrorCodeStrategy();
    }

    static /* synthetic */ IconPresenterFactory lambda$buildIconPresenterFactoryRegistry$18(DiConstructor diConstructor) {
        return new IconPresenterFactory((VastScenarioResourceDataConverter) diConstructor.get(VastScenarioResourceDataConverter.class), (VisibilityTrackerCreator) diConstructor.get("VAST_ELEMENT_VISIBILITY", VisibilityTrackerCreator.class), (VastWebComponentSecurityPolicy) diConstructor.get(VastWebComponentSecurityPolicy.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (AnimationHelper) diConstructor.get("ICON_ANIMATION_HELPER", AnimationHelper.class), (IconErrorCodeStrategy) diConstructor.get(IconErrorCodeStrategy.class));
    }

    static /* synthetic */ AnimationHelper lambda$buildIconPresenterFactoryRegistry$19(DiConstructor diConstructor) {
        return new AnimationHelper(300);
    }

    private static DiRegistry buildRepeatableActionRegistry() {
        return DiRegistry.m32956of($$Lambda$DiPlayerLayer$1c1Z8cjdiTsjOcCVhwj4XV8kAbY.INSTANCE);
    }

    static /* synthetic */ RepeatableActionFactory lambda$buildRepeatableActionRegistry$21(DiConstructor diConstructor) {
        return new RepeatableActionFactory(Threads.newUiHandler());
    }

    private static DiRegistry buildVastElementVisibilityConfigBuilderRegistry() {
        return DiRegistry.m32956of($$Lambda$DiPlayerLayer$qzoyBy5Fqw3OS3HsY3now0IgWks.INSTANCE);
    }

    static /* synthetic */ void lambda$buildVastElementVisibilityConfigBuilderRegistry$25(DiRegistry diRegistry) {
        diRegistry.registerFactory("VAST_ELEMENT_VISIBILITY", VisibilityPrivateConfig.class, $$Lambda$DiPlayerLayer$KVfRhJfLU78hsRdKBYBbSxI6xBs.INSTANCE);
        diRegistry.registerFactory("VAST_ELEMENT_VISIBILITY", VisibilityTrackerCreator.class, $$Lambda$DiPlayerLayer$oesQZi61mqCcFtPMD7elAb1sXao.INSTANCE);
    }

    static /* synthetic */ VisibilityTrackerCreator lambda$buildVastElementVisibilityConfigBuilderRegistry$24(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get("VAST_ELEMENT_VISIBILITY", VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), "VAST_ELEMENT_VISIBILITY");
    }

    private static DiRegistry buildSystemMediaPlayerRegistry() {
        return DiRegistry.m32956of(new Consumer("VideoModuleInterfaceSystemMediaPlayerActionValidator", "VideoModuleInterfaceSystemMediaPlayerTransitionValidator") {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                DiPlayerLayer.lambda$buildSystemMediaPlayerRegistry$28(this.f$0, this.f$1, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$buildSystemMediaPlayerRegistry$28(String str, String str2, DiRegistry diRegistry) {
        diRegistry.registerFactory(VideoPlayerCreator.class, new ClassFactory(str, str2) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiPlayerLayer.lambda$buildSystemMediaPlayerRegistry$26(this.f$0, this.f$1, diConstructor);
            }
        });
        diRegistry.registerFactory(SystemMediaPlayerStateMachineFactory.class, $$Lambda$DiPlayerLayer$bE2lNW_rBzKhO_dRltwScL6L0_I.INSTANCE);
        diRegistry.registerFactory(str, EventValidator.class, new SystemMediaPlayerActionValidatorFactory());
        diRegistry.registerFactory(str2, EventValidator.class, new SystemMediaPlayerTransitionValidatorFactory());
    }

    static /* synthetic */ VideoPlayerCreator lambda$buildSystemMediaPlayerRegistry$26(String str, String str2, DiConstructor diConstructor) {
        return new SystemMediaPlayerCreator((Context) diConstructor.get(Application.class), (SystemMediaPlayerStateMachineFactory) diConstructor.get(SystemMediaPlayerStateMachineFactory.class), (EventValidator) diConstructor.get(str, EventValidator.class), (EventValidator) diConstructor.get(str2, EventValidator.class));
    }

    static /* synthetic */ SystemMediaPlayerStateMachineFactory lambda$buildSystemMediaPlayerRegistry$27(DiConstructor diConstructor) {
        return new SystemMediaPlayerStateMachineFactory(MediaPlayerState.IDLE);
    }
}
