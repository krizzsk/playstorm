package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.h4 */
public class C9735h4 {

    /* renamed from: a */
    public final Context f23993a;

    /* renamed from: b */
    public final C9915q1 f23994b;

    /* renamed from: c */
    public final C9596a f23995c;

    /* renamed from: d */
    public String f23996d;

    /* renamed from: e */
    public boolean f23997e = true;

    public C9735h4(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f23994b = q1Var;
        this.f23995c = aVar;
        this.f23993a = context;
    }

    /* renamed from: a */
    public static C9735h4 m28141a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9735h4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public C9601a3 mo64166a(JSONObject jSONObject, String str, float f) {
        C9601a3 a = C9601a3.m27586a(str);
        if (jSONObject.has("pvalue")) {
            float optDouble = (float) jSONObject.optDouble("pvalue", (double) a.mo63449d());
            if (optDouble >= 0.0f && optDouble <= 100.0f) {
                if (f > 0.0f) {
                    a.mo63448b((optDouble * f) / 100.0f);
                } else {
                    a.mo63447a(optDouble);
                }
                return a;
            }
        }
        if (!jSONObject.has("value")) {
            return null;
        }
        float optDouble2 = (float) jSONObject.optDouble("value", (double) a.mo63450e());
        if (optDouble2 < 0.0f) {
            return null;
        }
        a.mo63448b(optDouble2);
        return a;
    }

    /* renamed from: a */
    public C9626b3 mo63944a(JSONObject jSONObject, float f) {
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            mo64169a("Required field", "failed to parse stat: no type or url");
            return null;
        }
        optString.hashCode();
        C9626b3 a = !optString.equals("playheadViewabilityValue") ? !optString.equals("playheadReachedValue") ? C9626b3.m27668a(optString, optString2) : mo64166a(jSONObject, optString2, f) : mo64170b(jSONObject, optString2, f);
        if (a != null) {
            a.mo63603a(jSONObject.optBoolean("needDecodeUrl", a.mo63605c()));
        }
        return a;
    }

    /* renamed from: a */
    public void mo64167a(C9641c3 c3Var, JSONObject jSONObject, String str, float f) {
        int length;
        C9626b3 a;
        c3Var.mo63677a(this.f23994b.mo65272h(), f);
        JSONArray optJSONArray = jSONObject.optJSONArray("statistics");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            this.f23996d = str;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a = mo63944a(optJSONObject, f)) == null)) {
                    c3Var.mo63676a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo64168a(Boolean bool) {
        this.f23997e = bool.booleanValue();
    }

    /* renamed from: a */
    public void mo64169a(String str, String str2) {
        if (this.f23997e) {
            String str3 = this.f23994b.f24531a;
            C9796k3 c = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f23995c.getSlotId()).mo64579c(this.f23996d);
            if (str3 == null) {
                str3 = this.f23994b.f24532b;
            }
            c.mo64577b(str3).mo64578b(this.f23993a);
        }
    }

    /* renamed from: b */
    public final C9626b3 mo64170b(JSONObject jSONObject, String str, float f) {
        String str2;
        int optInt = jSONObject.optInt("viewablePercent", -1);
        if (optInt < 0 || optInt > 100) {
            str2 = "failed to parse viewabilityStat: invalid viewable percent value";
        } else {
            if (jSONObject.has("ovv")) {
                C10067z2 a = C10067z2.m29868a(str, optInt);
                a.mo65857b(jSONObject.optBoolean("ovv", false));
                if (jSONObject.has("pvalue")) {
                    float optDouble = (float) jSONObject.optDouble("pvalue", (double) a.mo65858d());
                    if (optDouble >= 0.0f && optDouble <= 100.0f) {
                        if (f > 0.0f) {
                            a.mo65856b((optDouble * f) / 100.0f);
                        } else {
                            a.mo65855a(optDouble);
                        }
                        return a;
                    }
                }
                if (jSONObject.has("value")) {
                    float optDouble2 = (float) jSONObject.optDouble("value", (double) a.mo65859e());
                    if (optDouble2 >= 0.0f) {
                        a.mo65856b(optDouble2);
                        return a;
                    }
                }
            }
            float optDouble3 = (float) jSONObject.optDouble("duration", -1.0d);
            if (optDouble3 >= 0.0f) {
                return C10045y2.m29761a(str, optDouble3, optInt, jSONObject.optBoolean("mrc", true));
            }
            str2 = "failed to parse viewabilityStat: no ovv or wrong duration";
        }
        mo64169a("Bad value", str2);
        return null;
    }
}
