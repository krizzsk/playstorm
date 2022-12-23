package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastRawMediaFileScenario;
import java.util.List;

public class VastMediaFileScenarioMerger {
    private VideoClicksMerger videoClicksMerger;

    public VastMediaFileScenarioMerger(VideoClicksMerger videoClicksMerger2) {
        this.videoClicksMerger = (VideoClicksMerger) Objects.requireNonNull(videoClicksMerger2, "Parameter videoClicksMerger should not be null for VastMediaFileScenarioMerger::new");
    }

    public VastMediaFileScenario merge(VastMediaFileScenario vastMediaFileScenario, List<VastRawMediaFileScenario> list) {
        Objects.requireNonNull(vastMediaFileScenario, "Parameter mediaFileScenario should not be null for VastMediaFileScenarioMerger::merge");
        Objects.requireNonNull(list, "Parameter wrapperMediaFileScenarios should not be null for VastMediaFileScenarioMerger::merge");
        VastMediaFileScenario vastMediaFileScenario2 = vastMediaFileScenario;
        for (VastRawMediaFileScenario next : list) {
            if (validToMerge(vastMediaFileScenario, next)) {
                vastMediaFileScenario2 = merge(vastMediaFileScenario2, next);
            }
        }
        return vastMediaFileScenario2;
    }

    private VastMediaFileScenario merge(VastMediaFileScenario vastMediaFileScenario, VastRawMediaFileScenario vastRawMediaFileScenario) {
        VastMediaFileScenario.Builder trackingEvents = vastMediaFileScenario.newBuilder().setVideoClicks(this.videoClicksMerger.merge(vastMediaFileScenario.videoClicks, vastRawMediaFileScenario.videoClicks)).setTrackingEvents(VastScenarioMergeUtils.merge(vastMediaFileScenario.trackingEvents, vastRawMediaFileScenario.trackingEvents));
        VastIconScenario vastIconScenario = vastMediaFileScenario.vastIconScenario;
        if (vastIconScenario == null) {
            vastIconScenario = vastRawMediaFileScenario.vastIconScenario;
        }
        return trackingEvents.setVastIconScenario(vastIconScenario).build();
    }

    private boolean validToMerge(VastMediaFileScenario vastMediaFileScenario, VastRawMediaFileScenario vastRawMediaFileScenario) {
        return validToMerge(vastMediaFileScenario.vastScenarioCreativeData.universalAdId, vastRawMediaFileScenario.vastScenarioCreativeData.universalAdId);
    }

    private boolean validToMerge(UniversalAdId universalAdId, UniversalAdId universalAdId2) {
        return universalAdId.equals(universalAdId2) || universalAdId2.equals(UniversalAdId.DEFAULT);
    }
}
