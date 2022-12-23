package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.response.C5291e;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.Partner;

/* renamed from: com.fyber.inneractive.sdk.measurement.f */
public class C4465f implements C4459a.C4460a {

    /* renamed from: a */
    public final Partner f11007a;

    /* renamed from: b */
    public AdSession f11008b;

    /* renamed from: c */
    public AdEvents f11009c;

    /* renamed from: d */
    public boolean f11010d = false;

    /* renamed from: e */
    public WebView f11011e;

    /* renamed from: f */
    public C4419j f11012f;

    public C4465f(Partner partner, WebView webView, C4419j jVar) {
        this.f11007a = partner;
        this.f11011e = webView;
        this.f11012f = jVar;
    }

    /* renamed from: a */
    public final void mo24661a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", new Object[]{"OpenMeasurementMraidTracker", th.getMessage()});
        C4419j jVar = this.f11012f;
        C5291e eVar = null;
        InneractiveAdRequest inneractiveAdRequest = jVar != null ? jVar.f10913a : null;
        if (jVar != null) {
            eVar = jVar.mo24367c();
        }
        C4574r.m14050a(simpleName, format, inneractiveAdRequest, eVar);
    }
}
