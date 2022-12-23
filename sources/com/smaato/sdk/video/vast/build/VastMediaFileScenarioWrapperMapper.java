package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastRawMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.smaato.sdk.video.vast.utils.VastVideoPlayerTimeConverterUtils;

public class VastMediaFileScenarioWrapperMapper {
    private final VastIconScenarioPicker vastIconScenarioPicker;

    public VastMediaFileScenarioWrapperMapper(VastIconScenarioPicker vastIconScenarioPicker2) {
        this.vastIconScenarioPicker = (VastIconScenarioPicker) Objects.requireNonNull(vastIconScenarioPicker2, "Parameter vastIconScenarioPicker should not be null for VastMediaFileScenarioMapper::new");
    }

    public VastRawMediaFileScenario mapMediaFileScenario(Logger logger, Linear linear, VastScenarioCreativeData vastScenarioCreativeData) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(vastScenarioCreativeData);
        VastIconScenario pickIconScenario = this.vastIconScenarioPicker.pickIconScenario(logger, linear.icons);
        long convertDurationStringToMilliseconds = VastVideoPlayerTimeConverterUtils.convertDurationStringToMilliseconds(linear.duration, logger);
        return new VastRawMediaFileScenario.Builder().setVastScenarioCreativeData(vastScenarioCreativeData).setVastIconScenario(pickIconScenario).setTrackingEvents(linear.trackingEvents).setVideoClicks(linear.videoClicks).setAdParameters(linear.adParameters).setSkipOffset(VastVideoPlayerTimeConverterUtils.convertOffsetStringToMilliseconds(linear.skipOffset, convertDurationStringToMilliseconds, logger)).setDuration(convertDurationStringToMilliseconds).build();
    }
}
