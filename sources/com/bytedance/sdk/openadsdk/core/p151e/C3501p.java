package com.bytedance.sdk.openadsdk.core.p151e;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.p */
/* compiled from: PlayableModel */
public class C3501p {

    /* renamed from: a */
    private boolean f8664a;

    /* renamed from: b */
    private int f8665b;

    /* renamed from: c */
    private String f8666c;

    /* renamed from: d */
    private String f8667d;

    /* renamed from: e */
    private int f8668e;

    /* renamed from: e */
    public static boolean m10765e(C3498n nVar) {
        return false;
    }

    public C3501p(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("playable");
            if (optJSONObject != null) {
                this.f8667d = optJSONObject.optString("playable_url", "");
                this.f8668e = optJSONObject.optInt("playable_orientation", 0);
            }
            this.f8664a = jSONObject.optBoolean("is_playable");
            this.f8665b = jSONObject.optInt("playable_type", 0);
            this.f8666c = jSONObject.optString("playable_style");
        }
    }

    /* renamed from: a */
    public void mo19774a(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.f8664a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f8667d)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.f8667d);
                jSONObject2.put("playable_orientation", this.f8668e);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject.put("playable_type", this.f8665b);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put("playable_style", this.f8666c);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: k */
    private static C3501p m10771k(C3498n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar.mo19701e();
    }

    /* renamed from: a */
    public static boolean m10761a(C3498n nVar) {
        C3501p k = m10771k(nVar);
        if (k != null && k.f8664a && !TextUtils.isEmpty(m10764d(nVar))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static int m10772l(C3498n nVar) {
        C3501p k = m10771k(nVar);
        if (k == null) {
            return 0;
        }
        return k.f8665b;
    }

    /* renamed from: b */
    public static String m10762b(C3498n nVar) {
        C3501p k = m10771k(nVar);
        if (k == null) {
            return null;
        }
        return k.f8666c;
    }

    /* renamed from: c */
    public static String m10763c(C3498n nVar) {
        C3501p k = m10771k(nVar);
        if (k == null) {
            return null;
        }
        return k.f8667d;
    }

    /* renamed from: d */
    public static String m10764d(C3498n nVar) {
        if (nVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(m10763c(nVar))) {
            return m10763c(nVar);
        }
        if (nVar.mo19607J() != null) {
            return nVar.mo19607J().mo16362j();
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m10766f(C3498n nVar) {
        if (((nVar == null || nVar.mo19607J() == null) ? 0 : nVar.mo19607J().mo16370r()) != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m10767g(C3498n nVar) {
        if (nVar == null || nVar.mo19607J() == null || nVar.mo19607J().mo16370r() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static int m10768h(C3498n nVar) {
        C3501p k = m10771k(nVar);
        if (k == null) {
            return 0;
        }
        return k.f8668e;
    }

    /* renamed from: i */
    public static boolean m10769i(C3498n nVar) {
        return m10761a(nVar) && m10772l(nVar) == 1;
    }

    /* renamed from: j */
    public static boolean m10770j(C3498n nVar) {
        return m10761a(nVar) && m10772l(nVar) == 0;
    }
}
