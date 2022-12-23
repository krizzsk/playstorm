package com.iab.omid.library.applovin.p235d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.applovin.p233b.C7691c;
import com.iab.omid.library.applovin.walking.C7718a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.d.b */
public class C7703b {

    /* renamed from: a */
    static float f18354a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18355b;

    /* renamed from: c */
    private static String[] f18356c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.applovin.d.b$a */
    private static class C7704a {

        /* renamed from: a */
        final float f18357a;

        /* renamed from: b */
        final float f18358b;

        C7704a(float f, float f2) {
            this.f18357a = f;
            this.f18358b = f2;
        }
    }

    /* renamed from: a */
    static float m21466a(int i) {
        return ((float) i) / f18354a;
    }

    /* renamed from: a */
    public static JSONObject m21467a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21466a(i));
            jSONObject.put("y", (double) m21466a(i2));
            jSONObject.put("width", (double) m21466a(i3));
            jSONObject.put("height", (double) m21466a(i4));
        } catch (JSONException e) {
            C7705c.m21485a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21468a(Context context) {
        if (context != null) {
            f18354a = context.getResources().getDisplayMetrics().density;
            f18355b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21469a(JSONObject jSONObject) {
        C7704a b = m21476b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18357a);
            jSONObject.put("height", (double) b.f18358b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21470a(JSONObject jSONObject, C7718a.C7719a aVar) {
        C7691c a = aVar.mo54707a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo54709b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo54627b());
            jSONObject.put("friendlyObstructionPurpose", a.mo54628c());
            jSONObject.put("friendlyObstructionReason", a.mo54629d());
        } catch (JSONException e) {
            C7705c.m21485a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21471a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7705c.m21485a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m21472a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7705c.m21485a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21473a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7705c.m21485a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21474a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21475a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7704a m21476b(JSONObject jSONObject) {
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
                return new C7704a(f2, f);
            }
        } else if (f18355b != null) {
            Point point = new Point(0, 0);
            f18355b.getDefaultDisplay().getRealSize(point);
            f2 = m21466a(point.x);
            f = m21466a(point.y);
            return new C7704a(f2, f);
        }
        f = 0.0f;
        return new C7704a(f2, f);
    }

    /* renamed from: b */
    public static void m21477b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7705c.m21485a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21478b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21479c(jSONObject, jSONObject2) && m21481e(jSONObject, jSONObject2) && m21480d(jSONObject, jSONObject2) && m21482f(jSONObject, jSONObject2) && m21483g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21479c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18356c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21480d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m21481e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m21482f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21475a(optJSONArray, optJSONArray2)) {
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
    private static boolean m21483g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21475a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21478b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
