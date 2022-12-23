package com.adjust.sdk;

import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

public class SessionResponseData extends ResponseData {
    private String sdkPlatform;

    public SessionResponseData(ActivityPackage activityPackage) {
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustSessionSuccess getSuccessResponseData() {
        if (!this.success) {
            return null;
        }
        AdjustSessionSuccess adjustSessionSuccess = new AdjustSessionSuccess();
        if (TapjoyConstants.TJC_PLUGIN_UNITY.equals(this.sdkPlatform)) {
            String str = "";
            adjustSessionSuccess.message = this.message != null ? this.message : str;
            adjustSessionSuccess.timestamp = this.timestamp != null ? this.timestamp : str;
            if (this.adid != null) {
                str = this.adid;
            }
            adjustSessionSuccess.adid = str;
            adjustSessionSuccess.jsonResponse = this.jsonResponse != null ? this.jsonResponse : new JSONObject();
        } else {
            adjustSessionSuccess.message = this.message;
            adjustSessionSuccess.timestamp = this.timestamp;
            adjustSessionSuccess.adid = this.adid;
            adjustSessionSuccess.jsonResponse = this.jsonResponse;
        }
        return adjustSessionSuccess;
    }

    public AdjustSessionFailure getFailureResponseData() {
        if (this.success) {
            return null;
        }
        AdjustSessionFailure adjustSessionFailure = new AdjustSessionFailure();
        if (TapjoyConstants.TJC_PLUGIN_UNITY.equals(this.sdkPlatform)) {
            String str = "";
            adjustSessionFailure.message = this.message != null ? this.message : str;
            adjustSessionFailure.timestamp = this.timestamp != null ? this.timestamp : str;
            if (this.adid != null) {
                str = this.adid;
            }
            adjustSessionFailure.adid = str;
            adjustSessionFailure.willRetry = this.willRetry;
            adjustSessionFailure.jsonResponse = this.jsonResponse != null ? this.jsonResponse : new JSONObject();
        } else {
            adjustSessionFailure.message = this.message;
            adjustSessionFailure.timestamp = this.timestamp;
            adjustSessionFailure.adid = this.adid;
            adjustSessionFailure.willRetry = this.willRetry;
            adjustSessionFailure.jsonResponse = this.jsonResponse;
        }
        return adjustSessionFailure;
    }
}
