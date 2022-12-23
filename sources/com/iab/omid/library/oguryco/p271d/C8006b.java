package com.iab.omid.library.oguryco.p271d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.oguryco.p269b.C7994c;
import com.iab.omid.library.oguryco.walking.C8021a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.d.b */
public class C8006b {

    /* renamed from: a */
    static float f19052a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f19053b;

    /* renamed from: c */
    private static String[] f19054c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.oguryco.d.b$a */
    static class C8007a {

        /* renamed from: a */
        final float f19055a;

        /* renamed from: b */
        final float f19056b;

        C8007a(float f, float f2) {
            this.f19055a = f;
            this.f19056b = f2;
        }
    }

    /* renamed from: a */
    static float m22828a(int i) {
        return ((float) i) / f19052a;
    }

    /* renamed from: a */
    public static JSONObject m22829a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22828a(i));
            jSONObject.put("y", (double) m22828a(i2));
            jSONObject.put("width", (double) m22828a(i3));
            jSONObject.put("height", (double) m22828a(i4));
        } catch (JSONException e) {
            C8008c.m22845a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22830a(Context context) {
        if (context != null) {
            f19052a = context.getResources().getDisplayMetrics().density;
            f19053b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22831a(JSONObject jSONObject) {
        C8007a b = m22837b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f19055a);
            jSONObject.put("height", (double) b.f19056b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22832a(JSONObject jSONObject, C8021a.C8022a aVar) {
        C7994c a = aVar.mo55893a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55895b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55814b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55815c());
            jSONObject.put("friendlyObstructionReason", a.mo55816d());
        } catch (JSONException e) {
            C8008c.m22845a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22833a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C8008c.m22845a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22834a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C8008c.m22845a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22835a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22836a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C8007a m22837b(JSONObject jSONObject) {
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
                return new C8007a(f2, f);
            }
        } else if (f19053b != null) {
            Point point = new Point(0, 0);
            f19053b.getDefaultDisplay().getRealSize(point);
            f2 = m22828a(point.x);
            f = m22828a(point.y);
            return new C8007a(f2, f);
        }
        f = 0.0f;
        return new C8007a(f2, f);
    }

    /* renamed from: b */
    public static void m22838b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C8008c.m22845a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22839b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m22840c(jSONObject, jSONObject2) && m22841d(jSONObject, jSONObject2) && m22842e(jSONObject, jSONObject2) && m22843f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22840c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f19054c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22841d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22842e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22836a(optJSONArray, optJSONArray2)) {
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
    private static boolean m22843f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22836a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22839b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
