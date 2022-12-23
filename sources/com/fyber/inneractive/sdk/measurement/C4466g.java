package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.response.C5293g;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.g */
public class C4466g {

    /* renamed from: a */
    public AdSession f11013a;

    /* renamed from: b */
    public AdEvents f11014b;

    /* renamed from: c */
    public MediaEvents f11015c;

    /* renamed from: d */
    public boolean f11016d = false;

    /* renamed from: e */
    public boolean f11017e = false;

    /* renamed from: f */
    public C4450y f11018f;

    /* renamed from: a */
    public final void mo24663a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", new Object[]{"OpenMeasurementNativeVideoTracker", th.getMessage()});
        C4450y yVar = this.f11018f;
        C5293g gVar = null;
        InneractiveAdRequest inneractiveAdRequest = yVar != null ? yVar.f10913a : null;
        if (yVar != null) {
            gVar = (C5293g) yVar.f10914b;
        }
        C4574r.m14050a(simpleName, format, inneractiveAdRequest, gVar);
    }

    /* renamed from: a */
    public final List<VerificationScriptResource> mo24662a(List<C4468i> list) {
        VerificationScriptResource verificationScriptResource;
        ArrayList arrayList = new ArrayList();
        for (C4468i next : list) {
            VerificationScriptResource verificationScriptResource2 = null;
            try {
                if (next.f11021a != null) {
                    if (TextUtils.isEmpty(next.f11025e) || TextUtils.isEmpty(next.f11024d)) {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(next.f11021a);
                    } else {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(next.f11025e, next.f11021a, next.f11024d);
                    }
                    verificationScriptResource2 = verificationScriptResource;
                }
            } catch (Throwable th) {
                mo24663a(th);
            }
            if (verificationScriptResource2 != null) {
                arrayList.add(verificationScriptResource2);
            }
        }
        return arrayList;
    }
}
