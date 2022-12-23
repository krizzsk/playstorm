package com.iab.omid.library.corpmailru.p241d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.corpmailru.p239b.C7741c;
import com.iab.omid.library.corpmailru.walking.C7768a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.d.b */
public class C7753b {

    /* renamed from: a */
    public static float f18470a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18471b;

    /* renamed from: c */
    private static String[] f18472c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.corpmailru.d.b$a */
    public static class C7754a {

        /* renamed from: a */
        public final float f18473a;

        /* renamed from: b */
        public final float f18474b;

        public C7754a(float f, float f2) {
            this.f18473a = f;
            this.f18474b = f2;
        }
    }

    /* renamed from: a */
    public static float m21694a(int i) {
        return ((float) i) / f18470a;
    }

    /* renamed from: a */
    public static JSONObject m21695a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21694a(i));
            jSONObject.put("y", (double) m21694a(i2));
            jSONObject.put("width", (double) m21694a(i3));
            jSONObject.put("height", (double) m21694a(i4));
        } catch (JSONException e) {
            C7755c.m21711a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21696a(Context context) {
        if (context != null) {
            f18470a = context.getResources().getDisplayMetrics().density;
            f18471b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21697a(JSONObject jSONObject) {
        C7754a b = m21703b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18473a);
            jSONObject.put("height", (double) b.f18474b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21698a(JSONObject jSONObject, C7768a.C7769a aVar) {
        C7741c a = aVar.mo54901a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo54903b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo54822b());
            jSONObject.put("friendlyObstructionPurpose", a.mo54823c());
            jSONObject.put("friendlyObstructionReason", a.mo54824d());
        } catch (JSONException e) {
            C7755c.m21711a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21699a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7755c.m21711a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21700a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C7755c.m21711a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21701a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21702a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7754a m21703b(JSONObject jSONObject) {
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
                return new C7754a(f2, f);
            }
        } else if (f18471b != null) {
            Point point = new Point(0, 0);
            f18471b.getDefaultDisplay().getRealSize(point);
            f2 = m21694a(point.x);
            f = m21694a(point.y);
            return new C7754a(f2, f);
        }
        f = 0.0f;
        return new C7754a(f2, f);
    }

    /* renamed from: b */
    public static void m21704b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7755c.m21711a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21705b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21706c(jSONObject, jSONObject2) && m21707d(jSONObject, jSONObject2) && m21708e(jSONObject, jSONObject2) && m21709f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21706c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18472c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21707d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m21708e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21702a(optJSONArray, optJSONArray2)) {
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
    private static boolean m21709f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21702a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21705b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
