package com.bytedance.sdk.openadsdk.p130b.p131a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.a.c */
/* compiled from: EventStartListenerWrapper */
public class C3131c implements C3130b {

    /* renamed from: a */
    C3130b f7381a;

    /* renamed from: a */
    public void mo18670a(JSONObject jSONObject) throws JSONException {
        C3130b bVar = this.f7381a;
        if (bVar != null) {
            bVar.mo18670a(jSONObject);
        }
        jSONObject.put("event_ts", System.currentTimeMillis());
    }
}
