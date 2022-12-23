package com.smaato.sdk.video.vast.model;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.util.Objects;
import com.tapjoy.TJAdUnitConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public enum VastEvent {
    START("start", true),
    FIRST_QUARTILE(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE, true),
    MID_POINT("midpoint", true),
    THIRD_QUARTILE(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE, true),
    COMPLETE("complete", true),
    OTHER_AD_INTERACTION("otherAdInteraction", false),
    PROGRESS(NotificationCompat.CATEGORY_PROGRESS, false),
    CREATIVE_VIEW("creativeView", true),
    PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, false),
    RESUME(CampaignEx.JSON_NATIVE_VIDEO_RESUME, false),
    REWIND("rewind", false),
    SKIP("skip", false),
    MUTE("mute", false),
    UNMUTE("unmute", false),
    PLAYER_EXPAND("playerExpand", false),
    PLAYER_COLLAPSE("playerCollapse", false),
    LOADED(TJAdUnitConstants.String.VIDEO_LOADED, true),
    CLOSE_LINEAR("closeLinear", true);
    
    public static final Set<VastEvent> EVENTS_WITH_OFFSET = null;
    public final String key;
    public final boolean oneTime;

    static {
        EVENTS_WITH_OFFSET = Collections.unmodifiableSet(new HashSet<VastEvent>() {
            {
                add(VastEvent.PROGRESS);
                add(VastEvent.START);
                add(VastEvent.FIRST_QUARTILE);
                add(VastEvent.MID_POINT);
                add(VastEvent.THIRD_QUARTILE);
            }
        });
    }

    private VastEvent(String str, boolean z) {
        this.key = (String) Objects.requireNonNull(str);
        this.oneTime = z;
    }

    public static VastEvent parse(String str) {
        for (VastEvent vastEvent : values()) {
            if (vastEvent.key.equalsIgnoreCase(str)) {
                return vastEvent;
            }
        }
        return null;
    }
}
