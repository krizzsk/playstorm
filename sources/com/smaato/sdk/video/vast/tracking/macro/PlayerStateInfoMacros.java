package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p382fi.Supplier;
import com.smaato.sdk.video.utils.DateFormatUtils;
import java.util.Map;

final class PlayerStateInfoMacros {
    private final String adServingId;
    private final String assetUrl;
    private final DateFormatUtils dateFormatUtils;
    private final ScreenSizeProvider screenSizeProvider;

    interface ScreenSizeProvider extends Supplier<Size> {
    }

    PlayerStateInfoMacros(ScreenSizeProvider screenSizeProvider2, DateFormatUtils dateFormatUtils2, String str, String str2) {
        this.screenSizeProvider = (ScreenSizeProvider) Objects.requireNonNull(screenSizeProvider2);
        this.dateFormatUtils = (DateFormatUtils) Objects.requireNonNull(dateFormatUtils2);
        this.assetUrl = str;
        this.adServingId = str2;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> toMap(PlayerState playerState) {
        Size size = (Size) this.screenSizeProvider.get();
        Map.Entry[] entryArr = new Map.Entry[9];
        entryArr[0] = Maps.entryOf("[PLAYERSTATE]", getPlayerState(playerState.isMuted));
        entryArr[1] = Maps.entryOf("[INVENTORYSTATE]", "skippable,mautoplayed");
        entryArr[2] = Maps.entryOf("[PLAYERSIZE]", Joiner.join((CharSequence) ",", Integer.valueOf(size.width), Integer.valueOf(size.height)));
        entryArr[3] = Maps.entryOf("[ADPLAYHEAD]", getAdPlayhead(playerState.offsetMillis));
        String str = "-2";
        entryArr[4] = Maps.entryOf("[ASSETURI]", TextUtils.isEmpty(this.assetUrl) ? str : this.assetUrl);
        entryArr[5] = Maps.entryOf("[CONTENTID]", "-1");
        entryArr[6] = Maps.entryOf("[CONTENTURI]", "-1");
        entryArr[7] = Maps.entryOf("[PODSEQUENCE]", "-1");
        if (!TextUtils.isEmpty(this.adServingId)) {
            str = this.adServingId;
        }
        entryArr[8] = Maps.entryOf("[ADSERVINGID]", str);
        return Maps.mapOf(entryArr);
    }

    private String getPlayerState(Boolean bool) {
        if (bool == null) {
            return "-2";
        }
        return bool.booleanValue() ? "fullscreen,muted" : "fullscreen";
    }

    private String getAdPlayhead(Long l) {
        return l == null ? "-2" : this.dateFormatUtils.offsetFromTimeInterval(l.longValue());
    }
}
