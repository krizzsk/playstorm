package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;

public class VastCompanionScenarioMapper {
    public VastCompanionScenario mapVastCompanionScenario(Logger logger, Companion companion, VastScenarioCreativeData vastScenarioCreativeData) {
        Objects.requireNonNull(logger);
        try {
            return new VastCompanionScenario.Builder().setVastScenarioResourceData(new VastScenarioResourceData.Builder().setStaticResource(companion.staticResources.isEmpty() ? null : companion.staticResources.get(0)).setHtmlResources(companion.htmlResources.isEmpty() ? null : companion.htmlResources.get(0)).setIFrameResources(companion.iFrameResources.isEmpty() ? null : companion.iFrameResources.get(0)).build()).setVastScenarioCreativeData(vastScenarioCreativeData).setId(companion.f27166id).setAdParameters(companion.adParameters).setAdSlotID(companion.adSlotID).setAltText(companion.altText).setApiFramework(companion.apiFramework).setWidth(companion.width).setHeight(companion.height).setAssetHeight(companion.assetHeight).setAssetWidth(companion.assetWidth).setExpandedHeight(companion.expandedHeight).setExpandedWidth(companion.expandedWidth).setPxRatio(companion.pxRatio).setTrackingEvents(companion.trackingEvents).setCompanionClickThrough(companion.companionClickThrough).setCompanionClickTrackings(companion.companionClickTrackings).build();
        } catch (VastElementMissingException e) {
            logger.error(LogDomain.VAST, e, "Cannot build VastCompanionScenario", new Object[0]);
            return null;
        }
    }
}
