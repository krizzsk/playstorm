package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import com.smaato.sdk.video.vast.player.VideoPlayerView;

public class SurfaceViewVideoPlayerViewFactory implements VideoPlayerViewFactory {
    public VideoPlayerView getVideoPlayerView(Context context) {
        return new SurfaceViewVideoPlayerView(context);
    }
}
