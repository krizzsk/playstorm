package com.iab.omid.library.amazon.p229d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.amazon.p227b.C7641c;
import com.iab.omid.library.amazon.walking.C7668a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.d.b */
public class C7653b {

    /* renamed from: a */
    static float f18237a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18238b;

    /* renamed from: c */
    private static String[] f18239c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.amazon.d.b$a */
    private static class C7654a {

        /* renamed from: a */
        final float f18240a;

        /* renamed from: b */
        final float f18241b;

        C7654a(float f, float f2) {
            this.f18240a = f;
            this.f18241b = f2;
        }
    }

    /* renamed from: a */
    static float m21236a(int i) {
        return ((float) i) / f18237a;
    }

    /* renamed from: a */
    public static JSONObject m21237a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21236a(i));
            jSONObject.put("y", (double) m21236a(i2));
            jSONObject.put("width", (double) m21236a(i3));
            jSONObject.put("height", (double) m21236a(i4));
        } catch (JSONException e) {
            C7655c.m21255a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21238a(Context context) {
        if (context != null) {
            f18237a = context.getResources().getDisplayMetrics().density;
            f18238b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21239a(JSONObject jSONObject) {
        C7654a b = m21246b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18240a);
            jSONObject.put("height", (double) b.f18241b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21240a(JSONObject jSONObject, C7668a.C7669a aVar) {
        C7641c a = aVar.mo54508a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo54510b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo54428b());
            jSONObject.put("friendlyObstructionPurpose", a.mo54429c());
            jSONObject.put("friendlyObstructionReason", a.mo54430d());
        } catch (JSONException e) {
            C7655c.m21255a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21241a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7655c.m21255a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m21242a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7655c.m21255a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21243a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7655c.m21255a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21244a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21245a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7654a m21246b(JSONObject jSONObject) {
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
                return new C7654a(f2, f);
            }
        } else if (f18238b != null) {
            Point point = new Point(0, 0);
            f18238b.getDefaultDisplay().getRealSize(point);
            f2 = m21236a(point.x);
            f = m21236a(point.y);
            return new C7654a(f2, f);
        }
        f = 0.0f;
        return new C7654a(f2, f);
    }

    /* renamed from: b */
    public static void m21247b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7655c.m21255a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21248b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21249c(jSONObject, jSONObject2) && m21251e(jSONObject, jSONObject2) && m21250d(jSONObject, jSONObject2) && m21252f(jSONObject, jSONObject2) && m21253g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21249c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18239c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21250d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")) == Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus"));
    }

    /* renamed from: e */
    private static boolean m21251e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m21252f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21245a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m21253g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21245a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21248b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
