package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.api.SomaApiContext;

/* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilder */
public interface AdPresenterBuilder {

    /* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilder$Error */
    public enum Error {
        INVALID_RESPONSE,
        GENERIC,
        RESOURCE_EXPIRED,
        TRANSPORT_NO_NETWORK_CONNECTION,
        TRANSPORT_TIMEOUT,
        TRANSPORT_IO_ERROR,
        TRANSPORT_GENERIC,
        TRANSPORT_IO_TOO_MANY_REDIRECTS,
        CANCELLED
    }

    /* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilder$Listener */
    public interface Listener {
        void onAdPresenterBuildError(AdPresenterBuilder adPresenterBuilder, AdPresenterBuilderException adPresenterBuilderException);

        void onAdPresenterBuildSuccess(AdPresenterBuilder adPresenterBuilder, AdPresenter adPresenter);
    }

    void buildAdPresenter(SomaApiContext somaApiContext, Listener listener);
}
