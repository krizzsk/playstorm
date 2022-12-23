package com.smaato.sdk.video.vast.build;

public class VastConfigurationSettings {
    public final String connectionType;
    public final int displayHeight;
    public final int displayWidth;

    public VastConfigurationSettings(int i, int i2, String str) {
        this.displayWidth = i;
        this.displayHeight = i2;
        this.connectionType = str;
    }
}
