package com.ogury.sdk.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.sdk.internal.g */
/* compiled from: MonitoringInfoJsonSerializer.kt */
public final class C10857g {

    /* renamed from: a */
    private C10849a f27086a;

    public C10857g(C10849a aVar) {
        C10865m.m32951b(aVar, "jsonObjectCreator");
        this.f27086a = aVar;
    }

    /* renamed from: a */
    public final String mo67926a(C10850b bVar) throws JSONException {
        C10865m.m32951b(bVar, "monitoringInfo");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : bVar.mo67914b()) {
            jSONObject.put((String) next.getKey(), (String) next.getValue());
        }
        String jSONObject2 = jSONObject.toString();
        C10865m.m32949a((Object) jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }
}
