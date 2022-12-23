package com.smaato.sdk.image.p383ad;

import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationException;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationOnRedirectException;
import com.smaato.sdk.core.resourceloader.ResourceLoaderException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;
import com.smaato.sdk.core.violationreporter.ImageAdLoadingViolationException;

/* renamed from: com.smaato.sdk.image.ad.ImageAdPresenterBuilderAdQualityViolationUtils */
public final class ImageAdPresenterBuilderAdQualityViolationUtils {
    private final ApiParams apiParams;

    public ImageAdPresenterBuilderAdQualityViolationUtils(ApiParams apiParams2) {
        this.apiParams = apiParams2;
    }

    public ResourceLoaderException substituteReasonWithAdQualityViolationExceptionIfRequired(SomaApiContext somaApiContext, ImageAdResponse imageAdResponse, ResourceLoaderException resourceLoaderException) {
        ResourceLoaderException resourceLoaderException2 = resourceLoaderException;
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(resourceLoaderException);
        Exception findInitialCause = findInitialCause(resourceLoaderException2);
        if (findInitialCause instanceof HttpsOnlyPolicyViolationException) {
            return new ResourceLoaderException(resourceLoaderException.getErrorType(), new ImageAdLoadingViolationException("SOMAAdSSLViolationTypeImageNotHttps", somaApiContext.getApiAdResponse().getResponseHeaders(), somaApiContext.getApiAdRequest().getPublisherId(), somaApiContext.getApiAdRequest().getAdSpaceId(), this.apiParams.getBundle(), this.apiParams.getClient(), imageAdResponse.getClickUrl(), imageAdResponse.getClickTrackingUrls(), ((HttpsOnlyPolicyViolationException) findInitialCause).violatedUrl, somaApiContext.getApiAdResponse().getRequestUrl()));
        } else if (!(findInitialCause instanceof HttpsOnlyPolicyViolationOnRedirectException)) {
            return resourceLoaderException2;
        } else {
            HttpsOnlyPolicyViolationOnRedirectException httpsOnlyPolicyViolationOnRedirectException = (HttpsOnlyPolicyViolationOnRedirectException) findInitialCause;
            return new ResourceLoaderException(resourceLoaderException.getErrorType(), new ImageAdLoadingViolationException("SOMAAdSSLViolationTypeImageNotHttpsRedirect", somaApiContext.getApiAdResponse().getResponseHeaders(), somaApiContext.getApiAdRequest().getPublisherId(), somaApiContext.getApiAdRequest().getAdSpaceId(), this.apiParams.getBundle(), this.apiParams.getClient(), imageAdResponse.getClickUrl(), imageAdResponse.getClickTrackingUrls(), httpsOnlyPolicyViolationOnRedirectException.violatedUrl, httpsOnlyPolicyViolationOnRedirectException.originalUrl));
        }
    }

    private Exception findInitialCause(ResourceLoaderException resourceLoaderException) {
        Exception reason = resourceLoaderException.getReason();
        while (reason instanceof SdkComponentException) {
            reason = ((SdkComponentException) reason).getReason();
        }
        return reason;
    }
}
