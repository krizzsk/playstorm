package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public final class VastRawMediaFileScenario {
    public final AdParameters adParameters;
    public final long duration;
    public final MediaFile mediaFile;
    public final long skipOffset;
    public final List<Tracking> trackingEvents;
    public final VastIconScenario vastIconScenario;
    public final VastScenarioCreativeData vastScenarioCreativeData;
    public final VideoClicks videoClicks;

    private VastRawMediaFileScenario(List<Tracking> list, VastScenarioCreativeData vastScenarioCreativeData2, MediaFile mediaFile2, long j, long j2, AdParameters adParameters2, VideoClicks videoClicks2, VastIconScenario vastIconScenario2) {
        this.mediaFile = mediaFile2;
        this.vastScenarioCreativeData = vastScenarioCreativeData2;
        this.duration = j;
        this.skipOffset = j2;
        this.trackingEvents = list;
        this.adParameters = adParameters2;
        this.videoClicks = videoClicks2;
        this.vastIconScenario = vastIconScenario2;
    }

    public Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private AdParameters adParameters;
        private long duration;
        private MediaFile mediaFile;
        private long skipOffset;
        private List<Tracking> trackingEvents;
        private VastIconScenario vastIconScenario;
        private VastScenarioCreativeData vastScenarioCreativeData;
        private VideoClicks videoClicks;

        public Builder() {
        }

        private Builder(VastRawMediaFileScenario vastRawMediaFileScenario) {
            this.trackingEvents = vastRawMediaFileScenario.trackingEvents;
            this.vastScenarioCreativeData = vastRawMediaFileScenario.vastScenarioCreativeData;
            this.mediaFile = vastRawMediaFileScenario.mediaFile;
            this.duration = vastRawMediaFileScenario.duration;
            this.skipOffset = vastRawMediaFileScenario.skipOffset;
            this.adParameters = vastRawMediaFileScenario.adParameters;
            this.videoClicks = vastRawMediaFileScenario.videoClicks;
            this.vastIconScenario = vastRawMediaFileScenario.vastIconScenario;
        }

        public Builder setTrackingEvents(List<Tracking> list) {
            this.trackingEvents = list;
            return this;
        }

        public Builder setMediaFile(MediaFile mediaFile2) {
            this.mediaFile = mediaFile2;
            return this;
        }

        public Builder setDuration(long j) {
            this.duration = j;
            return this;
        }

        public Builder setAdParameters(AdParameters adParameters2) {
            this.adParameters = adParameters2;
            return this;
        }

        public Builder setSkipOffset(long j) {
            this.skipOffset = j;
            return this;
        }

        public Builder setVideoClicks(VideoClicks videoClicks2) {
            this.videoClicks = videoClicks2;
            return this;
        }

        public Builder setVastIconScenario(VastIconScenario vastIconScenario2) {
            this.vastIconScenario = vastIconScenario2;
            return this;
        }

        public Builder setVastScenarioCreativeData(VastScenarioCreativeData vastScenarioCreativeData2) {
            this.vastScenarioCreativeData = vastScenarioCreativeData2;
            return this;
        }

        public VastRawMediaFileScenario build() {
            Objects.requireNonNull(this.vastScenarioCreativeData, "Cannot build VastMediaFileScenario: vastScenarioCreativeData is missing");
            return new VastRawMediaFileScenario(VastModels.toImmutableList(this.trackingEvents), this.vastScenarioCreativeData, this.mediaFile, this.duration, this.skipOffset, this.adParameters, this.videoClicks, this.vastIconScenario);
        }
    }
}
