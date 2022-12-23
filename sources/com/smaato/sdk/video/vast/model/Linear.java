package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public class Linear {
    public static final String AD_PARAMETERS = "AdParameters";
    public static final String DURATION = "Duration";
    public static final String ICONS = "Icons";
    public static final String MEDIA_FILES = "MediaFiles";
    public static final String NAME = "Linear";
    public static final String SKIPOFFSET = "skipoffset";
    public static final String TRACKING_EVENTS = "TrackingEvents";
    public static final String VIDEO_CLICKS = "VideoClicks";
    public final AdParameters adParameters;
    public final String duration;
    public final List<Icon> icons;
    public final List<MediaFile> mediaFiles;
    public final String skipOffset;
    public final List<Tracking> trackingEvents;
    public final VideoClicks videoClicks;

    Linear(List<MediaFile> list, List<Tracking> list2, List<Icon> list3, AdParameters adParameters2, String str, String str2, VideoClicks videoClicks2) {
        this.adParameters = adParameters2;
        this.duration = str;
        this.skipOffset = str2;
        this.mediaFiles = list;
        this.videoClicks = videoClicks2;
        this.trackingEvents = list2;
        this.icons = list3;
    }

    public static class Builder {
        private AdParameters adParameters;
        private String duration;
        private List<Icon> icons;
        private List<MediaFile> mediaFiles;
        private String skipOffset;
        private List<Tracking> trackingEvents;
        private VideoClicks videoClicks;

        public Builder setSkipOffset(String str) {
            this.skipOffset = str;
            return this;
        }

        public Builder setDuration(String str) {
            this.duration = str;
            return this;
        }

        public Builder setAdParameters(AdParameters adParameters2) {
            this.adParameters = adParameters2;
            return this;
        }

        public Builder setMediaFiles(List<MediaFile> list) {
            this.mediaFiles = list;
            return this;
        }

        public Builder setVideoClicks(VideoClicks videoClicks2) {
            this.videoClicks = videoClicks2;
            return this;
        }

        public Builder setTrackingEvents(List<Tracking> list) {
            this.trackingEvents = list;
            return this;
        }

        public Builder setIcons(List<Icon> list) {
            this.icons = list;
            return this;
        }

        public Linear build() {
            return new Linear(VastModels.toImmutableList(this.mediaFiles), VastModels.toImmutableList(this.trackingEvents), VastModels.toImmutableList(this.icons), this.adParameters, this.duration, this.skipOffset, this.videoClicks);
        }
    }
}
