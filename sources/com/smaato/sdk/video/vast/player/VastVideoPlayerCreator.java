package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;

public class VastVideoPlayerCreator {
    private final VastVideoPlayerModelFactory vastVideoPlayerModelFactory;
    private final VastVideoPlayerPresenterFactory vastVideoPlayerPresenterFactory;
    private final VastVideoPlayerViewFactory vastVideoPlayerViewFactory;

    VastVideoPlayerCreator(VastVideoPlayerViewFactory vastVideoPlayerViewFactory2, VastVideoPlayerModelFactory vastVideoPlayerModelFactory2, VastVideoPlayerPresenterFactory vastVideoPlayerPresenterFactory2) {
        this.vastVideoPlayerViewFactory = (VastVideoPlayerViewFactory) Objects.requireNonNull(vastVideoPlayerViewFactory2);
        this.vastVideoPlayerModelFactory = (VastVideoPlayerModelFactory) Objects.requireNonNull(vastVideoPlayerModelFactory2);
        this.vastVideoPlayerPresenterFactory = (VastVideoPlayerPresenterFactory) Objects.requireNonNull(vastVideoPlayerPresenterFactory2);
    }

    public void createVastVideoPlayer(Logger logger, SomaApiContext somaApiContext, VastScenario vastScenario, VastErrorTracker vastErrorTracker, NonNullConsumer<Either<VastVideoPlayer, Exception>> nonNullConsumer, VideoTimings videoTimings) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(vastScenario);
        Objects.requireNonNull(vastErrorTracker);
        Objects.requireNonNull(nonNullConsumer);
        VideoTimings videoTimings2 = videoTimings;
        Logger logger2 = logger;
        NonNullConsumer<Either<VastVideoPlayer, Exception>> nonNullConsumer2 = nonNullConsumer;
        Logger logger3 = logger;
        VastScenario vastScenario2 = vastScenario;
        VastErrorTracker vastErrorTracker2 = vastErrorTracker;
        this.vastVideoPlayerPresenterFactory.createVideoPlayerPresenter(logger3, vastScenario2, this.vastVideoPlayerModelFactory.createVastVideoPlayerModel(logger, vastScenario, somaApiContext, vastErrorTracker, videoTimings2.isVideoClickable), vastErrorTracker2, new NonNullConsumer(logger, nonNullConsumer) {
            public final /* synthetic */ Logger f$1;
            public final /* synthetic */ NonNullConsumer f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                VastVideoPlayerCreator.this.lambda$createVastVideoPlayer$0$VastVideoPlayerCreator(this.f$1, this.f$2, (Either) obj);
            }
        }, videoTimings2, somaApiContext.getApiAdResponse().getImpressionCountingType());
    }

    /* access modifiers changed from: private */
    /* renamed from: onVideoPlayerPresenterResult */
    public void lambda$createVastVideoPlayer$0$VastVideoPlayerCreator(Logger logger, Either<VastVideoPlayerPresenter, Exception> either, NonNullConsumer<Either<VastVideoPlayer, Exception>> nonNullConsumer) {
        Exception right = either.right();
        if (right != null) {
            nonNullConsumer.accept(Either.right(right));
        } else {
            nonNullConsumer.accept(Either.left(new VastVideoPlayer((VastVideoPlayerPresenter) Objects.requireNonNull(either.left()), this.vastVideoPlayerViewFactory)));
        }
    }
}
