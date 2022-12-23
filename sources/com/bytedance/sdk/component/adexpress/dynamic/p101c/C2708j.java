package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import com.tapjoy.TJAdUnitConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.j */
/* compiled from: DynamicParserUtils */
public class C2708j {

    /* renamed from: a */
    private static final JSONObject f5951a = C2696c.m7294a().mo17189b();

    /* renamed from: a */
    public static void m7344a(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2 = f5951a;
        if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject(str)) != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
            if (optJSONObject2 != null) {
                m7345a(optJSONObject2, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m7341a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject optJSONObject;
        JSONObject jSONObject3 = f5951a;
        if (jSONObject3 == null || (optJSONObject = jSONObject3.optJSONObject(str)) == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return m7343a(jSONObject2, optJSONObject.optJSONObject("themeValues"), jSONObject);
    }

    /* renamed from: a */
    private static void m7345a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m7343a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m7340a(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject jSONObject = f5951a;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null || (optJSONObject2 = optJSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES)) == null) {
            return null;
        }
        return optJSONObject2.optString("data");
    }

    /* renamed from: a */
    public static JSONObject m7342a(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
    }
}
