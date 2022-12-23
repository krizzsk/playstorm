package com.p374my.target;

import android.graphics.Color;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.target.y3 */
public class C10046y3 {
    /* renamed from: a */
    public static int m29764a(JSONObject jSONObject, String str, int i) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString)) {
            return i;
        }
        try {
            return Color.parseColor(optString);
        } catch (Throwable unused) {
            C9672e0.m27883b("error parsing color " + optString);
            return i;
        }
    }
}
