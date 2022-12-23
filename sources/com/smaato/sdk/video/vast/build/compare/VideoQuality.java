package com.smaato.sdk.video.vast.build.compare;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

enum VideoQuality {
    LOW(360, 600),
    MEDIUM(576, IronSourceConstants.RV_API_SHOW_CALLED),
    HIGH(720, 2000);
    
    public final int averageBitrate;
    public final int maxWidth;

    private VideoQuality(int i, int i2) {
        this.maxWidth = i;
        this.averageBitrate = i2;
    }
}
