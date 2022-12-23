package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MraidProperty */
class MraidDictionaryProperty extends MraidProperty {
    JSONObject data = new JSONObject();

    MraidDictionaryProperty(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    public void formJSON(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.name, this.data);
    }

    /* access modifiers changed from: package-private */
    public JSONObject getData() {
        return this.data;
    }
}
