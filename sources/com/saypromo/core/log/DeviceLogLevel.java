package com.saypromo.core.log;

public class DeviceLogLevel {
    private static final String LOG_TAG = "SayPromoAds";
    private String _receivingMethodName = null;

    public String getLogTag() {
        return LOG_TAG;
    }

    public DeviceLogLevel(String str) {
        this._receivingMethodName = str;
    }

    public String getReceivingMethodName() {
        return this._receivingMethodName;
    }
}
