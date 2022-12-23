package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class MraidJSReadyCommand extends MraidCommand {
    static final String NAME = "jsready";

    static String getMraidName() {
        return NAME;
    }

    public String getName() {
        return NAME;
    }

    /* access modifiers changed from: package-private */
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.jsReady();
    }
}
