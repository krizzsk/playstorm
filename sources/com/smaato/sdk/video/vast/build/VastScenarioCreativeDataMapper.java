package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;

public class VastScenarioCreativeDataMapper {
    public VastScenarioCreativeData mapVastScenarioCreativeData(Creative creative) {
        return new VastScenarioCreativeData.Builder().setUniversalAdId(creative.universalAdId).setAdId(creative.adId).setId(creative.f27169id).setApiFramework(creative.apiFramework).setSequence(creative.sequence).build();
    }
}
