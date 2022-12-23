package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.util.collections.Maps;
import java.util.Map;

final class ErrorInfoMacros {
    ErrorInfoMacros() {
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> toMap(Integer num) {
        Map.Entry[] entryArr = new Map.Entry[1];
        entryArr[0] = Maps.entryOf("[ERRORCODE]", num == null ? "-2" : String.valueOf(num));
        return Maps.mapOf(entryArr);
    }
}
