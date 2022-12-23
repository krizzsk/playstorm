package com.smaato.sdk.video.p389ad;

import android.net.Uri;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMVideoViewabilityTracker;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p382fi.BiFunction;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.video.framework.VideoDiNames;
import com.smaato.sdk.video.vast.build.VastScenarioPicker;
import com.smaato.sdk.video.vast.build.VastTreeBuilder;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.player.VastVideoPlayerCreator;
import com.smaato.sdk.video.vast.player.VideoTimings;

/* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer */
public final class DiVideoAdLayer {

    /* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer$VideoAdInteractorProviderFunction */
    private interface VideoAdInteractorProviderFunction extends Function<VideoAdObject, VideoAdInteractor> {
    }

    private DiVideoAdLayer() {
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
                DiVideoAdLayer.lambda$createRegistry$7(AdPresenterNameShaper.this, this.f$1, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$7(AdPresenterNameShaper adPresenterNameShaper, String str, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.VIDEO, RewardedAdPresenter.class), AdPresenterBuilder.class, $$Lambda$DiVideoAdLayer$x8pwfB0XFFnRy3q8vhRFrxUBxzE.INSTANCE);
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.VIDEO, InterstitialAdPresenter.class), AdPresenterBuilder.class, $$Lambda$DiVideoAdLayer$LI5OwCnKv7KlYcQG7xI1KVj_0TI.INSTANCE);
        diRegistry.registerFactory(VideoAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiVideoAdLayer.lambda$createRegistry$3(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(InterstitialVideoProperties.class, $$Lambda$DiVideoAdLayer$E8zqRJb_csvjwGk19eJGsrEFbY8.INSTANCE);
        diRegistry.registerFactory(RewardedVideoProperties.class, $$Lambda$DiVideoAdLayer$eL5tj5zgS6PZLK5SLZaC_VXLi0o.INSTANCE);
        diRegistry.registerFactory(VerificationResourceMapper.class, $$Lambda$DiVideoAdLayer$QJI8lZSeA6rqtiCQqnhEsszNqoU.INSTANCE);
    }

    static /* synthetic */ AdPresenterBuilder lambda$createRegistry$0(DiConstructor diConstructor) {
        return new RewardedVideoAdPresenterBuilder((Logger) diConstructor.get(Logger.class), (Function) diConstructor.get(VideoAdInteractorProviderFunction.class), (VastScenarioPicker) diConstructor.get(VastScenarioPicker.class), (VastTreeBuilder) diConstructor.get(VastTreeBuilder.class), (VastVideoPlayerCreator) diConstructor.get(VastVideoPlayerCreator.class), getVideoResourceLoader(diConstructor), (VastErrorTrackerCreator) diConstructor.get(VastErrorTrackerCreator.class), (MediaFileResourceLoaderListenerCreator) diConstructor.get(MediaFileResourceLoaderListenerCreator.class), (OMVideoViewabilityTracker) diConstructor.get(OMVideoViewabilityTracker.class), (BiFunction) diConstructor.get(RewardedVideoProperties.class), (VerificationResourceMapper) diConstructor.get(VerificationResourceMapper.class), (ApiParams) diConstructor.get(ApiParams.class));
    }

    static /* synthetic */ AdPresenterBuilder lambda$createRegistry$1(DiConstructor diConstructor) {
        return new InterstitialVideoAdPresenterBuilder((Logger) diConstructor.get(Logger.class), (Function) diConstructor.get(VideoAdInteractorProviderFunction.class), (VastScenarioPicker) diConstructor.get(VastScenarioPicker.class), (VastTreeBuilder) diConstructor.get(VastTreeBuilder.class), (VastVideoPlayerCreator) diConstructor.get(VastVideoPlayerCreator.class), getVideoResourceLoader(diConstructor), (VastErrorTrackerCreator) diConstructor.get(VastErrorTrackerCreator.class), (MediaFileResourceLoaderListenerCreator) diConstructor.get(MediaFileResourceLoaderListenerCreator.class), (OMVideoViewabilityTracker) diConstructor.get(OMVideoViewabilityTracker.class), (BiFunction) diConstructor.get(InterstitialVideoProperties.class), (VerificationResourceMapper) diConstructor.get(VerificationResourceMapper.class), (ApiParams) diConstructor.get(ApiParams.class));
    }

    static /* synthetic */ VideoAdInteractorProviderFunction lambda$createRegistry$3(String str, DiConstructor diConstructor) {
        return new VideoAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiVideoAdLayer.lambda$createRegistry$2(DiConstructor.this, this.f$1, (VideoAdObject) obj);
            }
        };
    }

    static /* synthetic */ VideoAdInteractor lambda$createRegistry$2(DiConstructor diConstructor, String str, VideoAdObject videoAdObject) {
        return new VideoAdInteractor((Logger) diConstructor.get(Logger.class), videoAdObject, (StateMachine) diConstructor.get(str, StateMachine.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class));
    }

    static /* synthetic */ InterstitialVideoProperties lambda$createRegistry$4(DiConstructor diConstructor) {
        return new InterstitialVideoProperties();
    }

    static /* synthetic */ RewardedVideoProperties lambda$createRegistry$5(DiConstructor diConstructor) {
        return new RewardedVideoProperties();
    }

    static /* synthetic */ VerificationResourceMapper lambda$createRegistry$6(DiConstructor diConstructor) {
        return new VerificationResourceMapper();
    }

    private static ResourceLoader<Uri, Uri> getVideoResourceLoader(DiConstructor diConstructor) {
        return (ResourceLoader) diConstructor.get(VideoDiNames.VIDEO_RESOURCE_LOADER_DI_NAME, ResourceLoader.class);
    }

    /* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer$InterstitialVideoProperties */
    private static class InterstitialVideoProperties implements BiFunction<VastMediaFileScenario, VideoApiConfig, VideoTimings> {
        private InterstitialVideoProperties() {
        }

        public VideoTimings apply(VastMediaFileScenario vastMediaFileScenario, VideoApiConfig videoApiConfig) {
            Integer num = videoApiConfig.videoSkipInterval;
            long j = 5000;
            if (num != null) {
                if (num.intValue() > 0) {
                    j = ((long) videoApiConfig.videoSkipInterval.intValue()) * 1000;
                }
                if (videoApiConfig.videoSkipInterval.intValue() == -1) {
                    j = -1;
                }
            }
            return VideoTimings.create(vastMediaFileScenario, j, true, true);
        }
    }

    /* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer$RewardedVideoProperties */
    private static class RewardedVideoProperties implements BiFunction<VastMediaFileScenario, VideoApiConfig, VideoTimings> {
        private RewardedVideoProperties() {
        }

        public VideoTimings apply(VastMediaFileScenario vastMediaFileScenario, VideoApiConfig videoApiConfig) {
            return VideoTimings.create(vastMediaFileScenario, 5000, false, false);
        }
    }
}
