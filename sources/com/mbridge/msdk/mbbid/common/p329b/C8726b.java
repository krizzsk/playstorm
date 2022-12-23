package com.mbridge.msdk.mbbid.common.p329b;

import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbid.common.b.b */
/* compiled from: BidResponseHandler */
public abstract class C8726b extends C8480f<JSONObject> {

    /* renamed from: a */
    private static final String f21158a = C8726b.class.getSimpleName();

    /* renamed from: a */
    public abstract void mo58067a(int i, String str);

    /* renamed from: a */
    public abstract void mo58068a(BidResponsedEx bidResponsedEx);

    public C8726b(String str, String str2) {
        this.f20497d = str2;
        this.f20498e = str;
    }

    /* renamed from: a */
    public final void mo57520a(C8501k<JSONObject> kVar) {
        super.mo57520a(kVar);
        if (kVar != null && kVar.f20596c != null) {
            List<C8457b> list = kVar.f20596c.f20494d;
            JSONObject jSONObject = (JSONObject) kVar.f20594a;
            int optInt = jSONObject.optInt("status");
            if (200 == optInt) {
                BidResponsedEx parseBidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject("data"), this.f20497d);
                if (parseBidResponsedEx != null) {
                    mo58068a(parseBidResponsedEx);
                } else {
                    mo58067a(optInt, jSONObject.optString("msg"));
                }
            } else {
                mo58067a(optInt, jSONObject.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        mo58067a(aVar.f20430a, C8481a.m24481a(aVar));
    }
}
