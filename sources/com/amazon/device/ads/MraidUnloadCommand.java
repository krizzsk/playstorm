package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class MraidUnloadCommand extends MraidCommand {
    static final String NAME = "unload";

    static String getMraidName() {
        return "unload";
    }

    public String getName() {
        return "unload";
    }

    /* access modifiers changed from: package-private */
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.onMRAIDUnload();
    }
}
