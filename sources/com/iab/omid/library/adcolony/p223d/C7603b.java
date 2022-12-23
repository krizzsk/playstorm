package com.iab.omid.library.adcolony.p223d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.adcolony.p221b.C7591c;
import com.iab.omid.library.adcolony.walking.C7618a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.b */
public class C7603b {

    /* renamed from: a */
    static float f18120a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18121b;

    /* renamed from: c */
    private static String[] f18122c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.adcolony.d.b$a */
    private static class C7604a {

        /* renamed from: a */
        final float f18123a;

        /* renamed from: b */
        final float f18124b;

        C7604a(float f, float f2) {
            this.f18123a = f;
            this.f18124b = f2;
        }
    }

    /* renamed from: a */
    static float m21006a(int i) {
        return ((float) i) / f18120a;
    }

    /* renamed from: a */
    public static JSONObject m21007a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21006a(i));
            jSONObject.put("y", (double) m21006a(i2));
            jSONObject.put("width", (double) m21006a(i3));
            jSONObject.put("height", (double) m21006a(i4));
        } catch (JSONException e) {
            C7605c.m21025a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21008a(Context context) {
        if (context != null) {
            f18120a = context.getResources().getDisplayMetrics().density;
            f18121b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21009a(JSONObject jSONObject) {
        C7604a b = m21016b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18123a);
            jSONObject.put("height", (double) b.f18124b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21010a(JSONObject jSONObject, C7618a.C7619a aVar) {
        C7591c a = aVar.mo54309a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo54311b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo54229b());
            jSONObject.put("friendlyObstructionPurpose", a.mo54230c());
            jSONObject.put("friendlyObstructionReason", a.mo54231d());
        } catch (JSONException e) {
            C7605c.m21025a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21011a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7605c.m21025a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m21012a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7605c.m21025a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21013a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7605c.m21025a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21014a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21015a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7604a m21016b(JSONObject jSONObject) {
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
                return new C7604a(f2, f);
            }
        } else if (f18121b != null) {
            Point point = new Point(0, 0);
            f18121b.getDefaultDisplay().getRealSize(point);
            f2 = m21006a(point.x);
            f = m21006a(point.y);
            return new C7604a(f2, f);
        }
        f = 0.0f;
        return new C7604a(f2, f);
    }

    /* renamed from: b */
    public static void m21017b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7605c.m21025a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21018b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21019c(jSONObject, jSONObject2) && m21021e(jSONObject, jSONObject2) && m21020d(jSONObject, jSONObject2) && m21022f(jSONObject, jSONObject2) && m21023g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21019c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18122c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21020d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m21021e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m21022f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21015a(optJSONArray, optJSONArray2)) {
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
    private static boolean m21023g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21015a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21018b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
