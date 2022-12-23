package com.unity3d.services.core.request.metrics;

import java.util.Map;

public class SDKMetricSender implements ISDKMetricSender {
    public void sendSDKMetricEvent(SDKMetricEvents sDKMetricEvents) {
        ISDKMetrics instance;
        if (sDKMetricEvents != null && (instance = SDKMetrics.getInstance()) != null) {
            instance.sendEvent(sDKMetricEvents.toString());
        }
    }

    public void sendSDKMetricEventWithTag(SDKMetricEvents sDKMetricEvents, Map<String, String> map) {
        ISDKMetrics instance;
        if (sDKMetricEvents != null && (instance = SDKMetrics.getInstance()) != null) {
            instance.sendEvent(sDKMetricEvents.toString(), map);
        }
    }
}
