package com.iab.omid.library.smaato.p277d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.smaato.p275b.C8044c;
import com.iab.omid.library.smaato.walking.C8071a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.d.b */
public class C8056b {

    /* renamed from: a */
    static float f19165a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f19166b;

    /* renamed from: c */
    private static String[] f19167c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.smaato.d.b$a */
    private static class C8057a {

        /* renamed from: a */
        final float f19168a;

        /* renamed from: b */
        final float f19169b;

        C8057a(float f, float f2) {
            this.f19168a = f;
            this.f19169b = f2;
        }
    }

    /* renamed from: a */
    static float m23052a(int i) {
        return ((float) i) / f19165a;
    }

    /* renamed from: a */
    public static JSONObject m23053a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m23052a(i));
            jSONObject.put("y", (double) m23052a(i2));
            jSONObject.put("width", (double) m23052a(i3));
            jSONObject.put("height", (double) m23052a(i4));
        } catch (JSONException e) {
            C8058c.m23069a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m23054a(Context context) {
        if (context != null) {
            f19165a = context.getResources().getDisplayMetrics().density;
            f19166b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m23055a(JSONObject jSONObject) {
        C8057a b = m23061b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f19168a);
            jSONObject.put("height", (double) b.f19169b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m23056a(JSONObject jSONObject, C8071a.C8072a aVar) {
        C8044c a = aVar.mo56087a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo56089b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo56008b());
            jSONObject.put("friendlyObstructionPurpose", a.mo56009c());
            jSONObject.put("friendlyObstructionReason", a.mo56010d());
        } catch (JSONException e) {
            C8058c.m23069a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m23057a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C8058c.m23069a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m23058a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C8058c.m23069a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m23059a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m23060a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C8057a m23061b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new C8057a(f2, f);
            }
        } else if (f19166b != null) {
            Point point = new Point(0, 0);
            f19166b.getDefaultDisplay().getRealSize(point);
            f2 = m23052a(point.x);
            f = m23052a(point.y);
            return new C8057a(f2, f);
        }
        f = 0.0f;
        return new C8057a(f2, f);
    }

    /* renamed from: b */
    public static void m23062b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C8058c.m23069a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m23063b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m23064c(jSONObject, jSONObject2) && m23065d(jSONObject, jSONObject2) && m23066e(jSONObject, jSONObject2) && m23067f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m23064c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f19167c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m23065d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m23066e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m23060a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m23067f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m23060a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m23063b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
