package com.smaato.sdk.video.vast.player;

import android.content.Context;
import com.smaato.sdk.video.vast.widget.VastVideoPlayerView;

public class VastVideoPlayerViewFactory {
    /* access modifiers changed from: package-private */
    public VastVideoPlayerView getVastVideoPlayerView(Context context) {
        return new VastVideoPlayerView(context);
    }
}
