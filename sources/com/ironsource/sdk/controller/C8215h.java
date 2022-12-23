package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C8252x;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.h */
final class C8215h {

    /* renamed from: c */
    private static final String f19641c = C8215h.class.getCanonicalName();

    /* renamed from: a */
    private final C8190d f19642a;

    /* renamed from: b */
    private final C8245t f19643b;

    C8215h(C8190d dVar, C8245t tVar) {
        this.f19642a = dVar;
        this.f19643b = tVar;
    }

    /* renamed from: a */
    private static String m23582a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f19641c;
            Logger.m24028i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f19643b.mo56595a(str, str2, str3)) {
                this.f19642a.mo56510a(str, str2);
                return;
            }
            C8190d dVar = this.f19642a;
            String a = m23582a(str, str2, str3);
            if (dVar.f19554a != null) {
                C8252x.C8275d dVar2 = dVar.f19554a;
                C8252x.this.mo56622b(C8252x.m23687a("unauthorizedMessage", a, (String) null, (String) null));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str5 = f19641c;
            Logger.m24028i(str5, "messageHandler failed with exception " + e.getMessage());
        }
    }
}
