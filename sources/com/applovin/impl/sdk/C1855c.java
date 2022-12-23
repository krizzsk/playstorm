package com.applovin.impl.sdk;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.p046ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.impl.sdk.p046ad.C1835f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.c */
public class C1855c {

    /* renamed from: a */
    private final C1959m f3013a;

    /* renamed from: b */
    private final C2092v f3014b;

    /* renamed from: c */
    private final Object f3015c = new Object();

    /* renamed from: d */
    private final Map<C1828d, C2095x> f3016d = new HashMap();

    /* renamed from: e */
    private final Map<C1828d, C2095x> f3017e = new HashMap();

    C1855c(C1959m mVar) {
        this.f3013a = mVar;
        this.f3014b = mVar.mo14286A();
        for (C1828d next : C1828d.m3849f()) {
            this.f3016d.put(next, new C2095x());
            this.f3017e.put(next, new C2095x());
        }
    }

    /* renamed from: d */
    private C2095x m4015d(C1828d dVar) {
        C2095x xVar;
        synchronized (this.f3015c) {
            xVar = this.f3016d.get(dVar);
            if (xVar == null) {
                xVar = new C2095x();
                this.f3016d.put(dVar, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: e */
    private C2095x m4016e(C1828d dVar) {
        C2095x xVar;
        synchronized (this.f3015c) {
            xVar = this.f3017e.get(dVar);
            if (xVar == null) {
                xVar = new C2095x();
                this.f3017e.put(dVar, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: f */
    private C2095x m4017f(C1828d dVar) {
        synchronized (this.f3015c) {
            C2095x e = m4016e(dVar);
            if (e.mo14797a() > 0) {
                return e;
            }
            C2095x d = m4015d(dVar);
            return d;
        }
    }

    /* renamed from: a */
    public AppLovinAdImpl mo14052a(C1828d dVar) {
        C1835f fVar;
        StringBuilder sb;
        String str;
        synchronized (this.f3015c) {
            C2095x d = m4015d(dVar);
            if (d.mo14797a() > 0) {
                m4016e(dVar).mo14798a(d.mo14800c());
                fVar = new C1835f(dVar, this.f3013a);
            } else {
                fVar = null;
            }
        }
        if (C2092v.m5047a()) {
            C2092v vVar = this.f3014b;
            if (fVar != null) {
                str = "Retrieved ad of zone ";
            } else {
                sb = new StringBuilder();
                str = "Unable to retrieve ad of zone ";
            }
            sb.append(str);
            sb.append(dVar);
            sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
            vVar.mo14789b("AdPreloadManager", sb.toString());
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14053a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f3015c) {
            m4015d(appLovinAdImpl.getAdZone()).mo14798a(appLovinAdImpl);
            if (C2092v.m5047a()) {
                C2092v vVar = this.f3014b;
                vVar.mo14789b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    /* renamed from: b */
    public AppLovinAdImpl mo14054b(C1828d dVar) {
        AppLovinAdImpl c;
        synchronized (this.f3015c) {
            c = m4017f(dVar).mo14800c();
        }
        return c;
    }

    /* renamed from: c */
    public AppLovinAdBase mo14055c(C1828d dVar) {
        AppLovinAdImpl d;
        synchronized (this.f3015c) {
            d = m4017f(dVar).mo14801d();
        }
        return d;
    }
}
