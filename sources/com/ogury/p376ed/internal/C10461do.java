package com.ogury.p376ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.do */
public final class C10461do {
    /* renamed from: a */
    public static void m31640a(JSONObject jSONObject) throws C10499eq {
        C10765mq.m32773b(jSONObject, "rootJsonResponse");
        if (jSONObject.has("error")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            C10499eq eqVar = new C10499eq();
            String optString = jSONObject2.optString("type", "");
            C10765mq.m32770a((Object) optString, "error.optString(\"type\", \"\")");
            eqVar.mo67311a(optString);
            String optString2 = jSONObject2.optString("message", "");
            C10765mq.m32770a((Object) optString2, "error.optString(\"message\", \"\")");
            eqVar.mo67312b(optString2);
            throw eqVar;
        }
    }
}
