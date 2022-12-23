package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4423m;
import com.fyber.inneractive.sdk.flow.C4429p;
import com.fyber.inneractive.sdk.flow.C4438v;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.e */
public class C5447e implements C4429p, C4438v {

    /* renamed from: a */
    public InneractiveUnitController<?> f14444a;

    /* renamed from: b */
    public C4419j f14445b;

    /* renamed from: c */
    public final String f14446c;

    /* renamed from: d */
    public boolean f14447d = false;

    public C5447e(InneractiveUnitController<?> inneractiveUnitController, C4419j jVar) {
        this.f14444a = inneractiveUnitController;
        this.f14445b = jVar;
        this.f14446c = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public void mo24610a() {
        C4419j jVar = this.f14445b;
        if (jVar != null) {
            jVar.mo24365a();
        }
        this.f14445b = null;
        this.f14444a = null;
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    /* renamed from: a */
    public void mo24612a(C4423m.C4426c cVar) {
    }

    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    public void destroy() {
        InneractiveUnitController<?> inneractiveUnitController = this.f14444a;
        if (inneractiveUnitController != null) {
            inneractiveUnitController.destroy();
        }
        mo24610a();
    }

    public C4419j getAdContent() {
        return this.f14445b;
    }

    public InneractiveAdRequest getCurrentProcessedRequest() {
        return null;
    }

    public String getLocalUniqueId() {
        return this.f14446c;
    }

    public InneractiveMediationName getMediationName() {
        return null;
    }

    public String getMediationNameString() {
        return null;
    }

    public String getMediationVersion() {
        return "";
    }

    public String getRequestedSpotId() {
        return "";
    }

    public InneractiveUnitController getSelectedUnitController() {
        return this.f14444a;
    }

    public boolean isReady() {
        C4419j jVar = this.f14445b;
        if (jVar == null) {
            return false;
        }
        boolean z = jVar.mo24367c() != null && this.f14445b.mo24367c().mo26391d();
        if (z) {
            C4419j jVar2 = this.f14445b;
            C5291e c = jVar2.mo24367c();
            if (!this.f14447d && c != null && c.f14068c != 0 && c.mo26391d()) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(c.f14066a - System.currentTimeMillis());
                long j = c.f14067b;
                IAlog.m16699a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", new Object[]{Long.valueOf(minutes), Long.valueOf(j)}), new Object[0]);
                C4565o oVar = C4565o.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = jVar2.f10913a;
                JSONArray c2 = jVar2.f10915c.mo24342c();
                C4569q.C4570a aVar = new C4569q.C4570a(c);
                aVar.f11364b = oVar;
                aVar.f11363a = inneractiveAdRequest;
                aVar.f11366d = c2;
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(minutes);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (Exception unused) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                Long valueOf2 = Long.valueOf(j);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (Exception unused2) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                aVar.f11368f.put(jSONObject);
                aVar.mo24768a((String) null);
                this.f14447d = true;
            }
        }
        return !z;
    }

    public void loadAd(String str) {
    }

    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
    }

    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
    }

    public void setMediationName(String str) {
    }

    public void setMediationVersion(String str) {
    }

    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
    }
}
