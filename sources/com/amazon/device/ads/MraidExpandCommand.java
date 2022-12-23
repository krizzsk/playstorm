package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class MraidExpandCommand extends MraidCommand {
    static final String NAME = "expand";

    static String getMraidName() {
        return "expand";
    }

    public String getName() {
        return "expand";
    }

    /* access modifiers changed from: package-private */
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.expand(SDKUtilities.convertJSONObjectToMap(jSONObject));
    }
}
