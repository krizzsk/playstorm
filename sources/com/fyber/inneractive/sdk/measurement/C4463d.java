package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4237c;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4543f0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* renamed from: com.fyber.inneractive.sdk.measurement.d */
public class C4463d extends C4459a {

    /* renamed from: b */
    public String f11004b;

    /* renamed from: c */
    public Partner f11005c;

    /* renamed from: a */
    public static void m13814a(C4463d dVar, Context context) {
        dVar.getClass();
        C4543f0 f0Var = new C4543f0(new C4462c(dVar), context, new C4237c(String.format("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/%s.js", new Object[]{Omid.getVersion()}), "omid-latest.js"));
        IAConfigManager.f10525J.f10555t.f11387a.offer(f0Var);
        f0Var.mo24717a(C4559m0.QUEUED);
    }
}
