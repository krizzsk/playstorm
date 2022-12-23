package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class MraidOpenCommand extends MraidCommand {
    static final String NAME = "open";

    static String getMraidName() {
        return "open";
    }

    public String getName() {
        return "open";
    }

    /* access modifiers changed from: package-private */
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.openUrl(jSONObject.getString("url"));
    }
}
