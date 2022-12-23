package com.smaato.sdk.video.p389ad;

import android.net.Uri;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMVideoViewabilityTracker;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.p382fi.BiFunction;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.video.p389ad.VideoAdPresenterBuilder;
import com.smaato.sdk.video.vast.build.VastScenarioPicker;
import com.smaato.sdk.video.vast.build.VastTreeBuilder;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.player.VastVideoPlayerCreator;
import com.smaato.sdk.video.vast.player.VideoTimings;

/* renamed from: com.smaato.sdk.video.ad.InterstitialVideoAdPresenterBuilder */
class InterstitialVideoAdPresenterBuilder extends VideoAdPresenterBuilder<InterstitialAdPresenter> {
    InterstitialVideoAdPresenterBuilder(Logger logger, Function<VideoAdObject, VideoAdInteractor> function, VastScenarioPicker vastScenarioPicker, VastTreeBuilder vastTreeBuilder, VastVideoPlayerCreator vastVideoPlayerCreator, ResourceLoader<Uri, Uri> resourceLoader, VastErrorTrackerCreator vastErrorTrackerCreator, MediaFileResourceLoaderListenerCreator mediaFileResourceLoaderListenerCreator, OMVideoViewabilityTracker oMVideoViewabilityTracker, BiFunction<VastMediaFileScenario, VideoApiConfig, VideoTimings> biFunction, VerificationResourceMapper verificationResourceMapper, ApiParams apiParams) {
        super(logger, vastScenarioPicker, vastTreeBuilder, vastVideoPlayerCreator, resourceLoader, vastErrorTrackerCreator, mediaFileResourceLoaderListenerCreator, function, biFunction, new Function() {
            public final Object apply(Object obj) {
                return InterstitialVideoAdPresenterBuilder.lambda$new$0(OMVideoViewabilityTracker.this, (VideoAdPresenterBuilder.AdPresenterComponents) obj);
            }
        }, verificationResourceMapper, apiParams);
    }

    static /* synthetic */ InterstitialAdPresenter lambda$new$0(OMVideoViewabilityTracker oMVideoViewabilityTracker, VideoAdPresenterBuilder.AdPresenterComponents adPresenterComponents) {
        return new InterstitialVideoAdPresenter(adPresenterComponents.vastVideoPlayer, adPresenterComponents.videoAdInteractor, oMVideoViewabilityTracker, adPresenterComponents.videoTimings, adPresenterComponents.resources);
    }
}
