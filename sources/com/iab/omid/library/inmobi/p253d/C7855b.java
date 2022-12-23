package com.iab.omid.library.inmobi.p253d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.inmobi.p251b.C7843c;
import com.iab.omid.library.inmobi.walking.C7870a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.d.b */
public class C7855b {

    /* renamed from: a */
    static float f18700a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18701b;

    /* renamed from: c */
    private static String[] f18702c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.inmobi.d.b$a */
    private static class C7856a {

        /* renamed from: a */
        final float f18703a;

        /* renamed from: b */
        final float f18704b;

        C7856a(float f, float f2) {
            this.f18703a = f;
            this.f18704b = f2;
        }
    }

    /* renamed from: a */
    static float m22148a(int i) {
        return ((float) i) / f18700a;
    }

    /* renamed from: a */
    public static JSONObject m22149a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22148a(i));
            jSONObject.put("y", (double) m22148a(i2));
            jSONObject.put("width", (double) m22148a(i3));
            jSONObject.put("height", (double) m22148a(i4));
        } catch (JSONException e) {
            C7857c.m22165a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22150a(Context context) {
        if (context != null) {
            f18700a = context.getResources().getDisplayMetrics().density;
            f18701b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22151a(JSONObject jSONObject) {
        C7856a b = m22157b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18703a);
            jSONObject.put("height", (double) b.f18704b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22152a(JSONObject jSONObject, C7870a.C7871a aVar) {
        C7843c a = aVar.mo55294a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55296b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55215b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55216c());
            jSONObject.put("friendlyObstructionReason", a.mo55217d());
        } catch (JSONException e) {
            C7857c.m22165a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22153a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7857c.m22165a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22154a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C7857c.m22165a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22155a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22156a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7856a m22157b(JSONObject jSONObject) {
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
                return new C7856a(f2, f);
            }
        } else if (f18701b != null) {
            Point point = new Point(0, 0);
            f18701b.getDefaultDisplay().getRealSize(point);
            f2 = m22148a(point.x);
            f = m22148a(point.y);
            return new C7856a(f2, f);
        }
        f = 0.0f;
        return new C7856a(f2, f);
    }

    /* renamed from: b */
    public static void m22158b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7857c.m22165a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22159b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m22160c(jSONObject, jSONObject2) && m22161d(jSONObject, jSONObject2) && m22162e(jSONObject, jSONObject2) && m22163f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22160c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18702c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22161d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22162e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22156a(optJSONArray, optJSONArray2)) {
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
    private static boolean m22163f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22156a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22159b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
