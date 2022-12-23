package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import com.smaato.sdk.video.vast.player.VideoPlayerView;

public interface VideoPlayerViewFactory {
    VideoPlayerView getVideoPlayerView(Context context);
}
