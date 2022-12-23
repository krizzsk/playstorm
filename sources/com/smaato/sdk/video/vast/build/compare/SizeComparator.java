package com.smaato.sdk.video.vast.build.compare;

import com.smaato.sdk.video.vast.build.VastConfigurationSettings;
import com.smaato.sdk.video.vast.model.Sized;
import java.util.Comparator;

public class SizeComparator<T extends Sized> implements Comparator<T> {
    private final VastConfigurationSettings configurationSettings;

    public SizeComparator(VastConfigurationSettings vastConfigurationSettings) {
        this.configurationSettings = vastConfigurationSettings;
    }

    public int compare(T t, T t2) {
        if (t == null && t2 != null) {
            return 1;
        }
        if (t2 == null && t != null) {
            return -1;
        }
        if (t2 == null) {
            return 0;
        }
        float f = 0.0f;
        float floatValue = t.getWidth() == null ? 0.0f : t.getWidth().floatValue();
        float floatValue2 = t.getHeight() == null ? 0.0f : t.getHeight().floatValue();
        float floatValue3 = t2.getWidth() == null ? 0.0f : t2.getWidth().floatValue();
        if (t2.getHeight() != null) {
            f = t2.getHeight().floatValue();
        }
        return Float.compare(Math.abs(((float) this.configurationSettings.displayWidth) - floatValue) + Math.abs(((float) this.configurationSettings.displayHeight) - floatValue2), Math.abs(((float) this.configurationSettings.displayWidth) - floatValue3) + Math.abs(((float) this.configurationSettings.displayHeight) - f));
    }
}
