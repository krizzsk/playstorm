package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.log.Logger;

public interface VideoPlayerCreator {
    VideoPlayer createVideoPlayer(Logger logger);
}
