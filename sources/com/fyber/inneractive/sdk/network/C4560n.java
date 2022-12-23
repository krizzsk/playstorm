package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4281e;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.flow.C4403a;
import com.fyber.inneractive.sdk.flow.C4405b;
import com.fyber.inneractive.sdk.flow.C4406c;
import com.fyber.inneractive.sdk.flow.C4408e;
import com.fyber.inneractive.sdk.flow.C4427n;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.network.C4532b0;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.network.n */
public class C4560n {

    /* renamed from: a */
    public InneractiveAdRequest f11292a;

    /* renamed from: b */
    public C4309s f11293b;

    /* renamed from: c */
    public C4563c f11294c;

    /* renamed from: d */
    public final String f11295d;

    /* renamed from: e */
    public volatile boolean f11296e = false;

    /* renamed from: f */
    public final C4536c0 f11297f;

    /* renamed from: com.fyber.inneractive.sdk.network.n$a */
    public class C4561a implements C4579u<C5291e> {
        public C4561a() {
        }

        /* renamed from: a */
        public void mo24228a(Object obj, Exception exc, boolean z) {
            InneractiveErrorCode inneractiveErrorCode;
            C5291e eVar = (C5291e) obj;
            if (exc == null) {
                C4560n.this.mo24764a(eVar);
                return;
            }
            C4560n.this.getClass();
            if (exc instanceof C4564n0) {
                if (((C4564n0) exc).f11300a == 204) {
                    inneractiveErrorCode = InneractiveErrorCode.NO_FILL;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.SERVER_INTERNAL_ERROR;
                }
            } else if (exc instanceof FileNotFoundException) {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            } else if (exc instanceof C4587z) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            } else {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            }
            C4560n nVar = C4560n.this;
            if (nVar.f11294c != null) {
                if (nVar.f11296e) {
                    IAlog.m16702d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                } else {
                    nVar.mo24763a(inneractiveErrorCode, eVar);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.n$b */
    public class C4562b implements C4532b0.C4533a {
        public C4562b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24229a(java.lang.String r5) {
            /*
                r4 = this;
                int r0 = r5.hashCode()
                r1 = -1392135285(0xffffffffad05b38b, float:-7.600041E-12)
                r2 = 2
                r3 = 1
                if (r0 == r1) goto L_0x002c
                r1 = 740780854(0x2c276b36, float:2.3791641E-12)
                if (r0 == r1) goto L_0x0021
                r1 = 1745989196(0x6811ae4c, float:2.7518334E24)
                if (r0 == r1) goto L_0x0016
                goto L_0x0034
            L_0x0016:
                java.lang.String r0 = "sdkParsedResponse"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L_0x001f
                goto L_0x0034
            L_0x001f:
                r5 = r2
                goto L_0x0037
            L_0x0021:
                java.lang.String r0 = "sdkGotServerResponse"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L_0x002a
                goto L_0x0034
            L_0x002a:
                r5 = r3
                goto L_0x0037
            L_0x002c:
                java.lang.String r0 = "sdkInitNetworkRequest"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L_0x0036
            L_0x0034:
                r5 = -1
                goto L_0x0037
            L_0x0036:
                r5 = 0
            L_0x0037:
                if (r5 == 0) goto L_0x005a
                if (r5 == r3) goto L_0x004c
                if (r5 == r2) goto L_0x003e
                goto L_0x0067
            L_0x003e:
                com.fyber.inneractive.sdk.metrics.c r5 = com.fyber.inneractive.sdk.metrics.C4473c.f11045c
                com.fyber.inneractive.sdk.network.n r0 = com.fyber.inneractive.sdk.network.C4560n.this
                java.lang.String r0 = r0.f11295d
                com.fyber.inneractive.sdk.metrics.f r5 = r5.mo24671a(r0)
                r5.mo24675d()
                goto L_0x0067
            L_0x004c:
                com.fyber.inneractive.sdk.metrics.c r5 = com.fyber.inneractive.sdk.metrics.C4473c.f11045c
                com.fyber.inneractive.sdk.network.n r0 = com.fyber.inneractive.sdk.network.C4560n.this
                java.lang.String r0 = r0.f11295d
                com.fyber.inneractive.sdk.metrics.f r5 = r5.mo24671a(r0)
                r5.mo24678g()
                goto L_0x0067
            L_0x005a:
                com.fyber.inneractive.sdk.metrics.c r5 = com.fyber.inneractive.sdk.metrics.C4473c.f11045c
                com.fyber.inneractive.sdk.network.n r0 = com.fyber.inneractive.sdk.network.C4560n.this
                java.lang.String r0 = r0.f11295d
                com.fyber.inneractive.sdk.metrics.f r5 = r5.mo24671a(r0)
                r5.mo24677f()
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4560n.C4562b.mo24229a(java.lang.String):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.n$c */
    public interface C4563c {
    }

    public C4560n(InneractiveAdRequest inneractiveAdRequest, String str, C4309s sVar, C4563c cVar) {
        this.f11292a = inneractiveAdRequest;
        this.f11295d = str;
        this.f11294c = cVar;
        this.f11293b = sVar;
        this.f11297f = new C4536c0(new C4561a(), inneractiveAdRequest, sVar);
        mo24762a();
    }

    /* renamed from: a */
    public void mo24762a() {
        this.f11297f.f11226d = new C4562b();
    }

    /* renamed from: a */
    public void mo24763a(InneractiveErrorCode inneractiveErrorCode, C5291e eVar) {
        C4563c cVar;
        if (!this.f11296e && (cVar = this.f11294c) != null) {
            ((C4408e) cVar).mo24579a(this.f11292a, eVar, inneractiveErrorCode);
        }
    }

    /* renamed from: a */
    public void mo24764a(C5291e eVar) {
        InneractiveErrorCode inneractiveErrorCode;
        if (this.f11294c != null) {
            if (this.f11296e) {
                IAlog.m16702d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                return;
            }
            C4345y b = C4261a.m13439b(eVar.f14078m);
            InneractiveAdRequest inneractiveAdRequest = this.f11292a;
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest.setSelectedUnitConfig(b);
            }
            C4281e eVar2 = new C4281e();
            ImpressionData impressionData = eVar.f14083r;
            C4452a aVar = null;
            eVar2.f10619a = impressionData != null ? impressionData.getDemandId() : null;
            try {
                eVar2.f10620b = Long.valueOf(IAConfigManager.f10525J.f10539d);
            } catch (NumberFormatException unused) {
                IAlog.m16699a("invalid publisherId", new Object[0]);
            }
            C4309s sVar = this.f11293b;
            if (sVar != null) {
                sVar.mo24340a(eVar2);
            }
            if (b == null) {
                inneractiveErrorCode = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
            } else {
                inneractiveErrorCode = eVar.mo24397a(this.f11292a, this.f11293b);
            }
            if (inneractiveErrorCode == null) {
                C4563c cVar = this.f11294c;
                InneractiveAdRequest inneractiveAdRequest2 = this.f11292a;
                C4408e eVar3 = (C4408e) cVar;
                C4309s sVar2 = eVar3.f10882f;
                IAlog.m16702d("%sonAdDataAvailable: got response data: %s", eVar3.mo24574d(), eVar);
                C5287a a = C5287a.m16615a(eVar.f14072g);
                C4397b.C4399b bVar = C4397b.C4398a.f10858a.f10857a.get(a);
                if (bVar != null) {
                    aVar = bVar.mo24387a();
                }
                eVar3.f10879c = aVar;
                if (aVar == null) {
                    IAlog.m16703e("%sonAdDataAvailable: Cannot find content handler for ad type: %s", eVar3.mo24574d(), a);
                    C4408e.C4410b bVar2 = eVar3.f10880d;
                    if (bVar2 != null) {
                        ((C4427n) bVar2).mo24618a(inneractiveAdRequest2, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
                IAlog.m16702d("%sonAdDataAvailable: found response loader: %s", eVar3.mo24574d(), eVar3.f10879c);
                ((C4406c) eVar3.f10879c).mo24567a(inneractiveAdRequest2, eVar, sVar2, eVar3);
                return;
            }
            if (b == null || inneractiveErrorCode == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                IAlog.m16700b("%sGot configuration mismatch!", IAlog.m16696a((Object) this));
                IAConfigManager.m13428a();
            }
            C5287a a2 = C5287a.m16615a(eVar.f14072g);
            if (a2 != null) {
                C5357n.m16773a(new C4403a(new C4405b(eVar, this.f11292a, a2 == C5287a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.f11293b.mo24342c()), new InneractiveInfrastructureError(inneractiveErrorCode, eVar.f14089x)));
            }
            mo24763a(inneractiveErrorCode, eVar);
        }
    }
}
