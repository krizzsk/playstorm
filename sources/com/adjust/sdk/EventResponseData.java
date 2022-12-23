package com.adjust.sdk;

import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

public class EventResponseData extends ResponseData {
    private String callbackId;
    private String eventToken;
    private String sdkPlatform;

    public EventResponseData(ActivityPackage activityPackage) {
        this.eventToken = activityPackage.getParameters().get("event_token");
        this.callbackId = activityPackage.getParameters().get("event_callback_id");
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustEventSuccess getSuccessResponseData() {
        if (!this.success) {
            return null;
        }
        AdjustEventSuccess adjustEventSuccess = new AdjustEventSuccess();
        if (TapjoyConstants.TJC_PLUGIN_UNITY.equals(this.sdkPlatform)) {
            String str = this.eventToken;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            adjustEventSuccess.eventToken = str;
            adjustEventSuccess.message = this.message != null ? this.message : str2;
            adjustEventSuccess.timestamp = this.timestamp != null ? this.timestamp : str2;
            adjustEventSuccess.adid = this.adid != null ? this.adid : str2;
            String str3 = this.callbackId;
            if (str3 != null) {
                str2 = str3;
            }
            adjustEventSuccess.callbackId = str2;
            adjustEventSuccess.jsonResponse = this.jsonResponse != null ? this.jsonResponse : new JSONObject();
        } else {
            adjustEventSuccess.eventToken = this.eventToken;
            adjustEventSuccess.message = this.message;
            adjustEventSuccess.timestamp = this.timestamp;
            adjustEventSuccess.adid = this.adid;
            adjustEventSuccess.callbackId = this.callbackId;
            adjustEventSuccess.jsonResponse = this.jsonResponse;
        }
        return adjustEventSuccess;
    }

    public AdjustEventFailure getFailureResponseData() {
        if (this.success) {
            return null;
        }
        AdjustEventFailure adjustEventFailure = new AdjustEventFailure();
        if (TapjoyConstants.TJC_PLUGIN_UNITY.equals(this.sdkPlatform)) {
            String str = this.eventToken;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            adjustEventFailure.eventToken = str;
            adjustEventFailure.message = this.message != null ? this.message : str2;
            adjustEventFailure.timestamp = this.timestamp != null ? this.timestamp : str2;
            adjustEventFailure.adid = this.adid != null ? this.adid : str2;
            String str3 = this.callbackId;
            if (str3 != null) {
                str2 = str3;
            }
            adjustEventFailure.callbackId = str2;
            adjustEventFailure.willRetry = this.willRetry;
            adjustEventFailure.jsonResponse = this.jsonResponse != null ? this.jsonResponse : new JSONObject();
        } else {
            adjustEventFailure.eventToken = this.eventToken;
            adjustEventFailure.message = this.message;
            adjustEventFailure.timestamp = this.timestamp;
            adjustEventFailure.adid = this.adid;
            adjustEventFailure.callbackId = this.callbackId;
            adjustEventFailure.willRetry = this.willRetry;
            adjustEventFailure.jsonResponse = this.jsonResponse;
        }
        return adjustEventFailure;
    }
}
