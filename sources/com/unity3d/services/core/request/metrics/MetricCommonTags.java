package com.unity3d.services.core.request.metrics;

import java.util.HashMap;
import java.util.Map;

public class MetricCommonTags {
    private static final String METRIC_COMMON_TAG_COUNTRY_ISO = "iso";
    private static final String METRIC_COMMON_TAG_PLATFORM = "plt";
    public static final String METRIC_COMMON_TAG_PLATFORM_ANDROID = "android";
    private static final String METRIC_COMMON_TAG_SDK_VERSION = "sdk";
    private static final String METRIC_COMMON_TAG_SYSTEM_VERSION = "system";
    private String _countryISO;
    private String _platform;
    private String _sdkVersion;
    private String _systemVersion;

    public MetricCommonTags(String str, String str2, String str3, String str4) {
        this._countryISO = str;
        this._platform = str2;
        this._sdkVersion = str3;
        this._systemVersion = str4;
    }

    public Map<String, String> asMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(METRIC_COMMON_TAG_COUNTRY_ISO, this._countryISO);
        hashMap.put(METRIC_COMMON_TAG_PLATFORM, this._platform);
        hashMap.put("sdk", this._sdkVersion);
        hashMap.put(METRIC_COMMON_TAG_SYSTEM_VERSION, this._systemVersion);
        return hashMap;
    }
}
