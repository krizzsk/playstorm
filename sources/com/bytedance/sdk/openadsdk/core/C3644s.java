package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2963e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.s */
/* compiled from: SecSdkHelperUtil */
public class C3644s {
    /* renamed from: a */
    public static void m11587a(String str) {
        if (!TextUtils.isEmpty(str) && C3578m.m11241h().mo19916C()) {
            C3641r.m11577a().mo20213a(str);
        }
    }

    /* renamed from: a */
    public static String m11585a() {
        if (C3578m.m11241h().mo19916C()) {
            return C3641r.m11577a().mo20214b();
        }
        return null;
    }

    /* renamed from: b */
    public static void m11589b() {
        if (C3578m.m11241h().mo19916C()) {
            C3641r.m11577a().mo20215b("AdShow");
        }
    }

    /* renamed from: a */
    public static Map<String, String> m11586a(String str, String str2) {
        if (!C3578m.m11241h().mo19916C()) {
            return new HashMap();
        }
        return C3641r.m11577a().mo20212a(str, str2 != null ? str2.getBytes() : new byte[0]);
    }

    /* renamed from: a */
    public static void m11588a(JSONObject jSONObject) {
        if (jSONObject != null && C3578m.m11241h().mo19916C()) {
            try {
                jSONObject.put("sec_did", C3641r.m11577a().mo20216c());
                String a = C2963e.m8350a(jSONObject.toString());
                Map<String, String> a2 = C3641r.m11577a().mo20212a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", a != null ? a.getBytes() : new byte[0]);
                if (a2 != null && a2.size() > 0) {
                    for (String next : a2.keySet()) {
                        jSONObject.put(next, a2.get(next));
                    }
                    jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                    jSONObject.put("pangle_m", a);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
