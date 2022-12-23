package com.smaato.sdk.video.vast.player;

public class SkipButtonVisibilityManagerImpl extends SkipButtonVisibilityManager {
    private final long durationMillis;
    private final long skipOffsetMillis;

    SkipButtonVisibilityManagerImpl(long j, long j2) {
        this.skipOffsetMillis = j;
        this.durationMillis = j2;
    }

    /* access modifiers changed from: package-private */
    public void onProgressChange(long j, VideoPlayerView videoPlayerView) {
        long j2 = this.skipOffsetMillis;
        if (j2 >= 0 && j >= j2 && j < this.durationMillis) {
            videoPlayerView.showSkipButton();
        }
    }
}
