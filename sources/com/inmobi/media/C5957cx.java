package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cx */
/* compiled from: ExpandProperties */
public class C5957cx {

    /* renamed from: d */
    private static final String f15129d = C5957cx.class.getSimpleName();

    /* renamed from: a */
    public boolean f15130a = false;

    /* renamed from: b */
    public boolean f15131b;

    /* renamed from: c */
    public String f15132c;

    /* renamed from: e */
    private boolean f15133e = true;

    public C5957cx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", C6252ic.m18655a().f15838a);
            jSONObject.put("height", C6252ic.m18655a().f15839b);
            jSONObject.put("useCustomClose", this.f15130a);
            jSONObject.put("isModal", this.f15133e);
        } catch (JSONException unused) {
        }
        this.f15132c = jSONObject.toString();
    }

    /* renamed from: a */
    public static C5957cx m17808a(String str) {
        C5957cx cxVar = new C5957cx();
        cxVar.f15132c = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            cxVar.f15133e = true;
            if (jSONObject.has("useCustomClose")) {
                cxVar.f15131b = true;
            }
            cxVar.f15130a = jSONObject.optBoolean("useCustomClose", false);
        } catch (JSONException unused) {
        }
        return cxVar;
    }
}
