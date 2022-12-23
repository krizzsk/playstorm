package com.mbridge.msdk.foundation.tools;

import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.k */
/* compiled from: JsonUtils */
public final class C8582k {
    /* renamed from: a */
    public static ArrayList<String> m24788a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m24787a(int i, int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put("message", "Sucess");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rotateAngle", i);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("left", i2);
            jSONObject3.put("right", i3);
            jSONObject3.put("top", i4);
            jSONObject3.put(TJAdUnitConstants.String.BOTTOM, i5);
            jSONObject2.put("cutoutInfo", jSONObject3);
            jSONObject.put("data", jSONObject2);
        } catch (Exception e) {
            C8608u.m24884d("JSONUtils", e.getMessage());
        } catch (Throwable th) {
            C8608u.m24884d("JSONUtils", th.getMessage());
            try {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Fail");
            } catch (JSONException e2) {
                C8608u.m24884d("JSONUtils", e2.getMessage());
            }
        }
        return jSONObject.toString();
    }
}
