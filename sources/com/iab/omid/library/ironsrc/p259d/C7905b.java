package com.iab.omid.library.ironsrc.p259d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.p257b.C7893c;
import com.iab.omid.library.ironsrc.walking.C7920a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.b */
public class C7905b {

    /* renamed from: a */
    static float f18814a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18815b;

    /* renamed from: c */
    private static String[] f18816c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.ironsrc.d.b$a */
    static class C7906a {

        /* renamed from: a */
        final float f18817a;

        /* renamed from: b */
        final float f18818b;

        C7906a(float f, float f2) {
            this.f18817a = f;
            this.f18818b = f2;
        }
    }

    /* renamed from: a */
    static float m22369a(int i) {
        return ((float) i) / f18814a;
    }

    /* renamed from: a */
    public static JSONObject m22370a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22369a(i));
            jSONObject.put("y", (double) m22369a(i2));
            jSONObject.put("width", (double) m22369a(i3));
            jSONObject.put("height", (double) m22369a(i4));
        } catch (JSONException e) {
            C7907c.m22386a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22371a(Context context) {
        if (context != null) {
            f18814a = context.getResources().getDisplayMetrics().density;
            f18815b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22372a(JSONObject jSONObject) {
        C7906a b = m22378b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18817a);
            jSONObject.put("height", (double) b.f18818b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22373a(JSONObject jSONObject, C7920a.C7921a aVar) {
        C7893c a = aVar.mo55480a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55482b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55401b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55402c());
            jSONObject.put("friendlyObstructionReason", a.mo55403d());
        } catch (JSONException e) {
            C7907c.m22386a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22374a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7907c.m22386a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22375a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C7907c.m22386a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22376a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22377a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C7906a m22378b(JSONObject jSONObject) {
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
                return new C7906a(f2, f);
            }
        } else if (f18815b != null) {
            Point point = new Point(0, 0);
            f18815b.getDefaultDisplay().getRealSize(point);
            f2 = m22369a(point.x);
            f = m22369a(point.y);
            return new C7906a(f2, f);
        }
        f = 0.0f;
        return new C7906a(f2, f);
    }

    /* renamed from: b */
    public static void m22379b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7907c.m22386a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22380b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m22381c(jSONObject, jSONObject2) && m22382d(jSONObject, jSONObject2) && m22383e(jSONObject, jSONObject2) && m22384f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22381c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18816c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22382d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22383e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22377a(optJSONArray, optJSONArray2)) {
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
    private static boolean m22384f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22377a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22380b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
