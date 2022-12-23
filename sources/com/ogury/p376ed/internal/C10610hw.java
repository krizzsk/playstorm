package com.ogury.p376ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.hw */
public final class C10610hw {

    /* renamed from: a */
    public static final C10610hw f26779a = new C10610hw();

    private C10610hw() {
    }

    /* renamed from: a */
    public static C10608hv m32322a(String str) {
        C10765mq.m32773b(str, "zoneJson");
        try {
            return m32323a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C10608hv m32323a(JSONObject jSONObject) {
        C10765mq.m32773b(jSONObject, "zoneJson");
        C10608hv hvVar = new C10608hv();
        String optString = jSONObject.optString("url", "");
        C10765mq.m32770a((Object) optString, "zoneJson.optString(\"url\", \"\")");
        hvVar.mo67579a(optString);
        String optString2 = jSONObject.optString("content", "");
        C10765mq.m32770a((Object) optString2, "zoneJson.optString(\"content\", \"\")");
        hvVar.mo67583b(optString2);
        String optString3 = jSONObject.optString("webViewId", jSONObject.optString("id", ""));
        C10765mq.m32770a((Object) optString3, "zoneJson.optString(\"webViewId\", id)");
        hvVar.mo67587c(optString3);
        JSONObject optJSONObject = jSONObject.optJSONObject("size");
        int i = -1;
        hvVar.mo67582b(optJSONObject == null ? -1 : optJSONObject.optInt("width", -1));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("size");
        hvVar.mo67578a(optJSONObject2 == null ? -1 : optJSONObject2.optInt("height", -1));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("position");
        hvVar.mo67590d(optJSONObject3 == null ? -1 : optJSONObject3.optInt("x", -1));
        JSONObject optJSONObject4 = jSONObject.optJSONObject("position");
        if (optJSONObject4 != null) {
            i = optJSONObject4.optInt("y", -1);
        }
        hvVar.mo67586c(i);
        hvVar.mo67580a(jSONObject.optBoolean("enableTracking", false));
        hvVar.mo67584b(jSONObject.optBoolean("keepAlive", false));
        hvVar.mo67588c(jSONObject.optBoolean("isLandingPage", false));
        return hvVar;
    }
}
