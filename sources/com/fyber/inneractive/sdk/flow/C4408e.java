package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4314j;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4344x;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4423m;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.metrics.C4471b;
import com.fyber.inneractive.sdk.metrics.C4473c;
import com.fyber.inneractive.sdk.network.C4560n;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.flow.e */
public abstract class C4408e implements C4560n.C4563c, C4452a.C4453a {

    /* renamed from: a */
    public final Runnable f10877a = new C4409a();

    /* renamed from: b */
    public long f10878b = 0;

    /* renamed from: c */
    public C4452a f10879c;

    /* renamed from: d */
    public C4410b f10880d;

    /* renamed from: e */
    public InneractiveAdRequest f10881e;

    /* renamed from: f */
    public C4309s f10882f;

    /* renamed from: g */
    public C4560n f10883g;

    /* renamed from: com.fyber.inneractive.sdk.flow.e$a */
    public class C4409a implements Runnable {
        public C4409a() {
        }

        public void run() {
            C4408e.this.mo24575e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.e$b */
    public interface C4410b {
    }

    /* renamed from: a */
    public void mo24579a(InneractiveAdRequest inneractiveAdRequest, C5291e eVar, InneractiveErrorCode inneractiveErrorCode) {
        mo24581b();
        if (IAlog.f14137a <= 3) {
            Thread.dumpStack();
        }
        IAlog.m16702d("%sgot onAdRequestFailed! with: %s", mo24574d(), inneractiveErrorCode);
        if (this.f10880d != null) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            if (!(eVar == null || eVar.f14074i == null)) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f14074i + ": " + eVar.f14075j));
            }
            ((C4427n) this.f10880d).mo24618a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    /* renamed from: b */
    public void mo24581b() {
        if (this.f10878b > 0) {
            IAlog.m16699a("%scancel in flight timeout after %d millis", mo24574d(), Long.valueOf(System.currentTimeMillis() - this.f10878b));
            C5357n.f14225b.removeCallbacks(this.f10877a);
            this.f10878b = 0;
        }
    }

    /* renamed from: c */
    public C5291e mo24582c() {
        C4452a aVar = this.f10879c;
        if (aVar == null) {
            return null;
        }
        C4406c cVar = (C4406c) aVar;
        if (cVar.f10872c != null) {
            return cVar.f10872c.mo24367c();
        }
        return null;
    }

    /* renamed from: d */
    public String mo24574d() {
        return IAlog.m16696a((Object) this);
    }

    /* renamed from: e */
    public void mo24575e() {
        IAlog.m16699a("%sin flight timeout reached after %d millis", mo24574d(), Long.valueOf(System.currentTimeMillis() - this.f10878b));
        C4452a aVar = this.f10879c;
        if (aVar != null) {
            aVar.mo24566a();
            this.f10879c = null;
        }
    }

    /* renamed from: f */
    public void mo24583f() {
        int i;
        C4344x a;
        mo24581b();
        InneractiveAdRequest inneractiveAdRequest = this.f10881e;
        if (inneractiveAdRequest instanceof C4404a0) {
            inneractiveAdRequest.getClass();
        }
        UnitDisplayType unitDisplayType = null;
        InneractiveAdRequest inneractiveAdRequest2 = this.f10881e;
        if (!(inneractiveAdRequest2 == null || (a = C4261a.m13436a(inneractiveAdRequest2.getSpotId())) == null)) {
            for (C4345y yVar : a.f10743a) {
                C4327r rVar = yVar.f10747c;
                if (rVar != null) {
                    unitDisplayType = rVar.f10691b;
                }
            }
        }
        C4314j jVar = IAConfigManager.f10525J.f10558w;
        jVar.getClass();
        if (unitDisplayType == UnitDisplayType.BANNER) {
            i = jVar.f10665a.f10660b.mo24345a("in_flight_banner_timeout_sec", 10, 3);
        } else {
            i = jVar.f10665a.f10660b.mo24345a("in_flight_interstitial_timeout_sec", 25, 3);
        }
        C5357n.f14225b.postDelayed(this.f10877a, TimeUnit.SECONDS.toMillis((long) i));
        this.f10878b = System.currentTimeMillis();
        IAlog.m16699a("%sstart in flight timeout", mo24574d());
    }

    /* renamed from: a */
    public void mo24578a() {
        T t;
        C4449x xVar;
        mo24581b();
        IAlog.m16702d("%sgot onAdLoaded!", mo24574d());
        C4452a aVar = this.f10879c;
        if (aVar != null) {
            C4410b bVar = this.f10880d;
            if (bVar != null) {
                InneractiveAdRequest inneractiveAdRequest = this.f10881e;
                Content content = ((C4406c) aVar).f10872c;
                C4427n nVar = (C4427n) bVar;
                C4423m mVar = nVar.f10948a;
                if (mVar.f10941j || (xVar = mVar.f10937f) == null || !xVar.supportsRefresh()) {
                    boolean unused = nVar.f10948a.f10941j = false;
                    C4423m mVar2 = nVar.f10948a;
                    mVar2.f10936e = content;
                    content.f10913a = inneractiveAdRequest;
                    if (!mVar2.mo24615d()) {
                        C4423m mVar3 = nVar.f10948a;
                        mVar3.getClass();
                        IAlog.m16699a("%sCannot find appropriate unit controller for unit: %s", IAlog.m16696a((Object) mVar3), nVar.f10948a.f10936e.f10916d);
                        C4407d dVar = nVar.f10948a.f10939h;
                        C5291e c = dVar != null ? dVar.mo24582c() : null;
                        InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.INVALID_INPUT;
                        nVar.mo24618a(inneractiveAdRequest, c, new InneractiveInfrastructureError(inneractiveErrorCode, new Exception("Cannot find appropriate unit controller for unit: " + nVar.f10948a.f10936e.f10916d)));
                        nVar.f10948a.f10936e = null;
                    } else {
                        C4423m mVar4 = nVar.f10948a;
                        InneractiveAdSpot.RequestListener requestListener = mVar4.f10933b;
                        if (requestListener != null) {
                            requestListener.onInneractiveSuccessfulAdRequest(mVar4);
                        }
                    }
                } else if (nVar.f10948a.f10937f.canRefreshAd()) {
                    C4423m mVar5 = nVar.f10948a;
                    mVar5.f10936e = content;
                    content.f10913a = inneractiveAdRequest;
                    C4423m.C4426c cVar = mVar5.f10940i;
                    if (cVar != null) {
                        cVar.onAdRefreshed(mVar5);
                    } else {
                        C4449x xVar2 = mVar5.f10937f;
                        if (xVar2 instanceof InneractiveAdViewUnitController) {
                            ((InneractiveAdViewUnitController) xVar2).onAdRefreshed(mVar5);
                        }
                    }
                } else {
                    C4423m mVar6 = nVar.f10948a;
                    mVar6.getClass();
                    IAlog.m16699a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", IAlog.m16696a((Object) mVar6));
                    C4423m mVar7 = nVar.f10948a;
                    mVar7.f10940i.onAdRefreshFailed(mVar7, InneractiveErrorCode.CANCELLED);
                }
                String str = nVar.f10948a.f10932a;
                C4473c cVar2 = C4473c.f11045c;
                cVar2.mo24671a(str).mo24676e();
                cVar2.mo24671a(str).mo24673b();
                C4423m mVar8 = nVar.f10948a;
                C4419j jVar = mVar8.f10936e;
                if (!(jVar == null || (t = jVar.f10914b) == null || t.f14079n == null)) {
                    C4419j jVar2 = mVar8.f10936e;
                    T t2 = jVar2.f10914b;
                    new C4471b(t2, mVar8.f10934c, mVar8.f10932a, t2.f14079n, jVar2.f10915c.mo24342c()).mo24669a();
                }
            }
            this.f10879c = null;
        }
    }

    /* renamed from: a */
    public void mo24580a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        mo24581b();
        IAlog.m16702d("%sgot onFailedLoading! with: %s", mo24574d(), inneractiveInfrastructureError);
        C4410b bVar = this.f10880d;
        if (bVar != null) {
            ((C4427n) bVar).mo24618a(this.f10881e, mo24582c(), inneractiveInfrastructureError);
        }
    }
}
