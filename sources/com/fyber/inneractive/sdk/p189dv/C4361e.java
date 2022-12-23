package com.fyber.inneractive.sdk.p189dv;

import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p189dv.enums.C4362a;
import com.fyber.inneractive.sdk.p189dv.handler.C4368c;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.response.C5291e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.e */
public class C4361e extends C5288b {
    /* renamed from: a */
    public void mo24394a(String str, C4345y yVar) {
        try {
            ((C4363f) this.f14055a).f10768B = new JSONObject(str).getString("adm");
        } catch (JSONException e) {
            C4368c.m13611a(yVar != null ? yVar.f10746b : null, C4362a.Parse, (InneractiveAdRequest) null, (C5291e) null, e.getLocalizedMessage());
        }
    }

    /* renamed from: b */
    public boolean mo24395b() {
        return true;
    }

    /* renamed from: a */
    public C5291e mo24393a() {
        return new C4363f();
    }
}
