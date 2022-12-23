package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.player.exception.MalformedVideoPlayerException;
import com.smaato.sdk.video.vast.player.exception.UnsupportedVideoPlayerException;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;

class VideoPlayerPresenterFactory {
    private ImpressionCountingType impressionCountingType;
    private final boolean isMuted;
    private final RepeatableActionFactory repeatableActionFactory;
    private final VideoPlayerPreparer videoPlayerPreparer;
    private final VisibilityTrackerCreator visibilityTrackerCreator;

    VideoPlayerPresenterFactory(VideoPlayerPreparer videoPlayerPreparer2, VisibilityTrackerCreator visibilityTrackerCreator2, RepeatableActionFactory repeatableActionFactory2, boolean z) {
        this.videoPlayerPreparer = (VideoPlayerPreparer) Objects.requireNonNull(videoPlayerPreparer2);
        this.visibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator2);
        this.repeatableActionFactory = (RepeatableActionFactory) Objects.requireNonNull(repeatableActionFactory2);
        this.isMuted = z;
    }

    /* access modifiers changed from: package-private */
    public void createVideoPlayerPresenter(Logger logger, VastMediaFileScenario vastMediaFileScenario, VastErrorTracker vastErrorTracker, NonNullConsumer<Either<VideoPlayerPresenter, Exception>> nonNullConsumer, VideoTimings videoTimings, ImpressionCountingType impressionCountingType2) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(nonNullConsumer);
        this.videoPlayerPreparer.prepareNewVideoPlayer(logger, vastMediaFileScenario.mediaFile, new NonNullConsumer(vastMediaFileScenario, vastErrorTracker, nonNullConsumer, videoTimings) {
            public final /* synthetic */ VastMediaFileScenario f$1;
            public final /* synthetic */ VastErrorTracker f$2;
            public final /* synthetic */ NonNullConsumer f$3;
            public final /* synthetic */ VideoTimings f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                VideoPlayerPresenterFactory.this.lambda$createVideoPlayerPresenter$0$VideoPlayerPresenterFactory(this.f$1, this.f$2, this.f$3, this.f$4, (Either) obj);
            }
        });
        this.impressionCountingType = impressionCountingType2;
    }

    /* access modifiers changed from: private */
    /* renamed from: onVideoPlayerPresenterResult */
    public void lambda$createVideoPlayerPresenter$0$VideoPlayerPresenterFactory(VastMediaFileScenario vastMediaFileScenario, Either<VideoPlayer, Exception> either, VastErrorTracker vastErrorTracker, NonNullConsumer<Either<VideoPlayerPresenter, Exception>> nonNullConsumer, VideoTimings videoTimings) {
        MediaFile mediaFile = vastMediaFileScenario.mediaFile;
        Exception right = either.right();
        if (right == null) {
            VideoPlayer videoPlayer = (VideoPlayer) Objects.requireNonNull(either.left());
            if (Math.abs(videoPlayer.getDuration() - vastMediaFileScenario.duration) > 3000) {
                vastErrorTracker.track(new PlayerState.Builder().setErrorCode(ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR).build());
                nonNullConsumer.accept(Either.right(new Exception("Video player expecting different duration")));
                return;
            }
            VideoViewResizeManager create = VideoViewResizeManager.create(mediaFile);
            SkipButtonVisibilityManager create2 = SkipButtonVisibilityManager.create(videoTimings);
            videoPlayer.setVolume(this.isMuted ? 0.0f : 1.0f);
            nonNullConsumer.accept(Either.left(new VideoPlayerPresenter(videoPlayer, vastMediaFileScenario, create, create2, this.visibilityTrackerCreator, this.repeatableActionFactory, this.impressionCountingType)));
            return;
        }
        try {
            throw right;
        } catch (MalformedVideoPlayerException | UnsupportedVideoPlayerException unused) {
            vastErrorTracker.track(new PlayerState.Builder().setErrorCode(405).build());
        } catch (Exception unused2) {
            vastErrorTracker.track(new PlayerState.Builder().setErrorCode(400).build());
        }
        nonNullConsumer.accept(Either.right(right));
    }
}
