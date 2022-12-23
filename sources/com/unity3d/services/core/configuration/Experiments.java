package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Experiments {
    private static final String TSI_TAG_DEVELOPER_CONSENT = "tsi_dc";
    private static final String TSI_TAG_FORWARD_FEATURE_FLAGS = "fff";
    private static final String TSI_TAG_INIT_ENABLED = "tsi";
    private static final String TSI_TAG_INIT_POST = "tsi_p";
    private static final String TSI_TAG_NATIVE_TOKEN = "tsi_nt";
    private static final String TSI_TAG_UPDATE_PII_FIELDS = "tsi_upii";
    private final JSONObject _experimentData;

    public Experiments() {
        this((JSONObject) null);
    }

    public Experiments(JSONObject jSONObject) {
        if (jSONObject == null) {
            this._experimentData = new JSONObject();
        } else {
            this._experimentData = jSONObject;
        }
    }

    public void setTwoStageInitializationEnabled(boolean z) {
        try {
            this._experimentData.put(TSI_TAG_INIT_ENABLED, z);
        } catch (JSONException unused) {
            DeviceLog.warning("Could not set TSI flag to " + z);
        }
    }

    public boolean isTwoStageInitializationEnabled() {
        return this._experimentData.optBoolean(TSI_TAG_INIT_ENABLED, false);
    }

    public boolean isPOSTMethodInConfigRequestEnabled() {
        return this._experimentData.optBoolean(TSI_TAG_INIT_POST, false);
    }

    public boolean isForwardExperimentsToWebViewEnabled() {
        return this._experimentData.optBoolean(TSI_TAG_FORWARD_FEATURE_FLAGS, false);
    }

    public boolean isNativeTokenEnabled() {
        return this._experimentData.optBoolean(TSI_TAG_NATIVE_TOKEN, false);
    }

    public boolean isUpdatePiiFields() {
        return this._experimentData.optBoolean(TSI_TAG_UPDATE_PII_FIELDS, false);
    }

    public boolean isHandleDeveloperConsent() {
        return this._experimentData.optBoolean(TSI_TAG_DEVELOPER_CONSENT, false);
    }

    public JSONObject getExperimentData() {
        return this._experimentData;
    }

    public Map<String, String> getExperimentTags() {
        HashMap hashMap = new HashMap();
        hashMap.put(TSI_TAG_INIT_ENABLED, String.valueOf(isTwoStageInitializationEnabled()));
        hashMap.put(TSI_TAG_INIT_POST, String.valueOf(isPOSTMethodInConfigRequestEnabled()));
        hashMap.put(TSI_TAG_FORWARD_FEATURE_FLAGS, String.valueOf(isForwardExperimentsToWebViewEnabled()));
        hashMap.put(TSI_TAG_UPDATE_PII_FIELDS, String.valueOf(isUpdatePiiFields()));
        hashMap.put(TSI_TAG_DEVELOPER_CONSENT, String.valueOf(isHandleDeveloperConsent()));
        hashMap.put(TSI_TAG_NATIVE_TOKEN, String.valueOf(isNativeTokenEnabled()));
        return hashMap;
    }
}
