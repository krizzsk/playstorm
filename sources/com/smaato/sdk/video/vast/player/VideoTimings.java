package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.video.vast.model.VastMediaFileScenario;

public final class VideoTimings {
    public final boolean isVideoClickable;
    public final boolean isVideoSkippable;
    public final long skipOffsetMillis;
    public final long videoDurationMillis;

    private VideoTimings(long j, long j2, boolean z, boolean z2) {
        this.videoDurationMillis = j;
        this.skipOffsetMillis = j2;
        this.isVideoSkippable = z;
        this.isVideoClickable = z2;
    }

    public static VideoTimings create(VastMediaFileScenario vastMediaFileScenario, long j, boolean z, boolean z2) {
        return new VideoTimings(vastMediaFileScenario.duration, j, z, z2);
    }
}
