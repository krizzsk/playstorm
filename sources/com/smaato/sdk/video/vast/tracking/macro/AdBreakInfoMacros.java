package com.smaato.sdk.video.vast.tracking.macro;

import com.mbridge.msdk.MBridgeConstans;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.video.utils.DateFormatUtils;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Map;

final class AdBreakInfoMacros {
    private final DateFormatUtils dateFormatUtils;
    private final UniversalAdId universalAdId;
    private final VastScenario vastScenario;

    AdBreakInfoMacros(DateFormatUtils dateFormatUtils2, VastScenario vastScenario2, UniversalAdId universalAdId2) {
        this.dateFormatUtils = (DateFormatUtils) Objects.requireNonNull(dateFormatUtils2);
        this.vastScenario = vastScenario2;
        this.universalAdId = universalAdId2;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> toMap(PlayerState playerState) {
        String playhead = getPlayhead(playerState.offsetMillis);
        return Maps.mapOf(Maps.entryOf("[CONTENTPLAYHEAD]", playhead), Maps.entryOf("[MEDIAPLAYHEAD]", playhead), Maps.entryOf("[BREAKPOSITION]", MBridgeConstans.DYNAMIC_VIEW_TYPE_ALTER_NATIVE_STR_4), Maps.entryOf("[BLOCKEDADCATEGORIES]", getBlockedAdCategories()), Maps.entryOf("[ADCATEGORIES]", "-1"), Maps.entryOf("[ADCOUNT]", "1"), Maps.entryOf("[TRANSACTIONID]", "-1"), Maps.entryOf("[PLACEMENTTYPE]", "5"), Maps.entryOf("[ADTYPE]", "video"), Maps.entryOf("[UNIVERSALADID]", getUniversalAdId()), Maps.entryOf("[BREAKMAXDURATION]", "60"), Maps.entryOf("[BREAKMINDURATION]", "1"), Maps.entryOf("[BREAKMAXADS]", "1"), Maps.entryOf("[BREAKMINADLENGTH]", "1"), Maps.entryOf("[BREAKMAXADLENGTH]", "60"));
    }

    private String getUniversalAdId() {
        if (this.universalAdId == null) {
            return "-2";
        }
        return this.universalAdId.idRegistry + " " + this.universalAdId.idValue;
    }

    private String getPlayhead(Long l) {
        return l == null ? "-2" : this.dateFormatUtils.offsetFromTimeInterval(l.longValue());
    }

    private String getBlockedAdCategories() {
        VastScenario vastScenario2 = this.vastScenario;
        if (vastScenario2 == null) {
            return "-2";
        }
        return Joiner.join((CharSequence) ",", (Iterable) vastScenario2.blockedAdCategories);
    }
}
