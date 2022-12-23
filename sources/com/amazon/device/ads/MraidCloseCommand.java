package com.amazon.device.ads;

import org.json.JSONObject;

public class MraidCloseCommand extends MraidCommand {
    static final String NAME = "close";

    static String getMraidName() {
        return "close";
    }

    public String getName() {
        return "close";
    }

    /* access modifiers changed from: package-private */
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) {
        dTBAdMRAIDController.onMRAIDClose();
    }
}
