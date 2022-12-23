package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9822l3;
import com.p374my.target.common.models.AudioData;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.j */
public class C9765j extends C9635c<C9945s2> {
    /* renamed from: a */
    public static C9635c<C9945s2> m28309a() {
        return new C9765j();
    }

    /* renamed from: a */
    public static C9945s2 m28310a(String str, C9915q1 q1Var, C9945s2 s2Var, C9596a aVar) {
        C9753i4 a = C9753i4.m28226a(aVar, q1Var);
        a.mo64257c(str);
        String o = q1Var.mo65280o();
        if (o == null) {
            o = "preroll";
        }
        if (s2Var == null) {
            s2Var = C9945s2.m29197e();
        }
        C9984u2<AudioData> a2 = s2Var.mo65355a(o);
        if (a2 == null) {
            return s2Var;
        }
        if (!a.mo64256c().isEmpty()) {
            m28312a(a, a2, q1Var);
        } else {
            C9915q1 d = a.mo64261d();
            if (d != null) {
                d.mo65265d(a2.mo65538h());
                int u = q1Var.mo65286u();
                if (u < 0) {
                    u = a2.mo65292a();
                }
                d.mo65257c(u);
                a2.mo65530a(d);
            }
        }
        return s2Var;
    }

    /* renamed from: a */
    public static C9945s2 m28311a(String str, C9915q1 q1Var, C9945s2 s2Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        JSONObject optJSONObject;
        JSONObject a = C9635c.m27712a(str, aVar2, l3Var);
        if (a == null || (optJSONObject = a.optJSONObject(aVar.getFormat())) == null) {
            return s2Var;
        }
        if (s2Var == null) {
            s2Var = C9945s2.m29197e();
        }
        C9998v3.m29559a().mo65605a(optJSONObject, s2Var);
        C9917q3 a2 = C9917q3.m29081a(q1Var, aVar, context);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("sections");
        if (optJSONObject2 != null) {
            String o = q1Var.mo65280o();
            if (o != null) {
                C9984u2<AudioData> a3 = s2Var.mo65355a(o);
                if (a3 != null) {
                    m28315a(optJSONObject2, a2, a3, C9931r3.m29128a(q1Var, aVar, context), q1Var);
                }
            } else {
                Iterator<C9984u2<AudioData>> it = s2Var.mo65356c().iterator();
                while (it.hasNext()) {
                    m28315a(optJSONObject2, a2, it.next(), C9931r3.m29128a(q1Var, aVar, context), q1Var);
                }
            }
        }
        return s2Var;
    }

    /* renamed from: a */
    public static void m28312a(C9753i4<AudioData> i4Var, C9984u2<AudioData> u2Var, C9915q1 q1Var) {
        int u = q1Var.mo65286u();
        Iterator<C9711g2<AudioData>> it = i4Var.mo64256c().iterator();
        while (it.hasNext()) {
            C9711g2 next = it.next();
            float b = q1Var.mo65248b();
            if (b >= 0.0f) {
                next.setAllowCloseDelay(b);
            }
            Boolean a = q1Var.mo65238a();
            if (a != null) {
                next.setAllowClose(a.booleanValue());
            }
            Boolean c = q1Var.mo65255c();
            if (c != null) {
                next.setAllowPause(c.booleanValue());
            }
            Boolean e = q1Var.mo65266e();
            if (e != null) {
                next.setAllowSeek(e.booleanValue());
            }
            Boolean f = q1Var.mo65268f();
            if (f != null) {
                next.setAllowSkip(f.booleanValue());
            }
            Boolean g = q1Var.mo65270g();
            if (g != null) {
                next.setAllowTrackChange(g.booleanValue());
            }
            Boolean k = q1Var.mo65276k();
            if (k != null) {
                next.setDirectLink(k.booleanValue());
            }
            Boolean r = q1Var.mo65283r();
            if (r != null) {
                next.setOpenInBrowser(r.booleanValue());
            }
            Boolean d = q1Var.mo65262d();
            if (d != null) {
                next.setAllowReplay(d.booleanValue());
            }
            next.setCloseActionText("Close");
            float s = q1Var.mo65284s();
            if (s >= 0.0f) {
                next.setPoint(s);
            }
            float t = q1Var.mo65285t();
            if (t >= 0.0f) {
                next.setPointP(t);
            }
            if (u >= 0) {
                u2Var.mo65529a(next, u);
                u++;
            } else {
                u2Var.mo65528a((C9711g2<AudioData>) next);
            }
        }
    }

    /* renamed from: a */
    public static void m28313a(C9915q1 q1Var, C9917q3 q3Var, JSONObject jSONObject, C9984u2 u2Var, ArrayList<C9915q1> arrayList, ArrayList<C9915q1> arrayList2) {
        C9915q1 a = q3Var.mo65296a(jSONObject);
        if (a != null) {
            a.mo65265d(u2Var.mo65538h());
            if (a.mo65277l() != -1) {
                arrayList2.add(a);
                return;
            }
            arrayList.add(a);
            if (!a.mo65291z() && !a.mo65290y()) {
                q1Var.mo65244a(a);
                int u = q1Var.mo65286u();
                if (u < 0) {
                    u = u2Var.mo65292a();
                }
                a.mo65257c(u);
            }
            u2Var.mo65530a(a);
        }
    }

    /* renamed from: a */
    public static void m28314a(ArrayList<C9915q1> arrayList, ArrayList<C9915q1> arrayList2) {
        Iterator<C9915q1> it = arrayList2.iterator();
        while (it.hasNext()) {
            C9915q1 next = it.next();
            Iterator<C9915q1> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C9915q1 next2 = it2.next();
                if (next.mo65277l() == next2.mo65278m()) {
                    next2.mo65251b(next);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m28315a(JSONObject jSONObject, C9917q3 q3Var, C9984u2<AudioData> u2Var, C9931r3 r3Var, C9915q1 q1Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray(u2Var.mo65538h());
        if (optJSONArray != null) {
            int u = q1Var.mo65286u();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    if ("additionalData".equals(optJSONObject.optString("type"))) {
                        m28313a(q1Var, q3Var, optJSONObject, u2Var, arrayList2, arrayList);
                    } else {
                        C9711g2<AudioData> newAudioBanner = C9711g2.newAudioBanner();
                        if (r3Var.mo65328c(optJSONObject, newAudioBanner)) {
                            if (q1Var.mo65291z()) {
                                newAudioBanner.setPoint(q1Var.mo65284s());
                                newAudioBanner.setPointP(q1Var.mo65285t());
                            }
                            if (u >= 0) {
                                u2Var.mo65529a(newAudioBanner, u);
                                u++;
                            } else {
                                u2Var.mo65528a(newAudioBanner);
                            }
                        }
                    }
                }
            }
            m28314a(arrayList2, arrayList);
        }
    }

    /* renamed from: b */
    public C9945s2 mo63651a(String str, C9915q1 q1Var, C9945s2 s2Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        return C9635c.isVast(str) ? m28310a(str, q1Var, s2Var, aVar) : m28311a(str, q1Var, s2Var, aVar, aVar2, l3Var, context);
    }
}
