package com.smaato.sdk.video.vast.build.compare;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.VastConfigurationSettings;

public class AverageBitratePicker {
    private final VastConfigurationSettings configurationSettings;

    public AverageBitratePicker(VastConfigurationSettings vastConfigurationSettings) {
        this.configurationSettings = (VastConfigurationSettings) Objects.requireNonNull(vastConfigurationSettings, "configurationSettings can not be null in AverageBitratePicker");
    }

    public int getAverageBitrate() {
        VastConfigurationSettings vastConfigurationSettings = this.configurationSettings;
        int max = Math.max(vastConfigurationSettings.displayHeight, vastConfigurationSettings.displayWidth);
        VideoQuality videoQuality = VideoQuality.LOW;
        if (max <= videoQuality.maxWidth) {
            return videoQuality.averageBitrate;
        }
        VideoQuality videoQuality2 = VideoQuality.MEDIUM;
        if (max <= videoQuality2.maxWidth) {
            return videoQuality2.averageBitrate;
        }
        VideoQuality videoQuality3 = VideoQuality.HIGH;
        if (max <= videoQuality3.maxWidth) {
            return videoQuality3.averageBitrate;
        }
        return 3000;
    }
}
