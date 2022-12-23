package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.my.target.f4 */
public class C9699f4 {

    /* renamed from: a */
    public final C9915q1 f23877a;

    /* renamed from: b */
    public final C9596a f23878b;

    /* renamed from: c */
    public final Context f23879c;

    /* renamed from: d */
    public final C9946s3 f23880d;

    /* renamed from: e */
    public boolean f23881e = true;

    public C9699f4(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f23877a = q1Var;
        this.f23878b = aVar;
        this.f23879c = context;
        this.f23880d = C9946s3.m29202a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C9699f4 m28021a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9699f4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final void mo64018a(String str, String str2, String str3) {
        if (this.f23881e) {
            String str4 = this.f23877a.f24531a;
            C9796k3 c = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f23878b.getSlotId()).mo64579c(str3);
            if (str4 == null) {
                str4 = this.f23877a.f24532b;
            }
            c.mo64577b(str4).mo64578b(this.f23879c);
        }
    }

    /* renamed from: a */
    public boolean mo64019a(JSONObject jSONObject, C9821l2 l2Var, String str) {
        this.f23880d.mo65361a(jSONObject, (C10066z1) l2Var);
        this.f23881e = l2Var.isLogErrors();
        if (!TJAdUnitConstants.String.HTML.equals(l2Var.getType())) {
            C9672e0.m27882a("standard banner with unsupported type " + l2Var.getType());
            return false;
        }
        if (jSONObject.has("timeout")) {
            int optInt = jSONObject.optInt("timeout");
            if (optInt >= 5) {
                l2Var.setTimeout(optInt);
            } else {
                mo64018a("Required field", "Wrong banner timeout: " + optInt, l2Var.getId());
            }
        }
        String c = C9946s3.m29204c(jSONObject);
        if (TextUtils.isEmpty(c)) {
            mo64018a("Required field", "Banner has no source field", l2Var.getId());
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            l2Var.setMraidJs(str);
            String a = C9946s3.m29203a(str, c);
            if (a != null) {
                l2Var.setSource(a);
                l2Var.setType(CampaignEx.JSON_KEY_MRAID);
                c = a;
            }
        }
        if (l2Var.getOmData() != null) {
            c = C9897p3.m28963a(c);
        }
        l2Var.setSource(c);
        return true;
    }
}
