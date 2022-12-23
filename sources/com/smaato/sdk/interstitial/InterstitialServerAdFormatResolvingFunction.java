package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.CollectionUtils;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InterstitialServerAdFormatResolvingFunction implements NullableFunction<Collection<AdFormat>, AdFormat> {
    private static final List<AdFormat> DISPLAY_AD_FORMATS = Lists.m32965of((T[]) new AdFormat[]{AdFormat.STATIC_IMAGE, AdFormat.RICH_MEDIA});
    private static final List<AdFormat> VIDEO_AD_FORMATS = Lists.m32965of((T[]) new AdFormat[]{AdFormat.STATIC_IMAGE, AdFormat.VIDEO});
    private final List<AdFormat> interstitialAdFormats;

    public InterstitialServerAdFormatResolvingFunction(Collection<AdFormat> collection) {
        this.interstitialAdFormats = Lists.toImmutableList((Collection) Objects.requireNonNull(collection));
    }

    public AdFormat apply(Collection<AdFormat> collection) {
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.interstitialAdFormats);
            if (!arrayList.retainAll(collection)) {
                return AdFormat.INTERSTITIAL;
            }
            if (arrayList.size() == 1) {
                return (AdFormat) arrayList.get(0);
            }
            if (CollectionUtils.equalsByElements(DISPLAY_AD_FORMATS, arrayList)) {
                return AdFormat.DISPLAY;
            }
            if (CollectionUtils.equalsByElements(VIDEO_AD_FORMATS, arrayList)) {
                return AdFormat.VIDEO;
            }
        }
        return null;
    }
}
