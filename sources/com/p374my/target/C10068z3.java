package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.tracker.ads.AdFormat;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.z3 */
public class C10068z3 {

    /* renamed from: a */
    public final C10069a f25055a;

    /* renamed from: b */
    public final C9915q1 f25056b;

    /* renamed from: c */
    public final C9596a f25057c;

    /* renamed from: d */
    public final Context f25058d;

    /* renamed from: e */
    public final C9735h4 f25059e;

    /* renamed from: com.my.target.z3$a */
    public interface C10069a {
        /* renamed from: a */
        C9916q2 mo63652a(JSONObject jSONObject, C9915q1 q1Var, C9596a aVar, Context context);
    }

    public C10068z3(C10069a aVar, C9915q1 q1Var, C9596a aVar2, Context context) {
        this.f25055a = aVar;
        this.f25056b = q1Var;
        this.f25057c = aVar2;
        this.f25058d = context;
        this.f25059e = C9735h4.m28141a(q1Var, aVar2, context);
    }

    /* renamed from: a */
    public static C10068z3 m29875a(C10069a aVar, C9915q1 q1Var, C9596a aVar2, Context context) {
        return new C10068z3(aVar, q1Var, aVar2, context);
    }

    /* renamed from: a */
    public final C9858n2 mo65861a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        StringBuilder sb;
        String str;
        String sb2;
        String optString = jSONObject.optString("name");
        if (TextUtils.isEmpty(optString)) {
            sb2 = "no name in mediationAdNetwork";
        } else {
            String optString2 = jSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            if (TextUtils.isEmpty(optString2)) {
                sb = new StringBuilder();
                str = "no placementId for ";
            } else {
                String optString3 = jSONObject.optString("adapter");
                if (TextUtils.isEmpty(optString3)) {
                    sb = new StringBuilder();
                    str = "no adapter for ";
                } else {
                    C9858n2 a = C9858n2.m28799a(optString, optString2, optString3);
                    if ("myTarget".equals(optString) && (optJSONObject = jSONObject.optJSONObject(AdFormat.BANNER)) != null) {
                        a.mo64839a(this.f25055a.mo63652a(optJSONObject, this.f25056b, this.f25057c, this.f25058d));
                    }
                    String optString4 = jSONObject.optString("payload");
                    if (!TextUtils.isEmpty(optString4)) {
                        a.mo64840a(optString4);
                    }
                    int optInt = jSONObject.optInt("timeout", a.mo64849i());
                    if (optInt > 0) {
                        a.mo64838a(optInt);
                    } else {
                        mo65862a("Bad value", "timeout <= 0 for " + optString + " mediationAdNetwork");
                    }
                    a.mo64837a((float) jSONObject.optDouble("priority", (double) a.mo64846f()));
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
                    if (optJSONObject2 != null) {
                        Iterator<String> keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!TextUtils.isEmpty(next)) {
                                a.mo64841a(next, optJSONObject2.optString(next));
                            }
                        }
                    }
                    this.f25059e.mo64167a(a.mo64848h(), jSONObject, optString, -1.0f);
                    return a;
                }
            }
            sb.append(str);
            sb.append(optString);
            sb.append(" mediationAdNetwork");
            sb2 = sb.toString();
        }
        mo65862a("Required field", sb2);
        return null;
    }

    /* renamed from: a */
    public final void mo65862a(String str, String str2) {
        String str3 = this.f25056b.f24531a;
        C9796k3 a = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f25057c.getSlotId());
        if (str3 == null) {
            str3 = this.f25056b.f24532b;
        }
        a.mo64577b(str3).mo64578b(this.f25058d);
    }

    /* renamed from: b */
    public C9839m2 mo65863b(JSONObject jSONObject) {
        C9858n2 a;
        JSONArray optJSONArray = jSONObject.optJSONArray("networks");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        C9839m2 c = C9839m2.m28656c();
        int optInt = jSONObject.optInt("refreshTimeout", c.mo64721a());
        if (optInt >= 0) {
            c.mo64722a(optInt);
        } else {
            mo65862a("Bad value", "refreshTimeout < 0");
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (a = mo65861a(optJSONObject)) == null)) {
                c.mo64723a(a);
            }
        }
        if (c.mo64724b()) {
            return c;
        }
        return null;
    }
}
