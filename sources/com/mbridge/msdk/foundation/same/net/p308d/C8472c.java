package com.mbridge.msdk.foundation.same.net.p308d;

import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p309e.C8479c;
import com.mbridge.msdk.foundation.same.net.p310f.C8482b;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.c */
/* compiled from: JsonArrayRequest */
public class C8472c extends C8474e<JSONArray> {

    /* renamed from: c */
    private static final String f20479c = C8472c.class.getSimpleName();

    public C8472c(int i, String str, String str2, C8476e<JSONArray> eVar) {
        super(i, str, str2, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8501k<JSONArray> mo57571a(C8479c cVar) {
        try {
            return C8501k.m24570a(new JSONArray(new String(cVar.f20492b, C8482b.m24482a(cVar.f20494d))), cVar);
        } catch (UnsupportedEncodingException e) {
            C8608u.m24884d(f20479c, e.getMessage());
            return C8501k.m24569a(new C8452a(8, cVar));
        } catch (JSONException e2) {
            C8608u.m24884d(f20479c, e2.getMessage());
            return C8501k.m24569a(new C8452a(8, cVar));
        }
    }
}
