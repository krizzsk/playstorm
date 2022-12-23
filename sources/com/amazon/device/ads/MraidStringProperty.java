package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MraidProperty */
class MraidStringProperty extends MraidProperty {
    String value;

    MraidStringProperty(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    public String getValue() {
        return this.value;
    }

    /* access modifiers changed from: package-private */
    public void formJSON(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.name, getValue());
    }
}
