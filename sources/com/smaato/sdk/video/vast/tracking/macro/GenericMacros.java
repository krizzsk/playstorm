package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.video.utils.DateFormatUtils;
import com.smaato.sdk.video.utils.RandomUtils;
import java.util.Map;

final class GenericMacros {
    private final DateFormatUtils dateFormatUtils;
    private final RandomUtils randomUtils;

    GenericMacros(DateFormatUtils dateFormatUtils2, RandomUtils randomUtils2) {
        this.dateFormatUtils = (DateFormatUtils) Objects.requireNonNull(dateFormatUtils2);
        this.randomUtils = (RandomUtils) Objects.requireNonNull(randomUtils2);
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> toMap() {
        return Maps.mapOf(Maps.entryOf("[TIMESTAMP]", this.dateFormatUtils.currentTimestamp()), Maps.entryOf("[CACHEBUSTING]", this.randomUtils.random8DigitNumber()));
    }
}
