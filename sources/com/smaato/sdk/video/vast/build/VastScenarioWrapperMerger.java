package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastRawScenario;
import com.smaato.sdk.video.vast.model.VastScenario;

public class VastScenarioWrapperMerger {
    private final VastCompanionScenarioMerger vastCompanionScenarioMerger;
    private final VastMediaFileScenarioMerger vastMediaFileScenarioMerger;
    private final ViewableImpressionMerger viewableImpressionMerger;
    private final VastWrapperCompanionScenarioPicker wrapperCompanionScenarioPicker;

    public VastScenarioWrapperMerger(VastMediaFileScenarioMerger vastMediaFileScenarioMerger2, VastWrapperCompanionScenarioPicker vastWrapperCompanionScenarioPicker, VastCompanionScenarioMerger vastCompanionScenarioMerger2, ViewableImpressionMerger viewableImpressionMerger2) {
        this.vastMediaFileScenarioMerger = (VastMediaFileScenarioMerger) Objects.requireNonNull(vastMediaFileScenarioMerger2, "Parameter vastMediaFileScenarioMerger should be null for VastScenarioWrapperMerger::new");
        this.wrapperCompanionScenarioPicker = (VastWrapperCompanionScenarioPicker) Objects.requireNonNull(vastWrapperCompanionScenarioPicker, "Parameter wrapperCompanionScenarioPicker should be null for VastScenarioWrapperMerger::new");
        this.vastCompanionScenarioMerger = (VastCompanionScenarioMerger) Objects.requireNonNull(vastCompanionScenarioMerger2, "Parameter vastCompanionScenarioMerger should be null for VastScenarioWrapperMerger::new");
        this.viewableImpressionMerger = (ViewableImpressionMerger) Objects.requireNonNull(viewableImpressionMerger2, "Parameter viewableImpressionMerger should be null for VastScenarioWrapperMerger::new");
    }

    /* access modifiers changed from: package-private */
    public VastScenario merge(VastScenario vastScenario, VastRawScenario vastRawScenario, VastConfigurationSettings vastConfigurationSettings) {
        VastCompanionScenario vastCompanionScenario;
        VastScenario.Builder blockedAdCategories = vastScenario.newBuilder().setImpressions(VastScenarioMergeUtils.merge(vastScenario.impressions, vastRawScenario.impressions)).setAdVerifications(VastScenarioMergeUtils.merge(vastScenario.adVerifications, vastRawScenario.adVerifications)).setCategories(VastScenarioMergeUtils.merge(vastScenario.categories, vastRawScenario.categories)).setErrors(VastScenarioMergeUtils.merge(vastScenario.errors, vastRawScenario.errors)).setViewableImpression(this.viewableImpressionMerger.merge(vastScenario.viewableImpression, vastRawScenario.viewableImpression)).setBlockedAdCategories(VastScenarioMergeUtils.merge(vastScenario.blockedAdCategories, vastRawScenario.blockedAdCategories));
        VastMediaFileScenario vastMediaFileScenario = vastScenario.vastMediaFileScenario;
        blockedAdCategories.setVastMediaFileScenario(this.vastMediaFileScenarioMerger.merge(vastMediaFileScenario, vastRawScenario.vastRawMediaFileScenarios));
        UniversalAdId universalAdId = vastMediaFileScenario.vastScenarioCreativeData.universalAdId;
        VastCompanionScenario vastCompanionScenario2 = vastScenario.vastCompanionScenario;
        if (vastCompanionScenario2 == null) {
            vastCompanionScenario = this.wrapperCompanionScenarioPicker.pickWrapperCompanionScenario(universalAdId, vastRawScenario.vastCompanionScenarios, vastConfigurationSettings);
        } else {
            vastCompanionScenario = this.vastCompanionScenarioMerger.merge(vastCompanionScenario2, vastRawScenario.vastCompanionScenarios);
        }
        if (vastCompanionScenario != null) {
            blockedAdCategories.setVastCompanionScenario(vastCompanionScenario);
        }
        return blockedAdCategories.build();
    }
}
