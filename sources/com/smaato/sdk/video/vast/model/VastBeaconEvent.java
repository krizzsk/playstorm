package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;

public enum VastBeaconEvent {
    SMAATO_VIDEO_CLICK_TRACKING("smaato_sdk_vastVideoClickTracking", true),
    SMAATO_ICON_CLICK_TRACKING("smaato_sdk_vastIconClickTracking", true),
    SMAATO_COMPANION_CLICK_TRACKING("smaato_sdk_vastCompanionClickTracking", true),
    SMAATO_IMPRESSION("smaato_sdk_vastInlineImpression", true),
    SMAATO_VIEWABLE_IMPRESSION("smaato_sdk_vastInlineViewableImpression", true),
    SMAATO_ICON_VIEW_TRACKING("smaato_sdk_vastIconViewTracking", true);
    
    public final String key;
    public final boolean oneTime;

    private VastBeaconEvent(String str, boolean z) {
        this.key = (String) Objects.requireNonNull(str);
        this.oneTime = z;
    }

    public static VastBeaconEvent parse(String str) {
        for (VastBeaconEvent vastBeaconEvent : values()) {
            if (vastBeaconEvent.key.equalsIgnoreCase(str)) {
                return vastBeaconEvent;
            }
        }
        return null;
    }
}
