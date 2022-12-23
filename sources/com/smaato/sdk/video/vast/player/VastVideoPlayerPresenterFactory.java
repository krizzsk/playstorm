package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;
import com.smaato.sdk.video.vast.widget.companion.CompanionPresenterFactory;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;
import com.smaato.sdk.video.vast.widget.icon.IconPresenterFactory;

class VastVideoPlayerPresenterFactory {
    private final CompanionPresenterFactory companionPresenterFactory;
    private final IconPresenterFactory iconPresenterFactory;
    private ImpressionCountingType impressionCountingType;
    private final VastVideoPlayerStateMachineFactory vastVideoPlayerStateMachineFactory;
    private final VideoPlayerPresenterFactory videoPlayerPresenterFactory;
    private final VisibilityTrackerCreator visibilityTrackerCreator;

    VastVideoPlayerPresenterFactory(VideoPlayerPresenterFactory videoPlayerPresenterFactory2, CompanionPresenterFactory companionPresenterFactory2, IconPresenterFactory iconPresenterFactory2, VisibilityTrackerCreator visibilityTrackerCreator2, VastVideoPlayerStateMachineFactory vastVideoPlayerStateMachineFactory2) {
        this.videoPlayerPresenterFactory = (VideoPlayerPresenterFactory) Objects.requireNonNull(videoPlayerPresenterFactory2);
        this.companionPresenterFactory = (CompanionPresenterFactory) Objects.requireNonNull(companionPresenterFactory2);
        this.iconPresenterFactory = (IconPresenterFactory) Objects.requireNonNull(iconPresenterFactory2);
        this.visibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator2);
        this.vastVideoPlayerStateMachineFactory = (VastVideoPlayerStateMachineFactory) Objects.requireNonNull(vastVideoPlayerStateMachineFactory2);
    }

    /* access modifiers changed from: package-private */
    public void createVideoPlayerPresenter(Logger logger, VastScenario vastScenario, VastVideoPlayerModel vastVideoPlayerModel, VastErrorTracker vastErrorTracker, NonNullConsumer<Either<VastVideoPlayerPresenter, Exception>> nonNullConsumer, VideoTimings videoTimings, ImpressionCountingType impressionCountingType2) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(vastVideoPlayerModel);
        Objects.requireNonNull(nonNullConsumer);
        this.impressionCountingType = impressionCountingType2;
        VastScenario vastScenario2 = vastScenario;
        this.videoPlayerPresenterFactory.createVideoPlayerPresenter(logger, vastScenario2.vastMediaFileScenario, vastErrorTracker, new NonNullConsumer(logger, vastScenario2, vastVideoPlayerModel, nonNullConsumer) {
            public final /* synthetic */ Logger f$1;
            public final /* synthetic */ VastScenario f$2;
            public final /* synthetic */ VastVideoPlayerModel f$3;
            public final /* synthetic */ NonNullConsumer f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                VastVideoPlayerPresenterFactory.this.mo71209x9dc1361f(this.f$1, this.f$2, this.f$3, this.f$4, (Either) obj);
            }
        }, videoTimings, this.impressionCountingType);
    }

    /* access modifiers changed from: private */
    /* renamed from: onVideoPlayerPresenterResult */
    public void mo71209x9dc1361f(Logger logger, VastScenario vastScenario, VastVideoPlayerModel vastVideoPlayerModel, Either<VideoPlayerPresenter, Exception> either, NonNullConsumer<Either<VastVideoPlayerPresenter, Exception>> nonNullConsumer) {
        Exception right = either.right();
        if (right != null) {
            nonNullConsumer.accept(Either.right(right));
            return;
        }
        VastElementPresenter create = this.iconPresenterFactory.create(logger, vastScenario.vastMediaFileScenario, this.impressionCountingType);
        VastElementPresenter create2 = this.companionPresenterFactory.create(logger, vastScenario, this.impressionCountingType);
        StateMachine<VastPlayerEvent, VastPlayerState> create3 = this.vastVideoPlayerStateMachineFactory.create(vastScenario);
        Logger logger2 = logger;
        VastVideoPlayerModel vastVideoPlayerModel2 = vastVideoPlayerModel;
        nonNullConsumer.accept(Either.left(new VastVideoPlayerPresenter(logger2, vastVideoPlayerModel2, this.visibilityTrackerCreator, create2, create, (VideoPlayerPresenter) Objects.requireNonNull(either.left()), create3)));
    }
}
