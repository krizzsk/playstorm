package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p382fi.Function;
import java.util.Map;

final class ClickInfoMacros {
    private final PxToDpConverter converter;

    interface PxToDpConverter extends Function<Float, Integer> {
    }

    ClickInfoMacros(PxToDpConverter pxToDpConverter) {
        this.converter = (PxToDpConverter) Objects.requireNonNull(pxToDpConverter);
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> toMap(Float f, Float f2) {
        return Maps.mapOf(Maps.entryOf("[CLICKPOS]", getClickPos(f, f2)));
    }

    private String getClickPos(Float f, Float f2) {
        if (f == null || f2 == null || f.floatValue() <= 0.0f || f2.floatValue() <= 0.0f) {
            return "-2";
        }
        return this.converter.apply(f) + "," + this.converter.apply(f2);
    }
}
