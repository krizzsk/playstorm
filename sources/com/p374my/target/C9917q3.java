package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.q3 */
public class C9917q3 {

    /* renamed from: a */
    public final C9915q1 f24558a;

    /* renamed from: b */
    public final C9596a f24559b;

    /* renamed from: c */
    public final Context f24560c;

    /* renamed from: d */
    public final C9735h4 f24561d;

    public C9917q3(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f24558a = q1Var;
        this.f24559b = aVar;
        this.f24560c = context;
        this.f24561d = C9735h4.m28141a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C9917q3 m29081a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9917q3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final C9879o2 mo65295a(C9879o2 o2Var, JSONObject jSONObject) {
        return jSONObject == null ? o2Var : C9659d4.m27821a(this.f24559b, this.f24558a.f24532b, true, this.f24560c).mo63866a(o2Var, jSONObject);
    }

    /* renamed from: a */
    public C9915q1 mo65296a(JSONObject jSONObject) {
        C9626b3 a;
        int v = this.f24558a.mo65287v();
        Boolean bool = null;
        if (v >= 5) {
            C9672e0.m27882a("got additional data, but max redirects limit exceeded");
            return null;
        }
        int optInt = jSONObject.optInt("id", this.f24558a.mo65278m());
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            mo65297a("Required field", "No url in additionalData Id = " + optInt);
            return null;
        }
        C9915q1 b = C9915q1.m29023b(optString);
        b.mo65263d(v + 1);
        b.mo65250b(optInt);
        b.mo65254b(jSONObject.optBoolean("doAfter", b.mo65290y()));
        b.mo65241a(jSONObject.optInt("doOnEmptyResponseFromId", b.mo65277l()));
        b.mo65261c(jSONObject.optBoolean("isMidrollPoint", b.mo65291z()));
        float b2 = this.f24558a.mo65248b();
        if (b2 < 0.0f) {
            b2 = (float) jSONObject.optDouble("allowCloseDelay", (double) b.mo65248b());
        }
        b.mo65240a(b2);
        Boolean a2 = this.f24558a.mo65238a();
        if (a2 == null) {
            a2 = jSONObject.has("allowClose") ? Boolean.valueOf(jSONObject.optBoolean("allowClose")) : null;
        }
        b.mo65245a(a2);
        Boolean c = this.f24558a.mo65255c();
        if (c == null) {
            c = jSONObject.has("hasPause") ? Boolean.valueOf(jSONObject.optBoolean("hasPause")) : null;
        }
        b.mo65252b(c);
        Boolean e = this.f24558a.mo65266e();
        if (e == null) {
            e = jSONObject.has("allowSeek") ? Boolean.valueOf(jSONObject.optBoolean("allowSeek")) : null;
        }
        b.mo65264d(e);
        Boolean f = this.f24558a.mo65268f();
        if (f == null) {
            f = jSONObject.has("allowSkip") ? Boolean.valueOf(jSONObject.optBoolean("allowSkip")) : null;
        }
        b.mo65267e(f);
        Boolean g = this.f24558a.mo65270g();
        if (g == null) {
            g = jSONObject.has("allowTrackChange") ? Boolean.valueOf(jSONObject.optBoolean("allowTrackChange")) : null;
        }
        b.mo65269f(g);
        Boolean r = this.f24558a.mo65283r();
        if (r == null) {
            r = jSONObject.has("openInBrowser") ? Boolean.valueOf(jSONObject.optBoolean("openInBrowser")) : null;
        }
        b.mo65273h(r);
        Boolean k = this.f24558a.mo65276k();
        if (k == null) {
            k = jSONObject.has("directLink") ? Boolean.valueOf(jSONObject.optBoolean("directLink")) : null;
        }
        b.mo65271g(k);
        Boolean d = this.f24558a.mo65262d();
        if (d != null) {
            bool = d;
        } else if (jSONObject.has("allowReplay")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("allowReplay"));
        }
        b.mo65258c(bool);
        float s = this.f24558a.mo65284s();
        if (s < 0.0f && jSONObject.has("point")) {
            s = (float) jSONObject.optDouble("point");
            if (s < 0.0f) {
                mo65297a("Bad value", "Wrong value " + -1.0f + " for point in additionalData object");
                s = -1.0f;
            }
        }
        b.mo65249b(s);
        float t = this.f24558a.mo65285t();
        if (t < 0.0f && jSONObject.has("pointP")) {
            t = (float) jSONObject.optDouble("pointP");
            if (t < 0.0f || t > 100.0f) {
                mo65297a("Bad value", "Wrong value " + -1.0f + " for pointP in additionalData object");
                t = -1.0f;
            }
        }
        b.mo65256c(t);
        b.mo65246a(this.f24558a.mo65279n());
        b.mo65243a(mo65295a(this.f24558a.mo65281p(), jSONObject.optJSONObject("omdata")));
        JSONArray optJSONArray = jSONObject.optJSONArray("serviceStatistics");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a = this.f24561d.mo63944a(optJSONObject, -1.0f)) == null)) {
                    b.mo65242a(a);
                }
            }
        }
        this.f24561d.mo64167a(b.mo65272h(), jSONObject, String.valueOf(b.mo65278m()), -1.0f);
        return b;
    }

    /* renamed from: a */
    public final void mo65297a(String str, String str2) {
        String str3 = this.f24558a.f24531a;
        C9796k3 a = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f24559b.getSlotId());
        if (str3 == null) {
            str3 = this.f24558a.f24532b;
        }
        a.mo64577b(str3).mo64578b(this.f24560c);
    }
}
