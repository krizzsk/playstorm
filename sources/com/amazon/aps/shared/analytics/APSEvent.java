package com.amazon.aps.shared.analytics;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.smaato.sdk.core.SmaatoSdk;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

public class APSEvent implements Serializable {
    public static final int EXCEPTION_LOG_SIZE = 2048;
    String configVersion = "";
    String deviceManufacturer = "";
    String deviceModel = "";
    String errorDetails = "";
    String eventType;
    String exceptionLog = "";
    String osName = "";
    int osVersion;
    String pkgName = "";
    String sdkVersion;
    APSEventSeverity severity;
    long timestamp;

    public APSEvent build() {
        return this;
    }

    public APSEvent(Context context, APSEventSeverity aPSEventSeverity, String str) {
        String str2;
        try {
            this.sdkVersion = "1.0";
            this.osName = APSAnalytics.OS_NAME;
            this.osVersion = Build.VERSION.SDK_INT;
            this.deviceManufacturer = Build.MANUFACTURER;
            this.deviceModel = Build.MODEL;
            this.timestamp = System.currentTimeMillis();
            if (context == null) {
                str2 = "unknown";
            } else {
                str2 = context.getPackageName();
            }
            this.pkgName = str2;
            setEventSeverity(aPSEventSeverity);
            setEventType(str);
        } catch (RuntimeException e) {
            Log.e("APSEvent", "Error constructing the APSEvent:", e);
        }
    }

    public APSEvent setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public APSEvent setEventSeverity(APSEventSeverity aPSEventSeverity) {
        this.severity = aPSEventSeverity;
        return this;
    }

    public APSEvent setExceptionDetails(Exception exc) {
        if (exc != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                if (stringWriter2.length() > 2048) {
                    int length = ((2048 - exc.getMessage().length()) - 6) / 2;
                    String substring = stringWriter2.substring(0, length);
                    String substring2 = stringWriter2.substring(stringWriter2.length() - length);
                    this.exceptionLog = exc.getMessage() + APSSharedUtil.TRUNCATE_SEPARATOR + substring + APSSharedUtil.TRUNCATE_SEPARATOR + substring2;
                } else {
                    this.exceptionLog = exc.getMessage() + "\n" + stringWriter2;
                }
            } catch (RuntimeException e) {
                Log.e("APSEvent", "Error in parsing the exception detail; ", e);
            }
        }
        return this;
    }

    public APSEvent setExceptionDetails(String str) {
        int i = 2048;
        if (2048 > str.length()) {
            i = str.length();
        }
        if (str != null) {
            this.exceptionLog = str.substring(0, i);
        }
        return this;
    }

    public APSEvent setErrorDetails(String str) {
        if (str != null) {
            int length = str.length();
            if (length > 2048) {
                length = 2048;
            }
            this.errorDetails = str.substring(0, length);
        }
        return this;
    }

    public APSEvent setConfigVersion(String str) {
        this.configVersion = str;
        return this;
    }

    public APSEvent setTimestamp(long j) {
        this.timestamp = j;
        return this;
    }

    public APSEventSeverity getEventSeverity() {
        return this.severity;
    }

    public String getExceptionDetails() {
        return this.exceptionLog;
    }

    public String getEventType() {
        return this.eventType;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isValidEvent() {
        return this.eventType != null;
    }

    public String toJsonPayload() {
        String str = "";
        String format = String.format("msg = %s;", new Object[]{this.errorDetails});
        String additionalDetails = APSAnalytics.getAdditionalDetails();
        if (!APSSharedUtil.isNullOrEmpty(additionalDetails)) {
            format = format.concat(additionalDetails);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SmaatoSdk.KEY_SDK_VERSION, this.sdkVersion);
            jSONObject.put("eventType", this.eventType);
            jSONObject.put("eventTimestamp", this.timestamp);
            jSONObject.put(SDKConstants.PARAM_DEBUG_MESSAGE_SEVERITY, this.severity.name());
            jSONObject.put("appId", this.pkgName);
            jSONObject.put("osName", this.osName);
            jSONObject.put("osVersion", this.osVersion);
            jSONObject.put("deviceManufacturer", this.deviceManufacturer);
            jSONObject.put("deviceModel", this.deviceModel);
            jSONObject.put("configVersion", this.configVersion);
            jSONObject.put("otherDetails", format);
            jSONObject.put("exceptionDetails", this.exceptionLog);
            str = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace("\n", str);
        } catch (RuntimeException | JSONException e) {
            Log.e("APSEvent", "Error in parsing the json .. ignoring : ", e);
        }
        return "{\"Data\": \"" + str + "\",\"PartitionKey\": \"" + this.timestamp + "\"}";
    }
}
