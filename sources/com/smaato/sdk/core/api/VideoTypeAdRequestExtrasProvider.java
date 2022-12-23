package com.smaato.sdk.core.api;

import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.ApiAdRequestExtras;
import com.smaato.sdk.core.util.Objects;

public final class VideoTypeAdRequestExtrasProvider implements AdRequestExtrasProvider {
    private final String videoType;

    public VideoTypeAdRequestExtrasProvider(String str) {
        this.videoType = (String) Objects.requireNonNull(str);
    }

    public void addApiAdRequestExtras(ApiAdRequestExtras apiAdRequestExtras) {
        AdFormat adFormat = apiAdRequestExtras.adFormat();
        if (adFormat == AdFormat.VIDEO || adFormat == AdFormat.INTERSTITIAL) {
            apiAdRequestExtras.addApiParamExtra("videotype", this.videoType);
            if (VideoType.OUTSTREAM.equals(this.videoType)) {
                apiAdRequestExtras.addApiParamExtra("vastver", "4.1");
            }
        }
    }
}
