package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dd */
/* compiled from: OrientationProperties */
public class C5975dd {

    /* renamed from: e */
    private static String f15183e = C5975dd.class.getSimpleName();

    /* renamed from: a */
    public boolean f15184a = true;

    /* renamed from: b */
    public String f15185b = "none";

    /* renamed from: c */
    public String f15186c = "right";

    /* renamed from: d */
    public String f15187d = null;

    /* renamed from: a */
    public static C5975dd m17844a(String str, C5975dd ddVar) {
        C5975dd ddVar2 = new C5975dd();
        ddVar2.f15187d = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            ddVar2.f15185b = jSONObject.optString("forceOrientation", ddVar.f15185b);
            ddVar2.f15184a = jSONObject.optBoolean("allowOrientationChange", ddVar.f15184a);
            ddVar2.f15186c = jSONObject.optString("direction", ddVar.f15186c);
            if (!ddVar2.f15185b.equals("portrait") && !ddVar2.f15185b.equals("landscape")) {
                ddVar2.f15185b = "none";
            }
            if (ddVar2.f15186c.equals("left") || ddVar2.f15186c.equals("right")) {
                return ddVar2;
            }
            ddVar2.f15186c = "right";
            return ddVar2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String toString() {
        return "OrientationProperties{allowOrientationChange=" + this.f15184a + ", forceOrientation='" + this.f15185b + '\'' + ", direction='" + this.f15186c + '\'' + ", creativeSuppliedProperties='" + this.f15187d + '\'' + '}';
    }
}
