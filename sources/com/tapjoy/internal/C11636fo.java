package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11676gi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.fo */
public class C11636fo extends C11644fs {

    /* renamed from: b */
    private static final String f28298b = C11636fo.class.getSimpleName();

    public C11636fo(String str, String str2) {
        super(str, str2, "ad");
    }

    /* renamed from: a */
    public final C11676gi.C11678a mo72502a(String str, JSONObject jSONObject) {
        return mo72514a(str, m33798a(jSONObject), m33799b(jSONObject));
    }

    /* renamed from: b */
    public final C11676gi.C11678a mo72503b(String str, JSONObject jSONObject) {
        return mo72517b(str, m33798a(jSONObject), m33799b(jSONObject));
    }

    /* renamed from: a */
    public static Map<String, Object> m33798a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                TapjoyLog.m33194d(f28298b, "Unable to getAdUnitDimensions. Invalid params: ".concat(String.valueOf(e)));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Map<String, Long> m33799b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject2.getLong(next)));
                }
            } catch (JSONException e) {
                TapjoyLog.m33194d(f28298b, "Unable to getAdUnitValues. Invalid params: ".concat(String.valueOf(e)));
            }
        }
        return hashMap;
    }
}
