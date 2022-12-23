package com.fyber.inneractive.sdk.bidder.adm;

import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.adm.C4226e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C4423m;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.a */
public class C4221a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4226e.C4227a f10425a;

    /* renamed from: b */
    public final /* synthetic */ C4226e f10426b;

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.a$a */
    public class C4222a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f10427a;

        public C4222a(Exception exc) {
            this.f10427a = exc;
        }

        public void run() {
            C4226e.C4227a aVar = C4221a.this.f10425a;
            if (aVar != null) {
                ((C4423m.C4424a) aVar).mo24616a(this.f10427a, InneractiveErrorCode.INVALID_INPUT, new C5291e[0]);
            }
        }
    }

    public C4221a(C4226e eVar, C4226e.C4227a aVar) {
        this.f10426b = eVar;
        this.f10425a = aVar;
    }

    public void run() {
        try {
            byte[] decode = Base64.decode(this.f10426b.f10434b, 0);
            this.f10426b.f10433a = AdmParametersOuterClass$AdmParameters.parseFrom(decode);
            C4226e.m13383a(this.f10426b, this.f10425a);
        } catch (Exception e) {
            IAlog.m16703e("failed to parse ad markup payload %s", e.getMessage());
            C5357n.f14225b.post(new C4222a(e));
        }
    }
}
