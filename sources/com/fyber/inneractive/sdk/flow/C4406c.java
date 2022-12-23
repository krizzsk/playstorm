package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.metrics.C4473c;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.c */
public abstract class C4406c<Response extends C5291e, Content extends C4419j> implements C4452a {

    /* renamed from: a */
    public InneractiveAdRequest f10870a;

    /* renamed from: b */
    public Response f10871b;

    /* renamed from: c */
    public Content f10872c;

    /* renamed from: d */
    public C4452a.C4453a f10873d;

    /* renamed from: e */
    public C4346z f10874e;

    /* renamed from: f */
    public C4309s f10875f;

    /* renamed from: g */
    public boolean f10876g = false;

    /* renamed from: a */
    public void mo24566a() {
        this.f10870a = null;
        this.f10871b = null;
        this.f10872c = null;
        this.f10873d = null;
        this.f10874e = null;
    }

    /* renamed from: b */
    public abstract String mo24370b();

    /* renamed from: c */
    public C4346z mo24570c() {
        InneractiveAdRequest inneractiveAdRequest = this.f10870a;
        return inneractiveAdRequest == null ? this.f10874e : inneractiveAdRequest.getSelectedUnitConfig();
    }

    /* renamed from: d */
    public void mo24571d() {
        String str;
        InneractiveAdRequest inneractiveAdRequest = this.f10870a;
        if (inneractiveAdRequest != null) {
            C4473c.f11045c.mo24671a(inneractiveAdRequest.f10864b).mo24680i();
        } else {
            Response response = this.f10871b;
            if (!(response == null || (str = response.f14091z) == null)) {
                C4473c.f11045c.mo24671a(str).mo24680i();
            }
        }
        C4452a.C4453a aVar = this.f10873d;
        if (aVar != null) {
            aVar.mo24578a();
        }
    }

    /* renamed from: e */
    public abstract void mo24371e();

    /* renamed from: a */
    public void mo24567a(InneractiveAdRequest inneractiveAdRequest, C5291e eVar, C4309s sVar, C4452a.C4453a aVar) {
        this.f10870a = inneractiveAdRequest;
        this.f10871b = eVar;
        this.f10873d = aVar;
        this.f10875f = sVar;
        if (inneractiveAdRequest == null) {
            this.f10874e = C4261a.m13439b(eVar.f14078m);
        }
        try {
            mo24371e();
        } catch (Throwable th) {
            IAlog.m16703e("Failed to start ContentLoader", IAlog.m16696a((Object) this));
            C4574r.m14051a(th, inneractiveAdRequest, eVar);
            mo24569a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
        }
    }

    /* renamed from: a */
    public void mo24568a(InneractiveError inneractiveError) {
        C5357n.m16773a(new C4403a(new C4405b(this.f10871b, this.f10870a, mo24370b(), this.f10875f.mo24342c()), inneractiveError));
    }

    /* renamed from: a */
    public void mo24569a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        Content content;
        String str;
        if (this.f10873d != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f10870a;
            Response response = this.f10871b;
            if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((content = this.f10872c) == null || content.mo24373d() || this.f10872c.isVideoAd())) {
                IAlog.m16699a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                if (inneractiveInfrastructureError.getCause() != null) {
                    str = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    str = C5370s.m16785a(7, 6);
                }
                C4309s sVar = this.f10875f;
                JSONArray c = sVar == null ? null : sVar.mo24342c();
                C4565o oVar = C4565o.IA_AD_LOAD_FAILED;
                C4569q.C4570a aVar = new C4569q.C4570a(response);
                aVar.f11364b = oVar;
                aVar.f11363a = inneractiveAdRequest;
                aVar.f11366d = c;
                JSONObject jSONObject = new JSONObject();
                String inneractiveErrorCode = inneractiveInfrastructureError.getErrorCode().toString();
                try {
                    jSONObject.put("message", inneractiveErrorCode);
                } catch (Exception unused) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "message", inneractiveErrorCode);
                }
                try {
                    jSONObject.put("description", str);
                } catch (Exception unused2) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "description", str);
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
            this.f10873d.mo24580a(inneractiveInfrastructureError);
        }
    }
}
