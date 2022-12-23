package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.adcolony.sdk.AdColonyAppOptions;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* renamed from: com.fyber.inneractive.sdk.measurement.b */
public class C4461b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11001a;

    /* renamed from: b */
    public final /* synthetic */ C4463d f11002b;

    public C4461b(C4463d dVar, Context context) {
        this.f11002b = dVar;
        this.f11001a = context;
    }

    public void run() {
        try {
            Omid.activate(this.f11001a);
            this.f11002b.f11005c = Partner.createPartner(AdColonyAppOptions.FYBER, InneractiveAdManager.getVersion());
            C4463d.m13814a(this.f11002b, this.f11001a);
            IAlog.m16699a("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th) {
            IAlog.m16699a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.f11002b.getClass();
            C4574r.m14050a(th.getClass().getSimpleName(), String.format("%s - %s", new Object[]{"OpenMeasurementMeasurer", th.getMessage()}), (InneractiveAdRequest) null, (C5291e) null);
        }
    }
}
