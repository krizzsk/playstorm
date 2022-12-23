package com.p374my.target;

import android.content.Context;
import com.p374my.target.C10068z3;
import com.p374my.target.C9822l3;
import com.p374my.target.common.models.VideoData;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.p */
public class C9890p extends C9635c<C9963t2> implements C10068z3.C10069a {

    /* renamed from: a */
    public String f24467a;

    /* renamed from: a */
    public static C9635c<C9963t2> m28936a() {
        return new C9890p();
    }

    /* renamed from: b */
    public static void m28937b(JSONObject jSONObject, C9915q1 q1Var, C9596a aVar, Context context) {
        C9915q1 a = C9917q3.m29081a(q1Var, aVar, context).mo65296a(jSONObject);
        if (a != null) {
            q1Var.mo65244a(a);
        }
    }

    /* renamed from: a */
    public C9916q2 mo63652a(JSONObject jSONObject, C9915q1 q1Var, C9596a aVar, Context context) {
        C9625b2 a = C10017w3.m29637a(q1Var, aVar, context).mo65667a(jSONObject, this.f24467a);
        if (a == null) {
            return null;
        }
        C9963t2 d = C9963t2.m29325d();
        d.mo65446a(a);
        return d;
    }

    /* renamed from: a */
    public final C9963t2 mo65184a(C9963t2 t2Var, C9753i4<VideoData> i4Var, C9915q1 q1Var) {
        if (t2Var == null) {
            t2Var = C9963t2.m29325d();
        }
        C9711g2 g2Var = i4Var.mo64256c().get(0);
        C9697f2 newBanner = C9697f2.newBanner();
        newBanner.setCtaText(g2Var.getCtaText());
        newBanner.setVideoBanner(g2Var);
        newBanner.setStyle(1);
        newBanner.setTrackingLink(g2Var.getTrackingLink());
        Boolean a = q1Var.mo65238a();
        if (a != null) {
            g2Var.setAllowClose(a.booleanValue());
        }
        Boolean c = q1Var.mo65255c();
        if (c != null) {
            g2Var.setAllowPause(c.booleanValue());
        }
        Boolean d = q1Var.mo65262d();
        if (d != null) {
            g2Var.setAllowReplay(d.booleanValue());
        }
        Boolean k = q1Var.mo65276k();
        if (k != null) {
            newBanner.setDirectLink(k.booleanValue());
        }
        Boolean r = q1Var.mo65283r();
        if (r != null) {
            newBanner.setOpenInBrowser(r.booleanValue());
        }
        float b = q1Var.mo65248b();
        if (b >= 0.0f) {
            g2Var.setAllowCloseDelay(b);
        }
        for (C9626b3 a2 : g2Var.getStatHolder().mo63675a("click")) {
            newBanner.getStatHolder().mo63676a(a2);
        }
        t2Var.mo65446a(newBanner);
        if (newBanner.getOmData() == null) {
            newBanner.setOmData(g2Var.getOmData());
        }
        Iterator<C9600a2> it = g2Var.getCompanionBanners().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C9600a2 next = it.next();
            C9625b2 b2Var = null;
            if (next.getHtmlResource() != null) {
                b2Var = C9657d2.fromCompanion(next);
                continue;
            } else if (next.getStaticResource() != null) {
                b2Var = C9675e2.fromCompanion(next);
                continue;
            } else {
                continue;
            }
            if (b2Var != null) {
                newBanner.setEndCard(b2Var);
                break;
            }
        }
        return t2Var;
    }

    /* renamed from: a */
    public final C9963t2 mo65185a(String str, C9915q1 q1Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, C9963t2 t2Var, Context context) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        C9839m2 b;
        JSONObject a = C9635c.m27712a(str, aVar2, l3Var);
        if (a == null) {
            return t2Var;
        }
        if (t2Var == null) {
            t2Var = C9963t2.m29325d();
        }
        this.f24467a = a.optString("mraid.js");
        JSONObject a2 = mo65188a(a, aVar.getFormat());
        if (a2 == null) {
            if (!(!aVar.isMediationEnabled() || (optJSONObject2 = a.optJSONObject("mediation")) == null || (b = C10068z3.m29875a(this, q1Var, aVar, context).mo65863b(optJSONObject2)) == null)) {
                t2Var.mo65293a(b);
            }
            return t2Var;
        }
        JSONArray optJSONArray = a2.optJSONArray("banners");
        if (!(optJSONArray == null || optJSONArray.length() <= 0 || (optJSONObject = optJSONArray.optJSONObject(0)) == null)) {
            if ("additionalData".equals(optJSONObject.optString("type", ""))) {
                m28937b(optJSONObject, q1Var, aVar, context);
            } else {
                C9625b2 a3 = C10017w3.m29637a(q1Var, aVar, context).mo65667a(optJSONObject, this.f24467a);
                if (a3 != null) {
                    t2Var.mo65446a(a3);
                }
            }
        }
        return t2Var;
    }

    /* renamed from: a */
    public final C9963t2 mo65186a(String str, C9915q1 q1Var, C9596a aVar, C9963t2 t2Var) {
        C9753i4 a = C9753i4.m28226a(aVar, q1Var);
        a.mo64257c(str);
        return !a.mo64256c().isEmpty() ? mo65184a(t2Var, a, q1Var) : t2Var;
    }

    /* renamed from: a */
    public C9963t2 mo63651a(String str, C9915q1 q1Var, C9963t2 t2Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        return C9635c.isVast(str) ? mo65186a(str, q1Var, aVar, t2Var) : mo65185a(str, q1Var, aVar, aVar2, l3Var, t2Var, context);
    }

    /* renamed from: a */
    public final JSONObject mo65188a(JSONObject jSONObject, String str) {
        if (!"fullscreen".equals(str) && !"rewarded".equals(str)) {
            return jSONObject.optJSONObject(str);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("fullscreen");
        return optJSONObject != null ? optJSONObject : jSONObject.optJSONObject("rewarded");
    }
}
