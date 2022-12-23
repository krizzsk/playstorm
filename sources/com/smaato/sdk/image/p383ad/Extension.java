package com.smaato.sdk.image.p383ad;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.smaato.sdk.image.ad.Extension */
public class Extension {

    /* renamed from: OM */
    public static final String f27145OM = "OM";
    private ExtConfig mExtConfig;
    private String mName = "";
    private String mScript = "";

    public String getName() {
        return this.mName;
    }

    public String getScript() {
        return this.mScript;
    }

    public ExtConfig getExtConfig() {
        return this.mExtConfig;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setScript(String str) {
        this.mScript = str;
    }

    public void setExtConfig(JSONObject jSONObject) throws JSONException {
        ExtConfig extConfig = new ExtConfig();
        extConfig.setVendorKey(jSONObject.optString("vendorKey", ""));
        extConfig.setVerificationParam(jSONObject.optString("verification_parameters", ""));
        this.mExtConfig = extConfig;
    }
}
