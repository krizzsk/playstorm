package com.smaato.sdk.video.p389ad;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.p378ad.AdObject;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.video.ad.VideoAdObject */
class VideoAdObject implements AdObject {
    private final SomaApiContext somaApiContext;

    VideoAdObject(SomaApiContext somaApiContext2) {
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
    }

    public SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }
}
