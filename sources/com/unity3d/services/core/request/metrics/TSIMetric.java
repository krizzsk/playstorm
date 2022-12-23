package com.unity3d.services.core.request.metrics;

import java.util.Map;

public class TSIMetric {
    private static final String TSI_METRIC_COLLECTION_LATENCY = "native_device_info_collection_latency";
    private static final String TSI_METRIC_COMPRESSION_LATENCY = "native_device_info_compression_latency";
    private static final String TSI_METRIC_EMERGENCY_OFF = "native_emergency_switch_off";
    private static final String TSI_METRIC_INIT_STARTED = "native_initialization_started";
    private static final String TSI_METRIC_INIT_TIME_FAILURE = "native_initialization_time_failure";
    private static final String TSI_METRIC_INIT_TIME_SUCCESS = "native_initialization_time_success";
    private static final String TSI_METRIC_MISSING_GAME_SESSION_ID = "native_missing_game_session_id";
    private static final String TSI_METRIC_MISSING_STATE_ID = "native_missing_state_id";
    private static final String TSI_METRIC_MISSING_TOKEN = "native_missing_token";
    private static final String TSI_METRIC_TOKEN_ASYNC_NULL = "native_async_token_null";
    private static final String TSI_METRIC_TOKEN_AVAILABLE = "native_generated_token_available";
    private static final String TSI_METRIC_TOKEN_CONFIG = "native_token_availability_latency_config";
    private static final String TSI_METRIC_TOKEN_NULL = "native_generated_token_null";
    private static final String TSI_METRIC_TOKEN_RESOLUTION = "native_token_resolution_request_latency";
    private static final String TSI_METRIC_TOKEN_WEBVIEW = "native_token_availability_latency_webview";

    public static Metric newMissingToken(Map<String, String> map) {
        return new Metric(TSI_METRIC_MISSING_TOKEN, (Object) null, map);
    }

    public static Metric newMissingStateId(Map<String, String> map) {
        return new Metric(TSI_METRIC_MISSING_STATE_ID, (Object) null, map);
    }

    public static Metric newMissingGameSessionId(Map<String, String> map) {
        return new Metric(TSI_METRIC_MISSING_GAME_SESSION_ID, (Object) null, map);
    }

    public static Metric newInitTimeSuccess(Long l, Map<String, String> map) {
        return new Metric(TSI_METRIC_INIT_TIME_SUCCESS, l, map);
    }

    public static Metric newInitTimeFailure(Long l, Map<String, String> map) {
        return new Metric(TSI_METRIC_INIT_TIME_FAILURE, l, map);
    }

    public static Metric newInitStarted(Map<String, String> map) {
        return new Metric(TSI_METRIC_INIT_STARTED, (Object) null, map);
    }

    public static Metric newTokenAvailabilityLatencyConfig(Long l, Map<String, String> map) {
        return new Metric(TSI_METRIC_TOKEN_CONFIG, l, map);
    }

    public static Metric newTokenAvailabilityLatencyWebview(Long l, Map<String, String> map) {
        return new Metric(TSI_METRIC_TOKEN_WEBVIEW, l, map);
    }

    public static Metric newTokenResolutionRequestLatency(Long l, Map<String, String> map) {
        return new Metric(TSI_METRIC_TOKEN_RESOLUTION, l, map);
    }

    public static Metric newEmergencySwitchOff(Map<String, String> map) {
        return new Metric(TSI_METRIC_EMERGENCY_OFF, (Object) null, map);
    }

    public static Metric newDeviceInfoCollectionLatency(Long l, Map<String, String> map) {
        return new Metric(TSI_METRIC_COLLECTION_LATENCY, l, map);
    }

    public static Metric newDeviceInfoCompressionLatency(Long l, Map<String, String> map) {
        return new Metric(TSI_METRIC_COMPRESSION_LATENCY, l, map);
    }

    public static Metric newNativeGeneratedTokenAvailable(Map<String, String> map) {
        return new Metric(TSI_METRIC_TOKEN_AVAILABLE, (Object) null, map);
    }

    public static Metric newNativeGeneratedTokenNull(Map<String, String> map) {
        return new Metric(TSI_METRIC_TOKEN_NULL, (Object) null, map);
    }

    public static Metric newAsyncTokenNull(Map<String, String> map) {
        return new Metric(TSI_METRIC_TOKEN_ASYNC_NULL, (Object) null, map);
    }
}
