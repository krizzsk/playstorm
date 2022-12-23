package com.mbridge.msdk.foundation.same.net.p311g;

import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.c */
/* compiled from: CommonMBListener */
public abstract class C8493c extends C8480f<JSONObject> {
    /* renamed from: a */
    public abstract void mo15581a(String str);

    /* renamed from: a */
    public abstract void mo15582a(JSONObject jSONObject);

    /* renamed from: a */
    public final void mo57520a(C8501k<JSONObject> kVar) {
        if (kVar != null) {
            int optInt = ((JSONObject) kVar.f20594a).optInt("status");
            if (optInt == 1 || optInt == 200) {
                mo15582a(((JSONObject) kVar.f20594a).optJSONObject("data"));
            } else {
                mo15581a(((JSONObject) kVar.f20594a).optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        mo15581a(C8481a.m24481a(aVar));
    }
}
