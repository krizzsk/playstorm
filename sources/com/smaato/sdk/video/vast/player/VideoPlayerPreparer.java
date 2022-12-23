package com.smaato.sdk.video.vast.player;

import android.net.Uri;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.player.VideoPlayer;
import com.smaato.sdk.video.vast.player.exception.VideoPlayerException;

public class VideoPlayerPreparer {
    private final VideoPlayerCreator videoPlayerCreator;

    public VideoPlayerPreparer(VideoPlayerCreator videoPlayerCreator2) {
        this.videoPlayerCreator = (VideoPlayerCreator) Objects.requireNonNull(videoPlayerCreator2);
    }

    public void prepareNewVideoPlayer(final Logger logger, MediaFile mediaFile, final NonNullConsumer<Either<VideoPlayer, Exception>> nonNullConsumer) {
        Objects.requireNonNull(logger);
        final Uri parse = Uri.parse(mediaFile.url);
        VideoPlayer createVideoPlayer = this.videoPlayerCreator.createVideoPlayer(logger);
        createVideoPlayer.setPrepareListener(new VideoPlayer.PrepareListener() {
            public void onPreparing(VideoPlayer videoPlayer) {
            }

            public void onInitialized(VideoPlayer videoPlayer) {
                logger.debug(LogDomain.VAST, "VAST VideoPlayer initialised. Preparing...", new Object[0]);
                videoPlayer.prepare();
            }

            public void onPrepared(VideoPlayer videoPlayer) {
                logger.debug(LogDomain.VAST, "VAST VideoPlayer prepared with DataSource: %s", parse);
                videoPlayer.setPrepareListener((VideoPlayer.PrepareListener) null);
                nonNullConsumer.accept(Either.left(videoPlayer));
            }

            public void onError(VideoPlayer videoPlayer, VideoPlayerException videoPlayerException) {
                logger.error(LogDomain.VAST, String.format("Unable to prepare VAST VideoPlayer with DataSource: %s", new Object[]{parse}), new Object[0]);
                videoPlayer.setPrepareListener((VideoPlayer.PrepareListener) null);
                nonNullConsumer.accept(Either.right(videoPlayerException));
            }
        });
        logger.debug(LogDomain.VAST, "Initialising VAST VideoPlayer with DataSource: %s", parse);
        createVideoPlayer.setDataSource(parse.toString());
    }
}
