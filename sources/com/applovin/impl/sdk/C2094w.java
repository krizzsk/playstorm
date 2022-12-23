package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p028a.C1578f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.w */
public class C2094w {

    /* renamed from: a */
    private final C1959m f4103a;

    /* renamed from: b */
    private final C2092v f4104b;

    /* renamed from: c */
    private final Map<String, C1573a> f4105c = new HashMap(4);

    /* renamed from: d */
    private final Object f4106d = new Object();

    C2094w(C1959m mVar) {
        this.f4103a = mVar;
        this.f4104b = mVar.mo14286A();
    }

    /* renamed from: a */
    public C1573a mo14794a(String str) {
        C1573a aVar;
        synchronized (this.f4106d) {
            aVar = this.f4105c.get(str);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo14795a(C1573a aVar) {
        synchronized (this.f4106d) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f4104b;
                vVar.mo14789b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            this.f4105c.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* renamed from: b */
    public void mo14796b(C1573a aVar) {
        synchronized (this.f4106d) {
            String adUnitId = aVar.getAdUnitId();
            C1578f fVar = this.f4105c.get(adUnitId);
            if (aVar == fVar) {
                if (C2092v.m5047a()) {
                    C2092v vVar = this.f4104b;
                    vVar.mo14789b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + fVar);
                }
                this.f4105c.remove(adUnitId);
            } else if (C2092v.m5047a()) {
                C2092v vVar2 = this.f4104b;
                vVar2.mo14789b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + fVar);
            }
        }
    }
}
