package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import android.view.SurfaceView;
import com.smaato.sdk.video.vast.player.VideoPlayerView;

public class SurfaceViewVideoPlayerView extends VideoPlayerView {
    public SurfaceViewVideoPlayerView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public VastSurfaceHolder initVastSurfaceHolder(Context context) {
        return new SurfaceViewVastSurfaceHolder(new SurfaceView(context));
    }
}
