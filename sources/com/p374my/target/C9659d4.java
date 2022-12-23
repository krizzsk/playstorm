package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.d4 */
public final class C9659d4 {

    /* renamed from: a */
    public final boolean f23751a;

    /* renamed from: b */
    public final C9596a f23752b;

    /* renamed from: c */
    public final String f23753c;

    /* renamed from: d */
    public final Context f23754d;

    public C9659d4(C9596a aVar, String str, boolean z, Context context) {
        this.f23752b = aVar;
        this.f23753c = str;
        this.f23751a = z;
        this.f23754d = context;
    }

    /* renamed from: a */
    public static C9659d4 m27821a(C9596a aVar, String str, boolean z, Context context) {
        return new C9659d4(aVar, str, z, context);
    }

    /* renamed from: a */
    public C9879o2 mo63866a(C9879o2 o2Var, JSONObject jSONObject) {
        if (o2Var == null) {
            String optString = jSONObject.optString("customReferenceData", (String) null);
            if (optString != null && optString.length() > 256) {
                mo63867a("Bad value", "customReferenceData more then 256 symbols");
                optString = null;
            }
            o2Var = C9879o2.m28890a(jSONObject.optString("contentUrl", (String) null), optString);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        if (optJSONArray != null) {
            mo63868a(optJSONArray, o2Var);
        }
        return o2Var;
    }

    /* renamed from: a */
    public final void mo63867a(String str, String str2) {
        if (this.f23751a) {
            C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f23752b.getSlotId()).mo64577b(this.f23753c).mo64578b(this.f23754d);
        }
    }

    /* renamed from: a */
    public final void mo63868a(JSONArray jSONArray, C9879o2 o2Var) {
        C9896p2 p2Var;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                if (!optJSONObject.has("url")) {
                    mo63867a("Required field", "VerificationScriptResource has no url");
                } else {
                    String optString = optJSONObject.optString("url");
                    if (!optJSONObject.has("vendorKey") || !optJSONObject.has("params")) {
                        p2Var = C9896p2.m28955a(optString);
                    } else {
                        String optString2 = optJSONObject.optString("vendorKey");
                        String optString3 = optJSONObject.optString("params");
                        if (TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                            C9672e0.m27882a("VerificationScriptResource has empty param: vendorKey=" + optString2 + ", verificationParameters=" + optString3);
                        } else {
                            p2Var = C9896p2.m28956a(optString, optString2, optString3);
                        }
                    }
                    o2Var.f24430c.add(p2Var);
                }
            }
        }
    }
}
