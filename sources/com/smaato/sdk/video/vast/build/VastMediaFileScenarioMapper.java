package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.smaato.sdk.video.vast.utils.VastVideoPlayerTimeConverterUtils;

public class VastMediaFileScenarioMapper {
    private final VastIconScenarioPicker vastIconScenarioPicker;

    public VastMediaFileScenarioMapper(VastIconScenarioPicker vastIconScenarioPicker2) {
        this.vastIconScenarioPicker = (VastIconScenarioPicker) Objects.requireNonNull(vastIconScenarioPicker2, "Parameter vastIconScenarioPicker should not be null for VastMediaFileScenarioMapper::new");
    }

    /* access modifiers changed from: package-private */
    public VastMediaFileScenario mapMediaFileScenario(Logger logger, MediaFile mediaFile, Linear linear, VastScenarioCreativeData vastScenarioCreativeData) {
        Objects.requireNonNull(linear);
        Objects.requireNonNull(mediaFile);
        Objects.requireNonNull(linear);
        Objects.requireNonNull(vastScenarioCreativeData);
        VastIconScenario pickIconScenario = this.vastIconScenarioPicker.pickIconScenario(logger, linear.icons);
        long convertDurationStringToMilliseconds = VastVideoPlayerTimeConverterUtils.convertDurationStringToMilliseconds(linear.duration, logger);
        return new VastMediaFileScenario.Builder().setVastScenarioCreativeData(vastScenarioCreativeData).setTrackingEvents(linear.trackingEvents).setMediaFile(mediaFile).setVastIconScenario(pickIconScenario).setVideoClicks(linear.videoClicks).setAdParameters(linear.adParameters).setSkipOffset(VastVideoPlayerTimeConverterUtils.convertOffsetStringToMilliseconds(linear.skipOffset, convertDurationStringToMilliseconds, logger)).setDuration(convertDurationStringToMilliseconds).build();
    }
}
