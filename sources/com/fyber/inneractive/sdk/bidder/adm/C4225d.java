package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.C4226e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C4423m;
import com.fyber.inneractive.sdk.response.C5291e;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.d */
public class C4225d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4226e.C4227a f10432a;

    public C4225d(C4226e eVar, C4226e.C4227a aVar) {
        this.f10432a = aVar;
    }

    public void run() {
        C4226e.C4227a aVar = this.f10432a;
        if (aVar != null) {
            ((C4423m.C4424a) aVar).mo24616a(new Exception("adm payload must contain ad url"), InneractiveErrorCode.INVALID_INPUT, new C5291e[0]);
        }
    }
}
