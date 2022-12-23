package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9822l3;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.g */
public class C9706g extends C9635c<C9930r2> {
    /* renamed from: a */
    public static C9635c<C9930r2> m28043a() {
        return new C9706g();
    }

    /* renamed from: a */
    public static C9930r2 m28044a(String str, C9915q1 q1Var, C9930r2 r2Var, C9596a aVar) {
        C9753i4 a = C9753i4.m28226a(aVar, q1Var);
        a.mo64257c(str);
        String o = q1Var.mo65280o();
        if (o == null) {
            o = "preroll";
        }
        if (r2Var == null) {
            r2Var = C9930r2.m29123e();
        }
        C9984u2<VideoData> a2 = r2Var.mo65321a(o);
        if (a2 == null) {
            return r2Var;
        }
        if (!a.mo64256c().isEmpty()) {
            m28046a(a, a2, q1Var);
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
        return r2Var;
    }

    /* renamed from: a */
    public static C9930r2 m28045a(String str, C9915q1 q1Var, C9930r2 r2Var, C9596a aVar, C9822l3.C9823a aVar2, Context context, C9822l3 l3Var) {
        JSONObject optJSONObject;
        JSONObject a = C9635c.m27712a(str, aVar2, l3Var);
        if (a == null || (optJSONObject = a.optJSONObject(aVar.getFormat())) == null) {
            return r2Var;
        }
        if (r2Var == null) {
            r2Var = C9930r2.m29123e();
        }
        C9985u3.m29461a().mo65541a(optJSONObject, r2Var);
        C9917q3 a2 = C9917q3.m29081a(q1Var, aVar, context);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("sections");
        if (optJSONObject2 != null) {
            String o = q1Var.mo65280o();
            if (o != null) {
                C9984u2<VideoData> a3 = r2Var.mo65321a(o);
                if (a3 != null) {
                    m28049a(optJSONObject2, a2, a3, C9964t3.m29329a(q1Var, aVar, context), q1Var);
                }
            } else {
                Iterator<C9984u2<VideoData>> it = r2Var.mo65322c().iterator();
                while (it.hasNext()) {
                    m28049a(optJSONObject2, a2, it.next(), C9964t3.m29329a(q1Var, aVar, context), q1Var);
                }
            }
        }
        return r2Var;
    }

    /* renamed from: a */
    public static void m28046a(C9753i4<VideoData> i4Var, C9984u2<VideoData> u2Var, C9915q1 q1Var) {
        int u = q1Var.mo65286u();
        Iterator<C9711g2<VideoData>> it = i4Var.mo64256c().iterator();
        while (it.hasNext()) {
            C9711g2 next = it.next();
            Boolean a = q1Var.mo65238a();
            if (a != null) {
                next.setAllowClose(a.booleanValue());
            }
            Boolean c = q1Var.mo65255c();
            if (c != null) {
                next.setAllowPause(c.booleanValue());
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
            float b = q1Var.mo65248b();
            if (b >= 0.0f) {
                next.setAllowCloseDelay(b);
            }
            next.setCloseActionText("Close");
            next.setPoint(q1Var.mo65284s());
            next.setPointP(q1Var.mo65285t());
            if (u >= 0) {
                u2Var.mo65529a(next, u);
                u++;
            } else {
                u2Var.mo65528a((C9711g2<VideoData>) next);
            }
        }
    }

    /* renamed from: a */
    public static void m28047a(C9915q1 q1Var, C9917q3 q3Var, JSONObject jSONObject, C9984u2 u2Var, ArrayList<C9915q1> arrayList, ArrayList<C9915q1> arrayList2) {
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
    public static void m28048a(ArrayList<C9915q1> arrayList, ArrayList<C9915q1> arrayList2) {
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
    public static void m28049a(JSONObject jSONObject, C9917q3 q3Var, C9984u2<VideoData> u2Var, C9964t3 t3Var, C9915q1 q1Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray(u2Var.mo65538h());
        if (optJSONArray != null) {
            int u = q1Var.mo65286u();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    if ("additionalData".equals(optJSONObject.optString("type"))) {
                        m28047a(q1Var, q3Var, optJSONObject, u2Var, arrayList2, arrayList);
                    } else {
                        C9711g2<VideoData> newVideoBanner = C9711g2.newVideoBanner();
                        if (t3Var.mo65452c(optJSONObject, newVideoBanner)) {
                            float s = q1Var.mo65284s();
                            if (s >= 0.0f) {
                                newVideoBanner.setPoint(s);
                            }
                            float t = q1Var.mo65285t();
                            if (t >= 0.0f) {
                                newVideoBanner.setPointP(t);
                            }
                            if (u >= 0) {
                                u2Var.mo65529a(newVideoBanner, u);
                                u++;
                            } else {
                                u2Var.mo65528a(newVideoBanner);
                            }
                        }
                    }
                }
            }
            m28048a(arrayList2, arrayList);
        }
    }

    /* renamed from: a */
    public C9930r2 mo63651a(String str, C9915q1 q1Var, C9930r2 r2Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        return C9635c.isVast(str) ? m28044a(str, q1Var, r2Var, aVar) : m28045a(str, q1Var, r2Var, aVar, aVar2, context, l3Var);
    }
}
