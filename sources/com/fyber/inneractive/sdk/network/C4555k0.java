package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C4226e;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.k0 */
public class C4555k0 extends C4540e0<C5291e> {

    /* renamed from: g */
    public final String f11254g;

    /* renamed from: h */
    public final C4226e f11255h;

    public C4555k0(C4579u<C5291e> uVar, String str, C4226e eVar) {
        super(uVar, C4580v.m14056b().mo24773a());
        this.f11254g = str;
        this.f11255h = eVar;
    }

    /* renamed from: a */
    public String mo24715a() {
        return this.f11254g;
    }

    /* renamed from: f */
    public C4557l0 mo24722f() {
        return C4557l0.HIGH;
    }

    /* renamed from: j */
    public boolean mo24726j() {
        return false;
    }

    /* renamed from: n */
    public C4586y mo24730n() {
        return C4586y.f11398d;
    }

    /* renamed from: p */
    public int mo24731p() {
        return 0;
    }

    /* renamed from: a */
    public C4530a0 mo24713a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        int i2;
        C4530a0 a0Var = new C4530a0();
        if (inputStream != null) {
            try {
                String stringBuffer = C5370s.m16788a(inputStream, false).toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f11255h.f10433a;
                if (admParametersOuterClass$AdmParameters != null) {
                    i2 = admParametersOuterClass$AdmParameters.getAdType().mo24088a();
                } else {
                    i2 = AdmParametersOuterClass$AdmParameters.C4215a.UNRECOGNIZED.mo24088a();
                }
                C4226e eVar = this.f11255h;
                eVar.f10435c = stringBuffer;
                T a = mo24746a(i2, (C4558m) null, eVar, (C4364g) null);
                a.f14073h = stringBuffer;
                a0Var.f11197a = a;
            } catch (Exception e) {
                IAlog.m16698a("failed parse adm network request", e, new Object[0]);
                throw new C4587z(e);
            }
        }
        return a0Var;
    }
}
