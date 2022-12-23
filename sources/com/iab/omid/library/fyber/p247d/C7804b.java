package com.iab.omid.library.fyber.p247d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.fyber.p245b.C7792c;
import com.iab.omid.library.fyber.walking.C7819a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.d.b */
public class C7804b {

    /* renamed from: a */
    static float f18584a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18585b;

    /* renamed from: c */
    private static String[] f18586c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.fyber.d.b$a */
    private static class C7805a {

        /* renamed from: a */
        final float f18587a;

        /* renamed from: b */
        final float f18588b;

        C7805a(float f, float f2) {
            this.f18587a = f;
            this.f18588b = f2;
        }
    }

    /* renamed from: a */
    static float m21920a(int i) {
        return ((float) i) / f18584a;
    }

    /* renamed from: a */
    public static JSONObject m21921a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21920a(i));
            jSONObject.put("y", (double) m21920a(i2));
            jSONObject.put("width", (double) m21920a(i3));
            jSONObject.put("height", (double) m21920a(i4));
        } catch (JSONException e) {
            C7806c.m21939a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21922a(Context context) {
        if (context != null) {
            f18584a = context.getResources().getDisplayMetrics().density;
            f18585b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21923a(JSONObject jSONObject) {
        C7805a b = m21930b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18587a);
            jSONObject.put("height", (double) b.f18588b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21924a(JSONObject jSONObject, C7819a.C7820a aVar) {
        C7792c a = aVar.mo55100a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55102b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55020b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55021c());
            jSONObject.put("friendlyObstructionReason", a.mo55022d());
        } catch (JSONException e) {
            C7806c.m21939a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21925a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7806c.m21939a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m21926a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7806c.m21939a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21927a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7806c.m21939a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21928a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21929a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7805a m21930b(JSONObject jSONObject) {
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
                return new C7805a(f2, f);
            }
        } else if (f18585b != null) {
            Point point = new Point(0, 0);
            f18585b.getDefaultDisplay().getRealSize(point);
            f2 = m21920a(point.x);
            f = m21920a(point.y);
            return new C7805a(f2, f);
        }
        f = 0.0f;
        return new C7805a(f2, f);
    }

    /* renamed from: b */
    public static void m21931b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7806c.m21939a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21932b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21933c(jSONObject, jSONObject2) && m21935e(jSONObject, jSONObject2) && m21934d(jSONObject, jSONObject2) && m21936f(jSONObject, jSONObject2) && m21937g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21933c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18586c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21934d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m21935e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m21936f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21929a(optJSONArray, optJSONArray2)) {
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
    private static boolean m21937g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21929a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21932b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
