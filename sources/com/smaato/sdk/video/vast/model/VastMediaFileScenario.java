package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public final class VastMediaFileScenario {
    public final AdParameters adParameters;
    public final long duration;
    public final MediaFile mediaFile;
    public final long skipOffset;
    public final List<Tracking> trackingEvents;
    public final VastIconScenario vastIconScenario;
    public final VastScenarioCreativeData vastScenarioCreativeData;
    public final VideoClicks videoClicks;

    private VastMediaFileScenario(MediaFile mediaFile2, List<Tracking> list, VastScenarioCreativeData vastScenarioCreativeData2, long j, long j2, AdParameters adParameters2, VideoClicks videoClicks2, VastIconScenario vastIconScenario2) {
        this.mediaFile = (MediaFile) Objects.requireNonNull(mediaFile2);
        this.trackingEvents = (List) Objects.requireNonNull(list);
        this.vastScenarioCreativeData = (VastScenarioCreativeData) Objects.requireNonNull(vastScenarioCreativeData2);
        this.duration = j;
        this.skipOffset = j2;
        this.adParameters = adParameters2;
        this.videoClicks = videoClicks2;
        this.vastIconScenario = vastIconScenario2;
    }

    public Builder newBuilder() {
        return new Builder();
    }

    public boolean hasValidDuration() {
        return this.duration > 0;
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

        private Builder(VastMediaFileScenario vastMediaFileScenario) {
            this.mediaFile = vastMediaFileScenario.mediaFile;
            this.trackingEvents = vastMediaFileScenario.trackingEvents;
            this.vastScenarioCreativeData = vastMediaFileScenario.vastScenarioCreativeData;
            this.duration = vastMediaFileScenario.duration;
            this.skipOffset = vastMediaFileScenario.skipOffset;
            this.adParameters = vastMediaFileScenario.adParameters;
            this.videoClicks = vastMediaFileScenario.videoClicks;
            this.vastIconScenario = vastMediaFileScenario.vastIconScenario;
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

        public VastMediaFileScenario build() {
            Objects.requireNonNull(this.vastScenarioCreativeData, "Cannot build VastMediaFileScenario: vastScenarioCreativeData is missing");
            Objects.requireNonNull(this.mediaFile, "Cannot build VastMediaFileScenario: mediaFile is missing");
            return new VastMediaFileScenario(this.mediaFile, VastModels.toImmutableList(this.trackingEvents), this.vastScenarioCreativeData, this.duration, this.skipOffset, this.adParameters, this.videoClicks, this.vastIconScenario);
        }
    }
}
