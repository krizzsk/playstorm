package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import java.util.List;

public class VastCompanionScenarioMerger {
    public VastCompanionScenario merge(VastCompanionScenario vastCompanionScenario, List<VastCompanionScenario> list) {
        Objects.requireNonNull(vastCompanionScenario, "Parameter companionScenario should not be null for VastCompanionScenarioMerger::merge");
        Objects.requireNonNull(list, "Parameter wrapperCompanionScenarios should not be null for VastCompanionScenarioMerger::merge");
        VastCompanionScenario vastCompanionScenario2 = vastCompanionScenario;
        for (VastCompanionScenario next : list) {
            if (validToMerge(vastCompanionScenario, next)) {
                vastCompanionScenario2 = merge(vastCompanionScenario2, next);
            }
        }
        return vastCompanionScenario2;
    }

    private VastCompanionScenario merge(VastCompanionScenario vastCompanionScenario, VastCompanionScenario vastCompanionScenario2) {
        return vastCompanionScenario.newBuilder().setTrackingEvents(VastScenarioMergeUtils.merge(vastCompanionScenario.trackingEvents, vastCompanionScenario2.trackingEvents)).setCompanionClickTrackings(VastScenarioMergeUtils.merge(vastCompanionScenario.companionClickTrackings, vastCompanionScenario2.companionClickTrackings)).build();
    }

    private boolean validToMerge(VastCompanionScenario vastCompanionScenario, VastCompanionScenario vastCompanionScenario2) {
        return validToMerge(vastCompanionScenario.vastScenarioCreativeData.universalAdId, vastCompanionScenario2.vastScenarioCreativeData.universalAdId);
    }

    private boolean validToMerge(UniversalAdId universalAdId, UniversalAdId universalAdId2) {
        return universalAdId.equals(universalAdId2) || universalAdId2.equals(UniversalAdId.DEFAULT);
    }
}
