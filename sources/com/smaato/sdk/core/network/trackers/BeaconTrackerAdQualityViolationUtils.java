package com.smaato.sdk.core.network.trackers;

import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationException;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationOnRedirectException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import java.util.List;

public class BeaconTrackerAdQualityViolationUtils {
    private final AdQualityViolationReporter adQualityViolationReporter;
    private final ApiParams apiParams;

    public BeaconTrackerAdQualityViolationUtils(AdQualityViolationReporter adQualityViolationReporter2, ApiParams apiParams2) {
        this.adQualityViolationReporter = (AdQualityViolationReporter) Objects.requireNonNull(adQualityViolationReporter2);
        this.apiParams = apiParams2;
    }

    public void handleAdQualityViolationIfRequired(SomaApiContext somaApiContext, List<String> list, Exception exc) {
        if (exc instanceof HttpsOnlyPolicyViolationException) {
            this.adQualityViolationReporter.reportAdTrackerViolation("SOMAAdViolationSSLBeacon", somaApiContext.getApiAdResponse().getResponseHeaders(), somaApiContext.getApiAdRequest().getPublisherId(), somaApiContext.getApiAdRequest().getAdSpaceId(), this.apiParams.getBundle(), this.apiParams.getClient(), ((HttpsOnlyPolicyViolationException) exc).violatedUrl, "", list);
        } else if (exc instanceof HttpsOnlyPolicyViolationOnRedirectException) {
            HttpsOnlyPolicyViolationOnRedirectException httpsOnlyPolicyViolationOnRedirectException = (HttpsOnlyPolicyViolationOnRedirectException) exc;
            this.adQualityViolationReporter.reportAdTrackerViolation("SOMAAdViolationSSLBeaconHTTPRedirect", somaApiContext.getApiAdResponse().getResponseHeaders(), somaApiContext.getApiAdRequest().getPublisherId(), somaApiContext.getApiAdRequest().getAdSpaceId(), this.apiParams.getBundle(), this.apiParams.getClient(), httpsOnlyPolicyViolationOnRedirectException.violatedUrl, httpsOnlyPolicyViolationOnRedirectException.originalUrl, list);
        }
    }
}
