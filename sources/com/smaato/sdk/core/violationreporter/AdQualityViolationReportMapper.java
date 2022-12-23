package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.violationreporter.Report;
import java.util.List;
import java.util.Map;

final class AdQualityViolationReportMapper {
    private final HeaderUtils headerUtils;
    private final Logger logger;

    AdQualityViolationReportMapper(Logger logger2, HeaderUtils headerUtils2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.headerUtils = (HeaderUtils) Objects.requireNonNull(headerUtils2);
    }

    /* access modifiers changed from: package-private */
    public Report mapToReport(String str, Map<String, List<String>> map, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list, long j) {
        Map<String, List<String>> map2 = map;
        String extractHeaderMultiValue = this.headerUtils.extractHeaderMultiValue(map, "X-SMT-SessionId");
        if (extractHeaderMultiValue == null) {
            this.logger.warning(LogDomain.CORE, "header %s is not found in SOMA response", "X-SMT-SessionId");
            extractHeaderMultiValue = randomiseSessionIdWhenNull();
        }
        String extractHeaderMultiValue2 = this.headerUtils.extractHeaderMultiValue(map, "SCI");
        if (extractHeaderMultiValue2 == null) {
            this.logger.warning(LogDomain.CORE, "header %s is not found in SOMA response", "SCI");
        }
        String str11 = str;
        Report.Builder timestamp = Report.builder().setType(str).setSessionId(extractHeaderMultiValue).setOriginalUrl(str7).setViolatedUrl(str6).setTimestamp(String.valueOf(j));
        if (extractHeaderMultiValue2 == null) {
            extractHeaderMultiValue2 = "";
        }
        Report.Builder sci = timestamp.setSci(extractHeaderMultiValue2);
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        return sci.setPublisher(str2).setAdSpace(str3).setApiVersion("").setBundleId(str4).setRedirectUrl(str8).setClickUrl(str9).setAdMarkup(str10).setTraceUrls(list).setError("").setPlatform("android").setSdkVersion(str5).setApiKey("").setCreativeId("").setAsnId("0").build();
    }

    private String randomiseSessionIdWhenNull() {
        return "invldssid_" + ((int) ((Math.random() * 90000.0d) + 10000.0d)) + "_" + ((int) ((Math.random() * 90.0d) + 10.0d)) + "_" + ((int) ((Math.random() * 9000.0d) + 1000.0d)) + "_" + ((int) ((Math.random() * 9000.0d) + 1000.0d)) + "_" + ((int) ((Math.random() * 9000000.0d) + 1000000.0d));
    }
}
