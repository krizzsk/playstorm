package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4408e;
import com.fyber.inneractive.sdk.flow.C4423m;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.n */
public class C4427n implements C4408e.C4410b {

    /* renamed from: a */
    public final /* synthetic */ C4423m f10948a;

    public C4427n(C4423m mVar) {
        this.f10948a = mVar;
    }

    /* renamed from: a */
    public void mo24618a(InneractiveAdRequest inneractiveAdRequest, C5291e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        C4419j jVar;
        if (this.f10948a.f10933b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f10948a.mo24611a(inneractiveAdRequest, eVar);
            }
            C4423m mVar = this.f10948a;
            if (mVar.f10941j) {
                if (eVar == null && inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((jVar = mVar.f10936e) == null || jVar.mo24373d() || mVar.f10936e.isVideoAd())) {
                    IAlog.m16699a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                    String arrays = inneractiveInfrastructureError.getCause() != null ? Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace()) : C5370s.m16785a(7, 6);
                    C4565o oVar = C4565o.IA_AD_LOAD_FAILED;
                    JSONArray a = C4309s.m13530a(mVar.f10939h, mVar.f10936e);
                    C4569q.C4570a aVar = new C4569q.C4570a((C5291e) null);
                    aVar.f11364b = oVar;
                    aVar.f11363a = inneractiveAdRequest;
                    aVar.f11366d = a;
                    JSONObject jSONObject = new JSONObject();
                    String inneractiveErrorCode = inneractiveInfrastructureError.getErrorCode().toString();
                    try {
                        jSONObject.put("message", inneractiveErrorCode);
                    } catch (Exception unused) {
                        IAlog.m16703e("Got exception adding param to json object: %s, %s", "message", inneractiveErrorCode);
                    }
                    try {
                        jSONObject.put("description", arrays);
                    } catch (Exception unused2) {
                        IAlog.m16703e("Got exception adding param to json object: %s, %s", "description", arrays);
                    }
                    String description = inneractiveInfrastructureError.description();
                    try {
                        jSONObject.put("extra_description", description);
                    } catch (Exception unused3) {
                        IAlog.m16703e("Got exception adding param to json object: %s, %s", "extra_description", description);
                    }
                    aVar.f11368f.put(jSONObject);
                    aVar.mo24768a((String) null);
                }
                C4423m mVar2 = this.f10948a;
                mVar2.f10933b.onInneractiveFailedAdRequest(mVar2, inneractiveInfrastructureError.getErrorCode());
                return;
            }
            C4423m.C4426c cVar = mVar.f10940i;
            if (cVar != null) {
                cVar.onAdRefreshFailed(mVar, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
