package com.smaato.sdk.video.vast.player;

public abstract class SkipButtonVisibilityManager {
    /* access modifiers changed from: package-private */
    public abstract void onProgressChange(long j, VideoPlayerView videoPlayerView);

    public static SkipButtonVisibilityManager create(VideoTimings videoTimings) {
        if (videoTimings == null) {
            return new NoOpSkipButtonVisibilityManager();
        }
        if (videoTimings.isVideoSkippable) {
            return new SkipButtonVisibilityManagerImpl(videoTimings.skipOffsetMillis, videoTimings.videoDurationMillis);
        }
        return new NoOpSkipButtonVisibilityManager();
    }

    private static class NoOpSkipButtonVisibilityManager extends SkipButtonVisibilityManager {
        public void onProgressChange(long j, VideoPlayerView videoPlayerView) {
        }

        private NoOpSkipButtonVisibilityManager() {
        }
    }
}
