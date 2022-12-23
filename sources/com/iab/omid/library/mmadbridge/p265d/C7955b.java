package com.iab.omid.library.mmadbridge.p265d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.mmadbridge.p263b.C7943c;
import com.iab.omid.library.mmadbridge.walking.C7970a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.d.b */
public class C7955b {

    /* renamed from: a */
    static float f18928a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18929b;

    /* renamed from: c */
    private static String[] f18930c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.mmadbridge.d.b$a */
    private static class C7956a {

        /* renamed from: a */
        final float f18931a;

        /* renamed from: b */
        final float f18932b;

        C7956a(float f, float f2) {
            this.f18931a = f;
            this.f18932b = f2;
        }
    }

    /* renamed from: a */
    static float m22595a(int i) {
        return ((float) i) / f18928a;
    }

    /* renamed from: a */
    public static JSONObject m22596a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22595a(i));
            jSONObject.put("y", (double) m22595a(i2));
            jSONObject.put("width", (double) m22595a(i3));
            jSONObject.put("height", (double) m22595a(i4));
        } catch (JSONException e) {
            C7957c.m22614a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22597a(Context context) {
        if (context != null) {
            f18928a = context.getResources().getDisplayMetrics().density;
            f18929b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22598a(JSONObject jSONObject) {
        C7956a b = m22605b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18931a);
            jSONObject.put("height", (double) b.f18932b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22599a(JSONObject jSONObject, C7970a.C7971a aVar) {
        C7943c a = aVar.mo55679a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55681b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55599b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55600c());
            jSONObject.put("friendlyObstructionReason", a.mo55601d());
        } catch (JSONException e) {
            C7957c.m22614a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22600a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7957c.m22614a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m22601a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7957c.m22614a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22602a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7957c.m22614a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22603a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22604a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7956a m22605b(JSONObject jSONObject) {
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
                return new C7956a(f2, f);
            }
        } else if (f18929b != null) {
            Point point = new Point(0, 0);
            f18929b.getDefaultDisplay().getRealSize(point);
            f2 = m22595a(point.x);
            f = m22595a(point.y);
            return new C7956a(f2, f);
        }
        f = 0.0f;
        return new C7956a(f2, f);
    }

    /* renamed from: b */
    public static void m22606b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7957c.m22614a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22607b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m22608c(jSONObject, jSONObject2) && m22610e(jSONObject, jSONObject2) && m22609d(jSONObject, jSONObject2) && m22611f(jSONObject, jSONObject2) && m22612g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22608c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18930c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22609d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m22610e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m22611f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22604a(optJSONArray, optJSONArray2)) {
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
    private static boolean m22612g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22604a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22607b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
