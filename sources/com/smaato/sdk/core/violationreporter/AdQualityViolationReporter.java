package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.util.Objects;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class AdQualityViolationReporter {
    private final AdQualityViolationReportMapper adQualityViolationReportMapper;
    private final Logger logger;
    private final String reportingApiUrl;
    private final SimpleHttpClient simpleHttpClient;

    public AdQualityViolationReporter(Logger logger2, SimpleHttpClient simpleHttpClient2, AdQualityViolationReportMapper adQualityViolationReportMapper2, String str) {
        this.logger = logger2;
        this.simpleHttpClient = simpleHttpClient2;
        this.adQualityViolationReportMapper = (AdQualityViolationReportMapper) Objects.requireNonNull(adQualityViolationReportMapper2);
        this.reportingApiUrl = (String) Objects.requireNonNull(str);
    }

    public void reportRichMediaAdViolation(String str, Map<String, List<String>> map, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        send(this.adQualityViolationReportMapper.mapToReport(str, map, str2, str3, str4, str5, str6 == null ? "" : str6, "", "", "", str7, list, System.currentTimeMillis()));
    }

    public void reportImageLoadingAdViolation(ImageAdLoadingViolationException imageAdLoadingViolationException) {
        ImageAdLoadingViolationException imageAdLoadingViolationException2 = imageAdLoadingViolationException;
        try {
            AdQualityViolationReportMapper adQualityViolationReportMapper2 = this.adQualityViolationReportMapper;
            String str = imageAdLoadingViolationException2.adQualityViolationType;
            Map<String, List<String>> map = imageAdLoadingViolationException2.responseHeaders;
            String str2 = imageAdLoadingViolationException2.publisherId;
            String str3 = imageAdLoadingViolationException2.adSpaceId;
            String str4 = imageAdLoadingViolationException2.bundle;
            String str5 = imageAdLoadingViolationException2.client;
            String str6 = imageAdLoadingViolationException2.violatedUrl;
            String str7 = imageAdLoadingViolationException2.originalUrl;
            send(adQualityViolationReportMapper2.mapToReport(str, map, str2, str3, str4, str5, str6, str7, str7.equals(str6) ? "" : imageAdLoadingViolationException2.violatedUrl, imageAdLoadingViolationException2.clickUrl, "", imageAdLoadingViolationException2.clickTrackingUrls, System.currentTimeMillis()));
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, "failed to create ad quality violation report for image ad", e);
        }
    }

    public void reportAdTrackerViolation(String str, Map<String, List<String>> map, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        try {
            send(this.adQualityViolationReportMapper.mapToReport(str, map, str2, str3, str4, str5, str6, str7, !str7.isEmpty() ? "" : str6, "", "", list, System.currentTimeMillis()));
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, "failed to create ad quality violation report", e);
        }
    }

    private void send(Report report) {
        try {
            String jSONObject = report.toJson().toString();
            this.logger.debug(LogDomain.CORE, "going to send: %s", jSONObject);
            this.simpleHttpClient.sendDataAndForget(this.reportingApiUrl, jSONObject);
        } catch (JSONException e) {
            this.logger.error(LogDomain.CORE, e, "Error while sending violation report", new Object[0]);
        }
    }
}
