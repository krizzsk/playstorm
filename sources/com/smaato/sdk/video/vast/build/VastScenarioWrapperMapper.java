package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.VastRawScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.smaato.sdk.video.vast.model.Wrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class VastScenarioWrapperMapper {
    private final VastCompanionPicker vastCompanionPicker;
    private final VastCompanionScenarioMapper vastCompanionScenarioMapper;
    private final VastMediaFileScenarioWrapperMapper vastMediaFileScenarioWrapperMapper;
    private final VastScenarioCreativeDataMapper vastScenarioCreativeDataMapper;

    public VastScenarioWrapperMapper(VastCompanionPicker vastCompanionPicker2, VastCompanionScenarioMapper vastCompanionScenarioMapper2, VastMediaFileScenarioWrapperMapper vastMediaFileScenarioWrapperMapper2, VastScenarioCreativeDataMapper vastScenarioCreativeDataMapper2) {
        this.vastCompanionPicker = (VastCompanionPicker) Objects.requireNonNull(vastCompanionPicker2, "Parameter vastCompanionPicker should be null for VastScenarioPicker::new");
        this.vastCompanionScenarioMapper = (VastCompanionScenarioMapper) Objects.requireNonNull(vastCompanionScenarioMapper2, "Parameter vastCompanionScenarioMapper should be null for VastScenarioPicker::new");
        this.vastMediaFileScenarioWrapperMapper = (VastMediaFileScenarioWrapperMapper) Objects.requireNonNull(vastMediaFileScenarioWrapperMapper2, "Parameter vastMediaFileScenarioWrapperMapper should be null for VastScenarioPicker::new");
        this.vastScenarioCreativeDataMapper = (VastScenarioCreativeDataMapper) Objects.requireNonNull(vastScenarioCreativeDataMapper2, "Parameter vastScenarioCreativeDataMapper should be null for VastScenarioPicker::new");
    }

    /* access modifiers changed from: package-private */
    public VastRawScenario mapVastScenarioForWrapper(Logger logger, Wrapper wrapper, VastConfigurationSettings vastConfigurationSettings) {
        Companion pickCompanion;
        Objects.requireNonNull(logger);
        Objects.requireNonNull(vastConfigurationSettings);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Creative next : wrapper.creatives) {
            VastScenarioCreativeData mapVastScenarioCreativeData = this.vastScenarioCreativeDataMapper.mapVastScenarioCreativeData(next);
            Linear linear = next.linear;
            if (linear != null) {
                arrayList.add(this.vastMediaFileScenarioWrapperMapper.mapMediaFileScenario(logger, linear, mapVastScenarioCreativeData));
            }
            CompanionAds companionAds = next.companionAds;
            if (!(companionAds == null || (pickCompanion = this.vastCompanionPicker.pickCompanion(companionAds, vastConfigurationSettings)) == null)) {
                arrayList2.add(this.vastCompanionScenarioMapper.mapVastCompanionScenario(logger, pickCompanion, mapVastScenarioCreativeData));
            }
        }
        String str = wrapper.blockedAdCategories;
        return new VastRawScenario.Builder().setAdSystem(wrapper.adSystem).setAdVerifications(wrapper.adVerifications).setImpressions(wrapper.impressions).setErrors(wrapper.errors).setViewableImpression(wrapper.viewableImpression).setVastCompanionScenarios(arrayList2).setVastMediaFileScenarios(arrayList).setBlockedAdCategories(str == null ? Collections.emptyList() : Arrays.asList(str.split("\\s*,\\s*"))).build();
    }
}
