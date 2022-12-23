package com.unity3d.services.core.request.metrics;

import java.util.Map;

public interface ISDKMetricSender {
    void sendSDKMetricEvent(SDKMetricEvents sDKMetricEvents);

    void sendSDKMetricEventWithTag(SDKMetricEvents sDKMetricEvents, Map<String, String> map);
}
