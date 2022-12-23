package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.VideoClicks;

public class VideoClicksMerger {
    public VideoClicks merge(VideoClicks videoClicks, VideoClicks videoClicks2) {
        if (videoClicks == null) {
            return videoClicks2;
        }
        if (videoClicks2 == null) {
            return videoClicks;
        }
        return new VideoClicks.Builder().setClickThrough(videoClicks.clickThrough).setClickTrackings(VastScenarioMergeUtils.merge(videoClicks.clickTrackings, videoClicks2.clickTrackings)).setCustomClicks(VastScenarioMergeUtils.merge(videoClicks.customClicks, videoClicks2.customClicks)).build();
    }
}
