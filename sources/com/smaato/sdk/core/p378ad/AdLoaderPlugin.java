package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.log.Logger;

/* renamed from: com.smaato.sdk.core.ad.AdLoaderPlugin */
public interface AdLoaderPlugin {
    void addApiAdRequestExtras(ApiAdRequestExtras apiAdRequestExtras, Logger logger);

    AdPresenterBuilder getAdPresenterBuilder(AdFormat adFormat, Class<? extends AdPresenter> cls, Logger logger);

    AdFormat resolveAdFormatToServerAdFormat(AdFormat adFormat, Logger logger);
}
