package com.iab.omid.library.vungle.p283d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.vungle.p281b.C8094c;
import com.iab.omid.library.vungle.walking.C8121a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.d.b */
public class C8106b {

    /* renamed from: a */
    static float f19278a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f19279b;

    /* renamed from: c */
    private static String[] f19280c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.vungle.d.b$a */
    private static class C8107a {

        /* renamed from: a */
        final float f19281a;

        /* renamed from: b */
        final float f19282b;

        C8107a(float f, float f2) {
            this.f19281a = f;
            this.f19282b = f2;
        }
    }

    /* renamed from: a */
    static float m23276a(int i) {
        return ((float) i) / f19278a;
    }

    /* renamed from: a */
    public static JSONObject m23277a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m23276a(i));
            jSONObject.put("y", (double) m23276a(i2));
            jSONObject.put("width", (double) m23276a(i3));
            jSONObject.put("height", (double) m23276a(i4));
        } catch (JSONException e) {
            C8108c.m23293a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m23278a(Context context) {
        if (context != null) {
            f19278a = context.getResources().getDisplayMetrics().density;
            f19279b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m23279a(JSONObject jSONObject) {
        C8107a b = m23285b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f19281a);
            jSONObject.put("height", (double) b.f19282b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m23280a(JSONObject jSONObject, C8121a.C8122a aVar) {
        C8094c a = aVar.mo56281a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo56283b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo56202b());
            jSONObject.put("friendlyObstructionPurpose", a.mo56203c());
            jSONObject.put("friendlyObstructionReason", a.mo56204d());
        } catch (JSONException e) {
            C8108c.m23293a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m23281a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C8108c.m23293a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m23282a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C8108c.m23293a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m23283a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m23284a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C8107a m23285b(JSONObject jSONObject) {
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
                return new C8107a(f2, f);
            }
        } else if (f19279b != null) {
            Point point = new Point(0, 0);
            f19279b.getDefaultDisplay().getRealSize(point);
            f2 = m23276a(point.x);
            f = m23276a(point.y);
            return new C8107a(f2, f);
        }
        f = 0.0f;
        return new C8107a(f2, f);
    }

    /* renamed from: b */
    public static void m23286b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C8108c.m23293a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m23287b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m23288c(jSONObject, jSONObject2) && m23289d(jSONObject, jSONObject2) && m23290e(jSONObject, jSONObject2) && m23291f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m23288c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f19280c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m23289d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m23290e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m23284a(optJSONArray, optJSONArray2)) {
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
    private static boolean m23291f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m23284a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m23287b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
